<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/WEB-INF/JSP/head.jsp">
  <c:param name="title" value="index"/>
</c:import>

<body>
<c:import url="/WEB-INF/JSP/menu.jsp"></c:import>
  <h1>SnackWorld</h1>
    
    <img src='images/snack.jpg' alt='snack' class='fullwidth'>
    <h2>${greeting} ${message}</h2>
    <h2>The Manager</h2>
    <dl>
        <dt>Name:</dt>
        <dd>${manager.firstName} ${manager.lastName}</dd>
        
        <dt>Number of Children: </dt>
        <dd>${manager.numberOfChildren}</dd>
        
        <dt>Married:</dt>
        <dd>${manager.married?'Yes':'No'}</dd>
        
        <dt>Address:</dt>
        <dd>${manager.address.number}</dd>
        <dd>${manager.address.street}</dd>
        <dd>${manager.address.city}</dd>
        <dd>${manager.address.postalCode}</dd>
    </dl>
    <c:if test="${not empty lastVisited}">
      <p>The last time you visited this website was: ${lastVisited}</p>
    </c:if>
    <dt>Address</dt>
    <dd>${manager.address.number} ${manager.address.street}<br>${manager.address.city}</dd>
    
</body>
</html>