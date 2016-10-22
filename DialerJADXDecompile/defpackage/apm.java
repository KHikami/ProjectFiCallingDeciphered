package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import com.android.dialer.app.contact.ContactUpdateService;
import java.util.List;

/* compiled from: PG */
/* renamed from: apm */
public final class apm extends DialogFragment implements OnClickListener, OnDismissListener {
    private int a;
    private ListAdapter b;
    private List c;
    private int d;
    private boolean e;

    public final Dialog onCreateDialog(Bundle bundle) {
        Context activity = getActivity();
        this.c = getArguments().getParcelableArrayList("phoneList");
        this.a = getArguments().getInt("interactionType");
        this.d = getArguments().getInt("callInitiation");
        this.e = getArguments().getBoolean("is_video_call");
        this.b = new app(activity, this.c, this.a);
        return new Builder(activity).setAdapter(this.b, this).setTitle(this.a == 2 ? cob.cS : cob.bj).setView(activity.getLayoutInflater().inflate(buf.hM, null)).create();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context activity = getActivity();
        if (activity != null) {
            AlertDialog alertDialog = (AlertDialog) dialogInterface;
            if (this.c.size() <= i || i < 0) {
                dialogInterface.dismiss();
                return;
            }
            apn apn = (apn) this.c.get(i);
            if (((CheckBox) alertDialog.findViewById(aq.bq)).isChecked()) {
                long j = apn.a;
                Intent intent = new Intent(activity, ContactUpdateService.class);
                intent.putExtra("phone_number_data_id", j);
                activity.startService(intent);
            }
            apl.a(activity, apn.b, this.a, this.e, this.d);
        }
    }
}
