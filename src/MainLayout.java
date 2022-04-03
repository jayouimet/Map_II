import javax.swing.*;

public class MainLayout extends JFrame {
    private JPanel mainPanel;
    private JButton préférenceButton;
    private JButton itinéraireButton;
    private JButton button3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public MainLayout() {
        setContentPane(mainPanel);
        setTitle("Map II");
        setSize(800, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        MainLayout mainLayout = new MainLayout();
    }
}
