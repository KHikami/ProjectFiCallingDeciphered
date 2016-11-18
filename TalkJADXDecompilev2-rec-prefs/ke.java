package p000;

import java.util.Locale;

public final class ke {
    static ko f21458a = kp.f22602c;
    static final ke f21459b = new ke(false, 2, f21458a);
    static final ke f21460c = new ke(true, 2, f21458a);
    private static final String f21461d = Character.toString('‎');
    private static final String f21462e = Character.toString('‏');
    private final boolean f21463f;
    private final int f21464g;
    private final ko f21465h;

    public static ke m25637a() {
        return new kf().m25702a();
    }

    ke(boolean z, int i, ko koVar) {
        this.f21463f = z;
        this.f21464g = i;
        this.f21465h = koVar;
    }

    private boolean m25640b() {
        return (this.f21464g & 2) != 0;
    }

    public boolean m25643a(String str) {
        return this.f21465h.m26751a(str, 0, str.length());
    }

    private String m25636a(String str, ko koVar, boolean z) {
        if (str == null) {
            return null;
        }
        ko koVar2;
        boolean a;
        String str2;
        boolean a2 = koVar.m26751a(str, 0, str.length());
        StringBuilder stringBuilder = new StringBuilder();
        if (m25640b()) {
            if (a2) {
                koVar2 = kp.f22601b;
            } else {
                koVar2 = kp.f22600a;
            }
            a = koVar2.m26751a(str, 0, str.length());
            if (!this.f21463f && (a || ke.m25641c(str) == 1)) {
                str2 = f21461d;
            } else if (!this.f21463f || (a && ke.m25641c(str) != -1)) {
                str2 = "";
            } else {
                str2 = f21462e;
            }
            stringBuilder.append(str2);
        }
        if (a2 != this.f21463f) {
            stringBuilder.append(a2 ? '‫' : '‪');
            stringBuilder.append(str);
            stringBuilder.append('‬');
        } else {
            stringBuilder.append(str);
        }
        if (a2) {
            koVar2 = kp.f22601b;
        } else {
            koVar2 = kp.f22600a;
        }
        a = koVar2.m26751a(str, 0, str.length());
        if (!this.f21463f && (a || ke.m25639b(str) == 1)) {
            str2 = f21461d;
        } else if (!this.f21463f || (a && ke.m25639b(str) != -1)) {
            str2 = "";
        } else {
            str2 = f21462e;
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public String m25642a(String str, ko koVar) {
        return m25636a(str, koVar, true);
    }

    private static int m25639b(String str) {
        return new kg(str, false).m25765b();
    }

    private static int m25641c(String str) {
        return new kg(str, false).m25764a();
    }

    static boolean m25638a(Locale locale) {
        if (kv.f23533a.mo3680a(locale) == 1) {
            return true;
        }
        return false;
    }
}
