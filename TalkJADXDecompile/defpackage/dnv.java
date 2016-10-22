package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

/* renamed from: dnv */
public final class dnv extends jbp<jbr> {
    dnc aj;
    final Handler ak;
    jbr al;

    protected /* synthetic */ ListAdapter t() {
        return v();
    }

    public dnv() {
        this.ak = new Handler(Looper.getMainLooper());
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.aj = (dnc) jyn.a((Context) activity, dnc.class);
    }

    protected int r() {
        return 0;
    }

    protected String q() {
        return getActivity().getResources().getString(ba.kU);
    }

    private jbr v() {
        String string;
        dnd a = this.aj.a();
        Resources resources = getActivity().getResources();
        if (TextUtils.isEmpty(this.aj.c())) {
            string = resources.getString(ba.ld);
        } else {
            string = resources.getString(ba.lc, new Object[]{r0});
        }
        String string2 = resources.getString(ba.le);
        String string3 = resources.getString(ba.kX);
        jbt jbt = new jbt(0, string);
        jbt jbt2 = new jbt(1, string2);
        jbt a2 = new jbt(2, string3).a(resources.getDrawable(ba.kG));
        a(jbt, jbt2, a);
        this.al = new jbr(getActivity());
        this.al.add(jbt);
        this.al.add(jbt2);
        this.al.add(new jbu());
        this.al.add(a2);
        return this.al;
    }

    protected OnItemClickListener s() {
        return new dnw(this);
    }

    void a(jbt jbt, jbt jbt2, dnd dnd) {
        Resources resources = getActivity().getResources();
        ColorStateList colorStateList = resources.getColorStateList(gwb.qb);
        Drawable drawable = resources.getDrawable(ba.kF);
        Drawable drawable2 = resources.getDrawable(ba.kJ);
        Drawable drawable3 = resources.getDrawable(ba.kM);
        Drawable drawable4 = resources.getDrawable(ba.kI);
        Drawable drawable5 = resources.getDrawable(ba.kL);
        if (dnd == dnd.DOMAIN_WITH_EXTERNAL) {
            jbt.a(colorStateList).a(drawable4).b(drawable);
            jbt2.a(null).a(drawable3).b(null);
        } else if (dnd == dnd.KNOCKABLE) {
            jbt2.a(colorStateList).a(drawable5).b(drawable);
            jbt.a(null).a(drawable2).b(null);
        }
    }
}
