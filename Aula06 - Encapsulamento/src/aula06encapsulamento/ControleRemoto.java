package aula06encapsulamento;

public class ControleRemoto implements Controlador{
    //Atributos:
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Método construtor:
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    //Métodos personalizados:
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    @Override
    public void abrirMenu(){
        
        System.out.println("Menu está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 10; i <= this.getVolume(); i += 10){
            System.out.print(" | ");
        }
        System.out.println(" ");
        System.out.println("----------------------------------------");
    }
    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }
    @Override
    public void maisVolume(){
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 10);
        }
        else{
            System.out.println("Impossível aumentar, a TV está desligada!");
        }
    }
    @Override
    public void menosVolume(){
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() - 10);
        }
        else{
            System.out.println("Impossível adiminuir, a TV está desligada!");
        }
    }
    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }
    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    //Métodos acessores Getters e Setters:
    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int n){
        this.volume = n;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
}
