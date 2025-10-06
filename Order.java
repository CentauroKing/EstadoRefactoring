package Ordenes;
public class Order {
    
    private OrderState state = new Pending();

    public void cancelar()  { 
        state.rechazar(this); 
    }
    
    public void pay()  { 
        state.pay(this); 
    }
    
    public void ship() { 
        state.ship(this); 
    }
    
    void changeState(OrderState s) {
        this.state = s; 
    }

}
