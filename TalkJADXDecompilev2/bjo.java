package defpackage;

import android.content.Context;
import java.io.Serializable;

public final class bjo extends bjd implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    public bjo(String str) {
        this("", str, str, str, false);
    }

    public bjo(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.c = str4;
        this.e = z;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public fbw a(Context context, String str) {
        return fbw.a(context, this.b);
    }

    protected Object[] a() {
        return new Object[]{this.a, this.b, this.d, Boolean.valueOf(this.e)};
    }

    public String toString() {
        String valueOf = String.valueOf(glk.b(this.b));
        String str = this.a;
        return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str).length()).append("PhoneNumber {number: ").append(valueOf).append(" | label: ").append(str).append("}").toString();
    }
}
