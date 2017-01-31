package com.RMS.Test;

import java.util.List;

import com.RMS.model.ViewOrder;
import com.RMS.Dao.ViewOrderDao;
public class TestViewOrderDao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewOrderDao viewOrderDetailsDao = new ViewOrderDao();
		
		List<ViewOrder> list=viewOrderDetailsDao.list();
		java.util.Iterator<ViewOrder> i=list.iterator();
		while(i.hasNext())
		{
			ViewOrder viewOrderDetails=(ViewOrder)i.next();
			System.out.println(viewOrderDetails.getOrderedId()+"\t"+viewOrderDetails.getSeatno()+"\t"+viewOrderDetails.getOrderedItem()+"\t"+viewOrderDetails.getQuantity()+"\t"+viewOrderDetails.getOrderedTime()+"\t"+viewOrderDetails.getOrderedDate()+"\t"+viewOrderDetails.getState());
		}

	}
}
