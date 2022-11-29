/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.uts_no2_c_3071;

/**
 *
 * @author badnoby
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS_NO2_C_3071 {

    public static void main(String[] args) {
        SalariedEmployee_3071 SalEmpl_3071 = new SalariedEmployee_3071();
        CommissionEmployee_3071 ComEmpl_3071 = new CommissionEmployee_3071();
        ProjectPlanner_3071 ProPlan_3071 = new ProjectPlanner_3071();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            SalEmpl_3071.Nama_3071 = br.readLine();
            System.out.print("NIP: ");
            SalEmpl_3071.NIP_3071 = br.readLine();
            System.out.print("Gaji Pokok: ");
            SalEmpl_3071.GajiPokok_3071 = Float.parseFloat(br.readLine());
            SalEmpl_3071.TampilData_3071();
            
            System.out.print("Nama: ");
            ComEmpl_3071.Nama_3071 = br.readLine();
            System.out.print("NIP: ");
            ComEmpl_3071.NIP_3071 = br.readLine();
            System.out.print("GajiPokok: ");
            ComEmpl_3071.GajiPokok_3071 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ComEmpl_3071.Komisi_3071 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ComEmpl_3071.TotalPenjualan_3071 = Float.parseFloat(br.readLine());
            ComEmpl_3071.TotalGaji_3071();
            ComEmpl_3071.TampilData_3071();
            
            System.out.print("Nama: ");
            ProPlan_3071.Nama_3071 = br.readLine();
            System.out.print("NIP: ");
            ProPlan_3071.NIP_3071 = br.readLine();
            System.out.print("Gaji Pokok: ");
            ProPlan_3071.GajiPokok_3071 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ProPlan_3071.Komisi_3071 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            ProPlan_3071.TotalHslProyek_3071 = Float.parseFloat(br.readLine());
            ProPlan_3071.TotalGaji_3071();
            ProPlan_3071.TampilData_3071();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
