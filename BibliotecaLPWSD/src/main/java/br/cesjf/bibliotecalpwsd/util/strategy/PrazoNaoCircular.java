/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.bibliotecalpwsd.util.strategy;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author igorcooli
 */
public class PrazoNaoCircular implements PrazoDevolucaoStrategy{

    @Override
    public Calendar calculaDevolucao(Date dataEmprestimo) {
        Calendar c = Calendar.getInstance();
        
        c.setTime(dataEmprestimo);
        
        c.add(Calendar.DAY_OF_MONTH, 1);
        
        return c;
    }
    
}
