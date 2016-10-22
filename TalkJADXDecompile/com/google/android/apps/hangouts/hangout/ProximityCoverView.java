package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import dgg;
import dkn;
import dko;
import dkp;
import dkq;
import glk;
import gwb;
import iil;

public final class ProximityCoverView extends View {
    public float a;
    public float b;
    private final SensorManager c;
    private final Sensor d;
    private final dkq e;
    private final dko f;
    private boolean g;
    private dkp h;
    private WakeLock i;
    private boolean j;
    private dkn k;
    private int l;

    private boolean f() {
        if (!this.j) {
            return false;
        }
        try {
            if (this.i == null) {
                PowerManager powerManager = (PowerManager) getContext().getApplicationContext().getSystemService("power");
                int a = gwb.a((Integer) PowerManager.class.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").get(null), 0);
                glk.a("Babel", "PROXIMITY_SCREEN_OFF_WAKE_LOCK:" + a, new Object[0]);
                if (a == 0) {
                    return false;
                }
                boolean a2;
                if (VERSION.SDK_INT >= 17) {
                    a2 = gwb.a((Boolean) powerManager.getClass().getDeclaredMethod("isWakeLockLevelSupported", new Class[]{Integer.TYPE}).invoke(powerManager, new Object[]{Integer.valueOf(a)}), false);
                    glk.a("Babel", "isWakeLockLevelSupported:" + a2, new Object[0]);
                } else {
                    int a3 = gwb.a((Integer) powerManager.getClass().getDeclaredMethod("getSupportedWakeLockFlags", new Class[0]).invoke(powerManager, new Object[0]), 0);
                    glk.a("Babel", "getSupportedWakeLockFlags:" + a3, new Object[0]);
                    a2 = (a3 & a) != 0;
                }
                if (!a2) {
                    return false;
                }
                this.i = powerManager.newWakeLock(a, "Babel");
                this.i.acquire();
            }
            return true;
        } catch (Exception e) {
            String str = "Babel";
            String str2 = "Failed to acquire proximity and keyguard locks: ";
            String valueOf = String.valueOf(e.toString());
            glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            g();
            return false;
        }
    }

    private void g() {
        if (this.i != null) {
            this.i.release();
            this.i = null;
        }
    }

    public ProximityCoverView(Context context, AttributeSet attributeSet) {
        boolean z = false;
        super(context, attributeSet);
        this.e = new dkq(this);
        this.f = new dko(this);
        this.a = Float.MAX_VALUE;
        this.b = 0.0f;
        this.h = null;
        this.i = null;
        if (gwb.a(gwb.H(), "babel_proximity_wakelock_whitelist", false) && !gwb.a(gwb.H(), "babel_proximity_wakelock_blacklist", false)) {
            z = true;
        }
        this.j = z;
        this.c = (SensorManager) context.getSystemService("sensor");
        this.d = this.c.getDefaultSensor(8);
        c();
    }

    public void a() {
        int i = this.l + 1;
        this.l = i;
        if (i <= 1) {
            if (this.d != null) {
                this.c.registerListener(this.e, this.d, 3);
            }
            dgg.a().a(this.f);
            c();
        }
    }

    public void b() {
        int i = this.l - 1;
        this.l = i;
        if (i <= 0) {
            if (this.l < 0) {
                this.l = 0;
                return;
            }
            if (this.d != null) {
                this.c.unregisterListener(this.e);
            }
            dgg.a().b(this.f);
            a(false);
        }
    }

    private void a(boolean z) {
        int i = 0;
        if (z != this.g) {
            boolean z2;
            if (this.j) {
                if (z) {
                    this.j = f();
                } else {
                    g();
                }
                z2 = this.j;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (!z) {
                    i = 8;
                }
                setVisibility(i);
            }
            if (this.h != null) {
                this.h.a(z, z2);
            }
            this.g = z;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.g;
    }

    public void c() {
        boolean z = true;
        boolean z2 = this.k != null && this.k.a();
        boolean z3;
        if (0.0d > ((double) this.a) || (this.a >= 1.0f && (this.a > 5.0f || this.b <= 5.0f))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!(z2 && r3)) {
            z = false;
        }
        a(z);
    }

    public void a(dkp dkp) {
        iil.a("Expected null", this.h);
        this.h = dkp;
    }

    public void d() {
        this.h = null;
    }

    public void a(dkn dkn) {
        this.k = dkn;
    }

    public void e() {
        this.k = null;
    }
}
