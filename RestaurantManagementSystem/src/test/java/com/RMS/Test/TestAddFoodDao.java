package com.RMS.Test;

import com.RMS.Dao.ProcedureAddFoodDao;

public class TestAddFoodDao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcedureAddFoodDao addFoodDao = new ProcedureAddFoodDao();
		
		
			
		
		String status = addFoodDao.addFood(18, "Pulav","Dinner","@add_message");
		System.out.println(status);
	}

}
