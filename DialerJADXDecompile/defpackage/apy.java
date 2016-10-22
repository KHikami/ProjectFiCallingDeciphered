package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Toast;
import com.android.dialer.app.widget.SearchEditTextLayout;

/* compiled from: PG */
/* renamed from: apy */
public class apy extends aqt implements aty {
    private static final String s;
    private final TextWatcher t;
    private final atp u;
    private aup v;
    private EditText w;

    public apy() {
        this.t = new apz(this);
        this.u = new aqa(this);
    }

    static {
        s = apy.class.getSimpleName();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.e = true;
        if (this.f == null) {
            str = "";
        } else {
            str = this.f;
        }
        a(str);
        this.v = new aup(getContext());
    }

    public void onResume() {
        super.onResume();
        pl a = ((pz) getActivity()).e().a();
        a.a(buf.hL);
        a.d(true);
        a.b(false);
        a.a(false);
        SearchEditTextLayout searchEditTextLayout = (SearchEditTextLayout) a.a().findViewById(aq.bn);
        searchEditTextLayout.a(false, true);
        searchEditTextLayout.g = this.u;
        searchEditTextLayout.setBackgroundDrawable(null);
        this.w = (EditText) searchEditTextLayout.findViewById(aq.bm);
        this.w.addTextChangedListener(this.t);
        this.w.setHint(cob.be);
        searchEditTextLayout.findViewById(aq.bi).setBackgroundColor(getContext().getResources().getColor(17170443));
        if (!TextUtils.isEmpty(this.f)) {
            this.w.setText(this.f);
        }
        this.w.setTextSize(0, getResources().getDimension(buf.hi));
    }

    protected final adh a() {
        String str;
        adh apw = new apw(getActivity());
        apw.f = true;
        apw.z = false;
        if (this.f == null) {
            str = "";
        } else {
            str = this.f;
        }
        apw.a(str);
        return apw;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        super.onItemClick(adapterView, view, i, j);
        int headerViewsCount = i - this.i.getHeaderViewsCount();
        apw apw = (apw) this.h;
        int n = apw.n(headerViewsCount);
        Integer num = (Integer) view.getTag(aq.g);
        String k;
        switch (n) {
            case oe.HOST_ID /*-1*/:
                k = apw.k(headerViewsCount);
                if (num != null) {
                    Toast.makeText(getContext(), aim.a(getResources(), cob.bb, k), 0).show();
                    return;
                }
                atq.a(num, k, buf.g(getContext()), k, Integer.valueOf(aq.l), getFragmentManager(), this);
            case rl.g /*5*/:
                String str = apw.n;
                k = buf.g(getContext());
                this.v.a(new aqb(this, str, k), str, k);
            default:
                Log.w(s, "Ignoring unsupported shortcut type: " + n);
        }
    }

    protected final void a(int i, long j) {
    }

    public final void d_() {
        buf.H(getContext()).b(18);
        h();
    }

    public final void b() {
        Log.wtf(s, "Unblocked a number from the BlockedListSearchFragment");
        h();
    }

    private final void h() {
        Activity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public final void c() {
        this.h.notifyDataSetChanged();
    }
}
