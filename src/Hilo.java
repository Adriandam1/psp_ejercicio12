
class Hilo extends Thread {
    private Contador contador;

    public Hilo(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {

                for (int i = 0; i < 100; i++) {
                    // Sincronizamos el método
                    synchronized (Main.lock) {
                        contador.incrementar();
                        System.out.println("El valor de contador es: " + contador.obtenerValor());
                        // Añadimos retraso para hacer el problema visible
                        try {
                            // Es mas correcto usar wait() cuando usamos synchronized en lugar de sleep()
                            Main.lock.wait(1);
                            //Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                     }
                }
    }
}
