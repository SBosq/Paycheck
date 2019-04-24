import java.util.Scanner;
/**
 * Diseñar un programa que calcule el salario semanal de un empleado
 * al que se le paga por hora. Suponiendo que la compañía paga las horas extras
 * con una tarifa una y media veces mayor que la tarifa normal, y que dichas horas
 * son todas las que excedan las primeras horas trabajadas.
 * Sea la tarifa por hora la cantidad de $20.00, este dato
 * debe ser suministrado desde el teclado, el programa debe permitir
 * al usuario indicar la cantidad de horas que el empleado trabajo también,
 * desde el teclado. Mostrar como resultado final: el número de horas trabajadas,
 * el sueldo por hora y sueldo total del empleado. 
 *
 * Saulo Bosquez
 * v1.1
 */
public class Paycheck
{
    static final double reg_hrs = 40;
    public static void main (String arg[])
    {
        double pay, hrs, total1, total2, extra_hrs, ot;
        
        Scanner datos = new Scanner(System.in);
        
        System.out.print('\u000c');
        
        System.out.println("Ingrese las horas trabajadas: ");
        hrs = datos.nextDouble();
        
        System.out.println("Ingrese la tarifa por hora: ");
        pay = datos.nextDouble();
        
        if (pay > 20)
        {
           System.out.println("La tarifa por hora no puede ser mayor que $20.00 ");
        }
        else
        {
            if (hrs <= 40)
            {
                total1 = hrs * pay;
                System.out.println("Las número de horas trabajadas son: " +hrs);
                System.out.println("El sueldo por hora es: " +pay);
                System.out.println("El sueldo total del empleado es: " +total1);
            }
            else
            {
                extra_hrs = hrs - 40;
                ot = extra_hrs * (pay * 1.5);
                total1 = reg_hrs * pay;
                total2 = total1 + ot;
                System.out.println("Las número de horas trabajadas son: " +hrs);
                System.out.println("El sueldo por hora es: " +pay);
                System.out.println("El sueldo total del empleado es: " +total2);
            }
        }
    }
}
