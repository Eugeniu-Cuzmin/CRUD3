<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All</title>
    </head>

    <body>
            <table style="border-collapse: collapse" cellpadding="10" border="1">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Age</th>
                </tr>
                <c:forEach items="${lst}" var="st">
                    <tr>
                        <td>${st.id}</td>
                        <td>${st.name}</td>
                        <td>${st.address}</td>
                        <td>${st.age}</td>
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>
