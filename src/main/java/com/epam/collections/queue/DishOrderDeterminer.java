package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new ArrayList<>();
        List<Integer> orderOfEatenDishes = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        int dishIndex = everyDishNumberToEat-1;

        while (dishes.size() > 0) {
            dishIndex = dishIndex % dishes.size();
            orderOfEatenDishes.add(dishes.get(dishIndex));
            dishes.remove(dishIndex);
            dishIndex += 3;
        }

        return orderOfEatenDishes;
    }
}
