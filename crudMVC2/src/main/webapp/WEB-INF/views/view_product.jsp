<%@page import="com.org.crudmodel.Product"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%
    List<Product> products = (List<Product>) request.getAttribute("productList");
%>
<html>
<head>
    <title>View Products</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h2 class="text-center mb-4">All Products</h2>
    <a href="addpage" class="btn btn-primary mb-3">Add New Product</a>

    <table class="table table-bordered table-hover shadow-sm bg-white">
        <thead class="table-dark">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price (₹)</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <%
            for(Product p : products){
        %>
        <tr>
            <td><%= p.getId() %></td>
            <td><%= p.getName() %></td>
            <td><%= p.getDescription() %></td>
            <td><%= p.getPrice() %></td>
            <td>
                <a href="edit/<%= p.getId() %>" class="btn btn-warning btn-sm">Edit</a>
                <a href="delete/<%= p.getId() %>" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure?')">Delete</a>
            </td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>

</body>
</html>
