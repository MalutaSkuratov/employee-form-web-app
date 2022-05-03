<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee app</title>
</head>
<body>
<h3>Employee form</h3>
<hr>
<form:form action="/showData" method="get" modelAttribute="employee">
    Email: <form:input path="email"/>&nbsp;<form:errors path="email"/><br><br>

    Phone number: <form:input path="phoneNumber"/>&nbsp;<form:errors path="phoneNumber"/><br><br>

    Name: <form:input path="name"/>&nbsp;<form:errors path="name"/><br><br>

    Surname: <form:input path="surname"/>&nbsp;<form:errors path="surname"/><br><br>

    Age: <form:input path="age"/>&nbsp;<form:errors path="age"/><br><br>

    Salary: <form:input path="salary"/>&nbsp;<form:errors path="salary"/><br><br>

    Programming area:
    <form:radiobutton path="programmingArea" value="Services dev" label="Services dev"/>
    <form:radiobutton path="programmingArea" value="Mobile dev" label="Mobile dev"/>
    <form:radiobutton path="programmingArea" value="Game dev" label="Game dev"/>
    <form:errors path="programmingArea"/>
    <br><br>

    Programming languages:
    <form:checkbox path="programmerLanguages" value="Java" label="Java"/>
    <form:checkbox path="programmerLanguages" value="Golang" label="Golang"/>
    <form:checkbox path="programmerLanguages" value="C++" label="C++"/>
    <form:checkbox path="programmerLanguages" value="C#" label="C#"/>
    <form:checkbox path="programmerLanguages" value="Kotlin" label="Kotlin"/>
    <br><br>

    <button type="submit">Submit</button>
</form:form>

</body>
</html>