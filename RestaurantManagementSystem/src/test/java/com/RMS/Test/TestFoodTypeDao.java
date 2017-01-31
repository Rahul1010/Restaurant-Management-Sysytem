package com.RMS.Test;

import java.util.List;

import com.RMS.Dao.FoodTypeDao;
import com.RMS.model.FoodType;

public class TestFoodTypeDao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodTypeDao foodTypeDao = new FoodTypeDao();
		 List<FoodType> list = foodTypeDao.list();
		for (FoodType s : list) {
			System.out.println(s);
		}
	}

}
