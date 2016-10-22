package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.ListView;

/* compiled from: PG */
/* renamed from: aq */
public class aq {
    public static final int A = 2131493088;
    public static final int B = 2131493092;
    public static final int C = 2131493077;
    public static final int D = 2131493093;
    public static final int E = 2131493105;
    public static final int F = 2131493078;
    public static final int G = 2131493110;
    public static final int H = 2131493036;
    public static final int I = 2131493037;
    public static final int J = 2131493300;
    public static final int K = 2131493248;
    public static final int L = 2131493194;
    public static final int M = 2131493291;
    public static final int N = 2131493292;
    public static final int O = 2131493130;
    public static final int P = 2131493134;
    public static final int Q = 2131493246;
    public static final int R = 2131492874;
    public static final int S = 2131492875;
    public static final int T = 2131492876;
    public static final int U = 2131493107;
    public static final int V = 2131493079;
    public static final int W = 2131493188;
    public static final int X = 2131493318;
    public static final int Y = 2131493038;
    public static final int Z = 2131493307;
    public static ThreadLocal a = null;
    public static final int aA = 2131493212;
    public static final int aB = 2131493319;
    public static final int aC = 2131493326;
    public static final int aD = 2131493320;
    public static final int aE = 2131493323;
    public static final int aF = 2131493327;
    public static final int aG = 2131493321;
    public static final int aH = 2131493325;
    public static final int aI = 2131493322;
    public static final int aJ = 2131493324;
    public static final int aK = 2131493026;
    public static final int aL = 2131493029;
    public static final int aM = 2131493091;
    public static final int aN = 2131493166;
    public static final int aO = 2131493174;
    public static final int aP = 2131493075;
    public static final int aQ = 2131493302;
    public static final int aR = 2131493303;
    public static final int aS = 2131493305;
    public static final int aT = 2131493306;
    public static final int aU = 2131493301;
    public static final int aV = 2131493176;
    public static final int aW = 2131493243;
    public static final int aX = 2131493098;
    public static final int aY = 2131493089;
    public static final int aZ = 2131493035;
    public static final int aa = 2131493115;
    public static final int ab = 2131493168;
    public static final int ac = 2131493171;
    public static final int ad = 2131493170;
    public static final int ae = 2131493186;
    public static final int af = 2131493179;
    public static final int ag = 2131493190;
    public static final int ah = 2131493191;
    public static final int ai = 2131493189;
    public static final int aj = 2131493282;
    public static final int ak = 2131493187;
    public static final int al = 2131493080;
    public static final int am = 2131493165;
    public static final int an = 2131493204;
    public static final int ao = 2131493202;
    public static final int ap = 2131493203;
    public static final int aq = 2131493014;
    public static final int ar = 2131493162;
    public static final int as = 2131493192;
    public static final int at = 2131493084;
    public static final int au = 2131493161;
    public static final int av = 2131493071;
    public static final int aw = 2131492965;
    public static final int ax = 2131493024;
    public static final int ay = 2131493022;
    public static final int az = 2131493213;
    public static final int b = 2131493031;
    public static final int bA = 2131493167;
    public static final int bB = 2131493160;
    public static final int bC = 2131493304;
    public static final int bD = 2131493159;
    public static final int bE = 2131493114;
    public static final int bF = 2131493106;
    public static final int bG = 2131493025;
    public static final int bH = 2131493082;
    public static final int bI = 2131493281;
    public static final int bJ = 2131493102;
    public static final int bK = 2131493097;
    public static final int bL = 2131493094;
    public static final int bM = 2131493178;
    public static final int bN = 2131689509;
    public static final int bO = 2131689511;
    public static final int bP = 2131689535;
    public static final int bQ = 2131689536;
    public static final int bR = 2131689537;
    public static final int bS = 2131689538;
    public static final int bT = 2131689569;
    public static final int bU = 2131689637;
    public static final int bV = 2131689645;
    public static final int bW = 2131689646;
    public static final int bX = 2131689647;
    public static final int bY = 2131689648;
    public static final int bZ = 2131689649;
    public static final int ba = 2131493085;
    public static final int bb = 2131493214;
    public static final int bc = 2131493215;
    public static final int bd = 2131493216;
    public static final int be = 2131493217;
    public static final int bf = 2131493111;
    public static final int bg = 2131493274;
    public static final int bh = 2131493278;
    public static final int bi = 2131493273;
    public static final int bj = 2131493280;
    public static final int bk = 2131493276;
    public static final int bl = 2131493279;
    public static final int bm = 2131493275;
    public static final int bn = 2131493277;
    public static final int bo = 2131493242;
    public static final int bp = 2131493109;
    public static final int bq = 2131493290;
    public static final int br = 2131492890;
    public static final int bs = 2131493164;
    public static final int bt = 2131493247;
    public static final int bu = 2131493309;
    public static final int bv = 2131493163;
    public static final int bw = 2131493310;
    public static final int bx = 2131493308;
    public static final int by = 2131492968;
    public static final int bz = 2131493177;
    public static final int c = 2131493030;
    public static final int cA = 2131690009;
    public static final int cB = 2131690010;
    public static final int cC = 2131690011;
    public static final int cD = 2131690012;
    public static final int cE = 2131690013;
    public static final int cF = 2131690014;
    public static final int cG = 2131690015;
    public static final int cH = 2131690016;
    public static final int cI = 2131690018;
    public static final int cJ = 2131690019;
    public static final int cK = 2131690020;
    public static final int cL = 2131690021;
    public static final int cM = 2131690022;
    public static final int cN = 2131690023;
    public static final int cO = 2131690024;
    public static final int cP = 2131690025;
    public static final int cQ = 2131690036;
    public static final int cR = 2131690037;
    public static final int cS = 2131690038;
    public static final int cT = 2131690039;
    public static final int cU = 2131690040;
    public static final int cV = 2131690041;
    public static final int cW = 2131690042;
    public static final int cX = 2131690056;
    public static final int cY = 2131690057;
    public static final int cZ = 2131690062;
    public static final int ca = 2131689650;
    public static final int cb = 2131689651;
    public static final int cc = 2131689652;
    public static final int cd = 2131689653;
    public static final int ce = 2131689655;
    public static final int cf = 2131689656;
    public static final int cg = 2131689657;
    public static final int ch = 2131689659;
    public static final int ci = 2131689660;
    public static final int cj = 2131689661;
    public static final int ck = 2131689673;
    public static final int cl = 2131689680;
    public static final int cm = 2131689681;
    public static final int cn = 2131689682;
    public static final int co = 2131689736;
    public static final int cp = 2131689737;
    public static final int cq = 2131689832;
    public static final int cr = 2131689834;
    public static final int cs = 2131689842;
    public static final int ct = 2131689843;
    public static final int cu = 2131689854;
    public static final int cv = 2131689912;
    public static final int cw = 2131689924;
    public static final int cx = 2131689926;
    public static final int cy = 2131689930;
    public static final int cz = 2131689956;
    public static final int d = 2131493108;
    public static final int dA = 2131690217;
    public static final int dB = 2131690218;
    public static final int dC = 2131690255;
    public static final int dD = 2131690308;
    public static final int da = 2131690063;
    public static final int db = 2131690065;
    public static final int dc = 2131690066;
    public static final int dd = 2131690069;
    public static final int de = 2131690070;
    public static final int df = 2131690072;
    public static final int dg = 2131690075;
    public static final int dh = 2131690076;
    public static final int di = 2131690077;
    public static final int dj = 2131690078;
    public static final int dk = 2131690081;
    public static final int dl = 2131690083;
    public static final int dm = 2131690084;
    public static final int dn = 2131690127;
    public static final int do = 2131690140;
    public static final int dp = 2131690157;
    public static final int dq = 2131690205;
    public static final int dr = 2131690207;
    public static final int ds = 2131690208;
    public static final int dt = 2131690209;
    public static final int du = 2131690210;
    public static final int dv = 2131690211;
    public static final int dw = 2131690212;
    public static final int dx = 2131690213;
    public static final int dy = 2131690215;
    public static final int dz = 2131690216;
    public static final int e = 2131493311;
    public static final int f = 2131493113;
    public static final int g = 2131492868;
    public static final int h = 2131493112;
    public static final int i = 2131493018;
    public static final int j = 2131493033;
    public static final int k = 2131493021;
    public static final int l = 2131493039;
    public static final int m = 2131493020;
    public static final int n = 2131493096;
    public static final int o = 2131493103;
    public static final int p = 2131493104;
    public static final int q = 2131493076;
    public static final int r = 2131493070;
    public static final int s = 2131493072;
    public static final int t = 2131493073;
    public static final int u = 2131493074;
    public static final int v = 2131492869;
    public static final int w = 2131493095;
    public static final int x = 2131493087;
    public static final int y = 2131493099;
    public static final int z = 2131493083;

    public ao a() {
        return new ao(VERSION.SDK_INT >= 12 ? new av() : new at());
    }

    aq() {
    }

    public static void a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static Drawable b(Drawable drawable) {
        if (drawable instanceof ho) {
            return drawable;
        }
        return new hf(drawable);
    }

    public static void a(LayoutInflater layoutInflater, jl jlVar) {
        layoutInflater.setFactory2(jlVar != null ? new jk(jlVar) : null);
    }

    public static void a(View view) {
        view.requestApplyInsets();
    }

    public static void a(View view, float f) {
        view.setElevation(f);
    }

    public static float b(View view) {
        return view.getElevation();
    }

    public static float c(View view) {
        return view.getTranslationZ();
    }

    public static void a(View view, kf kfVar) {
        if (kfVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ky(kfVar));
        }
    }

    public static ColorStateList d(View view) {
        return view.getBackgroundTintList();
    }

    public static void a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
            if (background != null && obj != null) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static Mode e(View view) {
        return view.getBackgroundTintMode();
    }

    public static void a(View view, Mode mode) {
        view.setBackgroundTintMode(mode);
        if (VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
            if (background != null && obj != null) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static mj a(View view, mj mjVar) {
        if (!(mjVar instanceof mk)) {
            return mjVar;
        }
        WindowInsets windowInsets = ((mk) mjVar).a;
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            return new mk(onApplyWindowInsets);
        }
        return mjVar;
    }

    public static mj b(View view, mj mjVar) {
        if (!(mjVar instanceof mk)) {
            return mjVar;
        }
        WindowInsets windowInsets = ((mk) mjVar).a;
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            return new mk(dispatchApplyWindowInsets);
        }
        return mjVar;
    }

    public static void f(View view) {
        view.stopNestedScroll();
    }

    public static float g(View view) {
        return view.getZ();
    }

    public static void a(View view, int i) {
        Object obj;
        Rect b = aq.b();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            obj = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
        } else {
            obj = null;
        }
        cob.a(view, i);
        if (obj != null && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(b);
        }
    }

    public static void b(View view, int i) {
        Object obj;
        Rect b = aq.b();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            obj = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
        } else {
            obj = null;
        }
        cob.b(view, i);
        if (obj != null && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(b);
        }
    }

    public static Rect b() {
        if (a == null) {
            a = new ThreadLocal();
        }
        Rect rect = (Rect) a.get();
        if (rect == null) {
            rect = new Rect();
            a.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void a(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
