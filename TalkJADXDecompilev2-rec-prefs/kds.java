package p000;

final class kds {
    private StringBuilder f21424a = new StringBuilder(256);
    private int f21425b = 0;

    kds() {
    }

    public StringBuilder m25602a() {
        this.f21425b++;
        if (this.f21425b == 1) {
            return this.f21424a;
        }
        return new StringBuilder(256);
    }

    public void m25603a(StringBuilder stringBuilder) {
        if (this.f21425b <= 0) {
            throw new IllegalStateException("Cannot release more StringBuilders than have been acquired");
        } else if (this.f21425b != 1 || stringBuilder == this.f21424a) {
            stringBuilder.setLength(0);
            this.f21425b--;
        } else {
            throw new IllegalArgumentException("Tried to release wrong StringBuilder instance");
        }
    }
}
