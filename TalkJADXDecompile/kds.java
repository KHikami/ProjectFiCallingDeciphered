final class kds {
    private StringBuilder a;
    private int b;

    kds() {
        this.a = new StringBuilder(256);
        this.b = 0;
    }

    public StringBuilder a() {
        this.b++;
        if (this.b == 1) {
            return this.a;
        }
        return new StringBuilder(256);
    }

    public void a(StringBuilder stringBuilder) {
        if (this.b <= 0) {
            throw new IllegalStateException("Cannot release more StringBuilders than have been acquired");
        } else if (this.b != 1 || stringBuilder == this.a) {
            stringBuilder.setLength(0);
            this.b--;
        } else {
            throw new IllegalArgumentException("Tried to release wrong StringBuilder instance");
        }
    }
}
