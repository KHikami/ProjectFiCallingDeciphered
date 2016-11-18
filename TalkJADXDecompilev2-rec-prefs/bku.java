package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class bku implements jcn {
    final /* synthetic */ bkq f3665a;

    bku(bkq bkq) {
        this.f3665a = bkq;
    }

    public String mo547a() {
        return "accounts_util_upgrade";
    }

    public void mo548a(Context context, jck jck) {
        String str;
        Context context2;
        String str2;
        String b = jck.mo3440b("account_name");
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
            List<bjr> c = jyn.m25438c(context, bjr.class);
            Editor edit = sharedPreferences.edit();
            for (bjr a : c) {
                a.mo625a(jck, sharedPreferences, edit);
            }
            edit.apply();
            for (Entry entry : sharedPreferences.getAll().entrySet()) {
                str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    jck.mo3445c(str2, (String) value);
                } else if (value instanceof Boolean) {
                    jck.mo3447c(str2, gwb.m2061b((Boolean) value));
                } else if (value instanceof Integer) {
                    jck.mo3443c(str2, gwb.m1507a((Integer) value));
                } else if (value instanceof Long) {
                    jck.mo3444c(str2, gwb.m1523a((Long) value));
                } else if (value instanceof Float) {
                    jck.mo3441b(str2, gwb.m1480a((Float) value));
                } else if (value instanceof Set) {
                    jck.mo3446c(str2, (Set) value);
                } else if (value != null) {
                    str = String.valueOf(value);
                    iil.m21870a(new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(str2).length()).append("Missed value type: ").append(str).append(" for key: ").append(str2).toString());
                }
            }
            if (!"SMS".equals(b)) {
                sharedPreferences.edit().clear().apply();
            }
        }
    }
}
