package com.RMS.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.RMS.Util.ConnectionUtil;
import com.RMS.model.MenuOrder;
import com.RMS.model.Menu;
import com.RMS.model.FoodType;
public class MenuOrderDao {
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

public List<MenuOrder> list(){
		
		String sql="select id,menu_list,food_type,quantity FROM tab_menu_order";
		return jdbcTemplate.query(sql,(rs,rowNum)->
		{
			MenuOrder menuOrder=new MenuOrder();
			menuOrder.setMenuOrderId(rs.getInt("id"));
			
		
			Menu menus=new Menu();
			menus.setMenuId(rs.getInt("id"));
			menuOrder.setMenuItems(menus);
			
			FoodType foodTypes=new FoodType();
			foodTypes.setFoodTypeId(rs.getInt("id"));
			menuOrder.setFoodType(foodTypes);
			
			menuOrder.setQuantity(rs.getInt("quantity"));
			
		
			return menuOrder;

		});
	}
	
	public MenuOrder listByQuantity(int id){
		String sql="select id,menu_list,food_type,quantity FROM menuorder WHERE id=?";
		Object[] params={ id };

		
		return jdbcTemplate.queryForObject(sql,params,(rs,rowNum)->
		{
			MenuOrder menuOrder=new MenuOrder();
			menuOrder.setMenuOrderId(rs.getInt("id"));
			
			Menu menus=new Menu();
			menus.setMenuId(rs.getInt("id"));
			menuOrder.setMenuItems(menus);
			
			FoodType foodTypes=new FoodType();
			foodTypes.setFoodTypeId(rs.getInt("id"));
			menuOrder.setFoodType(foodTypes);
			
			menuOrder.setQuantity(rs.getInt("quantity"));
			
			return menuOrder;
			
		});
	}
}