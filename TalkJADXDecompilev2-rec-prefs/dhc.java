package p000;

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

public final class dhc extends dq implements OnClickListener {
    itl aj;
    private final dgg ak = dgg.m11692a();
    private final dhd al = new dhd(this);

    public Dialog mo792a(Bundle bundle) {
        this.aj = this.ak.m11694a(getArguments().getString("key_participant_id"));
        Context activity = getActivity();
        Builder builder = new Builder(activity);
        Resources resources = activity.getResources();
        View inflate = View.inflate(activity, gwb.gx, null);
        builder.setView(inflate);
        builder.setPositiveButton(resources.getString(bc.hR), this);
        builder.setNegativeButton(resources.getString(bc.f2931O), this);
        ((TextView) inflate.findViewById(ba.bH)).setText(Html.fromHtml(resources.getString(bc.dt, new Object[]{this.aj.m23232b()})));
        ((TextView) inflate.findViewById(ba.bG)).setText(Html.fromHtml(resources.getString(bc.ds, new Object[]{this.aj.m23232b()})));
        dgg.m11692a();
        return builder.create();
    }

    public void onStart() {
        super.onStart();
        this.ak.m11701a(this.al);
    }

    public void onStop() {
        super.onStop();
        this.ak.m11705b(this.al);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dgg.m11692a();
        if (i == -1) {
            this.ak.m11709c(this.aj.m23229a());
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }
}
