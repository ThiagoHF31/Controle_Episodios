public class Episodio implements Video {

    private String nome;
    private int duração;
    private boolean infatil;

    

    public Episodio(String nome, int duração, boolean infatil) {
        this.nome = nome;
        this.duração = duração;
        this.infatil = infatil;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo o episodio: "+ this.nome);
    }

    @Override
    public boolean isIfantil() {
        return infatil;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getDuração() {
        return duração;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuração(int duração) {
        this.duração = duração;
    }

    public boolean isInfatil() {
        return infatil;
    }

    public void setInfatil(boolean infatil) {
        this.infatil = infatil;
    }
}
