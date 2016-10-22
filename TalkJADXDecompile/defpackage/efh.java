package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.views.ConversationListItemView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: efh */
final class efh extends fmz<efa> {
    final /* synthetic */ eff a;

    protected /* bridge */ /* synthetic */ void a(aer aer, Cursor cursor, int i) {
        a(aer, (efa) cursor);
    }

    public efh(eff eff, int i, boolean z, boolean z2, fna fna) {
        this.a = eff;
        super(i - 1, eey.h - 1, true, false, fna);
    }

    protected void a(aer aer) {
        efj efj = (efj) aer;
        efj.p.setText(gwb.sq);
        efj.p.setFocusableInTouchMode(true);
    }

    private void a(aer aer, efa efa) {
        List list;
        bko e = fde.e(this.a.f);
        ConversationListItemView conversationListItemView = (ConversationListItemView) aer.a;
        if (TextUtils.isEmpty(this.a.e)) {
            list = null;
        } else {
            list = Arrays.asList(this.a.e.split("[\\s,]"));
            conversationListItemView.a(list);
        }
        conversationListItemView.a((Cursor) efa, e, false, null);
        Object string = efa.getString(efm.a);
        if (!TextUtils.isEmpty(string)) {
            CharSequence a = this.a.a(string, list);
            if (a != null) {
                conversationListItemView.a(a);
                conversationListItemView.d(8);
                conversationListItemView.a(0);
            }
        }
        conversationListItemView.setOnClickListener(new efg(this.a, efa.a(), efa.getPosition(), this));
        conversationListItemView.setSelected(false);
        int i = efa.getInt(efm.b);
        int i2 = efa.getInt(efm.c);
        int i3 = efa.getInt(efm.d);
        int position = efa.getPosition();
        mcs mcs = new mcs();
        mcs.b = Integer.valueOf(1);
        mcs.c = Integer.valueOf(position);
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
            mcs.a = new int[i3];
            for (i2 = 0; i2 < i3; i2++) {
                mcs.a[i2] = gwb.a((Integer) arrayList.get(i2));
            }
        }
        mcr mcr = new mcr();
        mcr.a = Long.valueOf(efa.a());
        mcr.d = new mcs[1];
        mcr.d[0] = mcs;
        ((iih) jyn.a(this.a.b, iih.class)).a(this.a.f).b().a(mcr).c(3204);
    }
}
