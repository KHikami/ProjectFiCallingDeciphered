package p000;

import android.content.Context;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public final class eyd extends evz {
    private static final long serialVersionUID = 1;
    private List<edk> f12498g;
    private byte[] f12499h;
    private boolean f12500i;
    private List<edk> f12501j;
    private byte[] f12502k;
    private boolean f12503l;
    private List<edk> f12504m;
    private transient lrs f12505n;
    private byte[] f12506o;
    private boolean f12507p;
    private List<edk> f12508q;
    private byte[] f12509r;
    private boolean f12510s;
    private List<edk> f12511t;
    private byte[] f12512u;
    private boolean f12513v;

    public eyd(lrq lrq) {
        boolean z = false;
        super(lrq, lrq.responseHeader, -1);
        boolean z2 = lrq.f26262c == null || gwb.m2061b(lrq.f26262c.f26272a);
        this.f12500i = z2;
        if (this.f12500i) {
            this.f12499h = null;
            this.f12498g = null;
        } else {
            this.f12499h = lrq.f26262c.f26273b;
            this.f12498g = gwb.m1693a(gwb.m1400H(), lrq.f26262c.f26274c);
        }
        if (lrq.f26263d == null || gwb.m2061b(lrq.f26263d.f26272a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f12503l = z2;
        if (this.f12503l) {
            this.f12502k = null;
            this.f12501j = null;
        } else {
            this.f12502k = lrq.f26263d.f26273b;
            this.f12501j = gwb.m1693a(gwb.m1400H(), lrq.f26263d.f26274c);
        }
        if (lrq.f26264e == null || gwb.m2061b(lrq.f26264e.f26272a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f12507p = z2;
        if (this.f12507p) {
            this.f12506o = null;
            this.f12504m = null;
        } else {
            this.f12506o = lrq.f26264e.f26273b;
            this.f12504m = gwb.m1693a(gwb.m1400H(), lrq.f26264e.f26274c);
        }
        this.f12505n = lrq.f26264e;
        if (lrq.f26265f == null || gwb.m2061b(lrq.f26265f.f26272a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f12510s = z2;
        if (this.f12510s) {
            this.f12509r = null;
            this.f12508q = null;
        } else {
            this.f12509r = lrq.f26265f.f26273b;
            this.f12508q = gwb.m1693a(gwb.m1400H(), lrq.f26265f.f26274c);
        }
        if (lrq.f26267h == null || gwb.m2061b(lrq.f26267h.f26272a)) {
            z = true;
        }
        this.f12513v = z;
        if (this.f12513v) {
            this.f12512u = null;
            this.f12511t = null;
        } else {
            this.f12512u = lrq.f26267h.f26273b;
            this.f12511t = gwb.m1693a(gwb.m1400H(), lrq.f26267h.f26274c);
        }
        if (evz.f5798a) {
            String valueOf = String.valueOf(lrq);
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("GetSuggestedEntitiesResponse from:").append(valueOf);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(nzf.m1029a(this.f12505n));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f12505n = (lrs) nzf.m1027a(new lrs(), (byte[]) objectInputStream.readObject());
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        jci b = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3464b(blo.m6056g().m5638g());
        blo.m5958a();
        try {
            String str;
            String valueOf;
            if (!this.f12500i) {
                blo.m6022b(this.f12498g, 3);
                bkq.m5671a(b, "hash_pinned", this.f12499h);
                if (evz.f5798a) {
                    new StringBuilder(23).append("Pinned size:").append(this.f12498g.size());
                    str = "Set hash for pinned:";
                    valueOf = String.valueOf(Arrays.toString(this.f12499h));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            if (!this.f12503l) {
                blo.m6022b(this.f12501j, 0);
                bkq.m5671a(b, "hash_favorites", this.f12502k);
                if (evz.f5798a) {
                    new StringBuilder(26).append("Favorites size:").append(this.f12501j.size());
                    str = "Set hash for favorites:";
                    valueOf = String.valueOf(Arrays.toString(this.f12502k));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            if (!this.f12507p) {
                blo.m6022b(this.f12504m, 1);
                bkq.m5671a(b, "hash_people_you_hangout_with", this.f12506o);
                if (evz.f5798a) {
                    new StringBuilder(42).append("Contacts you hangout with size:").append(this.f12504m.size());
                    str = "Set hash for people you hangout with:";
                    valueOf = String.valueOf(Arrays.toString(this.f12506o));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            if (!this.f12510s) {
                blo.m6022b(this.f12508q, 2);
                bkq.m5671a(b, "hash_other_people_on_hangout", this.f12509r);
                if (evz.f5798a) {
                    new StringBuilder(43).append("Other contacts on hangouts size:").append(this.f12508q.size());
                    str = "Set hash for other contacts on hangouts:";
                    valueOf = String.valueOf(Arrays.toString(this.f12509r));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            if (!this.f12513v) {
                blo.m6100r();
                for (edk edk : this.f12511t) {
                    blo.m6041d(edk.f11213b.f11244a, null, edk.f11216e, edk.f11219h);
                }
                bkq.m5671a(b, "hash_dismissed_contacts", this.f12512u);
                if (evz.f5798a) {
                    new StringBuilder(35).append("Dismissed contacts size:").append(this.f12511t.size());
                    str = "Set hash for dismissed contacts:";
                    valueOf = String.valueOf(Arrays.toString(this.f12512u));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            }
            blo.m6015b();
            b.m23891d();
        } finally {
            blo.m6028c();
        }
    }

    public void mo1958a(Context context, bko bko) {
        if (evz.f5798a) {
            String str = "SyncBaselineSuggestedContactsTask successful: ";
            String valueOf = String.valueOf(bko.m5629a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        ((gid) jyn.m25426a(context, gid.class)).mo2276a(new dcw((evb) m8129c(), this), dcw.m11462a(bko.m5638g()));
        blc.m5742a(bko, this.f12501j, true);
        blc.m5742a(bko, this.f12504m, false);
    }
}
