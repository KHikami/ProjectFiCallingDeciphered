package p000;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class fbw implements Serializable {
    private static final long serialVersionUID = 1;
    public final String f12666a;
    public final String f12667b;
    public final String f12668c;
    public final String f12669d;
    public final String f12670e;
    private List<fbt> f12671f;

    private fbw(String str, String str2, String str3, String str4, String str5) {
        this.f12666a = str;
        this.f12667b = str2;
        this.f12668c = str3;
        this.f12669d = str4;
        this.f12670e = str5;
        this.f12671f = null;
    }

    public static fbw m14930a(String str, String str2) {
        return new fbw(str, null, null, null, str2);
    }

    public static fbw m14932b(String str, String str2) {
        return new fbw(null, null, str, null, str2);
    }

    public static fbw m14929a(edo edo, String str, String str2) {
        return new fbw(edo.f11244a, edo.f11245b, null, str, str2);
    }

    public static fbw m14928a(edk edk) {
        String f = edk.m13596f();
        if (edk.f11213b != null) {
            return fbw.m14929a(edk.f11213b, f, edk.f11218g);
        }
        if (f == null) {
            return null;
        }
        return new fbw(null, null, null, f, edk.f11218g);
    }

    public static fbw m14927a(Context context, String str) {
        return new fbw(null, gwb.m2169e(context, str), null, str, null);
    }

    public boolean m14935a(Context context) {
        return (this.f12669d == null || this.f12667b == null || !this.f12667b.equals(gwb.m2169e(context, this.f12669d))) ? false : true;
    }

    public fbw(lsh lsh) {
        this.f12666a = lsh.f26315a;
        this.f12667b = lsh.f26317c;
        this.f12668c = lsh.f26316b;
        this.f12669d = null;
        this.f12670e = null;
    }

    public edo m14936b(Context context) {
        return gwb.m1986b(context, this.f12666a, this.f12667b, this.f12669d);
    }

    public void m14934a(fbt fbt) {
        this.f12671f = new ArrayList();
        this.f12671f.add(fbt);
    }

    public List<fbt> m14933a() {
        return this.f12671f;
    }

    public lsh m14937c(Context context) {
        lsh lsh = new lsh();
        if (this.f12666a != null) {
            lsh.f26315a = this.f12666a;
        } else if (this.f12668c != null) {
            lsh.f26316b = this.f12668c;
        } else if (this.f12669d != null) {
            lsh.f26318d = new muu();
            lsh.f26318d.f28411a = glq.m18021e(context, this.f12669d);
        }
        lsh.f26319e = this.f12670e;
        lsh.f26320f = fbt.m14919a(this.f12671f);
        return lsh;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fbw)) {
            return false;
        }
        return m14931a((fbw) obj);
    }

    public int hashCode() {
        return 0;
    }

    private boolean m14931a(Object obj) {
        if (obj instanceof fbw) {
            fbw fbw = (fbw) obj;
            if (this.f12667b != null && fbw.f12667b != null) {
                return this.f12667b.equals(fbw.f12667b);
            }
            if (this.f12666a != null && fbw.f12666a != null) {
                return this.f12666a.equals(fbw.f12666a);
            }
            if (this.f12668c != null && fbw.f12668c != null) {
                return this.f12668c.equals(fbw.f12668c);
            }
            if (!(this.f12669d == null || fbw.f12669d == null)) {
                return this.f12669d.equals(fbw.f12669d);
            }
        }
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(glk.m17974b(this.f12667b));
        String valueOf2 = String.valueOf(glk.m17974b(this.f12666a));
        String valueOf3 = String.valueOf(glk.m17974b(this.f12668c));
        String valueOf4 = String.valueOf(glk.m17974b(this.f12669d));
        return new StringBuilder((((String.valueOf(valueOf).length() + 60) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("InviteeId {chatId: ").append(valueOf).append(" | gaiaId: ").append(valueOf2).append(" | circleId: ").append(valueOf3).append(" | phoneNumber: ").append(valueOf4).append("}").toString();
    }
}
