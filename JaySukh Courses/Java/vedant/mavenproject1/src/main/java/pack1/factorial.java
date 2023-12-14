/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack1;

/**
 *
 * @author Rutaben
 */
public class factorial 
{
    public long findfactorial(int no)
		{
				int i;
				long fact=1;
				for(i=1;i<=no;i++)
				{
					fact=fact*i;
				}
				return fact;
			}

    
}
