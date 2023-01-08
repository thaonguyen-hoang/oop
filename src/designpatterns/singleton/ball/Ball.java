package designpatterns.singleton.ball;

import java.util.HashMap;
import java.util.Map;

public class Ball {
    private String color;

    // To make sure only one ball of a given color is ever created
    private static Map<String, Ball> ballRecord = new HashMap<>();

    private Ball(String color) {
        this.color = color;
    }

    public static Ball getInstance(String color) {
        if (!ballRecord.containsKey(color)) {
            ballRecord.put(color, new Ball(color));
        }
        return ballRecord.get(color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
