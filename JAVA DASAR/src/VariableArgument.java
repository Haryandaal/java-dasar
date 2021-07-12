public class VariableArgument {
    public static void main(String[] args) {

        sayCongrats("Haryanda", 89, 88, 90, 80, 55);



    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value: values) {
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
