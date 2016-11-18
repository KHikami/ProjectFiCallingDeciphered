package p000;

import java.util.List;

final class cvl extends cuz {
    final /* synthetic */ cvh f9175a;

    cvl(cvh cvh) {
        this.f9175a = cvh;
    }

    public void mo1440b(boolean z) {
        cvh cvh = this.f9175a;
        List<cvn> list = (List) cvh.f9162c.get(cvh.m11096b("localParticipant"));
        if (list != null) {
            for (cvn a : list) {
                a.mo1423a(z);
            }
        }
    }
}
