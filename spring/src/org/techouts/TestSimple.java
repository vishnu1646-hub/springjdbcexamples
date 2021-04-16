package org.techouts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSimple {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		EmployeeDaoSimple dao = (EmployeeDaoSimple) factory.getBean("edaosimple");
		int status = dao.update(new EmployeeSimple(23, "Tarun", 35000));
		System.out.println(status);
	}
}
