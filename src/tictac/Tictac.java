package tictac;


public class Tictac {

    
    public static void main(String[] args) {
        Display relogio = new Display(10, 0);
        
        relogio.tiqueTaque();
        System.out.println("hora atual " + relogio.getHora());
        
        relogio.tiqueTaque();
        System.out.println("hora atual " + relogio.getHora());
        
        relogio.tiqueTaque();
        System.out.println("hora atual " + relogio.getHora());
    }
    
}
