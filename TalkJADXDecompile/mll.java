final class mll extends mia<T> {
    final /* synthetic */ Object[] a;
    final /* synthetic */ int b;

    mll(int i, int i2, Object[] objArr, int i3) {
        this.a = objArr;
        this.b = i3;
        super(i, i2);
    }

    protected T a(int i) {
        return this.a[this.b + i];
    }
}
