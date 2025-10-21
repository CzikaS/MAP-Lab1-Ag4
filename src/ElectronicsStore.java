public class ElectronicsStore {
    private int[] usbSticks;
    private int[] keyboards;

    public ElectronicsStore(int[] usbSticks, int[] keyboards) {
        this.usbSticks = usbSticks;
        this.keyboards = keyboards;
    }

    public int getCheapestKeyboard(){
        int cheapestKeyboard = keyboards[0];
        for (int keyboard : keyboards)
            if (keyboard < cheapestKeyboard)
                cheapestKeyboard = keyboard;
        return cheapestKeyboard;
    }

    public int getMostExpensiveObject(){
        int mostExpensive = usbSticks[0];
        for (int usb : usbSticks)
            if (usb > mostExpensive)
                mostExpensive = usb;
        for (int keyboard : keyboards)
            if (keyboard > mostExpensive)
                mostExpensive = keyboard;
        return mostExpensive;
    }

    public int getMostExpensiveUsbInBudget(int budget){
        int mostExpensiveInBudget = -1;
        for (int usb : usbSticks)
            if (mostExpensiveInBudget < usb && usb <budget)
                mostExpensiveInBudget = usb;
        return mostExpensiveInBudget;
    }

    public int getMaxMoneySpent(int budget){
        int maxMoney = -1;
        for (int keyboard : keyboards) {
            for (int usb : usbSticks) {
                int total = keyboard + usb;
                if (total <= budget && total > maxMoney) {
                    maxMoney = total;
                }
            }
        }
        return maxMoney;
    }
}
