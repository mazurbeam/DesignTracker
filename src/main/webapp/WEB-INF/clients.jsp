<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clients</title>
</head>
<body>
	<h1>Clients Dashboard</h1>
	
	<a href="/">Home</a>
	<div id="new_client">
		<p><form:errors path="client.*"/></p>
		<form:form method="POST" action="/clients/newclient" modelAttribute="client">
			<p>
				<form:label path="firstName">First Name:</form:label>
				<form:input path="firstName"/>
			</p>
			<p>
				<form:label path="lastName">Last Name:</form:label>
				<form:input path="lastName"/>
			</p>
        		<p>
				<form:label path="email">Email:</form:label>
				<form:input path="email"/>
			</p>
			<p>
				<form:label path="phone">Phone:</form:label>
				<form:input path="phone"/>
			</p>
        		<p>
        			<input type="submit" value="Add Client"/>
        		</p>
	</form:form>
	</div>
	
	<div id="client_list">
		<c:forEach items="${clients}" var="client">
			<p>Name: <c:out value="${client.firstName}"/> <c:out value="${client.lastName}"/></p>
		
		</c:forEach>
	</div>
</body>
</html>