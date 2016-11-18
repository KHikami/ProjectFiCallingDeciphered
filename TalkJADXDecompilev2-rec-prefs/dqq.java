package p000;

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
    static int f10351j;
    private static final gma f10352r = gma.m18073a("InviteListFragment");
    private static final boolean f10353s = false;
    final Context f10354k;
    final InviteListFragment f10355l;
    long f10356m = -1;
    int f10357n = 1;
    public dqz f10358o;
    public boolean f10359p;
    boolean f10360q;
    private final bbm f10361t;
    private long f10362u = -2;
    private long f10363v = Long.MAX_VALUE;
    private jca f10364w;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m12500a(igVar, (Cursor) obj);
    }

    static {
        kae kae = glk.f15559f;
    }

    public dqq(Context context, Cursor cursor, InviteListFragment inviteListFragment) {
        super(context, null);
        this.f10354k = context;
        this.f10355l = inviteListFragment;
        this.f10364w = (jca) jyn.m25426a(context, jca.class);
        this.f10361t = (bbm) jyn.m25426a(context, bbm.class);
        this.f10358o = new dqz(this, this.f10364w.mo2317a(), inviteListFragment);
    }

    public boolean m12509e() {
        return a().getInt(27) == 1;
    }

    public View mo803a(Context context, Cursor cursor, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(gwb.qO, null, false);
        ConversationListItemWrapper conversationListItemWrapper = (ConversationListItemWrapper) layoutInflater.inflate(gwb.qT, viewGroup, false);
        conversationListItemWrapper.m9368a(inflate);
        return conversationListItemWrapper;
    }

    public String m12510f() {
        return a().getString(20);
    }

    public String m12511g() {
        Cursor a = a();
        Resources resources = this.f10355l.getResources();
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

    public String m12512h() {
        Cursor a = a();
        Resources resources = this.f10355l.getResources();
        if (a.getInt(3) == 2) {
            int length = a.getString(7).split(", ").length - 1;
            if (!TextUtils.isEmpty(a.getString(6)) && length > 0) {
                return resources.getQuantityString(gwb.qX, length, new Object[]{Integer.valueOf(length)});
            }
        }
        return "";
    }

    public String m12513i() {
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
            return this.f10355l.getResources().getString(ba.lB);
        }
        return string2;
    }

    public void mo804a(View view, Cursor cursor) {
        ((ConversationListItemWrapper) view).m9373f();
        ((InviteItemView) this.f10355l.m8713b(view)).m8701a(this.f10364w.mo2317a(), m12502e(cursor), cursor.getString(16), this, this.f10355l);
    }

    public void mo1489d() {
        this.f10363v = Long.MAX_VALUE;
    }

    public void mo618c() {
        if (this.f10363v != Long.MAX_VALUE) {
            RealTimeChatService.m9066b(this.f10364w.mo2317a(), this.f10363v);
        }
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        iil.m21874a("Expected condition to be true", this.f10364w.mo2319b());
        Uri a = EsProvider.m8251a(EsProvider.f6007j, this.f10364w.mo2317a());
        bko e = fde.m15018e(this.f10364w.mo2317a());
        switch (i) {
            case 1:
                return new enl(this.f10355l.getActivity(), e, a, dql.f10343a, null, null, "inviter_affinity, sort_timestamp DESC");
            default:
                iil.m21870a("Loader created for unknown id: " + i);
                return null;
        }
    }

    private void m12500a(ig<Cursor> igVar, Cursor cursor) {
        boolean z = true;
        bko D = ((enl) igVar).m6291D();
        if (D == null || !this.f10364w.mo2319b() || !TextUtils.equals(D.m5629a(), this.f10361t.mo440a(this.f10364w.mo2317a()))) {
            glk.m17981d("Babel", "onLoadFinished called for mismatched account", new Object[0]);
        } else if (cursor == null) {
            glk.m17981d("Babel", "onLoadFinished returned with null data", new Object[0]);
        } else if (igVar.m1287p() == 1) {
            String b = f10352r.m18078b("onLoadFinished");
            this.f10359p = true;
            a(cursor);
            this.f10358o.notifyDataSetChanged();
            if (isEmpty()) {
                m12515k();
            }
            this.f10355l.m8711a(this.f10355l.getView());
            this.f10355l.an();
            if (((enl) igVar).m1336l().equals(EsProvider.m8251a(EsProvider.f6007j, this.f10364w.mo2317a())) && cursor.moveToFirst()) {
                long j = 0;
                do {
                    j = Math.max(j, cursor.getLong(4));
                } while (cursor.moveToNext());
                long k = gwb.m2274k(this.f10354k, this.f10364w.mo2317a());
                if (f10353s) {
                    if (j <= k) {
                        z = false;
                    }
                    new StringBuilder(84).append("new invite timestamp: ").append(j).append("; old ").append(k).append("; greater? ").append(z);
                }
                if (j > k) {
                    gwb.m1743a(this.f10354k, this.f10364w.mo2317a(), j);
                }
            }
            f10352r.m18079c(b);
            m12514j();
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        if (igVar.m1287p() == 1) {
            b(null);
            View view = this.f10355l.getView();
            if (view != null) {
                this.f10355l.showContent(view);
            }
        }
    }

    public void m12514j() {
        long a = this.f10364w.mo2320c().mo3434a(EsProvider.m8255a(this.f10357n), -1);
        boolean isEmpty = isEmpty();
        boolean a2 = m12501a(a, isEmpty);
        m12517m();
        if (!isEmpty || !a2) {
            this.f10355l.m8711a(this.f10355l.getView());
        }
    }

    private boolean m12501a(long j, boolean z) {
        if (f10353s) {
            int i = this.f10357n;
            long j2 = this.f10356m;
            new StringBuilder(122).append("Updating continuation end timestamp for ").append(i).append(" from ").append(j2).append("/").append(this.f10362u).append(" to ").append(j);
        }
        boolean z2 = false;
        if (j == -3) {
            this.f10356m = -2;
            z2 = true;
        } else {
            this.f10356m = j;
        }
        this.f10362u = -2;
        if (z) {
            m12515k();
        }
        return z2;
    }

    public boolean m12515k() {
        if (m12516l()) {
            return false;
        }
        if (f10353s) {
            long j = this.f10356m;
            new StringBuilder(81).append("Requesting more conversations at ").append(j).append(" (last ").append(this.f10362u).append(")");
        }
        if (this.f10362u == this.f10356m) {
            return false;
        }
        this.f10362u = this.f10356m;
        RealTimeChatService.m9065b(this.f10364w.mo2317a(), this.f10357n);
        this.f10355l.m8710a(2729);
        return true;
    }

    public boolean m12516l() {
        return (this.f10364w.mo2319b() && this.f10361t.mo455o(this.f10364w.mo2317a()) && this.f10356m != -2) ? false : true;
    }

    public boolean m12517m() {
        if (!m12516l() || !this.f10360q || this.f10357n == 4 || m12518n()) {
            return false;
        }
        this.f10357n = 4;
        m12501a(-1, true);
        m12514j();
        return true;
    }

    public boolean m12518n() {
        return this.f10362u != -2;
    }

    public boolean m12519o() {
        return m12518n() || !this.f10359p;
    }

    public void m12520p() {
        this.f10357n = 3;
        this.f10355l.m8717e().setChoiceMode(0);
        if (this.f10364w.mo2319b()) {
            this.f10360q = false;
            int i = f10351j + 1;
            f10351j = i;
            new dqr(this, this.f10364w.mo2317a(), i).execute(new Void[0]);
            m12501a(-1, true);
        }
    }

    public void m12508d(Cursor cursor) {
        String e = m12502e(cursor);
        edo edo = new edo(cursor.getString(16), cursor.getString(17));
        if (this.f10355l.f6479e != null) {
            this.f10355l.f6479e.mo1121a(edo, e, cursor.getInt(3), cursor.getLong(4));
        }
    }

    private String m12502e(Cursor cursor) {
        return EsProvider.m8268b(cursor.getString(1), (int) dqq.m12503f(cursor));
    }

    private static long m12503f(Cursor cursor) {
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

    public String m12521q() {
        Cursor a = a();
        Resources resources = this.f10355l.getResources();
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
