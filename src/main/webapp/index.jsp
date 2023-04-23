<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/login.css" />
    <link rel="icon" href="favicon.ico">
    <title>登录</title>
</head>
<body>
<div class="eight">
    <div class="two">
        <div class="one">
            <h2 class="text-gradient" data-text="欢迎登录学生管理系统">欢迎登录学生管理系统</h2>
            <div class="six">还没有账号？<a href="pages/developingpage.jsp">立即申请</a></div>
            <form action="CheckUserServlet" method="post" style="margin: 20px;">
                <div>
                    <span><label for>姓名：</label></span><input type="text" name="name" id="1" required />
                </div>
                <div class="second">
                    <span>密码：</span><input type="password" name="password" id="3" required />
                </div>
        </div>
        <div class="seven">&emsp; &emsp; &emsp; &emsp; &emsp;<label><input type="checkbox" name="ok" id="first" checked>
            记住我的登录状态</label>
        </div>
        <div class="three">
            &emsp; &emsp;
            <input type="submit" value="登录" onclick="check()" />
            &emsp; &emsp; &emsp; &emsp; &emsp;
            <input type="reset" value="重置" />
        </div>
        <div style="margin: 50px;">
            <div class="five"><a href="pages/developingpage.jsp">其他方式登录</a></div>
            <div class="four"><a href="pages/developingpage.jsp">忘记密码?</a></div>
        </div>
        </form>
    </div>
</div>
</body>
</html>