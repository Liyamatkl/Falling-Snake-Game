import java.awt.Color;

public abstract class Entity {
    
    protected int entity_position_x, entity_position_y;
    protected int entity_width, entity_height;
    protected int entity_move_x, entity_move_y;
    protected boolean entityIsAlive;
    protected Color entity_color;


    //getters
    public Color getColor(){return entity_color;}
    public int getEntityPosX(){return entity_position_x;}
    public int getEntityPosY(){return entity_position_y;}
    public int getEntityWidth(){return entity_width;}
    public int getEntityHeight(){return entity_height;}

    //setters
    public void setEntityPosX(int x){entity_position_x = x;}//a changer
    public void setEntityPosy(int y){entity_position_y = y;}//a changer
    public void setEntityMoveX(int x){entity_move_x = x;}


}
