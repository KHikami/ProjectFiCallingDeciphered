final class eop implements Runnable {
    final /* synthetic */ eon a;

    eop(eon eon) {
        this.a = eon;
    }

    public void run() {
        boolean z = eon.a;
        if (this.a.f != -1) {
            for (eov eov : this.a.c) {
                Object obj;
                if (eov.a() || this.a.b) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (!eov.b && r0 != null) {
                    eov.c();
                } else if (eov.b && r0 == null) {
                    eov.d();
                }
            }
        }
    }
}
