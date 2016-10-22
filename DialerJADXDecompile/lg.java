import android.support.v4.view.ViewPager;

/* compiled from: PG */
public final class lg implements Runnable {
    private /* synthetic */ ViewPager a;

    public lg(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final void run() {
        this.a.a(0);
        this.a.b();
    }
}
