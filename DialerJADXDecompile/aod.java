import android.content.Context;
import android.telecom.PhoneAccountHandle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public final class aod extends aob {
    private Map d;
    private final Map e;
    private final Map f;
    private final Map g;

    public aod(Context context) {
        super(context);
        this.d = new ConcurrentHashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new HashMap();
    }

    public final void a() {
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        super.a();
    }

    public final boolean a(PhoneAccountHandle phoneAccountHandle, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        Pair pair = new Pair(phoneAccountHandle, charSequence);
        Boolean bool = (Boolean) this.d.get(pair);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean a = awy.a(this.a, phoneAccountHandle, charSequence.toString());
        this.d.put(pair, Boolean.valueOf(a));
        return a;
    }

    public final String a(PhoneAccountHandle phoneAccountHandle) {
        if (this.e.containsKey(phoneAccountHandle)) {
            return (String) this.e.get(phoneAccountHandle);
        }
        String a = buf.a(this.a, phoneAccountHandle);
        this.e.put(phoneAccountHandle, a);
        return a;
    }

    public final int b(PhoneAccountHandle phoneAccountHandle) {
        if (this.f.containsKey(phoneAccountHandle)) {
            return ((Integer) this.f.get(phoneAccountHandle)).intValue();
        }
        Integer valueOf = Integer.valueOf(buf.b(this.a, phoneAccountHandle));
        this.f.put(phoneAccountHandle, valueOf);
        return valueOf.intValue();
    }

    public final boolean c(PhoneAccountHandle phoneAccountHandle) {
        if (this.g.containsKey(phoneAccountHandle)) {
            return ((Boolean) this.g.get(phoneAccountHandle)).booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(buf.c(this.a, phoneAccountHandle));
        this.g.put(phoneAccountHandle, valueOf);
        return valueOf.booleanValue();
    }
}
