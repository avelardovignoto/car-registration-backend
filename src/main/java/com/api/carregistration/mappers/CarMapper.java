package com.api.carregistration.mappers;


import com.api.carregistration.dto.CarDTO;
import com.api.carregistration.entities.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarMapper {

    public CarDTO carToCarDTO(Car car) {
        CarDTO carDTO = new CarDTO();
        carDTO.setId(car.getId());
        carDTO.setName(car.getName());
        return carDTO;
    }

    public List<CarDTO> carListToCarDTOList(List<Car> cars){
        ArrayList<CarDTO> carDTOList = new ArrayList<>();

        for (Car car : cars) {
            carDTOList.add(carToCarDTO(car));
        }

        return carDTOList;
    }


}
