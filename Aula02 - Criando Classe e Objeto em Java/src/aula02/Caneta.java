package aula02;

public class Caneta { //Classe
    String modelo; //Atributo
    String cor; //Atributo
    float ponta; //Atributo
    int carga; //Atributo
    boolean tampada; //Atributo
    
    void status(){ //Método 
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(" está tampada " + this.tampada);
    }
    void rabiscar(){//Método 
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar!");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    void tampar(){//Método modificando um atributo
        this.tampada = true;
    }
    void destampar(){//Método modificando um atributo
        this.tampada = false;
    }
}
