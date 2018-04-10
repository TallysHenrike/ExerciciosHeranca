package classes;

class Estudante extends Pessoa{
    //ATRIBUTOS
    private int matricula;
    private String campus;
    private String curso;
    //METODOS
    public int getMatricula() {
        return matricula;
    }
    public String getCampus() {
        return campus;
    }
    public String getCurso() {
        return curso;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setCampus(String campus) {
        this.campus = campus;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}