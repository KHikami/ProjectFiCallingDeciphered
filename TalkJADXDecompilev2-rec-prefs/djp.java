package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

public final class djp extends jzl implements OnClickListener, OnCheckedChangeListener {
    private boolean aj;
    private Button ak;
    private CheckBox al;

    public Dialog mo792a(Bundle bundle) {
        Builder builder = new Builder(getActivity());
        this.aj = gwb.m1923a(fde.m15018e(((jca) this.an.m25443a(jca.class)).mo2317a()), bnc.HANGOUTS_ON_AIR);
        if (this.aj) {
            builder.setTitle(bc.eV);
            View inflate = View.inflate(getActivity(), gwb.gC, null);
            builder.setView(inflate);
            ((TextView) inflate.findViewById(ba.cq)).setText(Html.fromHtml(getResources().getString(bc.eU)));
            this.al = (CheckBox) inflate.findViewById(ba.cp);
            this.al.setOnCheckedChangeListener(this);
            Resources resources = getActivity().getResources();
            builder.setPositiveButton(resources.getString(bc.iA), this);
            builder.setNegativeButton(resources.getString(bc.f2931O), this);
        } else {
            builder.setTitle(bc.eV);
            builder.setMessage(bc.dC);
            builder.setNeutralButton(getResources().getString(bc.hR), this);
        }
        return builder.create();
    }

    public void onStart() {
        super.onStart();
        AlertDialog alertDialog = (AlertDialog) m7009c();
        if (this.aj) {
            this.ak = alertDialog.getButton(-1);
            onCheckedChanged(this.al, this.al.isChecked());
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            ((HangoutActivity) getActivity()).m8569o().m8591r();
        } else {
            onCancel(dialogInterface);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        ((HangoutActivity) getActivity()).m8570p();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.ak.setEnabled(z);
    }
}
