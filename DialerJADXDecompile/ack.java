import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.android.contacts.common.dialog.CallSubjectDialog;

/* compiled from: PG */
public final class ack implements OnPreDrawListener {
    final /* synthetic */ CallSubjectDialog a;
    private /* synthetic */ ViewTreeObserver b;
    private /* synthetic */ int c;
    private /* synthetic */ boolean d;

    ack(CallSubjectDialog callSubjectDialog, ViewTreeObserver viewTreeObserver, int i, boolean z) {
        this.a = callSubjectDialog;
        this.b = viewTreeObserver;
        this.c = i;
        this.d = z;
    }

    public final boolean onPreDraw() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        }
        int bottom = this.c - this.a.c.getBottom();
        if (bottom != 0) {
            this.a.c.setTranslationY((float) bottom);
            this.a.c.animate().translationY(0.0f).setInterpolator(ake.c).setDuration((long) this.a.a).start();
        }
        if (this.d) {
            this.a.e.setTranslationY((float) this.a.e.getHeight());
            this.a.e.animate().translationY(0.0f).setInterpolator(ake.c).setDuration((long) this.a.a).setListener(new acl(this)).start();
        } else {
            this.a.e.setTranslationY(0.0f);
            this.a.e.animate().translationY((float) this.a.e.getHeight()).setInterpolator(ake.c).setDuration((long) this.a.a).setListener(new acm(this)).start();
        }
        return true;
    }
}
