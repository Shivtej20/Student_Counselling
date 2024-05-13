package com.newproject.serviceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

 

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

 

import com.newproject.app.entity.userDetails;
import com.newproject.app.repo.userRepository;
import com.newproject.app.service.userServiceImpl;

 

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

 

    @Mock
    private userRepository userRepo;

 

    @Mock
    private BCryptPasswordEncoder passwordEncoder;

 

    @InjectMocks
    private userServiceImpl service;

 

    @Test
    public void testCreateUser() {
        userDetails user = new userDetails("satyam", "satyam@gmail.com", "Nasik", "BE", "123", "ROLE_USER");
        when(passwordEncoder.encode("123")).thenReturn("encoded_password");
        when(userRepo.save(user)).thenReturn(user);

 

        userDetails createdUser = service.createUser(user);
        assertEquals("encoded_password", createdUser.getPassword());
        assertEquals("ROLE_USER", createdUser.getRole());
    }

 

    @Test
    public void testCheckEmail() {
        when(userRepo.existsByEmail("satyam@gmail.com")).thenReturn(true);

 

        assertTrue(service.checkEmail("satyam@gmail.com"));
    }

 

}

