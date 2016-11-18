package defpackage;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Telephony.Threads;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fer extends fhb {
    private final String a;
    private final long b;

    public fer(bko bko, String str, long j) {
        super(bko);
        this.a = str;
        this.b = j;
    }

    public void w_() {
        blo blo = new blo(gwb.H(), this.c.a);
        boolean b = blo.b(this.a);
        if (this.b <= 0 || b || blo.g(this.a) == 2 || blo.s(this.a) == 1) {
            long V;
            if (b) {
                V = blo.V(this.a);
            } else {
                V = -1;
            }
            blo.a();
            try {
                if (!blo.a(this.a)) {
                    new fes(this.a, this.b, null).a((fhb) this);
                    blo.a(this.a, true);
                } else if (b || this.b < 0) {
                    blo.c(this.a, Long.MAX_VALUE);
                } else {
                    blo.a(this.a, true);
                    blo.l(this.a, 2);
                }
                blf.d(blo);
                blo.b();
                if (V != -1) {
                    Uri uri;
                    if (VERSION.SDK_INT >= 19) {
                        uri = Threads.CONTENT_URI;
                    } else {
                        uri = Uri.withAppendedPath(Uri.parse("content://mms-sms/"), "conversations");
                    }
                    gwb.H().getContentResolver().delete(ContentUris.withAppendedId(uri, V), null, null);
                }
                if (blo.a(this.a)) {
                    lpj lpj = new lpj();
                    lpj.responseHeader = new luq();
                    lpj.responseHeader.a = Integer.valueOf(1);
                    RealTimeChatService.a(j(), this.c.b, new fiu(j(), 1, new ewm(lpj)));
                }
            } finally {
                blo.c();
            }
        } else {
            int i = this.c.a;
            String valueOf = String.valueOf(glk.b(this.a));
            int g = blo.g(this.a);
            glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 208).append("Tried to delete a Hangouts group conversation, but they are not deletable.\n\tAccountIndex: ").append(i).append("\n\tConversationId: ").append(valueOf).append("\n\tisSmsConv: false\n\tConversationTransportType: ").append(g).append("\n\tConversationType: ").append(blo.s(this.a)).toString(), new Object[0]);
            throw new IllegalArgumentException("Hangouts group conversations are not deletable");
        }
    }
}
