package cn.com.yunyoutianxia.simple.domain.common;

import org.hibernate.Session;

public class HibernateSessionHolder {

	private static final ThreadLocal<Session> sessionThreadLocal = new ThreadLocal<Session>();
	
	public static void setSession(Session session){
		sessionThreadLocal.set(session);
	}
	
	public static Session getCurrentSession(){
		return sessionThreadLocal.get();
	}
	
	public static void remove(){
		sessionThreadLocal.remove();
	}
}
