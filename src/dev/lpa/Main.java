package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        String[] names = new String[] {"Kipngeno","Atieno","Adhiambo","Kipkirui","Kibet"};
        var namesAsList = Arrays.asList(names);

        namesAsList.set(0,"kevooo");

        System.out.println(namesAsList);
        System.out.println(Arrays.toString(names));

        namesAsList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(names));


        ArrayList<String> stringList = new ArrayList<> (List.of("Jan","Feb","Mar"));
        String[] stringArray = stringList.toArray( new String[0]);

        System.out.println(Arrays.toString(stringArray));
    }


}