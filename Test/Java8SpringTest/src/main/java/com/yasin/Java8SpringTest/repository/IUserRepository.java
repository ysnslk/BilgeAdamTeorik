package com.yasin.Java8SpringTest.repository;

import com.yasin.Java8SpringTest.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
}
