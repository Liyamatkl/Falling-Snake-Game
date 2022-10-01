import javax.swing.JFrame;
import javax.swing.JLabel;

public class App{

    public static void main(String[] args){
        
        //Variables creation 
        JFrame mainWindow = new JFrame("Falling Snake");
        int mainWindowSizeX = 400;
        int mainWindowSizeY = 400;
        int mainWindowLocationX = 600;
        int mainWindowLocationY = 200;

        //mainWindow configuration
        mainWindow.setSize(mainWindowSizeX, mainWindowSizeY);
        mainWindow.setLocation(mainWindowLocationX, mainWindowLocationY);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);
        mainWindow.setVisible(true);

        //label
        JLabel label = new JLabel("Ca va etre une superbe application !",JLabel.CENTER);
        mainWindow.add(label);

        //Main codes
    }

}