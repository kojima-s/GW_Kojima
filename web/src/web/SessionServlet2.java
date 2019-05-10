package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//以下html形式で出力されるためののコード
		resp.setContentType("text/html;charset= UTF-8");
		PrintWriter out = resp.getWriter();

		//HTMLの記述
		out.println("<html>");
		out.println("<head><title>Session Servlet 2</title></head>");
		out.println("<body>");
		out.println("<h1>Session Servlet 2</h1>");

		//セッションが開始していない場合nullを代入する
		HttpSession session = req.getSession(false);
		//セッションが開始されていない場合
		if (session == null) {
		out.println("<p>セッションが開始されていません</p>");
		out.println("</body>");
		out.println("</html>");
		return;
		}
		out.println("<p>セッションが継続しています</p>");
		//データの取り出し
		out.println("<p>"+session.getAttribute("loginUser")+"</p>");
		out.println("</body>");
		out.println("</html>");

	}

}
