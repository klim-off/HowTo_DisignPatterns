package structuralPattern.adapter;

public class Hammer {
    public boolean hit(Nail nail) {
        if (nail.visiblePart > 0) {
            nail.visiblePart--;
        }
        return nail.visiblePart == 0;
    }
}
