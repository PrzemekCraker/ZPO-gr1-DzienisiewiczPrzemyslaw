package lab2.Task4;

public class Customer {
    Lang lang;
    Ad advert;
    public Customer(Lang lang, Ad advert)
    {
        this.lang = lang;
        this.advert = advert;
    }

    public void lang(Lang jezykReklamy)
    {
        lang = jezykReklamy;
    }
    public void setLang()
    {
        lang.display();
    }

    public void reklama(Ad nowaReklama)
    {
        advert = nowaReklama;
    }
    public void setAdvert()
    {
        advert.display();
    }
}