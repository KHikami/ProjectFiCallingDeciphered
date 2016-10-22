package com.google.android.apps.hangouts.conversation.v2;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Spinner;
import bc;
import bls;
import bpd;
import bpe;
import ciu;
import civ;
import ciw;
import cix;
import erm;
import fzw;
import gwb;
import java.util.List;
import jca;
import jyn;
import kbc;
import kbu;

public class TransportSpinner extends Spinner {
    public int a;
    public cix b;
    public boolean c;
    public boolean d;
    public View e;
    public bpd f;
    private fzw g;
    private String h;
    private boolean i;
    private bpe j;
    private List<bpd> k;
    private erm l;

    public TransportSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(jyn jyn) {
        this.b = new cix(this, getContext(), gwb.fX);
        this.g = (fzw) jyn.a(fzw.class);
        setAdapter(this.b);
        this.a = ((jca) jyn.a(jca.class)).a();
        this.j = (bpe) jyn.a(bpe.class);
        this.j.a(new ciu(this));
        this.l = new ciw(this, getContext(), (kbu) jyn.a(kbc.class), this.a);
    }

    public boolean performClick() {
        this.j.d();
        return super.performClick();
    }

    public void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.b.notifyDataSetChanged();
        }
    }

    public void a(bpd bpd) {
        while (true) {
            int count = this.b.getCount();
            for (int i = 0; i < count; i++) {
                if (getItemAtPosition(i) == bpd) {
                    setSelection(i);
                    return;
                }
            }
            if (!this.i && bpd != null && this.k.contains(bpd)) {
                a();
            } else {
                return;
            }
        }
    }

    public void setSelection(int i) {
        Object itemAtPosition = getItemAtPosition(i);
        if (itemAtPosition instanceof bpd) {
            super.setSelection(i);
            this.j.a((bpd) itemAtPosition);
        }
    }

    public void a(List<bpd> list) {
        int i = 8;
        this.k = list;
        if (!this.g.d()) {
            list = null;
        }
        this.b.clear();
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            return;
        }
        boolean z;
        if (list.size() > 1) {
            i = 0;
        }
        setVisibility(i);
        setEnabled(list.size() > 1);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (bpd bpd : list) {
            int i5;
            int i6 = bpd.b;
            if (!TextUtils.isEmpty(bpd.e)) {
                if (bpd.i != null) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                i4 |= i5;
            }
            i3 |= gwb.h(i6);
            i2 |= gwb.l(i6);
            if (this.h == null && gwb.j(i6)) {
                this.h = bpd.a();
            }
        }
        this.l.a(this.h);
        cix cix = this.b;
        if (i3 == 0 || i2 == 0) {
            z = false;
        } else {
            z = true;
        }
        cix.a = z;
        if (this.i || i4 == 0) {
            i2 = 0;
        } else {
            i2 = 0;
            for (bpd bpd2 : list) {
                if (TextUtils.isEmpty(bpd2.e)) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if (bpd2.i != null) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (bpd2 == this.f) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (i == 0 && r4 != 0 && r5 == 0) {
                    i = i2 + 1;
                } else {
                    i = i2;
                }
                i2 = i;
            }
        }
        i2 = i2 > 1 ? 1 : 0;
        for (bpd bpd22 : list) {
            if (i2 != 0) {
                if (TextUtils.isEmpty(bpd22.e)) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if (bpd22.i != null) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (bpd22 == this.f) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                if (i5 == 0 && r4 != 0 && r5 == 0) {
                }
            }
            this.b.insert(bpd22, 0);
        }
        if (i2 != 0) {
            this.b.insert(new civ(this), 0);
        }
        a(this.f);
        b();
    }

    public void a() {
        this.i = true;
        a(this.k);
    }

    public void b() {
        CharSequence charSequence;
        String str = null;
        if (this.k != null) {
            bpd bpd;
            int i;
            int i2 = 0;
            int i3 = 0;
            for (bpd bpd2 : this.k) {
                if (!TextUtils.isEmpty(bpd2.e)) {
                    i = 1;
                    i2 = i3;
                } else if (gwb.j(bpd2.b)) {
                    i = i2;
                    i2 = 1;
                } else {
                    i = i2;
                    i2 = i3;
                }
                if (i != 0 && i2 != 0) {
                    break;
                }
                i3 = i2;
                i2 = i;
            }
            i = i2;
            i2 = i3;
            Resources resources = getContext().getResources();
            if (i2 == 0 || r0 == 0) {
                charSequence = null;
            } else {
                charSequence = resources.getString(bc.tf);
            }
            if (this.k == null || this.k.isEmpty() || getSelectedItemPosition() >= this.b.getCount()) {
                bpd2 = null;
            } else {
                bpd2 = (bpd) getSelectedItem();
            }
            if (bpd2 != null) {
                if (!TextUtils.isEmpty(bpd2.e)) {
                    str = resources.getString(bc.te);
                } else if (bpd2.h != null) {
                    String str2;
                    bls bls = bpd2.i;
                    if (bls != null && !TextUtils.isEmpty(bls.o)) {
                        str2 = bls.o;
                    } else if (TextUtils.isEmpty(bpd2.d)) {
                        str2 = resources.getString(bc.tb);
                    } else {
                        str2 = bpd2.d;
                    }
                    if (this.c) {
                        i3 = bc.td;
                    } else {
                        i3 = bc.tg;
                    }
                    str = resources.getString(i3, new Object[]{str2});
                }
            }
            if (str != null) {
                if (charSequence == null) {
                    charSequence = str;
                } else {
                    charSequence = resources.getString(bc.ta, new Object[]{str, charSequence});
                }
            }
        } else {
            charSequence = null;
        }
        setContentDescription(charSequence);
    }
}
