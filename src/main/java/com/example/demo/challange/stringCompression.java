package com.example.demo.challange;

public class stringCompression {

    public String compressString(String input){
        if( input == null || input.length() < 1) return input;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i - 1) == input.charAt(i)){
                count++;
            } else {
                compressed.append(input.charAt(i-1)).append(count);
                count = 1;
            }
        }

        compressed.append(input.charAt(input.length()-1)).append(count);
        return compressed.toString();
    }

    // public static void main(String[] args){
    //     System.out.println("----------------------------------------");
    //     System.out.println("Output: "+compressString("abbcccc"));
    //     System.out.println("Output: "+compressString("abcc"));
    // }
}
