package com.example.AssignmentJAV101.controller.admin;

import com.example.AssignmentJAV101.model.SanPham;
import com.example.AssignmentJAV101.repository.SanPhamRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {
        "/admin/san-pham"
})
public class SanPhamController extends HttpServlet {
    private SanPhamRepository spr = new SanPhamRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("/admin/san-pham")) {
            this.showSanPham(req, resp);
        }
    }

    private void showSanPham(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<SanPham> list = spr.getAll();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/sanpham.jsp").forward(req,resp);
    }
}
