package org.techouts;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRM {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDaoRM dao = (EmployeeDaoRM) ctx.getBean("edaorm");
		List<EmployeeRM> list = dao.getAllEmployeesRowMapper();

		for (EmployeeRM e : list)
			System.out.println(e);
	}
}
