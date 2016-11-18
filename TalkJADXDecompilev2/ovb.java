package defpackage;

import java.net.URI;
import java.util.List;
import java.util.Map;

final class ovb implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ oup b;

    ovb(oup oup, Map map) {
        this.b = oup;
        this.a = map;
    }

    public void run() {
        this.b.o = URI.create(this.b.l).resolve((String) ((List) this.a.get("location")).get(0)).toString();
        this.b.e.add(this.b.o);
        this.b.a(ovw.REDIRECT_RECEIVED, ovw.AWAITING_FOLLOW_REDIRECT, new ovc(this));
    }
}
