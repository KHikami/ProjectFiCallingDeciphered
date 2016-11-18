package p000;

final class jsz implements jfh {
    final /* synthetic */ jtc f21017a;
    final /* synthetic */ jsx f21018b;

    jsz(jsx jsx, jtc jtc) {
        this.f21018b = jsx;
        this.f21017a = jtc;
    }

    public void mo3487a(int i) {
        jsx jsx = this.f21018b;
        jtc jtc = this.f21017a;
        new StringBuilder(54).append("handlePermissionRequestResult: ").append(i).append("/").append(jtc.f21019a);
        jtf jtf = (jtf) jsx.f21013a.get(i);
        if (jtf != null) {
            jtf.m25189a(jtc.m25186a());
        }
    }
}
