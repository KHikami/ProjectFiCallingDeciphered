package p000;

import android.content.Context;
import android.text.TextUtils;
import java.io.Serializable;

public final class glo implements Serializable {
    private static final long serialVersionUID = 1;
    private final String f15585a;
    private final jax f15586b;
    private final boolean f15587c;
    private Boolean f15588d;
    private String f15589e;
    private Long f15590f;
    private String f15591g;

    public static void m17988a() {
        try {
            glp.f15592a.m23691a(null, null);
        } catch (jap e) {
        }
    }

    public glo(String str, String str2) {
        this(str, str2, false);
    }

    glo(String str, String str2, boolean z) {
        this.f15586b = glp.f15592a.m23691a(str, str2);
        this.f15585a = str2;
        this.f15587c = z;
        StringBuilder stringBuilder = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(charAt);
            } else if (Character.isDigit(charAt)) {
                break;
            }
        }
        if (stringBuilder != null) {
            this.f15591g = stringBuilder.toString();
        }
    }

    public boolean m17994b() {
        return this.f15587c;
    }

    public jax m17995c() {
        return this.f15586b;
    }

    public boolean m17992a(String str) {
        return TextUtils.equals(this.f15585a, str);
    }

    public boolean m17996d() {
        if (this.f15588d == null) {
            this.f15588d = Boolean.valueOf(glp.f15592a.m23704b(this.f15586b));
        }
        return gwb.m2061b(this.f15588d);
    }

    public int m17993b(String str) {
        String f = m17998f();
        if (f != null) {
            str = f;
        }
        return glp.f15592a.m23707e(str);
    }

    public long m17997e() {
        if (this.f15590f == null) {
            this.f15590f = Long.valueOf(this.f15586b.m23726b());
        }
        return gwb.m1523a(this.f15590f);
    }

    public String m17998f() {
        if (this.f15589e == null) {
            this.f15589e = glp.f15592a.m23705c(this.f15586b);
        }
        return this.f15589e;
    }

    public String m17990a(int i) {
        return glp.f15592a.m23689a(this.f15586b, i);
    }

    public jat m17989a(glo glo) {
        boolean equalsIgnoreCase = this.f15591g == null ? glo.f15591g == null : this.f15591g.equalsIgnoreCase(glo.f15591g);
        if (equalsIgnoreCase) {
            return glp.f15592a.m23686a(this.f15586b, glo.f15586b);
        }
        return jat.NO_MATCH;
    }

    public boolean m17991a(Context context) {
        return jbc.f19671a.m23760a(Long.toString(this.f15586b.m23726b()), (String) mfa.m31911c(this.f15585a).mo3732a(glq.m18037i(context)));
    }
}
