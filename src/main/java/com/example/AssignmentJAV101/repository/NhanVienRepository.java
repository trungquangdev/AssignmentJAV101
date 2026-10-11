package com.example.AssignmentJAV101.repository;

import com.example.AssignmentJAV101.model.NhanVien;
import com.example.AssignmentJAV101.util.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class NhanVienRepository {
    public List<NhanVien> getAll(){
        try(Session session = Hibernate.getFactory().openSession()){
            return session.createQuery("from NhanVien ", NhanVien.class).list();
        }
    }

//    public static void main(String[] args) {
//        NhanVienRepository rp=new NhanVienRepository();
//        List<NhanVien>list=rp.getAll();
//        for(NhanVien nv: list){
//            System.out.println(nv.getMa()+" "+nv.getTen());
//        }
//    }

    public NhanVien getOne(Integer id){
        try(Session session = Hibernate.getFactory().openSession()){
           return session.find(NhanVien.class,id);
        }
    }

    public void add(NhanVien nhanVien){
        try(Session session=Hibernate.getFactory().openSession()){
            Transaction tran = session.beginTransaction();
            session.persist(nhanVien);
            tran.commit();
        }
    }

    public void update(NhanVien nhanVien){
        try(Session session=Hibernate.getFactory().openSession()){
            Transaction tran = session.beginTransaction();
            session.merge(nhanVien);
            tran.commit();
        }
    }

    public void delete(Integer id){
        try(Session session=Hibernate.getFactory().openSession()){
            Transaction tran = session.beginTransaction();
            NhanVien nhanVien=session.find(NhanVien.class,id);
            if(nhanVien !=null){
                session.delete(nhanVien);
            }
            tran.commit();
        }
    }
}
