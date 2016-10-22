import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class fcw {
    private static final boolean a;
    private final jcf b;

    static {
        kae kae = glk.o;
        a = false;
    }

    public fcw(Context context) {
        this.b = (jcf) jyn.a(context, jcf.class);
    }

    public long a(int i) {
        if (i == -1) {
            return -1;
        }
        return this.b.a(i).a("cachehash_client_hash", -1);
    }

    private void b(int i, long j) {
        if (i != -1) {
            this.b.b(i).b("cachehash_client_hash", j).d();
        }
    }

    public void a(int i, long j) {
        if (i != -1) {
            long a = this.b.a(i).a("cachehash_client_hash", -1);
            if (a != -1) {
                this.b.b(i).b("cachehash_client_hash", a + j).d();
            }
        }
    }

    public long b(int i) {
        if (i == -1) {
            return -1;
        }
        return this.b.a(i).a("cachehash_latest_rollup_version", -1);
    }

    private void c(int i, long j) {
        if (i != -1) {
            this.b.b(i).b("cachehash_latest_rollup_version", j).d();
        }
    }

    public boolean a(int i, String str) {
        if (i == -1) {
            return false;
        }
        Set a = this.b.a(i).a("cachehash_update_ids", null);
        if (a == null || !a.contains(str)) {
            return false;
        }
        return true;
    }

    public void b(int i, String str) {
        if (i != -1) {
            Set hashSet;
            Collection a = this.b.a(i).a("cachehash_update_ids", null);
            if (a == null) {
                hashSet = new HashSet();
            } else {
                hashSet = new HashSet(a);
            }
            hashSet.add(str);
            this.b.b(i).b("cachehash_update_ids", hashSet).d();
        }
    }

    private void d(int i) {
        if (i != -1) {
            this.b.b(i).b("cachehash_update_ids", null).d();
        }
    }

    public void c(int i) {
        if (i != -1) {
            b(i, -1);
            c(i, -1);
            d(i);
        }
    }

    public void a(int i, long j, long j2) {
        if (i != -1) {
            b(i, j);
            c(i, j2);
            d(i);
        }
    }
}
