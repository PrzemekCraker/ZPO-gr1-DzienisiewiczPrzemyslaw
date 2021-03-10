package lab2.Task4;

public class Main {
    public static void main(String[] args)
    {
        Polish pol = new Polish();
        English eng = new English();
        German ger = new German();
        VoiceMessage voice = new VoiceMessage();
        SMSmessage sms = new SMSmessage();
        ElectronicLetter letter = new ElectronicLetter();

        Customer third = new Customer(pol,sms);
        third.lang.display();
        third.advert.display();
        System.out.println();

        Customer second = new Customer(eng,voice);
        second.lang.display();
        second.advert.display();
        System.out.println();

        Customer first = new Customer(ger,letter);
        first.lang.display();
        first.advert.display();
        System.out.println();
    }
}
