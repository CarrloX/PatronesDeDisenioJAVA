public class Main {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();
        ObservadorEspecifico observador = new ObservadorEspecifico(sujeto);

        sujeto.setEstado(10);
        sujeto.setEstado(20);
    }
}