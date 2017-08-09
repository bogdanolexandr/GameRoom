package com.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.entity.Toy;
import com.repository.ToysRepository;

@WebServlet("/")
public class Controller extends HttpServlet {

	private static final long serialVersionUID = 5909425134159123467L;
	private ToysRepository repository = new ToysRepository();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String orderBy = req.getParameter("orderby");
		List<Toy> toys = repository.getToys(orderBy);
		req.setAttribute("toys", toys);
		req.getRequestDispatcher("result.jsp").forward(req, resp);
		
	}

}
