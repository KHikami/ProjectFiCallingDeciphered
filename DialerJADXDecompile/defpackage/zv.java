package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: zv */
final class zv implements OnClickListener {
    private /* synthetic */ zs a;

    zv(zs zsVar) {
        this.a = zsVar;
    }

    public final void onClick(View view) {
        xp xpVar = null;
        zs zsVar = this.a;
        int childCount = xpVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            boolean z;
            zsVar = this.a;
            View childAt = xpVar.getChildAt(i);
            if (childAt == view) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
        }
    }
}
