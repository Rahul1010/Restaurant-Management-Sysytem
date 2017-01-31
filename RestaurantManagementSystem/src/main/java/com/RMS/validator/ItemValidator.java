package com.RMS.validator;

import com.RMS.exception.ItemNotFoundException;
import com.RMS.model.Menu;

public class ItemValidator {
	
public void listByItem(Menu menu) {

		if ("".equals(menu.getMenuItems())|| " ".equals(menu.getMenuItems())) {
			try {
				
				throw new ItemNotFoundException("Item not in menu list");
			} 
			catch (ItemNotFoundException e) {
				System.out.println("Item not in menu list");
			}

		}
	}
}
