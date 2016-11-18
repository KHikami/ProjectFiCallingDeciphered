package p000;

public abstract class nvw {
    int f31141a;
    int f31142b = 100;
    int f31143c = 67108864;

    public abstract int mo3987a();

    public abstract <T extends nwi<T, ?>> T mo3988a(int i, T t, nwd nwd);

    public abstract <T extends nwi<T, ?>> T mo3989a(T t, nwd nwd);

    public abstract void mo3990a(int i);

    public abstract void mo3991a(int i, nxj nxj, nwd nwd);

    public abstract void mo3992a(nxj nxj, nwd nwd);

    public abstract double mo3993b();

    public abstract int mo3994b(int i);

    public abstract float mo3995c();

    public abstract void mo3996c(int i);

    public abstract long mo3997d();

    public abstract long mo3998e();

    public abstract int mo3999f();

    public abstract long mo4000g();

    public abstract int mo4001h();

    public abstract boolean mo4002i();

    public abstract String mo4003j();

    public abstract String mo4004k();

    public abstract nvn mo4005l();

    public abstract int mo4006m();

    public abstract int mo4007n();

    public abstract int mo4008o();

    public abstract long mo4009p();

    public abstract int mo4010q();

    public abstract long mo4011r();

    public abstract int mo4012s();

    abstract long mo4013t();

    public abstract int mo4014u();

    static nvw m36757a(byte[] bArr, int i, int i2, boolean z) {
        nvw nvx = new nvx(bArr, i, i2, z);
        try {
            nvx.mo3994b(i2);
            return nvx;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    nvw() {
    }
}
