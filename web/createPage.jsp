<%-- 
    Document   : create
    Created on : Jun 17, 2021, 6:39:48 PM
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!DOCTYPE html>

<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Fonts -->
        <link rel="dns-prefetch" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600" rel="stylesheet" type="text/css">



        <link rel="icon" href="Favicon.png">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

        <title>Create_User</title>
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
            <div class="container">
                <a class="navbar-brand" href="adminPage.jsp">Manager_User</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
        </nav>

        <main class="my-form">
            <div class="cotainer">
                <div class="row justify-content-center">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="card-header">Create_User</div>
                            <div class="card-body">
                                <form name="my-form" action="CreateUserController" method="post">
                                    <div class="form-group row">
                                        <label for="userID" class="col-md-4 col-form-label text-md-right">User ID</label>
                                        <div class="col-md-6">
                                            <input type="text" value="${param.userID}" class="form-control" name="txtUserID" required="true">
                                        </div>
                                        <c:if test="${requestScope.ERROR_USER !=null}">
                                            <script>alert("${requestScope.ERROR_USER}")</script>
                                        </c:if>
                                    </div>

                                    <div class="form-group row">
                                        <label for="user_name" class="col-md-4 col-form-label text-md-right">User Name</label>
                                        <div class="col-md-6">
                                            <input type="text" value="${param.userName}" class="form-control" name="txtUserName" required="true">
                                        </div>
                                    </div>


                                    <div class="form-group row">
                                        <label for="password" class="col-md-4 col-form-label text-md-right">Password</label>
                                        <div class="col-md-6">
                                            <input type="password" value="${param.password}" class="form-control" name="txtPassword" required="true">
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label for="comfirmPassword" class="col-md-4 col-form-label text-md-right">Confirm Password</label>
                                        <div class="col-md-6">
                                            <input type="password" value="${param.cfPassword}" class="form-control" name="txtCfPassword" required="true">
                                        </div>

                                        <c:if test="${requestScope.ERROR_PASS!=null}">
                                            <script>alert("${requestScope.ERROR_PASS}")</script>
                                        </c:if>
                                    </div>
                                    <div class="form-group row">
                                        <label for="email_address" class="col-md-4 col-form-label text-md-right">E-Mail Address</label>
                                        <div class="col-md-6">
                                            <input type="email" value="${param.email}" class="form-control" name="txtEmail" required="true">
                                        </div>                                       
                                    </div>

                                    <div class="form-group row">
                                        <label for="phone_number" class="col-md-4 col-form-label text-md-right">Phone Number</label>
                                        <div class="col-md-6">
                                            <input type="text" value="${param.phone}" class="form-control" name="txtPhone" required="true">
                                        </div>

                                        <c:if test="${requestScope.ERROR_PHONE!=null}">
                                            <script>alert("${requestScope.ERROR_PHONE}")</script>
                                        </c:if>
                                    </div>

                                    <div class="form-group row">
                                        <label for="photo" class="col-md-4 col-form-label text-md-right">Photo</label>
                                        <div class="col-md-6">
                                            <input type="file" value="" class="form-control" placeholder="Enter Description" name="txtPhoto" required="true">
                                        </div>
                                    </div>                              

                                    <div class="col-md-6 offset-md-4">
                                        <button type="submit" class="btn btn-primary">Create</button>
                                    </div>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </main>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>

