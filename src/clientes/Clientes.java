/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;
import javax.swing.JOptionPane;

/**
 *
 * @author tanisha
 */
public class Clientes {
    String nit, telefono;
    String nombre,direccion, email;
    int saldo=0;
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nombre = JOptionPane.showInputDialog("Ingrese nombre:");
        String nit = JOptionPane.showInputDialog("Ingrese Nit: ");
        String Direccion = JOptionPane.showInputDialog("Ingrese direccion:");
        String telefono = JOptionPane.showInputDialog("Ingrese telefono:");
        String email = JOptionPane.showInputDialog("Ingrese email:");
        JOptionPane.showMessageDialog(null, "Su saldo inicial es de Q.0.00");
    }
 
}
    


