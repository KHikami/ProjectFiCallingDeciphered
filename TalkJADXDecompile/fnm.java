import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

public class fnm extends esw {
    private static final long serialVersionUID = 2;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final int t;
    public final boolean u;
    public String v;
    private final String w;

    private fnm(int i, long j, String str, boolean z, String str2, String str3, boolean z2, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, String str4) {
        this.c = i;
        this.d = Locale.getDefault().toString();
        this.e = j;
        this.f = str;
        this.k = z;
        this.m = str2;
        this.n = str3;
        this.o = z2;
        this.p = i2;
        this.q = z3;
        this.r = z4;
        this.l = z5;
        this.s = i3;
        this.t = i4;
        this.u = z6;
        this.w = str4;
    }

    public static fnm a(String str, long j, boolean z, String str2, boolean z2, int i, boolean z3, boolean z4, boolean z5, int i2, int i3, boolean z6, String str3) {
        return new fnm(1, j, str, z, str2, null, z2, i, z3, z4, z5, i2, i3, z6, str3);
    }

    public static fnm a(String str, long j, String str2) {
        return new fnm(2, j, str, false, str2, null, true, 0, false, false, false, 0, 0, false, null);
    }

    public static fnm a(String str, long j, String str2, String str3) {
        return new fnm(2, j, str, false, str2, str3, true, 0, false, false, false, 0, 0, false, null);
    }

    public boolean l() {
        return !this.o;
    }

    public nzf a(String str, int i, int i2) {
        nzf lug = new lug();
        lug.requestHeader = euk.a(str, i, i2, this.i);
        lug.a = Integer.valueOf(1);
        lug.u = this.m;
        lug.b = Integer.valueOf(this.c);
        lug.r = this.f;
        lug.q = Long.valueOf(this.e);
        lug.c = this.d;
        lug.F = Boolean.valueOf(this.u);
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.google.chat.MESSAGING");
        if (this.c == 1 && this.k) {
            arrayList.add("com.google.hangout.RING");
            arrayList.add("com.google.hangout.VOICEONLY");
            if (this.l) {
                arrayList.add("com.google.hangout.PSTN_RING");
            }
        }
        lug.t = (String[]) arrayList.toArray(new String[arrayList.size()]);
        if (!TextUtils.isEmpty(this.n)) {
            if (glk.a("BabelClient", 3)) {
                String str2 = "BabelClient";
                String str3 = "Unregistering removed account:";
                String valueOf = String.valueOf(this.n);
                if (valueOf.length() != 0) {
                    valueOf = str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
                glk.b(str2, valueOf, new Object[0]);
            }
            lug.E = this.n;
        }
        if (this.p > 0) {
            lug.w = Integer.valueOf(this.p);
        }
        if (this.q && this.r) {
            lug.A = new String[2];
            lug.A[0] = "com.google.chat.DEVICE_SMS_ENABLED";
            lug.A[1] = "com.google.chat.SMS_ACCOUNT";
        } else if (this.q) {
            lug.A = new String[1];
            lug.A[0] = "com.google.chat.DEVICE_SMS_ENABLED";
        }
        lug.B = Integer.valueOf(this.s);
        lug.C = Integer.valueOf(this.t);
        if (this.w != null) {
            muu muu = new muu();
            muu.a = this.w;
            lvy lvy = new lvy();
            lvy.a = muu;
            lug.G = lvy;
        }
        return lug;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return this.o && super.a(context, eaf, fdo);
    }

    public long b() {
        if (this.o) {
            return fde.b();
        }
        return 0;
    }

    public boolean a(ead ead) {
        boolean z = true;
        iil.a(getClass(), ead.getClass());
        fnm fnm = (fnm) ead;
        if (!TextUtils.equals(this.n, fnm.n)) {
            return false;
        }
        if (this.c != fnm.c) {
            if (a) {
                new StringBuilder(69).append("Replacing a DeviceRegistrationRequest with different type:").append(fnm.c);
            }
            return true;
        }
        boolean z2;
        if (this.o != fnm.o) {
            if (this.o) {
                z = false;
            }
            z2 = z;
        } else {
            z2 = true;
        }
        if (!z2 || !a) {
            return z2;
        }
        z = fnm.o;
        new StringBuilder(79).append("Replacing a DeviceRegistrationRequest. Old withRetry=").append(z).append(". New withRetry=").append(this.o);
        return z2;
    }

    public String g() {
        return "devices/registerdevice";
    }

    public void a(Context context, bko bko, fdo fdo) {
        if (this.c == 1) {
            ((fnq) jyn.a(context, fnc.class)).a(bko.g(), fdo);
            return;
        }
        String str = "BabelClient";
        String str2 = "Unregistering account failed: ";
        String valueOf = String.valueOf(glk.b(bko.a()));
        glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
    }

    public boolean a(int i) {
        return true;
    }

    public ead a() {
        return this;
    }
}
