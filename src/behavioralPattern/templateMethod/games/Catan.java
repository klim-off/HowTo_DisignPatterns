package behavioralPattern.templateMethod.games;

public class Catan extends BoardGame {

 /*   private int playersAmount;

    public final void start(int playersAmount) {
        this.playersAmount = playersAmount;

        System.out.println("""
                ---------------------------------------------------------
                Подготовка к игре Колонизаторы:
                    - составляем остров для колонизации;
                    - раздаем игрокам фигурки поселений, городов и дорог;
                    - раскладываем колоды сырья и развития.""");
        System.out.println("Игроки колонизируют остров, торгуют ресурсами, воруют ресурсы, интригуют и строят козни...");
        System.out.println("Один из игроков набрал 10 победных очков.");
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }*/

    @Override
    protected void initialize() {
       System.out.println("\"\"\n" +
                "  ---------------------------------------------------------\n" +
                    "Подготовка к игре Колонизаторы:\n"+
                    "- составляем остров для колонизации;\n"+
                    "- раздаем игрокам фигурки поселений, городов и дорог;\n"+
                    "- раскладываем колоды сырья и развития. ");

    }

    @Override
    protected void play() {
        System.out.println("Игроки колонизируют остров, торгуют ресурсами, воруют ресурсы, интригуют и строят козни...");
    }

    @Override
    protected void end() {
        System.out.println("Один из игроков набрал 10 победных очков.");
    }
}
