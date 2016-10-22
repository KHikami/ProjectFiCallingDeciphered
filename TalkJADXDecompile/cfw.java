import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

final class cfw implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ cdr c;

    cfw(cdr cdr, String str, long j) {
        this.c = cdr;
        this.a = str;
        this.b = j;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = null;
        if (i == 0) {
            cdr cdr = this.c;
            String str2 = this.a;
            long j = this.b;
            Iterable m = gwb.m(str2);
            if (m != null) {
                String str3;
                Iterator it = m.iterator();
                if (it.hasNext()) {
                    str3 = (String) it.next();
                } else {
                    str3 = null;
                }
                if (it.hasNext()) {
                    str2 = (String) it.next();
                    str = str3;
                } else {
                    str2 = null;
                    str = str3;
                }
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    RealTimeChatService.a(cdr.av.g(), str, fyi.a(str2, "UTF-8"), j, false);
                }
            }
        } else if (i == 1) {
            cdr cdr2 = this.c;
            long j2 = this.b;
            RealTimeChatService.a(cdr2.av, new long[]{j2});
        }
    }
}
