package p000;

final class jmm implements Runnable {
    final /* synthetic */ jmj f20484a;
    final /* synthetic */ jmu f20485b;
    final /* synthetic */ jml f20486c;

    jmm(jml jml, jmj jmj, jmu jmu) {
        this.f20486c = jml;
        this.f20484a = jmj;
        this.f20485b = jmu;
    }

    public void run() {
        this.f20486c.f20483c.f20467b.mo3572a(this.f20486c.f20483c.f20466a.J_(), this.f20485b, this.f20486c.f20483c.f20468c);
        this.f20486c.f20483c.f20469d = null;
    }
}
