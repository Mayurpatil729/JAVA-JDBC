<%@ page language="java" contentType="text/html; charset=UTF-16"
    pageEncoding="UTF-16"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-16">
<title>Result</title>


</head>


<body>
<img alt="" src="images\joke.gif">
<h1>Joke of the Day!</h1>
<h3>🤣<%=request.getParameter("joke")%> </h3>

<%@include file="index.html" %>

<h1>Ans=<%=request.getParameter("ans")%>🚩</h1>

</body>
</html>