public final class izc {
    private final int[] a;
    private final int[] b;
    private final int c;
    private int d;
    private int e;
    private int f;

    public izc(int[] iArr, int[] iArr2, int i) {
        this.a = iArr;
        this.b = iArr2;
        this.c = i;
    }

    public boolean a() {
        this.f = this.c;
        while (this.f == this.c && this.d < this.b.length) {
            int[] iArr = this.b;
            int i = this.d;
            this.d = i + 1;
            this.f = iArr[i];
        }
        if (this.d > 0) {
            this.e = this.a[this.d - 1];
        }
        return this.f != this.c;
    }

    public int b() {
        return this.e;
    }
}
