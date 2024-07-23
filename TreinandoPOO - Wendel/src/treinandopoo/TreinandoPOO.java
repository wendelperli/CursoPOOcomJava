
package treinandopoo;


public class TreinandoPOO {

   
    public static void main(String[] args) {
        Adicional a1 = new Adicional("Diesel", 300); //Instancia o objeto 'a1' já passando dados
        Caminhao c1 = new Caminhao("Volvo", "Azul", 2023, true, a1);//Instancia o objeto 'c1' já passando dados
      
        c1.setAdicional(a1);//Coloca o objeto instanciado 'a1' dentro de 'c1'
        c1.status();
        //System.out.println(c1.getAdicional().getCombustivel());
    }
    
}
