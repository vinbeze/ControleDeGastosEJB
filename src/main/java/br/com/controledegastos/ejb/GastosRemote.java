/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledegastos.ejb;

import br.com.controledegastos.entity.Gastos;
import javax.ejb.Remote;

/**
 *
 * @author vinicius
 */
@Remote
public interface GastosRemote {

    public Gastos salvar(Gastos g) throws Exception;

    public Gastos consultarPorId(Long id);

    public void remover(Long id);
}
