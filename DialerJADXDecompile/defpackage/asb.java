package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.telecom.CallAudioState;
import android.util.Log;

/* compiled from: PG */
/* renamed from: asb */
public final class asb implements OnAudioFocusChangeListener, atb {
    private static final String c;
    AudioManager a;
    public ata b;
    private asp d;
    private boolean e;
    private CallAudioState f;

    static {
        c = asb.class.getSimpleName();
    }

    public asb(Context context, asp asp) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.d = asp;
        this.b = new ata(context);
        this.b.d = this;
        int a = a();
        this.f = new CallAudioState(false, asb.a(5, a), a);
        String valueOf = String.valueOf(this.f);
        new StringBuilder(String.valueOf(valueOf).length() + 21).append("Initial audioState = ").append(valueOf);
    }

    public final void onAudioFocusChange(int i) {
        boolean z = true;
        new StringBuilder(43).append("onAudioFocusChange: focusChange=").append(i);
        asp asp = this.d;
        if (i != 1) {
            z = false;
        }
        if (asp.k == z) {
            return;
        }
        if (asp.k) {
            asp.f();
        } else {
            asp.e();
        }
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = true;
        new StringBuilder(52).append("wired headset was plugged in changed: ").append(z).append(" -> ").append(z2);
        if (z != z2) {
            int i;
            this.f.getRoute();
            if (z2) {
                i = 4;
            } else if (this.e) {
                i = 8;
            } else {
                i = 1;
            }
            asp asp = this.d;
            if (i != 8) {
                z3 = false;
            }
            asp.a(z3);
            a(new CallAudioState(false, i, a()));
        }
    }

    public final void a(boolean z) {
        int i;
        if (z) {
            i = 8;
        } else {
            i = 5;
        }
        String str = "setAudioRoute, route: ";
        String valueOf = String.valueOf(CallAudioState.audioRouteToString(i));
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        int a = asb.a(i, this.f.getSupportedRouteMask());
        if ((this.f.getSupportedRouteMask() | a) == 0) {
            Log.w(c, "Asking to set to a route that is unsupported: " + a);
        } else if (this.f.getRoute() != a) {
            boolean z2;
            if (a == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.e = z2;
            a(new CallAudioState(false, a, this.f.getSupportedRouteMask()));
        }
    }

    private final int a() {
        if (this.b.c) {
            return 12;
        }
        return 9;
    }

    private static int a(int i, int i2) {
        if (i != 5) {
            return i;
        }
        i = i2 & 5;
        if (i != 0) {
            return i;
        }
        Log.wtf(c, "One of wired headset or earpiece should always be valid.");
        return 1;
    }

    private final void a(CallAudioState callAudioState) {
        CallAudioState callAudioState2 = this.f;
        this.f = callAudioState;
        String valueOf = String.valueOf(callAudioState2);
        String valueOf2 = String.valueOf(this.f);
        new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()).append("setSystemAudioState: changing from ").append(valueOf).append(" to ").append(valueOf2);
        if (this.f.getRoute() == 8) {
            b(true);
        } else if (this.f.getRoute() == 1 || this.f.getRoute() == 4) {
            b(false);
        }
    }

    private final void b(boolean z) {
        if (this.a.isSpeakerphoneOn() != z) {
            new StringBuilder(31).append("turning speaker phone on: ").append(z);
            this.a.setSpeakerphoneOn(z);
        }
    }
}
