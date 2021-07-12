public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Haryanda", "Alfitroh", "Bani",
                "Raju", "Ayah", "Bunda"
        };

        for (var i = 0; i < names.length; i++ ) {
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        for (var name: names){
            System.out.println(name);
        }
    }
}
