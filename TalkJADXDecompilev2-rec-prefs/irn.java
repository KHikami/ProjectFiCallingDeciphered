package p000;

final class irn implements ijl<lyj> {
    final /* synthetic */ ipg f18783a;
    final /* synthetic */ irm f18784b;

    irn(irm irm, ipg ipg) {
        this.f18784b = irm;
        this.f18783a = ipg;
    }

    private void m23050a(lyj lyj) {
        String valueOf = String.valueOf(lyj);
        new StringBuilder(String.valueOf(valueOf).length() + 35).append("Successfully created new call id: \n").append(valueOf);
        this.f18784b.f18780a.mo2250a(lyj.f26898d[0].f26866a);
        this.f18783a.mo3357a();
    }

    private void m23051b(lyj lyj) {
        String valueOf = String.valueOf(lyj);
        itx.m23277a(5, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Failed to create new call id: \n").append(valueOf).toString());
        this.f18784b.f18780a.mo2249a();
        this.f18783a.mo3357a();
    }
}
