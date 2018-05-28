
<%@page import="Models.Storage.FakeStorage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Models.Terreno model = ((Models.Terreno)request.getAttribute("Model")); %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../_shared/Header.jsp" %>
    </head>
    <body>
        <%@include file="../_shared/MenuHeader.jsp" %>
        <div style="margin: 20px auto; width: 800px">
            <h1>Terreno</h1>
            <form action="Terreno">

                <input type="hidden" name="c" value="Editar" />
                <input type="hidden" name="Id" value="<%=model.getId()%>" />
                <div class="form-group">
                    <label for="exampleInputEmail1">Endereço</label>
                    <input type="text" name="endereco" value="<%=model.getEndereco()%>" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Endereço">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Metro quadrado</label>
                    <input type="text" name="metroQuadrado" value="<%=model.getMetroQuadrado()%>" class="form-control" id="exampleInputPassword1" placeholder="Metro quadrado">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Preço</label>
                    <input type="text" name="preco"  value="<%=model.getPreco()%>" class="form-control" id="exampleInputPassword1" placeholder="Preço">
                </div>
                
                
                
                <div class="form-group">
                Status
                <select name="status">
                <option>Novo</option>
                <option>Usado</option>
                <option>Em construcao</option>
                </select>
                </div>
                
                
                
                <button type="submit" class="btn btn-primary">Salvar</button>
            </form>
        </div>
    </body>
</html>
