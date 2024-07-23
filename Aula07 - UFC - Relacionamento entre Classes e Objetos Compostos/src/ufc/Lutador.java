package ufc;
public class Lutador {
    //Atributos:
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Método Construtor:
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //Métodos personalizados:
    public void apresentar(){
        System.out.println("----------APRESENTAÇÂO-------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + "anos");
        System.out.println("Altura: " + getAltura());
        System.out.println("Pesando: " + getPeso());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
        System.out.println("------------------------------------");
    }
    public void status(){      
        System.out.println("----------------STATUS--------------");
        System.out.println("Nome: " + getNome());
        System.out.println("É um peso: " + getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println("------------------------------------");
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
    //Métodos Acessores e Modificadores (Getters e Setters):
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido, muito leve";
        }
        else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido, muito pesado";
        }
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }    
}
