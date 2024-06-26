package aed;

class Main {
    int fibonacci(int n) {
        int res;

        if (n == 0) {
            res = 0;
        } else if (n == 1) {
            res = 1;
        } else {
            res = fibonacci(n - 2) + fibonacci(n - 1);
        }

        return res;
    }


    int fibonacciReturn(int n) {
        return (n == 0) ? 0 : (n == 1) ? 1 : fibonacciReturn(n - 2) + fibonacciReturn(n - 1);
    }

    // Revisar, no pasa los tests
    double maximo(double[] xs) {
        double res = xs[0];

        for (double x : xs) {
            // Si encuentro un elemento mayor al que tenía guardado, me lo guardo
            if (x > res) {
                res = x;
            }
        }

        return res;
    }

    int[] sumarArreglos(int[] seq1, int[] seq2) {
        int[] res = new int[seq1.length];

        for (int i = 0; i < seq1.length; i++) {
            // Revisar el error
            res[i] = seq1[i] + seq2[i];
        }

        return res;
    }

    String iniciales(String texto) {
        String res = "";
        for (int i = 0; i < texto.length(); i++) {
            if (i == 0 || (texto.charAt(i-1) == ' ' && texto.charAt(i) != ' ')) {
                res += texto.charAt(i);
            }
        }
        return res;
    }
}