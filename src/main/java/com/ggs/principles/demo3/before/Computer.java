package com.ggs.principles.demo3.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:19
 * @Description
 */
public class Computer {

    private XiJieHarkDisk xiJieHarkDisk;

    private IntelCpu intelCpu;

    private KingstonMemory kingstonMemory;

    public void run() {
        System.out.println("运行计算机");
        String data = xiJieHarkDisk.get();
        System.out.println("从硬盘上获取数据是:" + data);
        intelCpu.run();
        kingstonMemory.save();
    }

    public XiJieHarkDisk getXiJieHarkDisk() {
        return xiJieHarkDisk;
    }

    public void setXiJieHarkDisk(XiJieHarkDisk xiJieHarkDisk) {
        this.xiJieHarkDisk = xiJieHarkDisk;
    }

    public IntelCpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }
}
