

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>History_Page</title>
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
                            <div class="container">
                                <a class="navbar-brand" href="adminPage.jsp">MANAGER_USER</a>
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                    <span class="navbar-toggler-icon"></span>
                                </button>
                            </div>
                            <div class="col-sm-4">
                                <c:if test="${not empty sessionScope.LOGIN_USER.userName}">
                                    <h2>WELLCOME ADMIN: </b>${sessionScope.LOGIN_USER.getUserName()}</h2>
                                </c:if>
                            </div>
                            <div class="col-sm-8">						
                                <c:if test="${sessionScope.LOGIN_USER != null}">
                                    <a href="LogoutController" class="btn btn-primary"><i class="fa fa-user-o"></i> <span>Logout</span></a>
                                </c:if>
                            </div>

                        </div>
                    </div>                 
                    <tag:if test="${sessionScope.LIST_HISTORY != null}">
                        <tag:set var="list" value="${sessionScope.LIST_HISTORY}" scope="page"></tag:set>
                        <tag:if test="${not empty list}">
                            <table class="table table-striped table-hover">
                                <thead>
                                    <tr>                                   

                                        <th>User ID</th>
                                        <th></th>
                                        <th>Assignment Date</th>    
                                        <th></th>
                                        <th>Rank</th>						
                                         <th></th>                                       
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tag:forEach var="dto" items="${pageScope.list}">
                                        <tr>
                                    <form action="HistoryController">  
                                        <td><input style="width: 120px" class="form-control" type="text" name="userID" value="${dto.userID}" readonly="true"/></td>
                                        <td></td>
                                        <td><input style="width: 120px" class="form-control" type="text" name="promotionID" value="${dto.promotionID}" readonly="true"/></td>                                      
                                        <td></td> 
                                        <td><input style="width: 100px" type="number" name="rank" value="${dto.rank}" readonly="true"></td>                                       
                                        <td></td>
                                        <td>                                           
                                        </td>                                        

                                    </form>
                                    </tr>
                                </tag:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>        
                </div>  
            </tag:if>
            <tag:if test="${ empty list}">
                <h1>No User</h1>
            </tag:if>
        </tag:if>
    </body>
</html>

