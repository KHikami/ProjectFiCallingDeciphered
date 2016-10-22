import android.content.Context;
import android.text.TextUtils;
import java.io.Serializable;

public final class glo implements Serializable {
    private static final long serialVersionUID = 1;
    private final String a;
    private final jax b;
    private final boolean c;
    private Boolean d;
    private String e;
    private Long f;
    private String g;

    public static void a() {
        try {
            glp.a.a(null, null);
        } catch (jap e) {
        }
    }

    public glo(String str, String str2) {
        this(str, str2, false);
    }

    glo(String str, String str2, boolean z) {
        this.b = glp.a.a(str, str2);
        this.a = str2;
        this.c = z;
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
            this.g = stringBuilder.toString();
        }
    }

    public boolean b() {
        return this.c;
    }

    public jax c() {
        return this.b;
    }

    public boolean a(String str) {
        return TextUtils.equals(this.a, str);
    }

    public boolean d() {
        if (this.d == null) {
            this.d = Boolean.valueOf(glp.a.b(this.b));
        }
        return gwb.b(this.d);
    }

    public int b(String str) {
        String f = f();
        if (f != null) {
            str = f;
        }
        return glp.a.e(str);
    }

    public long e() {
        if (this.f == null) {
            this.f = Long.valueOf(this.b.b());
        }
        return gwb.a(this.f);
    }

    public String f() {
        if (this.e == null) {
            this.e = glp.a.c(this.b);
        }
        return this.e;
    }

    public String a(int i) {
        return glp.a.a(this.b, i);
    }

    public jat a(glo glo) {
        boolean equalsIgnoreCase = this.g == null ? glo.g == null : this.g.equalsIgnoreCase(glo.g);
        if (equalsIgnoreCase) {
            return glp.a.a(this.b, glo.b);
        }
        return jat.NO_MATCH;
    }

    public boolean a(Context context) {
        return jbc.a.a(Long.toString(this.b.b()), (String) mfa.c(this.a).a(glq.i(context)));
    }
}
