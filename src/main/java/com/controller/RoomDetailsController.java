package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Color;
import com.entity.Room;
import com.service.GameRoomService;
import com.service.GameRoomServiceImpl;
@WebServlet("/roomDetails/*")
public class RoomDetailsController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private GameRoomService service = new GameRoomServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String view = "/roomDetails.jsp";
		String url = request.getPathInfo().replace("/", "");
		String orderBy = request.getParameter("orderby");

		if (url.matches("([0-9]*)")) {
			int id = Integer.valueOf(url);
			Color[] colors = Color.values();
			Room room = service.getRoom(id,orderBy);
			request.setAttribute("colors", colors);
			request.setAttribute("room", room);
		} else {
			view = "/errorPage.jsp";
		}
		
		request.getRequestDispatcher(view).forward(request, response);
	}

}
