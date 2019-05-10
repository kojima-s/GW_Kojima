package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {


		HttpSession session = req.getSession(false);
		//セッションが継続されている場合
		if (session != null) {
		//セッションの終了
		session.invalidate();
		}
		//以下html形式で出力されるためののコード
		resp.setContentType("text/html;charset= UTF-8");
		PrintWriter out = resp.getWriter();

		//HTMLの記述
		out.println("<html>");
		out.println("<head><title>Session Servlet 3</title></head>");
		out.println("<body>");
		out.println("<h1>Session Servlet 3</h1>");
		out.println("<p>セッションを終了しました</p>");
		out.println("</body>");
		out.println("</html>");

	}

}
