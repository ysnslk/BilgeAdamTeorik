package com.yasinsolak.repository;

import com.yasinsolak.repository.entity.PersonelDepartman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonelDepartmanRepository extends JpaRepository<PersonelDepartman,Long> {

}
