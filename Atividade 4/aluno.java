
public class aluno {

    private double nota;
    private String nome;
    private int idade;

    public aluno(String nome, int idade, double nota) {
        this.nota = nota;
        this.nome = nome;
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

	@Override
	public String toString() {
		return "aluno [nota=" + nota + ", nome=" + nome + ", idade=" + idade + "]";
	}
    
    

}	
