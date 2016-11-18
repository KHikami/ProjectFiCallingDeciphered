package p000;

public final class ize<E> {
    private final Object[] f19466a;
    private final int[] f19467b;
    private int f19468c;
    private int f19469d;
    private Object f19470e;

    ize(int[] iArr, Object[] objArr) {
        this.f19467b = iArr;
        this.f19466a = objArr;
    }

    public boolean m23571a() {
        this.f19470e = null;
        while (this.f19470e == null && this.f19468c < this.f19466a.length) {
            Object[] objArr = this.f19466a;
            int i = this.f19468c;
            this.f19468c = i + 1;
            this.f19470e = objArr[i];
        }
        if (this.f19468c > 0) {
            this.f19469d = this.f19467b[this.f19468c - 1];
        }
        return this.f19470e != null;
    }

    public E m23572b() {
        return this.f19470e;
    }
}
