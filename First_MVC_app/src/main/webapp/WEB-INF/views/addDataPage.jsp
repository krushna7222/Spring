<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>AddData1 Page</h1>

	<!-- Without EL Expression Language -->
	<%-- <%			
 		int res = (int)request.getAttribute("sum");
 		out.print(res);
	%> --%>
	
	
	
		<!-- With EL Expression Language -->
		<h2>Addition is = ${sum}</h2>
</body>
</html>