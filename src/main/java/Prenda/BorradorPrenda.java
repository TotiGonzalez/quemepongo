package Prenda;

import Prenda.Exceptions.MaterialInvalidoException;
import Prenda.Exceptions.TipoInvalidoException;

import static Prenda.TramaTela.LISA;

public class BorradorPrenda {
    TipoPrenda tipo;
    Material material;
    TramaTela tramaTela = TramaTela.LISA;
    Color colorPrimario;
    Color colorSecundario;

    public void setTipo(TipoPrenda tipo) {
        if (tipo == null){
            throw new TipoInvalidoException("");
        }
        this.tipo = tipo;
    }
    public void setMaterial(Material material) {
        if (material == null){
            throw new MaterialInvalidoException("");
        }
        this.material = material;
    }
    public void setTrama(TramaTela tramaTela) {
        if (tramaTela != null){
        this.tramaTela = tramaTela;
        }
    }
    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Prenda generarPrenda() {
        return new Prenda(this.tipo, this.material, this.tramaTela, this.colorPrimario);
    }
}
