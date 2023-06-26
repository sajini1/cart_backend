package com.laundry.cart.repository;

import com.laundry.cart.model.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckOutRepository extends JpaRepository<Checkout,Long> {
}
