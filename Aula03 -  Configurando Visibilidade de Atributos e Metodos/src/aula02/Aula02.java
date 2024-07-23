
package aula02;


public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // Intanciando um objeto da Classe Caneta
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true; Como está privado, não vai funcionar, por isso usamos os métodos tampar e destampar que são públicos
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
    }
    
}
