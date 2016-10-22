package defpackage;

import java.util.List;

/* renamed from: jsy */
final class jsy implements jfe {
    final /* synthetic */ jsx a;

    jsy(jsx jsx) {
        this.a = jsx;
    }

    public void a(int i, int i2) {
        List<jtc> a = this.a.b.a(i2);
        if (!a.isEmpty()) {
            new StringBuilder(64).append("handleRequestCodes: ").append(i).append("/").append(i2).append(", ").append(a.size()).append(" pending");
            for (jtc jtc : a) {
                jsx jsx = this.a;
                new StringBuilder(54).append("handlePermissionRequestResult: ").append(i).append("/").append(jtc.a);
                jtf jtf = (jtf) jsx.a.get(i);
                if (jtf != null) {
                    jtf.a(jtc.a());
                }
            }
        }
    }
}
