package lab2.Task2;

public class Audio {
    Descrambler desc;
    int soundCombination;
    public Audio(int soundCombination){
        this.soundCombination = soundCombination;
    }
    public void automaticlyChoseCodec(){
        if(soundCombination <= 5) //Dolby Pro Logic works with channels from 5.1, 6.1...
            this.desc = new DolbyProLogic();
        else
            this.desc = new DolbyDigital();
    }
    public void changeCodec(Descrambler desc){
        this.desc = desc;
    }
    public void getCodecDetails(){
        this.desc.codecType();
    }
}
