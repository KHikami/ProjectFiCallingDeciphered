package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class dso extends jzl {
    jca aj;

    protected void f(Bundle bundle) {
        super.f(bundle);
        this.aj = (jca) this.an.a(jca.class);
    }

    public void onStart() {
        super.onStart();
        if (c() != null) {
            int i = 350;
            if (getResources().getConfiguration().orientation == 2) {
                i = 600;
            }
            giv.a(getActivity(), c().getWindow(), i, -2);
        }
    }

    public Dialog a(Bundle bundle) {
        int i;
        int i2;
        CharSequence charSequence;
        String string = getArguments().getString("conversation_id");
        CharSequence string2 = getArguments().getString("name");
        String string3 = getArguments().getString("contact");
        dsk dsk = (dsk) getArguments().getSerializable("trigger_action");
        View inflate = getActivity().getLayoutInflater().inflate(gwb.rt, null);
        ImageView imageView = (ImageView) inflate.findViewById(gwb.rp);
        TextView textView = (TextView) inflate.findViewById(gwb.rr);
        TextView textView2 = (TextView) inflate.findViewById(gwb.ro);
        Button button = (Button) inflate.findViewById(gwb.rq);
        Button button2 = (Button) inflate.findViewById(gwb.rl);
        Button button3 = (Button) inflate.findViewById(gwb.rn);
        Button button4 = (Button) inflate.findViewById(gwb.rk);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(gwb.rm);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(gwb.rj);
        bko e = fde.e(this.aj.a());
        bko a = fde.a(e);
        Context context = this.am;
        boolean a2 = dak.a(string3);
        bbm bbm = (bbm) jyn.a(context, bbm.class);
        if (((fzw) jyn.a(context, fzw.class)).a(e.g())) {
            i = dsm.a;
        } else {
            Object obj = fde.a(false, true).length > 0 ? 1 : null;
            if (a2 || bbm.d(e.g()) || obj == null || a != null) {
                i = dsm.c;
            } else {
                i = dsm.b;
            }
        }
        boolean z = i == dsm.b || i == dsm.a;
        if (z) {
            button.setText(this.am.getString(ba.lM));
            textView2.setVisibility(8);
        } else {
            String string4;
            if (dak.a(string3)) {
                string4 = this.am.getString(ba.lQ);
            } else if (glq.e(gwb.H(), string3) == null) {
                glk.e("Babel_OffnetworkInvite", "Couldn't get valid invite message", new Object[0]);
                string4 = null;
            } else if (dsk == dsk.PEOPLE_LIST) {
                string4 = this.am.getString(ba.lS);
            } else {
                string4 = this.am.getString(ba.lY);
            }
            textView2.setText(string4);
        }
        switch (dst.a[dsk.ordinal()]) {
            case 1:
                i2 = gwb.rh;
                break;
            case 2:
            case 3:
                i2 = gwb.ri;
                break;
            default:
                i2 = gwb.rg;
                break;
        }
        imageView.setImageResource(i2);
        if (!z) {
            String str;
            Context H = gwb.H();
            if (TextUtils.isEmpty(string2)) {
                str = string3;
            } else {
                charSequence = string2;
            }
            if (!TextUtils.isEmpty(glq.i(H, str))) {
                switch (dst.a[dsk.ordinal()]) {
                    case 1:
                        charSequence = this.am.getString(ba.lZ, new Object[]{charSequence});
                        break;
                    case 2:
                        charSequence = this.am.getString(ba.mb, new Object[]{charSequence});
                        break;
                    case 3:
                        charSequence = this.am.getString(ba.lO, new Object[]{charSequence});
                        break;
                    default:
                        charSequence = this.am.getString(ba.ma, new Object[]{charSequence});
                        break;
                }
            }
            charSequence = this.am.getString(ba.mc);
        } else {
            switch (dst.a[dsk.ordinal()]) {
                case 1:
                    charSequence = this.am.getString(ba.lV);
                    break;
                case 2:
                    charSequence = this.am.getString(ba.lX);
                    break;
                case 3:
                    charSequence = this.am.getString(ba.lU);
                    break;
                default:
                    charSequence = this.am.getString(ba.lW);
                    break;
            }
        }
        textView.setText(charSequence);
        textView.setMovementMethod(new ScrollingMovementMethod());
        button.setAllCaps(true);
        button3.setAllCaps(true);
        button2.setAllCaps(true);
        button4.setAllCaps(true);
        String e2 = glq.e(gwb.H(), string3);
        if (dsk != dsk.PEOPLE_LIST || dak.a(string3)) {
            linearLayout2.setVisibility(8);
            button.setOnClickListener(new dsr(this, z, dsk, string3, string, i));
            button3.setOnClickListener(new dss(this));
        } else {
            linearLayout.setVisibility(8);
            button2.setOnClickListener(new dsp(this, z, dsk, string3, string, i));
            button4.setOnClickListener(new dsq(this, e2));
        }
        Builder builder = new Builder(getActivity());
        builder.setView(inflate);
        bko e3 = fde.e(((jca) this.an.a(jca.class)).a());
        if (!z) {
            switch (dst.a[dsk.ordinal()]) {
                case 1:
                    gwb.a(e3, 1857);
                    break;
                case 2:
                    gwb.a(e3, 1854);
                    break;
                case 3:
                    gwb.a(e3, 2618);
                    break;
                case 4:
                    gwb.a(e3, 1856);
                    break;
                case 5:
                    gwb.a(e3, 2332);
                    break;
                case 6:
                    gwb.a(e3, 2263);
                    break;
                default:
                    break;
            }
        }
        switch (dst.a[dsk.ordinal()]) {
            case 1:
                gwb.a(e3, 1864);
                break;
            case 2:
                gwb.a(e3, 1862);
                break;
            case 3:
                gwb.a(e3, 2620);
                break;
            case 4:
                gwb.a(e3, 1863);
                break;
            case 5:
                gwb.a(e3, 2334);
                break;
            case 6:
                gwb.a(e3, 2442);
                break;
        }
        return builder.create();
    }

    static /* synthetic */ void a(dso dso, boolean z, dsk dsk, String str, String str2, int i) {
        if (dso.c() != null) {
            dso.c().dismiss();
        }
        bko e = fde.e(((jca) dso.an.a(jca.class)).a());
        if (!z) {
            switch (dst.a[dsk.ordinal()]) {
                case 1:
                    gwb.a(e, 1861);
                    break;
                case 2:
                    gwb.a(e, 1858);
                    break;
                case 3:
                    gwb.a(e, 2619);
                    break;
                case 4:
                    gwb.a(e, 1860);
                    break;
                case 5:
                    gwb.a(e, 2333);
                    break;
                case 6:
                    gwb.a(e, 2264);
                    break;
                default:
                    break;
            }
        }
        switch (dst.a[dsk.ordinal()]) {
            case 1:
                gwb.a(e, 1867);
                break;
            case 2:
                gwb.a(e, 1865);
                break;
            case 3:
                gwb.a(e, 2621);
                break;
            case 4:
                gwb.a(e, 1866);
                break;
            case 5:
                gwb.a(e, 2335);
                break;
            case 6:
                gwb.a(e, 2442);
                break;
        }
        new dsl(dso.am, str, str2).a(dso.am, i);
    }
}
