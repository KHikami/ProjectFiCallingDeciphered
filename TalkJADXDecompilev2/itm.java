package defpackage;

public final class itm {
    private final itn a;
    private lkl b;

    public itm(int i) {
        switch (i) {
            case 0:
                this.a = itn.INSUFFICIENT_BANDWIDTH_FOR_VIDEO;
                return;
            case 1:
                this.a = itn.SUFFICIENT_BANDWIDTH_FOR_VIDEO;
                return;
            default:
                this.a = itn.NONE;
                return;
        }
    }

    public itm(lkl lkl) {
        this.b = lkl;
        this.a = itn.NONE;
    }

    public itn a() {
        return this.a;
    }

    public lkl b() {
        return this.b;
    }
}
