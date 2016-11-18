package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

final class cfw implements OnClickListener {
    final /* synthetic */ String f5210a;
    final /* synthetic */ long f5211b;
    final /* synthetic */ cdr f5212c;

    cfw(cdr cdr, String str, long j) {
        this.f5212c = cdr;
        this.f5210a = str;
        this.f5211b = j;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = null;
        if (i == 0) {
            cdr cdr = this.f5212c;
            String str2 = this.f5210a;
            long j = this.f5211b;
            Iterable m = gwb.m2298m(str2);
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
                    RealTimeChatService.m9004a(cdr.av.m5638g(), str, fyi.m16616a(str2, "UTF-8"), j, false);
                }
            }
        } else if (i == 1) {
            cdr cdr2 = this.f5212c;
            long j2 = this.f5211b;
            RealTimeChatService.m9033a(cdr2.av, new long[]{j2});
        }
    }
}
