package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* renamed from: bap */
final class bap extends ViewOutlineProvider {
    bap(bao bao) {
    }

    public final void getOutline(View view, Outline outline) {
        outline.setOval(-1, -1, 0, 0);
    }
}
