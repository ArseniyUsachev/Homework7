public class Test {
    public static void main(String[] args) {


        Sword<Steel> steelSword = new Sword<>(new Steel());


        boolean isStrong = steelSword.checkEndurance();
        System.out.println("ћеч из стали " + (isStrong ? "прошел" : "не прошел") + " проверку прочности");
    }
}