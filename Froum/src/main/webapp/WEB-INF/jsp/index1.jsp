<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<link href="../css/invitation.css" type="text/css">
<body>
<div id="div">
    <table border="2">
        <thead>
        <tr>
            <th colspan="6">帖子列表</th>
        </tr>
        <tr>
            <td>编号</td>
            <td>标题</td>
            <td>内容摘要</td>
            <td>作者</td>
            <td>发布时间</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody id="list-content">
        <%--<c:forEach items="${invitationList}" var="inv">
                   <tr>
                     <td >${inv.id}</td>
                     <td>${inv.title}</td>
                     <td>${inv.summary}</td>
                       <td>${inv.author}</td>
                       <td>${inv.createdate}</td>
                     <td>
                         <a href="#">查看回复</a>||
                         <a href="#">删除</a>
                         </td>
                   </tr>
                       </c:forEach>--%>
        </tbody>
    </table>
</div>
<script type="text/javascript" src="assets/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    load(0);  //默认初始化
    /*点击查询的触发事件*/
    function  load(pageNum){
        $.ajax({
            url: "/invitation/findAll",  //需要提交的服务器地址
            type: "post",  //请求的方式
            data: {"pageNum": pageNum,"title":$("[name='title']").val()},  //传递给服务器的参数
            /*contentType: "application/x-www-form-urlencoded; charset=utf-8",*/
            /* scriptCharset: "UTF-8", */
            success:function(data){  //回调函数
                var data=$.parseJSON(data);
                //清空数据
                /*$("#list-content").html('');*/
                //追加数据  data.list需要遍历的集合  list必须是pageInfo中的属性名
                $.each(data,function(i,inv){
                    //一个dom就是一个用户对象
                    $("#list-content").append("<tr><td >"
                        +inv.id+"</td><td>"+inv.title+"</td><td>"+inv.summary+"</td><td>"+inv.author+"</td><td>"+inv.createdate+"</td><td><a href=\"#\">查看回复</a>||<a href=\"#\">删除</a></td></tr>"
                    );});

                //渲染分页  总记录数  当前页码  每页数据量
                /*$('#pagination').pagination(data.total,{
                    current_page:pageNum,//当前第几页
                    items_per_page: data.pageSize,
                    callback: load,  //回调函数
                    num_edge_entries: 2,
                    load_first_page: true,
                    prev_show_always:false,
                    next_show_always:false,
                    prevCls:'prev',		//上一页class
                    nextCls:'next',		//下一页class
                    prev_text: '上一页',
                    next_text: '下一页'
                });*/
            }
        });
    };
</script>
</body>
</html>