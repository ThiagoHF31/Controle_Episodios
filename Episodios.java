import java.util.LinkedList;

public class Episodios implements Video {
    private String nome;
    private LinkedList<Video> videos;

    
    
    public Episodios(String nome) {
        this.nome = nome;
        this.videos = new LinkedList<Video>();
    }

    public void adicionar(Video video){
        this.videos.add(video);
    }

    public void remover(Video video){
        this.videos.remove(video);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo os episódios de " + getNome());
        for (Video video : videos) {
            video.reproduzir();
        }
    }
    

    @Override
    public boolean isIfantil() {
        for (Video video : videos) {
            if (!video.isIfantil()) {
                System.out.println("Episódio não pode ser exibido para menores!");
                return false;
            }
        }
        return true;
    }
    

    @Override
    public String getNome() {
        return this.nome;
    }

    public int getDuração() {
        int total = 0;
        for (Video video : videos) {
            total += video.getDuração();
        }
        return total;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Video> getVideos() {
        return videos;
    }

    public void setVideos(LinkedList<Video> videos) {
        this.videos = videos;
    }
    
}
