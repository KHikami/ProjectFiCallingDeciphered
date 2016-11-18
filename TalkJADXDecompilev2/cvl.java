package defpackage;

import java.util.List;

final class cvl extends cuz {
    final /* synthetic */ cvh a;

    cvl(cvh cvh) {
        this.a = cvh;
    }

    public void b(boolean z) {
        cvh cvh = this.a;
        List<cvn> list = (List) cvh.c.get(cvh.b("localParticipant"));
        if (list != null) {
            for (cvn a : list) {
                a.a(z);
            }
        }
    }
}
