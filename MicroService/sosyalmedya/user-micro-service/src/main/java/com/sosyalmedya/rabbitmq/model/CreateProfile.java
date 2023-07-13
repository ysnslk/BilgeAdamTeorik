package com.sosyalmedya.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ÇOOOOOOOOOOOOK ÖNEMLİ
 * rabbitmq gibi yapılar sınıfları iletirken base64'e çevirir. Bu nedenle
 * bu sınıfları tanımlarken serileştirme işlemlerini yapmamız gerekir. Ayrıca
 * dikkat edilmesi gereken diğer husus serileştirilen sınıfların iletilen
 * tarafya serileştirme işlemleri tersine işletebilmesi için aynı paket adı içinde
 * tanımlanmış olmaslı gereklidir.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateProfile implements Serializable {
    Long authId;
    String username;
    String email;
}
