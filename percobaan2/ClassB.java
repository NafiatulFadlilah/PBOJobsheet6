package percobaan2;

/*
 * @author Nafiaaeluv
 */
public class ClassB extends ClassA{
    protected int z;
    
    public void setZ(int z){
        this.z = z;
    }
    
    public void getNilaiZ(){
        System.out.println("nilai z: " + z);
    }
    
    public void getJumlah(){
        System.out.println("jumlah: " + (super.x+super.y+z));
    }
}