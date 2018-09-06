<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<title>新增用户</title>
</head>
<body>

<h3>新增用户信息</h3>
<hr/>
<div ng-app="my1" ng-controller="myForm">
<form  name="myForm" >
     输入你的名字:
    <input name="myAddress" ng-model="text" required>
    <span ng-show="myForm.myAddress.$error.email">不是一个合法的邮箱地址</span>
     <p>form = {{text }}</p>
</form>
</div>

<div ng-app="aa123">
  <p>名字 : <input type="text" ng-model="name"></p>
  <h1>Hello {{name}}</h1>
</div>
<div ng-app="myApp" ng-controller="formCtrl">
  <form novalidate>
    First Name:<br/>
    <input type="text" ng-model="user.firstName"><br>
    Last Name:<br/>
    <input type="text" ng-model="user.lastName">
    <br/><br/>
    <button ng-click="reset()">RESET</button>
  </form>
  <p>form = {{user }}</p>
  <p>master = {{master}}</p>
</div>

<script>
var app = angular.module('myApp', []);
app.controller('formCtrl', function($scope) {
    $scope.master = {firstName:"John3434", lastName:"Doe222"};
    $scope.reset = function() {
        $scope.user = angular.copy($scope.master);
    };
    $scope.reset();
});
</script>

</body>
</html>