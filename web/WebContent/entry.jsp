<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>占い</title>
</head>
<body>
 <h1>占いアプリケーション</h1><br>
 <form action ="http://localhost:8080/kx/fortune" method ="post">
 <table>
  <tr>
   <td>氏名</td>
   <td><input type="text" name="name"></td>
  </tr>

  <tr>
   <td>生年月日<td>
       <select name = "year">
			<option></option>
			<option>1990</option>
			<option>2000</option>
			<option>2010</option>
		</select>年
		<select name = "month">
			<option></option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
		</select>月
		<select name = "date">
			<option></option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
		</select>日
   </tr>
   <td>
	<input type = "submit" value = "占う" >
	</td>


 </table>




</body>
</html>