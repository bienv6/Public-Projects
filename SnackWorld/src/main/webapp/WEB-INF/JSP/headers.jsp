<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import  url="/WEB-INF/JSP/head.jsp">
  <c:param name="title" value="Headers"/>
</c:import>

<body>
<c:import url="/WEB-INF/JSP/menu.jsp"></c:import>
    <p>This browser is running on 
	    <c:if test="${onWindows}">Windows</c:if> 
	    <c:if test="${not onWindows}">a non-Windows operating system</c:if>
	</p>


</body>
</html>