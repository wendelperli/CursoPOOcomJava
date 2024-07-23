
package aula02;


public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // Intanciando um objeto da Classe Caneta
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 90;
        c1.modelo = "BIC";
        c1.tampar();
        //c1.status(); //Mostra o status de 'c1' usando o método 'status'
        c1.rabiscar();
        System.out.println(" ");
        c1.destampar();
        //c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.destampar();
        c2.rabiscar();
    }
    
}
