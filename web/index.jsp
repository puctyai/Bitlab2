<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/links/links.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<table class="table table-striped table-success table-hover">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Amount</th>
        <th>DETAILS</th>
    </tr>
    </thead>
    <tbody>
    <%
        ArrayList<Item> items =(ArrayList<Item>) request.getAttribute("model");
        if(items!=null) {
            for(Item item : items) {


    %>
    <tr>
        <td><%=item.getId()%></td>
        <td><%=item.getName()%></td>
        <td><%=item.getPrice()%></td>
        <td><%=item.getAmount()%></td>
       <td><a href="/items-det?id=<%=item.getId() %>"class = "btn btn-dark bnt-sm">DETAILS</a> </td>
    </tr>
    <%
            }
        }
    %>
    </tbody>

</table>

</body>
</html>
