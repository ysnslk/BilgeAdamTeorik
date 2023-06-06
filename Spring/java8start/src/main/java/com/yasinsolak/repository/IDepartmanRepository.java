package com.yasinsolak.repository;

import com.yasinsolak.repository.entity.Departman;
import com.yasinsolak.repository.view.ViewDepartmanList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IDepartmanRepository extends JpaRepository<Departman,Long> {

    /**
     * Spring Data JPA belli keyboard ler ile sorgular method isimlerine göre otomatik oluşturur.
     * --Örneğin: yöetici id sinden yöneticinin bağlı bulunduğu departman listesini bul.
     * ---- Spring Keyboard ler ile sorgu methodu oluşturmak ;
     * 1- find ile başlıyoruz.
     * 2- By ile devam ediyoruz. bir kaç yerde değişikliğe uğrayarak arasına değer girebiliyor.
     * 3- Entity içinde var olan bir property adını ekliyoruz.
     * DİKKAT!!!! burada yazılacak değişken adı mutlaka büyük harf ile başlar ve değişken yazım şekline göre devam eder.
     * 4- bu method için ek özellikler varsa eklenir.
     * 5- methodun talep edttiği değer parametre olarak eklenir.
     * 6- geri dönüş tipi yazılan methodun başına getirilir.
     */
    List<Departman> findByYoneticiid(Long yoneticiid); // find By Yoneticiid -> yoneticiid => select * from tbldepartman where yoneticiid =  ?
    List<Departman> findByKonum(String konumadi_istedigini_yazabilirsin); // select * from tbldepartman where konum = ?

    /**
     * Select * from tbldepartman where ad=?
     * Bu kısımda arama yaprken eğer aynı ad ile kayıt edilmiş birden fazla kayıt varsa sadece ilk olanı getirir.
     * @param ad
     * @return
     */
    Departman findByAd(String ad); // Select * from tbldepartman where ad=?
    /**
     * Eğer gerekli olduğunda aranılan bilginin varlığının kontrolü sağlanılacak ise, burada gelen bilginin null olması
     * durumunda hata alınacağı için Optional kullanılır.
     * DİKKAT!!!!!
     * Burada dikkat etmeniz gereken husus aradığınız bilginin ya hiç olmaması yada bir tane olması gereklidir.Eğer birden
     * fazla kayıt dönüyorsa hata alırsınız. Bu nedenle optional kullanırken dikkat etmelisiniz.
     */

    Optional<Departman> findOptionalByAd(String ad);

    /**
     * Aradığım kelime departman adi içinde var ise bunların listesini getirsin.
     * select * from tbldepartman where ad like %?%
     * Eğer like kullanıyor iseniz özel karakterleri sizi belirlemeniz gereklidir. %ad%,%de% d__% gibi
     * NOT -> eğer belli bir kelime dışında kalan kayıtları listelemek istiyor isek bunu kullanırız NotLike
     */
    List<Departman> findByAdLike(String searchKey);
    List<Departman> findByAdNotLike(String searchKey);
    /**
     * Eğer istediğimiz şey tam olarak aradığımız kelimenin property datası içinde geçip geçmediğniz kontrolü ise
     */
    List<Departman> findByAdContaining(String searchKey);

    /**
     * Aradığımız kelime ile başlayan kayıtları listeleyelim.
     */
    List<Departman> findByAdStartingWith(String searchKey); // muh% -> ile başlayan kayıtlar

    /**
     * Birden fazla property üzerinden arama yapmak istiyor isek
     * AND key kullanılarak işlemlerimizi yürütebiliriz.
     * Birden fazla kriter içinde herhangi birisini sağlayan kayıtları getirmek için or kullanılır.
     * Select * from tbldepartman where ad=? and konum=?
     */
    List<Departman> findAllByYoneticiidAndKonum(Long yoneticiid,String konum);

    /**
     * select * from tbldepartman where yoneticiid=? or konum=?
     */
    List<Departman> findAllByYoneticiidOrKonum(Long yoneticiid,String konum);

    /**
     * Select * from tbldepartman where yoneticiid=? or like konum%kk%
     * StartingWith -> k%
     * Containing -> %k%
     */
    List<Departman> findAllByYoneticiidOrKonumStartingWith(Long yoneticiid,String konum);
    List<Departman> findAllByYoneticiidOrKonumLike(Long yoneticiid,String konum);
    List<Departman> findAllByYoneticiidOrKonumContaining(Long yoneticiid,String konum);

    /**
     * Kayıtları belli bir property ye göre sıralamak için
     * OrderBy kullanılır.
     * ASC -> a...z Küçükten büyüğe (default)
     * DESC -> z...a Büyükten küçüğe
     */
    List<Departman> findAllByOrderByKonum(); // a..z
    List<Departman> findAllByOrderByKonumDesc(); // z..a

    /**
     * Belirli bir kritere göre kısıtlayıp sonrasında sıralama yapmak mantıklıdır.
     */
    List<Departman> findAllByKonumOrderByKonum(String konum);

    /**
     * Satış platformu, en çok satan ürünleri listelemek istiyor. Ve bu ürünlerin
     * en çok satılan 5 ürünü listelemek istiyorsunuz.
     * TOP - LIMIT
     * select * from tblurun order by adet desc limit 5
     */
    List<Departman> findTop3AllByOrderByKonum();
    List<Departman> findTop50ByKonumContaining(String konum);
    /**
     * Bir kitapçıda en çok satılan kitabı bulmak istiyoruz.
     */
    Departman findTopByOrderByKonum();

    /**
     * Durumunun aktif olduğu kayıtları getirmek yada true/fasle olan alanlara göre listeleme
     * yapamk için kullanılacak methodlar
     */
    List<Departman> findAllByIsactive(Boolean isactive);
    List<Departman> findAllByIsactiveTrue();
    List<Departman> findAllByIsactiveFalse();

    /**
     * Belli bir string alanda arama yaparken kullanıcıların yazım şekillerine
     * çok riayet ettikleri söylenemez yani, bir kişi giriş yapmak için kullanıcı
     * adını girerken; muhammet, Muhammet, MUHAMMET , MuHammEt gibi yazımlar olabilir.
     * Böyle durumlarda arama yaparken sorun yaşarız.
     * Yani ->  "muhammet".equals("Muhammet" -> false
     * Doğru yaklaşım -> "muhammet".equalsIgnoreCase("Muhammet") -> true
     */
    List<Departman> findAllByKonumIgnoreCase(String konum);

    /***
     * DİKKAT!!! PERFORMANS İÇERİR. :)
     * Örneğin, elinizde uygulamanızda en çok ürün alan kişilerin satış  işlemlerine
     * ulaşmak istiyorsunuz, fakat bu bilgilere ulaşmak için önce satışları çekmeniz
     * ardından bu kişilerin listesini ayıklamanız gereklidir. yada join kullanarak
     * tüm tabloları birleştirip arama yapmanız gereklidir. İki durumda yüksek işlem
     * hacmi tüketeceği için sorunludur.
     * Doğru Yöntem;
     * önce kişiler bulunur ve bu kişilerin id bilgisi bir List<String> içine atılır.
     * Bu liste satış tablosunda sorgulanarak sadece bu kişilere ait satışların listesinin
     * çekilmesi sağlanır ve performan iyileşir.
     * Select * from rblsatis wgere musteriid in (1,2,3,4,5,6,7,8,9,10)
     */
    List<Departman> findAllByYoneticiidIn(List<Long> yoneticiidList);

    /**
     * Günlük challange yapılan bir sistemde Aktif olan challangeları listelemek için
     * bulunduğumuz anda bitiş tarihinin büyük olması surumleri irdelenir.
     * Select * from tblchallange where enddate > ?
     * Örn; 01.01.2023 den sonra açılan departmanların listesi
     */
    List<Departman> findAllByCreateatGreaterThan(Long time);
    List<Departman> findAllByCreateatLessThan(Long time);

    /**
     * Eğer kontrol ettiğiniz tarihide kapsama isteseniz yani >  yerine >= kullanmak isterseniz
     * kullanılır
     */
    List<Departman> findAllByCreateatGreaterThanEqual(Long time);
    List<Departman> findAllByCreateatLessThanEqual(Long time);

    /**
     * Eğer belli bir tarih aralığında kayıtları getirmek isterseniz
     */
    List<Departman> findAllByUpdateatBetween(Long start,Long end); // updateat >= start and updateat <=  end

    /**
     * İhtiyaç duyduğumuz dataları bazen anahtar kelimelerle elde edilemez. Bu durumlarda özel sorgular
     * yazmak ve bu sorguları çalıştırmak gerekebilir.
     */
    @Query("select d from Departman d where d.ad = ?1") // select * from tbldepartman where ad = ?
    Departman senBulDepartmaniAdinaGore(String ad);

    @Query("select d from Departman d where d.yoneticiid = ?1 and d.konum= ?2")
    List<Departman> yoneticiVeKonumaGore(Long yoneticiid,String konum);

    @Query(value="Select * from tbldepartman where konum like %?1%", nativeQuery = true)
    List<Departman> konumaGoreGetir(String konum);

    @Query("Select d from Departman  d where d.ad= :departmanadi")
    Departman bulParametreIle(@Param("departmanadi") String ad);

    /**
     * DİKKAT!!!! ***** Lı kullanım
     */
    @Query("select count(*)>0 from Departman d where d.konum like ?1% and d.ad ilike %?2% ")
    Boolean boyleBirKayitVarMiOla(String konum,String ad);

    @Query("select new com.yasinsolak.repository.view.ViewDepartmanList(d.id,d.ad) from Departman d")
    List<ViewDepartmanList> findAllVwDepartman();
}
