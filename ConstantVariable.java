import java.awt.Color;
// Class that will store all the constant variable
//setting or configuration

public abstract class ConstantVariable{

    /***********Window***********/

    public static final int MAIN_WINDOW_WIDTH = 500;
    public static final int MAIN_WINDOW_HEIGHT = 700;
    public static final int MAIN_BORDER_LIMIT = 50;

    /***********Cannon***********/
    public static final int CANNON_WIDTH = 20;
    public static final int CANNON_HEIGHT = 20;

    public static final int CANNON_INITIAl_POSITION_X = (MAIN_WINDOW_WIDTH - CANNON_WIDTH) / 2;
    public static final int CANNON_POSITION_Y = 610;

    public static final int CANNON_SPEED = 1;//uniter de deplacement pour le moment
    public static final Color CANNON_COLOR = Color.RED;//?

}