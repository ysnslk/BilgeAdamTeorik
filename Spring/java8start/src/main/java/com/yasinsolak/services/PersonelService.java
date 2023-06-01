package com.yasinsolak.services;

import com.yasinsolak.repository.IPersonelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonelService {
    private final IPersonelRepository repository;
}
