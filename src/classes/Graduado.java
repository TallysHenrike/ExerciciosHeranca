package classes;

class Graduado extends Estudante{
    private int anoDeConclusao;
    private int numeroDoDiploma;
    private int anoDeColacaoDeGrau;

    public int getAnoDeConclusao() {
        return anoDeConclusao;
    }

    public int getNumeroDoDiploma() {
        return numeroDoDiploma;
    }

    public int getAnoDeColacaoDeGrau() {
        return anoDeColacaoDeGrau;
    }

    public void setAnoDeConclusao(int anoDeConclusao) {
        this.anoDeConclusao = anoDeConclusao;
    }

    public void setNumeroDoDiploma(int numeroDoDiploma) {
        this.numeroDoDiploma = numeroDoDiploma;
    }

    public void setAnoDeColacaoDeGrau(int anoDeColacaoDeGrau) {
        this.anoDeColacaoDeGrau = anoDeColacaoDeGrau;
    }
}