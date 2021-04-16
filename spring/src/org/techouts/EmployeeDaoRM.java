package org.techouts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoRM {
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<EmployeeRM> getAllEmployeesRowMapper() {
		return template.query("select * from employee", new RowMapper<EmployeeRM>() {
			@Override
			public EmployeeRM mapRow(ResultSet rs, int rownumber) throws SQLException {
				EmployeeRM e = new EmployeeRM();
				e.setId(rs.getInt(1));
				e.setEmployeename(rs.getString(2));
				e.setSalary(rs.getInt(3));
				return e;
			}
		});
	}
}
