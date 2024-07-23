package aula02;

public class Caneta { //Classe
    public String modelo; //Atributo
    public String cor; //Atributo
    private float ponta; //Atributo
    protected int carga; //Atributo
    private boolean tampada; //Atributo
    
    public void status(){ //Método 
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(" está tampada " + this.tampada);
    }
    public void rabiscar(){//Método 
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar!");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar(){//Método modificando um atributo
        this.tampada = true;
    }
    public void destampar(){//Método modificando um atributo
        this.tampada = false;
    }
}
