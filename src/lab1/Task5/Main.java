package lab1.Task5;

public class Main {
    public static void main(String[] args) {
        PolandVat p = new PolandVat();
        GermanyVat g = new GermanyVat();
        EnglandVat e = new EnglandVat();

        System.out.println("Cena produktu bez podatku wynosi 50 złotych.");
        OnlineShop onlineShop = new OnlineShop(p);
        System.out.println("Standardowy Vat w Polsce wynosi 23% - w tym kraju za ten produkt zapłacimy: " + onlineShop.vat.vat(50) + " złotych");

        onlineShop.vatSystem(g);
        System.out.println("Standardowy Vat w Niemczech wynosi 19% - w tym kraju za ten produkt zapłacimy: " + onlineShop.vat.vat(50) + " złotych");

        onlineShop.vatSystem(e);
        System.out.println("Standardowy Vat w Angli wynosi 20% - w tym kraju za ten produkt zapłacimy: " + onlineShop.vat.vat(50) + " złotych");
    }
}