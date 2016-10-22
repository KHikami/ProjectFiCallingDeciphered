package defpackage;

import android.content.Context;
import java.io.Serializable;

/* renamed from: bje */
public final class bje extends bjd implements Serializable {
    private final String a;
    private final String b;

    public bje(String str) {
        this("", str);
    }

    public bje(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public fbw a(Context context, String str) {
        return null;
    }

    protected Object[] a() {
        return new Object[]{this.a, this.b};
    }

    public String toString() {
        String valueOf = String.valueOf(glk.b(this.b));
        String str = this.a;
        return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str).length()).append("EmailAddress {email: ").append(valueOf).append(" | label: ").append(str).append("}").toString();
    }
}
