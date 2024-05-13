package com.newproject.serviceTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.newproject.app.AppApplication;
import com.newproject.app.entity.userDetails;
import com.newproject.app.repo.userRepository;

@AutoConfigureTestDatabase(replace=Replace.NONE)
@SpringBootTest(classes=AppApplication.class)
class UserTest {

    
    @Autowired
    private userRepository repo;

    @Test
    void userFindById() {

        Integer exceptedId=2;

        Optional<userDetails> user=repo.findById(exceptedId);

        assertEquals(exceptedId, user.get().getId());

    }


    @Test
    public void userFindByNameTest() {
        Integer id=1;
        String user1="satyam";

        Optional<userDetails> user=repo.findById(id);
        assertEquals(user1, user.get().getFullName());
    }

 

    
    @Test
    public void saveUsertest() {
        userDetails user= new userDetails();
        Integer id=11;
        user.setFullName("ANAND");
        user.setAddress("Pune");
        user.setEmail("anand@123");
        user.setPassword("123");
        user.setQualification("B.TECH");
        user.setRole("ROLE_USER");
        user.setId(11);

        repo.save(user);

        Optional<userDetails> details=repo.findById(id);

        assertEquals("anand@123", user.getEmail());


    }

    @Test
    public void userReadAll() {
        List<userDetails> user= repo.findAll();
        assertThat(user).size().isGreaterThan(0);
    }

    @Test
    public void testDelete() {
        repo.deleteById(10);
        assertThat(repo.existsById(10)).isFalse();
    }

 

    

}