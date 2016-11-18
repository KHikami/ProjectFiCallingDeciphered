package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

public final class bnz implements bjr, Serializable {
    public static AtomicReference<bod> a = new AtomicReference(null);
    private static final long serialVersionUID = 1;

    public static void a(int i) {
        if (i == -1) {
            glk.d("Babel", "OzChatAclSettings.syncRemote: empty account", new Object[0]);
            return;
        }
        glk.a("Babel", "OzChatAclSettings.syncRemote: syncing for " + i, new Object[0]);
        RealTimeChatService.d(i);
    }

    public static void a(fme fme, int i, boc boc, ets ets) {
        if (i == -1 || boc == null) {
            glk.d("Babel", "OzChatAclSettings.setRemote: empty account or acl", new Object[0]);
            return;
        }
        if (glk.a("Babel", 3)) {
            String valueOf = String.valueOf(ets);
            String str = boc.b;
            String str2 = boc.c;
            String str3 = boc.d;
            glk.a("Babel", new StringBuilder((((String.valueOf(valueOf).length() + 68) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("OzChatAclSettings.setRemote:aclType=").append(valueOf).append(",circleId=").append(str).append(",circleName=").append(str2).append(",newLevel=").append(str3).toString(), new Object[0]);
        }
        RealTimeChatService.a(new boa(fme, i));
        RealTimeChatService.a(fme, i, ets, boc.b, boc.c, boc.d);
    }

    public static void a(int i, boc boc, ets ets) {
        int a;
        jch a2 = ((jcf) jyn.a(gwb.H(), jcf.class)).a(i);
        lo a3 = bnz.a(a2);
        int a4 = bnz.a(a2.a("chat_acl_settings_public", ""));
        int a5 = bnz.a(a2.a("chat_acl_settings_phone", ""));
        int a6 = bnz.a(a2.a("chat_acl_settings_email", ""));
        switch (bob.a[ets.ordinal()]) {
            case 1:
                a = bnz.a(boc.d);
                a4 = a5;
                a5 = a6;
                break;
            case 2:
                a = a4;
                a4 = bnz.a(boc.d);
                a5 = a6;
                break;
            case 3:
                a = a4;
                a4 = a5;
                a5 = bnz.a(boc.d);
                break;
            case 4:
                a3.put(boc.b, boc);
                break;
        }
        a = a4;
        a4 = a5;
        a5 = a6;
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < a3.size(); i2++) {
            boc boc2 = (boc) a3.c(i2);
            exf exf = new exf();
            exf.b = boc2.c;
            exf.a = boc2.b;
            exf.c = bnz.a(boc2.d);
            arrayList.add(exf);
        }
        bnz.a(i, a, a4, a5, arrayList);
    }

    public static void a(int i, int i2, int i3, int i4, List<exf> list) {
        int i5;
        int i6;
        jch b = ((jcf) jyn.a(gwb.H(), jcf.class)).b(i);
        int a = bnz.a((jck) b, "chat_acl_settings_email", b.a("chat_acl_settings_email", ""), bnz.g(i4)) | ((bnz.a((jck) b, "chat_acl_settings_public", b.a("chat_acl_settings_public", ""), bnz.g(i2)) | 0) | bnz.a((jck) b, "chat_acl_settings_phone", b.a("chat_acl_settings_phone", ""), bnz.g(i3)));
        lo a2 = bnz.a(b);
        int size = a2.size();
        jck f = b.f("chat_acl_settings_circle");
        if (list != null) {
            i5 = 0;
            i6 = a;
            for (exf exf : list) {
                String str;
                if (TextUtils.isEmpty(exf.a) || TextUtils.isEmpty(exf.b)) {
                    str = exf.a;
                    String str2 = exf.b;
                    glk.d("Babel", new StringBuilder((String.valueOf(str).length() + 79) + String.valueOf(str2).length()).append("OzChatAclSettings.save: received empty circle id or name:circleId=").append(str).append(", circleName=").append(str2).toString(), new Object[0]);
                } else {
                    boc boc = (boc) a2.get(exf.a);
                    str = bnz.g(exf.c);
                    if (boc != null && exf.b.equals(boc.c) && str.equals(boc.d)) {
                        a = i6;
                    } else {
                        a = 1;
                    }
                    f.h(Integer.toString(i5)).c("id", exf.a).c("name", exf.b).c("level", str);
                    i5++;
                    i6 = a;
                }
            }
        } else {
            i5 = 0;
            i6 = a;
        }
        f.c("count", i5);
        int i7 = (i5 < size ? 1 : 0) | i6;
        while (i5 < size) {
            f.h(Integer.toString(i5)).i("id").i("name").i("level");
            i5++;
        }
        if (i7 != 0) {
            b.d();
            bnz.b(i);
        }
    }

    static void b(int i) {
        bod bod = (bod) a.get();
        if (bod != null) {
            bod.N_();
        }
    }

    public static List<boc> c(int i) {
        List<boc> arrayList = new ArrayList();
        jch d = ((jcf) jyn.a(gwb.H(), jcf.class)).a(i).d("chat_acl_settings_circle");
        int a = d.a("count", 0);
        for (int i2 = 0; i2 < a; i2++) {
            jch d2 = d.d(Integer.toString(i2));
            String valueOf = String.valueOf("chat_acl_settings_circle");
            String valueOf2 = String.valueOf("level");
            boc boc = new boc(new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length()).append(i).append(".").append(valueOf).append(".").append(i2).append(".").append(valueOf2).toString(), d2.b("id"), d2.b("name"));
            boc.d = d2.b("level");
            arrayList.add(boc);
        }
        return arrayList;
    }

    private static String a(int i, String str) {
        return ((jcf) jyn.a(gwb.H(), jcf.class)).a(i).a(str, "INVITE");
    }

    public static String d(int i) {
        return bnz.a(i, "chat_acl_settings_public");
    }

    public static String e(int i) {
        return bnz.a(i, "chat_acl_settings_phone");
    }

    public static String f(int i) {
        return bnz.a(i, "chat_acl_settings_email");
    }

    private static lo<String, boc> a(jch jch) {
        int i = 0;
        lo<String, boc> loVar = new lo();
        jch d = jch.d("chat_acl_settings_circle");
        int a = d.a("count", 0);
        while (i < a) {
            jch d2 = d.d(Integer.toString(i));
            boc boc = new boc(null, d2.b("id"), d2.b("name"));
            boc.d = d2.b("level");
            loVar.put(boc.b, boc);
            i++;
        }
        return loVar;
    }

    private static boolean a(jck jck, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str3, str2)) {
            return false;
        }
        jck.c(str, str3);
        return true;
    }

    private static String g(int i) {
        if (i == 20) {
            return "INVITE";
        }
        if (i == 50) {
            return "RING";
        }
        if (i == 10) {
            return "BLOCKED";
        }
        return null;
    }

    public static int a(String str) {
        if (TextUtils.equals("RING", str)) {
            return 50;
        }
        if (TextUtils.equals("INVITE", str)) {
            return 20;
        }
        if (TextUtils.equals("BLOCKED", str)) {
            return 10;
        }
        return 0;
    }

    private static boc a(String str, String str2) {
        if (str2 != null) {
            try {
                if (str2.startsWith(str)) {
                    String[] split = str2.substring(str.length() + 1).split("_");
                    if (split.length > 1) {
                        byte[] decode = Base64.decode(split[0], 2);
                        byte[] decode2 = Base64.decode(split[1], 2);
                        if (!(decode == null || decode2 == null)) {
                            return new boc(str2, new String(decode, "UTF-8"), new String(decode2, "UTF-8"));
                        }
                    }
                }
            } catch (UnsupportedEncodingException e) {
            }
        }
        return null;
    }

    public void a(jck jck, SharedPreferences sharedPreferences, Editor editor) {
        List arrayList = new ArrayList();
        Map all = sharedPreferences.getAll();
        if (all != null) {
            for (Entry entry : all.entrySet()) {
                boc a = bnz.a("chat_acl_settings_circle", (String) entry.getKey());
                if (a != null) {
                    a.d = (String) entry.getValue();
                    arrayList.add(a);
                    editor.remove((String) entry.getKey());
                }
            }
        }
        jck h = jck.h("chat_acl_settings_circle");
        h.c("count", arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            boc boc = (boc) arrayList.get(i);
            h.h(Integer.toString(i)).c("id", boc.b).c("name", boc.c).c("level", boc.d);
        }
    }
}
