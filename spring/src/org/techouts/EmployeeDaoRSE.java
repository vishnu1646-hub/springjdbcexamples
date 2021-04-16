package org.techouts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDaoRSE {
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<EmployeeRSE> getAllEmployees() {
		return template.query("select * from employee", new ResultSetExtractor<List<EmployeeRSE>>() {
			@Override
			public List<EmployeeRSE> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<EmployeeRSE> list = new ArrayList<EmployeeRSE>();
				while (rs.next()) {
					EmployeeRSE e = new EmployeeRSE();
					e.setId(rs.getInt(1));
					e.setEmployeename(rs.getString(2));
					e.setSalary(rs.getInt(3));
					list.add(e);
				}
				return list;
			}
		});
	}
}
