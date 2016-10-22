import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

final class bwd extends aer implements bxi {
    private final btm p;
    private final bxj q;
    private btf r;

    public void a(btf btf, List<edo> list) {
        boolean z = this.r != null && this.r.a == btf.a;
        this.r = btf;
        if (z) {
            this.p.b(btf);
        } else {
            this.p.a(btf);
        }
        this.q.a(list, z, Long.toString(btf.a));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List arrayList = new ArrayList();
        arrayList.add(this.p.e());
        arrayList.add(this.q.a());
        gld.a(this.a.getContext(), spannableStringBuilder, arrayList);
        this.a.setContentDescription(spannableStringBuilder);
    }

    public void w() {
        this.p.a();
    }

    public long x() {
        return this.r.g;
    }

    public bth y() {
        return this.r.u;
    }

    public ViewGroup v() {
        return this.q.v();
    }

    public bwd(dr drVar, ViewGroup viewGroup, btn btn, fwy fwy) {
        LayoutInflater from = LayoutInflater.from(drVar.getContext());
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(ba.hx, viewGroup, false);
        from.inflate(btn.a(fwy), (FrameLayout) viewGroup2.findViewById(bm.t), true);
        super(viewGroup2);
        this.p = btn.a(drVar, this.a);
        this.q = new bxj(drVar.getContext(), this.a);
    }
}
