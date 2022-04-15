package Strings;

import java.util.Scanner;

public class stringUppercase {
    public static String upperCase(String str ){
       char [] charArray=str.toCharArray();
       boolean isFoundSpace=true;
       for(int i=0;i<charArray.length;i++){
           if(Character.isLetter(charArray[i])){
               if(isFoundSpace){
                   charArray[i]=Character.toUpperCase(charArray[i]);
                   isFoundSpace=false;
               }
           }else{
               isFoundSpace=true;
           }
       }
       str=String.valueOf(charArray);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(upperCase(str));
    }
}
