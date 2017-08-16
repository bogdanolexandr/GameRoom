package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.entity.Gender;

@WebServlet("/")
public class IndexController extends HttpServlet {

	private static final long serialVersionUID = 5909425134159123467L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<String> genders = new ArrayList<>();
		for (Gender gender : Gender.values()) {
			genders.add(gender.toString());
		}
		req.setAttribute("gender", genders);

		req.getRequestDispatcher("find.jsp").forward(req, resp);

	}

}
