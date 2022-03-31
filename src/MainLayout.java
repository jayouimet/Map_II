import javax.swing.*;

public class MainLayout extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JPanel mainPanel;

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
