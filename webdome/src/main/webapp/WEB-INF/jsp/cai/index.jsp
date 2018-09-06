<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<body>
<div class="panel panel-default" style="margin: 20px;">
   <div class="panel-body">
		<h2>彩票号展示</h2>
		<br/>
		<hr/>
		<input type="button" value="添加" class="btn" data-toggle="modal" data-target="#myModal"/> <input type="button" value="修改" class="btn"/>
		<br/>
		<table class="table">
			<tr><th >期号</th><th>奖号1</th><th>奖号2</th><th>奖号3</th><th>和值</th></tr>
			<tr><td>20180906001</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906002</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906003</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906004</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906005</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906006</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906007</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906008</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906009</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906010</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906011</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906012</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906013</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906014</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906015</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906016</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906017</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906018</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906019</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906020</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906021</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906022</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906023</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906024</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906025</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906026</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906027</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906028</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906029</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906030</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906031</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906032</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906033</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906034</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906035</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906036</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906037</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906038</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906039</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906040</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906041</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906042</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906043</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906044</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906045</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906046</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906047</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906048</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906049</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906050</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906051</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906052</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906053</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906054</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906055</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906056</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906057</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906058</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906059</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906060</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906061</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906062</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906063</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906064</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906065</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906066</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906067</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906068</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906069</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906070</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906071</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906072</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906073</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906074</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906075</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906076</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906077</td><td>1</td><td>3</td><td>6</td><td>10</td></tr>
			<tr><td>20180906078</td><td>2</td><td>3</td><td>6</td><td>10</td></tr>
		</table>
   </div>
</div>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					添加开奖
				</h4>
			</div>
			<div class="modal-body">
				<span>开奖期号：</span><input type="text" disabled="disabled" value="20180906001"/><br/>
				<span>开奖号码：</span><input type="text" style="width:50px;height:50px;font-size: 18px; font-weight: bold;"/> 
				                     <input type="text" style="width:50px;height:50px;font-size: 18px; font-weight: bold;" /> 
				                     <input type="text" style="width:50px;height:50px;font-size: 18px; font-weight: bold;"/>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary">
					保存
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>
</body>
</html>
