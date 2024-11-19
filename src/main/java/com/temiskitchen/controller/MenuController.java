package com.temiskitchen.controller;

import com.temiskitchen.service.MenuService;
import com.temiskitchen.model.MenuItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/menu")
public class MenuController extends HttpServlet {
    private final MenuService menuService = new MenuService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MenuItem> menu = menuService.getMenu();
        req.setAttribute("menu", menu);
        req.getRequestDispatcher("/WEB-INF/jsp/menu.jsp").forward(req, resp);
    }
}

