public enum Mobile {
    APPLE(100), SAMSUNG, HTC(90), NOKIA(60), OPPO(55), REALME(35);

    int price;

    Mobile(){
        price = 80;
        System.out.println("Constructor");
    }

    Mobile(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
