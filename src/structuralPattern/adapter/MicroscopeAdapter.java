package structuralPattern.adapter;

public class MicroscopeAdapter extends Hammer{
    private Microscope microscope;

    public MicroscopeAdapter(Microscope microscope) {
        this.microscope = microscope;
    }

    @Override
    public boolean hit(Nail nail) {
        microscope.bang();
        return false;
    }
}
