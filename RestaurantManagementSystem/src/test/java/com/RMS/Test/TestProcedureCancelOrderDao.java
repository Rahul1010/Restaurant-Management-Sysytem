package com.RMS.Test;

import com.RMS.Dao.ProcedureCancelOrderDao;

public class TestProcedureCancelOrderDao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProcedureCancelOrderDao cancelFoodDao = new ProcedureCancelOrderDao();
		String status = cancelFoodDao.cancelOrder(22,"seat8","North Indian Thali","@cancel_message");
		System.out.println(status);
	}
}
