package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.io.Serializable;

/* renamed from: eqd */
public final class eqd extends ery implements eqg {
    private eqe a;
    private String aj;
    private eqk b;
    private View c;
    private Button d;
    private Button e;
    private Snackbar f;
    private String g;
    private epw h;
    private epv i;

    public eqd() {
        super(gwb.ty, new int[]{bn.b, bn.c});
        this.a = eqe.ONE;
        this.h = epw.SETTINGS;
        this.i = epv.ENABLED;
    }

    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.a(eqg.class, (Object) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("current_step", this.a);
        bundle.putString("phone_number", this.g);
        bundle.putSerializable("source_activity", this.h);
        bundle.putSerializable("set_discoverability", this.i);
        super.onSaveInstanceState(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = bundle != null ? bundle : getArguments();
        this.a = (eqe) arguments.getSerializable("current_step");
        this.g = arguments.getString("phone_number");
        this.h = (epw) arguments.getSerializable("source_activity");
        this.i = (epv) arguments.getSerializable("set_discoverability");
        this.aj = ((jca) this.binder.a(jca.class)).c().b("account_name");
        eps eps = (eps) this.binder.a(eps.class);
        if (eps.b() == 101 && bundle == null) {
            this.a = eqe.TWO;
            this.g = eps.c();
        }
        this.c = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.e = (Button) this.c.findViewById(bn.b);
        this.d = (Button) this.c.findViewById(bn.c);
        this.f = (Snackbar) this.c.findViewById(bn.d);
        dr a = getChildFragmentManager().a(bn.f);
        if (a == null) {
            c();
        } else {
            this.b = (eqk) a;
            d();
        }
        return this.c;
    }

    protected String a() {
        if (this.a == eqe.ONE) {
            return getString(gwb.tK);
        }
        if (this.a == eqe.TWO) {
            return getString(gwb.tF);
        }
        if (this.a == eqe.THREE) {
            return getString(gwb.tS);
        }
        return "";
    }

    protected void a(int i) {
        if (this.a == eqe.ONE) {
            if (i == bn.c) {
                if (this.b.c()) {
                    this.g = ((eql) this.b).q();
                    this.a = eqe.TWO;
                    c();
                }
            } else if (i == bn.b) {
                this.b.d();
                if (this.h == epw.SETTINGS) {
                    getActivity().finish();
                } else {
                    super.a(i);
                }
            }
        } else if (this.a == eqe.TWO) {
            if (i == bn.c) {
                if (this.b.c()) {
                    this.a = eqe.THREE;
                    c();
                }
            } else if (i == bn.b) {
                this.b.d();
                this.a = eqe.ONE;
                c();
            }
        } else if (this.a != eqe.THREE) {
        } else {
            if (i == bn.c) {
                this.b.c();
                this.a = eqe.ONE;
                if (this.h == epw.SETTINGS) {
                    getActivity().finish();
                } else {
                    super.a(i);
                }
            } else if (i == bn.b) {
                this.a = eqe.TWO;
                c();
            }
        }
    }

    private void d() {
        this.f.a(this.b.a(getActivity(), this.aj));
        this.f.setVisibility(this.b.e());
        this.e.setText(this.b.b());
        this.d.setText(this.b.a());
    }

    public void b() {
        this.d.setEnabled(true);
        this.e.setEnabled(true);
    }

    private void c() {
        this.d.setEnabled(false);
        this.e.setEnabled(false);
        ew a = getChildFragmentManager().a();
        Serializable serializable;
        eqk eql;
        Bundle bundle;
        if (this.a == eqe.ONE) {
            Serializable serializable2 = this.h;
            serializable = this.i;
            eql = new eql();
            bundle = new Bundle();
            bundle.putSerializable("source_activity", serializable2);
            bundle.putSerializable("set_discoverability", serializable);
            eql.setArguments(bundle);
            this.b = eql;
        } else if (this.a == eqe.TWO) {
            r0 = this.g;
            serializable = this.i;
            eql = new equ();
            bundle = new Bundle();
            bundle.putSerializable("set_discoverability", serializable);
            bundle.putString("phone_number", r0);
            eql.setArguments(bundle);
            this.b = eql;
        } else if (this.a == eqe.THREE) {
            r0 = this.g;
            eqk eqs = new eqs();
            Bundle bundle2 = new Bundle();
            bundle2.putString("phone_number", r0);
            eqs.setArguments(bundle2);
            this.b = eqs;
        }
        a.b(bn.f, (dr) this.b);
        a.a();
        d();
    }
}
