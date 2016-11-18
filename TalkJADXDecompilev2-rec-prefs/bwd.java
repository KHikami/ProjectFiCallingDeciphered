package p000;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

final class bwd extends aer implements bxi {
    private final btm f4622p;
    private final bxj f4623q;
    private btf f4624r;

    public void m6809a(btf btf, List<edo> list) {
        boolean z = this.f4624r != null && this.f4624r.f4388a == btf.f4388a;
        this.f4624r = btf;
        if (z) {
            this.f4622p.mo760b(btf);
        } else {
            this.f4622p.mo754a(btf);
        }
        this.f4623q.m6888a(list, z, Long.toString(btf.f4388a));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List arrayList = new ArrayList();
        arrayList.add(this.f4622p.mo755e());
        arrayList.add(this.f4623q.m6887a());
        gld.m17923a(this.a.getContext(), spannableStringBuilder, arrayList);
        this.a.setContentDescription(spannableStringBuilder);
    }

    public void m6811w() {
        this.f4622p.mo759a();
    }

    public long m6812x() {
        return this.f4624r.f4394g;
    }

    public bth m6813y() {
        return this.f4624r.f4408u;
    }

    public ViewGroup mo710v() {
        return this.f4623q.mo710v();
    }

    public bwd(dr drVar, ViewGroup viewGroup, btn btn, fwy fwy) {
        LayoutInflater from = LayoutInflater.from(drVar.getContext());
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(ba.hx, viewGroup, false);
        from.inflate(btn.mo756a(fwy), (FrameLayout) viewGroup2.findViewById(bm.f3844t), true);
        super(viewGroup2);
        this.f4622p = btn.mo757a(drVar, this.a);
        this.f4623q = new bxj(drVar.getContext(), this.a);
    }
}
