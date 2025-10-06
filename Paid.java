package Ordenes;
public class Paid implements OrderState {

    @Override
    public void rechazar(Order ctx) {
        System.out.println("Cancelando pedido. Cambiando a RECHAZADA.");
        ctx.changeState(new Rechazada());
    }
    
    @Override
    public void pay(Order ctx) {
        throw new IllegalStateException("Ya está pagado.");
    }

    @Override
    public void ship(Order ctx) {
        System.out.println("Enviando pedido. Cambiando a SHIPPED.");
        ctx.changeState(new Shipped());
    }

}
