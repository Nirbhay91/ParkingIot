package com.indrajeet.parkingiot;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;

public class Commands {
	  public Map<String, Method> commandsMap;

	    public Commands() {
	        commandsMap = new HashMap<String, Method>();
	        try {
	            populateCommandsHashMap();
	        } catch (NoSuchMethodException e) {
	            e.printStackTrace();
	        }
	    }
	    private void populateCommandsHashMap() throws NoSuchMethodException {
	        commandsMap.put("create_parking_lot", ParkingIotProblem.class.getMethod("createParkingLot", String.class));
	        commandsMap.put("park", ParkingIotProblem.class.getMethod("park", String.class, String.class));
	        commandsMap.put("leave", ParkingIotProblem.class.getMethod("leave", String.class));
	        commandsMap.put("status", ParkingIotProblem.class.getMethod("status"));
	        commandsMap.put("registration_numbers_for_cars_with_colour", ParkingIotProblem.class.getMethod("getRegistrationNumbersFromColor", String.class));
	        commandsMap.put("slot_numbers_for_cars_with_colour", ParkingIotProblem.class.getMethod("getSlotNumbersFromColor", String.class));
	        commandsMap.put("slot_number_for_registration_number", ParkingIotProblem.class.getMethod("getSlotNumberFromRegNo", String.class));
	    }
}
