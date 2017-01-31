package com.RMS.model;

import java.time.LocalTime;

import lombok.Data;

@Data
public class FoodType {
private int foodTypeId;
private String type;
private LocalTime fromTime;
private LocalTime toTime;
private int quantity;
}
