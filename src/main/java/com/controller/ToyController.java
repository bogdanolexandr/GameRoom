package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Color;
import com.entity.Toy;
import com.service.GameRoomService;
import com.service.GameRoomServiceImpl;

@WebServlet("/findtoys")
public class ToyController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private GameRoomService service = new GameRoomServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Color color = Color.valueOf(request.getParameter("color"));
		int roomId = Integer.valueOf(request.getParameter("roomid"));
		String orderBy = request.getParameter("orderby");
		
		List<Toy> toys = service.findToys(roomId, color, orderBy);
		
		request.setAttribute("color", color);
		request.setAttribute("roomid", roomId);
		request.setAttribute("toys", toys);
		
		request.getRequestDispatcher("toys.jsp").forward(request, response);
	}

}
