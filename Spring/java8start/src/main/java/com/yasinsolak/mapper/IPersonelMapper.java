package com.yasinsolak.mapper;

import com.yasinsolak.dto.request.SavePersonelRequestDto;
import com.yasinsolak.dto.response.FindAllVwUserResponseDto;
import com.yasinsolak.repository.entity.Personel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * Bir interface in mapper işlemi ile yapabilmesi ile @Mapper annotation ı kullanılmalıdır.
 * burada tanımlama yaparken kullanılan componentModel = "spring" ile spring tarafından yöentilen
 * bean yapısının entegre edileceğini belirtiyoruz.
 * İkinci önemli kısım ise mapping işleminde kaynak ile hedefin uyuşmayan alanlarının nasıl davranacağını
 * belirtiyoruz. En nihayetinde iki alan birebi birbirine karşılık gelmeyebilir. Bu nedenle uyuşmayan alanlar
 * hata fırlatacaktır. Bu nedenle uyuşmazlıkları ignore ediyoruz. Böylece hata fırlatma işlemi gerçekleştirebiliriz.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPersonelMapper {

    /**
     * Burası bir interface imizden bir nesne yaratılacak referansının atanmasını sağlıyor.
     * Böylece bizde bu nesneyi kullanarak mapping işlemlerini gerçekleştirebiliriz.
     */
    IPersonelMapper INSTANCE = Mappers.getMapper(IPersonelMapper.class);

    /**
     * Artık buradan itibaren gerekli kurulumlar bittiğinden dolayı dönüşüm için gerekli method tanımları
     * yapılıyor.
     */
    /**
     * Geri dönüş tipi olarak sınıfı veriyoruz.
     * method atını istediğiniz gibi yazabilirsiniz. Amaca hizmet etsin anlaşılsın yeter
     * parametre olarak ise dto muzu veriyoruz.
     * [References Data Type] [method name]([Parameter])
     *      target                             source
     */
    @Mapping(source = "memberdate", target = "giristarihi")
    Personel personelFromDto(final SavePersonelRequestDto dto);

    FindAllVwUserResponseDto personelToDto(final Personel personel);

}
