public class Array {
    public static void main(String[] args) {

        String[] stringArray = new String[2];

        stringArray[0] = "Haryanda";
        stringArray[1] = "Alfitroh";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        String[] namaNama = {
                "Haryanda", "Alfitroh"
        };
        System.out.println(namaNama[0]);
        System.out.println(namaNama.length);


        String[][] members = {
                {"Haryanda", "Alfitroh"},
                {"Budi", "Joko"},
                {"Wahyudi"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][1]);
    }
}
