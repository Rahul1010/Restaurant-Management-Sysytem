package com.RMS.Test;

import java.util.List;

import com.RMS.Dao.MenuDao;
import com.RMS.model.Menu;

public class TestMenuDao {

	public static void main(final String[] args) {

		final MenuDao menudao = new MenuDao();
		final MenuDao menudaoobj = new MenuDao();

		Menu menu = new Menu();
		menu.setMenuId(17);
		menu.setMenuItems("Poratta");
		menudaoobj.save(menu);
		final List<Menu> list = menudao.list();
		for (final Menu m : list) {
			System.out.println(m);

		}

	}

}
