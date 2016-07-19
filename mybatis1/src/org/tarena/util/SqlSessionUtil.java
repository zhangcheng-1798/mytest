package org.tarena.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {

	//��ȡsession����
	public static SqlSession getSession(){
		//1����ȡsqlsessionfactory
		SqlSessionFactoryBuilder factoryBuilder=
				new SqlSessionFactoryBuilder();
		//дһ�������ڶ�ȡ�����ļ�SqlConfigMap.xml
		InputStream config = 
				SqlSessionUtil.class.getClassLoader()
				.getResourceAsStream("SqlConfigMap.xml");
		SqlSessionFactory sf = factoryBuilder.build(config);
		//��ȡsession����
		SqlSession session = sf.openSession();
		return session;
	}
	
	public static void main(String[] args) {
		//��ȡ��һ��session����˵���ҵ����ã��ļ��е�value����ȷ��
		System.out.println(getSession());
	}
	
}







