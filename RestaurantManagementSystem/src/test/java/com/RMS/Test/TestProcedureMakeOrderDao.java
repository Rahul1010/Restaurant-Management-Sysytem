package com.RMS.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.RMS.Dao.ProcedureMakeOrderDao;

public class TestProcedureMakeOrderDao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcedureMakeOrderDao dao = new ProcedureMakeOrderDao();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ENGLISH);
		LocalTime time = LocalTime.now();
		String timeForm = formatter.format(time);
		String status = dao.placeOrder("seat8", "Tea,Coffee,Tea", "2,3,2", LocalTime.parse(timeForm),
				"@comments");
		System.out.println(status);

	}

}
