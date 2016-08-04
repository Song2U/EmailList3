package kr.ac.sungkyul.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class WebUtil {
	public static void redirect(String url, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect(url);
	}

	public static void forward(String path, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list.jsp");
		rd.forward(request, response);
	}
}