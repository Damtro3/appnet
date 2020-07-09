<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.net.appnet.*" %>

<html>
    <head><title></title></head>
    <body>

<strong>System Time&nbsp;:&nbsp;&nbsp;</strong>
       <h1><%= new java.util.Date()%></h1>

       <%
       test t = new test();
       t.settest();
      String t2= t.gettest();
       out.println(t2);
       %>




<strong>Server Time&nbsp;:&nbsp;&nbsp;</strong><label id="timelable"></label>
<script type="text/javascript">
        var myVar = setInterval(function(){ myTimer() }, 1000);
        var jsVar=  <%=java.util.Calendar.getInstance().getTimeInMillis()%>;
        var timeZoneOffset=<%=java.util.TimeZone.getDefault().getOffset(System.currentTimeMillis())%>;

        jsVar=jsVar+timeZoneOffset;
        function myTimer() {
        jsVar=jsVar+1000;
        var d = new Date(jsVar);
        var t=d.toUTCString();
    document.getElementById("timelable").innerHTML = t;
}

        </script>

    </body>
</html>