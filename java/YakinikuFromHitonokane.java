/**
 * 人の金で焼肉が食べたい
 */
public final class Ogore {
  public Ogore() {
    Human me = Me.getInstance();
    Human you = new Human("おまえ");
    me.enter(YakinikuYa.JOJO_EN)
      .orderAll(you.toATM().getMoney())
      .parallelStream()
      .forEach(me::eat);
    you = null;
    System.gc();
  }

  public static void main(String[] args) {
    new Ogore();
  }
}
