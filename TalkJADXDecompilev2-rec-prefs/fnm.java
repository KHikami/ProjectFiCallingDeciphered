package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

public class fnm extends esw {
    private static final long serialVersionUID = 2;
    public final int f13509c;
    public final String f13510d = Locale.getDefault().toString();
    public final long f13511e;
    public final String f13512f;
    public final boolean f13513k;
    public final boolean f13514l;
    public final String f13515m;
    public final String f13516n;
    public final boolean f13517o;
    public final int f13518p;
    public final boolean f13519q;
    public final boolean f13520r;
    public final int f13521s;
    public final int f13522t;
    public final boolean f13523u;
    public String f13524v;
    private final String f13525w;

    private fnm(int i, long j, String str, boolean z, String str2, String str3, boolean z2, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, String str4) {
        this.f13509c = i;
        this.f13511e = j;
        this.f13512f = str;
        this.f13513k = z;
        this.f13515m = str2;
        this.f13516n = str3;
        this.f13517o = z2;
        this.f13518p = i2;
        this.f13519q = z3;
        this.f13520r = z4;
        this.f13514l = z5;
        this.f13521s = i3;
        this.f13522t = i4;
        this.f13523u = z6;
        this.f13525w = str4;
    }

    public static fnm m15728a(String str, long j, boolean z, String str2, boolean z2, int i, boolean z3, boolean z4, boolean z5, int i2, int i3, boolean z6, String str3) {
        return new fnm(1, j, str, z, str2, null, z2, i, z3, z4, z5, i2, i3, z6, str3);
    }

    public static fnm m15726a(String str, long j, String str2) {
        return new fnm(2, j, str, false, str2, null, true, 0, false, false, false, 0, 0, false, null);
    }

    public static fnm m15727a(String str, long j, String str2, String str3) {
        return new fnm(2, j, str, false, str2, str3, true, 0, false, false, false, 0, 0, false, null);
    }

    public boolean mo2043l() {
        return !this.f13517o;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lug = new lug();
        lug.requestHeader = euk.m14556a(str, i, i2, this.i);
        lug.f26451a = Integer.valueOf(1);
        lug.f26471u = this.f13515m;
        lug.f26452b = Integer.valueOf(this.f13509c);
        lug.f26468r = this.f13512f;
        lug.f26467q = Long.valueOf(this.f13511e);
        lug.f26453c = this.f13510d;
        lug.f26449F = Boolean.valueOf(this.f13523u);
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.google.chat.MESSAGING");
        if (this.f13509c == 1 && this.f13513k) {
            arrayList.add("com.google.hangout.RING");
            arrayList.add("com.google.hangout.VOICEONLY");
            if (this.f13514l) {
                arrayList.add("com.google.hangout.PSTN_RING");
            }
        }
        lug.f26470t = (String[]) arrayList.toArray(new String[arrayList.size()]);
        if (!TextUtils.isEmpty(this.f13516n)) {
            if (glk.m17973a("BabelClient", 3)) {
                String str2 = "BabelClient";
                String str3 = "Unregistering removed account:";
                String valueOf = String.valueOf(this.f13516n);
                if (valueOf.length() != 0) {
                    valueOf = str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
                glk.m17976b(str2, valueOf, new Object[0]);
            }
            lug.f26448E = this.f13516n;
        }
        if (this.f13518p > 0) {
            lug.f26473w = Integer.valueOf(this.f13518p);
        }
        if (this.f13519q && this.f13520r) {
            lug.f26444A = new String[2];
            lug.f26444A[0] = "com.google.chat.DEVICE_SMS_ENABLED";
            lug.f26444A[1] = "com.google.chat.SMS_ACCOUNT";
        } else if (this.f13519q) {
            lug.f26444A = new String[1];
            lug.f26444A[0] = "com.google.chat.DEVICE_SMS_ENABLED";
        }
        lug.f26445B = Integer.valueOf(this.f13521s);
        lug.f26446C = Integer.valueOf(this.f13522t);
        if (this.f13525w != null) {
            muu muu = new muu();
            muu.f28411a = this.f13525w;
            lvy lvy = new lvy();
            lvy.f26628a = muu;
            lug.f26450G = lvy;
        }
        return lug;
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return this.f13517o && super.mo1008a(context, eaf, fdo);
    }

    public long mo1017b() {
        if (this.f13517o) {
            return fde.m15006b();
        }
        return 0;
    }

    public boolean mo1015a(ead ead) {
        boolean z = true;
        iil.m21869a(getClass(), ead.getClass());
        fnm fnm = (fnm) ead;
        if (!TextUtils.equals(this.f13516n, fnm.f13516n)) {
            return false;
        }
        if (this.f13509c != fnm.f13509c) {
            if (a) {
                new StringBuilder(69).append("Replacing a DeviceRegistrationRequest with different type:").append(fnm.f13509c);
            }
            return true;
        }
        boolean z2;
        if (this.f13517o != fnm.f13517o) {
            if (this.f13517o) {
                z = false;
            }
            z2 = z;
        } else {
            z2 = true;
        }
        if (!z2 || !a) {
            return z2;
        }
        z = fnm.f13517o;
        new StringBuilder(79).append("Replacing a DeviceRegistrationRequest. Old withRetry=").append(z).append(". New withRetry=").append(this.f13517o);
        return z2;
    }

    public String mo1947g() {
        return "devices/registerdevice";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        if (this.f13509c == 1) {
            ((fnq) jyn.m25426a(context, fnc.class)).m15754a(bko.m5638g(), fdo);
            return;
        }
        String str = "BabelClient";
        String str2 = "Unregistering account failed: ";
        String valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
        glk.m17981d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
    }

    public boolean mo1022a(int i) {
        return true;
    }

    public ead mo1021a() {
        return this;
    }
}
