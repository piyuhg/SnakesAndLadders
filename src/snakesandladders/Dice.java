/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package snakesandladders;
import java.util.Random;
/**
 *
 * @author PIYUSH GUPTA
 */
public class Dice {
   int roll(){
       return new Random().nextInt(6);
   }
}
