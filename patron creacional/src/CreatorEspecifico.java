class CreatorEspecifico extends Creator {
    @Override
    public Producto factoryMethod() {
        return new ProductoEspecifico();
    }
}