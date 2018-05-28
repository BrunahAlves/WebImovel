<%-- 
    Document   : Listar
    Created on : 27/05/2018, 11:54:40
    Author     : Alisson
--%>

<%@page import="Models.Storage.FakeStorage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../_shared/Header.jsp" %>
    </head>
    <body>
        <%@include file="../_shared/MenuHeader.jsp" %>
        <div style="margin: 20px auto; width: 800px">
            <h1>Kitnets</h1>
            <div>
                <a href="Kitnet?c=Cadastrar"> 
                    <button type="button" class="btn btn-success">Adicionar</button>
                </a>
            </div>
            <br />
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Endereco</th>
                        <th scope="col">Andar</th>
                        <th scope="col">Preço</th>
                        <th scope="col">Preço - Imposto</th>
                        <th scope="col">Seguro</th>
                        <th scope="col">Status</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Models.Kitnet u : FakeStorage.Kitnet.List) {%>
                    <tr>
                        <th scope="row"><%=u.getId()%></th>
                        <td><%=u.getEndereco()%></td>
                        <td><%=u.getAndar()%></td>
                        <td><%=u.getPreco()%></td>
                        <td><%=u.getPrecoImposto()%></td>
                        <td><%=u.getSeguro().getPrioridade()%></td>
                        <td><%=u.getStatus()%></td>
                        <td><a href="Apartamento?c=Detalhar&Id=<%=u.getId()%>">Editar</a> | <a href="Apartamento?c=Remover&Id=<%=u.getId()%>">Remover</a> </td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
