

package treinandopoo2;


public class Aluno {
    String nome;
    String turma;
    float nota1;
    float nota2;
    float media;
    String situacao;

    void status(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Turma: " + this.turma);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("A média do " + this.nome + " é " + this.media);
        System.out.println("O aluno está " + this.situacao);
    }
    void media(){
        media = (this.nota1 + this.nota2) / 2;
        if (media >= 6){
            this.situacao = "Aprovado";
        }
        else{this.situacao = "Reprovado";
    }
}
}
