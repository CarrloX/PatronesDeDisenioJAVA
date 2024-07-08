class ObservadorEspecifico implements Observador {
    private final Sujeto sujeto;

    public ObservadorEspecifico(Sujeto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }

    @Override
    public void actualizar() {
        System.out.println("estado actualizado: " + sujeto.getEstado());
    }
}