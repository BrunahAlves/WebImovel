/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Storage.FakeStorage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alisson
 */
@WebServlet(name = "ChacaraServlet", urlPatterns = {"/Chacara"})
public class ChacaraServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String c = request.getParameter("c");
        
        RequestDispatcher dispatcher  = null;
        
        if(c.equals("Listar")){
            dispatcher = listar(request, response);
        }else if(c.equals("Cadastrar")){
            dispatcher = cadastrar(request, response);
        }else if(c.equals("Detalhar")){
            dispatcher = detalhar(request, response);
        }else if(c.equals("Inserir")){
            dispatcher = inserir(request, response);
        }else if(c.equals("Remover")){
            dispatcher = remover(request, response);
        }else if(c.equals("Editar")){
            dispatcher = editar(request, response);
        }
        
        if(dispatcher != null)
            dispatcher.forward(request, response);
    }
    
    private RequestDispatcher listar(HttpServletRequest request, HttpServletResponse response){
        return request.getRequestDispatcher("WEB-INF/Chacara/Listar.jsp");
    }
     private RequestDispatcher detalhar(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("Model", getById(Integer.parseInt(request.getParameter("Id"))));
          
        return request.getRequestDispatcher("WEB-INF/Chacara/Detalhar.jsp");
    }
            
    private RequestDispatcher cadastrar(HttpServletRequest request, HttpServletResponse response){
        return request.getRequestDispatcher("WEB-INF/Chacara/Cadastrar.jsp");
    }
    
    private RequestDispatcher inserir(HttpServletRequest request, HttpServletResponse response){
        int metroQuadrado = Integer.parseInt(request.getParameter("metroQuadrado"));
        double preco = Double.parseDouble(request.getParameter("preco"));
        String endereco = request.getParameter("endereco");
           
        
        
        
        //determinar imposto
        Models.ISeguro calculo = new Models.CalculoImposto();
        calculo.setTipoImovel("Chacara");
        calculo.setValorImovel(preco);
        
        
        //instanciar o Imovel
        Models.Chacara imovel = new Models.Chacara(true, metroQuadrado, preco, endereco);
       
        
        //determinar o status do imóvel
        String status = request.getParameter("status");
        imovel.setStatus(status);
        calculo.setStatus(status);
        
        //determinar o preco do imóvel com imposto
        imovel.setPrecoImposto(calculo.calcularImposto());
        
        
        //determinar o seguro e a prioridade de segurança
        Models.Seguro seg = new Models.Seguro ();
        seg.setImovel(imovel);
        seg.setPrioridade(seg.determinarPrioridadeSeguranca(calculo));
        
        //aplicar o seguro no imovel
        imovel.setSeguro(seg);
        
        //adicionar o imovel no FakeStorage
        
        //FakeStorage.Chacara.List.add(new Models.Chacara(true, metroQuadrado, preco, endereco));
        FakeStorage.Chacara.List.add(imovel);
        return listar(request, response);
    }
    
    private RequestDispatcher editar(HttpServletRequest request, HttpServletResponse response){
       int metroQuadrado = Integer.parseInt(request.getParameter("metroQuadrado"));
        double preco = Double.parseDouble(request.getParameter("preco"));
        String endereco = request.getParameter("endereco");
        String id  = request.getParameter("Id");
        Models.Chacara user = getById(Integer.parseInt(id));
        user.setMetroQuadrado(metroQuadrado);
        user.setPreco(preco);
        user.setEndereco(endereco);
        
        
        //recalcular Imposto
        
        Models.ISeguro calculo = new Models.CalculoImposto();
        calculo.setTipoImovel("Chacara");
        calculo.setValorImovel(preco);
        
        //determinar o status do imóvel
        String status = request.getParameter("status");
        user.setStatus(status);
        calculo.setStatus(status);
        
        //determinar o preco do imóvel com imposto
        user.setPrecoImposto(calculo.calcularImposto());
        
        
        //determinar o seguro e a prioridade de segurança
        Models.Seguro seg = new Models.Seguro ();
        seg.setImovel(user);
        seg.setPrioridade(seg.determinarPrioridadeSeguranca(calculo));
        
        //aplicar o seguro no imovel
        user.setSeguro(seg);
        

        return listar(request, response);
    }
    
    
    private RequestDispatcher remover(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("Id"));
        FakeStorage.Chacara.List.remove(getById(id));
        return listar(request, response);
    }
    
    private Models.Chacara getById(int id){
        Models.Chacara user = null;
        for(Models.Chacara u : FakeStorage.Chacara.List){
            if(u.getId() == id){
                user = u;
                break;
            }
        }
        return user;
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
