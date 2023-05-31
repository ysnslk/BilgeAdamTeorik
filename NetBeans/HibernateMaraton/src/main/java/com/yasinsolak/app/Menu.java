package com.yasinsolak.app;


import com.yasinsolak.controller.KullaniciController;
import com.yasinsolak.entity.Kullanici;
import java.util.HashMap;

public class Menu {
private KullaniciController kullaniciController;
    public Menu(){
       this.kullaniciController = new KullaniciController();
    }
    public void menu(){
        HashMap<Integer,String> menuItems = new HashMap<>();
        menuItems.put(1,"Kullanıcı Kaydet");

        int key = BAUtils.menu(menuItems);
        switch (key){
            case 1:
               kullaniciController.kullaniciKaydet();
                break;
            case 2:
              
                //User user =userController.login();
                //accountManagement(user);
                break;
        }
    }

    public void accountManagement(Kullanici kullanici){
        HashMap<Integer,String> menuItems = new HashMap<>();
        menuItems.put(1,"Hesap Oluştur");
        menuItems.put(2,"Para Gönder");
        while (true){

            int key = BAUtils.menu(menuItems);
            switch (key){
                case 1:
                   // accountController.createAccount(user);
                    break;
                case 2:
                  //  accountController.transferMoney(user);
                    break;
            }
        }
    }
}
