package p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map.Entry;

public class fdq implements bjr, dpo, ffw {
    public static final eso f12759A = new eso("23dac235", false);
    static final eso f12760B = new eso("173eb495", false);
    public static final eso f12761C = new eso("c639d94f", false);
    public static final eso f12762D = new eso("d991dc99", false);
    public static final eso f12763E = new eso("c69e4cb6", false);
    public static final eso f12764F = new eso("1d9a5232", false);
    public static final eso f12765G = new eso("5dd768ee", false);
    public static final eso f12766H = new eso("426beee1", 300);
    public static final eso f12767I = new eso("f98d68c1", false);
    public static final eso f12768J = new eso("2c6963eb", false);
    public static final eso f12769K = new eso("b32115c2", false);
    public static final eso f12770L = new eso("98a5c1c6", false);
    public static final eso f12771M = new eso("4b3b2c63", false);
    public static final eso f12772N = new eso("f6244fad", false);
    public static final eso f12773O = new eso("aa269660", false);
    public static final eso f12774P = new eso("c4475777", false);
    public static final eso f12775Q = new eso("7e09678c", false);
    public static final eso f12776R = new eso("8dbc426f", false);
    public static final eso f12777S = new eso("9f7b2b8c", false);
    private static final eso f12778T = new eso("cfd3274b", false);
    private static final eso f12779U = new eso("dd69e883", true);
    private static final eso f12780V = new eso("e830ee0f", false);
    private static final eso f12781W = new eso("28de1a65", false);
    private static final eso f12782X = new eso("638c9a45", false);
    private static final eso f12783Y = new eso("6cd8df27", false);
    private static final eso f12784Z = new eso("66ac36b8", false);
    public static final eso f12785a = new eso("6ab26889", false);
    private static final eso aa = new eso("f193cbe1", false);
    private static final eso ab = new eso("cfefa79c", false);
    private static final eso ac = new eso("2ac96fbb", true);
    private static final eso ad = new eso("46b64eff", false);
    private static final eso[] ae = new eso[]{f12782X, f12797m, f12778T, f12779U, ab, f12773O, f12768J, f12772N, f12786b, f12789e, f12777S, f12776R, f12761C, f12765G, f12760B, f12790f, f12791g, f12762D, f12759A, f12780V, f12799o, f12800p, f12798n, f12805u, f12764F, f12775Q, f12774P, f12770L, f12807w, f12803s, f12804t, f12785a, f12802r, f12788d, f12767I, f12783Y, f12801q, f12771M, ad, ac, f12769K, f12806v, f12793i, f12792h, f12794j, f12787c, f12810z, f12795k, f12796l, f12763E, f12781W, f12784Z, aa, f12808x, f12809y, f12766H};
    public static final eso f12786b = new eso("de9507e5", false);
    public static final eso f12787c = new eso("715d526b", false);
    public static final eso f12788d = new eso("5d18028f", false);
    public static final eso f12789e = new eso("99c978d5", false);
    public static final eso f12790f = new eso("8ce9147e", false);
    public static final eso f12791g = new eso("1f6beb98", false);
    public static final eso f12792h = new eso("c678ad4c", true);
    public static final eso f12793i = new eso("3d19c", false);
    public static final eso f12794j = new eso("44afde42", false);
    public static final eso f12795k = new eso("921c6ef1", 60000);
    public static final eso f12796l = new eso("92acc909", 1);
    public static final eso f12797m = new eso("740e8ae0", 0);
    public static final eso f12798n = new eso("79b46bfb", false);
    public static final eso f12799o = new eso("1c54e739", false);
    public static final eso f12800p = new eso("fc4914ca", false);
    public static final eso f12801q = new eso("bf9b09ab", false);
    public static final eso f12802r = new eso("e37a36b1", false);
    public static final eso f12803s = new eso("aa48e46b", false);
    public static final eso f12804t = new eso("eeaee535", false);
    public static final eso f12805u = new eso("b207e4ac", false);
    public static final eso f12806v = new eso("b95a58f5", false);
    public static final eso f12807w = new eso("44cc58db", false);
    public static final eso f12808x = new eso("c86b39d9", true);
    public static final eso f12809y = new eso("1e345451", false);
    public static final eso f12810z = new eso("be12bbc2", false);
    private final Context af;

    public static boolean m15090a(Context context, int i) {
        if (jyn.m25432a(context, "allow_video_attachments", false) && ac.m14370b(i)) {
            return true;
        }
        return false;
    }

    fdq(Context context) {
        this.af = context;
    }

    public static eso m15088a(String str) {
        for (eso eso : ae) {
            if (eso.m14369b().equals(str)) {
                return eso;
            }
        }
        return null;
    }

    public static String m15089a(int i) {
        if (((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3467c(i)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (eso eso : ae) {
                stringBuilder.append(eso.m14369b());
                stringBuilder.append(":");
                if (eso.m14365a() == 1) {
                    stringBuilder.append(eso.m14370b(i));
                } else if (eso.m14365a() == 2) {
                    stringBuilder.append(eso.m14371c(i));
                }
                stringBuilder.append(";");
            }
            return stringBuilder.toString();
        }
        glk.m17981d("BabelExperiments", "Getting experiment signatures for invalid account " + i, new Object[0]);
        return "invalid_account";
    }

    public void mo536a(jck jck, eyc eyc) {
        int i = 0;
        int b = ((jcf) jyn.m25426a(this.af, jcf.class)).mo3462b(jck.mo3440b("account_name"), jck.mo3440b("effective_gaia_id"));
        if (b == -1) {
            glk.m17981d("BabelExperiments", "Pre-computing loggable experiments for invalid account " + b, new Object[0]);
            return;
        }
        Iterable arrayList = new ArrayList();
        eso[] esoArr = ae;
        int length = esoArr.length;
        while (i < length) {
            eso eso = esoArr[i];
            if (eso.m14372c()) {
                Object concat = String.valueOf(eso.m14369b()).concat(":");
                String valueOf;
                if (eso.m14365a() == 1) {
                    String valueOf2 = String.valueOf(concat);
                    valueOf = String.valueOf(eso.m14370b(b) ? "1" : "0");
                    concat = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
                } else if (eso.m14365a() == 2) {
                    valueOf = String.valueOf(concat);
                    concat = new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(eso.m14371c(b)).toString();
                }
                arrayList.add(concat);
            }
            i++;
        }
        jck.mo3445c("loggable_experiments", meu.m31960a(";").m31963a(arrayList));
    }

    public static String[] m15092b(int i) {
        jcf jcf = (jcf) jyn.m25426a(gwb.m1400H(), jcf.class);
        if (jcf.mo3467c(i)) {
            String b = jcf.mo3456a(i).mo3440b("loggable_experiments");
            if (b == null) {
                return new String[0];
            }
            return b.split(";");
        }
        glk.m17981d("BabelExperiments", "Getting loggable experiments for invalid account " + i, new Object[0]);
        return new String[0];
    }

    public void mo1455a(Activity activity, Bundle bundle) {
        Object a = fdq.m15089a(((jca) jyn.m25426a((Context) activity, jca.class)).mo2317a());
        if (!TextUtils.isEmpty(a)) {
            bundle.putString("exp", a);
        }
    }

    public void mo625a(jck jck, SharedPreferences sharedPreferences, Editor editor) {
        jck h = jck.mo3450h("babel_exp");
        jck h2 = jck.mo3450h("babel_exp_override");
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            if (fdq.m15091a("BABEL_EXP_", h, entry) || fdq.m15091a("OVERRIDE_BABEL_EXP_", h2, entry)) {
                editor.remove((String) entry.getKey());
            }
        }
        editor.apply();
    }

    private static boolean m15091a(String str, jck jck, Entry<String, ?> entry) {
        String str2 = (String) entry.getKey();
        if (str2 == null) {
            String valueOf = String.valueOf(entry.getValue());
            glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Unexpected null key; value = ").append(valueOf).toString(), new Object[0]);
            return false;
        } else if (!str2.startsWith(str)) {
            return false;
        } else {
            String substring = str2.substring(str.length());
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                jck.mo3447c(substring, gwb.m2061b((Boolean) value));
            } else if (value instanceof Long) {
                jck.mo3444c(substring, gwb.m1523a((Long) value));
            } else {
                str2 = String.valueOf(value);
                iil.m21870a(new StringBuilder((String.valueOf(str2).length() + 27) + String.valueOf(substring).length()).append("Unexpected babel exp: ").append(str2).append(" for ").append(substring).toString());
            }
            return true;
        }
    }
}
