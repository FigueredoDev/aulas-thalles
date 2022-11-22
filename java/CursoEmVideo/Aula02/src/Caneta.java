public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("Voce nao pode rabiscar com a caneta tampada");
        } else {
            System.out.println("Rabiscando com a caneta");
        }

    }

    void tampar() {
        if (this.tampada) {
            System.out.println("A caneta ja esta tampada! ");
        } else {
            System.out.println("A caneta foi tampada agora!");
            this.tampada = true;
        }
    }

    void destampar() {
        if (!this.tampada) {
            System.out.println("A caneta ja esta Destampada! ");
        } else {
            System.out.println("Retirando a tampa da caneta!");
            this.tampada = false;
        }
    }

}
