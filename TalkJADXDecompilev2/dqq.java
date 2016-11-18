package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteItemView;
import com.google.android.apps.hangouts.invites.conversationinvitelist.impl.InviteListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class dqq extends enk implements fh<Cursor> {
    static int j;
    private static final gma r = gma.a("InviteListFragment");
    private static final boolean s = false;
    final Context k;
    final InviteListFragment l;
    long m = -1;
    int n = 1;
    public dqz o;
    public boolean p;
    boolean q;
    private final bbm t;
    private long u = -2;
    private long v = Long.MAX_VALUE;
    private jca w;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    static {
        kae kae = glk.f;
    }

    public dqq(Context context, Cursor cursor, InviteListFragment inviteListFragment) {
        super(context, null);
        this.k = context;
        this.l = inviteListFragment;
        this.w = (jca) jyn.a(context, jca.class);
        this.t = (bbm) jyn.a(context, bbm.class);
        this.o = new dqz(this, this.w.a(), inviteListFragment);
    }

    public boolean e() {
        return a().getInt(27) == 1;
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(gwb.qO, null, false);
        ConversationListItemWrapper conversationListItemWrapper = (ConversationListItemWrapper) layoutInflater.inflate(gwb.qT, viewGroup, false);
        conversationListItemWrapper.a(inflate);
        return conversationListItemWrapper;
    }

    public String f() {
        return a().getString(20);
    }

    public String g() {
        Cursor a = a();
        Resources resources = this.l.getResources();
        if (a.getInt(3) == 2) {
            int length = a.getString(7).split(", ").length - 1;
            CharSequence string = a.getString(6);
            String string2 = a.getString(18);
            if (TextUtils.isEmpty(string2)) {
                return resources.getQuantityString(gwb.qW, length + 1, new Object[]{Integer.valueOf(length + 1)});
            } else if (!TextUtils.isEmpty(string) && length > 0) {
                return string2;
            } else {
                if (length == 0) {
                    return resources.getString(ba.lv);
                }
                return resources.getQuantityString(gwb.qV, length, new Object[]{Integer.valueOf(length)});
            }
        }
        switch (a.getInt(8)) {
            case 1:
                return resources.getText(ba.lH).toString();
            case 3:
                return resources.getText(ba.lG).toString();
            default:
                return resources.getText(ba.lF).toString();
        }
    }

    public String h() {
        Cursor a = a();
        Resources resources = this.l.getResources();
        if (a.getInt(3) == 2) {
            int length = a.getString(7).split(", ").length - 1;
            if (!TextUtils.isEmpty(a.getString(6)) && length > 0) {
                return resources.getQuantityString(gwb.qX, length, new Object[]{Integer.valueOf(length)});
            }
        }
        return "";
    }

    public String i() {
        Cursor a = a();
        if (a.getInt(3) != 2) {
            return a.getString(18);
        }
        int length = a.getString(7).split(", ").length - 1;
        String string = a.getString(6);
        CharSequence string2 = a.getString(18);
        if (!TextUtils.isEmpty(string) && length != 0) {
            return string;
        }
        if (TextUtils.isEmpty(string2)) {
            return this.l.getResources().getString(ba.lB);
        }
        return string2;
    }

    public void a(View view, Cursor cursor) {
        ((ConversationListItemWrapper) view).f();
        ((InviteItemView) this.l.b(view)).a(this.w.a(), e(cursor), cursor.getString(16), this, this.l);
    }

    public void d() {
        this.v = Long.MAX_VALUE;
    }

    public void c() {
        if (this.v != Long.MAX_VALUE) {
            RealTimeChatService.b(this.w.a(), this.v);
        }
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        iil.a("Expected condition to be true", this.w.b());
        Uri a = EsProvider.a(EsProvider.j, this.w.a());
        bko e = fde.e(this.w.a());
        switch (i) {
            case 1:
                return new enl(this.l.getActivity(), e, a, dql.a, null, null, "inviter_affinity, sort_timestamp DESC");
            default:
                iil.a("Loader created for unknown id: " + i);
                return null;
        }
    }

    private void a(ig<Cursor> igVar, Cursor cursor) {
        boolean z = true;
        bko D = ((enl) igVar).D();
        if (D == null || !this.w.b() || !TextUtils.equals(D.a(), this.t.a(this.w.a()))) {
            glk.d("Babel", "onLoadFinished called for mismatched account", new Object[0]);
        } else if (cursor == null) {
            glk.d("Babel", "onLoadFinished returned with null data", new Object[0]);
        } else if (igVar.p() == 1) {
            String b = r.b("onLoadFinished");
            this.p = true;
            a(cursor);
            this.o.notifyDataSetChanged();
            if (isEmpty()) {
                k();
            }
            this.l.a(this.l.getView());
            this.l.an();
            if (((enl) igVar).l().equals(EsProvider.a(EsProvider.j, this.w.a())) && cursor.moveToFirst()) {
                long j = 0;
                do {
                    j = Math.max(j, cursor.getLong(4));
                } while (cursor.moveToNext());
                long k = gwb.k(this.k, this.w.a());
                if (s) {
                    if (j <= k) {
                        z = false;
                    }
                    new StringBuilder(84).append("new invite timestamp: ").append(j).append("; old ").append(k).append("; greater? ").append(z);
                }
                if (j > k) {
                    gwb.a(this.k, this.w.a(), j);
                }
            }
            r.c(b);
            j();
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        if (igVar.p() == 1) {
            b(null);
            View view = this.l.getView();
            if (view != null) {
                this.l.showContent(view);
            }
        }
    }

    public void j() {
        long a = this.w.c().a(EsProvider.a(this.n), -1);
        boolean isEmpty = isEmpty();
        boolean a2 = a(a, isEmpty);
        m();
        if (!isEmpty || !a2) {
            this.l.a(this.l.getView());
        }
    }

    private boolean a(long j, boolean z) {
        if (s) {
            int i = this.n;
            long j2 = this.m;
            new StringBuilder(122).append("Updating continuation end timestamp for ").append(i).append(" from ").append(j2).append("/").append(this.u).append(" to ").append(j);
        }
        boolean z2 = false;
        if (j == -3) {
            this.m = -2;
            z2 = true;
        } else {
            this.m = j;
        }
        this.u = -2;
        if (z) {
            k();
        }
        return z2;
    }

    public boolean k() {
        if (l()) {
            return false;
        }
        if (s) {
            long j = this.m;
            new StringBuilder(81).append("Requesting more conversations at ").append(j).append(" (last ").append(this.u).append(")");
        }
        if (this.u == this.m) {
            return false;
        }
        this.u = this.m;
        RealTimeChatService.b(this.w.a(), this.n);
        this.l.a(2729);
        return true;
    }

    public boolean l() {
        return (this.w.b() && this.t.o(this.w.a()) && this.m != -2) ? false : true;
    }

    public boolean m() {
        if (!l() || !this.q || this.n == 4 || n()) {
            return false;
        }
        this.n = 4;
        a(-1, true);
        j();
        return true;
    }

    public boolean n() {
        return this.u != -2;
    }

    public boolean o() {
        return n() || !this.p;
    }

    public void p() {
        this.n = 3;
        this.l.e().setChoiceMode(0);
        if (this.w.b()) {
            this.q = false;
            int i = j + 1;
            j = i;
            new dqr(this, this.w.a(), i).execute(new Void[0]);
            a(-1, true);
        }
    }

    public void d(Cursor cursor) {
        String e = e(cursor);
        edo edo = new edo(cursor.getString(16), cursor.getString(17));
        if (this.l.e != null) {
            this.l.e.a(edo, e, cursor.getInt(3), cursor.getLong(4));
        }
    }

    private String e(Cursor cursor) {
        return EsProvider.b(cursor.getString(1), (int) dqq.f(cursor));
    }

    private static long f(Cursor cursor) {
        int i;
        int i2 = 0;
        String string = cursor.getString(37);
        if (string != null) {
            long j = -1;
            String[] split = string.split("\\|");
            int length = split.length;
            int length2 = split.length;
            int i3 = 0;
            int i4 = 0;
            i = 0;
            while (i3 < length2) {
                long parseLong;
                int i5;
                try {
                    parseLong = Long.parseLong(split[i3]);
                    if (parseLong > j) {
                        i5 = i4;
                        i4++;
                        i3++;
                        i = i5;
                        j = parseLong;
                    }
                } catch (NumberFormatException e) {
                }
                parseLong = j;
                i5 = i;
                i4++;
                i3++;
                i = i5;
                j = parseLong;
            }
            i2 = length;
        } else {
            i = 0;
        }
        return (((long) i2) << 32) | ((long) i);
    }

    public String q() {
        Cursor a = a();
        Resources resources = this.l.getResources();
        if (a.getInt(27) != 2) {
            int i = a.getInt(8);
            if (i == 3) {
                return resources.getString(ba.lC);
            }
            if (i == 2) {
                String string = a.getString(9);
                return string.substring(1, string.length() - 1);
            } else if (i == 1) {
                return resources.getString(ba.lE);
            }
        }
        return resources.getString(ba.lD);
    }
}
