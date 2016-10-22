package defpackage;

/* renamed from: inh */
final class inh extends ikg {
    final /* synthetic */ ine a;

    inh(ine ine) {
        this.a = ine;
    }

    public void a(iqo iqo, ayo ayo) {
        int i = ((ayo instanceof iqq) || (ayo instanceof iqn)) ? (!iqo.j() || this.a.h.containsKey(iqo.a())) ? 0 : true : 0;
        ind ind;
        if (i != 0) {
            ind ind2;
            if (iqo.k()) {
                ind = this.a.l;
                itl b = ind.b();
                b.c(true);
                b.h(iqo.q());
                b.i(iqo.r());
                ind2 = ind;
            } else {
                ind2 = new ind(this.a.a);
            }
            ind2.a(iqo);
            this.a.a(ind2);
            itx.a(3, "vclib", "Participant joined: %s", ind2.a());
            synchronized (this.a.f) {
                this.a.h.put(ind2.a(), ind2);
                this.a.i.add(ind2);
                this.a.f();
            }
            for (ini a : this.a.e) {
                a.a(ind2);
            }
        } else if (ayo instanceof iqr) {
            synchronized (this.a.f) {
                ind = (ind) this.a.h.remove(iqo.a());
                if (ind == null) {
                    return;
                }
                this.a.k.add(ind);
                this.a.f();
                for (ini b2 : this.a.e) {
                    b2.b(ind);
                }
            }
        } else {
            if ((ayo instanceof iqm) || (ayo instanceof iqt) || (ayo instanceof iqv)) {
                i = true;
            } else {
                i = 0;
            }
            if (i != 0) {
                ind = (ind) this.a.h.get(iqo.a());
                if (ind != null) {
                    ind.e();
                }
            }
        }
        this.a.e();
    }

    public void a(String str, int i) {
        ind ind = this.a.m;
        this.a.m = null;
        for (iqo iqo : this.a.c.a().j()) {
            if (iqo.l().contains(Integer.valueOf(i))) {
                this.a.m = (ind) this.a.h.get(iqo.a());
                break;
            }
        }
        if (this.a.m != ind) {
            this.a.a(ind);
            this.a.a(this.a.m);
            this.a.e();
        }
    }

    public void b(ikd ikd) {
        this.a.c.b(this.a.d);
        synchronized (this.a.f) {
            this.a.p = true;
            this.a.g = false;
        }
    }
}
