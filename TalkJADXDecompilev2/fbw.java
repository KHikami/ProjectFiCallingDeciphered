package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class fbw implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    private List<fbt> f;

    private fbw(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = null;
    }

    public static fbw a(String str, String str2) {
        return new fbw(str, null, null, null, str2);
    }

    public static fbw b(String str, String str2) {
        return new fbw(null, null, str, null, str2);
    }

    public static fbw a(edo edo, String str, String str2) {
        return new fbw(edo.a, edo.b, null, str, str2);
    }

    public static fbw a(edk edk) {
        String f = edk.f();
        if (edk.b != null) {
            return fbw.a(edk.b, f, edk.g);
        }
        if (f == null) {
            return null;
        }
        return new fbw(null, null, null, f, edk.g);
    }

    public static fbw a(Context context, String str) {
        return new fbw(null, gwb.e(context, str), null, str, null);
    }

    public boolean a(Context context) {
        return (this.d == null || this.b == null || !this.b.equals(gwb.e(context, this.d))) ? false : true;
    }

    public fbw(lsh lsh) {
        this.a = lsh.a;
        this.b = lsh.c;
        this.c = lsh.b;
        this.d = null;
        this.e = null;
    }

    public edo b(Context context) {
        return gwb.b(context, this.a, this.b, this.d);
    }

    public void a(fbt fbt) {
        this.f = new ArrayList();
        this.f.add(fbt);
    }

    public List<fbt> a() {
        return this.f;
    }

    public lsh c(Context context) {
        lsh lsh = new lsh();
        if (this.a != null) {
            lsh.a = this.a;
        } else if (this.c != null) {
            lsh.b = this.c;
        } else if (this.d != null) {
            lsh.d = new muu();
            lsh.d.a = glq.e(context, this.d);
        }
        lsh.e = this.e;
        lsh.f = fbt.a(this.f);
        return lsh;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fbw)) {
            return false;
        }
        return a((fbw) obj);
    }

    public int hashCode() {
        return 0;
    }

    private boolean a(Object obj) {
        if (obj instanceof fbw) {
            fbw fbw = (fbw) obj;
            if (this.b != null && fbw.b != null) {
                return this.b.equals(fbw.b);
            }
            if (this.a != null && fbw.a != null) {
                return this.a.equals(fbw.a);
            }
            if (this.c != null && fbw.c != null) {
                return this.c.equals(fbw.c);
            }
            if (!(this.d == null || fbw.d == null)) {
                return this.d.equals(fbw.d);
            }
        }
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(glk.b(this.b));
        String valueOf2 = String.valueOf(glk.b(this.a));
        String valueOf3 = String.valueOf(glk.b(this.c));
        String valueOf4 = String.valueOf(glk.b(this.d));
        return new StringBuilder((((String.valueOf(valueOf).length() + 60) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("InviteeId {chatId: ").append(valueOf).append(" | gaiaId: ").append(valueOf2).append(" | circleId: ").append(valueOf3).append(" | phoneNumber: ").append(valueOf4).append("}").toString();
    }
}
