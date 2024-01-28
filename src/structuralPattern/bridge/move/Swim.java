package structuralPattern.bridge.move;

public class Swim implements MoveLogic{
    @Override
    public void move(String name) {
        System.out.println(name + " гребет ластами.");
    }
}
