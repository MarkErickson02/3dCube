/***************************************************************
* file: Basic3D.java
* author: Karen Cheung, Mark Erickson, Kevin Kuhlman
* class: CS 445 - Computer Graphics
*
* assignment: Final Program Checkpoint 2 
* date last modified: 5/17/2016
*
* purpose: This program displays a chunk of cubes with 6 different block types with randomly generated terrain.
*
****************************************************************/ 

package CS445FinalProject;

public class Block {
    
    private boolean IsActive;
    private BlockType Type;
    private float x,y,z;
    
    public enum BlockType{
        BlockType_Grass(0),
        BlockType_Sand(1),
        BlockType_Water(2),
        BlockType_Dirt(3),
        BlockType_Stone(4),
        BlockType_Bedrock(5),
        BlockType_Wood(6),
        BlockType_Leaves(7);
        private int BlockID;
        
        BlockType(int i) {
            BlockID = i;
        }
        public int GetID(){
            return BlockID;
        }
        public void SetID(int i){
            BlockID = i;
        }
    }
    
    public Block(BlockType type){
       Type = type;
    }
    
    public void setCoords(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public boolean IsActive() {
        return IsActive;
    }
    
    public void SetActive(boolean active){
        IsActive=active;
    }
    
    public int GetID(){
        return Type.GetID();
    }
    
    public void SetID(int i){
        Type.SetID(i);
    }
}
