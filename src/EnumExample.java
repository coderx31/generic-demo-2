public class EnumExample {
    public static void main(String[] args) {
//        System.out.println(Mobile.APPLE);
        Mobile m = Mobile.SAMSUNG;

//        switch (m){
//            case APPLE:
//                System.out.println("Apple is the best!");
//                break;
//            case SAMSUNG:
//                System.out.println("1st copy of apple");
//                break;
//        }

//        System.out.println(Mobile.APPLE.getPrice());
//        System.out.println(Mobile.SAMSUNG.getPrice());

        Mobile[] mobiles = Mobile.values();
        for(Mobile mobile : mobiles){
            System.out.println(mobile);
        }
    }
}
