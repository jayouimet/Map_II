import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultLayout extends JFrame {
    private JPanel mainPanel;
    private JButton returnButton;
    private JTextField txtStart;
    private JTextField txtDestination;
    private JButton carButton;
    private JButton taxiButton;
    private JButton metroButton;
    private JButton busButton;
    private JPanel transportsButtonPannel;
    private JPanel contentPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel lblScore;

    public ResultLayout() {
        ResultLayout resultLayout = this;

        setContentPane(mainPanel);
        setTitle("Map II");
        setSize(852, 480);
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        Dimension buttonDimension = new Dimension(50, 50);

        carButton.setSize(buttonDimension);
        taxiButton.setSize(buttonDimension);
        metroButton.setSize(buttonDimension);
        busButton.setSize(buttonDimension);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLayout.dispose();
                SwingUtilities.invokeLater(MainLayout::new);
            }
        });
    }

    public static void main(String[] args) {
        ResultLayout resultLayout = new ResultLayout();
    }
}
