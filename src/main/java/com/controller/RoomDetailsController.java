package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.GameRoomServiceImpl;
@WebServlet("/roomDetails/*")
public class RoomDetailsController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private GameRoomServiceImpl service = new GameRoomServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String view = "/roomDetails.jsp";
		String url = request.getPathInfo().replace("/", "");
		String orderBy = request.getParameter("orderby");

		if (url.matches("([0-9]*)")) {
			int id = Integer.valueOf(url);
			request.setAttribute("room", service.getRoom(id, orderBy));
		} else {
			view = "/errorPage.jsp";
		}
		request.getRequestDispatcher(view).forward(request, response);
	}

}
