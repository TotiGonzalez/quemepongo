import java.util.ArrayList;
import java.util.List;


class Prenda {
    String tipo;
    String categoria;
    String material;
    String colorPrincipal;
    String colorSecundario;
}

    public Prenda(String tipo, String categoria, String material, String colorPrincipal, String colorSecundario){
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

    public String toString() {
        return tipo + " - " + categoria + " - " + material + " - " + colorPrincipal + " - " + colorSecundario;
    }

public class QueMePongo {
    private List<Prenda> prendas;

    public QueMePongo() {
        this.prendas = new ArrayList<>();
        }

    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
        }
    public void mostrarPrendas() {
        for (Prenda prenda : prendas) {
            System.out.println(prenda);
        }
    }

public void main(String[] args) {
    QueMePongo queMePongo = new QueMePongo();
    Prenda prenda1 = new Prenda("Remera", "parte sup", "algodon", "rojo", null);
    queMePongo.agregarPrenda(prenda1);

    System.out.println("Prendas cargadas:");
    queMePongo.mostrarPrendas();
}