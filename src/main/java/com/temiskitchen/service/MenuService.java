package com.temiskitchen.service;

import com.temiskitchen.model.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class MenuService {
    public List<MenuItem> getMenu() {
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Jollof Rice", 10.0));
        menu.add(new MenuItem("Fried Rice", 9.0));
        menu.add(new MenuItem("Chicken Wings", 7.5));
        menu.add(new MenuItem("Plantain", 5.0));
        return menu;
    }
}

