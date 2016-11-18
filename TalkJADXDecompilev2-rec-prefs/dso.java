package p000;

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

    protected void mo973f(Bundle bundle) {
        super.mo973f(bundle);
        this.aj = (jca) this.an.m25443a(jca.class);
    }

    public void onStart() {
        super.onStart();
        if (m7009c() != null) {
            int i = 350;
            if (getResources().getConfiguration().orientation == 2) {
                i = 600;
            }
            giv.m17743a(getActivity(), m7009c().getWindow(), i, -2);
        }
    }

    public Dialog mo792a(Bundle bundle) {
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
        bko e = fde.m15018e(this.aj.mo2317a());
        bko a = fde.m14992a(e);
        Context context = this.am;
        boolean a2 = dak.m11383a(string3);
        bbm bbm = (bbm) jyn.m25426a(context, bbm.class);
        if (((fzw) jyn.m25426a(context, fzw.class)).mo2146a(e.m5638g())) {
            i = dsm.f10449a;
        } else {
            Object obj = fde.m15005a(false, true).length > 0 ? 1 : null;
            if (a2 || bbm.mo444d(e.m5638g()) || obj == null || a != null) {
                i = dsm.f10451c;
            } else {
                i = dsm.f10450b;
            }
        }
        boolean z = i == dsm.f10450b || i == dsm.f10449a;
        if (z) {
            button.setText(this.am.getString(ba.lM));
            textView2.setVisibility(8);
        } else {
            String string4;
            if (dak.m11383a(string3)) {
                string4 = this.am.getString(ba.lQ);
            } else if (glq.m18021e(gwb.m1400H(), string3) == null) {
                glk.m17982e("Babel_OffnetworkInvite", "Couldn't get valid invite message", new Object[0]);
                string4 = null;
            } else if (dsk == dsk.PEOPLE_LIST) {
                string4 = this.am.getString(ba.lS);
            } else {
                string4 = this.am.getString(ba.lY);
            }
            textView2.setText(string4);
        }
        switch (dst.f10471a[dsk.ordinal()]) {
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
            Context H = gwb.m1400H();
            if (TextUtils.isEmpty(string2)) {
                str = string3;
            } else {
                charSequence = string2;
            }
            if (!TextUtils.isEmpty(glq.m18038i(H, str))) {
                switch (dst.f10471a[dsk.ordinal()]) {
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
            switch (dst.f10471a[dsk.ordinal()]) {
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
        String e2 = glq.m18021e(gwb.m1400H(), string3);
        if (dsk != dsk.PEOPLE_LIST || dak.m11383a(string3)) {
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
        bko e3 = fde.m15018e(((jca) this.an.m25443a(jca.class)).mo2317a());
        if (!z) {
            switch (dst.f10471a[dsk.ordinal()]) {
                case 1:
                    gwb.m1823a(e3, 1857);
                    break;
                case 2:
                    gwb.m1823a(e3, 1854);
                    break;
                case 3:
                    gwb.m1823a(e3, 2618);
                    break;
                case 4:
                    gwb.m1823a(e3, 1856);
                    break;
                case 5:
                    gwb.m1823a(e3, 2332);
                    break;
                case 6:
                    gwb.m1823a(e3, 2263);
                    break;
                default:
                    break;
            }
        }
        switch (dst.f10471a[dsk.ordinal()]) {
            case 1:
                gwb.m1823a(e3, 1864);
                break;
            case 2:
                gwb.m1823a(e3, 1862);
                break;
            case 3:
                gwb.m1823a(e3, 2620);
                break;
            case 4:
                gwb.m1823a(e3, 1863);
                break;
            case 5:
                gwb.m1823a(e3, 2334);
                break;
            case 6:
                gwb.m1823a(e3, 2442);
                break;
        }
        return builder.create();
    }

    static /* synthetic */ void m12623a(dso dso, boolean z, dsk dsk, String str, String str2, int i) {
        if (dso.m7009c() != null) {
            dso.m7009c().dismiss();
        }
        bko e = fde.m15018e(((jca) dso.an.m25443a(jca.class)).mo2317a());
        if (!z) {
            switch (dst.f10471a[dsk.ordinal()]) {
                case 1:
                    gwb.m1823a(e, 1861);
                    break;
                case 2:
                    gwb.m1823a(e, 1858);
                    break;
                case 3:
                    gwb.m1823a(e, 2619);
                    break;
                case 4:
                    gwb.m1823a(e, 1860);
                    break;
                case 5:
                    gwb.m1823a(e, 2333);
                    break;
                case 6:
                    gwb.m1823a(e, 2264);
                    break;
                default:
                    break;
            }
        }
        switch (dst.f10471a[dsk.ordinal()]) {
            case 1:
                gwb.m1823a(e, 1867);
                break;
            case 2:
                gwb.m1823a(e, 1865);
                break;
            case 3:
                gwb.m1823a(e, 2621);
                break;
            case 4:
                gwb.m1823a(e, 1866);
                break;
            case 5:
                gwb.m1823a(e, 2335);
                break;
            case 6:
                gwb.m1823a(e, 2442);
                break;
        }
        new dsl(dso.am, str, str2).m12615a(dso.am, i);
    }
}
