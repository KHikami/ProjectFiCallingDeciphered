import android.content.Context;
import android.content.res.Resources;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

public final class cww extends jbp<jbr> {
    ctn aj;
    Context ak;

    protected /* synthetic */ ListAdapter t() {
        return v();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.ak = context;
        this.aj = ((cuj) jyn.a(context, cuj.class)).a();
    }

    protected int r() {
        return 0;
    }

    protected String q() {
        return getString(gwb.ps);
    }

    private jbr v() {
        jbr jbr = new jbr(getContext());
        Resources resources = getResources();
        jbr.add(new jbt(cwz.a - 1, getString(bc.iU)).a(gwb.a(resources, gwb.pq, null)));
        jbr.add(new jbt(cwz.b - 1, getString(gwb.pr)).a(gwb.a(resources, gwb.pp, null)));
        return jbr;
    }

    protected OnItemClickListener s() {
        return new cwx(this);
    }
}
