package com.google.android.apps.hangouts.fragments;

import android.animation.LayoutTransition;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ba;
import bc;
import bcc;
import bdn;
import bkm;
import bko;
import boj;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.listui.SwipeableListView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import cyk;
import cyl;
import day;
import daz;
import dba;
import dbb;
import dbc;
import dbd;
import dbe;
import dbh;
import dbi;
import dbj;
import dci;
import dft;
import dfz;
import dth;
import dti;
import dug;
import duh;
import enl;
import eqy;
import era;
import erv;
import fde;
import fh;
import fzy;
import gaf;
import gis;
import gld;
import glj;
import glk;
import gma;
import gwb;
import ig;
import iil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import jca;
import jcf;
import jcm;
import kae;
import rw;
import wi;

public class ConversationListFragment extends dci<SwipeableListView, dbh> implements OnItemClickListener, cyl, fh<Cursor> {
    public static final boolean a;
    private static final gma an;
    private long aA;
    private long aB;
    private dth aC;
    private dth aD;
    private duh aE;
    private final jcm aF;
    private boolean aG;
    private erv aH;
    private era aI;
    public dug aj;
    public final Handler ak;
    public final Runnable al;
    public eqy am;
    private Uri ao;
    private Uri ap;
    private String[] aq;
    private Long[] ar;
    private View as;
    private int at;
    private boolean au;
    private boolean av;
    private View aw;
    private LinearLayout ax;
    private ImageView ay;
    private TextView az;
    public jca b;
    public jcf c;
    public bko d;
    public boolean e;
    public dbe f;
    public dbj g;
    public int h;
    public boj i;

    public class InviteListItem extends RelativeLayout {
        private String a;
        private bko b;

        public InviteListItem(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void a(bko bko, String str) {
            this.b = bko;
            this.a = str;
        }

        public void a() {
            if (this.a != null) {
                RealTimeChatService.a(this.b.g(), this.a, false, false, false);
            }
        }
    }

    public ConversationListFragment() {
        this.at = 1;
        this.h = -1;
        this.aA = -1;
        this.aB = -2;
        this.aE = new duh(this);
        this.aF = new day(this);
        this.ak = new Handler();
        this.al = new daz(this);
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    static {
        kae kae = glk.f;
        a = false;
        an = gma.a("ConversationListFragment");
    }

    public void a(dbj dbj) {
        this.g = dbj;
    }

    public void onCreate(Bundle bundle) {
        an.b("onCreate");
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.aI = new era(this);
        this.d = (bko) ba.a(fde.e(this.b.a()), (Object) "Fragment should not be instantiated unless there's a valid account.");
        if (a) {
            String valueOf = String.valueOf(this.d);
            new StringBuilder(String.valueOf(valueOf).length() + 37).append("ConversationListFragment setAccount: ").append(valueOf);
        }
        if (!(this.d == null || getActivity() == null)) {
            this.ao = EsProvider.a(EsProvider.h, this.d.g());
            this.ap = EsProvider.a(EsProvider.j, this.d.g());
            this.f = new dbe(this, this.d);
        }
        an.c("onCreate");
    }

    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.b = (jca) this.binder.a(jca.class);
        this.c = (jcf) this.binder.a(jcf.class);
        dti dti = (dti) this.binder.a(dti.class);
        this.aC = dti.a(17);
        this.aD = dti.a(18);
    }

    public void onStart() {
        super.onStart();
        ((dbh) this.bH).d();
        this.al.run();
        if (isEmpty()) {
            r();
        }
        this.c.a(this.aF);
        a(getView());
        ((SwipeableListView) getView().findViewById(16908298)).a(this.aE);
    }

    public void onStop() {
        super.onStop();
        this.ak.removeCallbacks(this.al);
        ((dbh) this.bH).c();
        this.c.b(this.aF);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f != null) {
            this.f.a(bundle);
        }
    }

    public void onDestroy() {
        if (this.am != null) {
            this.am.c();
        }
        super.onDestroy();
    }

    public void a(View view) {
        boolean a = a();
        glk.a("Babel_ConvListFragment", "updateView isLoading=" + a + " isEmpty=" + isEmpty(), new Object[0]);
        if (isEmpty() && a()) {
            showEmptyViewProgress(view);
            this.as.setVisibility(8);
            if (!this.aG) {
                this.aD.a("conversation_list_fragment_ui_loading_spinner");
                this.aG = true;
                return;
            }
            return;
        }
        if (!isEmpty() || this.h == 3) {
            showContent(view);
            if (v()) {
                this.as.setVisibility(8);
            } else {
                this.as.setVisibility(0);
            }
        } else {
            showEmptyView(view);
            this.as.setVisibility(8);
        }
        if (this.aG) {
            this.aD.a(this.d.g(), "conversation_list_fragment_ui_loading_spinner", glj.b(), 1);
            this.aG = false;
        }
    }

    protected void showEmptyView(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        OnClickListener onClickListener;
        switch (this.h) {
            case wi.w /*0*/:
                gwb.a(this.d, 2137);
                int i5 = bc.hm;
                int i6 = bc.hl;
                i = bc.hk;
                i2 = R$drawable.ay;
                i3 = i6;
                Object dba = new dba(this);
                i4 = i5;
                z = true;
                break;
            case wi.l /*2*/:
                i4 = bc.hi;
                onClickListener = null;
                z = false;
                i2 = R$drawable.ax;
                i = 0;
                i3 = 0;
                break;
            default:
                onClickListener = null;
                z = false;
                i2 = 0;
                i = 0;
                i3 = 0;
                i4 = 0;
                break;
        }
        gld.a(this.az, null, i4, 0, i3, i);
        if (this.ay == null) {
            this.ay = new ImageView(this.ax.getContext());
            this.ay.setImageResource(i2);
            this.ax.addView(this.ay, 0);
            this.ax.setClickable(z);
            this.ax.setOnClickListener(onClickListener);
        }
        super.showEmptyView(view);
    }

    protected void doShowEmptyViewProgress(View view) {
        boolean isEmpty = isEmpty();
        if (a) {
            new StringBuilder(43).append("doShowEmptyViewProgress cursorIsEmpty=").append(isEmpty);
        }
        if (isEmpty) {
            view.findViewById(16908292).setVisibility(8);
            view.findViewById(ba.cW).setVisibility(0);
        }
    }

    protected void showContent(View view) {
        if (this.ay != null) {
            this.ax.removeView(this.ay);
            this.ay = null;
        }
        super.showContent(view);
        view.findViewById(ba.cW).setVisibility(8);
    }

    protected boolean a() {
        return u() || !this.e;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(gwb.fZ, viewGroup, false);
        if (this.f != null) {
            dbe dbe = this.f;
            if (bundle != null) {
                dbe.b = (HashMap) bundle.getSerializable("last_archived");
            }
        }
        this.bI = (SwipeableListView) viewGroup2.findViewById(16908298);
        a(true);
        ((SwipeableListView) this.bI).setAccessibilityDelegate(new gis());
        ((SwipeableListView) this.bI).addHeaderView(layoutInflater.inflate(gwb.ha, this.bI, false), null, false);
        View inflate = layoutInflater.inflate(gwb.gY, this.bI, false);
        this.as = inflate.findViewById(ba.cZ);
        ((SwipeableListView) this.bI).addFooterView(inflate);
        this.as.setVisibility(8);
        ((SwipeableListView) this.bI).setOnItemClickListener(this);
        this.bH = new dbh(this, getActivity(), null, this.d, this);
        this.ax = (LinearLayout) viewGroup2.findViewById(ba.gn);
        this.ay = null;
        this.az = (TextView) viewGroup2.findViewById(ba.go);
        ((SwipeableListView) this.bI).setAdapter(this.bH);
        ((SwipeableListView) this.bI).setOnScrollListener(new dbb(this));
        ((SwipeableListView) this.bI).setRecyclerListener(new dbc(this));
        if (s() != 3) {
            ((SwipeableListView) this.bI).setChoiceMode(3);
            ((SwipeableListView) this.bI).setMultiChoiceModeListener(this.aI.b());
        }
        viewGroup2.setLayoutTransition(new LayoutTransition());
        return viewGroup2;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getLoaderManager().b(1, null, this);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        if (this.d == null) {
            return null;
        }
        switch (i) {
            case wi.j /*1*/:
                glk.c("Babel", "ConversationListFragment load started for display mode " + this.h, new Object[0]);
                this.aD.a("conversation_list_fragment_loader");
                ig<Cursor> boj;
                switch (this.h) {
                    case wi.w /*0*/:
                        boj = new boj(getActivity(), this.d, this.ao, dbi.a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0", new Object[]{"is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp"}), null, "invite_time_aggregate DESC,call_media_type DESC, sort_timestamp DESC");
                        this.i = boj;
                        return boj;
                    case wi.l /*2*/:
                        boj = new boj(getActivity(), this.d, this.ao, dbi.a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s != %s", new Object[]{"is_pending_leave", "is_pending_leave", "view", Integer.valueOf(2), "sort_timestamp", "status", Integer.valueOf(1)}), null, "call_media_type DESC, sort_timestamp DESC");
                        this.i = boj;
                        return boj;
                    case wi.z /*3*/:
                        String valueOf;
                        String stringBuilder;
                        String format = String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s == %d", new Object[]{"is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp", "status", Integer.valueOf(2)});
                        if (this.au) {
                            format = String.valueOf(format);
                            valueOf = String.valueOf(EsProvider.a("transport_type", "3"));
                            String valueOf2 = String.valueOf(EsProvider.a("transport_type", "2"));
                            format = new StringBuilder(((String.valueOf(format).length() + 12) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(format).append(" AND (").append(valueOf).append(" OR ").append(valueOf2).append(") ").toString();
                        }
                        if (this.av) {
                            format = String.valueOf(format);
                            valueOf = String.valueOf(EsProvider.a("transport_type", "1"));
                            stringBuilder = new StringBuilder((String.valueOf(format).length() + 6) + String.valueOf(valueOf).length()).append(format).append(" AND ").append(valueOf).append(" ").toString();
                        } else {
                            stringBuilder = format;
                        }
                        boj = new boj(getActivity(), this.d, this.ao, dbi.a, stringBuilder, null, "call_media_type DESC, sort_timestamp DESC");
                        this.i = boj;
                        return boj;
                    default:
                        iil.a("Loader created for unknown displayMode: " + this.h);
                        return null;
                }
            default:
                iil.a("Loader created for unknown id: " + i);
                return null;
        }
    }

    public void a(ig<Cursor> igVar, Cursor cursor) {
        boolean z = true;
        bko D = ((boj) igVar).D();
        if (D == null || this.d == null || !TextUtils.equals(D.a(), this.d.a())) {
            glk.d("Babel", "onLoadFinished called for mismatched account", new Object[0]);
        } else if (cursor == null) {
            glk.d("Babel", "onLoadFinished returned with null data", new Object[0]);
        } else if (igVar.p() == 1) {
            glk.c("Babel", "ConversationListFragment load finished with " + cursor.getCount() + " results", new Object[0]);
            this.aD.a(D.g(), "conversation_list_fragment_loader", glj.b(), 1);
            an.b("onLoadFinished");
            this.e = true;
            ((dbh) this.bH).a(cursor);
            if (isEmpty()) {
                r();
            }
            a(getView());
            an();
            if (this.am != null) {
                this.am.b();
            }
            this.f.a(cursor);
            if (((enl) igVar).l().equals(this.ap) && cursor.moveToFirst()) {
                long j = 0;
                do {
                    j = Math.max(j, cursor.getLong(4));
                } while (cursor.moveToNext());
                long k = gwb.k(this.context, D.g());
                if (a) {
                    if (j <= k) {
                        z = false;
                    }
                    new StringBuilder(84).append("new invite timestamp: ").append(j).append("; old ").append(k).append("; greater? ").append(z);
                }
                if (j > k) {
                    gwb.a(this.context, D.g(), gwb.a(Long.valueOf(j)));
                }
            }
            an.c("onLoadFinished");
            t();
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        if (igVar.p() == 1) {
            if (this.bH != null) {
                ((dbh) this.bH).b(null);
            }
            View view = getView();
            if (view != null) {
                showContent(view);
            }
        }
    }

    public void a(boolean z) {
        boolean z2 = true;
        if (this.bI != null) {
            SwipeableListView swipeableListView = (SwipeableListView) this.bI;
            if (!(z && this.h == 0 && !this.binder.b("show_dialer_in_tab", true))) {
                z2 = false;
            }
            swipeableListView.a(z2);
        }
    }

    public ListAdapter b() {
        if (this.bI != null && ((SwipeableListView) this.bI).getAdapter() != null) {
            return ((SwipeableListView) this.bI).getAdapter();
        }
        String str = "Babel";
        String str2 = "Null:";
        String valueOf = String.valueOf(this.bI == null ? "ListView" : "Adapter");
        glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        return null;
    }

    public Cursor a(int i) {
        ListAdapter b = b();
        return b == null ? null : (Cursor) b.getItem(i);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Cursor a = a(i);
        if (a != null) {
            c();
            View findViewById = view.findViewById(ba.ak);
            if (findViewById != null) {
                findViewById.setSelected(true);
                this.aw = findViewById;
            }
            String c = c(a);
            if (a.getInt(21) > 1 || a.getInt(14) == 1) {
                startActivity(gwb.m(this.context, this.b.a()));
                gwb.a(this.d, 1557);
            } else if (this.g != null) {
                this.aC.a("click_conversation_list");
                int i2 = a.getInt(3);
                String string = a.getString(24);
                if (string == null) {
                    string = "";
                }
                long j2 = a.getLong(27);
                String string2 = a.getString(6);
                a.getString(7);
                String string3 = a.getString(37);
                String string4 = a.getString(38);
                bcc bcc = new bcc(c, i2, Integer.parseInt(EsProvider.b(a.getString(29), (int) a(a))));
                bcc.f = new bkm(string);
                bcc.g = string2;
                bcc.h = j2;
                bcc.i = string3;
                bcc.j = string4;
                bcc.k = 1634;
                this.g.a(bcc);
            }
            if (this.am != null) {
                this.am.c();
            }
        }
    }

    public void c() {
        if (this.aw != null) {
            this.aw.setSelected(false);
            this.aw = null;
        }
    }

    public boolean d() {
        return this.am != null;
    }

    public boolean a(View view, int i) {
        Cursor a = a(((SwipeableListView) this.bI).getPositionForView(view));
        if (a == null) {
            return false;
        }
        int itemViewType = ((dbh) this.bH).getItemViewType(a.getPosition());
        boolean z = itemViewType == 1 || itemViewType == 2;
        if (i == ba.ey) {
            if (a.getInt(2) == 10 || z) {
                return false;
            }
            return true;
        } else if (i == ba.eC) {
            if (a.getInt(2) != 10 || z) {
                return false;
            }
            return true;
        } else if (i == ba.et) {
            if (a.getInt(15) == 2 || z) {
                return false;
            }
            return true;
        } else if (i == ba.eB) {
            if (a.getInt(15) != 2 || z) {
                return false;
            }
            return true;
        } else if (i == ba.ex) {
            r4 = gwb.i(a.getInt(29));
            if (a.getLong(3) != 2 || r4 || z) {
                return false;
            }
            return true;
        } else if (i == ba.eu) {
            r4 = gwb.i(a.getInt(29));
            if ((a.getLong(3) == 1 || r4) && !z) {
                return true;
            }
            return false;
        } else {
            iil.a("Unexpected action availability was requested. action(menu item ID): " + i);
            return false;
        }
    }

    public static long a(Cursor cursor) {
        int i;
        int i2 = 0;
        String string = cursor.getString(35);
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

    public static long b(Cursor cursor) {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        for (String str : gwb.m(cursor.getString(29))) {
            if (i3 == -1) {
                try {
                    if (Integer.parseInt(str) == 1) {
                        i3 = i2;
                    }
                } catch (NumberFormatException e) {
                }
            }
            i2++;
        }
        if (i3 != -1) {
            i = i3;
        }
        return (((long) i2) << 32) | ((long) i);
    }

    public static String c(Cursor cursor) {
        return EsProvider.b(cursor.getString(1), (int) a(cursor));
    }

    public void a(rw rwVar, int i, long[] jArr) {
        Cursor a = rwVar.a();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (long j : jArr) {
            a.moveToPosition(-1);
            while (a.moveToNext()) {
                if (a.getLong(0) == j) {
                    String c = c(a);
                    long j2 = a.getLong(4);
                    if (i == ba.ey) {
                        for (String b : gwb.m(c)) {
                            RealTimeChatService.b(this.d, b, 10);
                        }
                    } else if (i == ba.eC) {
                        for (String b2 : gwb.m(c)) {
                            RealTimeChatService.b(this.d, b2, 30);
                        }
                    } else if (i == ba.ex) {
                        for (String b22 : gwb.m(c)) {
                            arrayList.add(b22);
                        }
                    } else if (i == ba.eu) {
                        for (String b222 : gwb.m(c)) {
                            arrayList.add(b222);
                            arrayList2.add(Long.valueOf(j2));
                        }
                    } else if (i == ba.eB) {
                        for (String b2222 : gwb.m(c)) {
                            this.f.a(b2222, j2);
                        }
                    } else if (i == ba.et) {
                        this.f.a(c);
                        this.f.a(c, j2, true, false);
                    } else if (i == ba.eA) {
                        new dbd(this, c).execute(new Void[0]);
                    }
                }
            }
        }
        if (i == ba.et) {
            this.f.a();
        }
        if (i == ba.ex || i == ba.eu) {
            this.aq = (String[]) arrayList.toArray(new String[arrayList.size()]);
            if (i == ba.ex) {
                e();
                return;
            }
            this.ar = (Long[]) arrayList2.toArray(new Long[arrayList2.size()]);
            f(this.d.g());
        } else if (this.am != null) {
            this.am.c();
        }
    }

    public void e() {
        cyk a = cyk.a(getString(bc.ji), getString(bc.jh), getString(bc.jg), getString(bc.jE));
        a.setTargetFragment(this, 0);
        a.a(getFragmentManager(), "leave_conversation");
    }

    public void a(Bundle bundle, String str) {
        int i = 0;
        if (str.equals("leave_conversation")) {
            String[] strArr = this.aq;
            int length = strArr.length;
            while (i < length) {
                RealTimeChatService.g(this.d, strArr[i]);
                i++;
            }
        } else if (str.equals("delete_conversation")) {
            bko a = a(bundle);
            if (a != null) {
                while (i < this.aq.length) {
                    RealTimeChatService.a(a, this.aq[i], gwb.a(this.ar[i]));
                    i++;
                }
            }
        }
        if (this.am != null) {
            this.am.c();
        }
    }

    public void b_(String str) {
        if (str.equals("leave_conversation") && this.am != null) {
            this.am.c();
        }
    }

    public void b(String str) {
        if (str.equals("leave_conversation") && this.am != null) {
            this.am.c();
        }
    }

    public boolean q() {
        switch (this.h) {
            case wi.l /*2*/:
                b(0);
                return true;
            default:
                return false;
        }
    }

    public bkm c(String str) {
        if (this.bH == null) {
            return null;
        }
        Cursor a = ((dbh) this.bH).a();
        if (a == null || !a.moveToFirst()) {
            return null;
        }
        while (!TextUtils.equals(c(a), str)) {
            if (!a.moveToNext()) {
                return null;
            }
        }
        return new bkm(a.getString(24));
    }

    public static View b(View view) {
        return view.findViewById(ba.ak);
    }

    public void b(boolean z) {
        this.au = z;
    }

    public void c(boolean z) {
        this.av = z;
    }

    public void b(int i) {
        boolean z = false;
        if (a) {
            int i2 = this.h;
            String valueOf = String.valueOf(this.d);
            new StringBuilder(String.valueOf(valueOf).length() + 70).append("setDisplayMode: displayMode=").append(i2).append(", newMode=").append(i).append(", account=").append(valueOf);
        }
        if (i != this.h) {
            this.h = i;
            switch (this.h) {
                case wi.w /*0*/:
                    this.au = false;
                    if (this.aH == null) {
                        this.aH = new erv(this.lifecycle, new Class[]{dft.class, dfz.class, fzy.class, gaf.class, bdn.class}, ba.L);
                        break;
                    }
                    break;
                case wi.l /*2*/:
                    this.at = 2;
                    this.au = false;
                    z = true;
                    break;
                case wi.z /*3*/:
                    break;
                default:
                    iil.a("setDisplayMode called with unknown mode: " + this.h);
                    z = true;
                    break;
            }
            this.at = 1;
            a(true);
            a(-1, z);
        }
    }

    public boolean r() {
        if (!this.b.b() || v()) {
            return false;
        }
        if (a) {
            long j = this.aA;
            new StringBuilder(81).append("Requesting more conversations at ").append(j).append(" (last ").append(this.aB).append(")");
        }
        if (this.aB == this.aA) {
            return false;
        }
        this.aB = this.aA;
        RealTimeChatService.b(this.b.a(), this.at);
        return true;
    }

    public int s() {
        return this.h;
    }

    public static String c(int i) {
        if (i <= 99) {
            return String.valueOf(i);
        }
        return String.valueOf("99").concat("+");
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && this.am != null) {
            this.am.c();
        }
    }

    public void t() {
        if (this.c.c(this.d.g())) {
            long a = ((jcf) this.binder.a(jcf.class)).a(this.d.g()).a(EsProvider.a(this.at), -1);
            if (a == -3) {
                a = -2;
            }
            a(a, isEmpty());
            a(getView());
        }
    }

    private void a(long j, boolean z) {
        if (a) {
            int i = this.at;
            long j2 = this.aA;
            new StringBuilder(122).append("Updating continuation end timestamp for ").append(i).append(" from ").append(j2).append("/").append(this.aB).append(" to ").append(j);
        }
        this.aA = j;
        this.aB = -2;
        if (z) {
            r();
        }
    }

    public boolean u() {
        return this.aB != -2;
    }

    public boolean v() {
        return this.d == null || !this.b.b() || !this.d.n() || this.aA == -2;
    }

    public void a(int i, String str) {
        Cursor a = ((dbh) this.bH).a();
        a.moveToPosition(-1);
        while (a.moveToNext()) {
            if (str.equals(c(a))) {
                break;
            }
        }
        a = null;
        if (a != null) {
            a(this.bH, i, new long[]{a.getLong(0)});
        }
    }
}
