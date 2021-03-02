package lab1.Task6;

public class Pracownik {
    public String zawod;
    public Pracowac pracowac;
    public Dojezdzac dojezdzac;
    public SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    public Pracownik(String zawod,Pracowac pracowac, Dojezdzac dojezdzac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu){
        this.zawod = zawod;
        this.pracowac = pracowac;
        this.dojezdzac = dojezdzac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
    }
    public void printZawod(){
        System.out.println(this.zawod);
    }
}
