package defpackage;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* renamed from: azl */
final class azl implements Runnable {
    private /* synthetic */ ayv a;

    azl(ayv ayv) {
        this.a = ayv;
    }

    public final void run() {
        if (this.a.getView() != null && this.a.getView().getParent() != null) {
            Object obj;
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                this.a.a(obtain);
                this.a.getView().getParent().requestSendAccessibilityEvent(this.a.getView(), obtain);
            }
        }
    }
}
