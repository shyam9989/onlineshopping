<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <title>Online Shopping - ${title }</title>
    <script type="text/javascript">
        window.menu = '${title }';
        window.contextRoot = '${contextRoot}'
    </script>
    <!-- Bootstrap core CSS -->

    <link href="${contextRoot }/static/css/bootstrap.min.css"
          rel="stylesheet">

    <!-- Bootstrap Readable Theme -->
    <link href="${contextRoot }/static/css/bootstrap-readable-theme.css"
          rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${contextRoot }/static/css/myapp.css" rel="stylesheet">
</head>
<body>
<%@include file="share/navbar.jsp" %>

</body>
</html>