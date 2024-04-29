package aed;

class Funciones {
    int cuadrado(int x) {
        
        return x*x;
    }

    double distancia(double x, double y) {
        double x2 = x * x;
        double y2 = y * y;
        return Math.sqrt(x2 + y2);
    }

    boolean esPar(int n) {
        
        return n % 2 == 0;
    }

    boolean esBisiesto(int n) {
        boolean isBis = false;
        if (esMultiplo(n, 4) && !esMultiplo(n, 100) || esMultiplo(n, 400)) {
            isBis = true;
        }
        return isBis;
    }

    //aux 
    boolean esMultiplo(int x, int y) {
        return x % y == 0;
    }



    int factorialIterativo(int n) {
        if (n == 0) return 1;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        
        return res;
        
    }

    int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }

    boolean esPrimo(int n) {

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (esMultiplo(n, i)) {
                return false; 
            }
        }

        return true;
    }

    int sumatoria(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma;
    }

    int busqueda(int[] numeros, int buscado) {
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado)
                return i;
        }

        return -1;

    }

    boolean tienePrimo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                return true;
            }
        }

        return false;
    }

    boolean todosPares(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (!esPar(numeros[i])) {
                return false;
            }
        }

        return true;
    }
    

    boolean esPrefijo(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }


    //true si s2 termina con s1
    // "edcba", "gfedcba" true
    boolean esSufijo(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        int inicioComparacion = s2.length() - s1.length();

        for (int i = 0; i < s1.length(); i++) {
            if (s2.charAt(inicioComparacion + i) != s1.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
