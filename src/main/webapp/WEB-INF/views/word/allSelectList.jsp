<%@page import="VO.WordVO"%>
<%@page import="java.util.List"%>
<%@page import="com.google.gson.Gson"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	Gson gson = new Gson();	
	String json = gson.toJson((List<WordVO>)request.getAttribute("wlist"));
	out.println(json);


%>