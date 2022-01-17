package c.inner.practice;

public class MyPage {
    public static void main(String[] args) {
        MyPage page = new MyPage();
        page.setUI();
        page.pressKey(4);
    }
    InputBox inputBox;
    public void setUI(){
        inputBox = new InputBox();
        KeyEventListener listener=new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        };
        inputBox.setListener(listener);
    }
    public void pressKey(int type){
        inputBox.listenerCalled(type);
    }
}
