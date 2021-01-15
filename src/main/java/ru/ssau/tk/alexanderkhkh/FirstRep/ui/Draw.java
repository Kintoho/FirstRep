package ru.ssau.tk.alexanderkhkh.FirstRep.ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Draw extends JComponent {
    public double maxR=90f;
    public double minR=5f;

    public static void main(String[] args)
    {
        Draw app = new Draw();
        MyFrame frame = app.new MyFrame();
        frame.add(new Draw());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    class MyFrame extends JFrame
    {
        public MyFrame()
        {
            setTitle("Killer");
            setSize(230, 300);
            Container pane = getContentPane();
            MyPanel panel = new MyPanel();
            pane.add(panel,BorderLayout.WEST);
        }
    }

    class MyPanel extends JPanel implements ActionListener
    {
        public MyPanel()
        {
            JButton button1 = new JButton("Start");
            JButton button2 = new JButton("Stop");
            JButton button3 = new JButton("Exit");
            button1.setSize(70, 50);
            button2.setSize(70, 50);
            button3.setSize(70, 50);

            button1.addActionListener(this);
            button2.addActionListener(this);
            button3.addActionListener(this);

            add(button1);
            add(button2);
            add(button3);

            radius = minR;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            String action = e.getActionCommand();
            switch (action) {
                case "Start":
                    timer = new Timer();
                    timer.schedule(new PaintTask(this), 1, 1);
                    break;
                case "Stop":
                    timer.cancel();
                    break;
                case "Exit":
                    System.exit(0);
            }
        }

        @Override
        public void paintComponent (Graphics g)
        {
            super.paintComponent(g);

            int width = getWidth();
            int height = getHeight();

            g.setColor(Color.RED);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setStroke(new BasicStroke(5f));
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            double x=0.5*width;
            double y=0.5*height;

            g2d.draw(circle(x, y, radius));
        }

        public Shape circle (double x, double y, double r)
        {

            return new Ellipse2D.Double(x - r, y - r, 2 * r, 2 * r);

        }

        //Шаг изменения радиуса
        private double step = 1;

        public void updateRadius()
        {
            //Изменение направления шага, если радиус вышел за границы
            if(radius > maxR || radius < minR )
                step *= (-1);
            radius += step;
        }

        private double radius;
        private Timer timer = new Timer();

        class PaintTask extends TimerTask
        {
            private final MyPanel mComponent;

            public PaintTask(MyPanel component)
            {
                mComponent = component;

            }

            @Override
            public void run()
            {
                //Меням радиус, перерисовываем панель и скедулим самое себя через секунду
                mComponent.updateRadius();
                mComponent.repaint();
                timer.schedule(new PaintTask(mComponent),10000);
            }
        }
    }
}

