package numerosfracciones;

/**
 *
 * @author Alex Gallardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraccion nf=new Fraccion();
        Fraccion frac_x=new Fraccion();
        Fraccion nftemp=new Fraccion();
       int x,y,i;
       String msg;
       
       x=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dame el numerador:"));
       y=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dame el denominador:"));
       nf=new Fraccion (x,y);
       nf.mostrar();
       nftemp=nf;
       i=2;
       msg=" ";
       do {
          
           frac_x=new Fraccion (1,i);
            if ((nftemp.compara(frac_x)))
            {
              nftemp=nftemp.resta(nftemp,frac_x);
              nftemp.reduce(nftemp);
              System.out.println(nftemp.num+"/"+nftemp.den);
              msg=msg+frac_x.num+"/"+frac_x.den+" + ";
              javax.swing.JOptionPane.showMessageDialog(null,msg);
              i++;
              }
           
           
            }
            while(!(nftemp.escero()));
            
       
    }
}
            
            
       
