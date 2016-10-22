package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.android.contacts.common.vcard.CancelActivity;
import com.android.contacts.common.vcard.VCardService;

/* compiled from: PG */
/* renamed from: ajb */
public final class ajb implements OnClickListener {
    private /* synthetic */ CancelActivity a;

    public ajb(CancelActivity cancelActivity) {
        this.a = cancelActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.bindService(new Intent(this.a, VCardService.class), this.a, 1);
    }
}
