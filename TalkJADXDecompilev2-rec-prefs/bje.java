package p000;

import android.content.Context;
import java.io.Serializable;

public final class bje extends bjd implements Serializable {
    private final String f3472a;
    private final String f3473b;

    public bje(String str) {
        this("", str);
    }

    public bje(String str, String str2) {
        this.f3472a = str;
        this.f3473b = str2;
    }

    public String m5364b() {
        return this.f3472a;
    }

    public String m5365c() {
        return this.f3473b;
    }

    public fbw mo565a(Context context, String str) {
        return null;
    }

    protected Object[] mo566a() {
        return new Object[]{this.f3472a, this.f3473b};
    }

    public String toString() {
        String valueOf = String.valueOf(glk.m17974b(this.f3473b));
        String str = this.f3472a;
        return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str).length()).append("EmailAddress {email: ").append(valueOf).append(" | label: ").append(str).append("}").toString();
    }
}
