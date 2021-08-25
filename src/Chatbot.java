import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Chatbot extends JFrame {
    private JTextArea chattingArea = new JTextArea();
    private JTextField chatText = new JTextField();

    public Chatbot() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("chat with me!");
        frame.add(chattingArea);
        frame.add(chatText);
        chattingArea.setSize(500, 400);
        chattingArea.setLocation(2, 2);
        chatText.setSize(540, 30);
        chatText.setLocation(2, 500);
        chatText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String getText = chatText.getText().toLowerCase(Locale.ROOT);
                chattingArea.append("you: " + getText + "\n");
                chatText.setText("");
                if (getText.contains("hi")) {
                    bot("whats up! how was your day?");
                }else if(getText.contains("hello")) {
                    bot("hey!");
                }else if(getText.contains("food")) {
                    bot("i am so hungry!");
                }else if(getText.contains("good")) {
                    bot("that's good :)");
                }else if(getText.contains("what is your name")) {
                    bot("my name is jett and i am your virtual companion!");
                }else if(getText.contains("bye")) {
                    bot("see you!");
                }else if(getText.contains("bad")) {
                    bot("i'm sorry to hear that :(");
                }else if(getText.contains("sleep")) {
                    bot("i sure do love naps!");
                }else{
                    int random = (int) (Math.random() * 3 + 1);
                    if(random == 1) {
                        bot("im not sure what you are trying to say. try again with 'hi' or 'hello'");
                    }else if (random == 2){
                        bot("please rephrase what you said");
                    }else
                    bot("i'm a bit confused");


                }
            }

        });
    }
        private void bot(String string){
            chattingArea.append("bot: " + string + "\n");
        }


public static void main(String args[]){
        new Chatbot();

}
}

