package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map.Entry;

public class fdq implements bjr, dpo, ffw {
    public static final eso A = new eso("23dac235", false);
    static final eso B = new eso("173eb495", false);
    public static final eso C = new eso("c639d94f", false);
    public static final eso D = new eso("d991dc99", false);
    public static final eso E = new eso("c69e4cb6", false);
    public static final eso F = new eso("1d9a5232", false);
    public static final eso G = new eso("5dd768ee", false);
    public static final eso H = new eso("426beee1", 300);
    public static final eso I = new eso("f98d68c1", false);
    public static final eso J = new eso("2c6963eb", false);
    public static final eso K = new eso("b32115c2", false);
    public static final eso L = new eso("98a5c1c6", false);
    public static final eso M = new eso("4b3b2c63", false);
    public static final eso N = new eso("f6244fad", false);
    public static final eso O = new eso("aa269660", false);
    public static final eso P = new eso("c4475777", false);
    public static final eso Q = new eso("7e09678c", false);
    public static final eso R = new eso("8dbc426f", false);
    public static final eso S = new eso("9f7b2b8c", false);
    private static final eso T = new eso("cfd3274b", false);
    private static final eso U = new eso("dd69e883", true);
    private static final eso V = new eso("e830ee0f", false);
    private static final eso W = new eso("28de1a65", false);
    private static final eso X = new eso("638c9a45", false);
    private static final eso Y = new eso("6cd8df27", false);
    private static final eso Z = new eso("66ac36b8", false);
    public static final eso a = new eso("6ab26889", false);
    private static final eso aa = new eso("f193cbe1", false);
    private static final eso ab = new eso("cfefa79c", false);
    private static final eso ac = new eso("2ac96fbb", true);
    private static final eso ad = new eso("46b64eff", false);
    private static final eso[] ae = new eso[]{X, m, T, U, ab, O, J, N, b, e, S, R, C, G, B, f, g, D, A, V, o, p, n, u, F, Q, P, L, w, s, t, a, r, d, I, Y, q, M, ad, ac, K, v, i, h, j, c, z, k, l, E, W, Z, aa, x, y, H};
    public static final eso b = new eso("de9507e5", false);
    public static final eso c = new eso("715d526b", false);
    public static final eso d = new eso("5d18028f", false);
    public static final eso e = new eso("99c978d5", false);
    public static final eso f = new eso("8ce9147e", false);
    public static final eso g = new eso("1f6beb98", false);
    public static final eso h = new eso("c678ad4c", true);
    public static final eso i = new eso("3d19c", false);
    public static final eso j = new eso("44afde42", false);
    public static final eso k = new eso("921c6ef1", 60000);
    public static final eso l = new eso("92acc909", 1);
    public static final eso m = new eso("740e8ae0", 0);
    public static final eso n = new eso("79b46bfb", false);
    public static final eso o = new eso("1c54e739", false);
    public static final eso p = new eso("fc4914ca", false);
    public static final eso q = new eso("bf9b09ab", false);
    public static final eso r = new eso("e37a36b1", false);
    public static final eso s = new eso("aa48e46b", false);
    public static final eso t = new eso("eeaee535", false);
    public static final eso u = new eso("b207e4ac", false);
    public static final eso v = new eso("b95a58f5", false);
    public static final eso w = new eso("44cc58db", false);
    public static final eso x = new eso("c86b39d9", true);
    public static final eso y = new eso("1e345451", false);
    public static final eso z = new eso("be12bbc2", false);
    private final Context af;

    public static boolean a(Context context, int i) {
        if (jyn.a(context, "allow_video_attachments", false) && ac.b(i)) {
            return true;
        }
        return false;
    }

    fdq(Context context) {
        this.af = context;
    }

    public static eso a(String str) {
        for (eso eso : ae) {
            if (eso.b().equals(str)) {
                return eso;
            }
        }
        return null;
    }

    public static String a(int i) {
        if (((jcf) jyn.a(gwb.H(), jcf.class)).c(i)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (eso eso : ae) {
                stringBuilder.append(eso.b());
                stringBuilder.append(":");
                if (eso.a() == 1) {
                    stringBuilder.append(eso.b(i));
                } else if (eso.a() == 2) {
                    stringBuilder.append(eso.c(i));
                }
                stringBuilder.append(";");
            }
            return stringBuilder.toString();
        }
        glk.d("BabelExperiments", "Getting experiment signatures for invalid account " + i, new Object[0]);
        return "invalid_account";
    }

    public void a(jck jck, eyc eyc) {
        int i = 0;
        int b = ((jcf) jyn.a(this.af, jcf.class)).b(jck.b("account_name"), jck.b("effective_gaia_id"));
        if (b == -1) {
            glk.d("BabelExperiments", "Pre-computing loggable experiments for invalid account " + b, new Object[0]);
            return;
        }
        Iterable arrayList = new ArrayList();
        eso[] esoArr = ae;
        int length = esoArr.length;
        while (i < length) {
            eso eso = esoArr[i];
            if (eso.c()) {
                Object concat = String.valueOf(eso.b()).concat(":");
                String valueOf;
                if (eso.a() == 1) {
                    String valueOf2 = String.valueOf(concat);
                    valueOf = String.valueOf(eso.b(b) ? "1" : "0");
                    concat = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
                } else if (eso.a() == 2) {
                    valueOf = String.valueOf(concat);
                    concat = new StringBuilder(String.valueOf(valueOf).length() + 20).append(valueOf).append(eso.c(b)).toString();
                }
                arrayList.add(concat);
            }
            i++;
        }
        jck.c("loggable_experiments", meu.a(";").a(arrayList));
    }

    public static String[] b(int i) {
        jcf jcf = (jcf) jyn.a(gwb.H(), jcf.class);
        if (jcf.c(i)) {
            String b = jcf.a(i).b("loggable_experiments");
            if (b == null) {
                return new String[0];
            }
            return b.split(";");
        }
        glk.d("BabelExperiments", "Getting loggable experiments for invalid account " + i, new Object[0]);
        return new String[0];
    }

    public void a(Activity activity, Bundle bundle) {
        Object a = fdq.a(((jca) jyn.a((Context) activity, jca.class)).a());
        if (!TextUtils.isEmpty(a)) {
            bundle.putString("exp", a);
        }
    }

    public void a(jck jck, SharedPreferences sharedPreferences, Editor editor) {
        jck h = jck.h("babel_exp");
        jck h2 = jck.h("babel_exp_override");
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            if (fdq.a("BABEL_EXP_", h, entry) || fdq.a("OVERRIDE_BABEL_EXP_", h2, entry)) {
                editor.remove((String) entry.getKey());
            }
        }
        editor.apply();
    }

    private static boolean a(String str, jck jck, Entry<String, ?> entry) {
        String str2 = (String) entry.getKey();
        if (str2 == null) {
            String valueOf = String.valueOf(entry.getValue());
            glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Unexpected null key; value = ").append(valueOf).toString(), new Object[0]);
            return false;
        } else if (!str2.startsWith(str)) {
            return false;
        } else {
            String substring = str2.substring(str.length());
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                jck.c(substring, gwb.b((Boolean) value));
            } else if (value instanceof Long) {
                jck.c(substring, gwb.a((Long) value));
            } else {
                str2 = String.valueOf(value);
                iil.a(new StringBuilder((String.valueOf(str2).length() + 27) + String.valueOf(substring).length()).append("Unexpected babel exp: ").append(str2).append(" for ").append(substring).toString());
            }
            return true;
        }
    }
}
