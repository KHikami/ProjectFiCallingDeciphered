package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

/* renamed from: czu */
public final class czu implements OnGlobalLayoutListener {
    int a;
    int b;
    final /* synthetic */ View c;
    final /* synthetic */ CallContactPickerFragment d;

    public czu(CallContactPickerFragment callContactPickerFragment, View view) {
        this.d = callContactPickerFragment;
        this.c = view;
        this.a = 0;
        this.b = 0;
    }

    public void onGlobalLayout() {
        boolean z = true;
        if (!this.d.isResumed()) {
            return;
        }
        if (this.d.f.h()) {
            boolean z2;
            cxm cxm;
            if (this.d.e == 0) {
                int height = this.c.getHeight();
                int width = this.c.getWidth();
                if (width != this.b) {
                    this.a = 0;
                    this.b = width;
                }
                this.a = Math.max(height, this.a);
                if (height < this.a) {
                    z2 = true;
                    if (this.d.g == null) {
                        cxm = this.d.g;
                        if (z2) {
                            z = false;
                        }
                        cxm.a(z);
                        return;
                    } else if (z2) {
                        this.d.c.setVisibility(8);
                        return;
                    } else if (this.d.d.getVisibility() == 8) {
                        this.d.c.setVisibility(0);
                        return;
                    } else {
                        return;
                    }
                }
            }
            z2 = false;
            if (this.d.g == null) {
                cxm = this.d.g;
                if (z2) {
                    z = false;
                }
                cxm.a(z);
                return;
            } else if (z2) {
                this.d.c.setVisibility(8);
                return;
            } else if (this.d.d.getVisibility() == 8) {
                this.d.c.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        this.d.g.a(true);
    }
}
