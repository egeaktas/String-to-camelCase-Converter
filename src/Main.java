import java.util.*;
import java.io.*;

class Main {

    public static String StringChallenge(String str) {
        // All characters except alphabetic characters are deleted and replaced with a space character.
        // Alfabetik karakterler hariç bütün karakterleri silip yerlerini boşluk karakterini koydum.
        str = str.replaceAll("[^a-zA-Z]", " ");
        //
        String[] splitted = str.split(" ");
        // I made the first letter of the substrings in all the indexes uppercase and the other letters lowercase except the first index.
        // İlk index hariç bütün indexlerin ilk harfini büyük, diğerlerini küçük yaptım. İlk indeksin hepsini küçüğe çevirdim.
        for(int i = 0; i<splitted.length; i++){
            if(i == 0){
                splitted[i] = splitted[i].toLowerCase();
            }else{
                splitted[i] = splitted[i].toLowerCase();
                String firstLetter = splitted[i].substring(0, 1);
                firstLetter = firstLetter.toUpperCase();
                // Concatenation
                // Birleştirme
                splitted[i] = firstLetter + splitted[i].substring(1, splitted[i].length());
            }
        }
        // Concatenation
        // Birleştirme
        String newstr = "";
        for(int i = 0; i<splitted.length; i++){
            newstr+=splitted[i];
        }
        return newstr;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}