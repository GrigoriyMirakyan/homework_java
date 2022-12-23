class HwS4 {

    public static void main(String[] args) {
        int a = 2;
        int b = 12;
        int n = 0;
        int temp = 0;
        while (a != b){
            if (a * 2 < b) {
                a = mult(a);
                temp = a;
                continue;
            }
            else {
                a = plus(a);

            }
            if (a == b) {
                n = n + 1;
                a = temp;
                temp = temp / 2;
                while (a * 2 > b) {
                    if (a * 2 < b) {
                        a = plus(a);
                        temp = a;
                    }
                    else {
                        a = a - 1;
                    }
                    if(a * 2 < b){
                        a = mult(a);
                        temp = a;
                    }
                    else {
                        a = temp;
                    }
                }
                break;
            }
        }

    }
    public static int plus(int a){
        return a + 1;
    }
    public static int mult(int a){
        return a * 2;
    }
}

