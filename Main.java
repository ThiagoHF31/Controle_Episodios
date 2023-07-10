public class Main {
    public static void main(String[] args) {
    Episodios s01 = new Episodios("Black Mirror S01");
    Episodio ep01 = new Episodio("The National Anthem", 44, false);
    Episodio ep02 = new Episodio("Fifteeen Million Merits", 62, false);
    Episodio ep03 = new Episodio("The Entire History of You", 49, false);
    s01.adicionar(ep01);
    s01.adicionar(ep02);
    s01.adicionar(ep03);
    Episodios s02 = new Episodios("Black Mirror S02");
    Episodio ep04 = new Episodio("Be Right Back", 48, false);
    Episodio ep05 = new Episodio("White Bear", 42, false);
    Episodio ep06 = new Episodio("The Waldo Moment", 43, false);
    Episodio ep07 = new Episodio("White Christmas", 73, false);
    s02.adicionar(ep04);
    s02.adicionar(ep05);
    s02.adicionar(ep06);
    s02.adicionar(ep07);

    Episodios série = new Episodios("Black Mirror");
    série.adicionar(s01);
    série.adicionar(s02);

    System.out.println("O total da duração de " + série.getNome() + " é de " +
    série.getDuração() + " minutos.");

    if ( série.isIfantil() == true )
            System.out.println("Os episódios são apropriados para crianças");
    else
            System.out.println("Os episódios não são apropriados para crianças!");
        System.out.println("Vamos maratonar!");
        série.reproduzir();
    }
}