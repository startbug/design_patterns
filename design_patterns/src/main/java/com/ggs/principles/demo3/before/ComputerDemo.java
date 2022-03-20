package com.ggs.principles.demo3.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:21
 * @Description
 */
public class ComputerDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        XiJieHarkDisk xiJieHarkDisk = new XiJieHarkDisk();
        computer.setIntelCpu(intelCpu);
        computer.setKingstonMemory(kingstonMemory);
        computer.setXiJieHarkDisk(xiJieHarkDisk);
        computer.run();
    }

}
