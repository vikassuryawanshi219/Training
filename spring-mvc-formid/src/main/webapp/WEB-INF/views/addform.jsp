<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Add Product</h1>

<form action="addProduct" method="post">
Product Name<input type="text" name="productName"><br>
ProductId<input type ="text" name="productId"><br>
Rating<input type="text" name="rating"><br>
Price<input type="text" name="price"><br>

<input type="submit" value="Add Product">
</form>
</body>
</html>