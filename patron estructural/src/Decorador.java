abstract class Decorador implements Componente {
    protected Componente componente;

    public Decorador(Componente componente) {
        this.componente = componente;
    }

    public void operacion() {
        componente.operacion();
    }
}