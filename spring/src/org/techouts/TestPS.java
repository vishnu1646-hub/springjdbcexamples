package org.techouts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPS {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDaoPS dao = (EmployeeDaoPS) ctx.getBean("edaops");
		dao.saveEmployeeByPreparedStatement(new EmployeePS(108, "Amit", 35000));
	}
}
