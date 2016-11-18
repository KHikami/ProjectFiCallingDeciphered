package p000;

final class eop implements Runnable {
    final /* synthetic */ eon f11945a;

    eop(eon eon) {
        this.f11945a = eon;
    }

    public void run() {
        boolean z = eon.f11934a;
        if (this.f11945a.f11939f != -1) {
            for (eov eov : this.f11945a.f11936c) {
                Object obj;
                if (eov.mo1924a() || this.f11945a.f11935b) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (!eov.f11946b && r0 != null) {
                    eov.mo1926c();
                } else if (eov.f11946b && r0 == null) {
                    eov.mo1927d();
                }
            }
        }
    }
}
