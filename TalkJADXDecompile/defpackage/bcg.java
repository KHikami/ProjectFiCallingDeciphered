package defpackage;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: bcg */
public final class bcg implements Serializable {
    private static final long serialVersionUID = 1;
    private final String a;
    private String b;
    private final int c;
    private final bci d;

    public bcg(bch bch) {
        iil.b("Circle id can't be null", bch.a);
        this.a = bch.a;
        this.b = bch.b;
        this.c = bch.c;
        this.d = bch.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcg)) {
            return false;
        }
        return this.a.equals(((bcg) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public static bch newBuilder() {
        return new bch();
    }

    public static bch newBuilder(bcg bcg) {
        return bcg.newBuilder().a(bcg);
    }

    public boolean a() {
        return !TextUtils.isEmpty(this.a);
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return !TextUtils.isEmpty(this.b);
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public boolean f() {
        return this.d != null;
    }

    public bci g() {
        return this.d;
    }
}
