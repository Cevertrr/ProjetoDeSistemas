
package tictac;


public class Display {
    private numero horas;
    private numero minutos;
    private String stringDisplay;

    public Display(int horas, int minutos) {
        this.horas = new numero(24);
        this.minutos = new numero(60);
        setHora(horas, minutos);
    }
    public String getHora(){
        return stringDisplay;
    }
    
    public void setHora(int h, int m){
        horas.setValor(h);
        minutos.setValor(m);
    }
    public void updateDisplay(){
        stringDisplay=horas.getValorDisplay()+ ":" + minutos.getValorDisplay();
    }
    public void tiqueTaque() {
        minutos.incremeto();
        if (minutos.getValor() == 0){
            horas.incremeto();
        }
        updateDisplay();
        
    }
}
