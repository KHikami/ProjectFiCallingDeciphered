package com.google.android.apps.hangouts.content;

import android.content.Context;
import android.text.TextUtils;
import bhl;
import bkm;
import bko;
import glk;
import gwb;
import java.util.Map;
import jyn;
import kae;
import ky;

public class DraftService {
    private static final boolean a;
    private static final ky<Integer, Map<String, bkm>> b;

    static {
        kae kae = glk.d;
        a = false;
        b = new ky();
    }

    public static void a(Context context, bko bko, String str, bkm bkm) {
        gwb.aJ();
        if (a) {
            String valueOf = String.valueOf(glk.b(bko.a()));
            String valueOf2 = String.valueOf(bkm);
            new StringBuilder(((String.valueOf(valueOf).length() + 65) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append("DraftService.saveDraft> accountName=").append(valueOf).append(", conversationId=").append(str).append(", saveDraft=").append(valueOf2);
        }
        int g = bko.g();
        Map map = (Map) b.get(Integer.valueOf(g));
        if (map == null) {
            map = new ky();
            b.put(Integer.valueOf(g), map);
        }
        map.put(str, bkm);
        ((bhl) jyn.a(context, bhl.class)).a(new bkm(bkm.a, str, g));
    }

    public static bkm a(String str, bko bko) {
        gwb.aJ();
        if (a) {
            String valueOf = String.valueOf(glk.b(bko.a()));
            new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(str).length()).append("DraftService.getDraft> accountName=").append(valueOf).append(", conversationId=").append(str);
        }
        if (TextUtils.isEmpty(str) || bko == null) {
            return null;
        }
        Map map = (Map) b.get(Integer.valueOf(bko.g()));
        return map != null ? (bkm) map.get(str) : null;
    }
}
