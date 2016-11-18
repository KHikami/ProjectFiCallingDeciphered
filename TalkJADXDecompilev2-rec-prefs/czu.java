package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czu implements OnGlobalLayoutListener {
    int f9392a = 0;
    int f9393b = 0;
    final /* synthetic */ View f9394c;
    final /* synthetic */ CallContactPickerFragment f9395d;

    public czu(CallContactPickerFragment callContactPickerFragment, View view) {
        this.f9395d = callContactPickerFragment;
        this.f9394c = view;
    }

    public void onGlobalLayout() {
        boolean z = true;
        if (!this.f9395d.isResumed()) {
            return;
        }
        if (this.f9395d.f6249f.mo1160h()) {
            boolean z2;
            cxm cxm;
            if (this.f9395d.f6248e == 0) {
                int height = this.f9394c.getHeight();
                int width = this.f9394c.getWidth();
                if (width != this.f9393b) {
                    this.f9392a = 0;
                    this.f9393b = width;
                }
                this.f9392a = Math.max(height, this.f9392a);
                if (height < this.f9392a) {
                    z2 = true;
                    if (this.f9395d.f6250g == null) {
                        cxm = this.f9395d.f6250g;
                        if (z2) {
                            z = false;
                        }
                        cxm.mo1462a(z);
                        return;
                    } else if (z2) {
                        this.f9395d.f6246c.setVisibility(8);
                        return;
                    } else if (this.f9395d.f6247d.getVisibility() == 8) {
                        this.f9395d.f6246c.setVisibility(0);
                        return;
                    } else {
                        return;
                    }
                }
            }
            z2 = false;
            if (this.f9395d.f6250g == null) {
                cxm = this.f9395d.f6250g;
                if (z2) {
                    z = false;
                }
                cxm.mo1462a(z);
                return;
            } else if (z2) {
                this.f9395d.f6246c.setVisibility(8);
                return;
            } else if (this.f9395d.f6247d.getVisibility() == 8) {
                this.f9395d.f6246c.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        this.f9395d.f6250g.mo1462a(true);
    }
}
