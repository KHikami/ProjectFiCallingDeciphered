package p000;

final class inp extends ikg {
    final /* synthetic */ inj f18161a;

    inp(inj inj) {
        this.f18161a = inj;
    }

    public void mo1552a(iqo iqo, ayo ayo) {
        int i = 0;
        if (!iqo.m22949a().equals(this.f18161a.l.m22332a())) {
            return;
        }
        if (ayo instanceof iqt) {
            iqt iqt = (iqt) ayo;
            if (iqt.f18726a == 3) {
                inj inj = this.f18161a;
                if (!iqo.m22971m().isEmpty()) {
                    i = ((Integer) iqo.m22971m().get(0)).intValue();
                }
                inj.m22376b(i);
            } else if (iqt.f18726a == 2) {
                this.f18161a.m22376b(((Integer) iqo.m22971m().get(0)).intValue());
            }
        } else if (ayo instanceof iqv) {
            this.f18161a.mo3274a(iqo.m22973o());
        }
    }
}
