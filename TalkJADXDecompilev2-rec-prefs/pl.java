package p000;

import android.view.View;
import android.view.ViewParent;

class pl {
    public boolean mo4255a(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof nm) {
            return ((nm) viewParent).onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void mo4256b(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof nm) {
            ((nm) viewParent).onNestedScrollAccepted(view, view2, i);
        }
    }

    public void mo4250a(ViewParent viewParent, View view) {
        if (viewParent instanceof nm) {
            ((nm) viewParent).onStopNestedScroll(view);
        }
    }

    public void mo4251a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        if (viewParent instanceof nm) {
            ((nm) viewParent).onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void mo4252a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        if (viewParent instanceof nm) {
            ((nm) viewParent).onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public boolean mo4254a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (viewParent instanceof nm) {
            return ((nm) viewParent).onNestedFling(view, f, f2, z);
        }
        return false;
    }

    public boolean mo4253a(ViewParent viewParent, View view, float f, float f2) {
        if (viewParent instanceof nm) {
            return ((nm) viewParent).onNestedPreFling(view, f, f2);
        }
        return false;
    }

    pl() {
    }
}
