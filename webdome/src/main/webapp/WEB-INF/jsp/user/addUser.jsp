<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<title>批量添加用户</title>
</head>
<body>

<h3>新增用户信息</h3>
<hr/>

<div ng-app="aa123">
  <p>名字 : <input type="text" ng-model="name"></p>
  <h1>Hello {{name}}</h1>
</div>
<div ng-app="myApp" ng-controller="formCtrl">
  <form name="saveUserForm" id="saveUserForm">
    loginName:<br/>
    <input type="text" ng-model="user.loginName"><br/>
    password:<br/>
    <input type="text" ng-model="user.password">
    <br/>
    rank:<br/>
    <input type="text" ng-model="user.rank">
    <br/>
    address:
     <input type="text" ng-model="user.rank">
    <br/>
    <button ng-click="reset()">RESET</button>
  </form>
  <p>form = {{user }}</p>
  <p>master = {{master}}</p>
  
  <p>
            <label>
                <span>所属题库：</span>
                <select ng-model="modelone" ng-options="val.id as val.name for val in cascading" ng-change="changeone(modelone)">
                    <option value="">--请选择--</option>
                </select>
            </label>
            <label>
                <select name="" ng-model="modeltwo" ng-options="val.id as val.name for val in cascadingtwo">
                    <option value="">--请选择--</option>
                </select>
            </label>
 </p>
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


app.controller('addmultiple_scontroller', function($scope, $http) {
    //常量
    $scope.postCfg = postCfg;
    $scope.modelone = "";
    $scope.modeltwo = "";
    $http.post("/address/listProvince.html").success(function(res) {
        $scope.cascading = res;
    });
    
/*     $scope.changeone = function(val) {
        if(null != val){
            $http.post("./getAllExamClassifyByEnid.action",{
                "en_id": val
                },$scope.postCfg).success(function(res) {
                $scope.cascadingtwo = res;
            });
        }
    } */
});
</script>

</body>
</html>