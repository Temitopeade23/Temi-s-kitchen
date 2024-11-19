<!DOCTYPE html>
<html>
<head>
    <title>Menu</title>
</head>
<body>
    <h1>Our Menu</h1>
    <ul>
        <c:forEach var="item" items="${menu}">
            <li>${item.name}: $${item.price}</li>
        </c:forEach>
    </ul>
    <a href="index.jsp">Go Back</a>
</body>
</html>

