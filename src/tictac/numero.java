package tictac;

public class numero {
    private int limite;
    private int valor;

    public numero(int limite) {
        this.limite = limite;
        this.valor = 0;
    }
    public void incremeto(){
        this.valor = (this.valor +1) % limite; //divide pelo limite
    }
    
    public String getValorDisplay(){
        if (this.valor<10) {
            return "0" + this.valor;
        }else{
            return "" + this.valor;
        }
        
        }

    public int getValor() {
        return valor;
    }

    public void setValor(int v) {
        if ((v>= 0)&& (v<this.limite)){
          
        this.valor = v;
    }
        }}
    

