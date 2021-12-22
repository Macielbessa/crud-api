package com.crud.restapi.CarRepository;

import com.crud.restapi.CarEntity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
