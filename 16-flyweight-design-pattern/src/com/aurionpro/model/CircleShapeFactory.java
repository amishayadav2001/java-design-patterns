package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CircleShapeFactory {
    private Map<String, IShape> circleMap = new HashMap<>();

    
    public IShape getCircle(String color) {
    	Set<String> keySet = circleMap.keySet();
    	
    	if(!keySet.contains(color)) {
    		circleMap.put(color, new Circle(color));
    		
    	}
    	
    	return circleMap.get(color);
    }

}
