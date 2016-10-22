/* compiled from: PG */
public final class zi {
    int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public long l;
    public int m;

    public zi() {
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
    }

    public final void a(int i) {
        if ((this.b & i) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.b));
        }
    }

    public final int a() {
        return this.g ? this.d - this.e : this.c;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.a + ", mData=" + null + ", mItemCount=" + this.c + ", mPreviousLayoutItemCount=" + this.d + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.e + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.h + ", mRunPredictiveAnimations=" + this.i + '}';
    }
}
