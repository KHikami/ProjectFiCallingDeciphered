import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Set;

public final class hea extends heg<gut> {
    private int a;
    private boolean b;

    private gut a(Status status) {
        gut gus;
        synchronized (null) {
            try {
                ky kyVar;
                ConnectionResult connectionResult = new ConnectionResult(8);
                int i = 0;
                while (true) {
                    kyVar = null;
                    if (i >= kyVar.size()) {
                        break;
                    }
                    kyVar = null;
                    a((hdx) kyVar.b(i), connectionResult);
                    i++;
                }
                kyVar = null;
                gus = kyVar.size() == 1 ? new gus(status, null) : new gut(status, null);
            } catch (Throwable th) {
            }
        }
        return gus;
    }

    public void a(hdx<?> hdx_, ConnectionResult connectionResult) {
        synchronized (null) {
            ky kyVar = null;
            try {
                kyVar.put(hdx_, connectionResult);
                this.a--;
                boolean b = connectionResult.b();
                if (!b) {
                    this.b = b;
                }
                if (this.a == 0) {
                    Status status = this.b ? new Status(13) : Status.a;
                    kyVar = null;
                    a(kyVar.size() == 1 ? new gus(status, null) : new gut(status, null));
                }
            } finally {
            }
        }
    }

    protected /* synthetic */ gup b(Status status) {
        return a(status);
    }

    public Set<hdx<?>> c() {
        ky kyVar = null;
        return kyVar.keySet();
    }
}
