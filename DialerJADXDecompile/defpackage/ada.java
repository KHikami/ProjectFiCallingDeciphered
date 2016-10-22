package defpackage;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import com.android.contacts.common.vcard.ExportVCardActivity;
import com.android.contacts.common.vcard.ShareVCardActivity;
import java.io.Serializable;
import java.util.List;

/* compiled from: PG */
/* renamed from: ada */
final class ada implements OnClickListener {
    private /* synthetic */ ArrayAdapter a;
    private /* synthetic */ String b;
    private /* synthetic */ acy c;

    ada(acy acy, ArrayAdapter arrayAdapter, String str) {
        this.c = acy;
        this.a = arrayAdapter;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = true;
        int i2 = ((adc) this.a.getItem(i)).b;
        if (i2 == buf.fo || i2 == buf.fr) {
            boolean z2;
            Fragment fragment = this.c;
            int i3 = ((adc) this.a.getItem(i)).c;
            List a = afb.a(fragment.getActivity()).a(true);
            int size = a.size();
            if (size > 1) {
                Bundle bundle = new Bundle();
                bundle.putInt("resourceId", i2);
                bundle.putInt("subscriptionId", i3);
                FragmentManager fragmentManager = fragment.getFragmentManager();
                int i4 = buf.eC;
                Serializable serializable = aik.ACCOUNTS_CONTACT_WRITABLE;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("title_res_id", i4);
                bundle2.putSerializable("list_filter", serializable);
                bundle2.putBundle("extra_args", bundle);
                acs acs = new acs();
                acs.setArguments(bundle2);
                acs.setTargetFragment(fragment, 0);
                acs.show(fragmentManager, null);
                z2 = false;
            } else {
                agd agd;
                Context activity = fragment.getActivity();
                if (size == 1) {
                    agd = (agd) a.get(0);
                } else {
                    agd = null;
                }
                aig.a(activity, i2, agd, abw.b() ? i3 : -1);
                z2 = true;
            }
            z = z2;
        } else if (i2 == buf.eR) {
            r0 = new Intent(this.c.getActivity(), ExportVCardActivity.class);
            r0.putExtra("CALLING_ACTIVITY", this.b);
            this.c.getActivity().startActivity(r0);
        } else if (i2 != buf.gk) {
            String str = "ImportExportDialogFragment";
            String str2 = "Unexpected resource: ";
            String valueOf = String.valueOf(this.c.getActivity().getResources().getResourceEntryName(i2));
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (acy.a == 0) {
            this.c.b();
        } else {
            r0 = new Intent(this.c.getActivity(), ShareVCardActivity.class);
            r0.putExtra("CALLING_ACTIVITY", this.b);
            this.c.getActivity().startActivity(r0);
        }
        if (z) {
            dialogInterface.dismiss();
        }
    }
}
