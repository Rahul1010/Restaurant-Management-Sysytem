package com.RMS.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.RMS.Util.ConnectionUtil;
import com.RMS.model.Seat;
import com.RMS.model.SeatStatus;

public class SeatStatusDao {
private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	
	
	public List<SeatStatus> list() {
		String sql = "SELECT seat_status.id,Seats,state,user_state FROM seat_status join seat group by Seats";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			SeatStatus seatStatus = convert(rs);
			return seatStatus;
		});

	}
	
	public SeatStatus convert(final ResultSet rs) throws SQLException {
		SeatStatus seatStatus = new SeatStatus();
		Seat seat=new Seat();
		seatStatus.setId(rs.getInt("Id"));
		seat.setSeatNo(rs.getString("Seats"));
		seatStatus.setSeatId(seat);
		seatStatus.setStatus(rs.getString("state"));
		seatStatus.setUserState(rs.getBoolean("user_state"));
		return seatStatus;
	}
	
}
