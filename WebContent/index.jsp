<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hahahah</title>
<script type="text/javascript" src="script/DataTables-1.10.7/media/js/jquery.js"></script>
<link rel="stylesheet" type="text/css" href="script/DataTables-1.10.7/media/css/jquery.dataTables.css">
<script type="text/javascript" src="script/DataTables-1.10.7/media/js/jquery.dataTables.js"></script>
</head>
<body>
	<table id="myTable1">
		<thead>
			<tr>
				<th>第一列</th>
				<th>第二列</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
	<hr>
	<table id="myTable2">
		<thead>
			<tr>
				<th>第一列</th>
				<th>第二列</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
	<hr>
	<table id="myTable3">
		<thead>
			<tr>
				<th>第一列</th>
				<th>第二列</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
	<hr>
	<table id="myTable4">
		<thead>
			<tr>
				<th>第一列</th>
				<th>第二列</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
	<hr>
	<table id="myTable5">
		<thead>
			<tr>
				<th>第一列</th>
				<th>第二列</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
	<hr>
	<table id="myTable6">
		<thead>
			<tr>
				<th>第一列</th>
				<th>第二列</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
	<hr>
	<script type="text/javascript">
var data1 = [["张三",12],["李四",23]];
var data2 = [{name:"张三",age:"12"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"},
             {name:"李四",age:"23"}
             ];
 $(document).ready(function(){
    var table1 = $('#myTable1').DataTable({
    	data:data1
    });
    
   var table2 = $('#myTable2').DataTable({
    	data:data2,
    	columns:[
    	         {data:"name"},
    	         {data:"age"}
    	         ],
        scrollY: 40 
    });
   var node = table2.row.add({name:"王武",age:34}).draw().node();
   $(node).css("color","red");
   
    var table3 = $('#myTable3').DataTable({
    	ajax:"array.txt"
    });
    var table4 = $('#myTable4').DataTable({
    	ajax:{"url":"plain.txt", "dataSrc":""}
     	 
    });
    var table5 = $('#myTable5').DataTable({
    	ajax:{"url":"json.txt" },
    	columns:[
    	         {data:"name"},
    	         {data:"age"}
    	         ]
     	 
    });
    var table6 = $('#myTable6').DataTable({
    	ajax:{"url":"json.txt",
    		"dataSrc":function(json){
    			for(var i=0;i<json.data.length;i++){
    				var temp = json.data[i].name;
    				json.data[i].name = json.data[i].age;
    				json.data[i].age = temp;
    			}
    			return json.data;
    		},
    		 "data": function ( d ) {
    		        d.extra_search = $('#extra').val();
    		    }
    		},
    	columns:[
    	         {data:"name"},
    	         {data:"age"}
    	         ]
     	 
    });
});

</script>
</body>
</html>