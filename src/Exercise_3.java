public class Exercise_3 {
    public static void main(String[] args) {
        System.out.println("Exercise 3");
double perimeter = perimetroRettangolo(5.5 , 6.5);
        System.out.println(perimeter);
        int tryout = pariDispari(2);
        System.out.println(tryout);
        double triangle = perimetroTriangolo(2.5, 3.5, 3.5);
        System.out.println(triangle);
    }
    public static double perimetroRettangolo(double num1, double num2)
    {return (num1 + num2) * 2;}
    public static int pariDispari(int num)
    { return num %2;}

    public static double perimetroTriangolo(double num1, double num2, double num3)
    { double p =(num1+num2+num3) / 2;
        return Math.sqrt(p*(p-num1)*(p-num2)*(p-num3));}

        }


