package p000;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

public final class dim extends jzl implements OnClickListener, OnCheckedChangeListener {
    itl aj;
    private jca ak;
    private CheckBox al;
    private TextView ap;
    private final dgg aq = dgg.m11692a();
    private final din ar = new din(this);

    protected void mo973f(Bundle bundle) {
        super.mo973f(bundle);
        this.ak = (jca) this.an.m25443a(jca.class);
    }

    public Dialog mo792a(Bundle bundle) {
        this.aj = this.aq.m11694a(getArguments().getString("key_participant_id"));
        Activity activity = getActivity();
        Builder builder = new Builder(activity);
        Resources resources = activity.getResources();
        View inflate = View.inflate(activity, gwb.gB, null);
        builder.setView(inflate);
        builder.setPositiveButton(resources.getString(bc.hR), this);
        builder.setNegativeButton(resources.getString(bc.f2931O), this);
        this.ap = (TextView) inflate.findViewById(ba.bz);
        gwb.m1818a(this.ap, activity, resources, "https://www.google.com/support/hangouts/?hl=%locale%", "blocking", bc.dl);
        this.al = (CheckBox) inflate.findViewById(ba.bA);
        this.al.setOnCheckedChangeListener(this);
        this.ap.setVisibility(8);
        ((TextView) inflate.findViewById(ba.bN)).setText(Html.fromHtml(resources.getString(bc.dU, new Object[]{this.aj.m23232b()})));
        ((TextView) inflate.findViewById(ba.bM)).setText(Html.fromHtml(resources.getString(bc.dT, new Object[]{this.aj.m23232b()})));
        return builder.create();
    }

    public void onStart() {
        super.onStart();
        gwb.m2198f(671);
        this.aq.m11701a(this.ar);
    }

    public void onStop() {
        super.onStop();
        this.aq.m11705b(this.ar);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            gwb.m2198f(349);
            inx.m22408a().m22413a(this.aj.m23229a());
            dw dwVar = (HangoutActivity) getActivity();
            if (this.al.isChecked()) {
                gwb.m2198f(263);
                gwb.m1832a(dwVar, fde.m15018e(this.ak.mo2317a()), this.aj.m23232b(), this.aj.m23244g(), null, false);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.ap.setVisibility(z ? 0 : 8);
    }
}
