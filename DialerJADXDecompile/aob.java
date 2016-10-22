import android.content.Context;
import android.telecom.PhoneAccountHandle;

/* compiled from: PG */
public abstract class aob {
    public final Context a;
    public boolean b;
    public boolean c;

    public abstract String a(PhoneAccountHandle phoneAccountHandle);

    public abstract boolean a(PhoneAccountHandle phoneAccountHandle, CharSequence charSequence);

    public abstract int b(PhoneAccountHandle phoneAccountHandle);

    public abstract boolean c(PhoneAccountHandle phoneAccountHandle);

    public aob(Context context) {
        this.a = context;
    }

    public void a() {
        this.b = false;
        this.c = false;
    }
}
