package com.example.service;

import com.example.entity.MenuItem;
import com.example.exception.MenuException;
import com.example.repo.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public MenuItem addMenu(MenuItem menu) throws MenuException {
        if (menu.getDishType() == null || menu.getDishName() == null) {
            throw new MenuException("Category or Name must be given");
        }
        return menuItemRepository.save(menu);
    }

    public List<MenuItem> getMenus(String dishType) {
        return menuItemRepository.findByDishType(dishType);
    }

    public MenuItem getMenuById(int id) throws MenuException {
        return menuItemRepository.findById(id)
                .orElseThrow(() -> new MenuException("Dish not found"));
    }

    public void deleteMenuById(int id) throws MenuException {
        MenuItem menu = menuItemRepository.findById(id)
                .orElseThrow(() -> new MenuException("Dish not found"));
        menuItemRepository.delete(menu);
    }
}