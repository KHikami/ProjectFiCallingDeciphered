package p000;

public final class isl implements itc {
    private ijn f18871a;
    private boolean f18872b;

    public void mo3395a(ite ite) {
        iil.m21874a("Must use CallClient", ite instanceof ijn);
        this.f18871a = (ijn) ite;
        mo3396a(this.f18872b);
    }

    public void mo3394a() {
    }

    public boolean mo3397b() {
        return this.f18872b;
    }

    public void mo3396a(boolean z) {
        this.f18872b = z;
        if (this.f18871a != null) {
            this.f18871a.m21960a(!z);
        }
    }
}
