package com.RMS.model;

import lombok.Data;

@Data
public class SeatStatus {
private int id;
private Seat seatId;
private String status;
private Boolean userState;
}
