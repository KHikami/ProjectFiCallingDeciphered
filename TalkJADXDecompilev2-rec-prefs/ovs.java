package p000;

import java.nio.channels.Channels;

final class ovs implements ovn {
    final /* synthetic */ ovo f34394a;

    ovs(ovo ovo) {
        this.f34394a = ovo;
    }

    public void mo4235a() {
        if (this.f34394a.f34382e == null) {
            this.f34394a.f34387j.f34328k = 10;
            this.f34394a.f34381d.connect();
            this.f34394a.f34387j.f34328k = 12;
            this.f34394a.f34382e = Channels.newChannel(this.f34394a.f34381d.getOutputStream());
        }
        this.f34394a.f34378a.set(ovv.AWAITING_READ_RESULT);
        this.f34394a.f34379b.execute(this.f34394a.f34387j.m39740a(new ovt(this)));
    }
}
