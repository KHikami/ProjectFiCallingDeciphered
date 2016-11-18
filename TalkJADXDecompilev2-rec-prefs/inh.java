package p000;

final class inh extends ikg {
    final /* synthetic */ ine f18128a;

    inh(ine ine) {
        this.f18128a = ine;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1552a(iqo iqo, ayo ayo) {
        int i = ((ayo instanceof iqq) || (ayo instanceof iqn)) ? (!iqo.m22968j() || this.f18128a.f18116h.containsKey(iqo.m22949a())) ? 0 : true : 0;
        ind ind;
        if (i != 0) {
            ind ind2;
            if (iqo.m22969k()) {
                ind = this.f18128a.f18120l;
                itl b = ind.m22334b();
                b.m23234c(true);
                b.m23246h(iqo.m22975q());
                b.m23247i(iqo.m22976r());
                ind2 = ind;
            } else {
                ind2 = new ind(this.f18128a.f18109a);
            }
            ind2.m22333a(iqo);
            this.f18128a.m22340a(ind2);
            itx.m23279a(3, "vclib", "Participant joined: %s", ind2.m22332a());
            synchronized (this.f18128a.f18114f) {
                this.f18128a.f18116h.put(ind2.m22332a(), ind2);
                this.f18128a.f18117i.add(ind2);
                this.f18128a.m22348f();
            }
            for (ini a : this.f18128a.f18113e) {
                a.mo3230a(ind2);
            }
        } else if (ayo instanceof iqr) {
            synchronized (this.f18128a.f18114f) {
                ind = (ind) this.f18128a.f18116h.remove(iqo.m22949a());
                if (ind == null) {
                    return;
                } else {
                    this.f18128a.f18119k.add(ind);
                    this.f18128a.m22348f();
                }
            }
        } else {
            if ((ayo instanceof iqm) || (ayo instanceof iqt) || (ayo instanceof iqv)) {
                i = true;
            } else {
                i = 0;
            }
            if (i != 0) {
                ind = (ind) this.f18128a.f18116h.get(iqo.m22949a());
                if (ind != null) {
                    ind.m22337e();
                }
            }
        }
        this.f18128a.m22347e();
    }

    public void mo1553a(String str, int i) {
        ind ind = this.f18128a.f18121m;
        this.f18128a.f18121m = null;
        for (iqo iqo : this.f18128a.f18111c.m22029a().m22138j()) {
            if (iqo.m22970l().contains(Integer.valueOf(i))) {
                this.f18128a.f18121m = (ind) this.f18128a.f18116h.get(iqo.m22949a());
                break;
            }
        }
        if (this.f18128a.f18121m != ind) {
            this.f18128a.m22340a(ind);
            this.f18128a.m22340a(this.f18128a.f18121m);
            this.f18128a.m22347e();
        }
    }

    public void mo1556b(ikd ikd) {
        this.f18128a.f18111c.m22056b(this.f18128a.f18112d);
        synchronized (this.f18128a.f18114f) {
            this.f18128a.f18124p = true;
            this.f18128a.f18115g = false;
        }
    }
}
