package defpackage;

import android.util.SparseArray;
import java.io.UnsupportedEncodingException;

/* renamed from: aib */
public class aib {
    private static final int[] a;
    private static final String[] b;
    private static final SparseArray<String> c;
    private static final lo<String, Integer> d;

    static {
        int i = 0;
        a = new int[]{0, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 17, 18, 38, 39, 40, 106, 113, 114, 2025, 2026, 1000, 1015, 2085};
        b = new String[]{"*", "us-ascii", "iso-8859-1", "iso-8859-2", "iso-8859-3", "iso-8859-4", "iso-8859-5", "iso-8859-6", "iso-8859-7", "iso-8859-8", "iso-8859-9", "shift_JIS", "euc-jp", "euc-kr", "iso-2022-jp", "iso-2022-jp-2", "utf-8", "gbk", "gb18030", "gb2312", "big5", "iso-10646-ucs-2", "utf-16", "hz-gb-2312"};
        c = new SparseArray();
        d = new lo();
        int length = a.length - 1;
        while (i <= length) {
            c.put(a[i], b[i]);
            d.put(b[i], Integer.valueOf(a[i]));
            i++;
        }
    }

    public static String a(int i) {
        String str = (String) c.get(i);
        if (str != null) {
            return str;
        }
        throw new UnsupportedEncodingException();
    }

    public static int a(String str) {
        if (str == null) {
            return -1;
        }
        Integer num = (Integer) d.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new UnsupportedEncodingException();
    }
}
