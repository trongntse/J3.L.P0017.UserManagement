<%-- 
    Document   : cart
    Created on : Jun 19, 2021, 11:30:16 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Promotion_Page</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <script src="https://kit.fontawesome.com/478461b23c.js" crossorigin="anonymous"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script>
            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
            });
        </script>
    </head>
    <body>
        <div class="container-xl">
            <div class="table-responsive">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-12">                              
                                <div class="container">
                                    <a class="navbar-brand" href="adminPage.jsp">ManagerUser</a>
                                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                        <span class="navbar-toggler-icon"></span>
                                    </button>
                                </div>

                                <c:if test="${sessionScope.LOGIN_USER != null}">
                                    <a href="LogoutController" class="btn btn-primary"><i class="fa fa-user-o"></i> <span>Logout</span></a>
                                </c:if>
                            </div>
                        </div>
                    </div>

                    <tag:if test="${sessionScope.CART != null}">
                        <tag:set var="list" value="${sessionScope.CART.getCart().values()}" scope="page"></tag:set>
                        <tag:if test="${not empty pageScope.list}">
                            <table class="table table-striped table-hover">
                                <thead>
                                    <tr>                                   
                                        <th>UserID</th>
                                        <th>UserName</th>
                                        <th>Rank</th>
                                        <th></th>
                                        <th></th>						
                                        <th></th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tag:forEach var="detail" items="${list}">
                                    <form action="UpdateCartController">
                                        <tr> 
                                            <td>
                                                <input class="form-control" style="width: 120px" type="text" name="userID" value="${detail.getUser().userID}" readonly="true"/>
                                            </td>
                                            <td><input style="width: 120px" class="form-control" type="text" name="userName" value="${detail.getUser().userName}" readonly="true"/></td>
                                            <td><input class="form-control" style="width: 90px" type="number"  min="1" max="10" name="rank" value="${detail.rank}" /></td>
                                            <td></td> 
                                            <td></td>
                                            <td> <button class="btn" type="submit"><i class="fas fa-pen-nib"></i></button></td>                                           
                                            <td>
                                                <tag:url var="urlDelete" value="DeleteCartController" scope="page">
                                                    <tag:param name="UserDelete" value="${detail.getUser().userID}"></tag:param>
                                                </tag:url>
                                                <a class="btn" href="${pageScope.urlDelete}" onclick="return confirm('ARE YOU SURE?');"><i class="fas fa-calendar-times"></i></a>
                                            </td>
                                             <td></td>
                                        </tr>
                                    </form>
                                </tag:forEach>
                                </tbody>
                            </table>  

                        </div>
                    </div>
                    <tag:if test="${not empty list}">
                        <form action="SaveListController" method="post">
                            <nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
                                <div class="container">
                                    <script type="text/javascript">
                                        function Alert() {
                                            alert("Save Success");
                                        }
                                    </script>
                                    <input type="submit" onclick="Alert()" value="SAVE TO LIST"/>

                                </div>
                            </nav>
                        </form>
                    </tag:if>


                </div> 

            </tag:if>
        </tag:if>
    </body>
</html>

