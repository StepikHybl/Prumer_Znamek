package com.example.test1_11;

public class Button_Convert {
    public static double prumer(String pole){
        String[] znamky = pole.split(",");
        double result = 0;
        for (int i = 0; i< znamky.length; i++){
            result += Integer.parseInt(znamky[i]);
            if(i == znamky.length - 1){
                result /= i + 1;
            }
        }
        return result;
    }
}
