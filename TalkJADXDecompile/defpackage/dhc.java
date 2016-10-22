package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

/* renamed from: dhc */
public final class dhc extends dq implements OnClickListener {
    itl aj;
    private final dgg ak;
    private final dhd al;

    public dhc() {
        this.ak = dgg.a();
        this.al = new dhd(this);
    }

    public Dialog a(Bundle bundle) {
        this.aj = this.ak.a(getArguments().getString("key_participant_id"));
        Context activity = getActivity();
        Builder builder = new Builder(activity);
        Resources resources = activity.getResources();
        View inflate = View.inflate(activity, gwb.gx, null);
        builder.setView(inflate);
        builder.setPositiveButton(resources.getString(bc.hR), this);
        builder.setNegativeButton(resources.getString(bc.O), this);
        ((TextView) inflate.findViewById(ba.bH)).setText(Html.fromHtml(resources.getString(bc.dt, new Object[]{this.aj.b()})));
        ((TextView) inflate.findViewById(ba.bG)).setText(Html.fromHtml(resources.getString(bc.ds, new Object[]{this.aj.b()})));
        dgg.a();
        return builder.create();
    }

    public void onStart() {
        super.onStart();
        this.ak.a(this.al);
    }

    public void onStop() {
        super.onStop();
        this.ak.b(this.al);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dgg.a();
        if (i == -1) {
            this.ak.c(this.aj.a());
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }
}
