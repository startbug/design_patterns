package com.ggs.principles.demo3.after;

import com.ggs.principles.demo3.before.IntelCpu;
import com.ggs.principles.demo3.before.KingstonMemory;
import com.ggs.principles.demo3.before.XiJieHarkDisk;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:19
 * @Description
 */
public class Computer {

    private HardDisk xiJieHarkDisk;

    private Cpu intelCpu;

    private Memory kingstonMemory;

    public HardDisk getXiJieHarkDisk() {
        return xiJieHarkDisk;
    }

    public void setXiJieHarkDisk(HardDisk xiJieHarkDisk) {
        this.xiJieHarkDisk = xiJieHarkDisk;
    }

    public Cpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(Cpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public Memory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(Memory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public void run() {
        System.out.println("运行计算机");
        String data = xiJieHarkDisk.get();
        System.out.println("从硬盘上获取数据是:" + data);
        intelCpu.run();
        kingstonMemory.save();
    }

}
