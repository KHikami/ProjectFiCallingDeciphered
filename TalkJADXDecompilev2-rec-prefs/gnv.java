package p000;

import com.google.android.apps.hangouts.views.EasterEggView;

public final class gnv implements Runnable {
    final /* synthetic */ bko f15747a;
    final /* synthetic */ EasterEggView f15748b;

    public gnv(EasterEggView easterEggView, bko bko) {
        this.f15748b = easterEggView;
        this.f15747a = bko;
    }

    public void run() {
        this.f15748b.m9387a(this.f15747a, this.f15748b.f6962c, EasterEggView.f6957d[EasterEggView.f6956a.nextInt(EasterEggView.f6957d.length)]);
        if (this.f15748b.f6965g > 0) {
            EasterEggView easterEggView = this.f15748b;
            easterEggView.f6965g--;
            this.f15748b.f6963e.postDelayed(this, 50);
            return;
        }
        this.f15748b.f6964f = null;
    }
}
