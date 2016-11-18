package p000;

final class nvs {
    private final nvy f31139a = nvy.m36826a(this.f31140b);
    private final byte[] f31140b;

    nvs(int i) {
        this.f31140b = new byte[i];
    }

    public nvn m36754a() {
        if (this.f31139a.mo4037h() == 0) {
            return new nvu(this.f31140b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public nvy m36755b() {
        return this.f31139a;
    }
}
