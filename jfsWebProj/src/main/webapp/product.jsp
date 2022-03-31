<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ page import="java.util.*" %>
<%@ page import="model.*" %>

<title>Insert title here</title>
</head>
<body>
<form method="post" action="Displaypage">
<table>
<tr>
<td>Product Id</td>
<td><input type="text" name="productid"></td>
</tr>
<tr>
<td>Product Name</td>
<td><input type="text" name="product_name"></td>
</tr>
<tr>
<td>Product Price</td>
<td><input type="text" name="productPrice"></td>
</tr>
<tr>
<td><input type="submit" name="submit"></td>
</tr>
</table>
</form>
</body>
</html>