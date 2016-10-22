package defpackage;

/* renamed from: inp */
final class inp extends ikg {
    final /* synthetic */ inj a;

    inp(inj inj) {
        this.a = inj;
    }

    public void a(iqo iqo, ayo ayo) {
        int i = 0;
        if (!iqo.a().equals(this.a.l.a())) {
            return;
        }
        if (ayo instanceof iqt) {
            iqt iqt = (iqt) ayo;
            if (iqt.a == 3) {
                inj inj = this.a;
                if (!iqo.m().isEmpty()) {
                    i = ((Integer) iqo.m().get(0)).intValue();
                }
                inj.b(i);
            } else if (iqt.a == 2) {
                this.a.b(((Integer) iqo.m().get(0)).intValue());
            }
        } else if (ayo instanceof iqv) {
            this.a.a(iqo.o());
        }
    }
}
