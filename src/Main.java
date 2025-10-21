public class Main {
    public static void main(String[] args){
        int[] usbSticks = new int[] {13, 56, 20};
        int[] keyboards = new int[] {70, 45, 100};
        ElectronicsStore shop = new ElectronicsStore(usbSticks, keyboards);

        System.out.println(shop.getCheapestKeyboard());
        System.out.println(shop.getMostExpensiveObject());

        System.out.println(shop.getMostExpensiveUsbInBudget(10));
        System.out.println(shop.getMostExpensiveUsbInBudget(70));

        System.out.println(shop.getMaxMoneySpent(70));

    }
}
