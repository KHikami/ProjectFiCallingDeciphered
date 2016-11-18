package p000;

public final class ech {
    private final int f11169a = 16;
    private final int f11170b;
    private String f11171c = null;
    private String f11172d = null;

    public ech(int i, int i2) {
        this.f11170b = i2;
    }

    public ech m13511a(String str) {
        this.f11171c = str;
        return this;
    }

    public ech m13512b(String str) {
        this.f11172d = str;
        return this;
    }

    public ecg m13510a() {
        return new ecg(this.f11169a, this.f11170b, this.f11171c, this.f11172d);
    }
}
