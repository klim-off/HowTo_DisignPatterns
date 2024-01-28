package structuralPattern.bridge.move;

public class Crawl implements  MoveLogic{
    @Override
    public void move(String name) {

        System.out.println(name + " ползет извиваясь.");

    }
}
