
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
            else{//7
                resultado = ("Segurança - Prioridade alta");//8
            }
        }
        else if(status.equals("Usado")){//9
            if(precoComImposto < 150000){//10
              resultado = ("Segurança - Prioridade baixa");//11 
            }
            else if(precoComImposto < 270000){//12
              resultado = ("Segurança - Prioridade media");//13  
            }
            else{//14
              resultado = ("Segurança - Prioridade alta");//15 
            }
        }
        else{//16
           if(precoComImposto < 90000){//17
              resultado = ("Segurança - Prioridade baixa");//18 
           }
           else if(precoComImposto < 130000){//19
              resultado = ("Segurança - Prioridade media");//20 
           }
           else{//21
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
