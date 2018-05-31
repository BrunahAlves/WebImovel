
package Models;

/**
 *
 * @author Guilherme
 */
public class Seguro{
    private Imovel imovel;
    private String prioridade;
    
    public String determinarPrioridadeSeguranca(ISeguro pC){//1
        String resultado = null;
        double precoComImposto;
        String status = pC.getStatus();
        precoComImposto = pC.calcularImposto();
        
        
        if(status.equals("Novo")){//2 
            if(precoComImposto < 110000){//3
               resultado = ("Segurança - Prioridade baixa");//4
            }
            else if(precoComImposto < 250000){//5
                resultado = ("Segurança - Prioridade media");//6
            }
            else{//
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
            else{//
              resultado = ("Segurança - Prioridade alta");//13 
            }
        }
        else{//
           if (precoComImposto < 70000){ //14
               resultado = ("Segurança - Prioridade minima");//15
           } 
           else if (precoComImposto < 80000){//16
               resultado = ("Segurança - Prioridade muito baixa");//17
           }
           else if(precoComImposto < 90000){//18
              resultado = ("Segurança - Prioridade baixa");//19 
           }
           else if(precoComImposto < 130000){//20
              resultado = ("Segurança - Prioridade media");//21 
           }
           else{//
              resultado = ("Segurança - Prioridade alta");//22 
           }
        }
        
        return resultado;//23
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
