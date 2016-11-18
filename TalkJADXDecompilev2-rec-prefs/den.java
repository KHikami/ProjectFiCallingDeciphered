package p000;

import com.google.android.apps.hangouts.fragments.dialpad.DialpadKeyButton;

public final class den implements Runnable {
    final /* synthetic */ int f9563a;
    final /* synthetic */ DialpadKeyButton f9564b;

    public den(DialpadKeyButton dialpadKeyButton, int i) {
        this.f9564b = dialpadKeyButton;
        this.f9563a = i;
    }

    public void run() {
        if (this.f9563a == this.f9564b.f6289b) {
            iil.m21874a("Expected condition to be true", this.f9564b.isPressed());
            this.f9564b.setPressed(false);
            this.f9564b.m8534a(false);
            this.f9564b.m8531a();
        }
    }
}
