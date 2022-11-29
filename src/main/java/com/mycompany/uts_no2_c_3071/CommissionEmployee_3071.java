/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3071;

/**
 *
 * @author badnoby
 */
public class CommissionEmployee_3071 extends Employess_3071{
    public float Komisi_3071;
    public float TotalPenjualan_3071;
    public float Totalgaji_3071;
    
    public CommissionEmployee_3071(){
        
    }
    
    public float TotalGaji_3071(){
        Totalgaji_3071 = GajiPokok_3071 + (Komisi_3071 * TotalPenjualan_3071);
        return Totalgaji_3071;
    }
    
    public void TampilData_3071(){
        System.out.println("Commission Employee");
        Tampil_3071();
        System.out.println("Total Gaji: " + Totalgaji_3071);
    }
}
