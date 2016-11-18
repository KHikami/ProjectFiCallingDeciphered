package p000;

import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;

public final class ehy implements Runnable {
    final /* synthetic */ ScrollViewCustom f11579a;

    public ehy(ScrollViewCustom scrollViewCustom) {
        this.f11579a = scrollViewCustom;
    }

    public void run() {
        this.f11579a.smoothScrollTo(0, Math.max(0, this.f11579a.getChildAt(0).getMeasuredHeight() - this.f11579a.f6530a));
        this.f11579a.getChildAt(this.f11579a.getChildCount() - 1).requestFocus();
    }
}
