package defpackage;

import android.view.View;

final class cfi implements Runnable {
    final /* synthetic */ cfh a;

    cfi(cfh cfh) {
        this.a = cfh;
    }

    public void run() {
        if (!this.a.c.at && this.a.c.getActivity() != null && !this.a.c.getActivity().isFinishing()) {
            View childAt = this.a.a.getChildAt(this.a.a.getChildCount() - 1);
            Object obj = (childAt == null || childAt.getBottom() <= this.a.a.getBottom()) ? null : 1;
            if (this.a.a.getLastVisiblePosition() < this.a.a.getCount() - 1) {
                gwb.a(this.a.b, 2947);
            } else if (obj != null) {
                gwb.a(this.a.b, 2953);
            }
        }
    }
}
