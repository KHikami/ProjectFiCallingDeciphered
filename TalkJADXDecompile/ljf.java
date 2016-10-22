import java.util.UUID;

final class ljf extends liu implements liy {
    private final Exception b;

    ljf(String str, liy liy) {
        super(str, (ljo) liy);
        this.b = liy.d();
    }

    ljf(String str) {
        super(str, UUID.randomUUID());
        this.b = new liz();
    }

    public ljo a(String str, ljm ljm) {
        return new ljf(str, this);
    }

    public void e() {
    }

    public Exception d() {
        return this.b;
    }
}
