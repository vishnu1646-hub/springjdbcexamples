package org.techouts;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRSE {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDaoRSE dao = (EmployeeDaoRSE) ctx.getBean("edaorse");
		List<EmployeeRSE> list = dao.getAllEmployees();

		for (EmployeeRSE e : list)
			System.out.println(e);

	}
}
