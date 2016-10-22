import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cfk implements OnCancelListener {
    final /* synthetic */ cdr a;

    cfk(cdr cdr) {
        this.a = cdr;
    }

    public void onCancel(DialogInterface dialogInterface) {
        bpd a = this.a.i.a();
        String str = a != null ? a.a : null;
        if (this.a.bs != null) {
            this.a.bs.a(str);
        }
        if (str != null && this.a.isEmpty()) {
            RealTimeChatService.a(this.a.av, str, this.a.be);
        }
    }
}
