<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 27.05.20
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style type="text/css">
    html, #page {
        padding: 0;
        margin: 0;
    }

    body {
        margin: 0;
        padding: 0;
        width: 100%;
        color: #959595;
        font: normal 12px/2.0em Sans-Serif;
    }

    h1, h2, h3, h4, h5, h6 {
        color: darkblue;
    }

    #page {
        background: #eee;
    }

    #header, #top-nav {
        font-size: 16px;
        margin: 0;
        padding: 0;
    }

    /* Header */
    #header {
        background: #eee;
    }

    #header-inner {
        margin: 0 auto;
        padding: 10px;
        width: 970px;
        background: #fff;
        font-size: 11pt;
    }

    #footer {
        margin: 0;
        padding: 0;
    }

    /* Footer */
    #footer {
        background: #eee;
    }

    #footer-inner {
        margin: auto;
        text-align: center;
        padding: 12px;
        width: 970px;
    }

    #footer a {
        color: blue;
        text-decoration: none;
    }

    #content, #content #contentbar, #content #sidebar {
        margin: 0;
        padding: 0;
    }

    /* lux */
    #lux {
        padding: 10px;
        width: auto;
        float: left;
    }

    #lux h1 a, h1 a:hover {
        color: darkblue;
        text-decoration: none;
    }

    #lux h1 span {
        color: #0000FF;
    }

    /* Feature */
    .feature {
        background: #eee;
        padding: 0;
    }

    .feature-inner {
        margin: auto;
        padding: 8px;
        width: 970px;
        background: royalblue;
    }

    .feature-inner h1 {
        color: white;
        font-size: 32px;
    }

    /* Menu */
    #top-nav {
        margin: 0 auto;
        padding: 0px 0 0;
        height: 37px;
        float: right;
    }

    #top-nav ul {
        list-style: none;
        padding: 0;
        height: 37px;
        float: left;
    }

    #top-nav ul li {
        margin: 0;
        padding: 0 0 0 8px;
        float: left;
    }

    #top-nav ul li a {
        display: block;
        margin: 0;
        padding: 8px 20px;
        color: royalblue;
        text-decoration: none;
    }

    #top-nav ul li.active a, #top-nav ul li a:hover {
        color: #d3d3f9;
    }

    /* Content */
    #content-inner {
        margin: 0 auto;
        padding: 10px;
        width: 970px;
        background: #fff;
    }

    #content #contentbar {
        margin: 0;
        padding: 0;
        float: right;
        width: 760px;
    }

    #content #contentbar .article {
        margin: 0 0 24px;
        padding: 0 20px 0 15px;
    }

    #content #sidebar {
        padding: 0;
        float: left;
        width: 200px;
    }

    #content #sidebar .widget {
        margin: 0 0 12px;
        padding: 8px 8px 8px 13px;
        line-height: 1.4em;
    }

    #content #sidebar .widget h3 a {
        text-decoration: none;
    }

    #content #sidebar .widget ul {
        margin: 0;
        padding: 0;
        list-style: none;
        color: #959595;
    }

    #content #sidebar .widget ul li {
        margin: 0;
    }

    #content #sidebar .widget ul li {
        padding: 4px 0;
        width: 185px;
    }

    #content #sidebar .widget ul li a {
        color: royalblue;
        text-decoration: none;
        margin-left: -16px;
        padding: 4px 8px 4px 16px;
    }

    #content #sidebar .widget ul li a:hover {
        color: #d3d3f9;
        font-weight: bold;
        text-decoration: none;
    }

    /* Clear both sides to assist with div alignment  */
    .clr {
        clear: both;
        padding: 0;
        margin: 0;
        width: 100%;
        font-size: 0px;
        line-height: 0px;
    }

    /* Bordered form */
    form {
        border: 3px solid #f1f1f1;
        font-size: 20px;
    }

    /* Full-width inputs */
    input[type=login], input[type=email], input[type=password], input[type=text] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    /* Set a style for all buttons */
    button {
        background-color: royalblue;
        font-size: 20px;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }

    /* Add a hover effect for buttons */
    button:hover {
        opacity: 0.8;
    }


    /* Center the avatar image inside this container */
    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }

    /* Avatar image */
    img.avatar {
        width: 40%;
        border-radius: 50%;
    }

    /* Add padding to containers */
    .container {
        padding: 16px;
    }

    /* Style inputs with type="text", select elements and textareas */
    input[type=text], select, textarea {
        width: 100%; /* Full width */
        padding: 12px; /* Some padding */
        border: 1px solid #ccc; /* Gray border */
        border-radius: 4px; /* Rounded borders */
        box-sizing: border-box; /* Make sure that padding and width stays in place */
        margin-top: 6px; /* Add a top margin */
        margin-bottom: 16px; /* Bottom margin */
        resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
    }

    /* Style the submit button with a specific background color etc */
    input[type=submit] {
        background-color: #4CAF50;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    /* When moving the mouse over the submit button, add a darker color */
    input[type=submit]:hover {
        background-color: #45a049;
    }

    .column {
        float: left;
        width: 33.33%;
        text-decoration-color: black;
        text-align: center;
    }

    /* Clear floats after the columns */
    .row:after {
        content: "";
        display: table;
        clear: both;
    }

    /*Map*/
    #map {
        width: 100%;
        height: 400px;
        background-color: darkgrey;
    }

</style>
