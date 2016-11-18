package p000;

import com.google.android.apps.hangouts.views.EasterEggView;

public final class gnu implements Runnable {
    final /* synthetic */ bko f15745a;
    final /* synthetic */ EasterEggView f15746b;

    public gnu(EasterEggView easterEggView, bko bko) {
        this.f15746b = easterEggView;
        this.f15745a = bko;
    }

    public void run() {
        int i;
        if (EasterEggView.f6956a.nextBoolean()) {
            i = gwb.cX;
        } else {
            i = gwb.cW;
        }
        this.f15746b.m9387a(this.f15745a, this.f15746b.f6961b, i);
        this.f15746b.f6963e.postDelayed(this, 400);
    }
}
