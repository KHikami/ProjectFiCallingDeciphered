package p000;

import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class fcw {
    private static final boolean f12708a = false;
    private final jcf f12709b;

    static {
        kae kae = glk.f15568o;
    }

    public fcw(Context context) {
        this.f12709b = (jcf) jyn.m25426a(context, jcf.class);
    }

    public long m14977a(int i) {
        if (i == -1) {
            return -1;
        }
        return this.f12709b.mo3456a(i).mo3434a("cachehash_client_hash", -1);
    }

    private void m14974b(int i, long j) {
        if (i != -1) {
            this.f12709b.mo3464b(i).m23878b("cachehash_client_hash", j).m23891d();
        }
    }

    public void m14978a(int i, long j) {
        if (i != -1) {
            long a = this.f12709b.mo3456a(i).mo3434a("cachehash_client_hash", -1);
            if (a != -1) {
                this.f12709b.mo3464b(i).m23878b("cachehash_client_hash", a + j).m23891d();
            }
        }
    }

    public long m14981b(int i) {
        if (i == -1) {
            return -1;
        }
        return this.f12709b.mo3456a(i).mo3434a("cachehash_latest_rollup_version", -1);
    }

    private void m14975c(int i, long j) {
        if (i != -1) {
            this.f12709b.mo3464b(i).m23878b("cachehash_latest_rollup_version", j).m23891d();
        }
    }

    public boolean m14980a(int i, String str) {
        if (i == -1) {
            return false;
        }
        Set a = this.f12709b.mo3456a(i).mo3436a("cachehash_update_ids", null);
        if (a == null || !a.contains(str)) {
            return false;
        }
        return true;
    }

    public void m14982b(int i, String str) {
        if (i != -1) {
            Set hashSet;
            Collection a = this.f12709b.mo3456a(i).mo3436a("cachehash_update_ids", null);
            if (a == null) {
                hashSet = new HashSet();
            } else {
                hashSet = new HashSet(a);
            }
            hashSet.add(str);
            this.f12709b.mo3464b(i).m23880b("cachehash_update_ids", hashSet).m23891d();
        }
    }

    private void m14976d(int i) {
        if (i != -1) {
            this.f12709b.mo3464b(i).m23880b("cachehash_update_ids", null).m23891d();
        }
    }

    public void m14983c(int i) {
        if (i != -1) {
            m14974b(i, -1);
            m14975c(i, -1);
            m14976d(i);
        }
    }

    public void m14979a(int i, long j, long j2) {
        if (i != -1) {
            m14974b(i, j);
            m14975c(i, j2);
            m14976d(i);
        }
    }
}
