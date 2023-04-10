package modulo7;

public class Caneta {

    private int codigo;
    private String marca;
    private String cor;

    public Caneta(int codigo, String marca, String cor) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Imprimindo propriedades
    public void propriedades() {
        System.out.println("Código: " + this.codigo+ "\nMarca: " + this.marca + "\nCor: " + this.cor);
    }

    //Destampando a caneta
    public void tirarTampa() {
        System.out.println("Retirando a tampa");
    }

    //Escrevendo
    public void escrever() {
        System.out.println("Escrevendo ...");
    }

    //Tampando a caneta
    public void colocarTampa() {
        System.out.println("tampando a caneta");
    }
}
