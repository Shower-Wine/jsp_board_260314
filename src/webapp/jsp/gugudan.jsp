<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
int dan = Integer.parseInt(request.getParameter("dan"));
int limit = Integer.parseInt(request.getParameter("limit"));

String name = "샤워";
int age = 10;
%>

<h1><%=dan%>단</h1>
<% for(int i = 1; i <= limit; i++) { %>
<div><%=dan%> * <%=i%> = <%=dan * i%></div>
<% } %>


<!-- 테스트 -->
<%
if(age >= 20) {
%>
<div>성인</div>
<%
} else {
%>
<div>미성년</div>
<%
}
%>

<h1>
    <%
    out.println(age + "살");
    %>
</h1>

<h1>
    <%=age%>살
</h1>