package sort;

import formularios.FormMenu;
import javax.swing.JOptionPane;


public class Sort {
        
    public static void main(String[] args) {
        try {
            FormMenu menu = new FormMenu();
            menu.setVisible(true);
             //new FormMenu().setVisible(true);            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error:", JOptionPane.ERROR_MESSAGE);
        }      
         
    }
    
    
    
}
