import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.net.Uri;
import android.os.SystemClock;
import android.telecom.Call.Details;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.StatusHints;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
public class azo extends bdj implements azz, bcr, bcs, bcv, bcx, bed {
    private static final String j;
    bee a;
    bec b;
    ayo c;
    ayo d;
    bbe e;
    bab f;
    Context g;
    aic h;
    private bbe k;
    private boolean l;
    private bcf m;
    private boolean n;

    public final /* synthetic */ void a(bdq bdq) {
        super.a((azq) bdq);
        bcj.b().b((bcv) this);
        bcj.b().b((bcx) this);
        bcj.b().b((bcr) this);
        bcj.b().b((bcs) this);
        if (this.c != null) {
            azs.a.b(this.c.d, (azz) this);
        }
        if (this.b != null) {
            this.b.a();
        }
        this.c = null;
        this.e = null;
        this.k = null;
    }

    public final /* synthetic */ void b(bdq bdq) {
        super.b((azq) bdq);
        if (this.h != null) {
            this.h.a("android.contacts.DISPLAY_ORDER");
        }
        if (this.e != null) {
            j();
        }
        bcj.b().a((bcv) this);
        bcj.b().a((bcx) this);
        bcj.b().a((bcr) this);
        bcj.b().a((bcs) this);
    }

    static {
        j = azo.class.getSimpleName();
    }

    public azo() {
        this.l = false;
        this.n = false;
        this.f = new bab(new azp(this));
    }

    public final void a(bcu bcu, bcu bcu2, azs azs) {
        String valueOf = String.valueOf(bcu2);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 16).append("onStateChange() ").append(valueOf).toString());
        azq azq = (azq) this.i;
        if (azq != null) {
            Object obj;
            int i;
            boolean z;
            ayo ayo = null;
            ayo ayo2 = null;
            if (bcu2 == bcu.INCOMING) {
                ayo = azs.j();
            } else if (bcu2 == bcu.PENDING_OUTGOING || bcu2 == bcu.OUTGOING) {
                ayo2 = azs.d();
                if (ayo2 == null) {
                    ayo2 = azs.a(13, 0);
                }
                ayo = ayo2;
                ayo2 = a(azs, null, true);
            } else if (bcu2 == bcu.INCALL) {
                ayo = a(azs, null, false);
                ayo2 = a(azs, ayo, true);
            }
            if (this.m != null && (bcu == bcu.INCOMING || bcu2 == bcu.INCOMING)) {
                azq.b(bcu2 != bcu.INCOMING);
            }
            String valueOf2 = String.valueOf(ayo);
            bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf2).length() + 14).append("Primary call: ").append(valueOf2).toString());
            valueOf2 = String.valueOf(ayo2);
            bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf2).length() + 16).append("Secondary call: ").append(valueOf2).toString());
            Object obj2 = (ayo.a(this.c, ayo) && ayo.b(this.c, ayo)) ? null : 1;
            Object obj3 = (ayo.a(this.d, ayo2) && ayo.b(this.d, ayo2)) ? null : 1;
            this.d = ayo2;
            ayo ayo3 = this.c;
            this.c = ayo;
            if (this.c != null) {
                bcj.b().e(this.c);
                azq.e();
            }
            if (obj2 != null && a(ayo)) {
                azq.f();
            }
            boolean f = f(this.c);
            if (this.c == null || (obj2 == null && azq.c() == i() && azq.d() == f)) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null) {
                if (ayo3 != null) {
                    a(ayo3.c(), 0);
                    azs.a.b(ayo3.d, (azz) this);
                }
                azs.a.a(this.c.d, (azz) this);
                this.e = bbc.a(this.g, this.c, this.c.c() == 4);
                j();
                a(this.c, true);
                b(this.c);
            }
            if (ayo3 != null && this.c == null) {
                a(ayo3.c(), 0);
                azs.a.b(ayo3.d, (azz) this);
            }
            if (this.d == null) {
                this.k = null;
                k();
            } else if (obj3 != null) {
                this.k = bbc.a(this.g, this.d, this.d.c() == 4);
                k();
                a(this.d, false);
                b(this.d);
            }
            if (e()) {
                bdf.a((Object) this, "Starting the calltime timer");
                bab bab = this.f;
                if (1000 > 0) {
                    bab.a();
                    bab.b = 1000;
                    bab.a = SystemClock.uptimeMillis();
                    bab.c = true;
                    bab.b();
                }
            } else {
                bdf.a((Object) this, "Canceling the calltime timer");
                this.f.a();
                azq.a(false, 0);
            }
            if (this.c != null) {
                int c = this.c.c();
                f();
                i = c;
            } else {
                ((azq) this.i).a(2, 0, 0, new DisconnectCause(0), null, null, null, false, false, false);
                ((azq) this.i).e(false);
                i = 2;
            }
            h();
            azq = (azq) this.i;
            if (this.c == null) {
                z = false;
            } else if ((!buf.e(i) && i != 9) || i == 4) {
                z = false;
            } else if (this.c.i == 3) {
                z = false;
            } else {
                z = true;
            }
            if (i != 4) {
                f = true;
            } else {
                f = false;
            }
            azq.a(z, f);
            if (this.g != null && ((AccessibilityManager) this.g.getSystemService("accessibility")).isEnabled()) {
                if (((bcu != bcu.OUTGOING && bcu2 == bcu.OUTGOING) || ((bcu != bcu.INCOMING && bcu2 == bcu.INCOMING) || obj2 != null)) && this.i != null) {
                    ((azq) this.i).b();
                }
            }
        }
    }

    public final void a(ayo ayo, Details details) {
        f();
        if (ayo.b(128) != details.can(128)) {
            h();
        }
    }

    public final void d(ayo ayo) {
    }

    public final void a(int i) {
        bdf.a((Object) this, "onSessionModificationStateChange : sessionModificationState = " + i);
        if (this.c != null) {
            a(this.c.c(), i);
            ((azq) this.i).a(i != 3, true);
            f();
        }
    }

    public final void a() {
        bdf.b((Object) this, "onLastForwardedNumberChange");
        if (this.c != null) {
            j();
        }
    }

    public final void b() {
        bdf.b((Object) this, "onChildNumberChange");
        if (this.c != null) {
            j();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f() {
        /*
        r14 = this;
        r11 = 0;
        r12 = 1;
        r13 = 0;
        r0 = r14.i;
        if (r0 == 0) goto L_0x00ec;
    L_0x0007:
        r0 = r14.c;
        if (r0 == 0) goto L_0x00ec;
    L_0x000b:
        r0 = r14.c;
        r1 = 32;
        r0 = r0.c(r1);
        if (r0 != 0) goto L_0x0023;
    L_0x0015:
        r0 = r14.e;
        if (r0 == 0) goto L_0x00ed;
    L_0x0019:
        r0 = r14.e;
        r0 = r0.p;
        r2 = 1;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x00ed;
    L_0x0023:
        r10 = r12;
    L_0x0024:
        r0 = r14.i;
        r0 = (azq) r0;
        r1 = r14.c;
        r1 = r1.c();
        r2 = r14.c;
        r2 = r2.k();
        r3 = r14.c;
        r3 = r3.i;
        r4 = r14.c;
        r4 = r4.f();
        r5 = r14.l();
        r6 = r14.c;
        r6 = r6.b;
        r6 = r6.getDetails();
        r6 = r6.getStatusHints();
        if (r6 == 0) goto L_0x00f0;
    L_0x0050:
        r7 = r6.getIcon();
        if (r7 == 0) goto L_0x00f0;
    L_0x0056:
        r6 = r6.getIcon();
        r7 = r14.g;
        r6 = r6.loadDrawable(r7);
        if (r6 == 0) goto L_0x00f0;
    L_0x0062:
        r7 = r14.m();
        if (r7 == 0) goto L_0x00f3;
    L_0x0068:
        r7 = r14.c;
        r7 = r7.h();
        r7 = r7.getGatewayAddress();
        r7 = a(r7);
    L_0x0076:
        r8 = r14.c;
        r9 = 8;
        r8 = r8.c(r9);
        r9 = r14.c;
        r9 = r9.c(r12);
        r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r14.g();
        r0 = r14.c;
        r1 = 4;
        r1 = r0.c(r1);
        r0 = r14.c;
        r0 = r0.h;
        if (r0 != 0) goto L_0x0099;
    L_0x0097:
        if (r1 == 0) goto L_0x00f7;
    L_0x0099:
        r0 = r14.c;
        r0 = r0.i();
        if (r0 == 0) goto L_0x00f5;
    L_0x00a1:
        r2 = bcj.b();
        r2 = r2.n();
        r0 = buf.a(r2, r0);
        if (r0 == 0) goto L_0x00f5;
    L_0x00af:
        r0 = r0.getSubscriptionAddress();
        r0 = a(r0);
    L_0x00b7:
        r2 = bcj.b();
        r2 = r2.n();
        r3 = bcj.b();
        r3 = r3.z;
        r4 = r14.c;
        r4 = r4.i();
        r2 = buf.a(r2, r3, r4);
        if (r1 != 0) goto L_0x0112;
    L_0x00d1:
        r2 = android.telephony.PhoneNumberUtils.compare(r0, r2);
        if (r2 == 0) goto L_0x0112;
    L_0x00d7:
        r0 = "Numbers are the same (and callback number is not being forced to show); not showing the callback number";
        bdf.a(r14, r0);
    L_0x00dc:
        r0 = r14.i;
        r0 = (azq) r0;
        r2 = r14.c;
        r2 = r2.h;
        if (r2 != 0) goto L_0x00e8;
    L_0x00e6:
        if (r1 == 0) goto L_0x00e9;
    L_0x00e8:
        r11 = r12;
    L_0x00e9:
        r0.a(r13, r11);
    L_0x00ec:
        return;
    L_0x00ed:
        r10 = r11;
        goto L_0x0024;
    L_0x00f0:
        r6 = r13;
        goto L_0x0062;
    L_0x00f3:
        r7 = r13;
        goto L_0x0076;
    L_0x00f5:
        r0 = r13;
        goto L_0x00b7;
    L_0x00f7:
        r0 = r14.c;
        r0 = r0.b;
        r0 = r0.getDetails();
        r0 = r0.getStatusHints();
        if (r0 == 0) goto L_0x0114;
    L_0x0105:
        r0 = r0.getExtras();
        if (r0 == 0) goto L_0x0114;
    L_0x010b:
        r2 = "android.telecom.extra.CALL_BACK_NUMBER";
        r0 = r0.getString(r2);
        goto L_0x00b7;
    L_0x0112:
        r13 = r0;
        goto L_0x00dc;
    L_0x0114:
        r0 = r13;
        goto L_0x00b7;
        */
        throw new UnsupportedOperationException("Method not decompiled: azo.f():void");
    }

    private final void g() {
        boolean z;
        if (e() && this.c.c(16) && TextUtils.isEmpty(this.c.l)) {
            z = true;
        } else {
            z = false;
        }
        ((azq) this.i).e(z);
    }

    private final void a(int i, int i2) {
        boolean z = i2 == 1 && i == 3;
        if (z != this.l) {
            ((azq) this.i).a(z);
            this.l = z;
        }
    }

    private final boolean i() {
        if (this.c == null || !this.c.b(128) || this.n) {
            return false;
        }
        return true;
    }

    private final void a(ayo ayo, boolean z) {
        boolean z2 = true;
        if (ayo != null && !ayo.c(1)) {
            if (ayo.c() != 4) {
                z2 = false;
            }
            a(ayo, z, z2);
        }
    }

    final void a(ayo ayo, boolean z, boolean z2) {
        bbc.a(this.g).a(ayo, z2, new azr(this, z));
    }

    public final void c() {
        d();
    }

    final void d() {
        if (this.c == null || this.e == null || (this.e.m == null && this.e.n == null)) {
            ((azq) this.i).b(false);
            return;
        }
        boolean z;
        bcf bcf;
        if (this.m == null) {
            this.m = new bcf(this.g, true);
            z = true;
        } else {
            z = this.m.a(true);
        }
        if (z) {
            azq azq = (azq) this.i;
            bcf = this.m;
            if (bcf.c == null) {
                bcf.c = bcf.d.inflate(buf.kQ, null);
            }
            azq.a(bcf.c);
        }
        bcf = this.m;
        Address address = this.e.m;
        float a = this.b.a(this.e.m);
        List list = this.e.n;
        bcf.b.clear();
        Collection arrayList = new ArrayList();
        if (list != null) {
            bcg a2 = bcf.a(list);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (address != null) {
            Object obj;
            Locale locale = Locale.getDefault();
            if (address == null) {
                obj = null;
            } else {
                obj = new bcg((byte) 0);
                obj.a = buf.kt;
                if (a != -1.0f) {
                    if (Locale.US.equals(locale)) {
                        obj.b = bcf.a.getString(aq.cs, new Object[]{Float.valueOf(a * 6.213712E-4f)});
                    } else {
                        obj.b = bcf.a.getString(aq.ct, new Object[]{Float.valueOf(a * 0.001f)});
                    }
                }
                if (address.getLocality() != null) {
                    obj.c = bcf.a.getString(aq.cr, new Object[]{address.getAddressLine(0), address.getLocality()});
                } else {
                    obj.c = address.getAddressLine(0);
                }
            }
            arrayList.add(obj);
        }
        bcf.b.addAll(arrayList);
        ((azq) this.i).a(this.m.b);
        ((azq) this.i).b(this.c.c() != 4);
    }

    final void a(bbe bbe, boolean z) {
        if (z) {
            this.e = bbe;
            j();
            return;
        }
        this.k = bbe;
        k();
    }

    private static ayo a(azs azs, ayo ayo, boolean z) {
        ayo a = azs.a(3, 0);
        if (a != null && a != ayo) {
            return a;
        }
        a = azs.a(3, 1);
        if (a != null && a != ayo) {
            return a;
        }
        if (!z) {
            a = azs.a(9, 0);
            if (a != null && a != ayo) {
                return a;
            }
            a = azs.a(10, 0);
            if (!(a == null || a == ayo)) {
                return a;
            }
        }
        a = azs.a(8, 0);
        if (a == null || a == ayo) {
            return azs.a(8, 1);
        }
        return a;
    }

    private final void k() {
        azq azq = (azq) this.i;
        if (azq != null) {
            if (this.d == null) {
                azq.a(false, null, false, null, false, false, this.n);
            } else if (this.d.c(1)) {
                azq.a(true, e(this.d), false, c(this.d), true, this.d.a(this.g), this.n);
            } else if (this.k != null) {
                boolean z;
                String str = j;
                String valueOf = String.valueOf(this.k);
                bdf.a(str, new StringBuilder(String.valueOf(valueOf).length() + 29).append("updateSecondaryDisplayInfo() ").append(valueOf).toString());
                valueOf = a(this.k);
                if (valueOf == null || !valueOf.equals(this.k.c)) {
                    z = false;
                } else {
                    z = true;
                }
                azq.a(true, valueOf, z, c(this.d), false, this.d.a(this.g), this.n);
            } else {
                azq.a(false, null, false, null, false, false, this.n);
            }
        }
    }

    private final String c(ayo ayo) {
        PhoneAccount phoneAccount;
        PhoneAccountHandle i = ayo.i();
        if (i == null) {
            phoneAccount = null;
        } else {
            phoneAccount = buf.a(bcj.b().n(), i);
        }
        TelecomManager n = bcj.b().n();
        if (phoneAccount == null || TextUtils.isEmpty(phoneAccount.getLabel()) || buf.a(n).size() <= 1) {
            return null;
        }
        return phoneAccount.getLabel().toString();
    }

    private final String l() {
        StatusHints statusHints = this.c.b.getDetails().getStatusHints();
        if (statusHints != null && !TextUtils.isEmpty(statusHints.getLabel())) {
            return statusHints.getLabel().toString();
        }
        if (!m() || this.i == null) {
            return c(this.c);
        }
        PackageManager packageManager = this.g.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.c.h().getGatewayProviderPackageName(), 0)).toString();
        } catch (Exception e) {
            bdf.a((Object) this, "Gateway Application Not Found.", e);
            return null;
        }
    }

    private final boolean m() {
        if (this.c == null || !buf.f(this.c.c()) || this.c.h() == null || this.c.h().isEmpty()) {
            return false;
        }
        return true;
    }

    private String a(bbe bbe) {
        String a = aim.a(bbe.a, bbe.b, this.h);
        if (TextUtils.isEmpty(a)) {
            return bbe.c;
        }
        return a;
    }

    private static String a(Uri uri) {
        return uri == null ? "" : uri.getSchemeSpecificPart();
    }

    public final void a(boolean z) {
        boolean z2 = true;
        this.n = z;
        azq azq = (azq) this.i;
        if (azq != null) {
            boolean z3;
            if (z) {
                z3 = false;
            } else {
                z3 = true;
            }
            azq.c(z3);
            if (z) {
                z2 = false;
            }
            azq.d(z2);
            h();
        }
    }

    public final void a(boolean z, int i) {
    }

    final boolean e() {
        return this.c != null && this.c.c() == 3;
    }

    private final String e(ayo ayo) {
        boolean c = ayo.c(2);
        bdf.b((Object) this, "getConferenceString: " + c);
        return this.g.getResources().getString(c ? aq.cb : aq.bY);
    }

    private final boolean f(ayo ayo) {
        if (ayo == null) {
            return false;
        }
        boolean z;
        if (this.c.c() == 4 || this.c.c() == 5) {
            z = true;
        } else {
            z = false;
        }
        if (z && !TextUtils.isEmpty(ayo.m) && ayo.d() == 1 && ayo.t) {
            return true;
        }
        return false;
    }

    static boolean a(ayo ayo) {
        if (ayo != null) {
            boolean z;
            if (TextUtils.isEmpty(ayo.b.getDetails().getIntentExtras().getString("android.telecom.extra.CALL_SUBJECT"))) {
                z = false;
            } else {
                z = true;
            }
            if (z && (ayo.c() == 6 || ayo.c() == 13)) {
                return true;
            }
        }
        return false;
    }

    public final void a(bcu bcu, bcu bcu2, ayo ayo) {
        a(bcu, bcu2, azs.a);
    }

    private final void h() {
        ((azq) this.i).g(i());
    }

    private static void b(ayo ayo) {
        if (ayo.i != 3) {
            ayo.d(0);
        }
    }

    private final void j() {
        azq azq = (azq) this.i;
        if (azq == null) {
            bdf.a(j, "updatePrimaryDisplayInfo called but ui is null!");
        } else if (this.c == null) {
            azq.a(null, null, false, null, null, false, false, false, false);
        } else {
            boolean z = !bdt.a(this.c.k(), this.c.c());
            boolean c = this.c.c(32);
            String e;
            Drawable drawable;
            if (this.c.c(1)) {
                bdf.a(j, "Update primary display info for conference call.");
                e = e(this.c);
                boolean c2 = this.c.c(2);
                bdf.b((Object) this, "getConferencePhoto: " + c2);
                drawable = this.g.getResources().getDrawable(c2 ? buf.kG : buf.kE);
                drawable.setAutoMirrored(true);
                azq.a(null, e, false, null, drawable, false, z, c, false);
            } else if (this.e != null) {
                String str = j;
                e = String.valueOf(this.e);
                bdf.a(str, new StringBuilder(String.valueOf(e).length() + 32).append("Update primary display info for ").append(e).toString());
                e = a(this.e);
                Object obj = !TextUtils.isEmpty(this.c.k) ? 1 : null;
                boolean z2 = !TextUtils.isEmpty(this.c.l);
                boolean f = f(this.c);
                if (f) {
                    azq.a(this.c.m);
                } else {
                    azq.a(null);
                }
                if (f) {
                    str = null;
                } else if (obj != null) {
                    str = this.g.getString(aq.ck, new Object[]{this.c.k});
                } else if (z2) {
                    str = this.c.l;
                } else {
                    bbe bbe = this.e;
                    if (TextUtils.isEmpty(aim.a(bbe.a, bbe.b, this.h))) {
                        str = bbe.d;
                    } else {
                        str = bbe.c;
                    }
                }
                azq.f(z2);
                g();
                z2 = e != null && e.equals(this.e.c);
                Object obj2 = this.e.p == 1 ? 1 : null;
                String str2 = (obj != null || f) ? null : this.e.e;
                drawable = this.e.f;
                f = this.e.g;
                if (c || obj2 != null) {
                    c = true;
                } else {
                    c = false;
                }
                azq.a(str, e, z2, str2, drawable, f, z, c, this.c.o);
                d();
            } else {
                azq.a(null, null, false, null, null, false, false, false, false);
            }
            if (this.a != null) {
                this.a.a((ayn) azq, this.c.h);
            }
        }
    }
}
