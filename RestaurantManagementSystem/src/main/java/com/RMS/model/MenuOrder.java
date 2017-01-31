package com.RMS.model;

import lombok.Data;

@Data
public class MenuOrder {
private int menuOrderId;
private Menu menuItems;
private FoodType foodType;
private int quantity;
}
 