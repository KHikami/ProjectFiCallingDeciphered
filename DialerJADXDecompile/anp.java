import android.content.Context;
import android.content.Intent;
import android.telecom.PhoneAccountHandle;

/* compiled from: PG */
final class anp extends ann {
    private /* synthetic */ String a;
    private /* synthetic */ PhoneAccountHandle b;

    anp(String str, PhoneAccountHandle phoneAccountHandle) {
        this.a = str;
        this.b = phoneAccountHandle;
    }

    public final Intent a(Context context) {
        arq arq = new arq(this.a);
        arq.b = this.b;
        arq.a = 7;
        arq.c = true;
        return arq.a();
    }
}
