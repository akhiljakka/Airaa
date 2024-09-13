package com.airaa.ecommerce_app.Repo;


import com.airaa.ecommerce_app.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
    Coupon findByCode(String code);
}
