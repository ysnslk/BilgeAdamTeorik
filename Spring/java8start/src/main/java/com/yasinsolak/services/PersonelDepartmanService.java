package com.yasinsolak.services;

import com.yasinsolak.repository.IPersonelDepartmanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonelDepartmanService {
    private final IPersonelDepartmanRepository repository;
}
