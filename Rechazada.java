package Ordenes;

public class Rechazada  implements OrderState {

    @Override
    public void rechazar(Order ctx) {
        throw new IllegalStateException("La orden ya se encuentra RECHAZADA.");
    }

    @Override
    public void pay(Order ctx) {
        throw new IllegalStateException("No se puede pagar una orden RECHAZADA.");
    }

    @Override
    public void ship(Order ctx) {
    	throw new IllegalStateException("No se puede enviar una orden RECHAZADA.");
    }
}
