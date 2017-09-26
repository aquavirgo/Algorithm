package napoj;

public abstract class Napoj {
    public final void recepturaParzenia(){
        gotowanieWody();
        zaparzanie();
        nalewanieDoFilizanki();
        domieszanieDodatkow();
    }


    public abstract void zaparzanie();
    public abstract void domieszanieDodatkow();

    void gotowanieWody(){
        System.out.println("Gotowanie Wody");
    }

    void nalewanieDoFilizanki(){
        System.out.println("Nalewanie do filizamki");
    }
}
