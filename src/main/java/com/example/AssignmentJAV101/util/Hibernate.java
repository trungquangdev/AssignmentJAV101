package com.example.AssignmentJAV101.util;

import com.example.AssignmentJAV101.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class Hibernate {
    private static final SessionFactory FACTORY;

    static {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(NhanVien.class);
        configuration.addAnnotatedClass(KhachHang.class);
        configuration.addAnnotatedClass(SanPham.class);
        configuration.addAnnotatedClass(ChiTietSanPham.class);
        configuration.addAnnotatedClass(MauSac.class);
        configuration.addAnnotatedClass(KichCo.class);
        configuration.addAnnotatedClass(DotGiamGia.class);
        configuration.addAnnotatedClass(PhieuGiamGia.class);
        // Hai entity bổ sung để phục vụ quản lý hóa đơn.
        configuration.addAnnotatedClass(HoaDon.class);
        configuration.addAnnotatedClass(HoaDonChiTiet.class);
        Properties properties = new Properties();
        properties.put(
                Environment.DIALECT,
                "org.hibernate.dialect.SQLServer2016Dialect"
        );
        properties.put(
                Environment.DRIVER,
                "com.microsoft.sqlserver.jdbc.SQLServerDriver"
        );
        properties.put(
                Environment.URL,
                "jdbc:sqlserver://localhost:1433;"
                        + "databaseName=QuanLyBanHang;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
        );
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123");
        properties.put(Environment.SHOW_SQL, "true");
        properties.put(Environment.FORMAT_SQL, "true");

        // Chỉ kết nối tới schema hiện có, không tự sửa cấu trúc bảng.
        properties.put(Environment.HBM2DDL_AUTO, "validate");

        configuration.setProperties(properties);

        ServiceRegistry serviceRegistry =
                new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .build();
        FACTORY = configuration.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getFactory() {
        return FACTORY;
    }

    public static void main(String[] args) {
        System.out.println(getFactory());
    }
}
