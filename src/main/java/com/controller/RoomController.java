package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Gender;
import com.entity.Room;
import com.service.GameRoomService;
import com.service.GameRoomServiceImpl;

@WebServlet("/room")
public class RoomController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private GameRoomService service = new GameRoomServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String view = "rooms.jsp";
		String priceParam = request.getParameter("price");
		String genderParam = request.getParameter("gender");

		if ((priceParam != null) && (genderParam != null)) {
			if(priceParam.matches("([0-9]*)")){
				Double price = Double.valueOf(priceParam);
				Gender gender = Gender.valueOf(genderParam);
				List<Room> rooms = service.getRooms(price, gender);
				request.setAttribute("rooms", rooms);
			}
		} else {
			view = "find.jsp";
		}
		
		request.getRequestDispatcher(view).forward(request, response);
	}

}
