
public class Main {
    // Creamos variable static final objeto lock para sincronizar
    static final Object lock = new Object();

    public static void main(String[] args) {
        Contador contador = new Contador();
// Crear 4 hilos con nombres específicos
        Hilo hilo1 = new Hilo(contador);
        Hilo hilo2 = new Hilo(contador);
        Hilo hilo3 = new Hilo(contador);
        Hilo hilo4 = new Hilo(contador);

// Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

// Esperar a que todos los hilos terminen
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("El valor final del contador es: " + contador.obtenerValor());
    }
}