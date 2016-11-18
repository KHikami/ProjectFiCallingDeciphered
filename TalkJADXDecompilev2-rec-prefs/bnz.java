package p000;

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
    public static AtomicReference<bod> f4077a = new AtomicReference(null);
    private static final long serialVersionUID = 1;

    public static void m6271a(int i) {
        if (i == -1) {
            glk.m17981d("Babel", "OzChatAclSettings.syncRemote: empty account", new Object[0]);
            return;
        }
        glk.m17970a("Babel", "OzChatAclSettings.syncRemote: syncing for " + i, new Object[0]);
        RealTimeChatService.m9097d(i);
    }

    public static void m6274a(fme fme, int i, boc boc, ets ets) {
        if (i == -1 || boc == null) {
            glk.m17981d("Babel", "OzChatAclSettings.setRemote: empty account or acl", new Object[0]);
            return;
        }
        if (glk.m17973a("Babel", 3)) {
            String valueOf = String.valueOf(ets);
            String str = boc.f4084b;
            String str2 = boc.f4085c;
            String str3 = boc.f4086d;
            glk.m17970a("Babel", new StringBuilder((((String.valueOf(valueOf).length() + 68) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("OzChatAclSettings.setRemote:aclType=").append(valueOf).append(",circleId=").append(str).append(",circleName=").append(str2).append(",newLevel=").append(str3).toString(), new Object[0]);
        }
        RealTimeChatService.m9040a(new boa(fme, i));
        RealTimeChatService.m9044a(fme, i, ets, boc.f4084b, boc.f4085c, boc.f4086d);
    }

    public static void m6273a(int i, boc boc, ets ets) {
        int a;
        jch a2 = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3456a(i);
        lo a3 = bnz.m6270a(a2);
        int a4 = bnz.m6267a(a2.mo3435a("chat_acl_settings_public", ""));
        int a5 = bnz.m6267a(a2.mo3435a("chat_acl_settings_phone", ""));
        int a6 = bnz.m6267a(a2.mo3435a("chat_acl_settings_email", ""));
        switch (bob.f4082a[ets.ordinal()]) {
            case 1:
                a = bnz.m6267a(boc.f4086d);
                a4 = a5;
                a5 = a6;
                break;
            case 2:
                a = a4;
                a4 = bnz.m6267a(boc.f4086d);
                a5 = a6;
                break;
            case 3:
                a = a4;
                a4 = a5;
                a5 = bnz.m6267a(boc.f4086d);
                break;
            case 4:
                a3.put(boc.f4084b, boc);
                break;
        }
        a = a4;
        a4 = a5;
        a5 = a6;
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < a3.size(); i2++) {
            boc boc2 = (boc) a3.m28018c(i2);
            exf exf = new exf();
            exf.f12436b = boc2.f4085c;
            exf.f12435a = boc2.f4084b;
            exf.f12437c = bnz.m6267a(boc2.f4086d);
            arrayList.add(exf);
        }
        bnz.m6272a(i, a, a4, a5, arrayList);
    }

    public static void m6272a(int i, int i2, int i3, int i4, List<exf> list) {
        int i5;
        int i6;
        jch b = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3464b(i);
        int a = bnz.m6275a((jck) b, "chat_acl_settings_email", b.mo3435a("chat_acl_settings_email", ""), bnz.m6281g(i4)) | ((bnz.m6275a((jck) b, "chat_acl_settings_public", b.mo3435a("chat_acl_settings_public", ""), bnz.m6281g(i2)) | 0) | bnz.m6275a((jck) b, "chat_acl_settings_phone", b.mo3435a("chat_acl_settings_phone", ""), bnz.m6281g(i3)));
        lo a2 = bnz.m6270a(b);
        int size = a2.size();
        jck f = b.m23894f("chat_acl_settings_circle");
        if (list != null) {
            i5 = 0;
            i6 = a;
            for (exf exf : list) {
                String str;
                if (TextUtils.isEmpty(exf.f12435a) || TextUtils.isEmpty(exf.f12436b)) {
                    str = exf.f12435a;
                    String str2 = exf.f12436b;
                    glk.m17981d("Babel", new StringBuilder((String.valueOf(str).length() + 79) + String.valueOf(str2).length()).append("OzChatAclSettings.save: received empty circle id or name:circleId=").append(str).append(", circleName=").append(str2).toString(), new Object[0]);
                } else {
                    boc boc = (boc) a2.get(exf.f12435a);
                    str = bnz.m6281g(exf.f12437c);
                    if (boc != null && exf.f12436b.equals(boc.f4085c) && str.equals(boc.f4086d)) {
                        a = i6;
                    } else {
                        a = 1;
                    }
                    f.mo3450h(Integer.toString(i5)).mo3445c("id", exf.f12435a).mo3445c("name", exf.f12436b).mo3445c("level", str);
                    i5++;
                    i6 = a;
                }
            }
        } else {
            i5 = 0;
            i6 = a;
        }
        f.mo3443c("count", i5);
        int i7 = (i5 < size ? 1 : 0) | i6;
        while (i5 < size) {
            f.mo3450h(Integer.toString(i5)).mo3451i("id").mo3451i("name").mo3451i("level");
            i5++;
        }
        if (i7 != 0) {
            b.m23891d();
            bnz.m6276b(i);
        }
    }

    static void m6276b(int i) {
        bod bod = (bod) f4077a.get();
        if (bod != null) {
            bod.N_();
        }
    }

    public static List<boc> m6277c(int i) {
        List<boc> arrayList = new ArrayList();
        jch d = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3456a(i).mo3449d("chat_acl_settings_circle");
        int a = d.mo3433a("count", 0);
        for (int i2 = 0; i2 < a; i2++) {
            jch d2 = d.mo3449d(Integer.toString(i2));
            String valueOf = String.valueOf("chat_acl_settings_circle");
            String valueOf2 = String.valueOf("level");
            boc boc = new boc(new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length()).append(i).append(".").append(valueOf).append(".").append(i2).append(".").append(valueOf2).toString(), d2.mo3440b("id"), d2.mo3440b("name"));
            boc.f4086d = d2.mo3440b("level");
            arrayList.add(boc);
        }
        return arrayList;
    }

    private static String m6269a(int i, String str) {
        return ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3456a(i).mo3435a(str, "INVITE");
    }

    public static String m6278d(int i) {
        return bnz.m6269a(i, "chat_acl_settings_public");
    }

    public static String m6279e(int i) {
        return bnz.m6269a(i, "chat_acl_settings_phone");
    }

    public static String m6280f(int i) {
        return bnz.m6269a(i, "chat_acl_settings_email");
    }

    private static lo<String, boc> m6270a(jch jch) {
        int i = 0;
        lo<String, boc> loVar = new lo();
        jch d = jch.mo3449d("chat_acl_settings_circle");
        int a = d.mo3433a("count", 0);
        while (i < a) {
            jch d2 = d.mo3449d(Integer.toString(i));
            boc boc = new boc(null, d2.mo3440b("id"), d2.mo3440b("name"));
            boc.f4086d = d2.mo3440b("level");
            loVar.put(boc.f4084b, boc);
            i++;
        }
        return loVar;
    }

    private static boolean m6275a(jck jck, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str3, str2)) {
            return false;
        }
        jck.mo3445c(str, str3);
        return true;
    }

    private static String m6281g(int i) {
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

    public static int m6267a(String str) {
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

    private static boc m6268a(String str, String str2) {
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

    public void mo625a(jck jck, SharedPreferences sharedPreferences, Editor editor) {
        List arrayList = new ArrayList();
        Map all = sharedPreferences.getAll();
        if (all != null) {
            for (Entry entry : all.entrySet()) {
                boc a = bnz.m6268a("chat_acl_settings_circle", (String) entry.getKey());
                if (a != null) {
                    a.f4086d = (String) entry.getValue();
                    arrayList.add(a);
                    editor.remove((String) entry.getKey());
                }
            }
        }
        jck h = jck.mo3450h("chat_acl_settings_circle");
        h.mo3443c("count", arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            boc boc = (boc) arrayList.get(i);
            h.mo3450h(Integer.toString(i)).mo3445c("id", boc.f4084b).mo3445c("name", boc.f4085c).mo3445c("level", boc.f4086d);
        }
    }
}
