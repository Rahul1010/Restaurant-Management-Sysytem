package com.RMS.Dao;

import com.RMS.Util.*;
import com.RMS.model.Menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class MenuDao {
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public void save(Menu menu) {

		String sql = "insert into menu(id,food_list) values(?,?)";
		Object[] params = { menu.getMenuId(), menu.getMenuItems() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}
	
	public List<Menu> list() {
		final String sql = "select * from menu order by id asc";

		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			final Menu menu = convert(rs);
			return menu;
		});

	}

	static Menu convert(final ResultSet rs) throws SQLException {
		final Menu menu = new Menu();
		menu.setMenuId(rs.getInt("id"));
		menu.setMenuItems(rs.getString("food_list"));
		;
		return menu;
	}

}
