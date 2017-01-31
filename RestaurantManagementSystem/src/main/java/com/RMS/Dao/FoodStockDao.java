package com.RMS.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.RMS.Util.ConnectionUtil;
import com.RMS.model.FoodStock;

public class FoodStockDao {
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public List<FoodStock> list() {
		final String sql = "select * from food_stock order by id asc";

		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			final FoodStock foodstock = convert(rs);
			return foodstock;
		});

	}

	static FoodStock convert(final ResultSet rs) throws SQLException {
		final FoodStock foodstock = new FoodStock();
		foodstock.setId(rs.getInt("id"));
		foodstock.setMenuItem(rs.getInt("menu_list"));
		foodstock.setFoodType(rs.getInt("food_type"));
		foodstock.setQuantity(rs.getInt("quantity"));

		return foodstock;
	}
}
