/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectofinal.utp.sales.repositories;

import java.util.List;

/**
 *
 * @author Administrador
 */
public interface ICRUD <T>{
    T insert(T t);
    T update(T t);
    void delete(Integer id);
    T listById(Integer id);
    List<T> list();
}

