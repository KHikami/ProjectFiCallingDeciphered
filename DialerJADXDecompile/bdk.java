import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.telecom.CallAudioState;

/* compiled from: PG */
public class bdk implements axv, aym, bcv {
    private static final String g;
    final PowerManager a;
    final ayl b;
    final axs c;
    final bdl d;
    boolean e;
    public boolean f;
    private final WakeLock h;
    private int i;
    private boolean j;

    static {
        g = bdk.class.getSimpleName();
    }

    public bdk(Context context, ayl ayl, axs axs) {
        this.i = 0;
        this.e = false;
        this.j = false;
        this.a = (PowerManager) context.getSystemService("power");
        if (this.a.isWakeLockLevelSupported(32)) {
            this.h = this.a.newWakeLock(32, g);
        } else {
            bdf.e(g, "Device does not support proximity wake lock.");
            this.h = null;
        }
        this.c = axs;
        this.c.c = this;
        this.d = new bdl(this, (DisplayManager) context.getSystemService("display"));
        DisplayListener displayListener = this.d;
        displayListener.a.registerDisplayListener(displayListener, null);
        this.b = ayl;
        this.b.a(this);
    }

    public final void a(int i) {
        this.i = i;
        a();
    }

    public final void a(bcu bcu, bcu bcu2, azs azs) {
        boolean z;
        boolean z2 = true;
        if (bcu.INCALL == bcu2) {
            ayo k = azs.k();
            if (k == null || k == azs.h() || k == azs.g()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                z = true;
                if (!(bcu.OUTGOING == bcu2 || r0)) {
                    z2 = false;
                }
                if (z2 != this.j) {
                    this.j = z2;
                    this.i = 0;
                    this.c.a(this.j);
                    a();
                }
            }
        }
        z = false;
        z2 = false;
        if (z2 != this.j) {
            this.j = z2;
            this.i = 0;
            this.c.a(this.j);
            a();
        }
    }

    public final void c(int i) {
    }

    public final void a(boolean z) {
    }

    public final void b(int i) {
        a();
    }

    final void b(boolean z) {
        if (this.h == null) {
            return;
        }
        if (this.h.isHeld()) {
            bdf.d(this, "Releasing proximity wake lock");
            this.h.release(z ? 0 : 1);
            return;
        }
        bdf.d(this, "Proximity wake lock already released");
    }

    public final synchronized void a() {
        int i = 1;
        synchronized (this) {
            int i2;
            int i3 = this.b.c;
            int i4 = (4 == i3 || 8 == i3 || 2 == i3) ? 1 : 0;
            if (this.i == 2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.e || r3 == 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            i4 |= i3;
            if (!this.f || r3 == 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            boolean z = i4 | i3;
            bdf.b(this, "screenonImmediately: ", Boolean.valueOf(z));
            if (this.f) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            i2 = this.j ? 1 : 0;
            i3 = this.i == 2 ? 1 : 0;
            if (!this.e) {
                i = 0;
            }
            String valueOf = String.valueOf(CallAudioState.audioRouteToString(this.b.c));
            bdf.d(this, new StringBuilder(String.valueOf(valueOf).length() + 113).append("ProximitySensor{keybrd=0").append(", dpad=").append(i4).append(", offhook=").append(i2).append(", hor=").append(i3).append(", ui=").append(i).append(", aud=").append(valueOf).append("}").toString());
            if (!this.j || z) {
                bdf.a((Object) this, "Turning off proximity sensor");
                b(z);
            } else {
                bdf.a((Object) this, "Turning on proximity sensor");
                if (this.h != null) {
                    if (this.h.isHeld()) {
                        bdf.d(this, "Proximity wake lock already acquired");
                    } else {
                        bdf.d(this, "Acquiring proximity wake lock");
                        this.h.acquire();
                    }
                }
            }
        }
    }
}
