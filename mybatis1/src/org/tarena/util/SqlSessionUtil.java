package org.tarena.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {

	//获取session对象
	public static SqlSession getSession(){
		//1、获取sqlsessionfactory
		SqlSessionFactoryBuilder factoryBuilder=
				new SqlSessionFactoryBuilder();
		//写一个流用于读取配置文件SqlConfigMap.xml
		InputStream config = 
				SqlSessionUtil.class.getClassLoader()
				.getResourceAsStream("SqlConfigMap.xml");
		SqlSessionFactory sf = factoryBuilder.build(config);
		//获取session对象
		SqlSession session = sf.openSession();
		return session;
	}
	
	public static void main(String[] args) {
		//获取到一个session对象，说明我的配置；文件中的value是正确的
		System.out.println(getSession());
	}
	
}







