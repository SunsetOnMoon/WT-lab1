package task8;

import task8.service.InsertSequence;

import java.util.ArrayList;

public class App
{
    public static void main(String[] args) {
        InsertSequence insertSequence = new InsertSequence();
        ArrayList<Integer> a = insertSequence.initArray();
        ArrayList<Integer> b = insertSequence.initArray();
        insertSequence.getInsertedIndexes(a, b);
    }
}
