package p000;

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

public final class gbg {
    final Context f14584a;
    final StatusMessageSettingsFragment f14585b;
    final bko f14586c;
    final ero f14587d;
    EditText f14588e;
    TextView f14589f;
    View f14590g;
    Button f14591h;
    AccessibilityManager f14592i;
    private final TextWatcher f14593j = new gbj(this);

    gbg(Context context, lfd lfd, StatusMessageSettingsFragment statusMessageSettingsFragment, ero ero) {
        this.f14584a = context;
        this.f14585b = statusMessageSettingsFragment;
        this.f14586c = fde.m15018e(lfd.mo3691a());
        this.f14587d = ero;
    }

    public void m16846a(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(activity.getResources().getColor(gwb.et));
        }
    }

    public View m16845a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Spannable a;
        View inflate = layoutInflater.inflate(gwb.hx, viewGroup, false);
        this.f14588e = (EditText) inflate.findViewById(ba.fu);
        this.f14589f = (TextView) inflate.findViewById(ba.fs);
        this.f14590g = inflate.findViewById(ba.ft);
        this.f14591h = (Button) inflate.findViewById(ba.fw);
        Button button = (Button) inflate.findViewById(ba.fv);
        ((AvatarView) inflate.findViewById(ba.dl)).m9238a(this.f14586c.m5647p(), this.f14586c.m5634c(), this.f14586c);
        this.f14588e.addTextChangedListener(this.f14593j);
        if (giw.m17759d(this.f14584a)) {
            this.f14585b.getActivity().getWindow().setSoftInputMode(2);
        }
        if (bundle != null) {
            string = bundle.getString("saved_text");
        } else {
            string = this.f14585b.getActivity().getIntent().getStringExtra("status_message");
        }
        if (string != null) {
            a = gld.m17922a(Html.fromHtml(string));
        } else {
            a = new SpannableString("");
        }
        gob.m18199a(this.f14584a).mo2308a(a, null, this.f14588e);
        this.f14588e.setText(a);
        this.f14588e.setSelection(a.length());
        this.f14592i = (AccessibilityManager) this.f14584a.getSystemService("accessibility");
        TextView textView = (TextView) inflate.findViewById(ba.dm);
        textView.setText(this.f14584a.getResources().getString(bc.gm, new Object[]{"🙋"}));
        this.f14591h.setOnClickListener(new gbh(this));
        button.setOnClickListener(new gbi(this));
        return inflate;
    }

    public void m16847a(Bundle bundle) {
        bundle.putString("saved_text", this.f14588e.getText().toString());
    }
}
