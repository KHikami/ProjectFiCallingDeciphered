package defpackage;

import java.nio.channels.Channels;

final class ovs implements ovn {
    final /* synthetic */ ovo a;

    ovs(ovo ovo) {
        this.a = ovo;
    }

    public void a() {
        if (this.a.e == null) {
            this.a.j.k = 10;
            this.a.d.connect();
            this.a.j.k = 12;
            this.a.e = Channels.newChannel(this.a.d.getOutputStream());
        }
        this.a.a.set(ovv.AWAITING_READ_RESULT);
        this.a.b.execute(this.a.j.a(new ovt(this)));
    }
}
