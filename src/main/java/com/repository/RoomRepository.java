package com.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.entity.Gender;
import com.entity.Room;
import com.entity.Toy;

public class RoomRepository {

	private ToysRepository repo = new ToysRepository();
	private Map<String, List<Toy>> setsForRooms = new HashMap<>();
	private List<Room> rooms = new ArrayList<>();

	{
		setsForRooms.put("first type for boys",
				Arrays.asList(
						new Toy[] { repo.getToy("big car"), 
									repo.getToy("big gun"),
									repo.getToy("small car"),
									repo.getToy("medium gun"),
									repo.getToy("medium car") }));

		setsForRooms.put("second type for boys",
				Arrays.asList(
						new Toy[] { repo.getToy("big car"), 
									repo.getToy("big gun"),
									repo.getToy("medium car"),
									repo.getToy("small car"),
									repo.getToy("small gun")}));

		setsForRooms.put("first type for girls", 
				Arrays.asList(
						new Toy[] { repo.getToy("big doll"), 
									repo.getToy("medium doll"), 
									repo.getToy("pink jumping-rope") }));

		setsForRooms.put("second type for girls", 
				Arrays.asList(
						new Toy[] { repo.getToy("small doll"), 
									repo.getToy("red jumping-rope"), 
									repo.getToy("pink jumping-rope") }));

		setsForRooms.put("first type for both", 
				Arrays.asList(
						new Toy[] { repo.getToy("big bucket"), 
									repo.getToy("big cube"), 
									repo.getToy("big bear"),
									repo.getToy("small bucket"),
									repo.getToy("medium bucket") }));

		setsForRooms.put("second type for both", 
				Arrays.asList(
						new Toy[] { repo.getToy("medium bucket"), 
									repo.getToy("medium cube"), 
									repo.getToy("medium bear"),
									repo.getToy("big cube"),
									repo.getToy("small bear")}));

		setsForRooms.put("third type for both", 
				Arrays.asList(
						new Toy[] { repo.getToy("small bucket"),
									repo.getToy("small cube"), 
									repo.getToy("small bear"), 
									repo.getToy("big bear"),
									repo.getToy("medium bear")}));

		int id = 0;
		for (Map.Entry<String, List<Toy>> set : setsForRooms.entrySet()) {
			rooms.add(new Room(id,set.getKey(), set.getValue()));
			id++;
		}
	}

	public List<Room> getAllRooms() {
		return rooms;
	}

	public List<Room> getRooms(double maxPrice) {
		List<Room> listOfRooms = new ArrayList<>();
		rooms.stream()
			.filter(n -> n.getPrice() < maxPrice)
			.forEach(n -> listOfRooms.add(n));
		return listOfRooms;
	}

	public List<Room> getRooms(double maxPrice, Gender gender) {
		List<Room> listOfRooms = new ArrayList<>();
		rooms.stream()
			.filter(n -> n.getPrice() < maxPrice)
			.filter(n -> n.getGender() == gender)
			.forEach(n -> listOfRooms.add(n));
		return listOfRooms;
	}

	public Room getRoom(int id) {
		return rooms.get(id);
	}

}
