package lab2.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Random {
    Sorting sorting;
    public Random(Sorting sort){
        this.sorting = sort;
    }
    public void setAlg(Sorting sort){
        this.sorting = sort;
    }
    public ArrayList<Duck> sort(ArrayList<Duck> arrayList){
        return this.sorting.Sort(arrayList);
    }

    public ArrayList<Duck> mix(ArrayList<Duck> arrayList){
        Collections.shuffle(arrayList);
        return arrayList;
    }
    public void print(ArrayList<Duck> arrayList){
        for(Duck duck : arrayList){
            duck.printName();
        }
    }
    public Duck[] sort(Duck[] array){
        return this.sorting.Sort(array);
    }
    public Duck[] mix(Duck[] array){
        List<Duck> arrayList = Arrays.asList(array);
        Collections.shuffle(arrayList);
        return arrayList.toArray(array);
    }
    public void print(Duck[] array){
        for(Duck duck : array){
            duck.printName();
        }
    }
}