package com.application.calderon.SignsLenguage.Utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.application.calderon.SignsLanguage.Adapters.AdapterAbc;
import com.application.calderon.SignsLanguage.Models.Letter;
import com.application.calderon.SignsLanguage.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Calderon on 09/11/2017.
 */

public class Util{

    public static boolean letterCompleted;
    public static String positionLetter;


    public static void goScreen(Context context, Class<?> anyClass ){
        Intent intent = new Intent(context,anyClass);
        context.startActivity(intent);
    }

    public static void nextScreen(Context context,Class<?> anyClass ){
        Intent intent = new Intent(context,anyClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }

    public static List<Letter> getAllLetters(){
        return new ArrayList<Letter>(){
            {
                add(new Letter("A"));
                add(new Letter("B"));
                add(new Letter("C"));
                add(new Letter("D"));
                add(new Letter("E"));
                add(new Letter("F"));
                add(new Letter("G"));
                add(new Letter("H"));
                add(new Letter("I"));
                add(new Letter("J"));
                add(new Letter("K"));
                add(new Letter("L"));
                add(new Letter("M"));
                add(new Letter("N"));
                add(new Letter("Ñ"));
                add(new Letter("O"));
                add(new Letter("P"));
                add(new Letter("Q"));
                add(new Letter("R"));
                add(new Letter("S"));
                add(new Letter("T"));
                add(new Letter("U"));
                add(new Letter("V"));
                add(new Letter("W"));
                add(new Letter("X"));
                add(new Letter("Y"));
                add(new Letter("Z"));
            }
        };
    }

    public static List<String> getAllNumbers(){
        return new ArrayList<String>(){
            {
                for (int i =0;i<=100;i++){
                    if(i<=10)
                        add(i+"");
                    //if(i==20 || i==30 || i==40 || i==50 || i==60 || i==70 || i==80 || i==90 || i==100 )
                    //add(i+"");
                }
            }
        };
    }

    public static boolean getStatusLetter(SharedPreferences preferences) {
        return preferences.getBoolean("status",letterCompleted);
    }

    public static void saveStatusLetter(SharedPreferences preferences){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("status",letterCompleted);
        editor.apply();
    }


}
