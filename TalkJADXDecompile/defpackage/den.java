package defpackage;

import com.google.android.apps.hangouts.fragments.dialpad.DialpadKeyButton;

/* renamed from: den */
public final class den implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ DialpadKeyButton b;

    public den(DialpadKeyButton dialpadKeyButton, int i) {
        this.b = dialpadKeyButton;
        this.a = i;
    }

    public void run() {
        if (this.a == this.b.b) {
            iil.a("Expected condition to be true", this.b.isPressed());
            this.b.setPressed(false);
            this.b.a(false);
            this.b.a();
        }
    }
}
