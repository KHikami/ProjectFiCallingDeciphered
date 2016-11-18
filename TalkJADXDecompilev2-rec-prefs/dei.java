package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dei implements OnClickListener {
    final /* synthetic */ int f9556a;
    final /* synthetic */ deh f9557b;

    dei(deh deh, int i) {
        this.f9557b = deh;
        this.f9556a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f9557b.m7002a();
        RealTimeChatService.m9087c(this.f9556a, fyx.m16648b(ded.f9551a));
        this.f9557b.getActivity().finish();
        gwb.m1445R();
    }
}
