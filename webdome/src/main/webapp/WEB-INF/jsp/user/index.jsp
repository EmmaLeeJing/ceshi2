<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User-list</title>
<script src="https://cdn.bootcss.com/angular.js/1.6.3/angular.min.js"></script>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


<div ng-app="myApp" ng-controller="customersCtrl"> 

<table class="table table-hover">
<caption>--用户列表--</caption>
  <tr><th>编号</th><th>用户登录名称</th><th>用户登录密码</th><th>状态</th><th>操作</th></tr>
  <tr ng-repeat="x in names">
   <td>{{ $index + 1 }}</td>
    <td>{{ x.loginName }}</td>
    <td>{{ x.password }}</td>
    <td>{{ x.useFlag }}</td>
    <td><button class="btn" data-toggle="modal" data-target="#myModal">修改</button>
        <button class="btn" data-toggle="modal">禁用</button>
        <button class="btn" data-toggle="modal">启用</button></td>
  </tr>
</table>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					模态框（Modal）标题
				</h4>
			</div>
			<div class="modal-body">
				在这里添加一些文本
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary">
					提交更改
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>
<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.get("/user/listUser.shtml")
    .then(function (result) {
        $scope.names = result.data.result;
    });
});
$(function (){
    $("[data-toggle='popover']").popover();
});
</script>

</body>
</html>