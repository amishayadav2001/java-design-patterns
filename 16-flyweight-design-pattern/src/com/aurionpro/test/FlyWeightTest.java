package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.CircleShapeFactory;
import com.aurionpro.model.IShape;

public class FlyWeightTest {

    public static void main(String[] args) {
        String[] colors = {"blue", "green", "red", "blue", "yellow", "blue", "red"};
List stringList = new ArrayList<>(Arrays.asList(colors));

        CircleShapeFactory factory = new CircleShapeFactory();

       stringList.forEach(color -> {
    	   IShape circle = factory.getCircle((String) color);
    	   circle.draw();
       });
    }
    
}
