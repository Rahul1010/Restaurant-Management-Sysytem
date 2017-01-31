package com.RMS.Test;

import java.util.List;

import com.RMS.Dao.SeatDao;
import com.RMS.model.Seat;

public class TestSeatDao {
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		SeatDao seatDao = new SeatDao();
		List<Seat> list = seatDao.list();
		for (Seat s : list) {
			System.out.println(s);
		}
	}
}
