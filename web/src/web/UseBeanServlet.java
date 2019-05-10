package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//インスタンス化
		EmpBean bean = new EmpBean();
		//EmpBeanクラスのsetnameメソッドに値をセットしている
		bean.setName("kojima");
		//EmpBeanクラスのsetageメソッドに値をセットしている
		bean.setAge(20);
		//リクエストオブジェクトにデータを格納（keyがempでvalueがbean)
		//beanのクラスをまるまるぶち込んでる
		req.setAttribute("emp", bean);
		//転送URLの指定
		//RequestDispatcherを用いて遷移先を指定している
		RequestDispatcher rd = req.getRequestDispatcher("useBean.jsp");
		//転送
		//RequestDispatcherを用いて吹っ飛ばしている
		rd.forward(req, resp);



	}

}
