package com.RMS.model;

import lombok.Data;

@Data
public class FoodStock {
	private int id;
	private int menuItem;
	private int foodType;
	private int quantity;
}
