<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.model.Logica"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% 
		
		Logica game = (Logica) session.getAttribute("game");
		
		if ( game == null ){
			game = new Logica();
			session.setAttribute("game", game);
		}
		
	%>

	Otimo = <%= game.getOtimo() %>
	Bom = <%= game.getBom() %>
	Ruim = <%= game.getRuim() %>
	<p>Digite seu palpite com numeros entre 0 e 9</p>
	<form method="post" action="Controle">
		<input type="text" name="n1" size="1" />
		<input type="text" name="n2" size="1" />
		<input type="text" name="n3" size="1" />
		<input type="text" name="n4" size="1" />
		<input type="submit" value="Enviar" />
	</form>
	
	<!-- Teste de caixa preta -->
	<!--
		Segredo = <%= game.getSegredo(0) %>, <%= game.getSegredo(1) %>, <%= game.getSegredo(2) %>, <%= game.getSegredo(3) %>
	-->
</body>
</html>