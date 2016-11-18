package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class jnk extends jzl implements OnClickListener {
    private jmo aj;
    private jcf ak;
    private ljp al;

    public static void m24752a(ed edVar, String str, int[] iArr, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putIntArray("account_ids", iArr);
        bundle.putBoolean("add_account_enabled", z);
        bundle.putBoolean("canceled_on_outside_touch", z2);
        jnk jnk = new jnk();
        jnk.setArguments(bundle);
        jnk.mo2341a(edVar, "account.selector");
    }

    protected void mo973f(Bundle bundle) {
        super.mo973f(bundle);
        this.aj = (jmo) this.an.m25443a(jmo.class);
        this.ak = (jcf) this.an.m25443a(jcf.class);
        this.al = (ljp) this.an.m25454b(ljp.class);
    }

    public Dialog mo792a(Bundle bundle) {
        OnClickListener a;
        Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), gwb.zr);
        Bundle arguments = getArguments();
        CharSequence string = arguments.getString("title");
        int[] intArray = arguments.getIntArray("account_ids");
        boolean z = arguments.getBoolean("add_account_enabled");
        boolean z2 = arguments.getBoolean("canceled_on_outside_touch");
        if (this.al != null) {
            a = this.al.m29180a((OnClickListener) this, "AccountSelection");
        }
        Dialog b = new up(contextThemeWrapper).a(string).a(new jnj(contextThemeWrapper, intArray, z), a).a(false).b();
        b.setCanceledOnTouchOutside(z2);
        return b;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int[] intArray = getArguments().getIntArray("account_ids");
        jmo jmo = (jmo) this.an.m25443a(jmo.class);
        Object obj = (getArguments().getBoolean("add_account_enabled") && i == intArray.length) ? 1 : null;
        if (obj == null) {
            int i2 = intArray[i];
            if (this.ak.mo3467c(i2)) {
                jch a = this.ak.mo3456a(i2);
                jmo.mo3566a(a.mo3440b("account_name"), a.mo3440b("effective_gaia_id"));
                return;
            }
            jmo.mo3569c();
            return;
        }
        jmo.mo3567b();
    }

    public void onCancel(DialogInterface dialogInterface) {
        Object obj;
        if (this.al != null) {
            this.al.m29183b("AccountSelectionDialogFragment$onCancel");
            obj = 1;
        } else {
            obj = null;
        }
        try {
            this.aj.mo3569c();
        } finally {
            if (obj != null) {
                lkb.m29210b("AccountSelectionDialogFragment$onCancel");
            }
        }
    }
}
