package aed;

class Debugging {
    
    boolean xor(boolean a, boolean b) {
        return (a || b) && !(a && b);
    }

    boolean iguales(int[] xs, int[] ys) {
        //chequear longitudes
        if (xs.length != ys.length)
            return false;

        //chequear posicion x posicion
        boolean res = true;

        for (int i = 0; i < xs.length; i++) {
            if (xs[i] != ys[i]) {
                res = false;
            }
        }
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;

        if (xs.length == 1)
            return true;

        for (int i = 0; i < xs.length - 1; i++) {
            if (xs[i] > xs[i + 1]) {
                res = false;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Debugging debug = new Debugging();
        boolean is = debug.ordenado(new int[] { 7, 7, 7 });
        System.out.println(is);
    }

    int maximo(int[] xs) {
        int res = xs[0];
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > res)
                res = xs[i];
        }
        return res;
    }

    boolean todosPositivos(int[] xs) {

        //chequear que sean enteros

        //chequear que sean positivos
        for (int x : xs) {
            if (x <= 0) {
                return false;
            }
        }
        return true;
    }
}


