package com.yasinsolak.controller;

import com.yasinsolak.constants.RestApiList;
import com.yasinsolak.dto.request.SavePersonelRequestDto;
import com.yasinsolak.dto.response.FindAllVwUserResponseDto;
import com.yasinsolak.repository.entity.Personel;
import com.yasinsolak.services.PersonelService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.yasinsolak.constants.RestApiList.*;

/**
 * 1- MBC yapısında Controller katmanı @Controller anatasyonu ile işaretlenir.
 * 2- RestAPI yapısında Controller katmanı @RestController anatasyonu ile işaretlenir.
 */
@RestController
/**
 * Path kısmında gelen isteklerin handel edildiği kısımdır. Burada bir URL adresinden gelen isteklerin uygulamamızda
 * nerede yakalanması gerektiği bilgisi iletilir.
 * Bir uygulamanın Rot(Kök-Ana) dizini "/" ile ifade edilir. Yani uygulamanız 9090 portunda çalışıyor olsun.
 * Bir internet adresiniz var ise: http://www.yasin.com/
 * --------
 * http://localhost:9090/personel
 */
@RequestMapping(PERSONEL)
@RequiredArgsConstructor
public class PersonelController {

    private final PersonelService personelService;

    /**
     * Burası son kullanıcın programımız ile iletişime geçtiği kısımdır. Farklı şekillerde iletişim yapabiliriz.
     * GET, POST , PUT , DELETE vs gibi
     * Kullanıcının Request göndermesi.
     * -----> İsteklerin Değerlendirilmesi
     * GET -> Genellikle get istekleri bir sayfanın açılması ya da belirli bir datanın talep edilmesi durumlarında geçerlidir.
     * http://localhost:9090/personel/save
     * Eğer istek sizden parametre talep ediyorsa bunların eklenmesi gereklidir.
     * http://localhost:9090/personel/save?ad=Yasin&adres=Eskişehir&yas=26&telefon=5554443322
     * ? parametre girileceğini belirtir.
     * key=value şeklinde parametre girilir.
     * & ile sonraki parametreye geçilir.
     * DİKKAT!!!! girdiğiniz anahtar kelimeler methodun parametre isimleri ile aynı olmalıdır.
     *
     */
    @GetMapping(SAVE)
    public void savePersonel(String ad,String adres,int yas,String telefon){
        Personel personel = Personel.builder()
                .ad(ad)
                .adres(adres)
                .yas(yas)
                .telefon(telefon)
                .build();
        personelService.save(personel);
    }

    /**
     * POST ---> get ve post ya da diğerleri bir birleşenin yeirne kullanılabilir.
     * Ancak önemli olan konu şudur;
     * GET isteklerinde parametreler URL üzerinden gönderilir. Şöyle düşünelim.
     * Bir uygulamaya giriş yapmak istiyoruz.Kullanıcı adı ve şifre girmremiz gerekiyor. Bu bilgileri GET ile gönderirsek
     * tüm bilgiler başlık içimde iletişir.
     * http://localhost:9090/personel/login?kullanici=ahmet&sifre=12345
     * Bu işlem oldukça tehlikelidir. Bilgiler çalınabilir.
     * POST işleminde işler karmaşıtkır. Bilgiler korunur.
     * GET ile bilgiler header(başlıkta) tutar.
     * POST ile bilgiler body(gövde) taşınır.
     */

    @PostMapping(SAVE)
    public void savePersonel(String ad,String adres,int yas,String telefon,int type){
        Personel personel = Personel.builder()
                .telefon(telefon)
                .yas(yas)
                .adres(adres)
                .ad(ad)
                .type(type)
                .build();
        personelService.save(personel);
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List<Personel>> findAll(){
        return ResponseEntity.ok(personelService.findAll());
    }

    /**
     * Client ve Server arasındaki iletişimde performansı öncelemek istiyorsanız ve atrıca sunucu
     * maliyetlerinin artmamasını istiyorsanız iki bileşen arasındaki veri transferini minimum indirmek
     * için DTO(Data Transfer Object) kullanmalısınız.
     *
     * @return
     */
    @GetMapping(FINDALLVWUSER)
    public ResponseEntity<List<FindAllVwUserResponseDto>> getAllVwPersonel(){
        List<Personel> plist = personelService.findAll();
        List<FindAllVwUserResponseDto> result = new ArrayList<>();
        plist.forEach(p-> {
           FindAllVwUserResponseDto dto =  FindAllVwUserResponseDto.builder()
                    .id(p.getId())
                    .ad(p.getAd())
                    .photo(p.getPhoto())
                    .build();
            result.add(dto);
        });
        return ResponseEntity.ok(result);
    }
    @PostMapping(SAVEDTO)
    public ResponseEntity<Boolean> savePersonelDto(@RequestBody SavePersonelRequestDto dto){
        Personel personel = Personel.builder()
                .ad(dto.getAd())
                .adres(dto.getAdres())
                .telefon(dto.getTelefon())
                .build();
        personelService.save(personel);
        return ResponseEntity.ok(true);
    }
    @GetMapping("/getUpperCaseName")
    public ResponseEntity<String> getUpperCaseName(String ad){
        String upperCaseName = ad.toUpperCase();
        return ResponseEntity.ok(upperCaseName);
    }
    @PostMapping("/postUpperCaseName")
    public ResponseEntity<String> postUpperCaseName(String ad){
        String upperCaseName = ad.toUpperCase();
        return ResponseEntity.ok(upperCaseName);
    }
    @PutMapping("/putUpperCaseName")
    public ResponseEntity<String> putUpperCaseName(String ad){
        String upperCaseName = ad.toUpperCase();
        return ResponseEntity.ok(upperCaseName);
    }
    @DeleteMapping("/deleteUpperCaseName")
    public ResponseEntity<String> deleteUpperCaseName(String ad){
        String upperCaseName = ad.toUpperCase();
        return ResponseEntity.ok(upperCaseName);
    }
    @PatchMapping("/patchUpperCaseName")
    public ResponseEntity<String> patchUpperCaseName(String ad){
        String upperCaseName = ad.toUpperCase();
        return ResponseEntity.ok(upperCaseName);
    }

}
