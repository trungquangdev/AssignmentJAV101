package com.example.AssignmentJAV101.repository;

import com.example.AssignmentJAV101.model.SanPham;

import com.example.AssignmentJAV101.util.Hibernate;
import org.hibernate.Session;

import java.util.List;

public class SanPhamRepository {
    public List<SanPham> getAll(){
        try(Session s= Hibernate.getFactory().openSession()){
            return s.createQuery("from SanPham ", SanPham.class).list();
        }
    }

}
