package defpackage;

import android.graphics.Bitmap;
import android.location.Address;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: beb */
public class beb implements bej, bek {
    public final String a;
    public final /* synthetic */ bbc b;

    public void a(Address address, List list) {
        bbe bbe = (bbe) this.b.c.get(this.a);
        if (bbe == null) {
            bdf.c((Object) this, "Contact context received for empty search entry.");
            this.b.a(this.a);
            return;
        }
        bbe.i = false;
        bdf.b(this.b, "Setting contact interactions for entry: ", bbe);
        bbe.m = address;
        bbe.n = list;
        bbc bbc = this.b;
        String str = this.a;
        Set<bbf> set = (Set) bbc.d.get(str);
        if (set != null) {
            for (bbf c : set) {
                c.c(str, bbe);
            }
        }
        if (!bbe.h) {
            this.b.a(this.a);
        }
    }

    public beb(bbc bbc, String str) {
        this.b = bbc;
        this.a = str;
    }

    public void a(bel bel) {
        if (bel == null) {
            bdf.a(bbc.a, "Contact lookup done. Remote contact not found.");
            this.b.a(this.a);
            return;
        }
        bbe bbe = new bbe();
        bbe.a = bel.a();
        bbe.c = bel.b();
        bbe.o = bel.h();
        int c = bel.c();
        CharSequence d = bel.d();
        if (c == 0) {
            bbe.e = d;
        } else {
            CharSequence typeLabel = Phone.getTypeLabel(this.b.b.getResources(), c, d);
            bbe.e = typeLabel == null ? null : typeLabel.toString();
        }
        bbe bbe2 = (bbe) this.b.c.get(this.a);
        if (bbe2 != null) {
            bbe.d = bbe2.d;
            bbe.q = bbe2.q;
        }
        if (bel.e() == null && bel.g()) {
            bdf.a(bbc.a, "Business has no image. Using default.");
            bbe.f = this.b.b.getResources().getDrawable(buf.kD);
        }
        this.b.c.put(this.a, bbe);
        this.b.a(this.a, bbe);
        if (this.b.e != null) {
            bbe.i = this.b.e.a(bel.f(), this);
        }
        bbe.h = bel.e() != null;
        if (!bbe.h && !bbe.i) {
            this.b.a(this.a);
        }
    }

    public void a(Bitmap bitmap) {
        this.b.a(null, bitmap, this.a);
    }
}
