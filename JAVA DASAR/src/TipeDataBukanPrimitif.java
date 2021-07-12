public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        
        Integer iniInteger = 56;
        Long iniLong = 999L;
        
        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 99;
        System.out.println(iniByte);

        int iniInt = 34;
        Integer iniInteger2 = iniInt;
        int iniObject = iniInteger2;

        short shortObject = iniInteger2.shortValue();
        long longObject = iniInteger2.longValue();



    }
}
