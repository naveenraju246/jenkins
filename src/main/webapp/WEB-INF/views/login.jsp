<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="user" action="login" method="post">
				<fieldset>
					<legend>Enter Credentials</legend>
					<p>
						<form:label for="userid" path="userid" cssErrorClass="error">User Id</form:label>
						<br />
						<form:input path="userid" />
						<form:errors path="userid" />
					</p>
					<p>
						<form:label for="password" path="password" cssErrorClass="error">Password</form:label>
						<br />
						<form:input path="password" />
						<form:errors path="password" />
					</p>
					<p>
					<form:select path="country" items="${countryList}"></form:select>
					</p>
					<p>
						<input type="submit" />
					</p>
			</fieldset>
</form:form>
</body>
</html>