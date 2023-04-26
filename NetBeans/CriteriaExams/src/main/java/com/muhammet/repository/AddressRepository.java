package com.muhammet.repository;

import com.muhammet.relations.Address;
import com.muhammet.utility.MyFactoryRepository;

public class AddressRepository extends MyFactoryRepository<Address, Long>{
   public AddressRepository(){
       super(new Address());
   }
}
