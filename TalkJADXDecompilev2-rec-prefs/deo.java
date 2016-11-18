package p000;

import com.google.android.apps.hangouts.fragments.dialpad.DialpadKeyButton;

public final class deo implements Runnable {
    final /* synthetic */ DialpadKeyButton f9565a;

    public deo(DialpadKeyButton dialpadKeyButton) {
        this.f9565a = dialpadKeyButton;
    }

    public void run() {
        this.f9565a.m8535b(true);
        super.setContentDescription(this.f9565a.f6290c);
        gld.m17933a(this.f9565a, this.f9565a.f6288a, this.f9565a.f6290c);
    }
}
