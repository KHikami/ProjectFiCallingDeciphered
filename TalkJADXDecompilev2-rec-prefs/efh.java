package p000;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.views.ConversationListItemView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class efh extends fmz<efa> {
    final /* synthetic */ eff f11366a;

    protected /* bridge */ /* synthetic */ void mo1862a(aer aer, Cursor cursor, int i) {
        m13784a(aer, (efa) cursor);
    }

    public efh(eff eff, int i, boolean z, boolean z2, fna fna) {
        this.f11366a = eff;
        super(i - 1, eey.f11330h - 1, true, false, fna);
    }

    protected void mo1861a(aer aer) {
        efj efj = (efj) aer;
        efj.f11368p.setText(gwb.sq);
        efj.f11368p.setFocusableInTouchMode(true);
    }

    private void m13784a(aer aer, efa efa) {
        List list;
        bko e = fde.m15018e(this.f11366a.f11349f);
        ConversationListItemView conversationListItemView = (ConversationListItemView) aer.f438a;
        if (TextUtils.isEmpty(this.f11366a.f11348e)) {
            list = null;
        } else {
            list = Arrays.asList(this.f11366a.f11348e.split("[\\s,]"));
            conversationListItemView.m9327a(list);
        }
        conversationListItemView.m9269a((Cursor) efa, e, false, null);
        Object string = efa.getString(efm.f11374a);
        if (!TextUtils.isEmpty(string)) {
            CharSequence a = this.f11366a.m13761a(string, list);
            if (a != null) {
                conversationListItemView.mo1216a(a);
                conversationListItemView.mo1229d(8);
                conversationListItemView.mo1211a(0);
            }
        }
        conversationListItemView.setOnClickListener(new efg(this.f11366a, efa.m13745a(), efa.getPosition(), this));
        conversationListItemView.setSelected(false);
        int i = efa.getInt(efm.f11375b);
        int i2 = efa.getInt(efm.f11376c);
        int i3 = efa.getInt(efm.f11377d);
        int position = efa.getPosition();
        mcs mcs = new mcs();
        mcs.f27365b = Integer.valueOf(1);
        mcs.f27366c = Integer.valueOf(position);
        List arrayList = new ArrayList();
        if (i > 0) {
            arrayList.add(Integer.valueOf(1));
        }
        if (i2 > 0) {
            arrayList.add(Integer.valueOf(2));
        }
        if (i3 > 0) {
            arrayList.add(Integer.valueOf(3));
        }
        if (!arrayList.isEmpty()) {
            i3 = arrayList.size();
            mcs.f27364a = new int[i3];
            for (i2 = 0; i2 < i3; i2++) {
                mcs.f27364a[i2] = gwb.m1507a((Integer) arrayList.get(i2));
            }
        }
        mcr mcr = new mcr();
        mcr.f27357a = Long.valueOf(efa.m13745a());
        mcr.f27360d = new mcs[1];
        mcr.f27360d[0] = mcs;
        ((iih) jyn.m25426a(this.f11366a.f11345b, iih.class)).mo1979a(this.f11366a.f11349f).mo1693b().mo1706a(mcr).mo1714c(3204);
    }
}
