package defpackage;

import android.app.ActivityManager.TaskDescription;
import android.app.AlertDialog.Builder;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Bundle;
import android.telecom.Call;
import android.telecom.Call.Callback;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telecom.VideoProfile;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.android.incallui.InCallActivity;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: bcj */
public final class bcj implements baa, bas, bdb {
    private static final Bundle C;
    private static bcj D;
    boolean A;
    public bbs B;
    private final Set E;
    private final List F;
    private final Set G;
    private bcd H;
    private boolean I;
    private PhoneAccountHandle J;
    private boolean K;
    private TelecomManager L;
    final Set a;
    public final Set b;
    public final Set c;
    final Set d;
    public ayl e;
    public bdn f;
    public bbt g;
    public bbc h;
    public Context i;
    final aux j;
    public azs k;
    public bbq l;
    public InCallActivity m;
    public final Callback n;
    public bcu o;
    public bdk p;
    public boolean q;
    boolean r;
    public ayj s;
    public aup t;
    public baa u;
    public boolean v;
    public PhoneStateListener w;
    boolean x;
    public air y;
    public TelephonyManager z;

    static {
        C = new Bundle();
    }

    bcj() {
        this.E = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.F = new CopyOnWriteArrayList();
        this.a = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.b = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.c = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.d = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.G = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.j = new bck(this);
        this.n = new bcl(this);
        this.o = bcu.NO_CALLS;
        this.q = false;
        this.r = false;
        this.H = null;
        this.s = new ayj();
        this.v = false;
        this.w = new bcm(this);
        this.K = false;
        this.x = false;
        this.A = false;
        this.B = new bcn(this);
    }

    public static synchronized bcj b() {
        bcj bcj;
        synchronized (bcj.class) {
            if (D == null) {
                D = new bcj();
            }
            bcj = D;
        }
        return bcj;
    }

    public static boolean d(ayo ayo) {
        if (!(ayo == null || ayo.h)) {
            Bundle e = ayo.e();
            if (e == null) {
                e = C;
            }
            List parcelableArrayList = e.getParcelableArrayList("selectPhoneAccountAccounts");
            if (ayo.i() == null && (parcelableArrayList == null || parcelableArrayList.isEmpty())) {
                bcj b = bcj.b();
                String valueOf = String.valueOf(ayo);
                bdf.d(b, new StringBuilder(String.valueOf(valueOf).length() + 27).append("No valid accounts for call ").append(valueOf).toString());
                return true;
            }
        }
        return false;
    }

    public static boolean c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    private final void o() {
        boolean z = this.m != null && e();
        bdf.d(this, "Hide in call UI: " + z);
        if (z) {
            this.m.d(true);
            this.m.finish();
            if (this.r) {
                this.m.overridePendingTransition(0, 0);
            }
        }
    }

    public final void a(InCallActivity inCallActivity) {
        if (inCallActivity == null) {
            throw new IllegalArgumentException("unregisterActivity cannot be called with null");
        } else if (this.m == null) {
            bdf.d(this, "No InCallActivity currently set, no need to unset.");
        } else if (this.m != inCallActivity) {
            bdf.e(this, "Second instance of InCallActivity is trying to unregister when another instance is active. Ignoring.");
        } else {
            b(null);
        }
    }

    public final void b(InCallActivity inCallActivity) {
        boolean z = true;
        boolean z2 = false;
        if (inCallActivity != null) {
            if (this.m == null) {
                bdf.d(this, "UI Initialized");
            } else {
                z = false;
            }
            this.m = inCallActivity;
            this.m.d(false);
            if (!(this.k == null || this.k.g() == null)) {
                f(this.k.g());
            }
            if (this.o == bcu.NO_CALLS) {
                bdf.d(this, "UI Initialized, but no calls left.  shut down.");
                o();
                return;
            }
        }
        bdf.d(this, "UI Destroyed");
        this.m = null;
        z2 = true;
        if (z) {
            a(this.k);
        }
        if (z2) {
            j();
        }
    }

    public final void a(azs azs) {
        if (this.m != null && this.m.b != null && this.m.b.r) {
            this.A = true;
        } else if (azs != null) {
            this.A = false;
            bcu bcu = bcu.NO_CALLS;
            if (azs != null) {
                if (azs.j() != null) {
                    bcu = bcu.INCOMING;
                } else if (azs.b() != null) {
                    bcu = bcu.WAITING_FOR_ACCOUNT;
                } else if (azs.c() != null) {
                    bcu = bcu.PENDING_OUTGOING;
                } else if (azs.d() != null) {
                    bcu = bcu.OUTGOING;
                } else if (!(azs.e() == null && azs.f() == null && azs.g() == null && azs.h() == null)) {
                    bcu = bcu.INCALL;
                }
                if (bcu == bcu.NO_CALLS && this.I) {
                    bcu = bcu.OUTGOING;
                }
            }
            bcu bcu2 = this.o;
            String valueOf = String.valueOf(bcu2);
            String valueOf2 = String.valueOf(bcu);
            bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()).append("onCallListChange oldState= ").append(valueOf).append(" newState=").append(valueOf2).toString());
            bcu = a(bcu);
            valueOf = String.valueOf(bcu);
            bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 37).append("onCallListChange newState changed to ").append(valueOf).toString());
            valueOf = String.valueOf(bcu2);
            valueOf2 = String.valueOf(bcu);
            bdf.d(this, new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length()).append("Phone switching state: ").append(valueOf).append(" -> ").append(valueOf2).toString());
            this.o = bcu;
            for (bcv bcv : this.E) {
                valueOf2 = String.valueOf(bcv);
                String valueOf3 = String.valueOf(this.o.toString());
                bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf2).length() + 17) + String.valueOf(valueOf3).length()).append("Notify ").append(valueOf2).append(" of state ").append(valueOf3).toString());
                bcv.a(bcu2, this.o, azs);
            }
            if (e()) {
                boolean z;
                if (azs.i() == null && azs.d() == null) {
                    z = false;
                } else {
                    z = true;
                }
                this.m.a(z);
            }
        }
    }

    public final void a(ayo ayo) {
        bcu a = a(bcu.INCOMING);
        bcu bcu = this.o;
        String valueOf = String.valueOf(bcu);
        String valueOf2 = String.valueOf(a);
        bdf.d(this, new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length()).append("Phone switching state: ").append(valueOf).append(" -> ").append(valueOf2).toString());
        this.o = a;
        for (bcx a2 : this.F) {
            a2.a(bcu, this.o, ayo);
        }
    }

    public final void c(ayo ayo) {
    }

    public final void b(ayo ayo) {
        f(ayo);
        a(this.k);
        if (e()) {
            this.m.a(false);
        }
        if (ayo.h) {
            buf.D(this.i);
        }
    }

    public final void a(ayo ayo, int i) {
        String valueOf = String.valueOf(ayo);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 57).append("onUpgradeToVideoRequest call = ").append(valueOf).append(" video state = ").append(i).toString());
        if (ayo != null) {
            bdf.a((Object) ayo, "setRequestedVideoState - video state= " + i);
            if (i == ayo.k()) {
                ayo.i = 0;
                bdf.e(ayo, "setRequestedVideoState - Clearing session modification state");
                return;
            }
            ayo.i = 3;
            ayo.j = i;
            azs.a.a(ayo);
            bdf.a((Object) ayo, "setRequestedVideoState - mSessionModificationState=" + ayo.i + " video state= " + i);
            ayo.a();
        }
    }

    public final void a(boolean z, PhoneAccountHandle phoneAccountHandle) {
        bdf.d(this, "setBoundAndWaitingForOutgoingCall: " + z);
        this.I = z;
        this.J = phoneAccountHandle;
        if (z && this.o == bcu.NO_CALLS) {
            this.o = bcu.OUTGOING;
        }
    }

    public final void a() {
        if (this.m != null) {
            this.m.b(true);
            ayv ayv = this.m.b;
            ViewGroup viewGroup = (ViewGroup) ayv.j.getParent();
            ViewTreeObserver viewTreeObserver = ayv.getView().getViewTreeObserver();
            ayv.r = true;
            viewTreeObserver.addOnGlobalLayoutListener(new ayx(ayv, viewGroup));
            FragmentManager fragmentManager = this.m.getFragmentManager();
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("CircularRevealFragment");
            if (findFragmentByTag != null) {
                fragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
        }
    }

    public final void a(bcx bcx) {
        Objects.requireNonNull(bcx);
        this.F.add(bcx);
    }

    public final void b(bcx bcx) {
        if (bcx != null) {
            this.F.remove(bcx);
        }
    }

    public final void a(bcv bcv) {
        Objects.requireNonNull(bcv);
        this.E.add(bcv);
    }

    public final void b(bcv bcv) {
        if (bcv != null) {
            this.E.remove(bcv);
        }
    }

    public final void a(bcr bcr) {
        Objects.requireNonNull(bcr);
        this.a.add(bcr);
    }

    public final void b(bcr bcr) {
        if (bcr != null) {
            this.a.remove(bcr);
        }
    }

    public final void a(bcs bcs) {
        Objects.requireNonNull(bcs);
        this.G.add(bcs);
    }

    public final void b(bcs bcs) {
        if (bcs != null) {
            this.G.remove(bcs);
        }
    }

    public final void a(Context context) {
        if (this.k != null) {
            ayo d = this.k.d();
            if (d == null) {
                d = this.k.i();
            }
            if (d != null) {
                bdp.a().b(d.d);
                d.a(9);
                this.k.b(d);
            }
        } else if (this.f == null) {
            bdn.a(context);
        }
    }

    public final void a(Context context, int i) {
        if (this.k == null) {
            bdn.a(context);
            return;
        }
        ayo j = this.k.j();
        if (j != null) {
            bdp.a().a(j.d, i);
            c(false, false);
        }
    }

    public final void b(Context context) {
        if (this.k == null) {
            bdn.a(context);
            return;
        }
        ayo j = this.k.j();
        if (j != null) {
            bdp.a().a(j.d, false, null);
        }
    }

    public final void a(int i, Context context) {
        bdf.a((Object) this, " acceptUpgradeRequest videoState " + i);
        if (this.k == null) {
            bdn.a(context);
            bdf.c((Object) this, " acceptUpgradeRequest mCallList is empty so returning");
            return;
        }
        ayo l = this.k.l();
        if (l != null) {
            l.j().sendSessionModifyResponse(new VideoProfile(i));
            l.d(0);
        }
    }

    public final void c(Context context) {
        bdf.a((Object) this, " declineUpgradeRequest");
        if (this.k == null) {
            bdn.a(context);
            bdf.c((Object) this, " declineUpgradeRequest mCallList is empty so returning");
            return;
        }
        ayo l = this.k.l();
        if (l != null) {
            l.j().sendSessionModifyResponse(new VideoProfile(l.k()));
            l.d(0);
        }
    }

    public final boolean d() {
        return e() && this.m.a;
    }

    public final boolean e() {
        return (this.m == null || this.m.isDestroyed() || this.m.isFinishing()) ? false : true;
    }

    public final void f() {
        this.x = false;
        if (this.m != null) {
            this.x = this.m.isChangingConfigurations();
        }
        bdf.b((Object) this, "updateIsChangingConfigurations = " + this.x);
    }

    public final void a(boolean z) {
        boolean z2 = false;
        if (this.f != null) {
            Object obj = this.f;
            azs azs = this.k;
            bdf.a(obj, "updateInCallNotification...");
            ayo b = bdn.b(azs);
            if (b != null) {
                boolean z3 = b.c() == 4 || b.c() == 5;
                if (!TextUtils.isEmpty(obj.m)) {
                    azs.a.b(obj.m, (azz) obj);
                }
                obj.m = b.d;
                azs.a.a(b.d, (azz) obj);
                obj.c.a(b, z3, new bdo(obj));
            } else {
                if (!TextUtils.isEmpty(obj.m)) {
                    azs.a.b(obj.m, (azz) obj);
                    obj.m = null;
                }
                if (obj.g != 0) {
                    bdf.a(obj, "cancelInCall()...");
                    obj.d.cancel(obj.g);
                }
                obj.g = 0;
            }
        }
        if (this.p != null) {
            bdk bdk = this.p;
            if (z) {
                bdk.e = true;
            } else if (bdk.a.isScreenOn()) {
                bdk.e = false;
            }
            bdk.a();
        }
        Object b2 = buf.K(this.i).b(this.i);
        if (b2 != null) {
            String str = "com.android.incallui.intent.extra.FIRST_TIME_SHOWN";
            if (!this.K) {
                z2 = true;
            }
            b2.putExtra(str, z2);
            if (z) {
                bdf.a((Object) this, "Sending sticky broadcast: ", b2);
                this.i.sendStickyBroadcast(b2);
            } else {
                bdf.a((Object) this, "Removing sticky broadcast: ", b2);
                this.i.removeStickyBroadcast(b2);
            }
        }
        if (z) {
            this.K = true;
        } else {
            f();
        }
        for (bcw a : this.c) {
            a.a(z);
        }
    }

    public final void a(bcw bcw) {
        this.c.add(bcw);
    }

    public final void b(boolean z) {
        bdf.a((Object) this, "notifyVideoPauseController: mIsChangingConfigurations=" + this.x);
        if (!this.x) {
            bdx a = bdx.a();
            if (a.a != null && a.a.o == bcu.INCALL) {
                if (z) {
                    a.a("onResume");
                    a.c = false;
                    if (bdx.a(a.b)) {
                        a.a(a.b.c, true);
                        return;
                    } else {
                        a.a("onResume. Ignoring...");
                        return;
                    }
                }
                a.a("onPause");
                a.c = true;
                if (bdx.a(a.b)) {
                    a.a(a.b.c, false);
                } else {
                    a.a("onPause, Ignoring...");
                }
            }
        }
    }

    public final void c(boolean z) {
        if (!d() && this.o != bcu.NO_CALLS) {
            c(z, false);
        }
    }

    public final void g() {
        bdf.d(this, "Dialog dismissed");
        if (this.o == bcu.NO_CALLS) {
            o();
            j();
        }
    }

    public final boolean h() {
        boolean z;
        if (this.v) {
            z = false;
        } else {
            z = true;
        }
        bdf.b((Object) this, "toggleFullscreenMode = " + z);
        a(z, false);
        return this.v;
    }

    public final void a(boolean z, boolean z2) {
        bdf.b((Object) this, "setFullScreen = " + z);
        if (l()) {
            z = false;
            bdf.b((Object) this, "setFullScreen overridden as dialpad is shown = false");
        }
        if (this.v != z || z2) {
            this.v = z;
            e(this.v);
            return;
        }
        bdf.b((Object) this, "setFullScreen ignored as already in that state.");
    }

    private void e(boolean z) {
        for (bcs a : this.G) {
            a.a(z);
        }
    }

    public final void a(boolean z, int i) {
        for (bcs a : this.G) {
            a.a(z, i);
        }
    }

    private final void f(ayo ayo) {
        if (e() && ayo.c() == 10) {
            Object string;
            if (ayo.i() == null && !ayo.c(1)) {
                Call call = ayo.b;
                Bundle intentExtras = call.getDetails().getIntentExtras();
                if (intentExtras == null) {
                    intentExtras = new Bundle();
                }
                List parcelableArrayList = intentExtras.getParcelableArrayList("selectPhoneAccountAccounts");
                if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                    if ("tel".equals(call.getDetails().getHandle().getScheme())) {
                        string = this.i.getString(aq.bT);
                    } else {
                        string = this.i.getString(aq.cw);
                    }
                    ayo.a(new DisconnectCause(1, null, string, string));
                }
            }
            string = this.m;
            DisconnectCause f = ayo.f();
            bdf.a(string, "maybeShowErrorDialogOnDisconnect");
            if (!string.isFinishing() && !TextUtils.isEmpty(f.getDescription())) {
                if (f.getCode() == 1 || f.getCode() == 8) {
                    CharSequence description = f.getDescription();
                    String valueOf = String.valueOf(description);
                    bdf.d(string, new StringBuilder(String.valueOf(valueOf).length() + 13).append("Show Dialog: ").append(valueOf).toString());
                    string.b();
                    string.d = new Builder(string).setMessage(description).setPositiveButton(17039370, new bcc(string)).setOnCancelListener(new bcb(string)).create();
                    string.d.getWindow().addFlags(2);
                    string.d.show();
                }
            }
        }
    }

    private final bcu a(bcu bcu) {
        boolean z = true;
        boolean z2 = false;
        String valueOf = String.valueOf(this.o);
        String valueOf2 = String.valueOf(bcu);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append("startOrFinishUi: ").append(valueOf).append(" -> ").append(valueOf2).toString());
        if (bcu == this.o) {
            return bcu;
        }
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        boolean z5 = bcu.INCOMING == bcu;
        if (bcu.WAITING_FOR_ACCOUNT == bcu) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (d()) {
            if (this.m == null || this.m.b == null) {
                z4 = false;
            } else {
                z4 = this.m.b.isVisible();
            }
            if (z4) {
                z4 = false;
                if (bcu.OUTGOING == bcu || !z4) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (bcu.PENDING_OUTGOING == this.o || bcu.INCALL != bcu || d()) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                i |= i2;
                i3 = (bcu.PENDING_OUTGOING != bcu && z4 && bcj.d(this.k.c())) ? 1 : 0;
                i |= i3;
                if (this.m != null || e()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    valueOf = String.valueOf(bcu);
                    String valueOf3 = String.valueOf(this.o);
                    bdf.d(this, new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf3).length()).append("Undo the state change: ").append(valueOf).append(" -> ").append(valueOf3).toString());
                    return this.o;
                } else if (i == 0 || z3) {
                    bdf.d(this, "Start in call UI");
                    if (z3) {
                        z = false;
                    }
                    c(false, z);
                    return bcu;
                } else if (z5) {
                    bdf.d(this, "Start Full Screen in call UI");
                    if (e()) {
                        this.m.b();
                    }
                    z5 = (this.k.e() == null || this.k.j() == null) ? false : true;
                    if (z5) {
                        if (this.p.a.isScreenOn()) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5 && e()) {
                            bdf.d(this, "Restarting InCallActivity to turn screen on for call waiting");
                            this.m.finish();
                        } else {
                            c(false, false);
                            z2 = true;
                        }
                    } else {
                        Object obj = this.f;
                        azs azs = this.k;
                        bdf.a(obj, "updateInCallNotification...");
                        ayo b = bdn.b(azs);
                        if (b != null) {
                            if (b.c() == 4 || b.c() == 5) {
                                z2 = true;
                            }
                            if (!TextUtils.isEmpty(obj.m)) {
                                azs.a.b(obj.m, (azz) obj);
                            }
                            obj.m = b.d;
                            azs.a.a(b.d, (azz) obj);
                            obj.c.a(b, z2, new bdo(obj));
                        } else {
                            if (!TextUtils.isEmpty(obj.m)) {
                                azs.a.b(obj.m, (azz) obj);
                                obj.m = null;
                            }
                            if (obj.g != 0) {
                                bdf.a(obj, "cancelInCall()...");
                                obj.d.cancel(obj.g);
                            }
                            obj.g = 0;
                        }
                        z2 = true;
                    }
                    if (z2) {
                        return bcu;
                    }
                    return this.o;
                } else if (bcu != bcu.NO_CALLS) {
                    return bcu;
                } else {
                    o();
                    j();
                    return bcu;
                }
            }
        }
        z4 = true;
        if (bcu.OUTGOING == bcu) {
        }
        i = 0;
        if (bcu.PENDING_OUTGOING == this.o) {
        }
        i2 = 0;
        i |= i2;
        if (bcu.PENDING_OUTGOING != bcu) {
        }
        i |= i3;
        if (this.m != null) {
        }
        z4 = false;
        if (z4) {
            valueOf = String.valueOf(bcu);
            String valueOf32 = String.valueOf(this.o);
            bdf.d(this, new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf32).length()).append("Undo the state change: ").append(valueOf).append(" -> ").append(valueOf32).toString());
            return this.o;
        }
        if (i == 0) {
        }
        bdf.d(this, "Start in call UI");
        if (z3) {
            z = false;
        }
        c(false, z);
        return bcu;
    }

    public final boolean i() {
        return this.m == null && !this.q && this.o == bcu.NO_CALLS;
    }

    public final void j() {
        if (i()) {
            bdf.d(this, "Cleaning up");
            this.K = false;
            this.x = false;
            if (this.h != null) {
                bbc bbc = this.h;
                bbc.c.clear();
                bbc.d.clear();
            }
            this.h = null;
            if (this.p != null) {
                b(this.p);
                bdk bdk = this.p;
                bdk.b.b(bdk);
                bdk.c.a(false);
                DisplayListener displayListener = bdk.d;
                displayListener.a.unregisterDisplayListener(displayListener);
                bdk.b(true);
            }
            this.p = null;
            this.e = null;
            if (this.f != null) {
                b(this.f);
            }
            if (!(this.g == null || this.l == null)) {
                bbq bbq = this.l;
                bbt bbt = this.g;
                if (!bbq.b.contains(bbt)) {
                    bdf.e(bbq, "removeExternalCallListener : attempt to remove registered listener.");
                }
                bbq.b.remove(bbt);
            }
            this.f = null;
            if (this.k != null) {
                this.k.b((baa) this);
                this.k.b(this.u);
            }
            this.k = null;
            this.i = null;
            this.m = null;
            this.E.clear();
            this.F.clear();
            this.a.clear();
            this.b.clear();
            this.d.clear();
            this.G.clear();
            bdf.a((Object) this, "Finished InCallPresenter.CleanUp");
        }
    }

    private void c(boolean z, boolean z2) {
        bdf.d(this, "Showing InCallActivity");
        this.i.startActivity(b(z, z2));
    }

    public final Intent b(boolean z, boolean z2) {
        Intent intent = new Intent("android.intent.action.MAIN", null);
        intent.setFlags(268697600);
        intent.setClass(this.i, InCallActivity.class);
        if (z) {
            intent.putExtra("InCallActivity.show_dialpad", true);
        }
        intent.putExtra("InCallActivity.new_outgoing_call", z2);
        return intent;
    }

    public final bcd k() {
        bcd bcd;
        synchronized (this) {
            if (this.H == null) {
                this.H = new bcd(this.i);
            }
            bcd = this.H;
        }
        return bcd;
    }

    public final void a(int i) {
        bdf.a((Object) this, "onDeviceOrientationChange: orientation= " + i);
        if (this.k != null) {
            this.k.a(i);
        } else {
            bdf.e(this, "onDeviceOrientationChange: CallList is null.");
        }
        for (bct a : this.d) {
            a.a(i);
        }
    }

    public final void d(boolean z) {
        if (this.m != null) {
            this.m.c(z);
        }
    }

    public final boolean l() {
        if (this.m == null) {
            return false;
        }
        return this.m.a();
    }

    public final void m() {
        if (this.m != null && this.y != null) {
            int color;
            Resources resources = this.m.getResources();
            if (resources.getBoolean(buf.jR)) {
                color = resources.getColor(buf.jY);
            } else {
                color = this.y.b;
            }
            this.m.getWindow().setStatusBarColor(color);
            this.m.setTaskDescription(new TaskDescription(resources.getString(aq.cR), null, color));
        }
    }

    private final air a(PhoneAccountHandle phoneAccountHandle) {
        int i = 0;
        if (phoneAccountHandle != null) {
            TelecomManager n = n();
            if (n != null) {
                PhoneAccount a = buf.a(n, phoneAccountHandle);
                if (a != null && abw.f()) {
                    i = a.getHighlightColor();
                }
            }
        }
        return new bcy(this.i.getResources()).a(i);
    }

    public final TelecomManager n() {
        if (this.L == null) {
            this.L = (TelecomManager) this.i.getSystemService("telecom");
        }
        return this.L;
    }

    public final void e(ayo ayo) {
        air air;
        if (this.i == null) {
            air = null;
        } else if (ayo == null) {
            air = a(this.J);
        } else if (ayo.o) {
            Resources resources = this.i.getResources();
            air = new bcy(resources).a(resources.getColor(buf.jW));
        } else {
            air = a(ayo.i());
        }
        this.y = air;
        m();
    }
}
