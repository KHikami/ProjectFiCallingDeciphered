package defpackage;

final class jsz implements jfh {
    final /* synthetic */ jtc a;
    final /* synthetic */ jsx b;

    jsz(jsx jsx, jtc jtc) {
        this.b = jsx;
        this.a = jtc;
    }

    public void a(int i) {
        jsx jsx = this.b;
        jtc jtc = this.a;
        new StringBuilder(54).append("handlePermissionRequestResult: ").append(i).append("/").append(jtc.a);
        jtf jtf = (jtf) jsx.a.get(i);
        if (jtf != null) {
            jtf.a(jtc.a());
        }
    }
}
