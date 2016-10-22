import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.data.DataHolder;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class hvx {
    public static final Map<String, Integer> a;
    public static Iterable<?> b;
    public static final Handler c;
    public static final String[] d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static final String i;
    public static final String j;
    public static final SecureRandom k;
    private static final ThreadLocal<StringBuilder> l;
    private static final ThreadLocal<String[]> m;
    private static final ThreadLocal<String[]> n;
    private static final ThreadLocal<String[]> o;
    private static final ThreadLocal<String[]> p;
    private static final ThreadLocal<String[]> q;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put("circle", Integer.valueOf(-1));
        a.put("extendedCircles", Integer.valueOf(4));
        a.put("myCircles", Integer.valueOf(3));
        a.put("domain", Integer.valueOf(2));
        a.put("public", Integer.valueOf(1));
        a.put(null, Integer.valueOf(-2));
        b = new hva();
        c = new Handler(Looper.getMainLooper());
        d = new String[0];
        e = Pattern.compile("\\,");
        f = Pattern.compile("[\u2028\u2029 \u00a0\u1680\u180e\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\t\u000b\f\u001c\u001d\u001e\u001f\n\r]+");
        g = Pattern.compile(Pattern.quote("\u0001"));
        h = Pattern.compile(Pattern.quote("\u0002"));
        i = "\u0001";
        j = "\u0002";
        k = new SecureRandom();
        l = new hvy();
        m = new hvz();
        n = new hwa();
        o = new hwb();
        p = new hwc();
        q = new hwd();
    }

    public static String a(Bundle bundle) {
        return a(bundle, "", new StringBuilder()).toString();
    }

    public static String a(String str) {
        return (str == null || str.length() == 0) ? null : str;
    }

    public static StringBuilder a() {
        StringBuilder stringBuilder = (StringBuilder) l.get();
        stringBuilder.setLength(0);
        return stringBuilder;
    }

    private static StringBuilder a(Object obj, String str, StringBuilder stringBuilder) {
        if (obj == null) {
            stringBuilder.append("[null]\n");
        } else {
            String concat = String.valueOf(str).concat("  ");
            stringBuilder.append("(").append(obj.getClass().getSimpleName()).append(") ");
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                if (bundle.isEmpty()) {
                    stringBuilder.append("{ }\n");
                } else {
                    stringBuilder.append("{\n");
                    for (String str2 : bundle.keySet()) {
                        stringBuilder.append(concat).append(str2).append(" : ");
                        a(bundle.get(str2), concat, stringBuilder);
                    }
                    stringBuilder.append(str).append("}\n");
                }
            } else if (obj instanceof DataHolder) {
                DataHolder dataHolder = (DataHolder) obj;
                stringBuilder.append(" [");
                if (dataHolder.h()) {
                    stringBuilder.append("CLOSED");
                } else {
                    stringBuilder.append(dataHolder.g());
                }
                stringBuilder.append("] ").append(obj).append("\n");
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    stringBuilder.append("[ ]\n");
                } else {
                    stringBuilder.append("[\n");
                    for (r0 = 0; r0 < arrayList.size(); r0++) {
                        stringBuilder.append(concat).append(r0).append(" : ");
                        a(arrayList.get(r0), concat, stringBuilder);
                    }
                    stringBuilder.append(str).append("]\n");
                }
            } else if (obj instanceof byte[]) {
                r0 = ((byte[]) obj).length;
                stringBuilder.append(" [").append(r0).append("] ");
                Object obj2 = new byte[Math.min(r0, 56)];
                System.arraycopy(obj, 0, obj2, 0, obj2.length);
                stringBuilder.append(Base64.encodeToString(obj2, 0));
            } else if (obj instanceof char[]) {
                stringBuilder.append("\"").append(new String((char[]) obj)).append("\"\n");
            } else if (obj.getClass().isArray()) {
                if (Array.getLength(obj) == 0) {
                    stringBuilder.append("[ ]\n");
                } else {
                    stringBuilder.append("[ ");
                    stringBuilder.append(Array.get(obj, 0));
                    for (r0 = 1; r0 < Array.getLength(obj); r0++) {
                        stringBuilder.append(", ").append(Array.get(obj, r0));
                    }
                    stringBuilder.append(" ]\n");
                }
            } else if (obj instanceof String) {
                stringBuilder.append("\"").append(obj).append("\"\n");
            } else {
                stringBuilder.append(obj).append("\n");
            }
        }
        return stringBuilder;
    }

    public static String[] b(String str) {
        return TextUtils.isEmpty(str) ? d : e.split(str, 0);
    }

    public static String c(String str) {
        return (str == null || !str.startsWith("e:")) ? null : str.substring(2);
    }

    public static boolean d(String str) {
        return str != null && str.startsWith("e:");
    }
}
