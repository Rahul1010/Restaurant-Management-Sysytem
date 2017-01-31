package com.RMS.Test;

import java.util.List;

import com.RMS.Dao.FoodStockDao;
import com.RMS.model.FoodStock;

public class TestFoodStockDao {
	public static void main(final String[] args) {

		final FoodStockDao foodstockdao = new FoodStockDao();

		final List<FoodStock> list = foodstockdao.list();
		for (final FoodStock fo : list) {
			System.out.println(fo);

		}

	}
}
