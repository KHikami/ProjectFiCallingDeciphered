package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import bc;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import dr;
import ed;
import ew;
import gow;
import goy;
import goz;
import java.util.ArrayList;
import java.util.List;
import np;

public class MainViewPager extends gow {
    public static final goy d;
    public static final goy e;
    private goz f;
    private int g;
    private boolean h;

    static {
        d = new goy(ConversationListFragment.class, "conversations", bc.sS, R$drawable.aK, 1546);
        e = new goy(CallContactPickerFragment.class, "phone_calls", bc.sR, R$drawable.aN, 1547);
    }

    public MainViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
    }

    public goz h() {
        return this.f;
    }

    public goy i() {
        if (this.f != null) {
            int c = c();
            int a = this.f.a();
            if (c >= 0 && c < a) {
                return this.f.d(c);
            }
        }
        return null;
    }

    public boolean a(String str) {
        if (!(str == null || this.f == null)) {
            int a = this.f.a(str);
            if (a >= 0) {
                b(a);
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f != null;
    }

    public boolean a(int i, ed edVar, boolean z) {
        if (this.g == i && this.h == z) {
            return false;
        }
        List arrayList = new ArrayList(edVar.d());
        List arrayList2 = new ArrayList(2);
        if (i != -1) {
            arrayList2.add(d);
            if (z) {
                arrayList2.add(e);
            }
        }
        this.f = new goz(edVar, getContext(), i, arrayList2, 2);
        a((np) this.f);
        a(edVar, arrayList, new ArrayList(edVar.d()));
        this.g = i;
        this.h = z;
        return true;
    }

    private void a(ed edVar, List<dr> list, List<dr> list2) {
        ew a = edVar.a();
        for (dr drVar : list) {
            Object obj;
            if ((drVar instanceof ConversationListFragment) || (drVar instanceof CallContactPickerFragment)) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                if (!drVar.isDetached()) {
                    if (this.f.a(drVar.getClass())) {
                        for (dr drVar2 : list2) {
                            if (drVar2 != null && drVar.getClass().equals(drVar2.getClass()) && drVar != drVar2) {
                                a.a(drVar);
                                break;
                            }
                        }
                    } else {
                        a.a(drVar);
                    }
                } else {
                    a.a(drVar);
                }
            }
        }
        a.b();
        edVar.b();
    }
}
