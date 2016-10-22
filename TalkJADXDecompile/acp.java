import android.view.ViewParent;

final class acp implements Runnable {
    final /* synthetic */ acm a;

    acp(acm acm) {
        this.a = acm;
    }

    public void run() {
        ViewParent parent = this.a.c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
