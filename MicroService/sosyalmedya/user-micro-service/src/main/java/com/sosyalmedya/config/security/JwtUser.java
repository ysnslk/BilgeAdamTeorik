package com.sosyalmedya.config.security;

import com.sosyalmedya.exceptions.ErrorType;
import com.sosyalmedya.exceptions.UserException;
import com.sosyalmedya.repository.IUserRepository;
import com.sosyalmedya.repository.IUserRoleRepository;
import com.sosyalmedya.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JwtUser implements UserDetailsService {
    @Autowired
    IUserRepository userRepository;
    @Autowired
    IUserRoleRepository userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public UserDetails getUserByAuthId(Long authId) {
        Optional<User> user = userRepository.findOptionalByAuthid(authId);
        if (user.isEmpty()) throw new UserException(ErrorType.INVALID_USER);
        // TODO: kullanıcıya ait rolleri userrole tablosundan çekeceğiz.
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));
        authorities.add(new SimpleGrantedAuthority("USER"));
        authorities.add(new SimpleGrantedAuthority("AHMET_AMCA"));
        authorities.add(new SimpleGrantedAuthority("DELI_MISIN"));
        return org.springframework.security.core.userdetails.User
                .builder()
                .username(user.get().getUsername())
                .password("")
                .accountExpired(false)
                .accountLocked(false)
                .authorities(authorities)
                .build();
    }
}
