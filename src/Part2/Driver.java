// Dorcas Kumbu Buthidi 40224424
// COMP249
// Assignment 2
// Part 2
// Due Date: March 4, 2023 

package Part2;

import Part1.Package1.WheeledTransportation;
import Part1.Package2.Train;
import Part1.Package2.Tram;
import Part1.Package3.Metro;
import Part1.Package4.Monowheel;
import Part1.Package5.Aircraft;
import Part1.Package5.WorldWarIIAirplane;
import Part1.Package6.Ferry;

public class Driver{
    /**
     * 
     * @param arr
     */
    public static void copyTheObjects(Object[] arr){

        System.out.println("Passed array: \n");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        //create an array of the same length as the passed array
        Object[] copyArr = new Object[]{arr.length};

        //copy all objects from the passed array to a new array 
        copyArr = arr;

        //return the new array 
        System.out.println("\n");
        System.out.println("\nContents of new array: \n"); 
        for (int i=0; i < copyArr.length; i++){
              System.out.println(copyArr[i] + " ");
        }

    }

    public static void main(String args[]){
        /**
         * This is the main method of the program
         */
        
        WheeledTransportation w1 = new WheeledTransportation();
        WheeledTransportation w2 = new WheeledTransportation(4, 100.0);
        WheeledTransportation w3 = new WheeledTransportation(w2);


        Train t1 = new Train();
        Train t2 = new Train(4, 100.0, 10, "Toronto", "Montreal");
        Train t3 = new Train(t2);


        Tram tr1 = new Tram();
        Tram tr2 = new Tram(4, 100.0, 10, "Toronto", "Montreal", 100, 2023);
        Tram tr3 = new Tram(tr2);

     
        Metro m1 = new Metro();
        Metro m2 = new Metro(4, 100.0, 10, "Toronto", "Montreal", 100);
        Metro m3 = new Metro(m2);


        Monowheel mo1 = new Monowheel();
        Monowheel mo2 = new Monowheel(1, 100.0, 100.0);
        Monowheel mo3 = new Monowheel(mo2);

    
        Aircraft a1 = new Aircraft();
        Aircraft a2 = new Aircraft(800, 1000.0);
        Aircraft a3 = new Aircraft(a2);
        

        WorldWarIIAirplane ww1 = new WorldWarIIAirplane();
        WorldWarIIAirplane ww2 = new WorldWarIIAirplane(50000, 3000.0, false);
        WorldWarIIAirplane ww3 = new WorldWarIIAirplane(ww2);


        Ferry f1 = new Ferry();
        Ferry f2 = new Ferry(4, 100.0);
        Ferry f3 = new Ferry(f2);


        Object[] arr1 = new Object[]{w1, w2, w3, t1, t3, tr1, tr2, tr3, m1, m2, m3, mo1, mo3, a1, a2, a3, ww1, ww3, f1, f3};
    
        copyTheObjects(arr1);
        

    }
}