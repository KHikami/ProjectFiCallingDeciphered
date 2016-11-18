package p000;

import android.animation.LayoutTransition;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.fragments.dialpad.DialpadFragment;
import com.google.android.apps.hangouts.views.VoiceRatesAndBalanceView;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public class des extends jzn implements TextWatcher, OnClickListener, OnKeyListener, OnLongClickListener, dem, fh<Cursor> {
    private static final ke f9572a = ke.m25637a();
    private String aj = "";
    private jca ak;
    private boolean al;
    private boolean am;
    private ben an;
    private det f9573b;
    private EditText f9574c;
    private TextView f9575d;
    private boolean f9576e;
    private View f9577f;
    private del f9578g;
    private Snackbar f9579h;
    private VoiceRatesAndBalanceView f9580i;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m11535a((Cursor) obj);
    }

    public void m11536a(det det) {
        this.f9573b = det;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        if (m11539c()) {
            this.f9574c.setCursorVisible(false);
        }
        String obj = this.f9574c.getText().toString();
        if (this.f9580i != null) {
            this.f9580i.m9622a(obj, fde.m15018e(this.ak.mo2317a()));
        }
        if (obj.length() == 0) {
            this.f9573b.mo1097b(obj);
        } else {
            this.f9573b.mo1097b(f9572a.m25642a(obj, kp.f22600a));
        }
        m11531q();
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.ak = (jca) this.binder.m25443a(jca.class);
        this.an = (ben) this.binder.m25454b(ben.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9578g = new del(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.am = true;
        View inflate = layoutInflater.inflate(gwb.ho, viewGroup, false);
        LayoutTransition layoutTransition = ((LinearLayout) inflate.findViewById(ba.fP)).getLayoutTransition();
        layoutTransition.disableTransitionType(3);
        layoutTransition.disableTransitionType(1);
        this.f9574c = (EditText) inflate.findViewById(ba.aM);
        this.f9574c.setKeyListener(dev.f9583a);
        this.f9574c.setOnClickListener(this);
        this.f9574c.setOnKeyListener(this);
        this.f9574c.setOnLongClickListener(this);
        this.f9574c.addTextChangedListener(this);
        getActivity();
        gwb.m1817a(this.f9574c);
        this.f9575d = (TextView) inflate.findViewById(ba.f2680S);
        this.f9577f = inflate.findViewById(ba.aC);
        if (this.f9577f != null) {
            this.f9577f.setOnClickListener(this);
            this.f9577f.setOnLongClickListener(this);
        }
        DialpadFragment dialpadFragment = (DialpadFragment) getChildFragmentManager().mo1844a(DialpadFragment.class.getName());
        if (dialpadFragment == null) {
            dialpadFragment = new DialpadFragment();
            getChildFragmentManager().mo1845a().mo1526a(ba.aI, dialpadFragment, DialpadFragment.class.getName()).mo1522a();
        }
        dialpadFragment.m8527a((dem) this);
        this.f9580i = (VoiceRatesAndBalanceView) inflate.findViewById(ba.er);
        m11531q();
        m11530e();
        if (this.al) {
            m11540d();
        }
        bko e = fde.m15018e(this.ak.mo2317a());
        if (e != null) {
            if (e.m5650s()) {
                int i;
                TextView textView = this.f9575d;
                jyr jyr = this.context;
                if (e.m5626M()) {
                    i = bc.f2930N;
                } else {
                    i = bc.f2929M;
                }
                textView.setText(jyr.getString(i, new Object[]{glq.m18002a(gwb.m1400H(), e.m5652u(), glu.f15610b)}));
                this.f9575d.setVisibility(0);
            } else if (this.an != null) {
                this.an.mo512a(getActivity(), getLifecycle(), this.f9575d);
            }
        }
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ig b = getLoaderManager().mo1998b(1, null, this);
        if (b != null) {
            b.m1293v();
        }
    }

    public void onResume() {
        super.onResume();
        this.aj = "";
        m11531q();
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        if (this.f9576e) {
            this.f9576e = false;
            mo495a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f9578g.m11522a();
    }

    public void mo1108a(int i, boolean z) {
        if (z) {
            this.f9574c.onKeyDown(i, new KeyEvent(0, i));
            this.f9579h = (Snackbar) getActivity().findViewById(ba.fo);
            if (!(this.f9579h == null || this.f9579h.mo1081c())) {
                this.f9579h.mo1083b();
            }
        }
        m11530e();
    }

    public void mo1107a(int i) {
        switch (i) {
            case 7:
                int selectionStart = this.f9574c.getSelectionStart();
                if (selectionStart > 0) {
                    this.f9574c.setSelection(selectionStart);
                    this.f9574c.getText().delete(selectionStart - 1, selectionStart);
                }
                mo1108a(81, true);
                mo1108a(81, false);
                return;
            default:
                return;
        }
    }

    private void m11530e() {
        int length = this.f9574c.length();
        if (length == this.f9574c.getSelectionStart() && length == this.f9574c.getSelectionEnd()) {
            this.f9574c.setCursorVisible(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (view.getId() != ba.aM || i != 66) {
            return false;
        }
        m11537b();
        return true;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == ba.aC) {
            this.f9578g.m11526d();
            mo1108a(67, true);
        } else if (id != ba.aM) {
            String valueOf = String.valueOf(view);
            glk.m17982e("Babel_dialer", new StringBuilder(String.valueOf(valueOf).length() + 33).append("Unexpected onClick() event from: ").append(valueOf).toString(), new Object[0]);
        } else if (!m11539c()) {
            this.f9574c.setCursorVisible(true);
        }
    }

    public boolean onLongClick(View view) {
        Editable text = this.f9574c.getText();
        int id = view.getId();
        if (id == ba.aC) {
            text.clear();
            this.f9577f.setPressed(false);
            return true;
        } else if (id != ba.aM) {
            return false;
        } else {
            this.f9574c.setCursorVisible(true);
            return false;
        }
    }

    public void m11538b(String str) {
        this.f9574c.setText(str);
        this.f9574c.setSelection(this.f9574c.getText().length());
    }

    public void mo495a() {
        this.f9574c.getText().clear();
    }

    public void m11537b() {
        if (!m11539c()) {
            this.f9573b.mo1099c(this.f9574c.getText().toString());
            mo495a();
        } else if ("".equals(this.aj)) {
            glk.m17982e("Babel_dialer", "Dialer button enabled without a last-dialed number", new Object[0]);
        } else {
            m11538b(this.aj);
        }
    }

    private void m11531q() {
        boolean z;
        boolean z2 = false;
        View view = this.f9577f;
        if (m11539c()) {
            z = false;
        } else {
            z = true;
        }
        view.setEnabled(z);
        det det = this.f9573b;
        if (!(m11539c() && "".equals(this.aj))) {
            z2 = true;
        }
        det.mo1098b(z2);
    }

    public boolean m11539c() {
        return this.f9574c.length() == 0;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            this.f9574c.requestFocus();
        }
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        if (i == 1 && this.ak.mo2319b()) {
            return gwb.m1615a(fde.m15018e(this.ak.mo2317a()), true, 1);
        }
        return null;
    }

    public void m11535a(Cursor cursor) {
        if (cursor.moveToPosition(0)) {
            this.aj = cursor.getString(1);
            m11531q();
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
    }

    public void m11540d() {
        if (this.am) {
            this.al = false;
            this.f9574c.setText("");
            this.f9578g.m11525c();
            this.f9580i.m9625c();
            return;
        }
        this.al = true;
    }
}
