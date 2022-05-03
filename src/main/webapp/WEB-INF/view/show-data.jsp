<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee app</title>
</head>
<body>
<h3>Your details</h3><hr>
Email: <b>${employee.email}</b><br>
Phone number: <b>${employee.phoneNumber}</b><br>
Name: <b>${employee.name}</b><br>
Surname: <b>${employee.surname}</b><br>
Age: <b>${employee.age}</b><br>
Salary: <b>${employee.salary}</b><br>
Programming area: <b>${employee.programmingArea}</b><br>
Programming languages:
<b>
    <ul>
        <c:forEach var="lang" items="${employee.programmerLanguages}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
</b>
</body>
</html>