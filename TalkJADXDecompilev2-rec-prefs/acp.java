package p000;

import android.view.ViewParent;

final class acp implements Runnable {
    final /* synthetic */ acm f249a;

    acp(acm acm) {
        this.f249a = acm;
    }

    public void run() {
        ViewParent parent = this.f249a.f88c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
