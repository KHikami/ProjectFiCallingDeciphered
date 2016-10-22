import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
final class alx extends AccessibilityDelegate {
    private /* synthetic */ alt a;

    alx(alt alt) {
        this.a = alt;
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            if (this.a.k != ((amv) viewGroup.getTag()).d()) {
                if (this.a.d != null) {
                    this.a.d.a();
                }
                ys ysVar = this.a;
                amv amv = (amv) viewGroup.getTag();
                if (ysVar.k != -1) {
                    ysVar.a.a(ysVar.k, 1, null);
                }
                amv.b(true);
                ysVar.k = amv.d();
                ysVar.l = amv.B;
            }
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
