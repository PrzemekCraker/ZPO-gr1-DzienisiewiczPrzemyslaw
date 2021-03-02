package lab1.Task6;

public class Main {

    public static void main(String[] args) {
        String zawod = "";
        SpedzanieWolnegoCzasu literatura = new LiteraturaPopularnoNaukowa();
        RoznoszenieListow listy = new RoznoszenieListow();
        Samochod samochod = new Samochod();

        SpedzanieWolnegoCzasu silownia = new Silownia();
        NaprawaSamochodow naprawaSamochodow = new NaprawaSamochodow();

        Leczenie leczenie = new Leczenie();
        Rower rower = new Rower();

        Pracownik p1 = new Pracownik(zawod, listy, samochod, literatura);
        p1.printZawod();
        p1.pracowac.pracuj();
        p1.dojezdzac.dojezdzaj();
        p1.spedzanieWolnegoCzasu.wolnyCzas();

        Pracownik p2 = new Pracownik(zawod, naprawaSamochodow, samochod, silownia);
        p2.printZawod();
        p2.pracowac.pracuj();
        p2.dojezdzac.dojezdzaj();
        p2.spedzanieWolnegoCzasu.wolnyCzas();

        Pracownik p3 = new Pracownik(zawod, leczenie, rower, literatura);
        p3.printZawod();
        p3.pracowac.pracuj();
        p3.dojezdzac.dojezdzaj();
        p3.spedzanieWolnegoCzasu.wolnyCzas();
    }

}