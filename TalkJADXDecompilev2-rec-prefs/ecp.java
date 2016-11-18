package p000;

public class ecp implements bnq {
    final /* synthetic */ ecm f11177a;

    public ecp(ecm ecm) {
        this.f11177a = ecm;
        synchronized (ecm.f11036z) {
            ecm.f11036z.add(this);
        }
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        synchronized (this.f11177a.f11036z) {
            this.f11177a.f11036z.remove(this);
        }
        this.f11177a.m13328t();
    }
}
