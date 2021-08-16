package com.mitocode.java8.lambda;

public class Scope {

    private static double atributo1;
    private double atributo2;

    public double probarLocalVariable() {
        final double n3 = 3;
        Operacion op = new Operacion() {
            @Override
            public double calcular(double n1, double n2) {
                return n1 + n2 + n3;
            }
        };

        Operacion operacion = (x, y) -> {
            return x + y + n3;
        };
        return operacion.calcular(1, 1);
    }

    public double probarAtributosStaticVariables() {

        Operacion operacion = (x,y) -> {
            return (x+y);
        };

        return operacion.calcular(3,2);
    }

    public static void main(String[] args) {
        Scope app = new Scope();
        System.out.println(app.probarLocalVariable());
    }
}
