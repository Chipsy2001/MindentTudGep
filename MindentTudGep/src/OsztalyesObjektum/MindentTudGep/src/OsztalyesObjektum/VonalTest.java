
package OsztalyesObjektum;


public class VonalTest {
    public static void main(String[] args) {
       
        Vonal vonal1 = new Vonal(3);
        System.out.println(vonal1);
        System.out.println(vonal1.rajz());
        
       
        Vonal vonal2 = new Vonal(3, 2);
        System.out.println(vonal2);
        System.out.println(vonal2.rajz());
        
      
        Vonal vonal3 = new Vonal(2, 3, Vonal.Szinek.KEK);
        System.out.println(vonal3);
        System.out.println(vonal3.rajz());
        
        
        Vonal vonal4 = new Vonal(5, 0, Vonal.Szinek.ZOLD, Vonal.Stilusok.PONT);
        System.out.println(vonal4);
        System.out.println(vonal4.rajz());
        
       
        Vonal vonal5 = new Vonal(-3, 2, Vonal.Szinek.PIROS, Vonal.Stilusok.DUPLA);
        System.out.println(vonal5);
        System.out.println(vonal5.rajz());
        
       
        vonal5.setEltolas(-1);
        System.out.println(vonal5);
        System.out.println(vonal5.rajz()); 
        
 
        vonal5.setSzin(Vonal.Szinek.KEK);
        vonal5.setStilus(Vonal.Stilusok.SZIMPLA);
        System.out.println(vonal5);
        System.out.println(vonal5.rajz());
    }
}