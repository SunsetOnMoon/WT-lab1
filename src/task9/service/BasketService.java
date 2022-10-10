package task9.service;

import task9.model.Ball;
import task9.model.Basket;

public class BasketService
{
    public final static String BLUE = "blue";
    public final static String RED = "red";

    private final Basket basket;

    public BasketService() {
        basket = new Basket();
    }

    public void addBall(Ball ball) {
        basket.getBalls().add(ball);
    }

    public long getCountOfBlueBalls() {
        return basket.getBalls().stream().filter(ball -> ball.getColor().equals(BLUE)).count();
    }

    public double getSumWeight() {
        double weight = 0;
        for (int i = 0; i < basket.getBalls().size(); i++)
            weight += basket.getBalls().get(i).getWeight();
        return weight;
    }
}
