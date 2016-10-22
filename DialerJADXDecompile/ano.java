import android.content.Context;
import android.content.Intent;
import android.telecom.PhoneAccountHandle;

/* compiled from: PG */
final class ano extends ann {
    private /* synthetic */ String a;
    private /* synthetic */ PhoneAccountHandle b;

    ano(String str, PhoneAccountHandle phoneAccountHandle) {
        this.a = str;
        this.b = phoneAccountHandle;
    }

    public final Intent a(Context context) {
        arq arq = new arq(this.a);
        arq.b = this.b;
        arq.a = 7;
        return arq.a();
    }
}
