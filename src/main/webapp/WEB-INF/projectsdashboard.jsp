<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projects Dashboard</title>
</head>
<body>
	<h1>Projects Dashboard</h1>
	
	<div id="current_projects">
		<c:forEach items="${projects}" var="project">
			<p>Title: <c:out value="${project.title}"/></p>
			<p>Client: <c:out value="${project.client.firstName}"/></p>
		</c:forEach>
	</div>
	
	<div id="new_project">
		<p><form:errors path="project.*"/></p>
		<form:form method="POST" action="/projects/newProject/" modelAttribute="project">
			<p>
				<form:label path="title">Title:</form:label>
				<form:input path="title"/>
			</p>
        		<p>
        			<form:label path="client">Client:
        			<form:select path="client" items="${clients}" itemValue="id" itemLabel="firstName">
        			</form:select></form:label>
        		</p>
        		<p>
        			<input type="submit" value="Add Project"/>
        		</p>
	</form:form>
	</div>
</body>
</html>