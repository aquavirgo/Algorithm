package zhaczykiem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class KawaZHaczykiem extends NapojZHaczykiem {
    @Override
    public void zaparzanie() {
        System.out.println("Zaparzanie i przesaczanie kawy przez filter");
    }

    @Override
    public void domieszanieDodatkow() {
        System.out.println("Dodawanie cukru oraz mleka");
    }

    public boolean czyKlientChceDodatki(){
        String odpowiedz = pobierzOdpowiedz();
        if(odpowiedz.toLowerCase().startsWith("t")){
            return true;
        }else{
            return false;
        }
    }

    private String pobierzOdpowiedz(){
        String odpowiedz =null;
        System.out.println("Czy chcesz cukier");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            odpowiedz=in.readLine();
        }catch(IOException ioe){
            System.err.println("Blad wejscia wyjscia");
        }
        if(odpowiedz==null){
            return "nie";
        }
        return odpowiedz;
    }
}
