package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cfk implements OnCancelListener {
    final /* synthetic */ cdr f5182a;

    cfk(cdr cdr) {
        this.f5182a = cdr;
    }

    public void onCancel(DialogInterface dialogInterface) {
        bpd a = this.f5182a.f5106i.mo931a();
        String str = a != null ? a.f4146a : null;
        if (this.f5182a.bs != null) {
            this.f5182a.bs.mo1166a(str);
        }
        if (str != null && this.f5182a.isEmpty()) {
            RealTimeChatService.m9019a(this.f5182a.av, str, this.f5182a.be);
        }
    }
}
