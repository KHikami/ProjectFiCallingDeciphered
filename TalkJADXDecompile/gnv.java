import com.google.android.apps.hangouts.views.EasterEggView;

public final class gnv implements Runnable {
    final /* synthetic */ bko a;
    final /* synthetic */ EasterEggView b;

    public gnv(EasterEggView easterEggView, bko bko) {
        this.b = easterEggView;
        this.a = bko;
    }

    public void run() {
        this.b.a(this.a, this.b.c, EasterEggView.d[EasterEggView.a.nextInt(EasterEggView.d.length)]);
        if (this.b.g > 0) {
            EasterEggView easterEggView = this.b;
            easterEggView.g--;
            this.b.e.postDelayed(this, 50);
            return;
        }
        this.b.f = null;
    }
}
