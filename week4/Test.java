

/**
 * @ClassName Test
 * @Description TODO
 * @Author 付洁
 * @Date 10/15/2020
 **/
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        HardDisk hardDisk=new HardDisk();
        cpu.setSpeed(2200);
        hardDisk.setAmount(200);
        PC pc =new PC();
        pc.setCpu(cpu);
        pc.setHardDisk(hardDisk);
        pc.show();
    }
}

