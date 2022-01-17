package c.inner;

public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListenerAnonymous();
    }
    class MagicButtonListener implements EventListener {
        @Override
        public void onClick() {
            System.out.println("clicked");
        }
    }
    public void setButtonListener(){
        MagicButton button=new MagicButton();
        EventListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }
    public void setButtonListenerAnonymous(){
        MagicButton button=new MagicButton();
        button.setListener(new EventListener() {
            @Override
            public void onClick() {
                System.out.println("clicked2");
            }
        });
        button.onClickProcess();
    }
}
