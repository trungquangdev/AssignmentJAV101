package com.example.AssignmentJAV101.repository;

import com.example.AssignmentJAV101.model.KhachHang;

import com.example.AssignmentJAV101.util.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class KhachHangRepository {
    public List<KhachHang> getAll() {
        try (Session session = Hibernate.getFactory().openSession()) {
            return session.createQuery("from KhachHang ", KhachHang.class).list();
        }
    }

//    public static void main(String[] args) {
//        KhachHangRepository rp = new KhachHangRepository();
//        List<KhachHang> list=rp.getAll();
//        for(KhachHang kh: list){
//            System.out.println(kh.getTen() + "/" + kh.getDiaChi());
//        }
//    }

    public KhachHang getOne(Integer id){
        try(Session session=Hibernate.getFactory().openSession()){
            return session.find(KhachHang.class,id);
        }
    }
    public void add(KhachHang khachHang){
        try(Session session=Hibernate.getFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(khachHang);
            transaction.commit();
        }
    }
    public void update(KhachHang khachHang){
        try(Session session=Hibernate.getFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.merge(khachHang);
            transaction.commit();
        }
    }
    public void delete(Integer id){
        try(Session session=Hibernate.getFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            KhachHang khachHang = session.find(KhachHang.class,id);
            if(id!=null){
                session.delete(khachHang);
            }
            transaction.commit();
        }
    }
}
