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
    static dng a(lym lym) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("key_participant", nzf.a((nzf) lym));
        dng dng = new dng();
        dng.setArguments(bundle);
        return dng;
    }

    public Dialog a(Bundle bundle) {
        lym q = q();
        if (q == null) {
            return null;
        }
        CharSequence string;
        String str = "Babel";
        String str2 = "Showing knocking dialog for participant ";
        String valueOf = String.valueOf(q.b);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.a(str, valueOf, new Object[0]);
        gwb.f(1497);
        Context activity = getActivity();
        Resources resources = activity.getResources();
        View inflate = View.inflate(activity, gwb.qh, null);
        if (!TextUtils.isEmpty(q.c) || gwb.a(q.n) == 5) {
            boolean z = false;
        } else {
            int i = 1;
        }
        TextView textView = (TextView) inflate.findViewById(gwb.qf);
        CharSequence charSequence = q.d;
        CharSequence c = ((dnc) jyn.a(getActivity(), dnc.class)).c();
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
            avatarView.a(q.e, q.d, gwb.v());
            avatarView.a(0);
            avatarView.b(2);
            avatarView.c(0);
        }
        textView = (TextView) inflate.findViewById(gwb.qd);
        TextView textView2 = (TextView) inflate.findViewById(gwb.qe);
        if (!TextUtils.isEmpty(q.w)) {
            textView.setText(resources.getString(ba.lk));
            textView2.setText(resources.getString(ba.lj, new Object[]{q.w}));
            textView.setVisibility(0);
            textView2.setVisibility(0);
        }
        b(false);
        return new Builder(activity).setView(inflate).setPositiveButton(resources.getString(ba.lf), this).setNegativeButton(resources.getString(ba.li), this).setCancelable(false).create();
    }

    public void onStart() {
        super.onStart();
        ((AlertDialog) c()).setCanceledOnTouchOutside(false);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dna dna = (dna) jyn.a(getActivity(), dna.class);
        lym q = q();
        if (q != null) {
            String str;
            String str2;
            String valueOf;
            switch (i) {
                case -2:
                    str = "Babel";
                    str2 = "Reject button clicked for knocking participant ";
                    valueOf = String.valueOf(q.b);
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    glk.c(str, valueOf, new Object[0]);
                    gwb.f(1499);
                    dna.b(q);
                case -1:
                    str = "Babel";
                    str2 = "Accept button clicked for knocking participant ";
                    valueOf = String.valueOf(q.b);
                    glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    gwb.f(1498);
                    dna.a(q);
                default:
                    iil.a("Unrecognized button click");
            }
        }
    }

    private lym q() {
        try {
            nzf lym = new lym();
            nzf.a(lym, getArguments().getByteArray("key_participant"));
            return lym;
        } catch (nzd e) {
            iil.a("Invalid participant supplied to knocking dialog");
            a();
            return null;
        }
    }
}
