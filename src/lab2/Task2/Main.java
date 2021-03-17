package lab2.Task2;

public class Main {
    public static void main(String[] args) {
        DolbyDigital dd = new DolbyDigital();
        DolbyProLogic dpl = new DolbyProLogic();
        Audio x = new Audio(7);
        x.automaticlyChoseCodec();
        x.getCodecDetails();

        x.changeCodec(dpl);
        x.getCodecDetails();
    }
}