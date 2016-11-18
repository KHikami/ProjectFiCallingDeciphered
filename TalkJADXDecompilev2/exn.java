package defpackage;

import java.util.HashMap;
import java.util.Map;

public final class exn extends evz {
    private static final long serialVersionUID = 1;
    private final Map<String, String> g = new HashMap();

    exn(lxe lxe) {
        super(lxe, lxe.responseHeader, -1);
        for (lxb lxb : lxe.a) {
            lxc lxc = lxb.a;
            if (!(lxb.b == null || lxc == null || lxc.b == null)) {
                this.g.put(lxc.b, lxb.b);
            }
        }
    }
}
