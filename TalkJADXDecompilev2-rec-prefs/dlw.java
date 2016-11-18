package p000;

final class dlw implements dhx {
    final /* synthetic */ boolean f10096a;
    final /* synthetic */ dhw f10097b;
    final /* synthetic */ dlu f10098c;

    dlw(dlu dlu, boolean z, dhw dhw) {
        this.f10098c = dlu;
        this.f10096a = z;
        this.f10097b = dhw;
    }

    public void mo1602a(itl itl) {
        boolean z = !itl.m23251l() && this.f10096a;
        if (this.f10097b.m11873a() != z) {
            this.f10097b.mo1595a(z);
        }
    }

    public void mo1601a(did did) {
        boolean z = true;
        if (this.f10098c.f10091a.m11726r() != null) {
            z = false;
        }
        if (this.f10097b.m11873a() != z) {
            this.f10097b.mo1595a(z);
        }
    }
}
