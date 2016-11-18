package p000;

import android.view.View;

final class cfi implements Runnable {
    final /* synthetic */ cfh f5179a;

    cfi(cfh cfh) {
        this.f5179a = cfh;
    }

    public void run() {
        if (!this.f5179a.f5178c.at && this.f5179a.f5178c.getActivity() != null && !this.f5179a.f5178c.getActivity().isFinishing()) {
            View childAt = this.f5179a.f5176a.getChildAt(this.f5179a.f5176a.getChildCount() - 1);
            Object obj = (childAt == null || childAt.getBottom() <= this.f5179a.f5176a.getBottom()) ? null : 1;
            if (this.f5179a.f5176a.getLastVisiblePosition() < this.f5179a.f5176a.getCount() - 1) {
                gwb.m1823a(this.f5179a.f5177b, 2947);
            } else if (obj != null) {
                gwb.m1823a(this.f5179a.f5177b, 2953);
            }
        }
    }
}
