package defpackage;

import android.support.v4.view.ViewPager;

public final class ow implements Runnable {
    final /* synthetic */ ViewPager a;

    public ow(ViewPager viewPager) {
        this.a = viewPager;
    }

    public void run() {
        this.a.a(0);
        this.a.e();
    }
}
