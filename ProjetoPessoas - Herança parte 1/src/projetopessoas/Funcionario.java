package projetopessoas;


public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        if(getTrabalhando() == false){
            this.setTrabalhando(true);
        }
        else{
            this.setTrabalhando(false);
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
