package p000;

import java.net.URI;
import java.util.List;
import java.util.Map;

final class ovb implements Runnable {
    final /* synthetic */ Map f34351a;
    final /* synthetic */ oup f34352b;

    ovb(oup oup, Map map) {
        this.f34352b = oup;
        this.f34351a = map;
    }

    public void run() {
        this.f34352b.f34332o = URI.create(this.f34352b.f34329l).resolve((String) ((List) this.f34351a.get("location")).get(0)).toString();
        this.f34352b.f34322e.add(this.f34352b.f34332o);
        this.f34352b.m39749a(ovw.REDIRECT_RECEIVED, ovw.AWAITING_FOLLOW_REDIRECT, new ovc(this));
    }
}
