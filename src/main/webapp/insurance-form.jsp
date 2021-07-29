<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@ include file="head.jspf" %>
<body>
<form method="post">
    <div class="mb-3">
        <input type="text" name="firstName" placeholder="First Name" required>
    </div>
    <div class="mb-3">
        <input type="text" name="lastName" placeholder="Last Name" required>
    </div>
    <div class="mb-3">
        <input type="date" name="birthDate" required>
    </div>
    <div class="mb-3">
        <select name="Insurance Type" class="form-control mb-3">
            <c:forEach var="insuranceType" items="${insuranceTypes}">
                <option value="${insuranceType}">${insuranceType.getFullName()}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <input type="number" name="amount" placeholder="Insurance Amount" required>
    </div>
</form>
</body>
</html>
