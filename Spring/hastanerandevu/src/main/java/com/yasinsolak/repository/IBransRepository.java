package com.yasinsolak.repository;

import com.yasinsolak.repository.entity.Brans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBransRepository extends JpaRepository<Brans,Long> {

    /**
     * Bu değer var ise nesne gelecek yok
     * bunun yerine ne kullanılabilir?
     *
     */
    Optional<Brans> findOptionalByAdIgnoreCase(String ad);
}
