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
}
