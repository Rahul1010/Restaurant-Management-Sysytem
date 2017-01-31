package com.RMS.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.RMS.Util.ConnectionUtil;
import com.RMS.model.ViewOrder;

public class ViewOrderDao {
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public List<ViewOrder> list(){
			
			String sql="SELECT * FROM view_order";
			return jdbcTemplate.query(sql,(rs,rowNum)->
			{
				ViewOrder viewOrderDetails=new ViewOrder();
				viewOrderDetails.setOrderedId(rs.getInt("ordered_id"));
				viewOrderDetails.setSeatno(rs.getString("seat_no"));
				viewOrderDetails.setOrderedItem(rs.getString("ordered_item"));
				viewOrderDetails.setQuantity(rs.getInt("quantity"));
				viewOrderDetails.setOrderedTime(rs.getTime("ordered_time").toLocalTime());
				viewOrderDetails.setOrderedDate(rs.getDate("ordered_date").toLocalDate());
				viewOrderDetails.setState(rs.getString("state"));			
				return viewOrderDetails;

			});
		}
}
