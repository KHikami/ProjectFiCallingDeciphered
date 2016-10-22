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
    bck a;
    EditText b;
    private egv c;
    private dth d;
    private final TextWatcher e;

    public eht() {
        this.e = new ehv(this);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        if (bundle != null) {
            this.a = (bck) bundle.getSerializable("edit_participants_model");
        }
        if (this.a == null) {
            this.a = new bck();
        }
        this.binder.a(bck.class, this.a);
        this.d = ((dti) this.binder.a(dti.class)).a(17);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.a("people_search_fragment_open");
        this.d.a("people_search_fragment_full_load");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("edit_participants_model", this.a);
    }

    public void onResume() {
        super.onResume();
        this.d.a(((jca) this.binder.a(jca.class)).a(), "people_search_fragment_open", 1017);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(gwb.sL, viewGroup, false);
        this.c = (egv) getChildFragmentManager().a(egv.class.getName());
        if (this.c == null) {
            this.c = new egv();
            getChildFragmentManager().a().a(bm.V, this.c, egv.class.getName()).a();
        }
        this.c.c(true);
        this.c.a("people_search_fragment_full_load", 1018);
        return inflate;
    }

    public void a(LayoutInflater layoutInflater, Toolbar toolbar) {
        toolbar.b((CharSequence) "");
        toolbar.setPadding(toolbar.getPaddingLeft(), 0, toolbar.getPaddingRight(), 0);
        toolbar.setBackgroundResource(bc.uR);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(gwb.sM, toolbar, false);
        toolbar.addView(frameLayout);
        this.b = (EditText) frameLayout.findViewById(bm.ae);
        this.b.addTextChangedListener(this.e);
        this.b.setOnFocusChangeListener(new ehu(this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(getResources().getColor(bc.uP));
        }
    }
}
