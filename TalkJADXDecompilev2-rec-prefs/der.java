package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Vibrator;
import android.provider.Settings.System;

public final class der {
    private long[] f9567a;
    private Vibrator f9568b;
    private boolean f9569c;
    private ContentResolver f9570d;
    private boolean f9571e;

    public void m11528a(Context context, boolean z) {
        this.f9569c = z;
        if (z) {
            this.f9568b = (Vibrator) context.getSystemService("vibrator");
            this.f9567a = new long[]{0, 10, 20, 30};
            this.f9570d = context.getContentResolver();
        }
    }

    public void m11527a() {
        if (this.f9569c) {
            try {
                boolean z;
                if (System.getInt(this.f9570d, "haptic_feedback_enabled", 0) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f9571e = z;
            } catch (Throwable e) {
                glk.m17980d("Babel_dialer", "Could not retrieve system setting.", e);
                this.f9571e = false;
            }
        }
    }

    public void m11529b() {
        if (!this.f9569c || !this.f9571e) {
            return;
        }
        if (this.f9567a == null || this.f9567a.length != 1) {
            this.f9568b.vibrate(this.f9567a, -1);
        } else {
            this.f9568b.vibrate(this.f9567a[0]);
        }
    }
}
