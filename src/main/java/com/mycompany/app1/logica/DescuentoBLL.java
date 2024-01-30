/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.app1.logica;

import com.mycompany.app1.model.DescuentoBase;

/**
 *
 * @author Willyams
 */
public interface DescuentoBLL {
    public DescuentoBase registrarDescuentoNormal(DescuentoBase descuento);
    public DescuentoBase registrarDescuentoGlobal(DescuentoBase descuento);
    public DescuentoBase buscarDescuento(String codigo);
}
