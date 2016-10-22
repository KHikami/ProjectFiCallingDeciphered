package defpackage;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: ba */
public class ba {
    public static final int A = 2131558645;
    public static final int B = 2131558790;
    public static final int C = 2131558714;
    public static final int D = 2131558654;
    public static final int E = 2131558655;
    public static final int F = 2131558736;
    public static final int G = 2131558472;
    public static final int H = 2131558695;
    public static final int I = 2131559396;
    public static final int J = 2131559398;
    public static final int K = 2131559397;
    public static final int L = 2131558815;
    public static final int M = 2131558866;
    public static final int N = 2131558861;
    public static final int O = 2131559058;
    public static final int P = 2131559303;
    public static final int Q = 2131559304;
    public static final int R = 2131558998;
    public static final int S = 2131558897;
    public static final int T = 2131558666;
    public static final int U = 2131558992;
    public static final int V = 2131559146;
    public static final int W = 2131558657;
    public static final int X = 2131558800;
    public static final int Y = 2131559008;
    public static final int Z = 2131559287;
    public static Method a = null;
    public static final int aA = 2131558437;
    public static final int aB = 2131558818;
    public static final int aC = 2131558898;
    public static final int aD = 2131559449;
    public static final int aE = 2131558846;
    public static final int aF = 2131559447;
    public static final int aG = 2131558747;
    public static final int aH = 2131559081;
    public static final int aI = 2131559220;
    public static final int aJ = 2131558914;
    public static final int aK = 2131558913;
    public static final int aL = 2131558743;
    public static final int aM = 2131558899;
    public static final int aN = 2131558697;
    public static final int aO = 2131558874;
    public static final int aP = 2131558812;
    public static final int aQ = 2131558917;
    public static final int aR = 2131558908;
    public static final int aS = 2131559192;
    public static final int aT = 2131558870;
    public static final int aU = 2131558936;
    public static final int aV = 2131558935;
    public static final int aW = 2131558926;
    public static final int aX = 2131558941;
    public static final int aY = 2131558937;
    public static final int aZ = 2131558939;
    public static final int aa = 2131558811;
    public static final int ab = 2131558737;
    public static final int ac = 2131558740;
    public static final int ad = 2131559071;
    public static final int ae = 2131558793;
    public static final int af = 2131558832;
    public static final int ag = 2131558833;
    public static final int ah = 2131558792;
    public static final int ai = 2131558704;
    public static final int aj = 2131558857;
    public static final int ak = 2131558774;
    public static final int al = 2131558819;
    public static final int am = 2131558841;
    public static final int an = 2131558794;
    public static final int ao = 2131558821;
    public static final int ap = 2131558814;
    public static final int aq = 2131558820;
    public static final int ar = 2131558843;
    public static final int as = 2131559444;
    public static final int at = 2131559006;
    public static final int au = 2131559091;
    public static final int av = 2131558692;
    public static final int aw = 2131558694;
    public static final int ax = 2131558856;
    public static final int ay = 2131559083;
    public static final int az = 2131559448;
    public static boolean b = false;
    public static final int bA = 2131559027;
    public static final int bB = 2131559011;
    public static final int bC = 2131559010;
    public static final int bD = 2131559012;
    public static final int bE = 2131558994;
    public static final int bF = 2131559013;
    public static final int bG = 2131558996;
    public static final int bH = 2131558995;
    public static final int bI = 2131559001;
    public static final int bJ = 2131559009;
    public static final int bK = 2131559014;
    public static final int bL = 2131559021;
    public static final int bM = 2131559026;
    public static final int bN = 2131559025;
    public static final int bO = 2131559102;
    public static final int bP = 2131559105;
    public static final int bQ = 2131559101;
    public static final int bR = 2131559104;
    public static final int bS = 2131559052;
    public static final int bT = 2131559127;
    public static final int bU = 2131559000;
    public static final int bV = 2131559042;
    public static final int bW = 2131559041;
    public static final int bX = 2131558799;
    public static final int bY = 2131559044;
    public static final int bZ = 2131559045;
    public static final int ba = 2131558933;
    public static final int bb = 2131558938;
    public static final int bc = 2131558934;
    public static final int bd = 2131559100;
    public static final int be = 2131559377;
    public static final int bf = 2131559376;
    public static final int bg = 2131558928;
    public static final int bh = 2131558824;
    public static final int bi = 2131559433;
    public static final int bj = 2131558905;
    public static final int bk = 2131558960;
    public static final int bl = 2131558961;
    public static final int bm = 2131558962;
    public static final int bn = 2131558700;
    public static final int bo = 2131558809;
    public static final int bp = 2131559002;
    public static final int bq = 2131559003;
    public static final int br = 2131559004;
    public static final int bs = 2131559446;
    public static final int bt = 2131558904;
    public static final int bu = 2131559321;
    public static final int bv = 2131558991;
    public static final int bw = 2131558823;
    public static final int bx = 2131558831;
    public static final int by = 2131558990;
    public static final int bz = 2131559028;
    public static Method c = null;
    public static final int cA = 2131559131;
    public static final int cB = 2131559080;
    public static final int cC = 2131559057;
    public static final int cD = 2131559099;
    public static final int cE = 2131559088;
    public static final int cF = 2131559055;
    public static final int cG = 2131559054;
    public static final int cH = 2131559106;
    public static final int cI = 2131559109;
    public static final int cJ = 2131559108;
    public static final int cK = 2131558783;
    public static final int cL = 2131559429;
    public static final int cM = 2131559056;
    public static final int cN = 2131558779;
    public static final int cO = 2131559050;
    public static final int cP = 2131558745;
    public static final int cQ = 2131559022;
    public static final int cR = 2131559020;
    public static final int cS = 2131558875;
    public static final int cT = 2131559208;
    public static final int cU = 2131559382;
    public static final int cV = 2131559286;
    public static final int cW = 2131558711;
    public static final int cX = 2131558710;
    public static final int cY = 2131558860;
    public static final int cZ = 2131558791;
    public static final int ca = 2131559043;
    public static final int cb = 2131559015;
    public static final int cc = 2131559016;
    public static final int cd = 2131559023;
    public static final int ce = 2131559061;
    public static final int cf = 2131559064;
    public static final int cg = 2131559063;
    public static final int ch = 2131559062;
    public static final int ci = 2131559067;
    public static final int cj = 2131559066;
    public static final int ck = 2131559065;
    public static final int cl = 2131558844;
    public static final int cm = 2131558734;
    public static final int cn = 2131558842;
    public static final int co = 2131559074;
    public static final int cp = 2131559034;
    public static final int cq = 2131559033;
    public static final int cr = 2131558598;
    public static final int cs = 2131559157;
    public static final int ct = 2131558981;
    public static final int cu = 2131559059;
    public static final int cv = 2131559130;
    public static final int cw = 2131558830;
    public static final int cx = 2131559135;
    public static final int cy = 2131559134;
    public static final int cz = 2131559133;
    public static boolean d = false;
    public static final int dA = 2131558703;
    public static final int dB = 2131558909;
    public static final int dC = 2131559289;
    public static final int dD = 2131559290;
    public static final int dE = 2131558929;
    public static final int dF = 2131559300;
    public static final int dG = 2131559299;
    public static final int dH = 2131558691;
    public static final int dI = 2131559293;
    public static final int dJ = 2131559298;
    public static final int dK = 2131558901;
    public static final int dL = 2131558798;
    public static final int dM = 2131559093;
    public static final int dN = 2131559094;
    public static final int dO = 2131559095;
    public static final int dP = 2131559082;
    public static final int dQ = 2131559047;
    public static final int dR = 2131558993;
    public static final int dS = 2131558803;
    public static final int dT = 2131559046;
    public static final int dU = 2131559201;
    public static final int dV = 2131559037;
    public static final int dW = 2131559217;
    public static final int dX = 2131559216;
    public static final int dY = 2131558744;
    public static final int dZ = 2131558869;
    public static final int da = 2131558708;
    public static final int db = 2131558709;
    public static final int dc = 2131558742;
    public static final int dd = 2131559437;
    public static final int de = 2131558698;
    public static final int df = 2131558735;
    public static final int dg = 2131559438;
    public static final int dh = 2131558805;
    public static final int di = 2131559426;
    public static final int dj = 2131559436;
    public static final int dk = 2131559435;
    public static final int dl = 2131559324;
    public static final int dm = 2131559323;
    public static final int dn = 2131559439;
    public static final int do = 2131558896;
    public static final int dp = 2131559144;
    public static final int dq = 2131559086;
    public static final int dr = 2131559143;
    public static final int ds = 2131559084;
    public static final int dt = 2131558753;
    public static final int du = 2131558802;
    public static final int dv = 2131558829;
    public static final int dw = 2131559142;
    public static final int dx = 2131558755;
    public static final int dy = 2131558716;
    public static final int dz = 2131558930;
    public static Method e = null;
    public static final int eA = 2131559419;
    public static final int eB = 2131558439;
    public static final int eC = 2131559418;
    public static final int eD = 2131558515;
    public static final int eE = 2131559097;
    public static final int eF = 2131558927;
    public static final int eG = 2131558741;
    public static final int eH = 2131558942;
    public static final int eI = 2131558943;
    public static final int eJ = 2131559038;
    public static final int eK = 2131558801;
    public static final int eL = 2131558873;
    public static final int eM = 2131559196;
    public static final int eN = 2131559195;
    public static final int eO = 2131559194;
    public static final int eP = 2131559193;
    public static final int eQ = 2131559190;
    public static final int eR = 2131559191;
    public static final int eS = 2131559049;
    public static final int eT = 2131558859;
    public static final int eU = 2131559445;
    public static final int eV = 2131559450;
    public static final int eW = 2131559294;
    public static final int eX = 2131559036;
    public static final int eY = 2131559039;
    public static final int eZ = 2131558872;
    public static final int ea = 2131558519;
    public static final int eb = 2131558931;
    public static final int ec = 2131558686;
    public static final int ed = 2131558684;
    public static final int ee = 2131559040;
    public static final int ef = 2131558912;
    public static final int eg = 2131558854;
    public static final int eh = 2131559261;
    public static final int ei = 2131559136;
    public static final int ej = 2131559092;
    public static final int ek = 2131559024;
    public static final int el = 2131559005;
    public static final int em = 2131558867;
    public static final int en = 2131558868;
    public static final int eo = 2131559394;
    public static final int ep = 2131558739;
    public static final int eq = 2131559395;
    public static final int er = 2131559219;
    public static final int es = 2131559098;
    public static final int et = 2131558438;
    public static final int eu = 2131558436;
    public static final int ev = 2131559421;
    public static final int ew = 2131558435;
    public static final int ex = 2131558434;
    public static final int ey = 2131559417;
    public static final int ez = 2131559420;
    public static boolean f = false;
    public static final int fA = 2131558932;
    public static final int fB = 2131559362;
    public static final int fC = 2131558796;
    public static final int fD = 2131558862;
    public static final int fE = 2131558863;
    public static final int fF = 2131558864;
    public static final int fG = 2131558865;
    public static final int fH = 2131558675;
    public static final int fI = 2131558903;
    public static final int fJ = 2131559148;
    public static final int fK = 2131558825;
    public static final int fL = 2131558738;
    public static final int fM = 2131558599;
    public static final int fN = 2131559368;
    public static final int fO = 2131559072;
    public static final int fP = 2131558521;
    public static final int fQ = 2131559406;
    public static final int fR = 2131559400;
    public static final int fS = 2131559405;
    public static final int fT = 2131559402;
    public static final int fU = 2131559404;
    public static final int fV = 2131558754;
    public static final int fW = 2131559375;
    public static final int fX = 2131559370;
    public static final int fY = 2131559372;
    public static final int fZ = 2131558902;
    public static final int fa = 2131559150;
    public static final int fb = 2131559151;
    public static final int fc = 2131559147;
    public static final int fd = 2131558690;
    public static final int fe = 2131558858;
    public static final int ff = 2131558907;
    public static final int fg = 2131558887;
    public static final int fh = 2131558886;
    public static final int fi = 2131558888;
    public static final int fj = 2131558906;
    public static final int fk = 2131558656;
    public static final int fl = 2131559149;
    public static final int fm = 2131559152;
    public static final int fn = 2131558795;
    public static final int fo = 2131558702;
    public static final int fp = 2131558701;
    public static final int fq = 2131558685;
    public static final int fr = 2131558910;
    public static final int fs = 2131559327;
    public static final int ft = 2131559326;
    public static final int fu = 2131559325;
    public static final int fv = 2131559328;
    public static final int fw = 2131559329;
    public static final int fx = 2131558804;
    public static final int fy = 2131558797;
    public static final int fz = 2131559073;
    public static Field g = null;
    public static final int gA = 2131362350;
    public static final int gB = 2131362348;
    public static final int gC = 2131362352;
    public static final int gD = 2131362347;
    public static final int gE = 2131362356;
    public static final int gF = 2131362353;
    public static final int gG = 2131362362;
    public static final int gH = 2131362368;
    public static final int gI = 2131362365;
    public static final int gJ = 2131362361;
    public static final int gK = 2131362366;
    public static final int gL = 2131362367;
    public static final int gM = 2131362364;
    public static final int gN = 2131362358;
    public static final int gO = 2131362360;
    public static final int gP = 2131362357;
    public static final int gQ = 2131362359;
    public static final int gR = 2131362346;
    public static final int gS = 2131624282;
    public static final int gT = 2131624297;
    public static final int gU = 2131558895;
    public static final int gV = 2131558893;
    public static final int gW = 2131558988;
    public static final int gX = 2131558987;
    public static final int gY = 2131558894;
    public static final int gZ = 2131559268;
    public static final int ga = 2131559007;
    public static final int gb = 2131558717;
    public static final int gc = 2131559077;
    public static final int gd = 2131559132;
    public static final int ge = 2131558822;
    public static final int gf = 2131559117;
    public static final int gg = 2131558517;
    public static final int gh = 2131558518;
    public static final int gi = 2131559434;
    public static final int gj = 2131558699;
    public static final int gk = 2131558826;
    public static final int gl = 2131559145;
    public static final int gm = 2131558911;
    public static final int gn = 2131558787;
    public static final int go = 2131558788;
    public static final int gp = 2131230735;
    public static final int gq = 2131362374;
    public static final int gr = 2131362376;
    public static final int gs = 2131362377;
    public static final int gt = 2131362373;
    public static final int gu = 2131362375;
    public static final int gv = 2131362378;
    public static final int gw = 2131362371;
    public static final int gx = 2131362372;
    public static final int gy = 2131362370;
    public static final int gz = 2131362369;
    public static boolean h = false;
    public static final int hA = 2130968895;
    public static final int hB = 2130968926;
    public static final int hC = 2130968943;
    public static final int hD = 2130968953;
    public static final int hE = 2131820549;
    public static final int hF = 2131362246;
    public static final int hG = 2131362241;
    public static final int hH = 2131362206;
    public static final int hI = 2131362204;
    public static final int hJ = 2131362202;
    public static final int hK = 2131362205;
    public static final int hL = 2131362203;
    public static final int hM = 2131362265;
    public static final int hN = 2131362262;
    public static final int hO = 2131362264;
    public static final int hP = 2131362275;
    public static final int hQ = 2131362276;
    public static final int hR = 2131362257;
    public static final int hS = 2131362254;
    public static final int hT = 2131362248;
    public static final int hU = 2131362255;
    public static final int hV = 2131362253;
    public static final int hW = 2131362258;
    public static final int hX = 2131362270;
    public static final int hY = 2131362277;
    public static final int hZ = 2131362259;
    public static final int ha = 2131559269;
    public static final int hb = 2131230724;
    public static final int hc = 2131230734;
    public static final int hd = 2131624111;
    public static final int he = 2131624112;
    public static final int hf = 2131624113;
    public static final int hg = 2131624114;
    public static final int hh = 2131624013;
    public static final int hi = 2131624015;
    public static final int hj = 2131624014;
    public static final int hk = 2131624016;
    public static final int hl = 2131624009;
    public static final int hm = 2131624011;
    public static final int hn = 2131624010;
    public static final int ho = 2131624012;
    public static final int hp = 2131624020;
    public static final int hq = 2131624019;
    public static final int hr = 2130968624;
    public static final int hs = 2130968626;
    public static final int ht = 2130968755;
    public static final int hu = 2130968784;
    public static final int hv = 2130968804;
    public static final int hw = 2130968810;
    public static final int hx = 2130968815;
    public static final int hy = 2130968837;
    public static final int hz = 2130968839;
    public static Field i = null;
    public static final int iA = 2131362201;
    public static final int iB = 2131362269;
    public static final int iC = 2131362230;
    public static final int iD = 2131362232;
    public static final int iE = 2131362233;
    public static final int iF = 2131362234;
    public static final int iG = 2131362231;
    public static final int iH = 2131362235;
    public static final int iI = 2131362237;
    public static final int iJ = 2131362238;
    public static final int iK = 2131362239;
    public static final int iL = 2131362236;
    public static final int iM = 2131362260;
    public static final int iN = 2131362266;
    public static final int iO = 2131362263;
    public static final int iP = 2131362224;
    public static final int iQ = 2131362225;
    public static final int iR = 2131362227;
    public static final int iS = 2131362226;
    public static final int iT = 2131362228;
    public static final int iU = 2131362247;
    public static final int iV = 2130968681;
    public static final int iW = 2130968682;
    public static final int iX = 2131624024;
    public static final int iY = 2131624023;
    public static final int iZ = 2131624022;
    public static final int ia = 2131362212;
    public static final int ib = 2131362213;
    public static final int ic = 2131362214;
    public static final int id = 2131362209;
    public static final int ie = 2131362220;
    public static final int if = 2131362215;
    public static final int ig = 2131362216;
    public static final int ih = 2131362211;
    public static final int ii = 2131362217;
    public static final int ij = 2131362207;
    public static final int ik = 2131362210;
    public static final int il = 2131362218;
    public static final int im = 2131362219;
    public static final int in = 2131362208;
    public static final int io = 2131362223;
    public static final int ip = 2131362261;
    public static final int iq = 2131362229;
    public static final int ir = 2131362221;
    public static final int is = 2131362222;
    public static final int it = 2131362272;
    public static final int iu = 2131362271;
    public static final int iv = 2131362274;
    public static final int iw = 2131362273;
    public static final int ix = 2131362268;
    public static final int iy = 2131362267;
    public static final int iz = 2131361966;
    public static boolean j = false;
    public static final int jA = 2131362125;
    public static final int jB = 2131362130;
    public static final int jC = 2131362121;
    public static final int jD = 2131362122;
    public static final int jE = 2131362126;
    public static final int jF = 2131362120;
    public static final int jG = 2131362131;
    public static final int jH = 2131362128;
    public static final int jI = 2131362132;
    public static final int jJ = 2131362119;
    public static final int jK = 2131362134;
    public static final int jL = 2131362133;
    public static final int jM = 2131362102;
    public static final int jN = 2131362106;
    public static final int jO = 2131362107;
    public static final int jP = 2131362105;
    public static final int jQ = 2131362077;
    public static final int jR = 2131362076;
    public static final int jS = 2131362075;
    public static final int jT = 2131362080;
    public static final int jU = 2131362082;
    public static final int jV = 2131362071;
    public static final int jW = 2131362072;
    public static final int jX = 2131362073;
    public static final int jY = 2131362074;
    public static final int jZ = 2131362078;
    public static final int ja = 2131624646;
    public static final int jb = 2131624222;
    public static final int jc = 2131624219;
    public static final int jd = 2131624224;
    public static final int je = 2130838657;
    public static final int jf = 2130839166;
    public static final int jg = 2130968743;
    public static final int jh = 2130968745;
    public static final int ji = 2130968746;
    public static final int jj = 2131558667;
    public static final int jk = 2131558668;
    public static final int jl = 2131558972;
    public static final int jm = 2131559351;
    public static final int jn = 2131559352;
    public static final int jo = 2131623971;
    public static final int jp = 2130772206;
    public static final int jq = 2131362110;
    public static final int jr = 2131362111;
    public static final int js = 2131362112;
    public static final int jt = 2131362113;
    public static final int ju = 2131362114;
    public static final int jv = 2131362083;
    public static final int jw = 2131362129;
    public static final int jx = 2131362123;
    public static final int jy = 2131362124;
    public static final int jz = 2131362127;
    public static final int k = 2131559060;
    public static final int kA = 2130839100;
    public static final int kB = 2130839126;
    public static final int kC = 2130968741;
    public static final int kD = 2130968890;
    public static final int kE = 2130968891;
    public static final int kF = 2130839008;
    public static final int kG = 2130839014;
    public static final int kH = 2130839017;
    public static final int kI = 2130839019;
    public static final int kJ = 2130839020;
    public static final int kK = 2130839021;
    public static final int kL = 2130839047;
    public static final int kM = 2130839048;
    public static final int kN = 2130839051;
    public static final int kO = 2131362027;
    public static final int kP = 2131362028;
    public static final int kQ = 2131362053;
    public static final int kR = 2131362054;
    public static final int kS = 2131362051;
    public static final int kT = 2131362052;
    public static final int kU = 2131362044;
    public static final int kV = 2131362050;
    public static final int kW = 2131362049;
    public static final int kX = 2131362048;
    public static final int kY = 2131362026;
    public static final int kZ = 2131362042;
    public static final int ka = 2131362079;
    public static final int kb = 2131362101;
    public static final int kc = 2131362085;
    public static final int kd = 2131362087;
    public static final int ke = 2131362086;
    public static final int kf = 2131362084;
    public static final int kg = 2131362103;
    public static final int kh = 2131362104;
    public static final int ki = 2131362136;
    public static final int kj = 2131362088;
    public static final int kk = 2131362089;
    public static final int kl = 2131362090;
    public static final int km = 2131362091;
    public static final int kn = 2131362092;
    public static final int ko = 2131362093;
    public static final int kp = 2131362095;
    public static final int kq = 2131362096;
    public static final int kr = 2131362097;
    public static final int ks = 2131362098;
    public static final int kt = 2131362094;
    public static final int ku = 2131362099;
    public static final int kv = 2131362135;
    public static final int kw = 2130838971;
    public static final int kx = 2130839005;
    public static final int ky = 2130839016;
    public static final int kz = 2130839079;
    public static final int l = 2131558639;
    public static final int lA = 2131362000;
    public static final int lB = 2131361995;
    public static final int lC = 2131362010;
    public static final int lD = 2131362009;
    public static final int lE = 2131362011;
    public static final int lF = 2131361997;
    public static final int lG = 2131361998;
    public static final int lH = 2131361999;
    public static final int lI = 2131362001;
    public static final int lJ = 2131362012;
    public static final int lK = 2131362317;
    public static final int lL = 2131492904;
    public static final int lM = 2131361973;
    public static final int lN = 2131361987;
    public static final int lO = 2131361978;
    public static final int lP = 2131361990;
    public static final int lQ = 2131361985;
    public static final int lR = 2131361988;
    public static final int lS = 2131361986;
    public static final int lT = 2131361989;
    public static final int lU = 2131361982;
    public static final int lV = 2131361983;
    public static final int lW = 2131361980;
    public static final int lX = 2131361981;
    public static final int lY = 2131361984;
    public static final int lZ = 2131361979;
    public static final int la = 2131362041;
    public static final int lb = 2131362025;
    public static final int lc = 2131362045;
    public static final int ld = 2131362046;
    public static final int le = 2131362047;
    public static final int lf = 2131362023;
    public static final int lg = 2131362037;
    public static final int lh = 2131362038;
    public static final int li = 2131362024;
    public static final int lj = 2131362030;
    public static final int lk = 2131362029;
    public static final int ll = 2131362039;
    public static final int lm = 2131362040;
    public static final int ln = 2131362031;
    public static final int lo = 2131362032;
    public static final int lp = 2131362033;
    public static final int lq = 2131362035;
    public static final int lr = 2131362034;
    public static final int ls = 2131362036;
    public static final int lt = 2130838658;
    public static final int lu = 2130838913;
    public static final int lv = 2131361996;
    public static final int lw = 2131362008;
    public static final int lx = 2131362007;
    public static final int ly = 2131362006;
    public static final int lz = 2131362005;
    public static final int m = 2131559297;
    public static final int mA = 2131363393;
    public static final int mB = 2131363394;
    public static final int mC = 2131363395;
    public static final int mD = 2131363396;
    public static final int mE = 2131363397;
    public static final int mF = 2131363398;
    public static final int mG = 2131363399;
    public static final int mH = 2131363400;
    public static final int mI = 2131363401;
    public static final int mJ = 2131363402;
    public static final int mK = 2131363403;
    public static final int mL = 2131363404;
    public static final int mM = 2131363405;
    public static final int mN = 2131363406;
    public static final int mO = 2131363407;
    public static final int mP = 2131363388;
    public static final int mQ = 2131363408;
    public static final int mR = 2131363409;
    public static final int mS = 2131363410;
    public static final int mT = 2131363411;
    public static final int mU = 2131363412;
    public static final int mV = 2131363413;
    public static final int mW = 2131363414;
    public static final int mX = 2131363415;
    public static final int mY = 2131363416;
    public static final int mZ = 2130968608;
    public static final int ma = 2131361976;
    public static final int mb = 2131361977;
    public static final int mc = 2131362398;
    public static final int md = 2131624226;
    public static final int me = 2131362405;
    public static final int mf = 2131362399;
    public static final int mg = 2131362404;
    public static final int mh = 2131362400;
    public static final int mi = 2131362406;
    public static final int mj = 2131362402;
    public static final int mk = 2131362403;
    public static final int ml = 2131362401;
    public static final int mm = 2131624540;
    public static final int mn = 2130968679;
    public static final int mo = 2130968748;
    public static final int mp = 2131034154;
    public static final int mq = 2131034155;
    public static final int mr = 2131034158;
    public static final int ms = 2131034159;
    public static final int mt = 2130968713;
    public static final int mu = 2130968798;
    public static final int mv = 2130968796;
    public static final int mw = 2131363389;
    public static final int mx = 2131363390;
    public static final int my = 2131363391;
    public static final int mz = 2131363392;
    public static final int n = 2131559301;
    public static final int na = 2130968616;
    public static final int nb = 2130968807;
    public static final int nc = 2130968884;
    public static final int nd = 2130968901;
    public static final int ne = 2130968902;
    public static final int nf = 2131558723;
    public static final int ng = 2131558718;
    public static final int nh = 2131558724;
    public static final int ni = 2131558727;
    public static final int nj = 2131558720;
    public static final int nk = 2131558719;
    public static final int nl = 2131558722;
    public static final int nm = 2131558728;
    public static final int nn = 2131558730;
    public static final int no = 2131558729;
    public static final int np = 2131427606;
    public static final int nq = 2131427608;
    public static final int nr = 2131427607;
    public static final int ns = 2131427609;
    public static final int nt = 2131427605;
    public static final int nu = 2130968698;
    public static Method nv = null;
    public static final int o = 2131559292;
    public static final int p = 2131559296;
    public static final int q = 2131559048;
    public static final int r = 2131558676;
    public static final int s = 2131558871;
    public static final int t = 2131559085;
    public static final int u = 2131559137;
    public static final int v = 2131558810;
    public static final int w = 2131558683;
    public static final int x = 2131558682;
    public static final int y = 2131559428;
    public static final int z = 2131558813;

    public void a(az azVar) {
    }

    public static void a(ClassLoader classLoader, List<File> list, File file) {
        Object obj = ci.a(classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ci.a(obj, "dexElements", ba.a(obj, new ArrayList(list), file, arrayList));
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                arrayList2.get(i);
            }
            Field a = ci.a(classLoader, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr = (IOException[]) a.get(classLoader);
            if (iOExceptionArr == null) {
                obj = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
            } else {
                Object obj2 = new IOException[(arrayList.size() + iOExceptionArr.length)];
                arrayList.toArray(obj2);
                System.arraycopy(iOExceptionArr, 0, obj2, arrayList.size(), iOExceptionArr.length);
                obj = obj2;
            }
            a.set(classLoader, obj);
        }
    }

    public static Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
        return (Object[]) ci.a(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
    }

    public static boolean a(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.os.Bundle r6, java.lang.String r7, android.os.IBinder r8) {
        /*
        r5 = 1;
        r0 = b;
        if (r0 != 0) goto L_0x0024;
    L_0x0005:
        r0 = android.os.Bundle.class;
        r1 = "putIBinder";
        r2 = 2;
        r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0040 }
        r3 = 0;
        r4 = java.lang.String.class;
        r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x0040 }
        r3 = 1;
        r4 = android.os.IBinder.class;
        r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x0040 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0040 }
        a = r0;	 Catch:{ NoSuchMethodException -> 0x0040 }
        r0 = a;	 Catch:{ NoSuchMethodException -> 0x0040 }
        r1 = 1;
        r0.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0040 }
    L_0x0022:
        b = r5;
    L_0x0024:
        r0 = a;
        if (r0 == 0) goto L_0x0036;
    L_0x0028:
        r0 = a;	 Catch:{ InvocationTargetException -> 0x003e, IllegalAccessException -> 0x0037, IllegalArgumentException -> 0x003c }
        r1 = 2;
        r1 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x003e, IllegalAccessException -> 0x0037, IllegalArgumentException -> 0x003c }
        r2 = 0;
        r1[r2] = r7;	 Catch:{ InvocationTargetException -> 0x003e, IllegalAccessException -> 0x0037, IllegalArgumentException -> 0x003c }
        r2 = 1;
        r1[r2] = r8;	 Catch:{ InvocationTargetException -> 0x003e, IllegalAccessException -> 0x0037, IllegalArgumentException -> 0x003c }
        r0.invoke(r6, r1);	 Catch:{ InvocationTargetException -> 0x003e, IllegalAccessException -> 0x0037, IllegalArgumentException -> 0x003c }
    L_0x0036:
        return;
    L_0x0037:
        r0 = move-exception;
    L_0x0038:
        r0 = 0;
        a = r0;
        goto L_0x0036;
    L_0x003c:
        r0 = move-exception;
        goto L_0x0038;
    L_0x003e:
        r0 = move-exception;
        goto L_0x0038;
    L_0x0040:
        r0 = move-exception;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a(android.os.Bundle, java.lang.String, android.os.IBinder):void");
    }

    public static Bundle a(hm hmVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", hmVar.a());
        bundle.putCharSequence("label", hmVar.b());
        bundle.putCharSequenceArray("choices", hmVar.c());
        bundle.putBoolean("allowFreeFormInput", hmVar.d());
        bundle.putBundle("extras", hmVar.e());
        return bundle;
    }

    public static Bundle[] a(hm[] hmVarArr) {
        if (hmVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[hmVarArr.length];
        for (int i = 0; i < hmVarArr.length; i++) {
            bundleArr[i] = ba.a(hmVarArr[i]);
        }
        return bundleArr;
    }

    public static Bundle a(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().equals("android.remoteinput.results")) {
            return (Bundle) clipData.getItemAt(0).getIntent().getExtras().getParcelable("android.remoteinput.resultsData");
        }
        return null;
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

    public static void a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static Drawable b(Drawable drawable) {
        if (drawable instanceof js) {
            return drawable;
        }
        return new jm(drawable);
    }

    public static boolean a(Drawable drawable, int i) {
        if (!d) {
            try {
                c = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                c.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                c.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception e2) {
                c = null;
            }
        }
        return false;
    }

    public static int c(Drawable drawable) {
        if (!f) {
            try {
                e = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                e.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            f = true;
        }
        if (e != null) {
            try {
                return ((Integer) e.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                e = null;
            }
        }
        return -1;
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void a() {
        Trace.endSection();
    }

    public static void a(LayoutInflater layoutInflater, mw mwVar) {
        Factory2 mvVar;
        if (mwVar != null) {
            mvVar = new mv(mwVar);
        } else {
            mvVar = null;
        }
        layoutInflater.setFactory2(mvVar);
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof Factory2) {
            ba.a(layoutInflater, (Factory2) factory);
        } else {
            ba.a(layoutInflater, mvVar);
        }
    }

    public static void a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!h) {
            try {
                g = LayoutInflater.class.getDeclaredField("mFactory2");
                g.setAccessible(true);
            } catch (Throwable e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            h = true;
        }
        if (g != null) {
            try {
                g.set(layoutInflater, factory2);
            } catch (Throwable e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    public static void a(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    public static MenuItem a(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static MenuItem b(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    public static View a(MenuItem menuItem) {
        return menuItem.getActionView();
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

    public static void d(View view, float f) {
        view.setScaleX(f);
    }

    public static void e(View view, float f) {
        view.setScaleY(f);
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
        if (view.getVisibility() == 0) {
            ba.i(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                ba.i((View) parent);
            }
        }
    }

    public static void b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            ba.i(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                ba.i((View) parent);
            }
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

    public static ViewParent m(View view) {
        return view.getParentForAccessibility();
    }

    public static int n(View view) {
        return view.getMinimumWidth();
    }

    public static int o(View view) {
        return view.getMinimumHeight();
    }

    public static void p(View view) {
        view.requestFitSystemWindows();
    }

    public static boolean q(View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean r(View view) {
        return view.hasOverlappingRendering();
    }

    public static void d(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static boolean s(View view) {
        return view.isLaidOut();
    }

    public static boolean t(View view) {
        return view.isAttachedToWindow();
    }

    public static void a(View view, py pyVar) {
        if (pyVar != null) {
            view.animate().setListener(new pw(pyVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public static void a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    public static void b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    public static void c(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollX(i);
    }

    public static void d(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollY(i);
    }

    public static void a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    public static void a(Object obj, View view) {
        ((AccessibilityRecord) obj).setSource(view);
    }

    public static void e(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }

    public static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof tk) {
            ((tk) compoundButton).a(colorStateList);
        }
    }

    public static void a(CompoundButton compoundButton, Mode mode) {
        if (compoundButton instanceof tk) {
            ((tk) compoundButton).a(mode);
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        if (!j) {
            try {
                i = CompoundButton.class.getDeclaredField("mButtonDrawable");
                i.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            j = true;
        }
        if (i != null) {
            try {
                return (Drawable) i.get(compoundButton);
            } catch (IllegalAccessException e2) {
                i = null;
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

    public static void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        if (VERSION.SDK_INT >= 14) {
            return accessibilityManager.isTouchExplorationEnabled();
        }
        return false;
    }

    public static void a(View view, AccessibilityManager accessibilityManager, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 16) {
            view.announceForAccessibility(charSequence);
            return;
        }
        AccessibilityManager accessibilityManager2;
        Context applicationContext = view.getContext().getApplicationContext();
        if (accessibilityManager == null) {
            accessibilityManager2 = (AccessibilityManager) applicationContext.getSystemService("accessibility");
        } else {
            accessibilityManager2 = accessibilityManager;
        }
        if (accessibilityManager2.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(8);
            obtain.getText().add(charSequence);
            obtain.setEnabled(view.isEnabled());
            obtain.setClassName(view.getClass().getName());
            obtain.setPackageName(applicationContext.getPackageName());
            qf.a(obtain).a(view);
            if (VERSION.SDK_INT >= 14) {
                view.getParent().requestSendAccessibilityEvent(view, obtain);
            } else {
                accessibilityManager2.sendAccessibilityEvent(obtain);
            }
        }
    }

    public static boolean b(String str) {
        return gwb.e(str);
    }

    public static boolean c(String str) {
        return gwb.f(str);
    }

    public static boolean d(String str) {
        return gwb.g(str);
    }

    public static boolean e(String str) {
        return gwb.h(str);
    }

    public static boolean f(String str) {
        return gwb.i(str);
    }

    public static boolean g(String str) {
        return gwb.j(str);
    }

    public static String a(String str, String str2) {
        return gwb.a(str, str2);
    }

    public static void a(Context context, int i, Intent intent) {
        bko e = fde.e(((jca) jyn.a(context, jca.class)).a());
        if (i == -1 && intent != null) {
            hkh a = gwb.a(context, intent);
            bxw bxw = new bxw();
            bxw.f = a;
            bxw.c = bxo.LOCATION;
            List arrayList = new ArrayList();
            arrayList.add(bxw);
            ((cdg) jyn.a(context, cdg.class)).a(arrayList);
            ((bpe) jyn.a(context, bpe.class)).a(new cht(e));
        } else if (i == 0) {
            gwb.a(e, 2051);
        }
    }

    public static dvm c() {
        return new dvm();
    }

    public static void a(int i, long j, int i2, dvm dvm) {
        if (j > 0) {
            mdg mdg = new mdg();
            mdg.d = ba.a(dvm.a);
            mdg.b = ba.a(j, i2, dvm);
            mdg.c = ba.a(dvm);
            if (i2 == 2 || i2 == 1) {
                gwb.a(mdg, i);
            }
            ba.a(i).a(mdg);
        }
    }

    public static mdf a(long j) {
        if (j == 0) {
            return null;
        }
        mdf mdf = new mdf();
        mdf.a = Long.valueOf(j);
        return mdf;
    }

    public static mdq a(long j, int i, dvm dvm) {
        mdq mdq = new mdq();
        mdq.a = Integer.valueOf(18);
        mdq.r = Integer.valueOf(1);
        mdq.d = Integer.valueOf(dvm.p);
        mdq.t = Long.valueOf(j);
        mdq.f = Integer.valueOf(i);
        mdq.C = dvm.j;
        mdq.y = Long.toString(ffh.a().b());
        if (dvm.g != null) {
            mdq.p = Long.valueOf(blo.d(dvm.g));
        }
        if (dvm.i > 0) {
            mdq.B = Long.valueOf(dvm.i);
        }
        if (dvm.c > 0 || dvm.e > 0 || dvm.d > 0 || dvm.s != null) {
            mdq.v = new mdl();
            if (dvm.c > 0) {
                mdq.v.d = Integer.valueOf(dvm.c);
            }
            if (dvm.e > 0) {
                mdq.v.h = Integer.valueOf(dvm.e);
            }
            if (dvm.d > 0) {
                mdq.v.i = Long.valueOf(dvm.d);
            }
            if (dvm.s != null) {
                mdq.v.a = dvm.s;
            }
        }
        if (dvm.h != null) {
            mdq.x = new mdr();
            mdq.x.a = dvm.h;
        }
        if (dvm.b != null) {
            mdq.b = new mds();
            mdq.b.a = dvm.b;
        }
        if (dvm.m != null) {
            mdp mdp = new mdp();
            mdp.a = dvm.m;
            mdp.b = Integer.valueOf(dvm.n);
            mdp.c = Integer.valueOf(dvm.o);
            mdq.z = new mdp[1];
            mdq.z[0] = mdp;
        }
        if (i == 2 || i == 5) {
            iim iim = (iim) jyn.a(gwb.H(), iim.class);
            mdq.A = new mdo();
            mdq.A.a = Integer.valueOf(iim.a());
        }
        if (i == 6) {
            if (mdq.v == null) {
                mdq.v = new mdl();
            }
            mdq.v.f = Integer.valueOf(dvm.r);
        }
        return mdq;
    }

    public static mcc a(dvm dvm) {
        if (dvm.k == null && dvm.l == null && dvm.f == null && dvm.q == null) {
            return null;
        }
        mcc mcc = new mcc();
        if (dvm.f != null) {
            mcc.f = new mcd();
            mcc.f.a = dvm.f;
        }
        if (!(dvm.l == null && dvm.k == null)) {
            mcc.a = new mcf();
            if (dvm.l != null) {
                mcc.a.g = Boolean.valueOf(gwb.b(dvm.l));
            }
            if (dvm.k != null) {
                mcc.a.a = Boolean.valueOf(blo.a(dvm.k.a));
                mcc.a.b = Boolean.valueOf(dvm.k.b);
                mcc.a.m = Boolean.valueOf(dvm.k.m);
                mcc.a.c = Boolean.valueOf(dvm.k.c);
                mcc.a.d = Integer.valueOf(dvm.k.g);
                mcc.a.h = Long.valueOf(dvm.k.h);
                mcc.a.i = Long.valueOf(dvm.k.i);
                mcc.a.j = Long.valueOf(dvm.k.j);
                mcc.a.k = Integer.valueOf(dvm.k.k);
                mcc.a.l = Integer.valueOf(dvm.k.l);
                mcc.a.o = Boolean.valueOf(dvm.k.n);
                mcc.b = new mce();
                mcc.b.a = Boolean.valueOf(dvm.k.e);
                mcc.c = new mch();
                mcc.c.a = Boolean.valueOf(dvm.k.d);
                mcc.c.b = Integer.valueOf(dvm.k.f);
            }
        }
        mcc.e = dvm.q;
        return mcc;
    }

    public static iid a(int i) {
        return ((iih) jyn.a(gwb.H(), iih.class)).a(i);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE requests (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, version_code INT NOT NULL,queue_name TEXT NOT NULL,account INT NOT NULL,server_request BLOB NOT NULL,fail_count INT NOT NULL,server_fail_count INT NOT NULL,server_target_retry INT NOT NULL,creation_time INT NOT NULL);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS requests;");
    }

    public static void a(Context context, String str) {
        new Builder(context).setTitle(bc.gs).setMessage(str).setCancelable(true).show();
    }

    public static void a(Context context, StringBuilder stringBuilder, long j, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append('\n');
            stringBuilder.append(context.getResources().getString(bc.cN, new Object[]{glq.i(gwb.H(), str)}));
        }
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append('\n');
            stringBuilder.append(context.getResources().getString(bc.sV, new Object[]{str2}));
        }
        stringBuilder.append('\n');
        stringBuilder.append(context.getResources().getString(bc.kh, new Object[]{glj.a(j).toString()}));
        ba.a(context, stringBuilder.toString());
    }

    public static void a(ed edVar) {
        if (nv == null) {
            try {
                nv = edVar.getClass().getMethod("noteStateNotSaved", new Class[0]);
            } catch (NoSuchMethodException e) {
                ba.d();
            }
        }
        try {
            ((Method) ba.a(nv)).invoke(edVar, new Object[0]);
        } catch (IllegalAccessException e2) {
            ba.d();
        } catch (InvocationTargetException e3) {
            ba.d();
        }
    }

    public static void d() {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved");
    }

    @Deprecated
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static <T extends CharSequence> T a(T t, Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
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

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(ba.a(str, objArr));
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

    public static void b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(ba.a(str, objArr));
        }
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int b(int i, int i2) {
        return ba.a(i, i2, "index");
    }

    public static int a(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(ba.b(i, i2, str));
    }

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return ba.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            return ba.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static String a(String str, Object... objArr) {
        int i = 0;
        String valueOf = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(valueOf.substring(i2, indexOf));
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            int i3 = i2;
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(valueOf.substring(i2));
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

    public static InputMethodManager b(Context context) {
        return (InputMethodManager) context.getSystemService("input_method");
    }

    public static void u(View view) {
        if (view != null) {
            InputMethodManager b = ba.b(view.getContext());
            if (b != null) {
                b.showSoftInput(view, 0);
            }
        }
    }

    public static void v(View view) {
        if (view != null) {
            InputMethodManager b = ba.b(view.getContext());
            if (b != null) {
                b.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return mez.b(obj, obj2);
    }

    public static kgi b(Object obj) {
        return new kgi(obj.getClass().getSimpleName());
    }

    public static String h(String str) {
        return str == null ? "" : str;
    }

    public static boolean i(String str) {
        return mfd.a(str);
    }

    public static <E> ArrayList<E> e() {
        return new ArrayList();
    }

    public static <E> ArrayList<E> a(E... eArr) {
        bm.a((Object) eArr);
        Object arrayList = new ArrayList(ba.b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static int b(int i) {
        gwb.d(i, "arraySize");
        return gwb.e((5 + ((long) i)) + ((long) (i / 10)));
    }

    public static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        bm.a((Object) iterable);
        if (iterable instanceof Collection) {
            return new ArrayList(miv.a((Iterable) iterable));
        }
        return ba.a(iterable.iterator());
    }

    public static <E> ArrayList<E> a(Iterator<? extends E> it) {
        Collection e = ba.e();
        mlj.a(e, (Iterator) it);
        return e;
    }

    public static <E> LinkedList<E> f() {
        return new LinkedList();
    }

    public static <E> LinkedList<E> b(Iterable<? extends E> iterable) {
        Collection f = ba.f();
        gwb.a(f, (Iterable) iterable);
        return f;
    }

    public static boolean a(List<?> list, Object obj) {
        if (obj == bm.a((Object) list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return mlj.a(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!mez.b(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return ba.c((List) list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (mez.b(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int c(List<?> list, Object obj) {
        int i = 0;
        int size = list.size();
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(list.get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static int d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return ba.e((List) list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (mez.b(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int e(List<?> list, Object obj) {
        int size;
        if (obj == null) {
            for (size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
        } else {
            for (size = list.size() - 1; size >= 0; size--) {
                if (obj.equals(list.get(size))) {
                    return size;
                }
            }
        }
        return -1;
    }

    public static <E> HashSet<E> g() {
        return new HashSet();
    }

    public static <E> HashSet<E> c(int i) {
        return new HashSet(mls.b(i));
    }

    public static int a(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            } else {
                hashCode = 0;
            }
            i = ((i + hashCode) ^ -1) ^ -1;
        }
        return i;
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public static boolean a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static boolean a(Set<?> set, Collection<?> collection) {
        bm.a((Object) collection);
        if (collection instanceof mmn) {
            Collection a = ((mmn) collection).a();
        }
        if (!(a instanceof Set) || a.size() <= set.size()) {
            return ba.a((Set) set, a.iterator());
        }
        return mlj.a(set.iterator(), a);
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str).concat(" must not be null"));
    }
}
