package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.android.incallui.VideoCallFragment;

/* compiled from: PG */
/* renamed from: bdr */
public final class bdr implements OnGlobalLayoutListener {
    private /* synthetic */ VideoCallFragment a;

    public bdr(VideoCallFragment videoCallFragment) {
        this.a = videoCallFragment;
    }

    public final void onGlobalLayout() {
        View findViewById = this.a.a.findViewById(az.Y);
        if (findViewById != null) {
            this.a.a(findViewById);
        }
        this.a.b = true;
        ViewTreeObserver viewTreeObserver = this.a.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
