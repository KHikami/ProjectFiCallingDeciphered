package p000;

import android.util.SparseArray;

public final class aep {
    public int f415a = -1;
    public int f416b = 1;
    public int f417c = 0;
    public int f418d = 0;
    public int f419e = 0;
    public boolean f420f = false;
    public boolean f421g = false;
    public boolean f422h = false;
    public boolean f423i = false;
    public boolean f424j = false;
    public boolean f425k = false;
    public int f426l;
    public long f427m;
    public int f428n;
    private SparseArray<Object> f429o;

    public void m841a(int i) {
        if ((this.f416b & i) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f416b));
        }
    }

    public boolean m842a() {
        return this.f421g;
    }

    public boolean m843b() {
        return this.f423i;
    }

    public boolean m844c() {
        return this.f415a != -1;
    }

    public int m845d() {
        return this.f421g ? this.f418d - this.f419e : this.f417c;
    }

    public String toString() {
        return "State{mTargetPosition=" + this.f415a + ", mData=" + this.f429o + ", mItemCount=" + this.f417c + ", mPreviousLayoutItemCount=" + this.f418d + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f419e + ", mStructureChanged=" + this.f420f + ", mInPreLayout=" + this.f421g + ", mRunSimpleAnimations=" + this.f422h + ", mRunPredictiveAnimations=" + this.f423i + '}';
    }
}
