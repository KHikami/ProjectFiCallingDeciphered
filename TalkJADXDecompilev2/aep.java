package defpackage;

import android.util.SparseArray;

public final class aep {
    public int a = -1;
    public int b = 1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public int l;
    public long m;
    public int n;
    private SparseArray<Object> o;

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
