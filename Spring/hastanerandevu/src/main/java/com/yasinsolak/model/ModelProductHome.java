package com.yasinsolak.model;

import com.yasinsolak.repository.view.VwProduct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModelProductHome {

    /**
     * Sol menüdeki liste bilgilerine göre
     * ürünlerin listesine
     *
     */
    List<String> menuList = Arrays.asList("Home","Products","BLog");
    String title;
    Long userId;
    String userName;
    String userImage;
    List<VwProduct> urunListesi;
}
