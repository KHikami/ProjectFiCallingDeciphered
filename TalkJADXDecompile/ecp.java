public class ecp implements bnq {
    final /* synthetic */ ecm a;

    public ecp(ecm ecm) {
        this.a = ecm;
        synchronized (ecm.z) {
            ecm.z.add(this);
        }
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        synchronized (this.a.z) {
            this.a.z.remove(this);
        }
        this.a.t();
    }
}
