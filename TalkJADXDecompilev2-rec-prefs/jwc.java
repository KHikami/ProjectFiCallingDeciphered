package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class jwc implements OnClickListener {
    final /* synthetic */ jwb f21155a;

    jwc(jwb jwb) {
        this.f21155a = jwb;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f21155a.f14150a = i;
        this.f21155a.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
