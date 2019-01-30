<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import  url="/WEB-INF/JSP/head.jsp">
  <c:param name="title" value="Snack"/>
</c:import>

<body>
  <c:import url="/WEB-INF/JSP/menu.jsp"/>
  
  <c:if test="${empty snack }">
    <h1>Snack not found</h1>
  </c:if>
  <c:if test="${not empty snack }">
    <h1>${snack.name}</h1>
    <dl>
      <dt>Number</dt>
      <dd>${snack.id}</dd>
      <dt>Name</dt>
      <dd>${snack.name}</dd>
      <dt>Price</dt>
      <dd>${snack.price}</dd>
      <dt>Spicy</dt>
      <dd>${snack.spicy?"Yes":"No"}</dd>
    </dl>
  </c:if>
</body>
</html>