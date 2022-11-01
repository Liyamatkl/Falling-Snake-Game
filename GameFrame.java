import javax.swing.JFrame;

//Game Frame will contain the frame settings

public class GameFrame extends JFrame{
    
    public GameFrame(){
        super(ConstantVariable.MAIN_WINDOW_TITLE);

        //Window Settings
        this.setSize(ConstantVariable.MAIN_WINDOW_WIDTH, ConstantVariable.MAIN_WINDOW_HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);//put in center should be after size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setLayout(null);// ?
        
        //Game Scene
        gameScene = new GameScene();
        this.setContentPane(gameScene);       
        this.setVisible(true);//must be last
    }

    public static GameScene gameScene;


}