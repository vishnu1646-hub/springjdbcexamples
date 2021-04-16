package org.techouts;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class EmployeeDaoSimple {
	SimpleJdbcTemplate template;

	public EmployeeDaoSimple(SimpleJdbcTemplate template) {
		this.template = template;
	}

	public int update(EmployeeSimple e) {
		String query = "update employee set name=? where id=?";
		return template.update(query, e.getEmployeename(), e.getId());

		// String query="update employee set name=?,salary=? where id=?";
		// return template.update(query,e.getName(),e.getSalary(),e.getId());
	}
}
