<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:import url="/WEB-INF/JSP/head.jsp">
  <c:param name="title" value="Welcome"/>
</c:import>

<body>
<c:import url="/WEB-INF/JSP/menu.jsp"></c:import>
<h1>Snacks</h1>
<ul class="zebra">
  <c:forEach var="snack" items="${snacks}">
    <li>${snack.key} ${snack.value.name} ${snack.value.price}
    <c:if test="${snack.value.spicy}">
      ${snack.value.spicy?"Yes":"No"}
    </c:if>
    <spring:url value="/snacks/{id}" var="url">
    <spring:param name="id" value="${snack.value.id}"/>
    </spring:url><a href="${url}">Snack Detail</a>
    </li>
  </c:forEach>
</ul>
</body>
</html>