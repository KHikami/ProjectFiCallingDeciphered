package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;
import com.google.android.apps.hangouts.views.AvatarView;

/* renamed from: gbg */
public final class gbg {
    final Context a;
    final StatusMessageSettingsFragment b;
    final bko c;
    final ero d;
    EditText e;
    TextView f;
    View g;
    Button h;
    AccessibilityManager i;
    private final TextWatcher j;

    gbg(Context context, lfd lfd, StatusMessageSettingsFragment statusMessageSettingsFragment, ero ero) {
        this.j = new gbj(this);
        this.a = context;
        this.b = statusMessageSettingsFragment;
        this.c = fde.e(lfd.a());
        this.d = ero;
    }

    public void a(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(activity.getResources().getColor(gwb.et));
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Spannable a;
        View inflate = layoutInflater.inflate(gwb.hx, viewGroup, false);
        this.e = (EditText) inflate.findViewById(ba.fu);
        this.f = (TextView) inflate.findViewById(ba.fs);
        this.g = inflate.findViewById(ba.ft);
        this.h = (Button) inflate.findViewById(ba.fw);
        Button button = (Button) inflate.findViewById(ba.fv);
        ((AvatarView) inflate.findViewById(ba.dl)).a(this.c.p(), this.c.c(), this.c);
        this.e.addTextChangedListener(this.j);
        if (giw.d(this.a)) {
            this.b.getActivity().getWindow().setSoftInputMode(2);
        }
        if (bundle != null) {
            string = bundle.getString("saved_text");
        } else {
            string = this.b.getActivity().getIntent().getStringExtra("status_message");
        }
        if (string != null) {
            a = gld.a(Html.fromHtml(string));
        } else {
            a = new SpannableString("");
        }
        gob.a(this.a).a(a, null, this.e);
        this.e.setText(a);
        this.e.setSelection(a.length());
        this.i = (AccessibilityManager) this.a.getSystemService("accessibility");
        TextView textView = (TextView) inflate.findViewById(ba.dm);
        textView.setText(this.a.getResources().getString(bc.gm, new Object[]{"\ud83d\ude4b"}));
        this.h.setOnClickListener(new gbh(this));
        button.setOnClickListener(new gbi(this));
        return inflate;
    }

    public void a(Bundle bundle) {
        bundle.putString("saved_text", this.e.getText().toString());
    }
}
