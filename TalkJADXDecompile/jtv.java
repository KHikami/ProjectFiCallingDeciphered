import android.util.Log;
import android.view.View;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public abstract class jtv {
    private jtx a;
    private ArrayList<jtx> b;
    public final jty f;
    public final jtw g;
    public volatile Object h;
    public volatile int i;
    public volatile int j;
    public volatile int k;
    public boolean l;
    public boolean m;
    public volatile boolean n;

    public abstract void a(Object obj);

    public abstract void c();

    public jtv(jty jty, jtw jtw) {
        this.f = jty;
        this.g = jtw;
        this.l = Log.isLoggable("EsResource", 3);
    }

    public jtw l() {
        return this.g;
    }

    public int m() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public String n() {
        return b(this.i);
    }

    private static String b(int i) {
        switch (i) {
            case wi.w /*0*/:
                return "undefined";
            case wi.j /*1*/:
                return "ready";
            case wi.l /*2*/:
                return "loading";
            case wi.z /*3*/:
                return "not found";
            case wi.h /*4*/:
                return "transient error";
            case wi.p /*5*/:
                return "permanent error";
            case wi.s /*6*/:
                return "out of memory";
            case wi.q /*7*/:
                return "canceled";
            default:
                return String.valueOf(i);
        }
    }

    public Object o() {
        return this.h;
    }

    public File f() {
        return null;
    }

    public File g() {
        return null;
    }

    public boolean p() {
        return this.l;
    }

    public void a(String str, Throwable th) {
        Log.e("EsResource", str, th);
    }

    public void a(jtx jtx) {
        boolean z;
        boolean z2 = false;
        gwb.aJ();
        a();
        if (this.a == jtx) {
            z = true;
        } else {
            if (this.b != null) {
                int size = this.b.size();
                for (int i = 0; i < size; i++) {
                    if (this.b.get(i) == jtx) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        if (!z) {
            if (this.b != null) {
                z2 = this.b.isEmpty();
                this.b.add(jtx);
            } else if (this.a != null) {
                this.b = new ArrayList();
                this.b.add(this.a);
                this.a = null;
                this.b.add(jtx);
            } else {
                this.a = jtx;
                z2 = true;
            }
            if (z2) {
                this.f.a(this);
            }
            jtx.a(this);
        }
    }

    public void b(jtx jtx) {
        gwb.aJ();
        a();
        if (this.a == jtx) {
            this.a = null;
            this.f.b(this);
        } else if (this.b != null) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (this.b.get(i) == jtx) {
                    this.b.remove(i);
                    break;
                }
            }
            if (this.b.isEmpty()) {
                this.f.b(this);
            }
        }
    }

    private void a() {
        if (this.m) {
            throw new ConcurrentModificationException("Registering/unregistering resource while delivering status change notification");
        }
    }

    public int q() {
        if (this.b != null) {
            return this.b.size();
        }
        if (this.a != null) {
            return 1;
        }
        return 0;
    }

    public void r() {
        gwb.aJ();
        if (q() == 0) {
            i();
            return;
        }
        this.m = true;
        try {
            if (this.b != null) {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((jtx) obj).a(this);
                }
            } else if (this.a != null) {
                this.a.a(this);
            }
            this.m = false;
        } catch (Throwable th) {
            this.m = false;
        }
    }

    public void i() {
        this.i = 0;
        this.h = null;
    }

    public void b(Object obj) {
        this.f.a(this, 1, obj);
    }

    public void a(int i) {
        String valueOf;
        String valueOf2;
        if (this.i == 2) {
            if (p()) {
                valueOf = String.valueOf(this.g);
                valueOf2 = String.valueOf(b(i));
                new StringBuilder((String.valueOf(valueOf).length() + 45) + String.valueOf(valueOf2).length()).append("Delivering error code to consumers: ").append(valueOf).append(" status: ").append(valueOf2);
            }
            this.f.a(this, i);
        } else if (p()) {
            valueOf = String.valueOf(this.g);
            valueOf2 = String.valueOf(n());
            String valueOf3 = String.valueOf(b(i));
            new StringBuilder(((String.valueOf(valueOf).length() + 96) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Request no longer needed, not delivering status change: ").append(valueOf).append(", current status: ").append(valueOf2).append(", ignored new status: ").append(valueOf3);
        }
    }

    public void a(int i, String str) {
        if (i == HttpStatusCodes.STATUS_CODE_NOT_FOUND) {
            this.f.a(this, 3);
        } else if (i == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED) {
            this.f.a(this, 4, i);
        } else {
            this.f.a(this, 5, i);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName()).append('@').append(System.identityHashCode(this)).append("\n  ID: ").append(this.g).append("\n  Status: ").append(n());
        if (this.n) {
            stringBuilder.append("; downloading");
        }
        if (this.h != null) {
            a(stringBuilder);
        }
        stringBuilder.append("\n  Consumers:");
        if (this.b != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jtx jtx = (jtx) obj;
                stringBuilder.append("\n   ");
                a(stringBuilder, jtx);
            }
        } else if (this.a != null) {
            stringBuilder.append("\n   ");
            a(stringBuilder, this.a);
        } else {
            stringBuilder.append("\n   none");
        }
        return stringBuilder.toString();
    }

    public void a(StringBuilder stringBuilder) {
    }

    private static void a(StringBuilder stringBuilder, jtx jtx) {
        stringBuilder.append(jtx);
        if (jtx instanceof View) {
            stringBuilder.append(" context: ").append(((View) jtx).getContext());
        }
    }
}
