 class House {
    private String color;

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}

class Entry4{
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        System.out.println(blueHouse.getColor());

        /*
        The line House blueHouse = new House("blue"); creates a new instance of
        the House class
        Note that House is a blueprint, and we are assigning it to the blueHouse variable.
        In other words, it is a reference to the object in memory. 
        * **/
    }
}
