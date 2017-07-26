import java.util.Date;

/**
 * Created by Administrator on 2017/7/26.
 */
public class MainTest {
    private static String date[] = {"01-01-1999", "01-08-2000", "01-06-2001"};

    public static void main(String[] args) {
        for (int i = 0; i < date.length; i++) {
            final int temp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String str1 = date[temp];
                            Date date = DateUtil.parse(str1);
                            String str2 = DateUtil.format(date);
                            System.out.println(str1 + "," + str2);
                            if (!str1.equals(str2)) {
                                throw new RuntimeException(Thread.currentThread().getName()
                                        + ", Expected " + str1 + " but got " + str2);
                            }
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("parse failed", e);
                    }
                }
            }).start();
        }
//        Date date1 = new Date();
//        try{
//            String str2 = DateUtil.format(date1);
//            System.out.println(str2);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
