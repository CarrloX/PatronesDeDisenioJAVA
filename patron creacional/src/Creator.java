abstract class Creator {
    public abstract Producto factoryMethod();

    public void anOperation() {
        Producto producto = factoryMethod();
        producto.operacion();
    }
}