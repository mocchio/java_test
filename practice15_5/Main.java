// ①Date型とCalendarクラスを用いた記述
// import java.util.Date;
// import java.util.Calendar;
// import java.text.SimpleDateFormat;

// public class Main{
//   public static void main(String[] args) {
//     Date now = new Date();
//     Calendar c = Calendar.getInstance();
//     c.setTime(now);
//     int day = c.get(Calendar.DAY_OF_MONTH);
//     day += 100;
//     c.set(Calendar.DAY_OF_MONTH, day);
//     Date future = c.getTime();
//     SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
//     System.out.println(f.format(future));
//   }
// }

// ②Time APIを用いた記述
import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    // 現在日時を取得
    LocalDateTime now = LocalDateTime.now();
    // 100日後の日付を取得
    LocalDateTime future = now.plusDays(100);
    // フォーマットを設定
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    // フォーマットに沿った日付を出力
    System.out.println(future.format(fmt));
  }
}