package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collections.app.Person;
import collections.app.PersonApp;

@WebServlet("/demo")
public class FormServlet extends HttpServlet{

	@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	String pid=req.getParameter("id");
	int id=Integer.parseInt(pid);
	String name=req.getParameter("name");
	String city=req.getParameter("city");
	Person p=new Person(id,name,city);
	PersonApp app=new PersonApp();
	String response=app.addPerson(p);
	out.write("<h1>"+response+"</h1>");
}
}
