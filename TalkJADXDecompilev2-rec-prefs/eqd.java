package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.io.Serializable;

public final class eqd extends ery implements eqg {
    private eqe f12031a = eqe.ONE;
    private String aj;
    private eqk f12032b;
    private View f12033c;
    private Button f12034d;
    private Button f12035e;
    private Snackbar f12036f;
    private String f12037g;
    private epw f12038h = epw.SETTINGS;
    private epv f12039i = epv.ENABLED;

    public eqd() {
        super(gwb.ty, new int[]{bn.f4006b, bn.f4007c});
    }

    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.m25444a(eqg.class, (Object) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("current_step", this.f12031a);
        bundle.putString("phone_number", this.f12037g);
        bundle.putSerializable("source_activity", this.f12038h);
        bundle.putSerializable("set_discoverability", this.f12039i);
        super.onSaveInstanceState(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = bundle != null ? bundle : getArguments();
        this.f12031a = (eqe) arguments.getSerializable("current_step");
        this.f12037g = arguments.getString("phone_number");
        this.f12038h = (epw) arguments.getSerializable("source_activity");
        this.f12039i = (epv) arguments.getSerializable("set_discoverability");
        this.aj = ((jca) this.binder.m25443a(jca.class)).mo2320c().mo3440b("account_name");
        eps eps = (eps) this.binder.m25443a(eps.class);
        if (eps.m14232b() == 101 && bundle == null) {
            this.f12031a = eqe.TWO;
            this.f12037g = eps.m14235c();
        }
        this.f12033c = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f12035e = (Button) this.f12033c.findViewById(bn.f4006b);
        this.f12034d = (Button) this.f12033c.findViewById(bn.f4007c);
        this.f12036f = (Snackbar) this.f12033c.findViewById(bn.f4008d);
        dr a = getChildFragmentManager().mo1843a(bn.f4010f);
        if (a == null) {
            m14246c();
        } else {
            this.f12032b = (eqk) a;
            m14247d();
        }
        return this.f12033c;
    }

    protected String mo495a() {
        if (this.f12031a == eqe.ONE) {
            return getString(gwb.tK);
        }
        if (this.f12031a == eqe.TWO) {
            return getString(gwb.tF);
        }
        if (this.f12031a == eqe.THREE) {
            return getString(gwb.tS);
        }
        return "";
    }

    protected void mo517a(int i) {
        if (this.f12031a == eqe.ONE) {
            if (i == bn.f4007c) {
                if (this.f12032b.mo1933c()) {
                    this.f12037g = ((eql) this.f12032b).m14276q();
                    this.f12031a = eqe.TWO;
                    m14246c();
                }
            } else if (i == bn.f4006b) {
                this.f12032b.mo1934d();
                if (this.f12038h == epw.SETTINGS) {
                    getActivity().finish();
                } else {
                    super.mo517a(i);
                }
            }
        } else if (this.f12031a == eqe.TWO) {
            if (i == bn.f4007c) {
                if (this.f12032b.mo1933c()) {
                    this.f12031a = eqe.THREE;
                    m14246c();
                }
            } else if (i == bn.f4006b) {
                this.f12032b.mo1934d();
                this.f12031a = eqe.ONE;
                m14246c();
            }
        } else if (this.f12031a != eqe.THREE) {
        } else {
            if (i == bn.f4007c) {
                this.f12032b.mo1933c();
                this.f12031a = eqe.ONE;
                if (this.f12038h == epw.SETTINGS) {
                    getActivity().finish();
                } else {
                    super.mo517a(i);
                }
            } else if (i == bn.f4006b) {
                this.f12031a = eqe.TWO;
                m14246c();
            }
        }
    }

    private void m14247d() {
        this.f12036f.m8334a(this.f12032b.mo1931a(getActivity(), this.aj));
        this.f12036f.setVisibility(this.f12032b.mo1935e());
        this.f12035e.setText(this.f12032b.mo1932b());
        this.f12034d.setText(this.f12032b.mo495a());
    }

    public void mo1929b() {
        this.f12034d.setEnabled(true);
        this.f12035e.setEnabled(true);
    }

    private void m14246c() {
        this.f12034d.setEnabled(false);
        this.f12035e.setEnabled(false);
        ew a = getChildFragmentManager().mo1845a();
        Serializable serializable;
        eqk eql;
        Bundle bundle;
        if (this.f12031a == eqe.ONE) {
            Serializable serializable2 = this.f12038h;
            serializable = this.f12039i;
            eql = new eql();
            bundle = new Bundle();
            bundle.putSerializable("source_activity", serializable2);
            bundle.putSerializable("set_discoverability", serializable);
            eql.setArguments(bundle);
            this.f12032b = eql;
        } else if (this.f12031a == eqe.TWO) {
            r0 = this.f12037g;
            serializable = this.f12039i;
            eql = new equ();
            bundle = new Bundle();
            bundle.putSerializable("set_discoverability", serializable);
            bundle.putString("phone_number", r0);
            eql.setArguments(bundle);
            this.f12032b = eql;
        } else if (this.f12031a == eqe.THREE) {
            r0 = this.f12037g;
            eqk eqs = new eqs();
            Bundle bundle2 = new Bundle();
            bundle2.putString("phone_number", r0);
            eqs.setArguments(bundle2);
            this.f12032b = eqs;
        }
        a.mo1530b(bn.f4010f, (dr) this.f12032b);
        a.mo1522a();
        m14247d();
    }
}
