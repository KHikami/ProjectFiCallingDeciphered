package p000;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

public final class clr extends jbp<jbr> {
    final List<clt> aj = new ArrayList();

    protected /* synthetic */ ListAdapter mo1003t() {
        return m7891v();
    }

    public clr() {
        this.aj.add(new clt(gwb.nh, gwb.ne, cja.class, 2160));
        this.aj.add(new clt(gwb.ni, gwb.nf, cnk.class, 3023));
    }

    protected String mo1000q() {
        return null;
    }

    protected int mo1001r() {
        return 0;
    }

    private jbr m7891v() {
        jbr jbr = new jbr(getActivity());
        for (int i = 0; i < this.aj.size(); i++) {
            clt clt = (clt) this.aj.get(i);
            jbr.add(new jbt(i, getResources().getString(clt.f5556a)).m23799a(getResources().getDrawable(clt.f5557b)));
        }
        return jbr;
    }

    protected OnItemClickListener mo1002s() {
        return new cls(this);
    }
}
