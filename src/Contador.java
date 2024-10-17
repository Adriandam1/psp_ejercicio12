
public class Contador {

    private int valor = 0;

    public void incrementar(){
        // Podriamos sincronizar los metodos incrementar y valor, no hace falta por que lo hacemos en el run de hilo
        //synchronized (this) { // Se sincroniza en el objeto actual
            valor++;
        //}
    }
    public int obtenerValor(){
        return valor;
    }

}
