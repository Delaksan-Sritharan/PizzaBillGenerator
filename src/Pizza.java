public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;

    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        System.out.println("Extra Cheese Added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        System.out.println("Extra Toppings Added");
        this.price += extraToppingsPrice;

    }

    public void takeAway(){
        System.out.println("Take Away Opted");
        this.price += backPackPrice;

    }

    public void getBill(){
        System.out.println("Pizza: "+basePizzaPrice);


    }

}
