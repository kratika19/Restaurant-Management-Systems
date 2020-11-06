/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author krati
 */
public class SuperClass_Parent
{
    public double vegChesseSandwich;
    public double farmhousePizza;
    public double specialBurger;
    public double hakkaNoodles;
    public double tandooriMomos;
    
    public double chocolateMilkshake;
    public double iceTea;
    public double oreoShake;
    public double kitkatShake;
    public double coldCoffee;
    
    public double Meals=0;
    public double Drinks=0;
    public double TotalOfMD=0;
    
    public double AllTotalofMD=0;
    
    public double GetAmount()
    {
        Meals = vegChesseSandwich + farmhousePizza + specialBurger + hakkaNoodles + tandooriMomos ;
        Drinks = chocolateMilkshake + iceTea + oreoShake + kitkatShake + coldCoffee; 
        TotalOfMD = Meals + Drinks;
        AllTotalofMD = TotalOfMD;
        return AllTotalofMD;
    }
    
    private JFrame frame; 
    
    public void iExitSystem()
    {
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "CONFIRM IF YOU WANT TO EXIT", "Restaurant Management Systems", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
          System.exit(0);              
        }
      
    }
    //=================price===================================
    public double pvegChesseSandwich = 120;
    public double pfarmhousePizza = 350;
    public double pspecialBurger = 80;
    public double phakkaNoodles = 170;
    public double ptandooriMomos = 150;
    
    public double pchocolateMilkshake = 190;
    public double piceTea = 90;
    public double poreoShake = 210;
    public double pkitkatShake = 250;
    public double pcoldCoffee = 150 ;
    //================================================================
    
    public double mcTax = 0.90;
    
    public Double cFIndTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }

}












