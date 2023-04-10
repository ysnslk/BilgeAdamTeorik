package com.yasinsolak;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Runner {

	public static void main(String[] args) throws Exception {
		/*
		 * 1- Driveri kullanacağımızı belirtelim
		 * 2- Baglantı için gerekli alanları yazalım
		 * 3- Gerekli tanımları alarak Driverın yönetilmesi ve bir baglantı kurabilmek
		 * için gerekli komutların yazılması gerekir.
		 */

		Driver.class.forName("org.postgresql.Driver");
		String adres = "jdbc:postgresql://localhost:5432/DBjava8Satis";
		String kullaniciAdi = "postgres";
		String sifre = "123456789";
		/*
		 * DB ye bağlantı açıyoruz
		 */
		Connection conn = DriverManager.getConnection(adres, kullaniciAdi, sifre);
		/*
		 * Dbde çalışmasını istediğimi sql kodunu hazırlıyoruz.
		 */
		String sql = "Insert into tblurun (ad,marka,model,stok,fiyat) values ('Şeker','A MArka','B Model',100,89)";
		String sql_update ="Update tblurun set marka = 'Hepsi Aynı' ";
		String sql_delete = "delete from tblurun where ad = 'Şeker'";
		String sql_select = "Select * from tblurun";
		/*
		 * Hazırladığımız cümlenin 	işlenebilmesi için çağrım hazırlıyoruz.
		 * Burada sql cümle hazırlayısı aktif edilir ve ihtiyaca göre çağrım yapılır.
		 */
		PreparedStatement pr = conn.prepareCall(sql_select);
		/*
		 * Hazırlanmış olan çağrım komut işlem türüne göre tetiklenir.
		 */
		//pr.executeUpdate();
		ResultSet dataS = pr.executeQuery();
		while (dataS.next()) {
			String ad = dataS.getString("ad");
			Long id = dataS.getLong("id");
			System.out.println(id+" ->"+ad);
		}
		
		/*
		 * Dikkat !!!!!! 
		 * Tüm işlemler bittiğinde mutlata DB bağlantısını kapat Çünkü bir Ip adresinden gelebilecek
		 * maks baglantı isteği 20 adet
		 * bağlantışarı kapatmadan yapılan istekler bir süre sonra red yer.
		 */
		conn.close();
	}

}
