package com.ggs.pattern.p5_builder.demo2;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 20:51
 * @Description 构建者模式
 */
public class Phone {

    private String cpu;
    private String memory;
    private String screen;
    private String motherboard;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.screen = builder.screen;
        this.motherboard = builder.motherboard;
    }

    public static final class Builder {
        private String cpu;
        private String memory;
        private String screen;
        private String motherboard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder motherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", screen='" + screen + '\'' +
                ", motherboard='" + motherboard + '\'' +
                '}';
    }
}
