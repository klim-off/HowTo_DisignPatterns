package behavioralPattern.memento;

public class TextWindow {

    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public String getText() {
        return currentText.toString();
    }

    public TextWindowState save(){
     return new TextWindowState( currentText.toString());
    }

    public void restore(TextWindowState windowState){
        currentText = new StringBuilder(windowState.text);
    }

    public static class TextWindowState{
        private  final String text;

        public TextWindowState(String text) {
            this.text = text;
        }

    }
}
