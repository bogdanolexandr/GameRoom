package com.service;

import java.util.List;
import com.entity.Color;
import com.entity.Gender;
import com.entity.Room;
import com.entity.Toy;
import com.repository.RoomRepository;
import com.repository.ToysRepository;
import com.util.Sorter;

public class GameRoomServiceImpl implements GameRoomService {

	private RoomRepository roomRepo = new RoomRepository();
	private ToysRepository toysRepo = new ToysRepository();
	
	@Override
	public Room getRoom(int id) {
		return roomRepo.getRoom(id);
	}

	@Override
	public Room getRoom(int id, String orderBy) {
		Room room = roomRepo.getRoom(id);
		List<Toy> list = room.getToys();
		Sorter.sort(list, orderBy);
		return room;
	}

	@Override
	public List<Room> getRooms(double maxPrice, Gender gender) {
		return roomRepo.getRooms(maxPrice, gender);
	}

	@Override
	public List<Room> getAllRooms() {
		return roomRepo.getAllRooms();
	}

	@Override
	public List<Toy> findToys(int roomId, Color color, String orderBy) {
		Room room = roomRepo.getRoom(roomId);
		List<Toy> toys = toysRepo.getToys(room, color);
		Sorter.sort(toys, orderBy);
//		room.getToys()
//			.stream()
//			.filter(n -> n.getColor() == color)
//			.forEach(n -> toys.add(n));
		return toys;
	}

}
