package com.google.android.libraries.hangouts.video.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjection.Callback;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.view.Surface;
import android.view.WindowManager;
import icb;
import ik;
import isx;
import ite;
import ito;
import itq;
import itx;
import iuc;
import iud;

public class ScreenVideoCapturer implements ito {
    public itq a;
    public Surface b;
    public VirtualDisplay c;
    public iud d;
    private final Context e;
    private final WindowManager f;
    private final DisplayManager g;
    private final MediaProjectionManager h;
    private final Callback i;
    private final BroadcastReceiver j;
    private final BroadcastReceiver k;
    private final DisplayListener l;
    private final int m;
    private MediaProjection n;
    private iud o;
    private final Point p;
    private boolean q;
    private boolean r;
    private boolean s;

    public class HandleAuthIntentActivity extends Activity {
        public void onCreate(Bundle bundle) {
            setFinishOnTouchOutside(false);
            requestWindowFeature(1);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            super.onCreate(bundle);
            startActivityForResult((Intent) getIntent().getParcelableExtra("share_permission_intent"), 1);
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            Intent intent2 = new Intent("com.google.android.libraries.hangouts.video.sdk.ScreenCapturer");
            intent2.putExtra("share_result_code", i2);
            intent2.putExtra("share_result_data", intent);
            ik.a(getApplicationContext()).a(intent2);
            finish();
        }
    }

    public void a(ite ite, itq itq) {
        this.a = itq;
        itq.a(new isx(this));
        itq.c(false);
        this.g.registerDisplayListener(this.l, null);
        ik.a(this.e).a(this.j, new IntentFilter("com.google.android.libraries.hangouts.video.sdk.ScreenCapturer"));
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.e.registerReceiver(this.k, intentFilter);
        a(this.q);
    }

    public void a(ite ite) {
        itx.a(3, "vclib", "ScreenVideoCapturer.onDetachFromCall");
        this.q = false;
        d();
        ik.a(this.e).a(this.j);
        this.g.unregisterDisplayListener(this.l);
        this.e.unregisterReceiver(this.k);
        if (this.n != null) {
            this.n.stop();
            this.n.unregisterCallback(this.i);
            this.n = null;
            this.s = false;
        }
    }

    public iud a() {
        if (this.o != null) {
            return this.o;
        }
        if (this.d == null) {
            String a;
            itx.a("vclib", "Screen capture capabilities = %dx%d", Integer.valueOf(this.a.l().a), Integer.valueOf(this.a.l().b));
            if (this.a.l().a >= 1280) {
                a = icb.a(this.e.getContentResolver(), "babel_hangout_screen_capture_spec_hw", "1280x720x15");
            } else {
                a = icb.a(this.e.getContentResolver(), "babel_hangout_screen_capture_spec_sw", "960x540x15");
            }
            this.d = iud.a(a);
        }
        return this.d;
    }

    public iuc b() {
        this.f.getDefaultDisplay().getRealSize(this.p);
        return iuc.a(new iuc(this.p.x, this.p.y), a().b());
    }

    public void a(boolean z) {
        this.q = z;
        if (this.a != null) {
            this.a.b(!z);
        }
        if (!z) {
            this.q = false;
        } else if (this.n != null) {
            c();
        } else if (!this.s) {
            this.s = true;
            Intent intent = new Intent(this.e, HandleAuthIntentActivity.class);
            intent.addFlags(411041792);
            intent.putExtra("share_permission_intent", this.h.createScreenCaptureIntent());
            this.e.startActivity(intent);
        }
    }

    public boolean g() {
        return this.q;
    }

    private void d() {
        if (this.c != null) {
            itx.a(3, "vclib", "Releasing virtual display for screen capture");
            this.c.release();
            this.c = null;
        }
    }

    public void c() {
        if (this.n == null || this.b == null) {
            itx.a(3, "vclib", "Waiting to create virtual display.");
            return;
        }
        d();
        iuc b = b();
        String valueOf = String.valueOf(b);
        itx.a(4, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Capturing screen at: ").append(valueOf).toString());
        int i = b.a * b.b;
        this.c = this.n.createVirtualDisplay("HangoutsScreenCapture", b.a, b.b, Math.round((((float) i) / ((float) (this.p.x * this.p.y))) * ((float) this.m)), 3, this.b, null, null);
        if (!this.r) {
            this.r = true;
        }
    }
}
