package com.crud.restapi.CarController;


import com.crud.restapi.CarEntity.Car;
import com.crud.restapi.CarRepository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {
    CarRepository carRepository;

    @GetMapping("/carros")
    public List<Car>getAllCar(){
        return carRepository.findAll();
    }

    @GetMapping("/carros/{id}")
    public Car getCarById(@PathVariable Long id){
        return carRepository.findById(id).get();
    }
    @PostMapping("/carros")
    public Car saveCar(@RequestBody Car car){
        return carRepository.save(car);
    }
    @DeleteMapping("/carros/{id}")
    public void deleteCar(@PathVariable Long id){
        carRepository.deleteById(id);
    }
}
