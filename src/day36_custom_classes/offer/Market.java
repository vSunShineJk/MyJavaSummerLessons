package day36_custom_classes.offer;

import java.util.ArrayList;
import java.util.Arrays;

public class Market {
    public static void main(String[] args) {
        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(new Offer("Amazon", "San Diego", 120_000, true,15));
        allOffers.add(new Offer("Chase", "Chicago", 125_000, true,15));
        allOffers.add(new Offer("Google", "Seattle", 170_000, false,0));
        allOffers.add(new Offer("Accenture", "Chicago", 110_000, false,5));
        allOffers.add(new Offer("Walmart", "Chicago", 125_000, false,0));
        allOffers.add(new Offer("Meta", "Seattle", 135_000, true,12));
        allOffers.add(new Offer("Deloitte", "Seattle", 170_000, false,0));

        ArrayList<Offer> localOffers = new ArrayList<>(allOffers);
        localOffers.removeIf(offer -> offer.location.equals("Chicago"));
        System.out.println(localOffers);

//        for (Offer each : allOffers){
//            if (each.location.equals("Chicago")){
//                System.out.println(each);
//            }
//        }

        System.out.println();
        ArrayList<Offer> onlyFullTime = new ArrayList<>(allOffers);
        onlyFullTime.removeIf(p -> !p.isFullTime);
        System.out.println(onlyFullTime);

        System.out.println();
        ArrayList<Offer> minSalary = new ArrayList<>(allOffers);
        minSalary.removeIf(p -> p.salary < 130_000);
        System.out.println(minSalary);

        System.out.println();
        double min = allOffers.get(0).salary;
        double max = allOffers.get(0).salary;
        Offer maxOffer = allOffers.get(0);
        Offer minOffer = allOffers.get(0);

        for (Offer each : allOffers){
            if (each.salary > max){
                max = each.salary;
                maxOffer = each;
            }
            if (each.salary < min){
                min = each.salary;
                minOffer = each;
            }
        }
        System.out.println("Min salary: " +  min);
        System.out.println("Min obj: " + minOffer);
        System.out.println("Max salary: " + max);
        System.out.println("Max obj: " + maxOffer);
    }
}
