import java.util.Random;


public class Aluno {
    private String nome;
    private int matricula;
    private Random rand = new Random();

    public Aluno(String nome){
        this.nome = nome;
        this.matricula = 2022 + rand.nextInt(1000);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString(){
        return "Nome: " + nome + "\nMatricula: " +matricula;
    }
}
