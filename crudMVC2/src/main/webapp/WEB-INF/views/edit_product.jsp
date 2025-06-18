<%@page import="com.org.crudmodel.Product"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Product product = (Product) request.getAttribute("product");
%>
<html>
<head>
    <title>Edit Product</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h2 class="text-center mb-4">Edit Product</h2>
    <form action="/updateProduct" method="post" class="card p-4 shadow-sm">
        <input type="hidden" name="id" value="<%= product.getId() %>">
        <div class="mb-3">
            <label class="form-label">Product Name</label>
            <input type="text" name="name" class="form-control" value="<%= product.getName() %>" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Description</label>
            <textarea name="description" class="form-control" rows="3" required><%= product.getDescription() %></textarea>
        </div>
        <div class="mb-3">
            <label class="form-label">Price</label>
            <input type="number" step="0.01" name="price" class="form-control" value="<%= product.getPrice() %>" required>
        </div>
        <button type="submit" class="btn btn-success">Update Product</button>
        <a href="viewpage" class="btn btn-secondary">Cancel</a>
    </form>
</div>

</body>
</html>
