/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectofinal.utp.sales.repositories;

import proyectofinal.utp.sales.entities.Cliente;

/**
 *
 * @author Administrador
 */
public interface ICustomerRepository extends ICRUD<Cliente>{
    Cliente listByDNI(String dni);
}
