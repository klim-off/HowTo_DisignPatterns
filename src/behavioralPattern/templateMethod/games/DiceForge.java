package behavioralPattern.templateMethod.games;

public class DiceForge extends BoardGame{

   /* private int playersAmount;

    public final void start(int playersAmount) {
        this.playersAmount = playersAmount;

        System.out.println("""
                ------------------------------------------------------------------------------------------
                Подготовка к игре Грани судьбы:
                    - раскладываем карты подвигов по островам;
                    - раздаем игрокам планшеты героя, маркеры ресурсов, фишку героя, два стартовых кубика;
                    - готовим поле храма.""");
        System.out.println("Игроки бросают кубики, апгрейдят кубики, бросают кубики, совершают подвиги, бросают кубики...");
        System.out.println("Закончился последний раунд, время подсчитать очки славы.");
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }*/

    @Override
    protected void initialize() {
        System.out.println("""
                ---------------------------------------------------------
                Подготовка к игре Колонизаторы:
                    - составляем остров для колонизации;
                    - раздаем игрокам фигурки поселений, городов и дорог;
                    - раскладываем колоды сырья и развития.""");
    }

      @Override
    protected void play() {
        System.out.println("Игроки бросают кубики, апгрейдят кубики, бросают кубики, совершают подвиги, бросают кубики...");
    }

    @Override
    protected void end() {
        System.out.println("Закончился последний раунд, время подсчитать очки славы.");
    }
}
