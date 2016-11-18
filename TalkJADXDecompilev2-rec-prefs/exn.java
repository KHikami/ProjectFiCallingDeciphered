package p000;

import java.util.HashMap;
import java.util.Map;

public final class exn extends evz {
    private static final long serialVersionUID = 1;
    private final Map<String, String> f12443g = new HashMap();

    exn(lxe lxe) {
        super(lxe, lxe.responseHeader, -1);
        for (lxb lxb : lxe.f26750a) {
            lxc lxc = lxb.f26743a;
            if (!(lxb.f26744b == null || lxc == null || lxc.f26748b == null)) {
                this.f12443g.put(lxc.f26748b, lxb.f26744b);
            }
        }
    }
}
