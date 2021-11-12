import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;





// ENUNCIADO:

// Primers:

/* Digues si un nombre donat per teclat és primer o no. Un nombre és primer quan només és divisible per 1 i per ell mateix. (Ex:1, 2, 3, 5, 7, 11, 13, 17,...)

Si el nombre és primer escriu per pantalla TRUE i sinó FALSE.

Input Format

Nombre N enter.

Constraints

Suposem N enter positiu.

Output Format

Imprimeix { TRUE | FALSE }

Sample Input 0

17
Sample Output 0

TRUE
Sample Input 1

9
Sample Output 1

FALSE

 */





public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int i = 2;

        boolean isPrime = false;

        while (i <= num / 2)
        {
            if (num % i == 0)
            {
                isPrime = true;
                break;
            }

            ++i;
        }

        if (!isPrime)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
