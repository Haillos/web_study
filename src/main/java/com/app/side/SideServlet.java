package com.app.side;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//WebServlet
public class SideServlet {

	// 웹 요청이 왔을 때 처리
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();

		if (requestURI.equals("/quiz04/main1-1")) {
			// 어떤 컨트롤러를 호출
			Controller1 con1 = new Controller1();
			con1.process(request,response);
		}

		
}
}