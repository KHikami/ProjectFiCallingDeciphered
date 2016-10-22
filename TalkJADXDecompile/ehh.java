import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;

final class ehh implements fh<Cursor> {
    final /* synthetic */ egv a;

    ehh(egv egv) {
        this.a = egv;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        String str;
        String str2;
        Builder buildUpon = dwz.g.buildUpon();
        buildUpon.appendQueryParameter("wait_for_contact_merger", "true");
        String str3 = "UPPER(display_name)";
        String valueOf;
        if (i == egv.a) {
            this.a.au.a("people_list_frequent_contacts_load");
            buildUpon.appendQueryParameter("is_frequent", "true");
            valueOf = String.valueOf("person_affinity_score, frequent_order, ");
            str3 = String.valueOf(str3);
            if (str3.length() != 0) {
                str3 = valueOf.concat(str3);
            } else {
                str3 = new String(valueOf);
            }
            str = null;
            str2 = str3;
        } else if (i == egv.b) {
            this.a.au.a("people_list_merged_contacts_load");
            str = null;
            str2 = str3;
        } else if (this.a.b() && i == egv.c) {
            str = "is_hangouts_user";
            if (TextUtils.isEmpty(this.a.aj.j())) {
                str2 = str3;
            } else {
                valueOf = String.valueOf("person_affinity_score, ");
                str3 = String.valueOf(str3);
                str2 = str3.length() != 0 ? valueOf.concat(str3) : new String(valueOf);
            }
        } else if (this.a.b() && i == egv.d) {
            str = "NOT is_hangouts_user";
            str2 = str3;
        } else {
            throw new IllegalArgumentException("Unknown loader ID: " + i);
        }
        buildUpon.appendQueryParameter("account_id", Integer.toString(this.a.e.a()));
        buildUpon.appendQueryParameter("conversation_type", Integer.toString(this.a.ak.ordinal()));
        if (!TextUtils.isEmpty(this.a.aj.j())) {
            buildUpon.appendQueryParameter("query", this.a.aj.j());
        }
        return new ib(this.a.getActivity(), buildUpon.build(), dxa.c(), str, null, str2);
    }

    private void a(ig<Cursor> igVar, Cursor cursor) {
        boolean z;
        boolean z2 = true;
        egv egv = this.a;
        if (this.a.i == null || (cursor == null && this.a.i.o())) {
            z = true;
        } else {
            z = false;
        }
        egv.ar = z;
        int p = igVar.p();
        if (p == egv.a) {
            this.a.au.a(this.a.e.a(), "people_list_frequent_contacts_load", 1021);
            this.a.f.a(new dxb(this.a.context.getString(gwb.sQ), cursor));
        } else if (p == egv.b) {
            this.a.au.a(this.a.e.a(), "people_list_merged_contacts_load", 1022);
            this.a.f.c(new dxb(this.a.context.getString(gwb.sW), cursor));
        } else if (this.a.b() && p == egv.c) {
            this.a.f.b(new dxb(this.a.context.getString(gwb.tg), cursor));
        } else if (this.a.b() && p == egv.d) {
            this.a.f.e(new dxb(this.a.context.getString(gwb.tf), cursor));
        } else {
            throw new IllegalArgumentException("Unknown loader ID: " + p);
        }
        this.a.a(this.a.getView());
        egv egv2 = this.a;
        CharSequence j = egv2.aj.j();
        if (egv2.h) {
            egj egj = egv2.f;
            if (TextUtils.isEmpty(j)) {
                z2 = false;
            }
            if (egj.c(z2)) {
                if (egv2.ao != null) {
                    egv2.ao.a(egv2.f.b());
                }
                egv2.h = false;
            }
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        int p = igVar.p();
        if (p == egv.a) {
            this.a.f.a(null);
        } else if (p == egv.b) {
            this.a.f.c(null);
        } else if (this.a.b() && p == egv.c) {
            this.a.f.b(null);
        } else if (this.a.b() && p == egv.d) {
            this.a.f.e(null);
        } else {
            throw new IllegalArgumentException("Unknown loader ID: " + p);
        }
        this.a.a(this.a.getView());
        egv egv = this.a;
        CharSequence j = egv.aj.j();
        if (egv.h) {
            if (egv.f.c(!TextUtils.isEmpty(j))) {
                if (egv.ao != null) {
                    egv.ao.a(egv.f.b());
                }
                egv.h = false;
            }
        }
    }
}
