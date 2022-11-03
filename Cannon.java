import java.awt.Graphics;

public class Cannon extends Entity{
    
    public Cannon(){
        //super class variable initiation
        super.entity_position_x = ConstantVariable.CANNON_POSITION_X;
        super.entity_position_y = ConstantVariable.CANNON_POSITION_Y;
        super.entity_width = ConstantVariable.CANNON_WIDTH;
        super.entity_height = ConstantVariable.CANNON_HEIGHT;
        super.entity_move_x = 0;
        super.entity_move_y = 0;
        super.entityIsAlive = true;
        super.entity_color = ConstantVariable.COLOR_CANNON;

        //own
        canFire = true;
    }

    public boolean canFire;

    public int move(){

        //left and limit | -1
        if(entity_move_x < 0 && ConstantVariable.CANNON_BORDER_LIMIT_LEFT < entity_position_x){
            entity_position_x += entity_move_x;
        }
        //right and limit | 1
        else if(0 < entity_move_x && entity_position_x + entity_move_x < ConstantVariable.CANNON_BORDER_LIMIT_RIGHT){
            entity_position_x += entity_move_x;
        }
        
        return entity_position_x;
    }

    public void draw(Graphics g){
        g.setColor(entity_color);
        g.fillRect(move(), entity_position_y, entity_width, entity_height);
    }

    public boolean collisionWithSnake(Square snakeHead){
        if(
        //between left and right
        this.entity_position_x <= snakeHead.entity_position_x + snakeHead.entity_width
        && this.entity_position_y <= snakeHead.entity_position_y + snakeHead.entity_height
        && this.entity_position_x + this.entity_width >= snakeHead.entity_position_x
        && this.entity_position_y <= snakeHead.entity_position_y + snakeHead.entity_height)
        {return true;}
        return false;
    }

}
