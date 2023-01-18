package com.modelaai.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.api.dto.CarDTO;
import com.modelaai.api.model.Car;
import com.modelaai.api.repository.CarRepository;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarRepository carRepository;

	@PostMapping
	public void createCar(@RequestBody CarDTO carDTO) {
		Car car = new Car(carDTO);
		carRepository.save(car);
	}

	@GetMapping
	public List<Car> getCars() {
		return carRepository.findAll();
	}
}
