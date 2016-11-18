package p000;

final class dob extends ijj {
    final /* synthetic */ dny f10210a;

    dob(dny dny) {
        this.f10210a = dny;
    }

    public /* bridge */ /* synthetic */ void mo1390a(nzf nzf, nzf nzf2) {
        m12341a((lyh) nzf2);
    }

    public void mo1425a() {
        this.f10210a.f10205g = (lyh) this.f10210a.f10204f.mo3365b().values().iterator().next();
        m12342a(true);
    }

    private void m12341a(lyh lyh) {
        this.f10210a.f10205g = lyh;
        m12342a(false);
    }

    private void m12342a(boolean z) {
        iil.m21875b("Expected non-null", this.f10210a.f10205g);
        dnd dnd = this.f10210a.f10203e;
        if (!gwb.m2061b(this.f10210a.f10205g.f26874i)) {
            this.f10210a.f10203e = dnd.OPEN;
        } else if (gwb.m1507a(this.f10210a.f10205g.f26884s) == 2) {
            this.f10210a.f10203e = dnd.KNOCKABLE;
        } else if (gwb.m1507a(this.f10210a.f10205g.f26886u) == 2) {
            this.f10210a.f10203e = dnd.DOMAIN_WITH_EXTERNAL;
        } else if (gwb.m1507a(this.f10210a.f10205g.f26867b) == 2) {
            this.f10210a.f10203e = dnd.DOMAIN_RESTRICTED;
        } else {
            this.f10210a.f10203e = dnd.INVITED_ONLY;
        }
        if (dnd != this.f10210a.f10203e) {
            for (dnb a : this.f10210a.f10202d) {
                a.mo1615a(this.f10210a.f10203e, z);
            }
        }
    }
}
