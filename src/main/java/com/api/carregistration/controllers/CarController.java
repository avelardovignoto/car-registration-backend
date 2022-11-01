package com.api.carregistration.controllers;

import com.api.carregistration.dto.CarDTO;
import com.api.carregistration.services.CarService;
import com.api.carregistration.utils.Messages;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/cars")
public class CarController {
    private final CarService carService;

    @PostMapping
    public ResponseEntity<String> addCar(@RequestBody CarDTO carDTO) {
        carService.addCar(carDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Messages.MESSAGE_1.getDescription());
    }

    @GetMapping
    public ResponseEntity<List<CarDTO>> getCars() {
        return ResponseEntity.ok(carService.getCars());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable("id") Integer id) {
        carService.deleteCar(id);
        return ResponseEntity.ok(Messages.MESSAGE_2.getDescription());
    }

}
