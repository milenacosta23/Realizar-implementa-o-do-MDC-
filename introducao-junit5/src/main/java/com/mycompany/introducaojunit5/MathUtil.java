/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducaojunit5;

/**
 *
 * @author patricia
 */

public class MathUtil {
  public static int mdd(int a, int b){
      //codigo propiedade 7
     a = Math.abs(a);
     b = Math.abs(b);
      //propiedade 6 
      final int maior = Math.max(a, b);
      b = Math.min(a, b);
      a = maior;
      
      //odigo propiedade 1
      if(b > 0 && a % b == 0){
          return b;
      }
      //codigo propiedade 3
      if(b == 0){
          return Math.abs(a);
      }
      //c0digo propiedade 5
      if (a % b != 0){
      return 1;
      
      }
  return -1;
  
  
  }
}
