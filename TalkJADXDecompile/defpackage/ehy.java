package defpackage;

import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;

/* renamed from: ehy */
public final class ehy implements Runnable {
    final /* synthetic */ ScrollViewCustom a;

    public ehy(ScrollViewCustom scrollViewCustom) {
        this.a = scrollViewCustom;
    }

    public void run() {
        this.a.smoothScrollTo(0, Math.max(0, this.a.getChildAt(0).getMeasuredHeight() - this.a.a));
        this.a.getChildAt(this.a.getChildCount() - 1).requestFocus();
    }
}
