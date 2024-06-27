package com.example.demo.repositories;

import com.example.demo.domain.Coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository  extends JpaRepository<Coupon, UUID> {
}
