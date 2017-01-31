package com.RMS.Test;

import java.util.List;

import com.RMS.Dao.SeatStatusDao;
import com.RMS.model.SeatStatus;

public class TestSeatStatusDao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeatStatusDao seatStatusDao = new SeatStatusDao();
		 List<SeatStatus> list = seatStatusDao.list();
		for (SeatStatus s : list) {
			System.out.println(s);
		}
	}
}
