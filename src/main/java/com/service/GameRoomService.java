package com.service;

import java.util.List;

import com.entity.Color;
import com.entity.Gender;
import com.entity.Room;
import com.entity.Toy;

public interface GameRoomService {

	public Room getRoom(int id);

	public Room getRoom(int id, String orderBy);

	public List<Room> getRooms(double maxPrice, Gender gender);

	public List<Room> getAllRooms();

	public List<Toy> findToys(int roomId, Color color);

}
