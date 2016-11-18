package p000;

import java.util.List;

final class jsy implements jfe {
    final /* synthetic */ jsx f21016a;

    jsy(jsx jsx) {
        this.f21016a = jsx;
    }

    public void mo3486a(int i, int i2) {
        List<jtc> a = this.f21016a.f21014b.m25192a(i2);
        if (!a.isEmpty()) {
            new StringBuilder(64).append("handleRequestCodes: ").append(i).append("/").append(i2).append(", ").append(a.size()).append(" pending");
            for (jtc jtc : a) {
                jsx jsx = this.f21016a;
                new StringBuilder(54).append("handlePermissionRequestResult: ").append(i).append("/").append(jtc.f21019a);
                jtf jtf = (jtf) jsx.f21013a.get(i);
                if (jtf != null) {
                    jtf.m25189a(jtc.m25186a());
                }
            }
        }
    }
}
