package defpackage;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

public final class clr extends jbp<jbr> {
    final List<clt> aj = new ArrayList();

    protected /* synthetic */ ListAdapter t() {
        return v();
    }

    public clr() {
        this.aj.add(new clt(gwb.nh, gwb.ne, cja.class, 2160));
        this.aj.add(new clt(gwb.ni, gwb.nf, cnk.class, 3023));
    }

    protected String q() {
        return null;
    }

    protected int r() {
        return 0;
    }

    private jbr v() {
        jbr jbr = new jbr(getActivity());
        for (int i = 0; i < this.aj.size(); i++) {
            clt clt = (clt) this.aj.get(i);
            jbr.add(new jbt(i, getResources().getString(clt.a)).a(getResources().getDrawable(clt.b)));
        }
        return jbr;
    }

    protected OnItemClickListener s() {
        return new cls(this);
    }
}
