
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
            <h1>Loja</h1>
            <form action="Loja">

                <input type="hidden" name="c" value="Inserir" />
                <input type="hidden" name="id" value="" />
                <div class="form-group">
                    <label for="exampleInputEmail1">Endereço</label>
                    <input type="text" name="endereco" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Endereço">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Metro quadrado</label>
                    <input type="text" name="metroQuadrado" class="form-control" id="exampleInputPassword1" placeholder="Metro quadrado">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Preço</label>
                    <input type="text" name="preco" class="form-control" id="exampleInputPassword1" placeholder="Preço">
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
