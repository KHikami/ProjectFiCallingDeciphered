package p000;

import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;

final class ehh implements fh<Cursor> {
    final /* synthetic */ egv f11498a;

    ehh(egv egv) {
        this.f11498a = egv;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m13918a(igVar, (Cursor) obj);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        String str;
        String str2;
        Builder buildUpon = dwz.f6496g.buildUpon();
        buildUpon.appendQueryParameter("wait_for_contact_merger", "true");
        String str3 = "UPPER(display_name)";
        String valueOf;
        if (i == egv.f11467a) {
            this.f11498a.au.mo1670a("people_list_frequent_contacts_load");
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
        } else if (i == egv.f11468b) {
            this.f11498a.au.mo1670a("people_list_merged_contacts_load");
            str = null;
            str2 = str3;
        } else if (this.f11498a.m13907b() && i == egv.f11469c) {
            str = "is_hangouts_user";
            if (TextUtils.isEmpty(this.f11498a.aj.m4881j())) {
                str2 = str3;
            } else {
                valueOf = String.valueOf("person_affinity_score, ");
                str3 = String.valueOf(str3);
                str2 = str3.length() != 0 ? valueOf.concat(str3) : new String(valueOf);
            }
        } else if (this.f11498a.m13907b() && i == egv.f11470d) {
            str = "NOT is_hangouts_user";
            str2 = str3;
        } else {
            throw new IllegalArgumentException("Unknown loader ID: " + i);
        }
        buildUpon.appendQueryParameter("account_id", Integer.toString(this.f11498a.f11471e.mo2317a()));
        buildUpon.appendQueryParameter("conversation_type", Integer.toString(this.f11498a.ak.ordinal()));
        if (!TextUtils.isEmpty(this.f11498a.aj.m4881j())) {
            buildUpon.appendQueryParameter("query", this.f11498a.aj.m4881j());
        }
        return new ib(this.f11498a.getActivity(), buildUpon.build(), dxa.m12954c(), str, null, str2);
    }

    private void m13918a(ig<Cursor> igVar, Cursor cursor) {
        boolean z;
        boolean z2 = true;
        egv egv = this.f11498a;
        if (this.f11498a.f11475i == null || (cursor == null && this.f11498a.f11475i.m5646o())) {
            z = true;
        } else {
            z = false;
        }
        egv.ar = z;
        int p = igVar.m1287p();
        if (p == egv.f11467a) {
            this.f11498a.au.mo1668a(this.f11498a.f11471e.mo2317a(), "people_list_frequent_contacts_load", 1021);
            this.f11498a.f11472f.m13874a(new dxb(this.f11498a.context.getString(gwb.sQ), cursor));
        } else if (p == egv.f11468b) {
            this.f11498a.au.mo1668a(this.f11498a.f11471e.mo2317a(), "people_list_merged_contacts_load", 1022);
            this.f11498a.f11472f.m13881c(new dxb(this.f11498a.context.getString(gwb.sW), cursor));
        } else if (this.f11498a.m13907b() && p == egv.f11469c) {
            this.f11498a.f11472f.m13879b(new dxb(this.f11498a.context.getString(gwb.tg), cursor));
        } else if (this.f11498a.m13907b() && p == egv.f11470d) {
            this.f11498a.f11472f.m13887e(new dxb(this.f11498a.context.getString(gwb.tf), cursor));
        } else {
            throw new IllegalArgumentException("Unknown loader ID: " + p);
        }
        this.f11498a.m13901a(this.f11498a.getView());
        egv egv2 = this.f11498a;
        CharSequence j = egv2.aj.m4881j();
        if (egv2.f11474h) {
            egj egj = egv2.f11472f;
            if (TextUtils.isEmpty(j)) {
                z2 = false;
            }
            if (egj.m13883c(z2)) {
                if (egv2.ao != null) {
                    egv2.ao.m13923a(egv2.f11472f.m13878b());
                }
                egv2.f11474h = false;
            }
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        int p = igVar.m1287p();
        if (p == egv.f11467a) {
            this.f11498a.f11472f.m13874a(null);
        } else if (p == egv.f11468b) {
            this.f11498a.f11472f.m13881c(null);
        } else if (this.f11498a.m13907b() && p == egv.f11469c) {
            this.f11498a.f11472f.m13879b(null);
        } else if (this.f11498a.m13907b() && p == egv.f11470d) {
            this.f11498a.f11472f.m13887e(null);
        } else {
            throw new IllegalArgumentException("Unknown loader ID: " + p);
        }
        this.f11498a.m13901a(this.f11498a.getView());
        egv egv = this.f11498a;
        CharSequence j = egv.aj.m4881j();
        if (egv.f11474h) {
            if (egv.f11472f.m13883c(!TextUtils.isEmpty(j))) {
                if (egv.ao != null) {
                    egv.ao.m13923a(egv.f11472f.m13878b());
                }
                egv.f11474h = false;
            }
        }
    }
}
