/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeguroTests;

import Models.ISeguro;
import Models.Seguro;
import junit.framework.TestCase;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guilherme
 */
public class SeguroTestesMock extends TestCase{
    public void testPriBaixaNMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(109999.9);
        expect(mock.getStatus()).andReturn("Novo");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade baixa", seguro.determinarPrioridadeSeguranca(mock));
    }
    
    public void testPriMediaNMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(249999.9);
        expect(mock.getStatus()).andReturn("Novo");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade media", seguro.determinarPrioridadeSeguranca(mock));
    }
    
    public void testPriAltaNMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(250000.0);
        expect(mock.getStatus()).andReturn("Novo");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade alta", seguro.determinarPrioridadeSeguranca(mock));
    }
    
    public void testPriBaixaUMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(149999.9);
        expect(mock.getStatus()).andReturn("Usado");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade baixa", seguro.determinarPrioridadeSeguranca(mock));
    }
    
    public void testPriMediaUMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(269999.9);
        expect(mock.getStatus()).andReturn("Usado");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade media", seguro.determinarPrioridadeSeguranca(mock));
    }
    
    public void testPriAltaUMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(270000.0);
        expect(mock.getStatus()).andReturn("Usado");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade alta", seguro.determinarPrioridadeSeguranca(mock));
    }
    
    
    
    public void testPriMinimaCMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(69999.9);
        expect(mock.getStatus()).andReturn("Em construcao");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade minima", seguro.determinarPrioridadeSeguranca(mock));
    } 
   
    public void testPriMuitoBaixaCMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(79999.9);
        expect(mock.getStatus()).andReturn("Em construcao");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade muito baixa", seguro.determinarPrioridadeSeguranca(mock));
    }
    
    public void testPriBaixaCMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(89999.9);
        expect(mock.getStatus()).andReturn("Em construcao");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade baixa", seguro.determinarPrioridadeSeguranca(mock));
    }
    
    public void testPriMediaCMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(129999.9);
        expect(mock.getStatus()).andReturn("Em construcao");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade media", seguro.determinarPrioridadeSeguranca(mock));
    }
    
    public void testPriAltaCMock(){
        ISeguro mock = createMock(ISeguro.class);
        
        expect(mock.calcularImposto()).andReturn(130000.0);
        expect(mock.getStatus()).andReturn("Em construcao");
        replay(mock);
        
        Seguro seguro = new Seguro();
        assertEquals("Segurança - Prioridade alta", seguro.determinarPrioridadeSeguranca(mock));
    }
    
}
