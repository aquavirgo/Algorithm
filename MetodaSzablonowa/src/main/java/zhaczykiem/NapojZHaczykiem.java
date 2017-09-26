package zhaczykiem;

public abstract class NapojZHaczykiem {
    void recepturaParzenia(){
        gotowanieWody();
        zaparzanie();
        nalewanieDoFilizanki();
        if(czyKlientChceDodatki()) {
            domieszanieDodatkow();
        }
    }


    public abstract void zaparzanie();
    public abstract void domieszanieDodatkow();

    void gotowanieWody(){
        System.out.println("Gotowanie Wody");
    }

    void nalewanieDoFilizanki(){
        System.out.println("Nalewanie do filizamki");
    }

    public boolean czyKlientChceDodatki(){
        return true;
    }
}
