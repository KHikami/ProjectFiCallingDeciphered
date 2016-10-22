import android.content.Context;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public final class eyd extends evz {
    private static final long serialVersionUID = 1;
    private List<edk> g;
    private byte[] h;
    private boolean i;
    private List<edk> j;
    private byte[] k;
    private boolean l;
    private List<edk> m;
    private transient lrs n;
    private byte[] o;
    private boolean p;
    private List<edk> q;
    private byte[] r;
    private boolean s;
    private List<edk> t;
    private byte[] u;
    private boolean v;

    public eyd(lrq lrq) {
        boolean z = false;
        super(lrq, lrq.responseHeader, -1);
        boolean z2 = lrq.c == null || gwb.b(lrq.c.a);
        this.i = z2;
        if (this.i) {
            this.h = null;
            this.g = null;
        } else {
            this.h = lrq.c.b;
            this.g = gwb.a(gwb.H(), lrq.c.c);
        }
        if (lrq.d == null || gwb.b(lrq.d.a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        if (this.l) {
            this.k = null;
            this.j = null;
        } else {
            this.k = lrq.d.b;
            this.j = gwb.a(gwb.H(), lrq.d.c);
        }
        if (lrq.e == null || gwb.b(lrq.e.a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.p = z2;
        if (this.p) {
            this.o = null;
            this.m = null;
        } else {
            this.o = lrq.e.b;
            this.m = gwb.a(gwb.H(), lrq.e.c);
        }
        this.n = lrq.e;
        if (lrq.f == null || gwb.b(lrq.f.a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.s = z2;
        if (this.s) {
            this.r = null;
            this.q = null;
        } else {
            this.r = lrq.f.b;
            this.q = gwb.a(gwb.H(), lrq.f.c);
        }
        if (lrq.h == null || gwb.b(lrq.h.a)) {
            z = true;
        }
        this.v = z;
        if (this.v) {
            this.u = null;
            this.t = null;
        } else {
            this.u = lrq.h.b;
            this.t = gwb.a(gwb.H(), lrq.h.c);
        }
        if (evz.a) {
            String valueOf = String.valueOf(lrq);
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("GetSuggestedEntitiesResponse from:").append(valueOf);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(nzf.a(this.n));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.n = (lrs) nzf.a(new lrs(), (byte[]) objectInputStream.readObject());
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        jci b = ((jcf) jyn.a(gwb.H(), jcf.class)).b(blo.g().g());
        blo.a();
        try {
            String str;
            String valueOf;
            if (!this.i) {
                blo.b(this.g, 3);
                bkq.a(b, "hash_pinned", this.h);
                if (evz.a) {
                    new StringBuilder(23).append("Pinned size:").append(this.g.size());
                    str = "Set hash for pinned:";
                    valueOf = String.valueOf(Arrays.toString(this.h));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            if (!this.l) {
                blo.b(this.j, 0);
                bkq.a(b, "hash_favorites", this.k);
                if (evz.a) {
                    new StringBuilder(26).append("Favorites size:").append(this.j.size());
                    str = "Set hash for favorites:";
                    valueOf = String.valueOf(Arrays.toString(this.k));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            if (!this.p) {
                blo.b(this.m, 1);
                bkq.a(b, "hash_people_you_hangout_with", this.o);
                if (evz.a) {
                    new StringBuilder(42).append("Contacts you hangout with size:").append(this.m.size());
                    str = "Set hash for people you hangout with:";
                    valueOf = String.valueOf(Arrays.toString(this.o));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            if (!this.s) {
                blo.b(this.q, 2);
                bkq.a(b, "hash_other_people_on_hangout", this.r);
                if (evz.a) {
                    new StringBuilder(43).append("Other contacts on hangouts size:").append(this.q.size());
                    str = "Set hash for other contacts on hangouts:";
                    valueOf = String.valueOf(Arrays.toString(this.r));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            if (!this.v) {
                blo.r();
                for (edk edk : this.t) {
                    blo.d(edk.b.a, null, edk.e, edk.h);
                }
                bkq.a(b, "hash_dismissed_contacts", this.u);
                if (evz.a) {
                    new StringBuilder(35).append("Dismissed contacts size:").append(this.t.size());
                    str = "Set hash for dismissed contacts:";
                    valueOf = String.valueOf(Arrays.toString(this.u));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            blo.b();
            b.d();
        } finally {
            blo.c();
        }
    }

    public void a(Context context, bko bko) {
        if (evz.a) {
            String str = "SyncBaselineSuggestedContactsTask successful: ";
            String valueOf = String.valueOf(bko.a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        ((gid) jyn.a(context, gid.class)).a(new dcw((evb) c(), this), dcw.a(bko.g()));
        blc.a(bko, this.j, true);
        blc.a(bko, this.m, false);
    }
}
