package com.RMS.Dao;

import java.sql.Types;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.RMS.Util.ConnectionUtil;

public class ProcedureAddFoodDao {
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public String addFood(int Id,String menuItem,String foodType,String message) {
        SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName("proc_add_food")
                .declareParameters(new SqlParameter("id", Types.SMALLINT),
                		new SqlParameter("item", Types.VARCHAR),
                		new SqlParameter("food_type", Types.VARCHAR),
                        new SqlOutParameter("add_food_message", Types.VARCHAR)
                        );
        call.setAccessCallParameterMetaData(false);
        SqlParameterSource in = new MapSqlParameterSource().addValue("id",Id).addValue("Item", menuItem)
        													.addValue("food_type", foodType);
        Map<String, Object> execute = call.execute(in);
        String status = (String) execute.get("add_food_message");
        return status;
 
    }

}
