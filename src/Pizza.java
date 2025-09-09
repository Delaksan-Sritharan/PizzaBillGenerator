public class Pizza {
    private int price;
    private Boolean veg;

    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;

        }
    }

}
