import javax.print.attribute.standard.Media;

public class Disciplina {
    protected ICalcMedia CalcMedia;
    private double Media;
    private String Nome;
    private double P1;
    private double P2;
    private String situacao;

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        Media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public Disciplina(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }

    public void CalcularMedia(){
        this.Media = CalcMedia.CalculaMedia(P1, P2);
        this.situacao = CalcMedia.Situacao(Media);
    }
}
