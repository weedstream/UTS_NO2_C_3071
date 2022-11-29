/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3071;

/**
 *
 * @author badnoby
 */
public class ProjectPlanner_3071 extends Employess_3071{
    public float Komisi_3071;
    public float TotalHslProyek_3071;
    public double Totalgaji_3071;
    
    public ProjectPlanner_3071(){
        
    }
            
    public double TotalGaji_3071(){
        Totalgaji_3071 = GajiPokok_3071 + (Komisi_3071 * TotalHslProyek_3071) - (GajiPokok_3071 *5/100);
        return Totalgaji_3071;
    }
    
    public void TampilData_3071(){
        System.out.println("Project Plannner");
        Tampil_3071();
        System.out.println("Total Gaji: " + Totalgaji_3071);
    }
}
