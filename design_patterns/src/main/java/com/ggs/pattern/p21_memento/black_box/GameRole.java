package com.ggs.pattern.p21_memento.black_box;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 14:56
 * @Description
 */
public class GameRole {

    private int vit;
    private int atk;
    private int def;

    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    //保存角色状态
    public Memento saveState() {
        return new GameStateMemento(vit, atk, def);
    }

    //恢复角色状态
    public void recoverState(Memento memento) {
        GameStateMemento gameStateMemento;
        if (memento instanceof GameStateMemento) {
            gameStateMemento = (GameStateMemento) memento;
        } else {
            throw new RuntimeException("类型不匹配!");
        }
        //将备忘录对象中存储的状态赋值给当前对象的成员
        this.vit = gameStateMemento.getVit();
        this.atk = gameStateMemento.getAtk();
        this.def = gameStateMemento.getDef();
    }

    //展示状态
    public void stateDisplay() {
        System.out.println("角色生命力:" + this.vit);
        System.out.println("角色攻击力:" + this.atk);
        System.out.println("角色防御力:" + this.def);
    }

    private class GameStateMemento implements Memento {
        private int vit;
        private int atk;
        private int def;

        public GameStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public int getVit() {
            return vit;
        }

        public int getAtk() {
            return atk;
        }

        public int getDef() {
            return def;
        }
    }

}
