package defpackage;

import java.util.Locale;

/* renamed from: ke */
public final class ke {
    static ko a;
    static final ke b;
    static final ke c;
    private static final String d;
    private static final String e;
    private final boolean f;
    private final int g;
    private final ko h;

    static {
        a = kp.c;
        d = Character.toString('\u200e');
        e = Character.toString('\u200f');
        b = new ke(false, 2, a);
        c = new ke(true, 2, a);
    }

    public static ke a() {
        return new kf().a();
    }

    ke(boolean z, int i, ko koVar) {
        this.f = z;
        this.g = i;
        this.h = koVar;
    }

    private boolean b() {
        return (this.g & 2) != 0;
    }

    public boolean a(String str) {
        return this.h.a(str, 0, str.length());
    }

    private String a(String str, ko koVar, boolean z) {
        if (str == null) {
            return null;
        }
        ko koVar2;
        boolean a;
        String str2;
        boolean a2 = koVar.a(str, 0, str.length());
        StringBuilder stringBuilder = new StringBuilder();
        if (b()) {
            if (a2) {
                koVar2 = kp.b;
            } else {
                koVar2 = kp.a;
            }
            a = koVar2.a(str, 0, str.length());
            if (!this.f && (a || ke.c(str) == 1)) {
                str2 = d;
            } else if (!this.f || (a && ke.c(str) != -1)) {
                str2 = "";
            } else {
                str2 = e;
            }
            stringBuilder.append(str2);
        }
        if (a2 != this.f) {
            stringBuilder.append(a2 ? '\u202b' : '\u202a');
            stringBuilder.append(str);
            stringBuilder.append('\u202c');
        } else {
            stringBuilder.append(str);
        }
        if (a2) {
            koVar2 = kp.b;
        } else {
            koVar2 = kp.a;
        }
        a = koVar2.a(str, 0, str.length());
        if (!this.f && (a || ke.b(str) == 1)) {
            str2 = d;
        } else if (!this.f || (a && ke.b(str) != -1)) {
            str2 = "";
        } else {
            str2 = e;
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public String a(String str, ko koVar) {
        return a(str, koVar, true);
    }

    private static int b(String str) {
        return new kg(str, false).b();
    }

    private static int c(String str) {
        return new kg(str, false).a();
    }

    static boolean a(Locale locale) {
        if (kv.a.a(locale) == 1) {
            return true;
        }
        return false;
    }
}
