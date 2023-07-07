package com.sosyalmedya.constants;

public class RestApiList {
    /**
     * Projeler genellikle belli sunuculer ve belli portlar üzerinde çalışırlar.
     * Büyük projelerde ekipler ayrışır ve farklı ekipler farklı end pointler
     * ile istek atarlar. Bu ayrışmayı daha kontrollü yapmak için sabitleri yönetmek
     * iyi bir fikirdir.
     */

    public static final String API = "/api";

    public static final String VERSION = "/v1";

    public static final String USER = API+VERSION+"/auth";

    public static final String SAVE ="/save";
    public static final String FINDALL = "/findall";

}
