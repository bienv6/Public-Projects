<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import  url="/WEB-INF/JSP/head.jsp">
  <c:param name="title" value="Prices"/>
</c:import>

<body>
    <h1>Prices</h1>
    <ul>
        <c:forEach var="price" items="${prices}">
            <c:url var="url" value="/snacks">
                <c:param name="price" value="${price}"/>
            </c:url>
            <li><a href="${url}">${price}</a></li>
        </c:forEach>
    </ul>
</body>
</html>