/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Guilherme
 */
public class CalculoImposto implements ISeguro{
    private String tipoImovel;
    private double valorImovel;
    private float porcentagem;
    private String status;
    
    @Override
    public double calcularImposto() {//1
        if (getTipoImovel().equals("Terreno")){//2
            setPorcentagem(1.01f);//3
        }
        else if(getTipoImovel().equals("Garagem")){//4
            setPorcentagem(1.01f);//5
        }
        else if(getTipoImovel().equals("Loja")){//6
            setPorcentagem(1.05f);//7
        }
        else if(getTipoImovel().equals("Kitnet")){//8
            setPorcentagem(1.02f);//9
        }
        else if(getTipoImovel().equals("Sobrado")){//10
            setPorcentagem(1.02f);//11
        }
        else if(getTipoImovel().equals("Flat")){//12
            setPorcentagem(1.02f);//13
        }
        else if(getTipoImovel().equals("Casa")){//14
            setPorcentagem(1.03f);//15
        }
        else if(getTipoImovel().equals("Cobertura")){//16
            setPorcentagem(1.04f);//17
        }
        else if(getTipoImovel().equals("Chacara")){//18
            setPorcentagem(1.03f);//19
        }
        else {
            setPorcentagem(1.04f);//20
        }
        /*else if(getTipoImovel().equals("Apartamento")){//20
            setPorcentagem(1.04f);//21
        }*/
        //double calImposto = ((getPorcentagem() * getValorImovel()) / 100);
        //double calImposto = ((getPorcentagem() * getValorImovel()));
        //double calImposto = ((getPorcentagem() * getValorImovel()));
        //Double.valueOf(String.format(Locale.US, "%.2f", ((getPorcentagem() * getValorImovel()))))
        //calImposto = Double.valueOf(String.format(Locale.US, "%.2f", calImposto));
        
        //double calImposto = Double.valueOf(String.format(Locale.US, "%.2f", ((getPorcentagem() * getValorImovel()))));
        
        //return calImposto;
        
        
        return Double.valueOf(String.format(Locale.US, "%.2f", ((getPorcentagem() * getValorImovel()))));//21
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
