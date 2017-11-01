package br.com.pitagoras.si.empresa;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */
public class Funcionario {
    private String nome;
    private String rg;
    private double salario;
    private int tempoNaEmpresa;   // número de anos na empresa
    private String funcao;
    private int mat;     // matrícula
    private static int contMatricula = 999;   // contador de matrícula

    public Funcionario(String nome, String rg, double salario, int tempoNaEmpresa, String funcao) {
        this.nome = nome;
        this.salario = salario;
        this.tempoNaEmpresa = tempoNaEmpresa;
        this.funcao = funcao;
        mat = ++contMatricula;
        this.rg = rg;
       
    }
    
    public Funcionario(String nome, String funcao, String rg) {
        this(nome, rg, CargosSalarios.buscaSalario(funcao), 0, funcao);
    }

    public double calculaSalario() {
        salario *= (1.0 + tempoNaEmpresa * 0.1); 
        return salario;
    }
    
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", rg=" + rg + ", mat= " + mat +", salario=" + salario + ", tempoNaEmpresa=" + tempoNaEmpresa + ", funcao=" + funcao + "}";
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTempoNaEmpresa() {
        return tempoNaEmpresa;
    }

    public void setTempoNaEmpresa(int tempoNaEmpresa) {
        this.tempoNaEmpresa = tempoNaEmpresa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getMat() {
        return mat;
    }

     
    
    
}
