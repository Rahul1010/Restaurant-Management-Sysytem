package com.RMS.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.RMS.Util.ConnectionUtil;
import com.RMS.model.Seat;

public class SeatDao {
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public List<Seat> list() {
		final String sql = "select * from seat order by id asc";

		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			final Seat seat = convert(rs);
			return seat;
		});

	}

	static Seat convert(final ResultSet rs) throws SQLException {
		final Seat seat = new Seat();
		seat.setId(rs.getInt("id"));
		seat.setSeatNo(rs.getString("Seats"));

		return seat;
	}
}
