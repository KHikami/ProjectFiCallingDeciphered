package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;

public final class dng extends jzl implements OnClickListener {
    static dng m12278a(lym lym) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("key_participant", nzf.m1029a((nzf) lym));
        dng dng = new dng();
        dng.setArguments(bundle);
        return dng;
    }

    public Dialog mo792a(Bundle bundle) {
        lym q = m12279q();
        if (q == null) {
            return null;
        }
        CharSequence string;
        String str = "Babel";
        String str2 = "Showing knocking dialog for participant ";
        String valueOf = String.valueOf(q.f26907b);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.m17970a(str, valueOf, new Object[0]);
        gwb.m2198f(1497);
        Context activity = getActivity();
        Resources resources = activity.getResources();
        View inflate = View.inflate(activity, gwb.qh, null);
        if (!TextUtils.isEmpty(q.f26908c) || gwb.m1507a(q.f26919n) == 5) {
            boolean z = false;
        } else {
            int i = 1;
        }
        TextView textView = (TextView) inflate.findViewById(gwb.qf);
        CharSequence charSequence = q.f26909d;
        CharSequence c = ((dnc) jyn.m25426a(getActivity(), dnc.class)).mo1627c();
        if (TextUtils.isEmpty(charSequence)) {
            boolean z2 = false;
        } else {
            int i2 = 1;
        }
        if (TextUtils.isEmpty(c)) {
            boolean z3 = false;
        } else {
            int i3 = 1;
        }
        if (i != 0 && i2 != 0 && i3 != 0) {
            string = resources.getString(ba.lo, new Object[]{charSequence, c});
        } else if (i != 0 && i2 != 0) {
            string = resources.getString(ba.lp, new Object[]{charSequence});
        } else if (i2 != 0 && i3 != 0) {
            string = resources.getString(ba.ln, new Object[]{charSequence, c});
        } else if (i2 != 0) {
            string = resources.getString(ba.lq, new Object[]{charSequence});
        } else if (i3 != 0) {
            string = resources.getString(ba.lr, new Object[]{c});
        } else {
            string = resources.getString(ba.ls);
        }
        textView.setText(string);
        AvatarView avatarView = (AvatarView) inflate.findViewById(gwb.qc);
        if (i != 0) {
            avatarView.setVisibility(8);
        } else {
            avatarView.m9238a(q.f26910e, q.f26909d, gwb.m2370v());
            avatarView.m9231a(0);
            avatarView.m9242b(2);
            avatarView.m9244c(0);
        }
        textView = (TextView) inflate.findViewById(gwb.qd);
        TextView textView2 = (TextView) inflate.findViewById(gwb.qe);
        if (!TextUtils.isEmpty(q.f26928w)) {
            textView.setText(resources.getString(ba.lk));
            textView2.setText(resources.getString(ba.lj, new Object[]{q.f26928w}));
            textView.setVisibility(0);
            textView2.setVisibility(0);
        }
        m7008b(false);
        return new Builder(activity).setView(inflate).setPositiveButton(resources.getString(ba.lf), this).setNegativeButton(resources.getString(ba.li), this).setCancelable(false).create();
    }

    public void onStart() {
        super.onStart();
        ((AlertDialog) m7009c()).setCanceledOnTouchOutside(false);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dna dna = (dna) jyn.m25426a(getActivity(), dna.class);
        lym q = m12279q();
        if (q != null) {
            String str;
            String str2;
            String valueOf;
            switch (i) {
                case -2:
                    str = "Babel";
                    str2 = "Reject button clicked for knocking participant ";
                    valueOf = String.valueOf(q.f26907b);
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    glk.m17979c(str, valueOf, new Object[0]);
                    gwb.m2198f(1499);
                    dna.mo1613b(q);
                    return;
                case -1:
                    str = "Babel";
                    str2 = "Accept button clicked for knocking participant ";
                    valueOf = String.valueOf(q.f26907b);
                    glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    gwb.m2198f(1498);
                    dna.mo1611a(q);
                    return;
                default:
                    iil.m21870a("Unrecognized button click");
                    return;
            }
        }
    }

    private lym m12279q() {
        try {
            nzf lym = new lym();
            nzf.m1027a(lym, getArguments().getByteArray("key_participant"));
            return lym;
        } catch (nzd e) {
            iil.m21870a("Invalid participant supplied to knocking dialog");
            m7002a();
            return null;
        }
    }
}
