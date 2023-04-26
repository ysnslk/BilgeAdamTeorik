package com.yasinsolak;

import com.yasinsolak.entity.HMusteri;
import com.yasinsolak.utilty.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MusteriTakip {

    public static void main(String[] args) {
        /**
         * 1- Hibernate bir veritabanına çalışmak için oturum açar. 2- Yapılacak
         * olan işlemleri takip etmek gerektiğinde hatalı işlemleri feriye almak
         * üzere bir transaction oluşturur.
         */
        Session ss = HibernateUtility.getFACTORY().openSession();
        Transaction tt = ss.beginTransaction();
        HMusteri hm = new HMusteri("Ahmet", "Adana", "5554443322", "http", 1);
        ss.save(hm);
        tt.commit();
        ss.close();
        System.out.println("İşlem Tamam");

    }
}
