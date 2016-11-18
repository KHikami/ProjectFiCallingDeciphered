package defpackage;

import com.google.android.apps.hangouts.fragments.dialpad.DialpadKeyButton;

public final class deo implements Runnable {
    final /* synthetic */ DialpadKeyButton a;

    public deo(DialpadKeyButton dialpadKeyButton) {
        this.a = dialpadKeyButton;
    }

    public void run() {
        this.a.b(true);
        super.setContentDescription(this.a.c);
        gld.a(this.a, this.a.a, this.a.c);
    }
}
