package com.sosyalmedya.service;

import com.sosyalmedya.dto.request.UserSaveRequestDto;
import com.sosyalmedya.repository.IUserRepository;
import com.sosyalmedya.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IUserRepository repository;

    public void save(UserSaveRequestDto dto) {
        repository.save(User.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build());
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
