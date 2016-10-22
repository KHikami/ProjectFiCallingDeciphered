import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map.Entry;

public class fdq implements bjr, dpo, ffw {
    public static final eso A;
    static final eso B;
    public static final eso C;
    public static final eso D;
    public static final eso E;
    public static final eso F;
    public static final eso G;
    public static final eso H;
    public static final eso I;
    public static final eso J;
    public static final eso K;
    public static final eso L;
    public static final eso M;
    public static final eso N;
    public static final eso O;
    public static final eso P;
    public static final eso Q;
    public static final eso R;
    public static final eso S;
    private static final eso T;
    private static final eso U;
    private static final eso V;
    private static final eso W;
    private static final eso X;
    private static final eso Y;
    private static final eso Z;
    public static final eso a;
    private static final eso aa;
    private static final eso ab;
    private static final eso ac;
    private static final eso ad;
    private static final eso[] ae;
    public static final eso b;
    public static final eso c;
    public static final eso d;
    public static final eso e;
    public static final eso f;
    public static final eso g;
    public static final eso h;
    public static final eso i;
    public static final eso j;
    public static final eso k;
    public static final eso l;
    public static final eso m;
    public static final eso n;
    public static final eso o;
    public static final eso p;
    public static final eso q;
    public static final eso r;
    public static final eso s;
    public static final eso t;
    public static final eso u;
    public static final eso v;
    public static final eso w;
    public static final eso x;
    public static final eso y;
    public static final eso z;
    private final Context af;

    static {
        T = new eso("cfd3274b", false);
        U = new eso("dd69e883", true);
        a = new eso("6ab26889", false);
        b = new eso("de9507e5", false);
        V = new eso("e830ee0f", false);
        W = new eso("28de1a65", false);
        X = new eso("638c9a45", false);
        c = new eso("715d526b", false);
        d = new eso("5d18028f", false);
        e = new eso("99c978d5", false);
        f = new eso("8ce9147e", false);
        g = new eso("1f6beb98", false);
        h = new eso("c678ad4c", true);
        i = new eso("3d19c", false);
        j = new eso("44afde42", false);
        k = new eso("921c6ef1", 60000);
        l = new eso("92acc909", 1);
        m = new eso("740e8ae0", 0);
        n = new eso("79b46bfb", false);
        o = new eso("1c54e739", false);
        p = new eso("fc4914ca", false);
        q = new eso("bf9b09ab", false);
        r = new eso("e37a36b1", false);
        s = new eso("aa48e46b", false);
        t = new eso("eeaee535", false);
        u = new eso("b207e4ac", false);
        v = new eso("b95a58f5", false);
        w = new eso("44cc58db", false);
        x = new eso("c86b39d9", true);
        y = new eso("1e345451", false);
        z = new eso("be12bbc2", false);
        A = new eso("23dac235", false);
        Y = new eso("6cd8df27", false);
        Z = new eso("66ac36b8", false);
        aa = new eso("f193cbe1", false);
        B = new eso("173eb495", false);
        C = new eso("c639d94f", false);
        ab = new eso("cfefa79c", false);
        D = new eso("d991dc99", false);
        E = new eso("c69e4cb6", false);
        F = new eso("1d9a5232", false);
        G = new eso("5dd768ee", false);
        H = new eso("426beee1", 300);
        I = new eso("f98d68c1", false);
        J = new eso("2c6963eb", false);
        K = new eso("b32115c2", false);
        L = new eso("98a5c1c6", false);
        M = new eso("4b3b2c63", false);
        ac = new eso("2ac96fbb", true);
        N = new eso("f6244fad", false);
        O = new eso("aa269660", false);
        ad = new eso("46b64eff", false);
        P = new eso("c4475777", false);
        Q = new eso("7e09678c", false);
        R = new eso("8dbc426f", false);
        S = new eso("9f7b2b8c", false);
        ae = new eso[]{X, m, T, U, ab, O, J, N, b, e, S, R, C, G, B, f, g, D, A, V, o, p, n, u, F, Q, P, L, w, s, t, a, r, d, I, Y, q, M, ad, ac, K, v, i, h, j, c, z, k, l, E, W, Z, aa, x, y, H};
    }

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
        Object a = a(((jca) jyn.a((Context) activity, jca.class)).a());
        if (!TextUtils.isEmpty(a)) {
            bundle.putString("exp", a);
        }
    }

    public void a(jck jck, SharedPreferences sharedPreferences, Editor editor) {
        jck h = jck.h("babel_exp");
        jck h2 = jck.h("babel_exp_override");
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            if (a("BABEL_EXP_", h, entry) || a("OVERRIDE_BABEL_EXP_", h2, entry)) {
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
