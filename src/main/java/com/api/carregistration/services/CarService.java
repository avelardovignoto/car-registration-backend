package com.api.carregistration.services;

import com.api.carregistration.dto.CarDTO;
import com.api.carregistration.entities.Car;
import com.api.carregistration.mappers.CarMapper;
import com.api.carregistration.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public void addCar(CarDTO carDTO) {
        Car car = new Car();
        car.setName(carDTO.getName());
        carRepository.save(car);
    }

    public List<CarDTO> getCars() {
        return carMapper.carListToCarDTOList(carRepository.findAll());
    }

    public void deleteCar(Integer id) {
        carRepository.deleteById(id);
    }
}
