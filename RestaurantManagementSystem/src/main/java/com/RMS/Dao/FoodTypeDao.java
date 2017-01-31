package com.RMS.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.RMS.Util.ConnectionUtil;
import com.RMS.model.FoodType;

public class FoodTypeDao {
private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	

	
	public List<FoodType> list() {
		String sql = "SELECT id,type,from_time,to_time,quantity FROM tab_food_type";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			FoodType foodType = convert(rs);
			return foodType;
		});

	}
	
	public FoodType convert(ResultSet rs) throws SQLException {
		FoodType foodType = new FoodType();
		foodType.setFoodTypeId(rs.getInt("id"));
		foodType.setType(rs.getString("Type"));
		foodType.setFromTime(rs.getTime("From_time").toLocalTime());
		foodType.setToTime(rs.getTime("To_time").toLocalTime());
		foodType.setQuantity(rs.getInt("quantity"));
		
		return foodType;
	}

}
