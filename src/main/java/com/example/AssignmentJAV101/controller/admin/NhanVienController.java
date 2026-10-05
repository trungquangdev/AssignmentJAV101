package com.example.AssignmentJAV101.controller.admin;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

import com.example.AssignmentJAV101.model.NhanVien;
import com.example.AssignmentJAV101.service.NhanVienService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import lombok.SneakyThrows;
import org.apache.commons.beanutils.BeanUtils;

@WebServlet(urlPatterns = {
        "/admin/nhan-vien",
        "/admin/nhan-vien/add",
        "/admin/nhan-vien/update",
        "/admin/nhan-vien/delete"
}

)
public class NhanVienController extends HttpServlet {
    private final NhanVienService nhanVienService= new NhanVienService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        String uri = request.getRequestURI();
        if(uri.contains("/admin/nhan-vien")){
            this.showNhanVien(request,response);
        }else if(uri.contains("/admin/nhan-vien/delete")){
            this.deleteNhanVien(request,response);
        }
    }

    private void deleteNhanVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Integer id =Integer.valueOf(request.getParameter("id"));
        nhanVienService.delete(id);
        response.sendRedirect("/admin/nhan-vien");
    }

    private void showNhanVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",nhanVienService.getAll());
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("/admin/nhan-vien/add")){
            this.addNhanVien(req,resp);
        }else (uri.contains("/admin/nhan-vien/update")){
            this.updateNhanVien(req,resp);
        }
    }

    private void updateNhanVien(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, InvocationTargetException, IllegalAccessException {
        NhanVien nv = new NhanVien();
        BeanUtils.populate(nv,req.getParameterMap());
        nhanVienService.update(nv);
        resp.sendRedirect("/admin/nhan-vien");
    }

    private void addNhanVien(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, InvocationTargetException, IllegalAccessException {
        NhanVien nv = new NhanVien();
        BeanUtils.populate(nv,req.getParameterMap());
        nhanVienService.add(nv);
        resp.sendRedirect("/admin/nhan-vien");
    }
}