package p000;

public final class itm {
    private final itn f18986a;
    private lkl f18987b;

    public itm(int i) {
        switch (i) {
            case 0:
                this.f18986a = itn.INSUFFICIENT_BANDWIDTH_FOR_VIDEO;
                return;
            case 1:
                this.f18986a = itn.SUFFICIENT_BANDWIDTH_FOR_VIDEO;
                return;
            default:
                this.f18986a = itn.NONE;
                return;
        }
    }

    public itm(lkl lkl) {
        this.f18987b = lkl;
        this.f18986a = itn.NONE;
    }

    public itn m23255a() {
        return this.f18986a;
    }

    public lkl m23256b() {
        return this.f18987b;
    }
}
