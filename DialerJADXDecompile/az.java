import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
public class az implements ay {
    public static final int A = 2131493121;
    public static final int B = 2131493122;
    public static final int C = 2131493069;
    public static final int D = 2131493068;
    public static final int E = 2131493067;
    public static final int F = 2131493066;
    public static final int G = 2131493041;
    public static final int H = 2131493045;
    public static final int I = 2131493185;
    public static final int J = 2131493172;
    public static final int K = 2131493179;
    public static final int L = 2131493187;
    public static final int M = 2131493165;
    public static final int N = 2131493271;
    public static final int O = 2131493162;
    public static final int P = 2131493060;
    public static final int Q = 2131493059;
    public static final int R = 2131493267;
    public static final int S = 2131493161;
    public static final int T = 2131493316;
    public static final int U = 2131493266;
    public static final int V = 2131493040;
    public static final int W = 2131493046;
    public static final int X = 2131492965;
    public static final int Y = 2131493295;
    public static final int Z = 2131493196;
    public static final int a = 2131493005;
    public static final int aA = 2131493286;
    public static final int aB = 2131493288;
    public static final int aC = 2131493284;
    public static final int aD = 2131493283;
    public static final int aE = 2131493287;
    public static final int aF = 2131493164;
    public static final int aG = 2131493163;
    public static final int aH = 2131493268;
    public static final int aI = 2131493317;
    public static final int aJ = 2131493177;
    public static final int aK = 2131493047;
    public static final int aL = 2131493049;
    public static final int aM = 2131493160;
    public static final int aN = 2131493159;
    public static final int aO = 2131493263;
    public static final int aP = 2131493293;
    public static final int aQ = 2131492897;
    public static final int aR = 2131493261;
    public static final int aS = 2131493178;
    public static final int aa = 2131493269;
    public static final int ab = 2131493209;
    public static final int ac = 2131493055;
    public static final int ad = 2131493218;
    public static final int ae = 2131493053;
    public static final int af = 2131493314;
    public static final int ag = 2131493044;
    public static final int ah = 2131493091;
    public static final int ai = 2131493166;
    public static final int aj = 2131493174;
    public static final int ak = 2131493235;
    public static final int al = 2131493054;
    public static final int am = 2131493125;
    public static final int an = 2131493050;
    public static final int ao = 2131493270;
    public static final int ap = 2131493065;
    public static final int aq = 2131493265;
    public static final int ar = 2131493176;
    public static final int as = 2131493299;
    public static final int at = 2131493298;
    public static final int au = 2131493297;
    public static final int av = 2131493296;
    public static final int aw = 2131493257;
    public static final int ax = 2131493056;
    public static final int ay = 2131493061;
    public static final int az = 2131493285;
    public static final int b = 2131493006;
    public static final int c = 2131493007;
    public static final int d = 2131493052;
    public static final int e = 2131493058;
    public static final int f = 2131493043;
    public static final int g = 2131493331;
    public static final int h = 2131493329;
    public static final int i = 2131493328;
    public static final int j = 2131493330;
    public static final int k = 2131493312;
    public static final int l = 2131493315;
    public static final int m = 2131493057;
    public static final int n = 2131493260;
    public static final int o = 2131493262;
    public static final int p = 2131493264;
    public static final int q = 2131493259;
    public static final int r = 2131493272;
    public static final int s = 2131493064;
    public static final int t = 2131493118;
    public static final int u = 2131493048;
    public static final int v = 2131493051;
    public static final int w = 2131493313;
    public static final int x = 2131493123;
    public static final int y = 2131493119;
    public static final int z = 2131493120;

    az() {
    }

    public final void a(ViewGroup viewGroup, View view, Rect rect) {
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        rect.offset(view.getScrollX(), view.getScrollY());
    }

    public static void a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static boolean a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static Drawable b(Drawable drawable) {
        if (drawable instanceof ho) {
            return drawable;
        }
        return new hh(drawable);
    }

    public static int c(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static void a(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static void a(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    public static void b(View view, int i) {
        view.offsetLeftAndRight(i);
    }
}
