package shiroDemo;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;


public class LoginLogoutTest {
	
//	@Test
//	public void testHelloWorld(){
//		//1、获取SecurityManager工厂，此处使用ini配置文件初始化
//		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
//		//2、得到SecurityManager实例并绑定SecurityUtil
//		SecurityManager securityManager = factory.getInstance();
//		SecurityUtils.setSecurityManager(securityManager);
//		//3、得到Subject，并创建用户名/密码的验证Token(即用户名/密码)
//		Subject subject = SecurityUtils.getSubject();
//		UsernamePasswordToken Token = new UsernamePasswordToken("wang", "123");
//		
//		//4、登录，即身份认证
//		subject.login(Token);
//		System.out.println("验证成功");
//		subject.logout();
//	}
	
	@Test
	public void testCustomRealm(){
		//1、获取SecurityManager工厂，此处使用ini配置文件初始化SecurityManager
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
		//2、得到SecurityManager实例并绑定SecurityUtil
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		//3、得到Subject,并创建用户名/密码的验证Token(即用户名/密码)
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("wang","123");
		
		//4、登录，即身份验证
		subject.login(token);
		System.out.println("验证成功");
		subject.logout();
	}
	
	@Test
	public void testJdbcRealm(){
		//1、获取SecurityManager工厂，此处使用ini配置文件初始化SecurityManager
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-jdbc-realm.ini");
		//2、得到SecurityManager实例并绑定SecurityUtil
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		//3、得到Subject,并创建用户名/密码的验证Token(即用户名/密码)
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("wang","123");
		
		//4、登录，即身份验证
		subject.login(token);
		System.out.println("验证成功");
		subject.logout();
	}
}
