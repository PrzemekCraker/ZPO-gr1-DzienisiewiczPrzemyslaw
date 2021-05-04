package lab6.Task4;

import java.util.Arrays;

public class App {
    String text;
    String[] operations;
    Facade font;

    public App(String[] args)
    {
        if(args.length > 0){
            this.text = args[0];
            this.operations = subArray(args, 0, args.length);
            this.font = new Facade();
        }
    }
    public static<T> T[] subArray(T[] array, int beg, int end)
    {
        return Arrays.copyOfRange(array, beg, end);
    }

    public void exec()
    {
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("bold")){
                font.uBold(text);
            } else if (operations[i].equals("cursive")){
                font.uCursive(text);
            } else {
                System.out.println("error");
            }
        }
    }
}