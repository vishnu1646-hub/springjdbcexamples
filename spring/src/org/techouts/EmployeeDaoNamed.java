package org.techouts;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDaoNamed {
	NamedParameterJdbcTemplate template;

	public EmployeeDaoNamed(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	public void save(EmployeeNamed e) {
		String query = "insert into employee values (:id,:name,:salary)";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", e.getId());
		map.put("name", e.getEmployeename());
		map.put("salary", e.getSalary());

		template.execute(query, map, new PreparedStatementCallback() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
	}
}
