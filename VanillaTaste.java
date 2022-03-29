package Bridge;

public class VanillaTaste implements DessertTastes {

    @Override
    public void applyTaste() {
        System.out.print(" vanilla tasted ");
    }
}
