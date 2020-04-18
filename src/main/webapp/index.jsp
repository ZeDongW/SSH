<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
    <form action="save" method="post">
        姓名:<input type="text" name="userName"/>
        年龄:<input type="text" name="age"/>
        <input type="submit" value="提交"/>
    </form>
</html>
