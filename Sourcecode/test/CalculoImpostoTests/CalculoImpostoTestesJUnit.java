package CalculoImpostoTests;

import Models.CalculoImposto;
import junit.framework.TestCase;

/**
 *
 * @author Guilherme
 */
public class CalculoImpostoTestesJUnit extends TestCase {
    CalculoImposto calculo;
    
    protected void setUp() throws Exception {
	super.setUp();
	calculo = new CalculoImposto();
    }
    
    public void testCalcularImpostoTerreno(){
        calculo.setTipoImovel("Terreno");
        calculo.setValorImovel(1);
        assertEquals(1.01, calculo.calcularImposto());
    }
    
    public void testCalcularImpostoGaragem(){
        calculo.setTipoImovel("Garagem");
        calculo.setValorImovel(1);
        assertEquals(1.01, calculo.calcularImposto());
    }
    
    public void testCalcularImpostoLoja(){
        calculo.setTipoImovel("Loja");
        calculo.setValorImovel(1);
        assertEquals(1.05, calculo.calcularImposto());
    }
    
    public void testCalcularImpostoKitnet(){
        calculo.setTipoImovel("Kitnet");
        calculo.setValorImovel(1);
        assertEquals(1.02, calculo.calcularImposto());
    }
    
    public void testCalcularImpostoSobrado(){
        calculo.setTipoImovel("Sobrado");
        calculo.setValorImovel(1);
        assertEquals(1.02, calculo.calcularImposto());
    }
    
    public void testCalcularImpostoFlat(){
        calculo.setTipoImovel("Flat");
        calculo.setValorImovel(1);
        assertEquals(1.02, calculo.calcularImposto());
    }
    
    public void testCalcularImpostoCasa(){
        calculo.setTipoImovel("Casa");
        calculo.setValorImovel(1);
        assertEquals(1.03, calculo.calcularImposto());
    }
    
    public void testCalcularImpostoCobertura(){
        calculo.setTipoImovel("Cobertura");
        calculo.setValorImovel(1);
        assertEquals(1.04, calculo.calcularImposto());
    }
    
    public void testCalcularImpostoChacara(){
        calculo.setTipoImovel("Chacara");
        calculo.setValorImovel(1);
        assertEquals(1.03, calculo.calcularImposto());
    }
    
    public void testCalcularImpostoApartamento(){
        calculo.setTipoImovel("Apartamento");
        calculo.setValorImovel(1);
        assertEquals(1.04, calculo.calcularImposto());
    }
    
    public void testCalcularImpostogetStatus() {
    	calculo.setStatus("Novo");
    	assertEquals("Novo", calculo.getStatus());
    }
    
    
}
