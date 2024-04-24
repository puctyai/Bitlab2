<%@ page import="db.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/links/links.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<div class="d-flex flex-column  justify-content-center">
   <%
       Item item =(Item) request.getAttribute("model");
       if(item!=null) {


   %>
        <div>
            NAME:
        </div>

        <div>
            <input type="text" placeholder="Insert name" value="<%=item.getName() %>" name="name" readonly>
        </div>

        <div>
            Price:
        </div>

        <div>
            <input type="text" placeholder="Insert price" value="<%=item.getPrice() %>" readonly name="price">
        </div>

        <div>
            AMOUNT:
        </div>

        <div>
            <input type="text" placeholder="Insert amount"value="<%=item.getAmount() %>" readonly name="amount">
        </div>

        <div>
            <button class="btn btn-sm btn-success">Update Car</button>
        </div>
    <%
        }
    %>

</div>
</body>
</html>
