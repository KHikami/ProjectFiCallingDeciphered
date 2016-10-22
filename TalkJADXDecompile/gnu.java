import com.google.android.apps.hangouts.views.EasterEggView;

public final class gnu implements Runnable {
    final /* synthetic */ bko a;
    final /* synthetic */ EasterEggView b;

    public gnu(EasterEggView easterEggView, bko bko) {
        this.b = easterEggView;
        this.a = bko;
    }

    public void run() {
        int i;
        if (EasterEggView.a.nextBoolean()) {
            i = gwb.cX;
        } else {
            i = gwb.cW;
        }
        this.b.a(this.a, this.b.b, i);
        this.b.e.postDelayed(this, 400);
    }
}
