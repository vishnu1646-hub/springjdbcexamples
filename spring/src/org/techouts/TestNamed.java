package org.techouts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestNamed {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		EmployeeDaoNamed dao = (EmployeeDaoNamed) factory.getBean("edaonamed");
		dao.save(new EmployeeNamed(23, "sonoo", 50000));

	}
}
