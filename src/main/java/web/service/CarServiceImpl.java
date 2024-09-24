package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW","X7",2024));
        cars.add(new Car("Audi","Q4",2014));
        cars.add(new Car("Copeyka","1",2005));
        cars.add(new Car("Lada","XRAY",2018));
        cars.add(new Car("Mitsubisi","OutLander",2017));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size() || count < 0){
        return cars;
        }
        return cars.subList(0, count);
    }
}
