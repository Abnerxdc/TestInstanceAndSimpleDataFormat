import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Administrator on 2017/7/26.
 */
public class DateUtil {
    private static ThreadLocal<SimpleDateFormat> local = new ThreadLocal<SimpleDateFormat>();

    public static Date parse(String str) throws Exception {
        SimpleDateFormat sdf = local.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            local.set(sdf);
        }
        return sdf.parse(str);
    }

    public static String format(Date date) throws Exception {
        SimpleDateFormat sdf = local.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            local.set(sdf);
        }
        return sdf.format(date);
    }
}
