package EmcapsulamentoGetSet;

public class automoveis {

    public static void main(String[] args) {

        Veiculos van = new Veiculos(10, 30, 4 );

        van.setMarca("Fiat");
        van.setModelo("Ducato");


        System.out.println(van.getMarca());
        System.out.println(van.getModelo());
        System.out.println(van.getNumerosPassageiros());

    }
}
