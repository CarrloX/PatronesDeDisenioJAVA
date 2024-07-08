public class DecoradorEspecifico extends Decorador{
    public DecoradorEspecifico(Componente componente) {
        super(componente);
    }

    @Override
    public void operacion() {
        super.operacion();
        agregarFuncionalidad();
    }

    private void agregarFuncionalidad() {
        System.out.println("la funcionadlidad del decorador especifico fue añadida exitosamente");
    }
}
