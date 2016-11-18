package p000;

import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;

public final class cma implements pc {
    final /* synthetic */ SlidingTabLayout f5616a;
    private int f5617b;

    public cma(SlidingTabLayout slidingTabLayout) {
        this.f5616a = slidingTabLayout;
    }

    public void m7903a(int i, float f, int i2) {
        int childCount = this.f5616a.f6112c.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            this.f5616a.f6112c.m7905a(i, f);
            View childAt = this.f5616a.f6112c.getChildAt(i);
            this.f5616a.m8370b(i, childAt != null ? (int) (((float) childAt.getWidth()) * f) : 0);
            if (this.f5616a.f6111b != null) {
                this.f5616a.f6111b.a(i, f, i2);
            }
        }
    }

    public void m7904b(int i) {
        this.f5617b = i;
        if (this.f5616a.f6111b != null) {
            this.f5616a.f6111b.b(i);
        }
    }

    public void m7902a(int i) {
        if (this.f5617b == 0) {
            this.f5616a.f6112c.m7905a(i, 0.0f);
            this.f5616a.m8370b(i, 0);
        }
        for (int i2 = 0; i2 < this.f5616a.f6112c.getChildCount(); i2++) {
            boolean z;
            View childAt = this.f5616a.f6112c.getChildAt(i2);
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
        }
        if (this.f5616a.f6111b != null) {
            this.f5616a.f6111b.a(i);
        }
    }
}
