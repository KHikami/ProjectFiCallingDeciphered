package p000;

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
    public static final Map<String, Integer> f17383a;
    public static Iterable<?> f17384b = new hva();
    public static final Handler f17385c = new Handler(Looper.getMainLooper());
    public static final String[] f17386d = new String[0];
    public static final Pattern f17387e = Pattern.compile("\\,");
    public static final Pattern f17388f = Pattern.compile("[     ᠎             　\t\u000b\f\u001c\u001d\u001e\u001f\n\r]+");
    public static final Pattern f17389g = Pattern.compile(Pattern.quote("\u0001"));
    public static final Pattern f17390h = Pattern.compile(Pattern.quote("\u0002"));
    public static final String f17391i = "\u0001";
    public static final String f17392j = "\u0002";
    public static final SecureRandom f17393k = new SecureRandom();
    private static final ThreadLocal<StringBuilder> f17394l = new hvy();
    private static final ThreadLocal<String[]> f17395m = new hvz();
    private static final ThreadLocal<String[]> f17396n = new hwa();
    private static final ThreadLocal<String[]> f17397o = new hwb();
    private static final ThreadLocal<String[]> f17398p = new hwc();
    private static final ThreadLocal<String[]> f17399q = new hwd();

    static {
        Map hashMap = new HashMap();
        f17383a = hashMap;
        hashMap.put("circle", Integer.valueOf(-1));
        f17383a.put("extendedCircles", Integer.valueOf(4));
        f17383a.put("myCircles", Integer.valueOf(3));
        f17383a.put("domain", Integer.valueOf(2));
        f17383a.put("public", Integer.valueOf(1));
        f17383a.put(null, Integer.valueOf(-2));
    }

    public static String m21116a(Bundle bundle) {
        return hvx.m21119a(bundle, "", new StringBuilder()).toString();
    }

    public static String m21117a(String str) {
        return (str == null || str.length() == 0) ? null : str;
    }

    public static StringBuilder m21118a() {
        StringBuilder stringBuilder = (StringBuilder) f17394l.get();
        stringBuilder.setLength(0);
        return stringBuilder;
    }

    private static StringBuilder m21119a(Object obj, String str, StringBuilder stringBuilder) {
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
                        hvx.m21119a(bundle.get(str2), concat, stringBuilder);
                    }
                    stringBuilder.append(str).append("}\n");
                }
            } else if (obj instanceof DataHolder) {
                DataHolder dataHolder = (DataHolder) obj;
                stringBuilder.append(" [");
                if (dataHolder.m9685h()) {
                    stringBuilder.append("CLOSED");
                } else {
                    stringBuilder.append(dataHolder.m9684g());
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
                        hvx.m21119a(arrayList.get(r0), concat, stringBuilder);
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

    public static String[] m21120b(String str) {
        return TextUtils.isEmpty(str) ? f17386d : f17387e.split(str, 0);
    }

    public static String m21121c(String str) {
        return (str == null || !str.startsWith("e:")) ? null : str.substring(2);
    }

    public static boolean m21122d(String str) {
        return str != null && str.startsWith("e:");
    }
}
