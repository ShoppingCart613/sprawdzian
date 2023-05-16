import java.util.Objects;

import static java.lang.Math.sqrt;

/**
 RownanieKwadratowe - Klasa wykonująca równania kwadratowe
 a,b,c - pola liczbowe do wykonania równań

 @author: Erwin,Łukasik

 **/

public class RownanieKwadratowe {
    private final double a,b,c;

    public RownanieKwadratowe(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double delta(){
        double x=b*b-(4*a*c);
        if(x<0){
            return 0.0;
        }if(x==0){
            return b*-1/2*a;
        }else{
            return b*-1+sqrt(x)/2*a + b*-1-sqrt(x)/2*a;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RownanieKwadratowe that)) return false;
        return a == that.a && b == that.b && c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return
                a +
                "x^2 + " + b +
                "x + " + c
                ;
    }
}
