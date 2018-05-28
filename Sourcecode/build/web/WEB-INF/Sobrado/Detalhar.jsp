
<%@page import="Models.Storage.FakeStorage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Models.Sobrado model = ((Models.Sobrado)request.getAttribute("Model")); %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../_shared/Header.jsp" %>
    </head>
    <body>
        <%@include file="../_shared/MenuHeader.jsp" %>
        <div style="margin: 20px auto; width: 800px">
            <h1>Sobrado</h1>
            <form action="Sobrado">

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
                    <label for="exampleInputPassword1">Quantidade de Garagem</label>
                    <input type="text" name="numGaragem"  value="<%=model.getNumGaragem()%>" class="form-control" id="exampleInputPassword1" placeholder="Quantidade de Garagem">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Quantidade de Quarto</label>
                    <input type="text" name="numQuarto"  value="<%=model.getNumQuartos()%>" class="form-control" id="exampleInputPassword1" placeholder="Quantidade de Quarto">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Qauntidade de Banheiro</label>
                    <input type="text" name="numBanheiro" value="<%=model.getNumBanheiros()%>" class="form-control" id="exampleInputPassword1" placeholder="Quantidade de Banheiro">
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
