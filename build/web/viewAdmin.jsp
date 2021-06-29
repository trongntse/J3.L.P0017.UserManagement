<%-- 
    Document   : viewAdmin
    Created on : Jun 18, 2021, 2:23:24 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>View_Admin</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="./fonts/fontawesome-free-5.14.0/css/all.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/478461b23c.js" crossorigin="anonymous"></script>
        <script>
            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
            });
        </script>
    </head>
    <body>
        <div class="container">container
            <div class="table-wrapper">
                <div class="table-title">
                     <div class="row">

                        <div class="col-sm-9">		                           
                            <h2> <b>Wellcom Admin: ${LOGIN_USER.userName}</b></h2>
                            <style>
                                #link { color: #FF0000; } 
                            </style>
                            <a id="link" class="dropdown-item" href="LogoutController"><i class="fas fa-sign-out-alt"></i>Logout</a>
                        </div>
                            <style>
                                #links { color: #31B404; } 
                            </style>
                        <a id="links" class="dropdown-item" href="createPage.jsp"><i class="fas fa-folder-plus"></i>CREATE USER</a>
                        <a href="HistoryController" class="btn btn-primary"><i class="fas fa-notes-medical"></i> <span>History</span></a>
                    </div>      
                </div>                           
                <div class="table-filter">                  
                    <div class="container">
                        <div style="width: 300px; margin: 0px auto">
                            <a class="navbar-brand" href="LoadAllUserController">All</a>
                            <a class="navbar-brand" href="LoadAdminController">Admin</a>
                            <a class="navbar-brand" href="LoadSubController">Sub</a>                           
                        </div>
                    </div>          
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>                           
                            <th>UserID</th>
                            <th>UserName</th>
                            <th>Password</th>												
                            <th>Email</th>
                            <th>Phone</th>
                            <th>Photo</th>
                            <th>RoleID</th>
                            <th>Status</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="dto" items="${sessionScope.LIST_ADMIN}" >
                        <form action="UpdateController">
                            <tr>
                                <td>
                                    <input class="form-control" style="width: 80px" type="text" name="txtUserID" value="${dto.userID}" readonly="true"/>
                                </td>
                                <td>
                                    <input class="form-control" style="width: 100px" type="text" name="txtUserName" value="${dto.userName}"/>
                                </td>
                                <td>
                                    <input class="form-control" style="width: 70px" type="password" name="txtPassword" value="${dto.password}" readonly="true"/>                                  
                                </td>

                                <td>
                                    <input class="form-control" style="width: 100px" type="email" name="txtEmail" value="${dto.email}"/>  
                                </td>                               
                                <td>
                                    <input class="form-control" type="text" name="txtPhone" value="${dto.phone}"/>                                     
                                </td>
                                <td>
                                    <input style="width: 90px" type="file" name="txtPhoto" value="${dto.photo}" class="form-control"/>          
                                    <img  src="./images/${dto.photo}" alt="${dto.photo}" width="70px" height="70px" />
                                    <input type="hidden" name="oldPhoto" value="${dto.photo}"/>
                                </td>
                                <td>
                                    <input class="form-control" type="text" name="txtRoleID" value="${dto.roleID}"/>                                      
                                </td>                               
                                <td>
                                    <input class="form-control" type="text" name="txtStatus" value="${dto.status}" readonly="true"/>      

                                </td>   
                                <td>
                                    <c:url 
                                        var="urlDelete" value="DeleteController">
                                        <c:param name="txtUserID" value="${dto.userID}"/>
                                        <c:param name="txtStatus" value="${dto.status}"/>
                                    </c:url>
                                    <c:choose>
                                        <c:when test="${dto.status != false}">
                                            <a href="${urlDelete}" onclick="return confirm('ARE YOU SURE?');" class="delete" title="Delete" data-toggle="tooltip"><i class="fas fa-trash-alt"></i></a>
                                            </c:when>
                                            <c:otherwise>
                                            <a href="${urlDelete}" onclick="return confirm('ARE YOU SURE?');" class="delete" title="Return" data-toggle="tooltip"><i class="fas fa-undo-alt"></i></a>
                                            </c:otherwise>
                                        </c:choose>
                                </td>
                                <td>
                                    <button class="btn" type="submit" title="Update"><i class="fas fa-user-edit"></i></button>
                                </td>
                            </tr>                      
                        </form>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>     
    </body>
</html>               
