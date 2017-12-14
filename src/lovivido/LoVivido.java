/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {
String n;
String e;

int m;
int d;
int h;
int a;

public void programa1(){
   
n = JOptionPane.showInputDialog ("Escriba su nombre: ");
e = JOptionPane.showInputDialog ("Escriba su edad: ");
 
a =   Integer.parseInt (e);
 
m = (a*12);
d = (a*365);
h = (d*24);
 
JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0); 
}
public static void main(String[] args) {
LoVivido a= new LoVivido();
a.programa1();


}
   

}
    