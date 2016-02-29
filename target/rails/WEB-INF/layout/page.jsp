<%-- 
    Document   : page
    Created on : Feb 25, 2016, 9:01:38 AM
    Author     : pawel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t1" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="t2" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <style>
        
        
        *{
            margin:0px;
            padding:0px;
        }
        html{
            background-color:black;
        }
        #header{
            height:70px;
            color:orange;
            background:yellow;
            display:block;
            padding-left:15%;
            padding-right:15%;
        }
        #navbar{
            height:30px;
            width:100%;
            text-align:center;
            background:black;
            color:#020202;
            text-transform: capitalize;
            font-size:17px;
        }
        #navbar li{
            list-style: none;
            vertical-align: bottom;
            display: inline-block;
            padding-left:1%;
            padding-right:1%;
            padding-top:4px;
            color:#020202;
        }
        #navbar a:link{
            color:silver;
            text-decoration: none;
            
        }
        #navbar a:visited{
            color:silver;
            text-decoration:none;
        }
        #navbar a:hover{
            color:yellow;
            font-weight:bold;
        }
        #navbar a:active{
            color:yellow;
            font-weight:bold;
        }
        #body{
            padding-left:15%;
            padding-right:15%;
            min-height:640px;
            background-color:white;
        }
        
        #footer{
            height:50px;
            background-color:black;
            
            text-align: right;
            padding-left:15%;
            padding-right:15%;
        }
    </style>
    <body id="main_body">
        <div id="header">
            <t1:insertAttribute name="header" />
        </div>
        <div id="navbar">
            <t1:insertAttribute name="navbar" />
        </div>
        <div id="body">
            <t1:insertAttribute name="body" />
        </div>
        <div id="footer">
            <t1:insertAttribute name="footer" />
        </div>
    </body>
</html>
