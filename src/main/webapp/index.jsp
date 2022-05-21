<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Vietnamese Dictionary!" %>
</h1>
<br/>
<form action="/TuDienDonGian" method="post">
    <input type="text" name="search" placeholder="Enter your word :"></br>
    </br>
    <input type="submit">
</form>
</body>
</html>