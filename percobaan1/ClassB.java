package percobaan1;

/*]
 * @author Nafiaaeluv
 */
public class ClassB extends ClassA{
    public int z;
    
    public void getNilaiZ(){
        System.out.println("nilai z: " + z);
    }
    
    public void getJumlah(){
        System.out.println("jumlah: " + (super.x+super.y+z));
    }
}