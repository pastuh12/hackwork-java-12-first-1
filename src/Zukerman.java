public class Zukerman {
    int[] value;

    public Zukerman(int[] value) {
        this.value = value;
    }

    public void isVerify() {
        int numeral = 0;
        int digitsProd = 1;
        boolean isVerify = false;

        for (int j = 0; j < this.value.length; j++) {
            digitsProd = digitsProd * this.value[j];
        }

        for (int i = 0; i < this.value.length; i++){
            numeral += this.value[i] * Math.pow(10, this.value.length - i - 1);
        }

        if (numeral % digitsProd == 0){
            isVerify = true;
        }

        Logger.out(isVerify, numeral);
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
    }
}
