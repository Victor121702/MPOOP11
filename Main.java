import hilos.HiloT;
import hilos.HiloR;
public class Main {
  public static void main(String[] args) {
    //metodo 1
    HiloT miHilo1 = new HiloT("Primer Hilo");
    miHilo1.start();
    //metodo 2
    new HiloT("Segundo Hilo").start();

    //para hilo 3 y 4 
    new Thread(new HiloR(),"Tercer Hilo").start();
    new Thread(new HiloR(),"Cuarto Hilo").start();


    for(int i=0;i<10;i++){
      System.out.println("Iteración "+i+" del Hilo Main");
    }

    System.out.println("Termina el hilo Hilo Main");
  }
}