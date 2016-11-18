package p000;

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

public final class dnv extends jbp<jbr> {
    dnc aj;
    final Handler ak = new Handler(Looper.getMainLooper());
    jbr al;

    protected /* synthetic */ ListAdapter mo1003t() {
        return m12323v();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.aj = (dnc) jyn.m25426a((Context) activity, dnc.class);
    }

    protected int mo1001r() {
        return 0;
    }

    protected String mo1000q() {
        return getActivity().getResources().getString(ba.kU);
    }

    private jbr m12323v() {
        String string;
        dnd a = this.aj.mo1622a();
        Resources resources = getActivity().getResources();
        if (TextUtils.isEmpty(this.aj.mo1627c())) {
            string = resources.getString(ba.ld);
        } else {
            string = resources.getString(ba.lc, new Object[]{r0});
        }
        String string2 = resources.getString(ba.le);
        String string3 = resources.getString(ba.kX);
        jbt jbt = new jbt(0, string);
        jbt jbt2 = new jbt(1, string2);
        jbt a2 = new jbt(2, string3).m23799a(resources.getDrawable(ba.kG));
        m12324a(jbt, jbt2, a);
        this.al = new jbr(getActivity());
        this.al.add(jbt);
        this.al.add(jbt2);
        this.al.add(new jbu());
        this.al.add(a2);
        return this.al;
    }

    protected OnItemClickListener mo1002s() {
        return new dnw(this);
    }

    void m12324a(jbt jbt, jbt jbt2, dnd dnd) {
        Resources resources = getActivity().getResources();
        ColorStateList colorStateList = resources.getColorStateList(gwb.qb);
        Drawable drawable = resources.getDrawable(ba.kF);
        Drawable drawable2 = resources.getDrawable(ba.kJ);
        Drawable drawable3 = resources.getDrawable(ba.kM);
        Drawable drawable4 = resources.getDrawable(ba.kI);
        Drawable drawable5 = resources.getDrawable(ba.kL);
        if (dnd == dnd.DOMAIN_WITH_EXTERNAL) {
            jbt.m23798a(colorStateList).m23799a(drawable4).m23802b(drawable);
            jbt2.m23798a(null).m23799a(drawable3).m23802b(null);
        } else if (dnd == dnd.KNOCKABLE) {
            jbt2.m23798a(colorStateList).m23799a(drawable5).m23802b(drawable);
            jbt.m23798a(null).m23799a(drawable2).m23802b(null);
        }
    }
}
