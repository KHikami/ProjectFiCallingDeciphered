package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class hud<T> {
    public static huf f17265a = new huf(Bundle.EMPTY);
    public static hue f17266b = new hue(Bundle.EMPTY);
    private final char f17267c = '\u0001';
    private final char f17268d = '\u0002';
    private final String f17269e = Pattern.quote(String.valueOf(this.f17267c));
    private final String f17270f = Pattern.quote(String.valueOf(this.f17268d));
    private final Bundle f17271g;

    hud(Bundle bundle, char c, char c2) {
        this.f17271g = bundle;
    }

    private static double m20833a(String str) {
        double d = 0.0d;
        if (!TextUtils.isEmpty(str)) {
            try {
                d = Double.parseDouble(str);
            } catch (Throwable e) {
                gwb.m2044b("PhoneEmailDecoder", "NumberFormatException", e);
            }
        }
        return d;
    }

    private static int m20834a(String str, char c, int i, int i2) {
        int indexOf = str.indexOf(c, i);
        return (indexOf < 0 || indexOf >= i2) ? -1 : indexOf;
    }

    private final void m20835a(ArrayList<T> arrayList, String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf(this.f17268d, i);
            if (indexOf < 0) {
                indexOf = str.length();
            }
            int a = hud.m20834a(str, this.f17267c, i, indexOf);
            int a2 = hud.m20834a(str, this.f17267c, a + 1, indexOf);
            if (a >= 0 && a2 >= 0) {
                m20836a(arrayList, str.substring(i, a), str.substring(a + 1, a2), str.substring(a2 + 1, indexOf), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, null);
            }
            i = indexOf + 1;
        }
    }

    private void m20836a(ArrayList<T> arrayList, String str, String str2, String str3, double d, double d2, double d3, double d4, double d5, String str4, String str5, String str6, String str7, String str8) {
        if (!TextUtils.isEmpty(str3)) {
            String string = this.f17271g.getString(str);
            if (TextUtils.isEmpty(string)) {
                string = str2;
            }
            arrayList.add(mo2948a(str3, string, d, d2, d3, d4, d5, str4, str5, str6, str7, str8));
        }
    }

    private final void m20837b(ArrayList<T> arrayList, String str) {
        for (String split : TextUtils.split(str, this.f17270f)) {
            String[] split2 = TextUtils.split(split, this.f17269e);
            if (split2.length < 13) {
                gwb.m2279k("PhoneEmailDecoder", "Invalid string");
            } else {
                m20836a(arrayList, split2[0], split2[1], split2[2], hud.m20833a(split2[3]), hud.m20833a(split2[4]), hud.m20833a(split2[5]), hud.m20833a(split2[6]), hud.m20833a(split2[7]), hvx.m21117a(split2[8]), hvx.m21117a(split2[9]), hvx.m21117a(split2[10]), hvx.m21117a(split2[11]), hvx.m21117a(split2[12]));
            }
        }
    }

    protected abstract T mo2948a(String str, String str2, double d, double d2, double d3, double d4, double d5, String str3, String str4, String str5, String str6, String str7);

    public final ArrayList<T> m20839a(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                m20837b(arrayList, str);
            } else {
                m20835a(arrayList, str);
            }
        }
        return arrayList;
    }
}
