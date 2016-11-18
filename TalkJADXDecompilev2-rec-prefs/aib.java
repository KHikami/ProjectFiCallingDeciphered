package p000;

import android.util.SparseArray;
import java.io.UnsupportedEncodingException;

public class aib {
    private static final int[] f910a = new int[]{0, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 17, 18, 38, 39, 40, 106, 113, 114, 2025, 2026, 1000, 1015, 2085};
    private static final String[] f911b = new String[]{"*", "us-ascii", "iso-8859-1", "iso-8859-2", "iso-8859-3", "iso-8859-4", "iso-8859-5", "iso-8859-6", "iso-8859-7", "iso-8859-8", "iso-8859-9", "shift_JIS", "euc-jp", "euc-kr", "iso-2022-jp", "iso-2022-jp-2", "utf-8", "gbk", "gb18030", "gb2312", "big5", "iso-10646-ucs-2", "utf-16", "hz-gb-2312"};
    private static final SparseArray<String> f912c = new SparseArray();
    private static final lo<String, Integer> f913d = new lo();

    static {
        int i = 0;
        int length = f910a.length - 1;
        while (i <= length) {
            f912c.put(f910a[i], f911b[i]);
            f913d.put(f911b[i], Integer.valueOf(f910a[i]));
            i++;
        }
    }

    public static String m2438a(int i) {
        String str = (String) f912c.get(i);
        if (str != null) {
            return str;
        }
        throw new UnsupportedEncodingException();
    }

    public static int m2437a(String str) {
        if (str == null) {
            return -1;
        }
        Integer num = (Integer) f913d.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new UnsupportedEncodingException();
    }
}
