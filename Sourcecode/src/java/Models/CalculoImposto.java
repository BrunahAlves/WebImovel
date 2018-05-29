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
    public double calcularImposto() {
        if (getTipoImovel().equals("Terreno")){
            setPorcentagem(1.01f);
        }
        else if(getTipoImovel().equals("Garagem")){
            setPorcentagem(1.01f);
        }
        else if(getTipoImovel().equals("Loja")){
            setPorcentagem(1.05f);
        }
        else if(getTipoImovel().equals("Kitnet")){
            setPorcentagem(1.02f);
        }
        else if(getTipoImovel().equals("Sobrado")){
            setPorcentagem(1.02f);
        }
        else if(getTipoImovel().equals("Flat")){
            setPorcentagem(1.02f);
        }
        else if(getTipoImovel().equals("Casa")){
            setPorcentagem(1.03f);
        }
        else if(getTipoImovel().equals("Cobertura")){
            setPorcentagem(1.04f);
        }
        else if(getTipoImovel().equals("Chacara")){
            setPorcentagem(1.03f);
        }
        else if(getTipoImovel().equals("Apartamento")){
            setPorcentagem(1.04f);
        }
        //double calImposto = ((getPorcentagem() * getValorImovel()) / 100);
        double calImposto = ((getPorcentagem() * getValorImovel()));
        
        
        calImposto = Double.valueOf(String.format(Locale.US, "%.2f", calImposto));
        
        
        return calImposto;
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
