package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: hud */
public abstract class hud<T> {
    public static huf a;
    public static hue b;
    private final char c;
    private final char d;
    private final String e;
    private final String f;
    private final Bundle g;

    static {
        a = new huf(Bundle.EMPTY);
        b = new hue(Bundle.EMPTY);
    }

    hud(Bundle bundle, char c, char c2) {
        this.g = bundle;
        this.c = '\u0001';
        this.d = '\u0002';
        this.e = Pattern.quote(String.valueOf(this.c));
        this.f = Pattern.quote(String.valueOf(this.d));
    }

    private static double a(String str) {
        double d = 0.0d;
        if (!TextUtils.isEmpty(str)) {
            try {
                d = Double.parseDouble(str);
            } catch (Throwable e) {
                gwb.b("PhoneEmailDecoder", "NumberFormatException", e);
            }
        }
        return d;
    }

    private static int a(String str, char c, int i, int i2) {
        int indexOf = str.indexOf(c, i);
        return (indexOf < 0 || indexOf >= i2) ? -1 : indexOf;
    }

    private final void a(ArrayList<T> arrayList, String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf(this.d, i);
            if (indexOf < 0) {
                indexOf = str.length();
            }
            int a = hud.a(str, this.c, i, indexOf);
            int a2 = hud.a(str, this.c, a + 1, indexOf);
            if (a >= 0 && a2 >= 0) {
                a(arrayList, str.substring(i, a), str.substring(a + 1, a2), str.substring(a2 + 1, indexOf), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, null);
            }
            i = indexOf + 1;
        }
    }

    private void a(ArrayList<T> arrayList, String str, String str2, String str3, double d, double d2, double d3, double d4, double d5, String str4, String str5, String str6, String str7, String str8) {
        if (!TextUtils.isEmpty(str3)) {
            String string = this.g.getString(str);
            if (TextUtils.isEmpty(string)) {
                string = str2;
            }
            arrayList.add(a(str3, string, d, d2, d3, d4, d5, str4, str5, str6, str7, str8));
        }
    }

    private final void b(ArrayList<T> arrayList, String str) {
        for (String split : TextUtils.split(str, this.f)) {
            String[] split2 = TextUtils.split(split, this.e);
            if (split2.length < 13) {
                gwb.k("PhoneEmailDecoder", "Invalid string");
            } else {
                a(arrayList, split2[0], split2[1], split2[2], hud.a(split2[3]), hud.a(split2[4]), hud.a(split2[5]), hud.a(split2[6]), hud.a(split2[7]), hvx.a(split2[8]), hvx.a(split2[9]), hvx.a(split2[10]), hvx.a(split2[11]), hvx.a(split2[12]));
            }
        }
    }

    protected abstract T a(String str, String str2, double d, double d2, double d3, double d4, double d5, String str3, String str4, String str5, String str6, String str7);

    public final ArrayList<T> a(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                b(arrayList, str);
            } else {
                a(arrayList, str);
            }
        }
        return arrayList;
    }
}
