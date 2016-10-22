package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: axc */
public final class axc {
    public static final axa a;
    public final ArrayList b;
    public String c;
    private final axa d;

    static {
        a = new awz();
    }

    public axc(String str, axa axa) {
        this.b = new ArrayList();
        this.c = str;
        this.d = axa;
    }

    public static String a(String str, axa axa) {
        return axc.a(str, 0, axa);
    }

    public static String a(String str, int i, axa axa) {
        StringBuilder stringBuilder = new StringBuilder();
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (axa.b(charAt)) {
                stringBuilder.append(charAt);
            }
            i++;
        }
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append("0");
        }
    }

    private static void a(StringBuilder stringBuilder, axb axb) {
        for (int i = axb.a; i < axb.b; i++) {
            stringBuilder.replace(i, i + 1, "1");
        }
    }

    public final axb a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        axc.a(stringBuilder, str.length());
        axb a = a(str, str2, 0);
        if (a == null) {
            axe c = axd.c(str);
            if (c.a != 0) {
                a = a(str, str2, c.a);
            }
            if (a == null && c.b != 0) {
                a = a(str, str2, c.b);
            }
        }
        if (a == null) {
            return a;
        }
        axc.a(stringBuilder, a);
        return a;
    }

    private final axb a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        int i2 = 0;
        int i3 = i;
        int i4 = i;
        while (i < str.length() && i2 != str2.length()) {
            char charAt = str.charAt(i);
            if (this.d.b(charAt)) {
                if (charAt != str2.charAt(i2)) {
                    return null;
                }
                i2++;
            } else if (i2 == 0 && i3 != 0) {
                i3++;
            }
            i4++;
            i++;
        }
        return new axb(i3 + 0, i4);
    }

    private boolean a(String str, String str2, ArrayList arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        axc.a(stringBuilder, str.length());
        int length = str.length();
        int length2 = str2.length();
        if (length < length2) {
            return false;
        }
        if (length2 == 0) {
            return false;
        }
        Iterator it;
        Collection arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length && i2 < length2) {
            char d = this.d.d(str.charAt(i3));
            if (this.d.c(d)) {
                if (this.d.a(d)) {
                    d = this.d.f(d);
                }
                if (d != str2.charAt(i2)) {
                    int i5;
                    if (i2 == 0 || this.d.c(this.d.d(str.charAt(i3 - 1)))) {
                        while (i3 < length && this.d.c(this.d.d(str.charAt(i3)))) {
                            i3++;
                        }
                        i5 = i3 + 1;
                    } else {
                        i5 = i3;
                    }
                    i4 = 0;
                    i = i5;
                    i2 = 0;
                    i3 = i5;
                } else if (i2 == length2 - 1) {
                    arrayList.add(new axb(i, (length2 + i) + i4));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        axc.a(stringBuilder, (axb) it.next());
                    }
                    return true;
                } else {
                    ArrayList arrayList3;
                    if (i2 <= 0) {
                        int i6 = i3;
                        while (i6 < length && this.d.c(this.d.d(str.charAt(i6)))) {
                            i6++;
                        }
                        if (i6 < length - 1) {
                            String substring = str.substring(i6 + 1);
                            arrayList3 = new ArrayList();
                            if (a(substring, str2.substring(i2 + 1), arrayList3)) {
                                axb.a(arrayList3, i6 + 1);
                                arrayList3.add(0, new axb(i3, i3 + 1));
                                i2++;
                                i3++;
                                arrayList2 = arrayList3;
                            }
                        }
                    }
                    Collection collection = arrayList2;
                    i2++;
                    i3++;
                    arrayList2 = arrayList3;
                }
            } else {
                i3++;
                if (i2 == 0) {
                    i = i3;
                } else {
                    i4++;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        arrayList.addAll(arrayList2);
        it = arrayList.iterator();
        while (it.hasNext()) {
            axc.a(stringBuilder, (axb) it.next());
        }
        return true;
    }

    public final boolean a(String str) {
        this.b.clear();
        return a(str, this.c, this.b);
    }
}
