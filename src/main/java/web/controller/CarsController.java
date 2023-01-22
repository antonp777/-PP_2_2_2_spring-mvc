package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    private final CarServiceImpl cars;
    @Autowired
    public CarsController(CarServiceImpl cars) {
        this.cars = cars;
    }

    @GetMapping("/cars")
    public String viewCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        model.addAttribute("cars", cars.viewCars(cars.getCars(), count));
        return "/cars";
    }
}
