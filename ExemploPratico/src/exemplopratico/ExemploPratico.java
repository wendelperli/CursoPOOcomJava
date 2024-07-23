

package exemplopratico;


public class ExemploPratico {

   
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.abrirConta(005, "cp", "Feitosa", true);
        c1.mostrar();
        c1.fecharConta();
        c1.depositar(500);
        c1.mostrar();
        c1.sacar(1000);
        c1.mostrar();
        c1.pagarMensal();
        c1.mostrar();
    }
    
}
