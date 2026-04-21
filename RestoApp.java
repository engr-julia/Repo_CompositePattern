public class RestoApp {
    public static void main(String[] args) {

        // Leaves
        MenuItem burger = new MenuItem("Classic Burger", 250.00);
        MenuItem fries = new MenuItem("Large Fries", 85.00);
        MenuItem soda = new MenuItem("Root Beer", 60.00);
        MenuItem sundae = new MenuItem("Vanilla Sundae", 45.00);

        // Sub-composite
        MenuCategory barkadaMeal = new MenuCategory("Barkada Solo Meal");
        barkadaMeal.add(burger);
        barkadaMeal.add(fries);
        barkadaMeal.add(soda);

        // Top-level composite
        MenuCategory mainMenu = new MenuCategory("MAIN MENU");
        mainMenu.add(barkadaMeal);
        mainMenu.add(sundae);

        // Output
        mainMenu.print();
        System.out.println("\n==============================");
        System.out.printf("Total Menu Value: ₱%.2f%n", mainMenu.getPrice());
    }
}