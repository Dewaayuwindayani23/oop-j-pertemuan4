/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan402;

/**
 *
 * @author LAB F
 */
public class Pertemuan402 {
    public static String[][] meja = new String[2][2];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        meja[0][0] = "Data brs 0 klm 0";
        meja[0][1] = "Data brs 0 klm 1";
        
        meja[1][0] = "Data brs 1 klm 0";
        meja[1][1] = "Data brs 1 klm 1";
        
        for(int brs=0;brs<2;brs++){
            for(int klm=0; klm<2;klm++){
        System.out.println("Posisi"+brs+":"+klm+" ="+ meja[brs][klm]);
                }
         }
    }
    
}
