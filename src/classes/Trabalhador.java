package classes;

class Trabalhador extends Pessoa{
    //ATRIBUTOS
    private String funcao;
    private double salario;
    private String departamento;
    //METODOS
    public String getFuncao() {
        return funcao;
    }
    public double getSalario() {
        return salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}