import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Jihan {
  public static void main (String[] args) {
    // 有効な硬貨の合計金額
    int validCoinTotalAmount = 0;

    // 有効な硬貨一覧
    Integer[] validCoins = {10, 50, 100, 500};
    List validCoinsList = Arrays.asList(validCoins);

    // 無効な硬貨一覧
    Integer[] inValidCoins = {1, 5};
    List InvalidCoinsList = Arrays.asList(inValidCoins);

    // 警告一覧
    String[] alerts = {};
    ArrayList<String> alertsList = new ArrayList<String>(Arrays.asList(alerts));

    for(String arg : args) {
      int parsedArgs = Integer.parseInt(arg);

      if(validCoinsList.contains(parsedArgs)) {
        validCoinTotalAmount += parsedArgs;
      } else if (InvalidCoinsList.contains(parsedArgs)) {
        alertsList.add("警告： " + parsedArgs + "円玉は使えません。");
      } else {
        alertsList.add("警告：" + parsedArgs + "円玉は硬貨として適切ではありません。");
      }
    }

    // 警告一覧を出力
    for (String alert : alertsList) {
      System.out.println(alert);
    }

    // 有効な硬貨の合計金額を出力
    System.out.println("ただいまの投入金額は" + validCoinTotalAmount + "円です。");
  }
}