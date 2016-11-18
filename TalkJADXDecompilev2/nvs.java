package defpackage;

final class nvs {
    private final nvy a = nvy.a(this.b);
    private final byte[] b;

    nvs(int i) {
        this.b = new byte[i];
    }

    public nvn a() {
        if (this.a.h() == 0) {
            return new nvu(this.b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public nvy b() {
        return this.a;
    }
}
