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
    private final dgg aq;
    private final din ar;

    public dim() {
        this.aq = dgg.a();
        this.ar = new din(this);
    }

    protected void f(Bundle bundle) {
        super.f(bundle);
        this.ak = (jca) this.an.a(jca.class);
    }

    public Dialog a(Bundle bundle) {
        this.aj = this.aq.a(getArguments().getString("key_participant_id"));
        Activity activity = getActivity();
        Builder builder = new Builder(activity);
        Resources resources = activity.getResources();
        View inflate = View.inflate(activity, gwb.gB, null);
        builder.setView(inflate);
        builder.setPositiveButton(resources.getString(bc.hR), this);
        builder.setNegativeButton(resources.getString(bc.O), this);
        this.ap = (TextView) inflate.findViewById(ba.bz);
        gwb.a(this.ap, activity, resources, "https://www.google.com/support/hangouts/?hl=%locale%", "blocking", bc.dl);
        this.al = (CheckBox) inflate.findViewById(ba.bA);
        this.al.setOnCheckedChangeListener(this);
        this.ap.setVisibility(8);
        ((TextView) inflate.findViewById(ba.bN)).setText(Html.fromHtml(resources.getString(bc.dU, new Object[]{this.aj.b()})));
        ((TextView) inflate.findViewById(ba.bM)).setText(Html.fromHtml(resources.getString(bc.dT, new Object[]{this.aj.b()})));
        return builder.create();
    }

    public void onStart() {
        super.onStart();
        gwb.f(671);
        this.aq.a(this.ar);
    }

    public void onStop() {
        super.onStop();
        this.aq.b(this.ar);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            gwb.f(349);
            inx.a().a(this.aj.a());
            dw dwVar = (HangoutActivity) getActivity();
            if (this.al.isChecked()) {
                gwb.f(263);
                gwb.a(dwVar, fde.e(this.ak.a()), this.aj.b(), this.aj.g(), null, false);
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
