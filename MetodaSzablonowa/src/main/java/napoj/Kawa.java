package napoj;

public class Kawa {
    void recepturaParzenia(){
        gotowanieWody();
        zaparzenieKawy();
        nalewanieDoFilizanki();
        dodawanieCukruOrazMleka();
    }

    public void gotowanieWody(){
        System.out.println("Gotowanie wody");
    }

    public void zaparzenieKawy(){
        System.out.println("Zaparzanie Kawy");
    }

    public void nalewanieDoFilizanki(){
        System.out.println("Nalewanie kawy do filizanki");
    }

    public void dodawanieCukruOrazMleka(){
        System.out.println("Dodawanie cukru i mleka");
    }
}
