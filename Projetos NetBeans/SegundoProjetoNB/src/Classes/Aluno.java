package Classes;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */
public class Aluno {
    // Atributos
    private String nome;
    private String matricula;
    
    // Construtor Padrão
     public Aluno() {
        this.nome = "Jose Carlos da SIlva";
        this.matricula = "190875";
    }
    
    
    // Construtor com Parâmetros
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Métodos Getters
    public String getMatricula() {
        return matricula;
    }
    
    public String getNome() {
        return nome;
    }

      
    // Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
    
}
