package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.LinkedList;
import java.util.List;

@Controller
public class CarController {

    private final List<Car> carList = new LinkedList<Car>() {{
        add(new Car("Audi", "black", 20000));
        add(new Car("BMW", "blue", 35000));
        add(new Car("Ford", "white", 70000));
        add(new Car("KIA", "green", 50000));
        add(new Car("Mercedes", "black", 5000));
    }};

    private List<Car> getCarList(int count) {
        return count < carList.size() ? carList.subList(0, count) : carList;
    }


    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {
        model.addAttribute(getCarList(count));
        return "cars";
    }
}
