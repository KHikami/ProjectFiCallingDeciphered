package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Vibrator;
import android.provider.Settings.System;

public final class der {
    private long[] a;
    private Vibrator b;
    private boolean c;
    private ContentResolver d;
    private boolean e;

    public void a(Context context, boolean z) {
        this.c = z;
        if (z) {
            this.b = (Vibrator) context.getSystemService("vibrator");
            this.a = new long[]{0, 10, 20, 30};
            this.d = context.getContentResolver();
        }
    }

    public void a() {
        if (this.c) {
            try {
                boolean z;
                if (System.getInt(this.d, "haptic_feedback_enabled", 0) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.e = z;
            } catch (Throwable e) {
                glk.d("Babel_dialer", "Could not retrieve system setting.", e);
                this.e = false;
            }
        }
    }

    public void b() {
        if (!this.c || !this.e) {
            return;
        }
        if (this.a == null || this.a.length != 1) {
            this.b.vibrate(this.a, -1);
        } else {
            this.b.vibrate(this.a[0]);
        }
    }
}
