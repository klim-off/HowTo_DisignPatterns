package behavioralPattern.templateMethod.games;

public class WelcomeTo  extends BoardGame {

   /* private int playersAmount;

    public final void start(int playersAmount) {
        this.playersAmount = playersAmount;

        System.out.println("""
                -----------------------------------------------------
                Подготовка к игре Бумажные кварталы:
                    - раздаем игрокам игровые поля и шариковые ручки;
                    - случайным образом выбираем три плана застройки;
                    - подготавливаем три стопки карт строительства.""");
        System.out.println("Игроки строят жилые кварталы с парками и бассейнами, нанимают торговых агентов и гастарбайтеров.");
        System.out.println("Один из игроков выполнил все три плана застройки.");
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }*/

    @Override
    protected void initialize() {
        System.out.println("\"\"\n" +
                "-----------------------------------------------------\n" +
                "Подготовка к игре Бумажные кварталы:\n" +
                    "- раздаем игрокам игровые поля и шариковые ручки;/n" +
                    "- случайным образом выбираем три плана застройки;/n" +
                    "- подготавливаем три стопки карт строительства.\"\"");
    }

    @Override
    protected void play() {
        System.out.println("Игроки строят жилые кварталы с парками и бассейнами, нанимают торговых агентов и гастарбайтеров.");

    }

    @Override
    protected void end() {
        System.out.println("Один из игроков выполнил все три плана застройки.");
    }
}
