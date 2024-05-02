package Prenda;
import static Prenda.Categoria.*;
public class TipoPrenda {
    Categoria categoria;
    Material materialesCompatibles;
    public TipoPrenda(Categoria categoria) {

    }

    public Categoria getCategoria() {
        return categoria;
    }
    static TipoPrenda ZAPATO = new TipoPrenda(CALZADO);
    static TipoPrenda REMERA = new TipoPrenda(PARTE_SUPERIOR);
    static TipoPrenda PANTALON = new TipoPrenda(PARTE_INFERIOR);

}
