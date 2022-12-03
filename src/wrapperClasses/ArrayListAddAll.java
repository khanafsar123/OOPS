package wrapperClasses;

import java.util.ArrayList;

public class NonGeneric {
    public static void main(String[] args) {

        ArrayList<String> makeUpItem= new ArrayList<>();
        makeUpItem.add("blush");
        makeUpItem.add("base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("lipstick");

        ArrayList<String> cosmatics=new ArrayList<>();
        cosmatics.add("Dove Soap");
        cosmatics.add("conditioner");
        cosmatics.add("shampoo");
        cosmatics.add("lotion");

        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmatics);
        System.out.println(beautyProducts);


        }}
