package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        if(!list.contains(target))return -1;
        int indice =0;
        if (list.get(indice).equals(target)){
            return indice;
        }

        return recursiveIndexOfByIndex(list,target,indice+1);
    }

    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        if (!list.contains(target))return -1;
        if (list.get(index).equals(target)) return index;
        return recursiveIndexOfByIndex(list,target,index+1);
    }

    public static int recursiveIndexOfEmpty(List<String> list) {
        int indice = 0;
        if(!list.contains(""))return -1;
        if(list.get(indice).equals("")) return indice;
        return recursiveIndexOfByIndex(list,"",indice+1);

    }

    public static int recursivePut(String target, List<String> list) {
        int indice =0;
        if(!list.contains(""))return -1;
        if(list.get(indice).equals("")){
            list.set(indice,target);

            return indice;
        }
        return recursiveIndexOfEmpty(list);

    }

    public static int recursiveRemove(List<String> list, String target) {
        if(!list.contains(target)) return 0;
        list.remove(target);
        return 1+recursiveRemove(list, target);
    }

    public static int recursiveSum(List<Integer> list) {
        int indice=0;
        int suma=0;
        if(list.isEmpty())return 0;

        int numero=list.get(indice);
        suma+=numero;

        List<Integer>list1 = new ArrayList<>(list);
        list1.remove(indice);

        return suma+recursiveSum(list1);
    }

    public static int recursiveFactorial(int n) {
        if (n==0)return 1;

        return n*recursiveFactorial(n-1);
    }

    public static int recursivePow(int base, int exponent) {
        if(exponent==0)return 1;

        return base*recursivePow(base,exponent-1);
    }

    public static int recursiveFibonacci(int n) {
        if(n==0)return 0;
        if(n==1)return 1;

        return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
    }

    public static boolean recursivePalindrome(String word) {
        if(word.length()<=1)return true;
        if(word.charAt(0) != word.charAt(word.length()-1)){
            return false;
        }
        return recursivePalindrome((word.substring(1, word.length() - 1)));

    }


}
