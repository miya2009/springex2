<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-10-04
  Time: 오후 4:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Register Page</h2>
<form method="post" action="/todo/register">
    <div>
        Title : <input type="text" name="title">
    </div>
    <div>
        DueDate : <input type="date" name="dueDate">
    </div>
    <div>
        Writer : <input type="text" name="writer">
    </div>
    <div>
        Finished : <input type="checkbox" name="finished">
    </div>
    <div>
        <input type="submit" value="post register 요청">
    </div>
</form>
</body>
</html>
