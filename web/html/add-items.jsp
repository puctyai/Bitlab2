
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <%@include file="/links/links.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<div class="  justify-content-center">
    <form action="/add-items" method="post">
    <div>
        NAME:
    </div>

    <div>
        <input type="text" placeholder="Insert name" name="name">
    </div>

    <div>
        Price:
    </div>

    <div>
        <input type="text" placeholder="Insert price" name="price">
    </div>
    <div>
        AMOUNT:
    </div>
    <div>
        <input type="text" placeholder="Insert amount" name="amount">
    </div>
    <div>
        <button class="btn btn-sm btn-success"> ADD ITEM</button>
    </div>
    </form>
</div>
</body>
</html>
