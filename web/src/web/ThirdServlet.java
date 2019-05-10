package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			//送信されてくるパラメータのエンコーディングの指定
			req.setCharacterEncoding("UTF-8");
	        //送信したパラメータの取得　文字列
			String param = req.getParameter("param");
			String example = req.getParameter("example");
			String sss = req.getParameter("sss");
			String tabi = req.getParameter("tabi");
			String tabi1 = req.getParameter("tabi1");
			String tabi2 = req.getParameter("tabi2");
			String naiyou = req.getParameter("naiyou");


          	//以下html形式で出力されるためののコード
			resp.setContentType("text/html; charset = UTF-8");
			PrintWriter out = resp.getWriter();


			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("名前");
			out.println("<h3>"+param+"</h3>");
			out.println("年齢");
			out.println("<h3>"+example+"</h3>");
			out.println("性別");
			out.println("<h3>"+sss+"</h3>");
			out.println("興味のある言語");

			out.println("<h3>"+tabi+tabi1+tabi2+"</h3>");
			//if文でロジックをかいてnullを回避する



			out.println("一言");
			out.println("<h3>"+naiyou+"</h3>");


			out.println("</body>");

			out.println("</html>");
		 //htmlに満足したらcloseしてね
			out.close();






	}

}
