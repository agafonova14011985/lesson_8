import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample {

    public static void main(String[] args) {

        new SampleWindow();

    }
    public static class SampleWindow extends JFrame {

        private int counter;

        //конструктор окна
        public SampleWindow() throws HeadlessException{
            //настройки для окна
            //размер окна,
            setSize(500, 500);
           // setBounds(100, 100, 150, 200);
            //видимость окна координаты 00 изначально
            setVisible(true);
            //выход из приложения
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //расположение окна по координатам в пиксилях
           // setLocation(100,100);
            //месторасположения окна относительно другого окна
            setLocationRelativeTo(null);//по центру
             // название окна
            setTitle("Window");

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            //добавить кнопки
            JButton button1 = new JButton("Кнопка -");
            JButton button2 = new JButton("Кнопка +");
            //добавить кнопку
           // add(button1, BorderLayout.WEST);//расположение элементов BorderLayout.WEST || EAST
            //add(button2, BorderLayout.EAST);
            panel.add(button1);
            panel.add(button2);
            add (panel, BorderLayout.NORTH);

            // события для кнопок
            final JLabel label = new JLabel("  " +"Нажми на кнопку");
            //шрифт задать
            label.setFont(new Font("Arial", Font.BOLD, 40));
            add(label);

            //счетчик
    button1.addActionListener(new ActionListener() {

        //навесить слушателей на кнопки
        @Override
    public void actionPerformed(ActionEvent e) {

        //при нажатии на кнопку работать будут счетчик

        label.setText("  " + "Counter" + --counter);
    }
});
    button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            label.setText( "  " + "Counter" + ++counter);
        }
    });
    //button2.addActionListener(e -> label.setText("Counter" + ++counter));






        }
    }

}
