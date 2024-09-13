package com.airaa.ecommerce_app.Repo;


import com.airaa.ecommerce_app.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
