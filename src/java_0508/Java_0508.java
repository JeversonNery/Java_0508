
package java_0508;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0508 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null, "Informe um número: ");
        int op1 = Integer.parseInt(num);
        
        String exp = JOptionPane.showInputDialog(null, "Informe um expoente: ");
        int op2 = Integer.parseInt(exp);
        
        double res = Math.pow(op1, op2);
        
        JOptionPane.showMessageDialog(null, "Resultado: " + res);
    }
    
}
