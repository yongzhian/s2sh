<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>

    <title>struts2</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

</head>

<body>


<s:form action="/sys/user!login.do" method="post">
    <s:label value="系统登陆"></s:label>
    <s:textfield name="username" label="账号"/>
    <s:password name="password" label="密码"/>
    <s:submit value="登录"/>
</s:form>
<a href="<%=path%>/sys/json/user!getUserInfo.do?username=frank">1查看用户信息(json路径带!)</a><br>
<a href="<%=path%>/sys/json/usergetUserInfo.do?username=frank">2查看用户信息(json)</a><br>
<a href="<%=path%>/sys/role/sysrole!list.do">角色列表</a><br>
</body>
</html>