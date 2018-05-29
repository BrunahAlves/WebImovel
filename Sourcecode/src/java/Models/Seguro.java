/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Guilherme
 */
public class Seguro{
    private Imovel imovel;
    private String prioridade;
    
    public String determinarPrioridadeSeguranca(ISeguro pC){
        String resultado = null;
        double precoComImposto;
        String status = pC.getStatus();
        precoComImposto = pC.calcularImposto();
        
        
        if(status.equals("Novo")){ //1
            if(precoComImposto < 110000){//2
               resultado = ("Segurança - Prioridade baixa");//3
            }
            else if(precoComImposto < 250000){//4
                resultado = ("Segurança - Prioridade media");//5
            }
            else{//6
                resultado = ("Segurança - Prioridade alta");//7
            }
        }
        else if(status.equals("Usado")){//8
            if(precoComImposto < 150000){//9
              resultado = ("Segurança - Prioridade baixa");//10 
            }
            else if(precoComImposto < 270000){//11
              resultado = ("Segurança - Prioridade media");//12  
            }
            else{//13
              resultado = ("Segurança - Prioridade alta");//14  
            }
        }
        else{//15
           if(precoComImposto < 90000){//16
              resultado = ("Segurança - Prioridade baixa");//17 
           }
           else if(precoComImposto < 130000){//18
              resultado = ("Segurança - Prioridade media");//19 
           }
           else{//20
              resultado = ("Segurança - Prioridade alta");//21 
           }
        }
        
        return resultado;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    
    
}
