package Ordenes;
public class Shipped implements OrderState {

    public void rechazar(Order ctx) {
        System.out.println("Cancelando pedido. Cambiando a RECHAZADA.");
        ctx.changeState(new Rechazada());
    }
    
    public void pay(Order ctx) {
        throw new IllegalStateException("Ya fue pagada.");
    }

    public void ship(Order ctx) {
        System.out.println("Ya está SHIPPED.");
    }

}
