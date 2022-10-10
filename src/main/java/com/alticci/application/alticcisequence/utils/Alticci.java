package com.alticci.application.alticcisequence.utils;

import java.util.ArrayList;
import java.util.List;

public class Alticci {

    public static int alticci(int n){
        if (n < 2)
            return n;
        else if (n == 2)
            return 1;
        else
            return alticci(n - 3) + alticci(n - 2);
    }

    public static List<Integer> alticciIterator(int n){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            list.add(alticci(i));
        }
        return list;
    }

}
