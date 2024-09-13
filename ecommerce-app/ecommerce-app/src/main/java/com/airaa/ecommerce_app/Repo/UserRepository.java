package com.airaa.ecommerce_app.Repo;


import com.airaa.ecommerce_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
