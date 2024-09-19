package com.example.controller;

import com.example.entity.MenuItem;
import com.example.exception.MenuException;
import com.example.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @PostMapping("/dish")
    public MenuItem addDish(@RequestBody MenuItem menu) throws MenuException {
        return menuItemService.addMenu(menu);
    }

    @GetMapping("/dish/{dishId}")
    public MenuItem getDishById(@PathVariable int dishId) throws MenuException {
        return menuItemService.getMenuById(dishId);
    }

    @GetMapping("/search/{dishType}")
    public List<MenuItem> getDishesByType(@PathVariable String dishType) {
        return menuItemService.getMenus(dishType);
    }

    @DeleteMapping("/dish/{dishId}")
    public String deleteDishById(@PathVariable int dishId) throws MenuException {
        menuItemService.deleteMenuById(dishId);
        return "Dish deleted successfully!";
    }
}