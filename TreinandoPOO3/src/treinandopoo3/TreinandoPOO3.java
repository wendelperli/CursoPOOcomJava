package treinandopoo3;

public class TreinandoPOO3 {

    public static void main(String[] args) {
       
        Chumbada c1 = new Chumbada("Offline", 2023, "Cinza", true); //Instanciando um objeto passando parâmetros para o Método Construtor
        
        c1.status();
        
        c1.setMotor(false);
        c1.setNome("Victoria");
        
        c1.status();
    }
    
}
