package defpackage;

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
    private static final ke a = ke.a();
    private String aj = "";
    private jca ak;
    private boolean al;
    private boolean am;
    private ben an;
    private det b;
    private EditText c;
    private TextView d;
    private boolean e;
    private View f;
    private del g;
    private Snackbar h;
    private VoiceRatesAndBalanceView i;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((Cursor) obj);
    }

    public void a(det det) {
        this.b = det;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        if (c()) {
            this.c.setCursorVisible(false);
        }
        String obj = this.c.getText().toString();
        if (this.i != null) {
            this.i.a(obj, fde.e(this.ak.a()));
        }
        if (obj.length() == 0) {
            this.b.b(obj);
        } else {
            this.b.b(a.a(obj, kp.a));
        }
        q();
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.ak = (jca) this.binder.a(jca.class);
        this.an = (ben) this.binder.b(ben.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = new del(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.am = true;
        View inflate = layoutInflater.inflate(gwb.ho, viewGroup, false);
        LayoutTransition layoutTransition = ((LinearLayout) inflate.findViewById(ba.fP)).getLayoutTransition();
        layoutTransition.disableTransitionType(3);
        layoutTransition.disableTransitionType(1);
        this.c = (EditText) inflate.findViewById(ba.aM);
        this.c.setKeyListener(dev.a);
        this.c.setOnClickListener(this);
        this.c.setOnKeyListener(this);
        this.c.setOnLongClickListener(this);
        this.c.addTextChangedListener(this);
        getActivity();
        gwb.a(this.c);
        this.d = (TextView) inflate.findViewById(ba.S);
        this.f = inflate.findViewById(ba.aC);
        if (this.f != null) {
            this.f.setOnClickListener(this);
            this.f.setOnLongClickListener(this);
        }
        DialpadFragment dialpadFragment = (DialpadFragment) getChildFragmentManager().a(DialpadFragment.class.getName());
        if (dialpadFragment == null) {
            dialpadFragment = new DialpadFragment();
            getChildFragmentManager().a().a(ba.aI, dialpadFragment, DialpadFragment.class.getName()).a();
        }
        dialpadFragment.a((dem) this);
        this.i = (VoiceRatesAndBalanceView) inflate.findViewById(ba.er);
        q();
        e();
        if (this.al) {
            d();
        }
        bko e = fde.e(this.ak.a());
        if (e != null) {
            if (e.s()) {
                int i;
                TextView textView = this.d;
                jyr jyr = this.context;
                if (e.M()) {
                    i = bc.N;
                } else {
                    i = bc.M;
                }
                textView.setText(jyr.getString(i, new Object[]{glq.a(gwb.H(), e.u(), glu.b)}));
                this.d.setVisibility(0);
            } else if (this.an != null) {
                this.an.a(getActivity(), getLifecycle(), this.d);
            }
        }
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ig b = getLoaderManager().b(1, null, this);
        if (b != null) {
            b.v();
        }
    }

    public void onResume() {
        super.onResume();
        this.aj = "";
        q();
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        if (this.e) {
            this.e = false;
            a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.g.a();
    }

    public void a(int i, boolean z) {
        if (z) {
            this.c.onKeyDown(i, new KeyEvent(0, i));
            this.h = (Snackbar) getActivity().findViewById(ba.fo);
            if (!(this.h == null || this.h.c())) {
                this.h.b();
            }
        }
        e();
    }

    public void a(int i) {
        switch (i) {
            case 7:
                int selectionStart = this.c.getSelectionStart();
                if (selectionStart > 0) {
                    this.c.setSelection(selectionStart);
                    this.c.getText().delete(selectionStart - 1, selectionStart);
                }
                a(81, true);
                a(81, false);
                return;
            default:
                return;
        }
    }

    private void e() {
        int length = this.c.length();
        if (length == this.c.getSelectionStart() && length == this.c.getSelectionEnd()) {
            this.c.setCursorVisible(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (view.getId() != ba.aM || i != 66) {
            return false;
        }
        b();
        return true;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == ba.aC) {
            this.g.d();
            a(67, true);
        } else if (id != ba.aM) {
            String valueOf = String.valueOf(view);
            glk.e("Babel_dialer", new StringBuilder(String.valueOf(valueOf).length() + 33).append("Unexpected onClick() event from: ").append(valueOf).toString(), new Object[0]);
        } else if (!c()) {
            this.c.setCursorVisible(true);
        }
    }

    public boolean onLongClick(View view) {
        Editable text = this.c.getText();
        int id = view.getId();
        if (id == ba.aC) {
            text.clear();
            this.f.setPressed(false);
            return true;
        } else if (id != ba.aM) {
            return false;
        } else {
            this.c.setCursorVisible(true);
            return false;
        }
    }

    public void b(String str) {
        this.c.setText(str);
        this.c.setSelection(this.c.getText().length());
    }

    public void a() {
        this.c.getText().clear();
    }

    public void b() {
        if (!c()) {
            this.b.c(this.c.getText().toString());
            a();
        } else if ("".equals(this.aj)) {
            glk.e("Babel_dialer", "Dialer button enabled without a last-dialed number", new Object[0]);
        } else {
            b(this.aj);
        }
    }

    private void q() {
        boolean z;
        boolean z2 = false;
        View view = this.f;
        if (c()) {
            z = false;
        } else {
            z = true;
        }
        view.setEnabled(z);
        det det = this.b;
        if (!(c() && "".equals(this.aj))) {
            z2 = true;
        }
        det.b(z2);
    }

    public boolean c() {
        return this.c.length() == 0;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            this.c.requestFocus();
        }
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        if (i == 1 && this.ak.b()) {
            return gwb.a(fde.e(this.ak.a()), true, 1);
        }
        return null;
    }

    public void a(Cursor cursor) {
        if (cursor.moveToPosition(0)) {
            this.aj = cursor.getString(1);
            q();
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
    }

    public void d() {
        if (this.am) {
            this.al = false;
            this.c.setText("");
            this.g.c();
            this.i.c();
            return;
        }
        this.al = true;
    }
}
