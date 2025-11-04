/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.utp.sales.entities;

/**
 *
 * @author Administrador
 */
public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    
    public static class Builder{
      
        private Cliente cliente;
        
        public Builder(){
          cliente = new Cliente();
        }
    }
    
}
