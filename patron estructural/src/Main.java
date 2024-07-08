public class Main {
    public static void main(String[] args) {
        Componente componente = new DecoradorEspecifico(new ComponenteEspecifico());
        componente.operacion();
    }
}