package com.RMS.Test;

import java.util.Iterator;
import java.util.List;

import com.RMS.Dao.MenuOrderDao;
import com.RMS.model.MenuOrder;

public class TestMenuOrderDao {
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		MenuOrderDao menuOrderDao=new MenuOrderDao();
		//MenuOrder menuOrder=new MenuOrder();

		

		
		//TO AVOID DISPLAYING NULL VALUES ITERATOR IS USED
		List<MenuOrder> list=menuOrderDao.list();
		Iterator<MenuOrder> i=list.iterator();
		while(i.hasNext())
		{
			MenuOrder menuorder=(MenuOrder)i.next();
			System.out.println(menuorder.getMenuOrderId()+"\t"+menuorder.getMenuItems().getMenuId()+"\t"+menuorder.getFoodType().getFoodTypeId()+"\t"+menuorder.getQuantity());
		}
		
//		
//		menuOrder=menuOrderDao.listByQuantity(1);
//		System.out.println(menuOrder.getMenuOrderId()+"\t"+menuOrder.getMenuListId().getMenuId()+"\t"+menuorder.getFoodTypeId().getFoodTypeId()+"\t"+menuOrder.getStockQuantity());
//		
	}
}