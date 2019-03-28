package cn.com.yunyoutianxia.simple.hibernate.domain;

import cn.com.yunyoutianxia.simple.hibernate.HibernateSessionHolder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public abstract class AbstractHibernateDomain {

    @Autowired
    protected SessionFactory sessionFactory;

    protected void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        if (TransactionSynchronizationManager.isActualTransactionActive()) {
            return sessionFactory.getCurrentSession();
        } else {
            Session session = HibernateSessionHolder.getCurrentSession();
            if (session == null) {
                session = sessionFactory.openSession();
                HibernateSessionHolder.setSession(session);
            } else {
                if (!session.isOpen()) {
                    HibernateSessionHolder.remove();
                    session = sessionFactory.openSession();
                    HibernateSessionHolder.setSession(session);
                }
            }
            return session;
        }
    }

    public void flush() {
        if (TransactionSynchronizationManager.isActualTransactionActive()) {
            sessionFactory.getCurrentSession().flush();
        } else {
            Session session = HibernateSessionHolder.getCurrentSession();
            if (session != null && session.isOpen()) {
                session.flush();
            }
        }
    }

}
