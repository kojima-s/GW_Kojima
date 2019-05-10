package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//セッションの開始、セッションIDを発行してセッションオブジェクトを生成
		HttpSession session = req.getSession(true);
		//データの格納
		session.setAttribute("loginUser", "KnowledgeTaro");
		//以下html形式で出力されるためののコード
		resp.setContentType("text/html;charset= UTF-8");
		PrintWriter out = resp.getWriter();
		
		//HTMLの記述
		out.println("<html>");
		out.println("<head><title>Session Servlet 1</title></head>");
		out.println("<body>");
		out.println("<h1>Session Servlet 1</h1>");
		out.println("<p>セッションを開始しました</p>");
		out.println("</body>");
		out.println("</html>");

	}

}
