package zaj3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by Krzysztof Podlaski on 05.03.2019.
 */
public class DrawingPanel {
    private JPanel mainPanel;
    private JButton uButton;
    private JButton dButton;
    private JButton lButton;
    private JButton rButton;
    private JPanel drawingPanel;
    private JButton SizePlus;
    private JButton blueButton;
    private JButton redButton;
    private JButton greenButton;
    private JButton SizeMinus;
    private JButton clearButton;
    private JButton normalButton;
    private JButton koloButton;
    private JButton kwadratButton;

    public DrawingPanel() {
        uButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                mp.moveBall(0,-5);
                mp.repaint();
            }

        });

        redButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                        mp.SetColor(255, 0, 0);
                    }
                });

        greenButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                        mp.SetColor(0, 255, 0);
                    }
                });

        blueButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                        mp.SetColor(0, 0, 255);
                    }
                });

        dButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                        mp.moveBall(0,5);
                        mp.repaint();
                    }
                });

        lButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                        mp.moveBall(-5,0);
                        mp.repaint();
                    }
                });

        rButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                        mp.moveBall(5,0);
                        mp.repaint();
                    }
                });

            SizePlus.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                        mp.SetSize(2,2);
                    }
                });

        SizeMinus.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                        mp.SetSize(-2,-2);
                    }
                });

        normalButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                        mp.NormalSize();
                    }
                });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                mp.Clear();

            }
        });


        drawingPanel.addMouseMotionListener(
                new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                mp.moveBallTo(e.getX(),e.getY());
                mp.repaint();
            }
        });

      /*  drawingPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                mp.
            }
        });*/
        koloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
               mp.setZmien("S");
            }
        });
        kwadratButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                mp.setZmien("D");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawingPanel");
        frame.setContentPane(new DrawingPanel().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        drawingPanel = new MyDrawingPanel();
    }
}