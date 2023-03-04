<%@page import="com.example.webcalculator.CalculatorServlet" %>
<%--
  Created by IntelliJ IDEA.
  User: dm1try
  Date: 04.03.2023
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h6>Это первая версия калькулятора, она исключительно арифметическая. В последующих версиях будут добавлены новые операции и разделы.</h6>

<form method="post" action="calculator">
    <input type="number" name="NumberOne" placeholder="Первое число:">
    <br>
    <input type="number" name="NumberTwo" placeholder="Второе число:">
    <br>
    <fieldset>
        <legend>Выберите операцию:</legend>
        <input type="radio" name="operation" value="+">+</input>
        <input type="radio" name="operation" value="-">-</input>
        <input type="radio" name="operation" value="*">*</input>
        <input type="radio" name="operation" value="/">/</input>
    </fieldset>
    <input type="submit">
</form>
</body>
</html>
