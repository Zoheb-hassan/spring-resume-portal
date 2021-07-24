package com.home.tut.resumeportal.service;

import com.home.tut.resumeportal.models.MyUserDetails;
import com.home.tut.resumeportal.models.User;
import com.home.tut.resumeportal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Optional<User> user = userRepository.findByUserName(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("Couldn't find " + userName));
        //Transform the DB stored user entity to Spring Security recognized User Entity
        return user.map(e -> new MyUserDetails(e)).get();
    }
}
