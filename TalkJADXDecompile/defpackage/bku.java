package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: bku */
final class bku implements jcn {
    final /* synthetic */ bkq a;

    bku(bkq bkq) {
        this.a = bkq;
    }

    public String a() {
        return "accounts_util_upgrade";
    }

    public void a(Context context, jck jck) {
        String str;
        Context context2;
        String str2;
        String b = jck.b("account_name");
        if ("SMS".equals(b)) {
            str = "smsmms";
            context2 = context;
        } else {
            str2 = "account-";
            str = String.valueOf(b);
            if (str.length() != 0) {
                str = str2.concat(str);
                context2 = context;
            } else {
                str = new String(str2);
                context2 = context;
            }
        }
        SharedPreferences sharedPreferences = context2.getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            List<bjr> c = jyn.c(context, bjr.class);
            Editor edit = sharedPreferences.edit();
            for (bjr a : c) {
                a.a(jck, sharedPreferences, edit);
            }
            edit.apply();
            for (Entry entry : sharedPreferences.getAll().entrySet()) {
                str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    jck.c(str2, (String) value);
                } else if (value instanceof Boolean) {
                    jck.c(str2, gwb.b((Boolean) value));
                } else if (value instanceof Integer) {
                    jck.c(str2, gwb.a((Integer) value));
                } else if (value instanceof Long) {
                    jck.c(str2, gwb.a((Long) value));
                } else if (value instanceof Float) {
                    jck.b(str2, gwb.a((Float) value));
                } else if (value instanceof Set) {
                    jck.c(str2, (Set) value);
                } else if (value != null) {
                    str = String.valueOf(value);
                    iil.a(new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(str2).length()).append("Missed value type: ").append(str).append(" for key: ").append(str2).toString());
                }
            }
            if (!"SMS".equals(b)) {
                sharedPreferences.edit().clear().apply();
            }
        }
    }
}
