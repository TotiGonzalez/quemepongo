package Prenda;

public class Prenda {
    TipoPrenda tipo;
    Material material;
    TramaTela tramaTela;
    Color colorPrimario;
    Color colorSecundario;

    public Prenda(TipoPrenda tipo, Material material, TramaTela tramaTela, Color colorPrimario){
        this.tipo = tipo;
        this.material = material;
        this.tramaTela = tramaTela;
        this.colorPrimario = colorPrimario;

        //this.colorSecundario = colorSecundario;
    }
    public Categoria getCategoria(){
        return tipo.getCategoria();
    }
    public static Prenda crearPrenda(TipoPrenda tipo, Material material, TramaTela tramaTela, Color colorPrimario) {
        BorradorPrenda borrador = new BorradorPrenda();
        borrador.setTipo(tipo);
        borrador.setMaterial(material);
        borrador.setTrama(tramaTela);
        return borrador.generarPrenda();
    }
    Prenda remeraLisa = Prenda.crearPrenda(TipoPrenda.REMERA, Material.ALGODON, null, Color.BLANCO);

}

