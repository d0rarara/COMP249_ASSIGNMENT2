package Part1.Package6;

import Part1.Package1.WheeledTransportation;
import Part1.Package2.Train;
import Part1.Package2.Tram;
import Part1.Package3.Metro;
import Part1.Package4.Monowheel;
import Part1.Package5.Aircraft;
import Part1.Package5.WorldWarIIAirplane;

public class Driver{
    public static void main(String args[]){
        WheeledTransportation w1 = new WheeledTransportation();
        WheeledTransportation w2 = new WheeledTransportation(4, 100.0);
        WheeledTransportation w3 = new WheeledTransportation(w2);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        Train t1 = new Train();
        Train t2 = new Train(4, 100.0, 10, "Toronto", "Montreal");
        Train t3 = new Train(t2);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        Tram tr1 = new Tram();
        Tram tr2 = new Tram(4, 100.0, 10, "Toronto", "Montreal", 100, 2023);
        Tram tr3 = new Tram(tr2);

        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr3);

        Metro m1 = new Metro();
        Metro m2 = new Metro(4, 100.0, 10, "Toronto", "Montreal", 100);
        Metro m3 = new Metro(m2);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        Monowheel mo1 = new Monowheel();
        Monowheel mo2 = new Monowheel(1, 100.0, 100.0);
        Monowheel mo3 = new Monowheel(mo2);

        System.out.println(mo1);
        System.out.println(mo2);
        System.out.println(mo3);

        Aircraft a1 = new Aircraft();
        Aircraft a2 = new Aircraft(3, 1000.0);
        Aircraft a3 = new Aircraft(a2);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        WorldWarIIAirplane ww1 = new WorldWarIIAirplane();
        WorldWarIIAirplane ww2 = new WorldWarIIAirplane(0, 0, false);
        WorldWarIIAirplane ww3 = new WorldWarIIAirplane(ww2);

        System.out.println(ww1);
        System.out.println(ww2);
        System.out.println(ww3);

        Ferry f1 = new Ferry();
        Ferry f2 = new Ferry(4, 100.0);
        Ferry f3 = new Ferry(f2);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        

        System.out.println("\nTesting equals method:");
        System.out.println(w1.equals(f2));
        System.out.println(w1.equals(w2));
        System.out.println(w2.equals(w3));
        System.out.println(t1.equals(t2));
        System.out.println(w1.equals(tr1));

        Object[] arr1 = new Object[]{w1, w2, w3, t2, t3, tr1, tr2, tr3, m1, m2, m3, mo2, mo3, a1, a2, a3, ww2, ww3, f1, f2};
        Object[] arr2 = new Object[]{w1, w2, w3, t1, t2, t3, tr1, tr2, tr3, m1, m2, m3, mo1, mo2, mo3, f1, f2, f3};

        findLeastAndMostExpensiveAircraft(arr1);
        findLeastAndMostExpensiveAircraft(arr2);
    }

    public static void findLeastAndMostExpensiveAircraft(Object[] arr){
        double highestPrice = -1000000;
        System.out.println("Initialize highestPrice to " + highestPrice);
        double lowestPrice = 1000000000;
        System.out.println("Initialize lowestPrice to " + highestPrice);

        int mostExpensive = -1;
        int leastExpensive = -1;
        
        for(int i = 0; i < arr.length; i++){
            // check if Aircraft
            System.out.println("Checking if object " + i + " is an aircraft.");
            if(arr[i] instanceof Aircraft){
                System.out.println("Object " + i + " is an aircraft.");
                // create variable of type Aircraft
                Aircraft aircraft = (Aircraft) arr[i];
                
                // check if most expensive 
                System.out.println("Checking if price of aircraft " + i + " is higher than highest price so far...");
                if (aircraft.getPrice() > highestPrice) {
                    highestPrice = aircraft.getPrice();
                    System.out.println("Updating current highest price to: " + highestPrice);
                    System.out.println("New highest price index is: " + i);
                    mostExpensive = i;
                } else {
                    System.out.println("It was not.");
                }
                
                // check if least expensive
                System.out.println("Checking if price of aircraft " + i + " is lower than lowest price so far...");
                if (aircraft.getPrice() < lowestPrice) {
                    lowestPrice = aircraft.getPrice();
                    System.out.println("Updating current lowest price to: " + lowestPrice);
                    System.out.println("New lowest price index is: " + i);
                    leastExpensive = i;
                } else {
                    System.out.println("It was not.");
                }

            } else {
                System.out.println("Object " + i + " is not an aircraft.");
            }
        }
        // find info of aircraft objects
        if (mostExpensive != -1) {
            if (mostExpensive == leastExpensive) {
                // if only one aircraft exists -> least and most expensive
                System.out.println("Only one aircraft exists: " + arr[mostExpensive]);
            } else {
                System.out.println("Most Expensive aircraft is: " + arr[mostExpensive]);
                System.out.println("Least expensive aircraft is: " + arr[leastExpensive]);
            }
        } else {
            // if no aircrafts exist -> display message to that effect
            System.out.println("No aircrafts");
        }

    }
}