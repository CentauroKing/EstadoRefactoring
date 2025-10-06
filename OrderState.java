package Ordenes;
public interface OrderState {
    void rechazar(Order ctx);
    void pay(Order ctx);
    void ship(Order ctx);
}
