package defpackage;

import android.util.SparseArray;

/* renamed from: aep */
public final class aep {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public int n;
    private SparseArray<Object> o;

    public aep() {
        this.a = -1;
        this.b = 1;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
    }

    public void a(int i) {
        if ((this.b & i) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.b));
        }
    }

    public boolean a() {
        return this.g;
    }

    public boolean b() {
        return this.i;
    }

    public boolean c() {
        return this.a != -1;
    }

    public int d() {
        return this.g ? this.d - this.e : this.c;
    }

    public String toString() {
        return "State{mTargetPosition=" + this.a + ", mData=" + this.o + ", mItemCount=" + this.c + ", mPreviousLayoutItemCount=" + this.d + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.e + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.h + ", mRunPredictiveAnimations=" + this.i + '}';
    }
}
