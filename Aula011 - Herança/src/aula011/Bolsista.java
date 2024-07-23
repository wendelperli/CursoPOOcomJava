package aula011;

public class Bolsista extends Aluno {
    private int bolsa;

    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa!");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do bolsista " + this.getNome());
    }
}
