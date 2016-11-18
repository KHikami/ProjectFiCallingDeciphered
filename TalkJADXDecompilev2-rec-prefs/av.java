package p000;

import android.view.View;
import android.view.ViewParent;

final class av extends to {
    final /* synthetic */ au f2386a;
    private int f2387b;
    private int f2388c = -1;

    av(au auVar) {
        this.f2386a = auVar;
    }

    public boolean m4091a(View view, int i) {
        return this.f2388c == -1 && this.f2386a.mo355b(view);
    }

    public void m4092b(View view, int i) {
        this.f2388c = i;
        this.f2387b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void m4088a(int i) {
        if (this.f2386a.f2196c != null) {
            this.f2386a.f2196c.m4157a(i);
        }
    }

    public void m4089a(View view, float f, float f2) {
        boolean z;
        int i;
        boolean z2 = true;
        this.f2388c = -1;
        int width = view.getWidth();
        if (f != 0.0f) {
            z = oa.d(view) == 1;
            z = this.f2386a.f2197d == 2 ? true : this.f2386a.f2197d == 0 ? z ? f < 0.0f : f > 0.0f : this.f2386a.f2197d == 1 ? z ? f > 0.0f : f < 0.0f : false;
        } else {
            z = Math.abs(view.getLeft() - this.f2387b) >= Math.round(((float) view.getWidth()) * this.f2386a.f2198e);
        }
        if (z) {
            i = view.getLeft() < this.f2387b ? this.f2387b - width : this.f2387b + width;
        } else {
            i = this.f2387b;
            z2 = false;
        }
        if (this.f2386a.f2195b.a(i, view.getTop())) {
            oa.a(view, new ax(this.f2386a, view, z2));
        } else if (z2 && this.f2386a.f2196c != null) {
            this.f2386a.f2196c.m4158a(view);
        }
    }

    public int m4087a(View view) {
        return view.getWidth();
    }

    public int m4093c(View view, int i) {
        int width;
        int i2;
        Object obj = oa.d(view) == 1 ? 1 : null;
        if (this.f2386a.f2197d == 0) {
            if (obj != null) {
                width = this.f2387b - view.getWidth();
                i2 = this.f2387b;
            } else {
                width = this.f2387b;
                i2 = this.f2387b + view.getWidth();
            }
        } else if (this.f2386a.f2197d != 1) {
            width = this.f2387b - view.getWidth();
            i2 = this.f2387b + view.getWidth();
        } else if (obj != null) {
            width = this.f2387b;
            i2 = this.f2387b + view.getWidth();
        } else {
            width = this.f2387b - view.getWidth();
            i2 = this.f2387b;
        }
        return Math.min(Math.max(width, i), i2);
    }

    public int m4094d(View view, int i) {
        return view.getTop();
    }

    public void m4090a(View view, int i, int i2) {
        float width = ((float) this.f2387b) + (((float) view.getWidth()) * this.f2386a.f2199f);
        float width2 = ((float) this.f2387b) + (((float) view.getWidth()) * this.f2386a.f2200g);
        if (((float) i) <= width) {
            oa.c(view, 1.0f);
        } else if (((float) i) >= width2) {
            oa.c(view, 0.0f);
        } else {
            oa.c(view, au.m3806a(0.0f, 1.0f - ((((float) i) - width) / (width2 - width)), 1.0f));
        }
    }
}
