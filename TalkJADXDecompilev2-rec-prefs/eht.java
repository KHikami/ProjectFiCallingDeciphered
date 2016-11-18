package p000;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;

public final class eht extends jzn {
    bck f11519a;
    EditText f11520b;
    private egv f11521c;
    private dth f11522d;
    private final TextWatcher f11523e = new ehv(this);

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        if (bundle != null) {
            this.f11519a = (bck) bundle.getSerializable("edit_participants_model");
        }
        if (this.f11519a == null) {
            this.f11519a = new bck();
        }
        this.binder.m25444a(bck.class, this.f11519a);
        this.f11522d = ((dti) this.binder.m25443a(dti.class)).mo1673a(17);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11522d.mo1670a("people_search_fragment_open");
        this.f11522d.mo1670a("people_search_fragment_full_load");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("edit_participants_model", this.f11519a);
    }

    public void onResume() {
        super.onResume();
        this.f11522d.mo1668a(((jca) this.binder.m25443a(jca.class)).mo2317a(), "people_search_fragment_open", 1017);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(gwb.sL, viewGroup, false);
        this.f11521c = (egv) getChildFragmentManager().mo1844a(egv.class.getName());
        if (this.f11521c == null) {
            this.f11521c = new egv();
            getChildFragmentManager().mo1845a().mo1526a(bm.f3820V, this.f11521c, egv.class.getName()).mo1522a();
        }
        this.f11521c.m13908c(true);
        this.f11521c.m13904a("people_search_fragment_full_load", 1018);
        return inflate;
    }

    public void m13953a(LayoutInflater layoutInflater, Toolbar toolbar) {
        toolbar.mo1259b((CharSequence) "");
        toolbar.setPadding(toolbar.getPaddingLeft(), 0, toolbar.getPaddingRight(), 0);
        toolbar.setBackgroundResource(bc.uR);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(gwb.sM, toolbar, false);
        toolbar.addView(frameLayout);
        this.f11520b = (EditText) frameLayout.findViewById(bm.ae);
        this.f11520b.addTextChangedListener(this.f11523e);
        this.f11520b.setOnFocusChangeListener(new ehu(this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(getResources().getColor(bc.uP));
        }
    }
}
