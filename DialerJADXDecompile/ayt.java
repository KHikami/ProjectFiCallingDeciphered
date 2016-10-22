import android.os.Bundle;
import android.telecom.Call.Details;
import android.telecom.CallAudioState;
import java.util.Objects;

/* compiled from: PG */
public final class ayt extends bdj implements aym, bce, bcq, bcr, bcv, bcx {
    public ayo a;
    public boolean b;
    public boolean c;

    public final /* synthetic */ void a(bdq bdq) {
        super.a((ayu) bdq);
        bcj.b().b((bcv) this);
        ayl.a.b(this);
        bcj.b().b((bcx) this);
        bcj.b().b((bcr) this);
        bcd k = bcj.b().k();
        if (this != null) {
            k.a.remove(this);
        }
        bcj b = bcj.b();
        if (this != null) {
            b.b.remove(this);
        }
    }

    public final /* synthetic */ void b(bdq bdq) {
        super.b((ayu) bdq);
        ayl.a.a(this);
        bcj b = bcj.b();
        b.a((bcv) this);
        b.a((bcx) this);
        b.a((bcr) this);
        Objects.requireNonNull(this);
        b.b.add(this);
        bcd k = b.k();
        if (this != null) {
            k.a.add(this);
        }
        a(bcu.NO_CALLS, b.o, azs.a);
    }

    public ayt() {
        this.b = false;
        this.c = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(bcu r6, bcu r7, azs r8) {
        /*
        r5 = this;
        r2 = 0;
        r1 = 1;
        r0 = r5.i;
        r0 = (ayu) r0;
        r3 = bcu.OUTGOING;
        if (r7 != r3) goto L_0x004a;
    L_0x000a:
        r0 = r8.d();
        r5.a = r0;
    L_0x0010:
        r4 = r5.a;
        r0 = "Updating call UI for call: ";
        bdf.a(r5, r0, r4);
        r0 = r5.i;
        r0 = (ayu) r0;
        if (r0 == 0) goto L_0x0049;
    L_0x001d:
        if (r4 == 0) goto L_0x0029;
    L_0x001f:
        r3 = bcj.b();
        r3.e(r4);
        r0.a();
    L_0x0029:
        r3 = bcu.INCOMING;
        if (r7 == r3) goto L_0x0035;
    L_0x002d:
        r3 = bcu.OUTGOING;
        if (r7 == r3) goto L_0x0035;
    L_0x0031:
        r3 = bcu.INCALL;
        if (r7 != r3) goto L_0x0082;
    L_0x0035:
        r3 = r1;
    L_0x0036:
        if (r3 == 0) goto L_0x0086;
    L_0x0038:
        r3 = bcu.INCOMING;
        if (r7 != r3) goto L_0x0084;
    L_0x003c:
        r3 = r1;
    L_0x003d:
        if (r3 != 0) goto L_0x0086;
    L_0x003f:
        if (r4 == 0) goto L_0x0086;
    L_0x0041:
        r0.a(r1);
        if (r4 == 0) goto L_0x0049;
    L_0x0046:
        r5.a(r4);
    L_0x0049:
        return;
    L_0x004a:
        r3 = bcu.INCALL;
        if (r7 != r3) goto L_0x006e;
    L_0x004e:
        r3 = r8.i();
        r5.a = r3;
        if (r0 == 0) goto L_0x0010;
    L_0x0056:
        r3 = bcu.OUTGOING;
        if (r6 != r3) goto L_0x0010;
    L_0x005a:
        r3 = r5.a;
        if (r3 == 0) goto L_0x0010;
    L_0x005e:
        r3 = r0.getContext();
        r4 = r5.a;
        r3 = ban.b(r3, r4);
        if (r3 == 0) goto L_0x0010;
    L_0x006a:
        r0.a(r1, r1);
        goto L_0x0010;
    L_0x006e:
        r3 = bcu.INCOMING;
        if (r7 != r3) goto L_0x007e;
    L_0x0072:
        if (r0 == 0) goto L_0x0077;
    L_0x0074:
        r0.a(r2, r1);
    L_0x0077:
        r0 = r8.j();
        r5.a = r0;
        goto L_0x0010;
    L_0x007e:
        r0 = 0;
        r5.a = r0;
        goto L_0x0010;
    L_0x0082:
        r3 = r2;
        goto L_0x0036;
    L_0x0084:
        r3 = r2;
        goto L_0x003d;
    L_0x0086:
        r1 = r2;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayt.a(bcu, bcu, azs):void");
    }

    public final void a(int i) {
        String str = "Sending new Audio Mode: ";
        String valueOf = String.valueOf(CallAudioState.audioRouteToString(i));
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        bdf.a((Object) this, valueOf);
        Object a = bdp.a();
        if (a.a != null) {
            a.a.setAudioRoute(i);
        } else {
            bdf.c(a, "error setAudioRoute, mInCallService is null");
        }
    }

    public final void b(boolean z) {
        bdf.a((Object) this, "turning on mute: " + z);
        bdp.a().a(z);
    }

    private final void a(ayo ayo) {
        boolean canAddCall;
        boolean b;
        boolean z;
        Object obj;
        boolean b2;
        bdf.b((Object) this, "updateButtonsState");
        ayu ayu = (ayu) this.i;
        boolean a = buf.a(ayo);
        boolean b3 = ayo.b(8);
        boolean z2 = !b3 && ayo.b(2) && ayo.b(1);
        boolean z3 = ayo.c() == 8;
        bdp a2 = bdp.a();
        if (a2.a != null) {
            canAddCall = a2.a.canAddCall();
        } else {
            canAddCall = false;
        }
        canAddCall = canAddCall && buf.a(ayu.getContext());
        boolean b4 = ayo.b(4);
        if (!a) {
            b = buf.i() >= 23 ? ayo.b(512) && ayo.b(1024) : ayo.b(512);
            if (b) {
                z = true;
                if (a) {
                    if (ayo.b(4194304)) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        b = true;
                        b2 = ayo.b(64);
                        ayu.a(0, true);
                        ayu.a(4, b3);
                        ayu.a(3, z2);
                        ayu.b(z3);
                        ayu.a(1, b2);
                        ayu.a(8, canAddCall);
                        ayu.a(5, z);
                        ayu.a(7, b);
                        ayu.a(6, a);
                        ayu.a(10, a);
                        if (a) {
                            ((ayu) this.i).d(buf.c(ayo));
                        }
                        ayu.a(2, true);
                        ayu.a(9, b4);
                        ayu.b();
                    }
                }
                b = false;
                b2 = ayo.b(64);
                ayu.a(0, true);
                ayu.a(4, b3);
                ayu.a(3, z2);
                ayu.b(z3);
                ayu.a(1, b2);
                ayu.a(8, canAddCall);
                ayu.a(5, z);
                ayu.a(7, b);
                ayu.a(6, a);
                ayu.a(10, a);
                if (a) {
                    if (buf.c(ayo)) {
                    }
                    ((ayu) this.i).d(buf.c(ayo));
                }
                ayu.a(2, true);
                ayu.a(9, b4);
                ayu.b();
            }
        }
        z = false;
        if (a) {
            if (ayo.b(4194304)) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null) {
                b = true;
                b2 = ayo.b(64);
                ayu.a(0, true);
                ayu.a(4, b3);
                ayu.a(3, z2);
                ayu.b(z3);
                ayu.a(1, b2);
                ayu.a(8, canAddCall);
                ayu.a(5, z);
                ayu.a(7, b);
                ayu.a(6, a);
                ayu.a(10, a);
                if (a) {
                    if (buf.c(ayo)) {
                    }
                    ((ayu) this.i).d(buf.c(ayo));
                }
                ayu.a(2, true);
                ayu.a(9, b4);
                ayu.b();
            }
        }
        b = false;
        b2 = ayo.b(64);
        ayu.a(0, true);
        ayu.a(4, b3);
        ayu.a(3, z2);
        ayu.b(z3);
        ayu.a(1, b2);
        ayu.a(8, canAddCall);
        ayu.a(5, z);
        ayu.a(7, b);
        ayu.a(6, a);
        ayu.a(10, a);
        if (a) {
            if (buf.c(ayo)) {
            }
            ((ayu) this.i).d(buf.c(ayo));
        }
        ayu.a(2, true);
        ayu.a(9, b4);
        ayu.b();
    }

    public final void a_(Bundle bundle) {
        super.a_(bundle);
        bundle.putBoolean("incall_key_automatically_muted", this.b);
        bundle.putBoolean("incall_key_previous_mute_state", this.c);
    }

    public final void b(Bundle bundle) {
        this.b = bundle.getBoolean("incall_key_automatically_muted", this.b);
        this.c = bundle.getBoolean("incall_key_previous_mute_state", this.c);
        super.b(bundle);
    }

    public final void a(ayo ayo, Details details) {
        if (this.i != null && ayo != null && ayo.equals(this.a)) {
            a(ayo);
        }
    }

    public final void a(bcu bcu, bcu bcu2, ayo ayo) {
        a(bcu, bcu2, azs.a);
    }

    public final void a() {
        if (this.i != null && this.a != null) {
            a(this.a);
        }
    }

    public final void b(int i) {
        if (this.i != null) {
            ((ayu) this.i).b(i);
        }
    }

    public final void c(int i) {
        if (this.i != null) {
            ((ayu) this.i).c();
        }
    }

    public final void a(boolean z) {
        if (this.i != null && !this.b) {
            ((ayu) this.i).e(z);
        }
    }

    public final void c(boolean z) {
        if (this.i != null) {
            ((ayu) this.i).c(!z);
        }
    }
}
