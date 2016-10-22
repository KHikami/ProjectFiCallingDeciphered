public final class ize<E> {
    private final Object[] a;
    private final int[] b;
    private int c;
    private int d;
    private Object e;

    ize(int[] iArr, Object[] objArr) {
        this.b = iArr;
        this.a = objArr;
    }

    public boolean a() {
        this.e = null;
        while (this.e == null && this.c < this.a.length) {
            Object[] objArr = this.a;
            int i = this.c;
            this.c = i + 1;
            this.e = objArr[i];
        }
        if (this.c > 0) {
            this.d = this.b[this.c - 1];
        }
        return this.e != null;
    }

    public E b() {
        return this.e;
    }
}
