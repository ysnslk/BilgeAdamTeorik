package com.yasinsolak.repository;

import com.yasinsolak.repository.entity.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRandevuRepository extends JpaRepository<Randevu,Long> {
}
