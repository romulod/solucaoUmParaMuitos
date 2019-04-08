<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<!--  Entrada, view -->
<!-- antigamente validava js (antigo, dom, jquery, bootsrap) -->

<!--hoje em dia é javascript que é  ecma 6 ou 5 -->
<body>
<h2>Solução Um Cliente Para Muitos</h2>
<br/>
<form method="post" action="Controller">
	<br/>Nome<br/>
	<input type="text" name="nome" id="nome" value="" size="50"/>
	<br/>Email<br/>
	<input type="text" name="email" id="email" value="" size="50"/>
	<br/>Produto:<br/>
	<input type="text" name="produto" id="produto" value="" size="50"/>
	<br/>Preço:<br/>
	<input type="number" step="0.1" name="preco" id="preco" value="" size="20"/>
	<br/><br/>
	<button type="submit">Enviar os Dados</button>
	
</form>	
</body>
</html>