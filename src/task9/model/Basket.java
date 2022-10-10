package task9.model;

import task9.model.Ball;

import java.util.ArrayList;
import java.util.List;

public class Basket
{
    private List<Ball> balls;

    public Basket() { balls = new ArrayList<>(); }
    public Basket(List<Ball> balls) { this.balls = balls; }

    public List<Ball> getBalls() { return balls; }
    public void setBalls(List<Ball> balls) { this.balls = balls; }
}
