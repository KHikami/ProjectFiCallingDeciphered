package p000;

import android.content.Context;
import java.io.Serializable;

public final class bjo extends bjd implements Serializable {
    private final String f3534a;
    private final String f3535b;
    private final String f3536c;
    private final String f3537d;
    private final boolean f3538e;

    public bjo(String str) {
        this("", str, str, str, false);
    }

    public bjo(String str, String str2, String str3, String str4, boolean z) {
        this.f3534a = str;
        this.f3535b = str2;
        this.f3537d = str3;
        this.f3536c = str4;
        this.f3538e = z;
    }

    public String m5472b() {
        return this.f3534a;
    }

    public String m5473c() {
        return this.f3535b;
    }

    public String m5474d() {
        return this.f3536c;
    }

    public String m5475e() {
        return this.f3537d;
    }

    public fbw mo565a(Context context, String str) {
        return fbw.m14927a(context, this.f3535b);
    }

    protected Object[] mo566a() {
        return new Object[]{this.f3534a, this.f3535b, this.f3537d, Boolean.valueOf(this.f3538e)};
    }

    public String toString() {
        String valueOf = String.valueOf(glk.m17974b(this.f3535b));
        String str = this.f3534a;
        return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str).length()).append("PhoneNumber {number: ").append(valueOf).append(" | label: ").append(str).append("}").toString();
    }
}
