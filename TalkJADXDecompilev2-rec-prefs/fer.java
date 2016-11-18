package p000;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Telephony.Threads;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fer extends fhb {
    private final String f12933a;
    private final long f12934b;

    public fer(bko bko, String str, long j) {
        super(bko);
        this.f12933a = str;
        this.f12934b = j;
    }

    public void w_() {
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        boolean b = blo.m5883b(this.f12933a);
        if (this.f12934b <= 0 || b || blo.m6055g(this.f12933a) == 2 || blo.m6102s(this.f12933a) == 1) {
            long V;
            if (b) {
                V = blo.m5930V(this.f12933a);
            } else {
                V = -1;
            }
            blo.m5958a();
            try {
                if (!blo.m5871a(this.f12933a)) {
                    new fes(this.f12933a, this.f12934b, null).m15170a((fhb) this);
                    blo.m5995a(this.f12933a, true);
                } else if (b || this.f12934b < 0) {
                    blo.m6035c(this.f12933a, Long.MAX_VALUE);
                } else {
                    blo.m5995a(this.f12933a, true);
                    blo.m6082l(this.f12933a, 2);
                }
                blf.m5820d(blo);
                blo.m6015b();
                if (V != -1) {
                    Uri uri;
                    if (VERSION.SDK_INT >= 19) {
                        uri = Threads.CONTENT_URI;
                    } else {
                        uri = Uri.withAppendedPath(Uri.parse("content://mms-sms/"), "conversations");
                    }
                    gwb.m1400H().getContentResolver().delete(ContentUris.withAppendedId(uri, V), null, null);
                }
                if (blo.m5871a(this.f12933a)) {
                    lpj lpj = new lpj();
                    lpj.responseHeader = new luq();
                    lpj.responseHeader.f26515a = Integer.valueOf(1);
                    RealTimeChatService.m8997a(m8044j(), this.f5736c.f12722b, new fiu(m8044j(), 1, new ewm(lpj)));
                }
            } finally {
                blo.m6028c();
            }
        } else {
            int i = this.f5736c.f12721a;
            String valueOf = String.valueOf(glk.m17974b(this.f12933a));
            int g = blo.m6055g(this.f12933a);
            glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 208).append("Tried to delete a Hangouts group conversation, but they are not deletable.\n\tAccountIndex: ").append(i).append("\n\tConversationId: ").append(valueOf).append("\n\tisSmsConv: false\n\tConversationTransportType: ").append(g).append("\n\tConversationType: ").append(blo.m6102s(this.f12933a)).toString(), new Object[0]);
            throw new IllegalArgumentException("Hangouts group conversations are not deletable");
        }
    }
}
