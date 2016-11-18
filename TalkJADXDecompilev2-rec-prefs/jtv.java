package p000;

import android.util.Log;
import android.view.View;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public abstract class jtv {
    private jtx f20085a;
    private ArrayList<jtx> f20086b;
    public final jty f20087f;
    public final jtw f20088g;
    public volatile Object f20089h;
    public volatile int f20090i;
    public volatile int f20091j;
    public volatile int f20092k;
    public boolean f20093l = Log.isLoggable("EsResource", 3);
    public boolean f20094m;
    public volatile boolean f20095n;

    public abstract void mo3515a(Object obj);

    public abstract void mo3517c();

    public jtv(jty jty, jtw jtw) {
        this.f20087f = jty;
        this.f20088g = jtw;
    }

    public jtw m24246l() {
        return this.f20088g;
    }

    public int m24247m() {
        return this.f20090i;
    }

    public void m24242c(int i) {
        this.f20090i = i;
    }

    public String m24248n() {
        return jtv.mo3584b(this.f20090i);
    }

    private static String mo3584b(int i) {
        switch (i) {
            case 0:
                return "undefined";
            case 1:
                return "ready";
            case 2:
                return "loading";
            case 3:
                return "not found";
            case 4:
                return "transient error";
            case 5:
                return "permanent error";
            case 6:
                return "out of memory";
            case 7:
                return "canceled";
            default:
                return String.valueOf(i);
        }
    }

    public Object m24249o() {
        return this.f20089h;
    }

    public File mo3518f() {
        return null;
    }

    public File mo3519g() {
        return null;
    }

    public boolean m24250p() {
        return this.f20093l;
    }

    public void m24236a(String str, Throwable th) {
        Log.e("EsResource", str, th);
    }

    public void m24238a(jtx jtx) {
        boolean z;
        boolean z2 = false;
        gwb.aJ();
        mo3511a();
        if (this.f20085a == jtx) {
            z = true;
        } else {
            if (this.f20086b != null) {
                int size = this.f20086b.size();
                for (int i = 0; i < size; i++) {
                    if (this.f20086b.get(i) == jtx) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        if (!z) {
            if (this.f20086b != null) {
                z2 = this.f20086b.isEmpty();
                this.f20086b.add(jtx);
            } else if (this.f20085a != null) {
                this.f20086b = new ArrayList();
                this.f20086b.add(this.f20085a);
                this.f20085a = null;
                this.f20086b.add(jtx);
            } else {
                this.f20085a = jtx;
                z2 = true;
            }
            if (z2) {
                this.f20087f.mo3542a(this);
            }
            jtx.mo1323a(this);
        }
    }

    public void m24240b(jtx jtx) {
        gwb.aJ();
        mo3511a();
        if (this.f20085a == jtx) {
            this.f20085a = null;
            this.f20087f.mo3546b(this);
        } else if (this.f20086b != null) {
            int size = this.f20086b.size();
            for (int i = 0; i < size; i++) {
                if (this.f20086b.get(i) == jtx) {
                    this.f20086b.remove(i);
                    break;
                }
            }
            if (this.f20086b.isEmpty()) {
                this.f20087f.mo3546b(this);
            }
        }
    }

    private void mo3511a() {
        if (this.f20094m) {
            throw new ConcurrentModificationException("Registering/unregistering resource while delivering status change notification");
        }
    }

    public int m24251q() {
        if (this.f20086b != null) {
            return this.f20086b.size();
        }
        if (this.f20085a != null) {
            return 1;
        }
        return 0;
    }

    public void m24252r() {
        gwb.aJ();
        if (m24251q() == 0) {
            mo3520i();
            return;
        }
        this.f20094m = true;
        try {
            if (this.f20086b != null) {
                ArrayList arrayList = this.f20086b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((jtx) obj).mo1323a(this);
                }
            } else if (this.f20085a != null) {
                this.f20085a.mo1323a(this);
            }
            this.f20094m = false;
        } catch (Throwable th) {
            this.f20094m = false;
        }
    }

    public void mo3520i() {
        this.f20090i = 0;
        this.f20089h = null;
    }

    public void mo3585b(Object obj) {
        this.f20087f.mo3532a(this, 1, obj);
    }

    public void mo3512a(int i) {
        String valueOf;
        String valueOf2;
        if (this.f20090i == 2) {
            if (m24250p()) {
                valueOf = String.valueOf(this.f20088g);
                valueOf2 = String.valueOf(jtv.mo3584b(i));
                new StringBuilder((String.valueOf(valueOf).length() + 45) + String.valueOf(valueOf2).length()).append("Delivering error code to consumers: ").append(valueOf).append(" status: ").append(valueOf2);
            }
            this.f20087f.mo3530a(this, i);
        } else if (m24250p()) {
            valueOf = String.valueOf(this.f20088g);
            valueOf2 = String.valueOf(m24248n());
            String valueOf3 = String.valueOf(jtv.mo3584b(i));
            new StringBuilder(((String.valueOf(valueOf).length() + 96) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Request no longer needed, not delivering status change: ").append(valueOf).append(", current status: ").append(valueOf2).append(", ignored new status: ").append(valueOf3);
        }
    }

    public void mo3513a(int i, String str) {
        if (i == HttpStatusCodes.STATUS_CODE_NOT_FOUND) {
            this.f20087f.mo3530a(this, 3);
        } else if (i == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED) {
            this.f20087f.mo3531a(this, 4, i);
        } else {
            this.f20087f.mo3531a(this, 5, i);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName()).append('@').append(System.identityHashCode(this)).append("\n  ID: ").append(this.f20088g).append("\n  Status: ").append(m24248n());
        if (this.f20095n) {
            stringBuilder.append("; downloading");
        }
        if (this.f20089h != null) {
            mo3516a(stringBuilder);
        }
        stringBuilder.append("\n  Consumers:");
        if (this.f20086b != null) {
            ArrayList arrayList = this.f20086b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jtx jtx = (jtx) obj;
                stringBuilder.append("\n   ");
                jtv.m24231a(stringBuilder, jtx);
            }
        } else if (this.f20085a != null) {
            stringBuilder.append("\n   ");
            jtv.m24231a(stringBuilder, this.f20085a);
        } else {
            stringBuilder.append("\n   none");
        }
        return stringBuilder.toString();
    }

    public void mo3516a(StringBuilder stringBuilder) {
    }

    private static void m24231a(StringBuilder stringBuilder, jtx jtx) {
        stringBuilder.append(jtx);
        if (jtx instanceof View) {
            stringBuilder.append(" context: ").append(((View) jtx).getContext());
        }
    }
}
