package defpackage;

import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;
import pc;

/* renamed from: cma */
public final class cma implements pc {
    final /* synthetic */ SlidingTabLayout a;
    private int b;

    public cma(SlidingTabLayout slidingTabLayout) {
        this.a = slidingTabLayout;
    }

    public void a(int i, float f, int i2) {
        int childCount = this.a.c.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            this.a.c.a(i, f);
            View childAt = this.a.c.getChildAt(i);
            this.a.b(i, childAt != null ? (int) (((float) childAt.getWidth()) * f) : 0);
            if (this.a.b != null) {
                this.a.b.a(i, f, i2);
            }
        }
    }

    public void b(int i) {
        this.b = i;
        if (this.a.b != null) {
            this.a.b.b(i);
        }
    }

    public void a(int i) {
        if (this.b == 0) {
            this.a.c.a(i, 0.0f);
            this.a.b(i, 0);
        }
        for (int i2 = 0; i2 < this.a.c.getChildCount(); i2++) {
            boolean z;
            View childAt = this.a.c.getChildAt(i2);
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
        }
        if (this.a.b != null) {
            this.a.b.a(i);
        }
    }
}
