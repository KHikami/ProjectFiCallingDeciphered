package p000;

public final class izc {
    private final int[] f19456a;
    private final int[] f19457b;
    private final int f19458c;
    private int f19459d;
    private int f19460e;
    private int f19461f;

    public izc(int[] iArr, int[] iArr2, int i) {
        this.f19456a = iArr;
        this.f19457b = iArr2;
        this.f19458c = i;
    }

    public boolean m23562a() {
        this.f19461f = this.f19458c;
        while (this.f19461f == this.f19458c && this.f19459d < this.f19457b.length) {
            int[] iArr = this.f19457b;
            int i = this.f19459d;
            this.f19459d = i + 1;
            this.f19461f = iArr[i];
        }
        if (this.f19459d > 0) {
            this.f19460e = this.f19456a[this.f19459d - 1];
        }
        return this.f19461f != this.f19458c;
    }

    public int m23563b() {
        return this.f19460e;
    }
}
