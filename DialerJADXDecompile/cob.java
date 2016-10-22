import android.animation.ValueAnimator;
import android.app.Fragment;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.OverScroller;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class cob {
    public static final int A = 2131493132;
    public static final int B = 2131493138;
    public static final int C = 2131493198;
    public static final int D = 2131493140;
    public static final int E = 2131492877;
    public static final int F = 2131492878;
    public static final int G = 2131492879;
    public static final int H = 2131492880;
    public static final int I = 2131492882;
    public static final int J = 2131493151;
    public static final int K = 2131493197;
    public static final int L = 2131493156;
    public static final int M = 2131492965;
    public static final int N = 2131493196;
    public static final int O = 2131493127;
    public static final int P = 2131493091;
    public static final int Q = 2131493153;
    public static final int R = 2131493157;
    public static final int S = 2131493117;
    public static final int T = 2131361804;
    public static final int U = 2131361805;
    public static final int V = 2131361809;
    public static final int W = 2131361819;
    public static final int X = 2131361823;
    public static final int Y = 2131361849;
    public static final int Z = 2131361852;
    public static Method a = null;
    public static final int aA = 2130837739;
    public static final int aB = 2130837740;
    public static final int aC = 2130837741;
    public static final int aD = 2130837745;
    public static final int aE = 2130837748;
    public static final int aF = 2130837749;
    public static final int aG = 2130837751;
    public static final int aH = 2130837756;
    public static final int aI = 2130837761;
    public static final int aJ = 2130837762;
    public static final int aK = 2130837787;
    public static final int aL = 2130837788;
    public static final int aM = 2130837793;
    public static final int aN = 2130837795;
    public static final int aO = 2130837796;
    public static final int aP = 2130837797;
    public static final int aQ = 2130837798;
    public static final int aR = 2130837826;
    public static final int aS = 2130837827;
    public static final int aT = 2131689510;
    public static final int aU = 2131689515;
    public static final int aV = 2131689516;
    public static final int aW = 2131689519;
    public static final int aX = 2131689523;
    public static final int aY = 2131689528;
    public static final int aZ = 2131689530;
    public static final int aa = 2131361854;
    public static final int ab = 2131361855;
    public static final int ac = 2131361910;
    public static final int ad = 2131361911;
    public static final int ae = 2131361920;
    public static final int af = 2131361980;
    public static final int ag = 2131362007;
    public static final int ah = 2131362008;
    public static final int ai = 2131362028;
    public static final int aj = 2130837581;
    public static final int ak = 2130837647;
    public static final int al = 2130837648;
    public static final int am = 2130837649;
    public static final int an = 2130837654;
    public static final int ao = 2130837666;
    public static final int ap = 2130837671;
    public static final int aq = 2130837672;
    public static final int ar = 2130837680;
    public static final int as = 2130837686;
    public static final int at = 2130837687;
    public static final int au = 2130837688;
    public static final int av = 2130837689;
    public static final int aw = 2130837693;
    public static final int ax = 2130837730;
    public static final int ay = 2130837734;
    public static final int az = 2130837737;
    public static boolean b = false;
    public static final int bA = 2131689675;
    public static final int bB = 2131689676;
    public static final int bC = 2131689722;
    public static final int bD = 2131689735;
    public static final int bE = 2131689740;
    public static final int bF = 2131689743;
    public static final int bG = 2131689748;
    public static final int bH = 2131689749;
    public static final int bI = 2131689751;
    public static final int bJ = 2131689761;
    public static final int bK = 2131689762;
    public static final int bL = 2131689764;
    public static final int bM = 2131689765;
    public static final int bN = 2131689766;
    public static final int bO = 2131689773;
    public static final int bP = 2131689777;
    public static final int bQ = 2131689790;
    public static final int bR = 2131689791;
    public static final int bS = 2131689792;
    public static final int bT = 2131689793;
    public static final int bU = 2131689794;
    public static final int bV = 2131689797;
    public static final int bW = 2131689806;
    public static final int bX = 2131689807;
    public static final int bY = 2131689809;
    public static final int bZ = 2131689811;
    public static final int ba = 2131689531;
    public static final int bb = 2131689532;
    public static final int bc = 2131689547;
    public static final int bd = 2131689548;
    public static final int be = 2131689550;
    public static final int bf = 2131689557;
    public static final int bg = 2131689567;
    public static final int bh = 2131689568;
    public static final int bi = 2131689580;
    public static final int bj = 2131689581;
    public static final int bk = 2131689588;
    public static final int bl = 2131689596;
    public static final int bm = 2131689597;
    public static final int bn = 2131689598;
    public static final int bo = 2131689601;
    public static final int bp = 2131689602;
    public static final int bq = 2131689603;
    public static final int br = 2131689605;
    public static final int bs = 2131689606;
    public static final int bt = 2131689608;
    public static final int bu = 2131689610;
    public static final int bv = 2131689612;
    public static final int bw = 2131689613;
    public static final int bx = 2131689614;
    public static final int by = 2131689626;
    public static final int bz = 2131689674;
    public static Method c = null;
    public static final int cA = 2131690087;
    public static final int cB = 2131690089;
    public static final int cC = 2131690090;
    public static final int cD = 2131690092;
    public static final int cE = 2131690093;
    public static final int cF = 2131690103;
    public static final int cG = 2131690106;
    public static final int cH = 2131690127;
    public static final int cI = 2131690141;
    public static final int cJ = 2131690143;
    public static final int cK = 2131690149;
    public static final int cL = 2131690150;
    public static final int cM = 2131690151;
    public static final int cN = 2131690152;
    public static final int cO = 2131690153;
    public static final int cP = 2131690154;
    public static final int cQ = 2131690172;
    public static final int cR = 2131690173;
    public static final int cS = 2131690181;
    public static final int cT = 2131690200;
    public static final int cU = 2131690201;
    public static final int cV = 2131690202;
    public static final int cW = 2131690203;
    public static final int cX = 2131690204;
    public static final int cY = 2131690219;
    public static final int cZ = 2131690220;
    public static final int ca = 2131689815;
    public static final int cb = 2131689816;
    public static final int cc = 2131689817;
    public static final int cd = 2131689838;
    public static final int ce = 2131689845;
    public static final int cf = 2131689899;
    public static final int cg = 2131689902;
    public static final int ch = 2131689907;
    public static final int ci = 2131689927;
    public static final int cj = 2131689931;
    public static final int ck = 2131689932;
    public static final int cl = 2131689943;
    public static final int cm = 2131689957;
    public static final int cn = 2131689962;
    public static final int co = 2131689965;
    public static final int cp = 2131689982;
    public static final int cq = 2131690027;
    public static final int cr = 2131690028;
    public static final int cs = 2131690029;
    public static final int ct = 2131690030;
    public static final int cu = 2131690031;
    public static final int cv = 2131690032;
    public static final int cw = 2131690035;
    public static final int cx = 2131690043;
    public static final int cy = 2131690084;
    public static final int cz = 2131690086;
    public static boolean d = false;
    public static final int dA = 2131690284;
    public static final int dB = 2131690285;
    public static final int dC = 2131690286;
    public static final int dD = 2131690287;
    public static final int dE = 2131690296;
    public static final int dF = 2131690300;
    public static final int dG = 2131690301;
    public static final int dH = 2131034124;
    public static final int dI = 2131034134;
    public static final int dJ = 2131034135;
    public static final int dK = 2131034136;
    public static final int dL = 2131034137;
    public static final int dM = 2131034138;
    public static final int dN = 2131034139;
    public static final int dO = 2131361921;
    public static final int dP = 2131689683;
    public static final int dQ = 2131689684;
    public static final int dR = 2131689685;
    public static final int dS = 2131689686;
    public static final int dT = 2131689687;
    public static final int dU = 2131689688;
    public static final int dV = 2131689689;
    public static final int dW = 2131689690;
    public static final int dX = 2131689691;
    public static final int dY = 2131689692;
    public static final int dZ = 2131689693;
    public static final int da = 2131690221;
    public static final int db = 2131690229;
    public static final int dc = 2131690231;
    public static final int dd = 2131690232;
    public static final int de = 2131690233;
    public static final int df = 2131690237;
    public static final int dg = 2131690238;
    public static final int dh = 2131690242;
    public static final int di = 2131690243;
    public static final int dj = 2131690244;
    public static final int dk = 2131690245;
    public static final int dl = 2131690246;
    public static final int dm = 2131690247;
    public static final int dn = 2131690248;
    public static final int do = 2131690249;
    public static final int dp = 2131690250;
    public static final int dq = 2131690255;
    public static final int dr = 2131690258;
    public static final int ds = 2131690268;
    public static final int dt = 2131690276;
    public static final int du = 2131690277;
    public static final int dv = 2131690278;
    public static final int dw = 2131690279;
    public static final int dx = 2131690280;
    public static final int dy = 2131690281;
    public static final int dz = 2131690283;
    public static Field e = null;
    public static final int ea = 2131689694;
    public static final int eb = 2131689695;
    public static final int ec = 2131689696;
    public static final int ed = 2131689697;
    public static final int ee = 2131689698;
    public static final int ef = 2131689699;
    public static final int eg = 2131689700;
    public static final int eh = 2131689701;
    public static final int ei = 2131689702;
    public static final int ej = 2131689703;
    public static final int ek = 2131689704;
    public static final int el = 2131689705;
    public static final int em = 2131689706;
    public static final int en = 2131689707;
    public static final int eo = 2131689708;
    public static final int ep = 2131689709;
    public static boolean f = false;
    public static Field g = null;
    public static boolean h = false;
    public static Method i = null;
    public static boolean j = false;
    public static final int k = 2131493009;
    public static final int l = 2131493008;
    public static final int m = 2131493154;
    public static final int n = 2131493150;
    public static final int o = 2131493155;
    public static final int p = 2131492870;
    public static final int q = 2131492871;
    public static final int r = 2131492872;
    public static final int s = 2131493126;
    public static final int t = 2131493152;
    public static final int u = 2131493135;
    public static final int v = 2131493129;
    public static final int w = 2131493130;
    public static final int x = 2131493133;
    public static final int y = 2131493134;
    public static final int z = 2131493136;

    public void a(View view, kf kfVar) {
        if (kn.o(view)) {
            kn.a(view, kfVar);
            view.setSystemUiVisibility(1280);
        }
    }

    public static void a(Fragment fragment, boolean z) {
        if (fragment.getFragmentManager() != null) {
            fragment.setUserVisibleHint(z);
        }
    }

    public static int a(Resources resources) {
        return resources.getConfiguration().screenHeightDp;
    }

    public static int b(Resources resources) {
        return resources.getConfiguration().screenWidthDp;
    }

    public static int c(Resources resources) {
        return resources.getConfiguration().smallestScreenWidthDp;
    }

    public static Drawable a(Resources resources, int i, Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static Drawable a(Drawable drawable) {
        if (drawable instanceof ho) {
            return drawable;
        }
        return new hd(drawable);
    }

    public static boolean a(Drawable drawable, int i) {
        if (!b) {
            try {
                a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception e2) {
                a = null;
            }
        }
        return false;
    }

    public static int b(Drawable drawable) {
        if (!d) {
            try {
                c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                return ((Integer) c.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                c = null;
            }
        }
        return -1;
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void a() {
        Trace.endSection();
    }

    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void a(LayoutInflater layoutInflater, jl jlVar) {
        Factory2 jkVar;
        if (jlVar != null) {
            jkVar = new jk(jlVar);
        } else {
            jkVar = null;
        }
        layoutInflater.setFactory2(jkVar);
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof Factory2) {
            a(layoutInflater, (Factory2) factory);
        } else {
            a(layoutInflater, jkVar);
        }
    }

    public static void a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f) {
            try {
                e = LayoutInflater.class.getDeclaredField("mFactory2");
                e.setAccessible(true);
            } catch (Throwable e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f = true;
        }
        if (e != null) {
            try {
                e.set(layoutInflater, factory2);
            } catch (Throwable e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    public static long b() {
        return ValueAnimator.getFrameDelay();
    }

    public static float a(View view) {
        return view.getAlpha();
    }

    public static void a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static int b(View view) {
        return view.getLayerType();
    }

    public static int a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static int c(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static int d(View view) {
        return view.getMeasuredState();
    }

    public static float e(View view) {
        return view.getTranslationX();
    }

    public static float f(View view) {
        return view.getTranslationY();
    }

    public static void a(View view, float f) {
        view.setTranslationX(f);
    }

    public static void b(View view, float f) {
        view.setTranslationY(f);
    }

    public static Matrix g(View view) {
        return view.getMatrix();
    }

    public static void c(View view, float f) {
        view.setAlpha(f);
    }

    public static void h(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void a(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    public static void b(View view, boolean z) {
        view.setActivated(z);
    }

    public static int a(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    public static void a(View view, int i) {
        view.offsetTopAndBottom(i);
        i(view);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            i((View) parent);
        }
    }

    public static void b(View view, int i) {
        view.offsetLeftAndRight(i);
        i(view);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            i((View) parent);
        }
    }

    public static void i(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean j(View view) {
        return view.hasTransientState();
    }

    public static void k(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int l(View view) {
        return view.getImportantForAccessibility();
    }

    public static void c(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static boolean a(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static int m(View view) {
        return view.getMinimumWidth();
    }

    public static int n(View view) {
        return view.getMinimumHeight();
    }

    public static void o(View view) {
        view.requestFitSystemWindows();
    }

    public static boolean p(View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean q(View view) {
        return view.hasOverlappingRendering();
    }

    public static void d(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static boolean r(View view) {
        return view.isLaidOut();
    }

    public static boolean s(View view) {
        return view.isAttachedToWindow();
    }

    public static void a(View view, mg mgVar) {
        if (mgVar != null) {
            view.animate().setListener(new me(mgVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public static List a(Object obj) {
        return ((AccessibilityRecord) obj).getText();
    }

    public static void a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setChecked(z);
    }

    public static void a(Object obj, CharSequence charSequence) {
        ((AccessibilityRecord) obj).setClassName(charSequence);
    }

    public static void b(Object obj, CharSequence charSequence) {
        ((AccessibilityRecord) obj).setContentDescription(charSequence);
    }

    public static void b(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setEnabled(z);
    }

    public static void a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    public static void b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    public static void c(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setPassword(z);
    }

    public static void c(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollX(i);
    }

    public static void d(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollY(i);
    }

    public static void d(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    public static void e(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }

    public static void a(Object obj, View view, int i) {
        ((AccessibilityRecord) obj).setSource(view, i);
    }

    public static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof pg) {
            ((pg) compoundButton).a(colorStateList);
        }
    }

    public static void a(CompoundButton compoundButton, Mode mode) {
        if (compoundButton instanceof pg) {
            ((pg) compoundButton).a(mode);
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        if (!h) {
            try {
                g = CompoundButton.class.getDeclaredField("mButtonDrawable");
                g.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            h = true;
        }
        if (g != null) {
            try {
                return (Drawable) g.get(compoundButton);
            } catch (IllegalAccessException e2) {
                g = null;
            }
        }
        return null;
    }

    public static void a(ListView listView, int i) {
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            View childAt = listView.getChildAt(0);
            if (childAt != null) {
                listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
            }
        }
    }

    public static void a(PopupWindow popupWindow, int i) {
        if (!j) {
            try {
                i = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                i.setAccessible(true);
            } catch (Exception e) {
            }
            j = true;
        }
        if (i != null) {
            try {
                i.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception e2) {
            }
        }
    }

    public static Object a(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public static boolean b(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    public static int c(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    public static int d(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    public static boolean e(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    public static void a(Object obj, int i, int i2, int i3, int i4) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4);
    }

    public static void a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public static void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((OverScroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public static void a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        ((OverScroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    public static void f(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    public static int g(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    public static int h(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }

    public static boolean a(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
        return ((OverScroller) obj).springBack(i, i2, i3, i4, i5, i6);
    }

    public static void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(a(str, Character.valueOf(c)));
        }
    }

    public static void a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(a(str, Integer.valueOf(i)));
        }
    }

    public static void a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(a(str, Long.valueOf(j)));
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(a(str, obj));
        }
    }

    public static void a(boolean z, String str, char c, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(a(str, Character.valueOf(c), obj));
        }
    }

    public static void a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(a(str, obj, obj2));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(a(str, obj));
        }
    }

    public static Object i(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static Object b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static Object a(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a(str, obj2));
    }

    public static int b(int i, int i2) {
        return a(i, i2, "index");
    }

    public static int a(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(b(i, i2, str));
    }

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            return a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static int c(int i, int i2) {
        return c(i, i2, "index");
    }

    public static int c(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(d(i, i2, str));
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            return a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static void b(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(c(i, i2, i3));
        }
    }

    public static String c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return d(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return d(i2, i3, "end index");
        }
        return a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static String a(String str, Object... objArr) {
        int i = 0;
        CharSequence valueOf = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(valueOf, i2, indexOf);
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            int i3 = i2;
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(valueOf, i2, valueOf.length());
        if (i < objArr.length) {
            stringBuilder.append(" [");
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            i = i2;
            while (i < objArr.length) {
                stringBuilder.append(", ");
                i2 = i + 1;
                stringBuilder.append(objArr[i]);
                i = i2;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }
}
