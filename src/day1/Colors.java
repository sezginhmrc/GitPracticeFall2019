package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colors {

    public static void main(String[] args) {

        String [] colors = {"Manchester is RED ! ", "NOT BLUE", "GIRESUN IS GREEN", "BLACK","WHITE","YELLOW"};

        System.out.println("MY COLORS");

        System.out.println(Arrays.toString(colors));


        List<String> listofColors = new ArrayList<>(Arrays.asList(colors));

        if(listofColors.get(2).contains("GIRESUN")){
            System.out.println("COLOR IS GREAT");
        } else {
            System.out.println("ORDU KUMEYE ");
        }
        
        String ss = listofColors.get(1) ;
        String s1 = listofColors.get(4);
        System.out.println(s1);

    }
}
