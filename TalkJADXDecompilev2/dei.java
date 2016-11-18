package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dei implements OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ deh b;

    dei(deh deh, int i) {
        this.b = deh;
        this.a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.a();
        RealTimeChatService.c(this.a, fyx.b(ded.a));
        this.b.getActivity().finish();
        gwb.R();
    }
}
