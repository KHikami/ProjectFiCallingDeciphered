package com.google.android.apps.hangouts.conversation.messagelist.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import ba;
import bko;
import btc;
import btd;
import btf;
import fde;
import fwy;
import jca;
import jyn;

public class AudioAttachmentView extends com.google.android.apps.hangouts.views.AudioAttachmentView implements btd {
    public AudioAttachmentView(Context context) {
        super(context);
    }

    public AudioAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudioAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void b(btf btf) {
    }

    public void a(btf btf) {
        long j;
        String string;
        long j2;
        String str;
        int i;
        bko e = fde.e(((jca) jyn.a(getContext(), jca.class)).a());
        if (btf.s.a(getContext()) == btc.AUDIO) {
            String a;
            if (TextUtils.isEmpty(btf.s.k)) {
                a = btf.s.a();
            } else {
                a = btf.s.l;
            }
            j = TextUtils.isEmpty(btf.s.k) ? 0 : btf.s.q;
            string = getResources().getString(ba.hF);
            j2 = 0;
            str = a;
        } else {
            str = btf.s.l;
            j = btf.s.q;
            string = getResources().getString(ba.iU);
            j2 = (long) btf.s.r;
        }
        if (btf.k) {
            if (btf.i == fwy.OUTGOING_USER_MESSAGE) {
                i = ba.ho;
            } else {
                i = ba.hm;
            }
        } else if (btf.i == fwy.OUTGOING_USER_MESSAGE) {
            i = ba.hn;
        } else {
            i = ba.hl;
        }
        a(e, str, j, btf.s.k, btf.b, btf.s.j, string, j2, getResources().getColor(i));
    }

    public boolean a() {
        return true;
    }
}
