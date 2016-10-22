package defpackage;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

/* compiled from: PG */
/* renamed from: aje */
final class aje extends Handler {
    private /* synthetic */ ajd a;

    aje(ajd ajd) {
        this.a = ajd;
    }

    public final void handleMessage(Message message) {
        if (message.arg1 == 1) {
            Toast.makeText(this.a.a, buf.fa, 1).show();
        }
    }
}
