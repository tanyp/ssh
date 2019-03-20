/***********************************************************************
 * 深圳市云游天下科技有限公司 版权所有
 ***********************************************************************/
package cn.com.yunyoutianxia.simple.domain.common;

import org.hibernate.Session;

/**
 * @author 黄盛荣
 * @since 1.7
 * 	 新建 2014年10月6日
 */
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
