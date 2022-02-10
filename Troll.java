class Troll {
  double wallet = 0;
  static double treasury = 0;

    public double myMoney() {
      return wallet;
  }
    public void collect(double toll) {
      wallet = wallet + toll;
      treasury = treasury + wallet;
      System.out.println("The troll has a wallet of " + wallet + " and the treasury holds " + treasury);
  }
    public static double treasury() {
      return treasury;
    }
  public static void emptyTreasury() {
      treasury = 0;
      System.out.println("The treasury has been emptied and now contains " + treasury + " coins");
  }
}
