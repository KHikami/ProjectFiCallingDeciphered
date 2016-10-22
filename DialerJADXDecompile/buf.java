import android.accounts.Account;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.app.RemoteInput;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Geocoder;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.PersistableBundle;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserManager;
import android.preference.PreferenceManager;
import android.provider.BlockedNumberContract;
import android.provider.BlockedNumberContract.BlockedNumbers;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Directory;
import android.provider.ContactsContract.RawContacts;
import android.provider.ContactsContract.StatusUpdates;
import android.provider.Settings.System;
import android.support.design.widget.CoordinatorLayout;
import android.telecom.Call;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telecom.VideoProfile;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.BidiFormatter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.text.style.TtsSpan;
import android.text.style.TtsSpan.TelephoneBuilder;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.BaseSavedState;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.OverScroller;
import android.widget.PopupWindow;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.Toast;
import com.android.contacts.common.location.CountryDetector;
import com.google.android.apps.dialer.spam.impl.SpamJobService;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import io.grpc.internal.ch;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class buf {
    public static final int A = 2130772031;
    public static final int B = 2130772108;
    public static final int C = 2130772111;
    public static final int D = 2130772167;
    public static final int E = 2130772116;
    public static final int F = 2130772117;
    public static final int G = 2130772119;
    public static final int H = 2130772100;
    public static final int I = 2130772104;
    public static final int J = 2130772102;
    public static final int K = 2130772103;
    public static final int L = 2130772101;
    public static final int M = 2130772098;
    public static final int N = 2130772058;
    public static final int O = 2130772090;
    public static final int P = 2130772121;
    public static final int Q = 2130772080;
    public static final int R = 2130772129;
    public static final int S = 2130772091;
    public static final int T = 2130772096;
    public static final int U = 2130772122;
    public static final int V = 2130772123;
    public static final int W = 2130772126;
    public static final int X = 2130772127;
    public static final int Y = 2130772075;
    public static final int Z = 2130772074;
    public static final int aA = 2130837522;
    public static final int aB = 2130837523;
    public static final int aC = 2130837526;
    public static final int aD = 2130837528;
    public static final int aE = 2130837529;
    public static final int aF = 2130837531;
    public static final int aG = 2130837532;
    public static final int aH = 2130837533;
    public static final int aI = 2130837544;
    public static final int aJ = 2130837555;
    public static final int aK = 2130837556;
    public static final int aL = 2130837557;
    public static final int aM = 2130837558;
    public static final int aN = 2130837559;
    public static final int aO = 2130837565;
    public static final int aP = 2130837566;
    public static final int aQ = 2130837567;
    public static final int aR = 2130837568;
    public static final int aS = 2130837569;
    public static final int aT = 2130837570;
    public static final int aU = 2130837571;
    public static final int aV = 2130837572;
    public static final int aW = 2130837574;
    public static final int aX = 2130837575;
    public static final int aY = 2130837576;
    public static final int aZ = 2130837577;
    public static final int aa = 2131296256;
    public static final int ab = 2131296260;
    public static final int ac = 2131361792;
    public static final int ad = 2131362064;
    public static final int ae = 2131362065;
    public static final int af = 2131362066;
    public static final int ag = 2131362067;
    public static final int ah = 2131362068;
    public static final int ai = 2131362069;
    public static final int aj = 2131362070;
    public static final int ak = 2131427337;
    public static final int al = 2131427338;
    public static final int am = 2131427349;
    public static final int an = 2131427350;
    public static final int ao = 2131427375;
    public static final int ap = 2131427376;
    public static final int aq = 2130837504;
    public static final int ar = 2130837506;
    public static final int as = 2130837507;
    public static final int at = 2130837510;
    public static final int au = 2130837511;
    public static final int av = 2130837512;
    public static final int aw = 2130837517;
    public static final int ax = 2130837518;
    public static final int ay = 2130837519;
    public static final int az = 2130837521;
    public static final int bA = 2131492982;
    public static final int bB = 2131492968;
    public static final int bC = 2131492891;
    public static final int bD = 2131492984;
    public static final int bE = 2131492976;
    public static final int bF = 2131492966;
    public static final int bG = 2131492971;
    public static final int bH = 2131492970;
    public static final int bI = 2130968576;
    public static final int bJ = 2130968579;
    public static final int bK = 2130968580;
    public static final int bL = 2130968582;
    public static final int bM = 2130968583;
    public static final int bN = 2130968584;
    public static final int bO = 2130968587;
    public static final int bP = 2130968588;
    public static final int bQ = 2130968589;
    public static final int bR = 2130968590;
    public static final int bS = 2130968591;
    public static final int bT = 2130968592;
    public static final int bU = 2130968593;
    public static final int bV = 2130968594;
    public static final int bW = 2130968596;
    public static final int bX = 2130968597;
    public static final int bY = 2130968598;
    public static final int bZ = 2130968705;
    public static final int ba = 2130837578;
    public static final int bb = 2130837579;
    public static final int bc = 2131492990;
    public static final int bd = 2131492864;
    public static final int be = 2131492989;
    public static final int bf = 2131492958;
    public static final int bg = 2131492957;
    public static final int bh = 2131492991;
    public static final int bi = 2131492986;
    public static final int bj = 2131492959;
    public static final int bk = 2131492960;
    public static final int bl = 2131492972;
    public static final int bm = 2131492967;
    public static final int bn = 2131492973;
    public static final int bo = 2131492979;
    public static final int bp = 2131492978;
    public static final int bq = 2131492988;
    public static final int br = 2131492963;
    public static final int bs = 2131492961;
    public static final int bt = 2131492965;
    public static final int bu = 2131492962;
    public static final int bv = 2131492964;
    public static final int bw = 2131492969;
    public static final int bx = 2131492977;
    public static final int by = 2131492974;
    public static final int bz = 2131492975;
    public static final int cA = 2131361861;
    public static final int cB = 2131361893;
    public static final int cC = 2131361920;
    public static final int cD = 2131361921;
    public static final int cE = 2131361949;
    public static final int cF = 2131361965;
    public static final int cG = 2131361966;
    public static final int cH = 2131362012;
    public static final int cI = 2131362031;
    public static final int cJ = 2131362039;
    public static final int cK = 2131362041;
    public static final int cL = 2131362042;
    public static final int cM = 2131427477;
    public static final int cN = 2131427492;
    public static final int cO = 2131427494;
    public static final int cP = 2131427503;
    public static final int cQ = 2131427578;
    public static final int cR = 2131427597;
    public static final int cS = 2131427599;
    public static final int cT = 2131427600;
    public static final int cU = 2131427602;
    public static final int cV = 2131427625;
    public static final int cW = 2131427700;
    public static final int cX = 2131427701;
    public static final int cY = 2131427702;
    public static final int cZ = 2131427706;
    public static final int ca = 2131689475;
    public static final int cb = 2131689478;
    public static final int cc = 2131689479;
    public static final int cd = 2131689500;
    public static final int ce = 2131689501;
    public static final int cf = 2131755292;
    public static final int cg = 2131755304;
    public static final int ch = 2131361862;
    public static final int ci = 2131361863;
    public static final int cj = 2131361864;
    public static final int ck = 2131361865;
    public static final int cl = 2131427484;
    public static final int cm = 2131755162;
    public static abs cn = null;
    public static final int co = 2131230740;
    public static final int cp = 2131230741;
    public static final int cq = 2131296261;
    public static final int cr = 2131296262;
    public static final int cs = 2131296263;
    public static final int ct = 2131296264;
    public static final int cu = 2131296265;
    public static final int cv = 2131296266;
    public static final int cw = 2131296267;
    public static final int cx = 2131296268;
    public static final int cy = 2131296269;
    public static final int cz = 2131296272;
    public static final int dA = 2131689512;
    public static final int dB = 2131689564;
    public static final int dC = 2131689565;
    public static final int dD = 2131689571;
    public static final int dE = 2131689574;
    public static final int dF = 2131689575;
    public static final int dG = 2131689576;
    public static final int dH = 2131689577;
    public static final int dI = 2131689578;
    public static final int dJ = 2131689582;
    public static final int dK = 2131689583;
    public static final int dL = 2131689584;
    public static final int dM = 2131689585;
    public static final int dN = 2131689618;
    public static final int dO = 2131689619;
    public static final int dP = 2131689620;
    public static final int dQ = 2131689622;
    public static final int dR = 2131689623;
    public static final int dS = 2131689624;
    public static final int dT = 2131689625;
    public static final int dU = 2131689628;
    public static final int dV = 2131689629;
    public static final int dW = 2131689630;
    public static final int dX = 2131689631;
    public static final int dY = 2131689633;
    public static final int dZ = 2131689634;
    public static final int da = 2130837668;
    public static final int db = 2130837670;
    public static final int dc = 2130837730;
    public static final int dd = 2130837744;
    public static final int de = 2130837763;
    public static final int df = 2130837794;
    public static final int dg = 2130837799;
    public static final int dh = 2130837838;
    public static final int di = 2131558405;
    public static final int dj = 2131558409;
    public static final int dk = 2131558410;
    public static final int dl = 2131558418;
    public static final int dm = 2131558426;
    public static final int dn = 2130968605;
    public static final int do = 2130968606;
    public static final int dp = 2130968629;
    public static final int dq = 2130968632;
    public static final int dr = 2130968634;
    public static final int ds = 2130968639;
    public static final int dt = 2130968652;
    public static final int du = 2130968664;
    public static final int dv = 2130968698;
    public static final int dw = 2130968699;
    public static final int dx = 2130968707;
    public static final int dy = 2130903040;
    public static final int dz = 2131623942;
    public static final int eA = 2131689812;
    public static final int eB = 2131689813;
    public static final int eC = 2131689814;
    public static final int eD = 2131689832;
    public static final int eE = 2131689833;
    public static final int eF = 2131689835;
    public static final int eG = 2131689836;
    public static final int eH = 2131689839;
    public static final int eI = 2131689840;
    public static final int eJ = 2131689847;
    public static final int eK = 2131689848;
    public static final int eL = 2131689849;
    public static final int eM = 2131689850;
    public static final int eN = 2131689851;
    public static final int eO = 2131689852;
    public static final int eP = 2131689853;
    public static final int eQ = 2131689859;
    public static final int eR = 2131689862;
    public static final int eS = 2131689863;
    public static final int eT = 2131689864;
    public static final int eU = 2131689865;
    public static final int eV = 2131689866;
    public static final int eW = 2131689867;
    public static final int eX = 2131689868;
    public static final int eY = 2131689869;
    public static final int eZ = 2131689870;
    public static final int ea = 2131689635;
    public static final int eb = 2131689642;
    public static final int ec = 2131689643;
    public static final int ed = 2131689644;
    public static final int ee = 2131689663;
    public static final int ef = 2131689664;
    public static final int eg = 2131689665;
    public static final int eh = 2131689666;
    public static final int ei = 2131689667;
    public static final int ej = 2131689668;
    public static final int ek = 2131689669;
    public static final int el = 2131689670;
    public static final int em = 2131689671;
    public static final int en = 2131689677;
    public static final int eo = 2131689678;
    public static final int ep = 2131689679;
    public static final int eq = 2131689712;
    public static final int er = 2131689713;
    public static final int es = 2131689714;
    public static final int et = 2131689720;
    public static final int eu = 2131689725;
    public static final int ev = 2131689726;
    public static final int ew = 2131689732;
    public static final int ex = 2131689733;
    public static final int ey = 2131689770;
    public static final int ez = 2131689775;
    public static final int fA = 2131689945;
    public static final int fB = 2131689946;
    public static final int fC = 2131689947;
    public static final int fD = 2131689951;
    public static final int fE = 2131689958;
    public static final int fF = 2131689959;
    public static final int fG = 2131689960;
    public static final int fH = 2131689961;
    public static final int fI = 2131689982;
    public static final int fJ = 2131689983;
    public static final int fK = 2131689984;
    public static final int fL = 2131689985;
    public static final int fM = 2131689986;
    public static final int fN = 2131689987;
    public static final int fO = 2131689988;
    public static final int fP = 2131689989;
    public static final int fQ = 2131689990;
    public static final int fR = 2131689991;
    public static final int fS = 2131689992;
    public static final int fT = 2131689993;
    public static final int fU = 2131690006;
    public static final int fV = 2131690007;
    public static final int fW = 2131690008;
    public static final int fX = 2131690079;
    public static final int fY = 2131690102;
    public static final int fZ = 2131690109;
    public static final int fa = 2131689871;
    public static final int fb = 2131689872;
    public static final int fc = 2131689873;
    public static final int fd = 2131689874;
    public static final int fe = 2131689877;
    public static final int ff = 2131689878;
    public static final int fg = 2131689879;
    public static final int fh = 2131689880;
    public static final int fi = 2131689882;
    public static final int fj = 2131689892;
    public static final int fk = 2131689893;
    public static final int fl = 2131689894;
    public static final int fm = 2131689898;
    public static final int fn = 2131689901;
    public static final int fo = 2131689903;
    public static final int fp = 2131689904;
    public static final int fq = 2131689905;
    public static final int fr = 2131689906;
    public static final int fs = 2131689908;
    public static final int ft = 2131689909;
    public static final int fu = 2131689910;
    public static final int fv = 2131689928;
    public static final int fw = 2131689929;
    public static final int fx = 2131689933;
    public static final int fy = 2131689935;
    public static final int fz = 2131689936;
    public static final int gA = 2131690188;
    public static final int gB = 2131690189;
    public static final int gC = 2131690190;
    public static final int gD = 2131690191;
    public static final int gE = 2131690192;
    public static final int gF = 2131690193;
    public static final int gG = 2131690194;
    public static final int gH = 2131690195;
    public static final int gI = 2131690196;
    public static final int gJ = 2131690197;
    public static final int gK = 2131690223;
    public static final int gL = 2131690224;
    public static final int gM = 2131690226;
    public static final int gN = 2131690240;
    public static final int gO = 2131690241;
    public static final int gP = 2131690259;
    public static final int gQ = 2131690260;
    public static final int gR = 2131690263;
    public static final int gS = 2131690264;
    public static final int gT = 2131690265;
    public static final int gU = 2131690266;
    public static final int gV = 2131690267;
    public static final int gW = 2131690309;
    public static final int gX = 2131755224;
    public static final int gY = 2131755290;
    public static alg gZ = null;
    public static final int ga = 2131690110;
    public static final int gb = 2131690111;
    public static final int gc = 2131690112;
    public static final int gd = 2131690115;
    public static final int ge = 2131690116;
    public static final int gf = 2131690117;
    public static final int gg = 2131690129;
    public static final int gh = 2131690131;
    public static final int gi = 2131690132;
    public static final int gj = 2131690156;
    public static final int gk = 2131690165;
    public static final int gl = 2131690166;
    public static final int gm = 2131690168;
    public static final int gn = 2131690174;
    public static final int go = 2131690175;
    public static final int gp = 2131690176;
    public static final int gq = 2131690177;
    public static final int gr = 2131690178;
    public static final int gs = 2131690179;
    public static final int gt = 2131690180;
    public static final int gu = 2131690182;
    public static final int gv = 2131690183;
    public static final int gw = 2131690184;
    public static final int gx = 2131690185;
    public static final int gy = 2131690186;
    public static final int gz = 2131690187;
    public static final int hA = 2130968623;
    public static final int hB = 2130968624;
    public static final int hC = 2130968625;
    public static final int hD = 2130968626;
    public static final int hE = 2130968654;
    public static final int hF = 2130968655;
    public static final int hG = 2130968663;
    public static final int hH = 2130968666;
    public static final int hI = 2130968674;
    public static final int hJ = 2130968687;
    public static final int hK = 2130968688;
    public static final int hL = 2130968696;
    public static final int hM = 2130968703;
    public static final int hN = 2130968704;
    public static final int hO = 2130968710;
    public static final int hP = 2130968711;
    public static final int hQ = 2130968712;
    public static final int hR = 2131820544;
    public static final int hS = 2131820545;
    public static final int hT = 2131820546;
    public static final int hU = 2131623940;
    public static final int hV = 2131099651;
    public static final int hW = 2131099657;
    public static ald hX = null;
    public static final int hY = 2131361910;
    public static final int hZ = 2130837666;
    public static apr ha = null;
    public static final int hb = 2131034134;
    public static final int hc = 2131034135;
    public static final int hd = 2131034136;
    public static final int he = 2131034137;
    public static final int hf = 2131034138;
    public static final int hg = 2131034139;
    public static final int hh = 2131427401;
    public static final int hi = 2131427412;
    public static final int hj = 2131427459;
    public static final int hk = 2131427483;
    public static final int hl = 2131427506;
    public static final int hm = 2131427509;
    public static final int hn = 2131427686;
    public static final int ho = 2131558414;
    public static final int hp = 2131558415;
    public static final int hq = 2131558417;
    public static final int hr = 2130968608;
    public static final int hs = 2130968611;
    public static final int ht = 2130968612;
    public static final int hu = 2130968613;
    public static final int hv = 2130968614;
    public static final int hw = 2130968615;
    public static final int hx = 2130968620;
    public static final int hy = 2130968621;
    public static final int hz = 2130968622;
    public static final int iA = 2131690252;
    public static final int iB = 2131690253;
    public static final int iC = 2131690254;
    public static final int iD = 2131755012;
    public static avt iE = null;
    public static final int iF = 2131427560;
    public static final int iG = 2130837593;
    public static final int iH = 2131493188;
    public static final int iI = 2131493173;
    public static final int iJ = 2131493172;
    public static final int iK = 2131493186;
    public static final int iL = 2131493187;
    public static final int iM = 2131493165;
    public static final int iN = 2131493162;
    public static final int iO = 2131493161;
    public static final int iP = 2131493182;
    public static final int iQ = 2131493183;
    public static final int iR = 2131493166;
    public static final int iS = 2131493174;
    public static final int iT = 2131493176;
    public static final int iU = 2131493180;
    public static final int iV = 2131493164;
    public static final int iW = 2131493163;
    public static final int iX = 2131493177;
    public static final int iY = 2131493160;
    public static final int iZ = 2131493159;
    public static final int ia = 2131493016;
    public static final int ib = 2131493017;
    public static final int ic = 2130968610;
    public static final int id = 2131689542;
    public static final int ie = 2131689543;
    public static final int if = 2131689544;
    public static final int ig = 2131689545;
    public static final int ih = 2131689546;
    public static final int ii = 2131689549;
    public static final int ij = 2131689551;
    public static final int ik = 2131689552;
    public static final int il = 2131689553;
    public static final int im = 2131689572;
    public static final int in = 2131689573;
    public static final int io = 2131689927;
    public static final int ip = 2131689978;
    public static final int iq = 2131689979;
    public static final int ir = 2131689980;
    public static final int is = 2131689981;
    public static final int it = 2131690137;
    public static final int iu = 2131690138;
    public static final int iv = 2131690139;
    public static final int iw = 2131690161;
    public static final int ix = 2131690198;
    public static final int iy = 2131690199;
    public static final int iz = 2131690251;
    public static final int jA = 2131230722;
    public static final int jB = 2131230725;
    public static final int jC = 2131230726;
    public static final int jD = 2131230727;
    public static final int jE = 2131230728;
    public static final int jF = 2131230729;
    public static final int jG = 2131230730;
    public static final int jH = 2131230731;
    public static final int jI = 2131230732;
    public static final int jJ = 2131230733;
    public static final int jK = 2131230734;
    public static final int jL = 2131230735;
    public static final int jM = 2131230736;
    public static final int jN = 2131230737;
    public static final int jO = 2131230738;
    public static final int jP = 2131230739;
    public static final int jQ = 2131296273;
    public static final int jR = 2131296274;
    public static final int jS = 2131296275;
    public static final int jT = 2131361911;
    public static final int jU = 2131361912;
    public static final int jV = 2131361950;
    public static final int jW = 2131361959;
    public static final int jX = 2131361960;
    public static final int jY = 2131362032;
    public static final int jZ = 2131427431;
    public static final int ja = 2131493178;
    public static final int jb = 2131689760;
    public static final int jc = 2131689798;
    public static final int jd = 2131689818;
    public static final int je = 2131689819;
    public static final int jf = 2131689820;
    public static final int jg = 2131689821;
    public static final int jh = 2131689822;
    public static final int ji = 2131689823;
    public static final int jj = 2131689824;
    public static final int jk = 2131689825;
    public static final int jl = 2131689826;
    public static final int jm = 2131689827;
    public static final int jn = 2131689828;
    public static final int jo = 2131689829;
    public static final int jp = 2131689830;
    public static final int jq = 2131689831;
    public static awm jr = null;
    public static awu js = null;
    public static axf jt = null;
    public static final int ju = 2131690144;
    public static final int jv = 2131690146;
    public static bef jw = null;
    public static bem jx = null;
    public static final int jy = 2131230720;
    public static final int jz = 2131230721;
    public static Field k = null;
    public static final int kA = 2130837746;
    public static final int kB = 2130837757;
    public static final int kC = 2130837787;
    public static final int kD = 2130837800;
    public static final int kE = 2130837801;
    public static final int kF = 2130837804;
    public static final int kG = 2130837805;
    public static final int kH = 2130837834;
    public static final int kI = 2130837836;
    public static final int kJ = 2131558404;
    public static final int kK = 2131558423;
    public static final int kL = 2131558424;
    public static final int kM = 2131558430;
    public static final int kN = 2131558431;
    public static final int kO = 2130968602;
    public static final int kP = 2130968609;
    public static final int kQ = 2130968616;
    public static final int kR = 2130968617;
    public static final int kS = 2130968618;
    public static final int kT = 2130968619;
    public static final int kU = 2130968630;
    public static final int kV = 2130968631;
    public static final int kW = 2130968669;
    public static final int kX = 2130968670;
    public static final int kY = 2130968684;
    public static final int kZ = 2130968685;
    public static final int ka = 2131427588;
    public static final int kb = 2131427589;
    public static final int kc = 2131427601;
    public static final int kd = 2131427620;
    public static final int ke = 2131427632;
    public static final int kf = 2131427661;
    public static final int kg = 2131427721;
    public static final int kh = 2130837581;
    public static final int ki = 2130837596;
    public static final int kj = 2130837597;
    public static final int kk = 2130837599;
    public static final int kl = 2130837600;
    public static final int km = 2130837667;
    public static final int kn = 2130837677;
    public static final int ko = 2130837681;
    public static final int kp = 2130837682;
    public static final int kq = 2130837683;
    public static final int kr = 2130837698;
    public static final int ks = 2130837699;
    public static final int kt = 2130837701;
    public static final int ku = 2130837702;
    public static final int kv = 2130837705;
    public static final int kw = 2130837708;
    public static final int kx = 2130837711;
    public static final int ky = 2130837716;
    public static final int kz = 2130837742;
    public static boolean l = false;
    public static final int lA = 2131689896;
    public static final int lB = 2131689897;
    public static final int lC = 2131689948;
    public static final int lD = 2131689949;
    public static final int lE = 2131689950;
    public static final int lF = 2131689954;
    public static final int lG = 2131689994;
    public static final int lH = 2131689995;
    public static final int lI = 2131689996;
    public static final int lJ = 2131689997;
    public static final int lK = 2131690000;
    public static final int lL = 2131690001;
    public static final int lM = 2131690049;
    public static final int lN = 2131690088;
    public static final int lO = 2131690093;
    public static final int lP = 2131690134;
    public static final int lQ = 2131690135;
    public static final int lR = 2131690136;
    public static final int lS = 2131690160;
    public static final int lT = 2131099653;
    public static final int lU = 2131493210;
    public static final int lV = 2130968672;
    public static final int lW = 2131689561;
    public static final int lX = 2131099648;
    public static final int lY = 2131099649;
    public static boolean lZ = false;
    public static final int la = 2130968708;
    public static final int lb = 2131820547;
    public static final int lc = 2131623937;
    public static final int ld = 2131623938;
    public static final int le = 2131623939;
    public static final int lf = 2131755199;
    public static final int lg = 2130837648;
    public static final int lh = 2131493064;
    public static final int li = 2131493074;
    public static final int lj = 2131493200;
    public static final int lk = 2131493201;
    public static final int ll = 2131493199;
    public static final int lm = 2131493207;
    public static final int ln = 2131492887;
    public static final int lo = 2131493167;
    public static final int lp = 2131493205;
    public static final int lq = 2131493206;
    public static final int lr = 2130968665;
    public static final int ls = 2130968667;
    public static final int lt = 2130968668;
    public static final int lu = 2130968686;
    public static final int lv = 2130968706;
    public static final int lw = 2131689506;
    public static final int lx = 2131689641;
    public static final int ly = 2131689807;
    public static final int lz = 2131689808;
    public static Field m = null;
    public static final int ma = 2131689700;
    public static final int mb = 2130837601;
    public static final int mc = 2130837622;
    public static Set md = null;
    public static Set me = null;
    public static final int mf = 2131690123;
    public static volatile Thread mg = null;
    public static boolean n = false;
    public static final int o = 2130772032;
    public static final int p = 2130772037;
    public static final int q = 2130772033;
    public static final int r = 2130772027;
    public static final int s = 2130772029;
    public static final int t = 2130772035;
    public static final int u = 2130772036;
    public static final int v = 2130772061;
    public static final int w = 2130772054;
    public static final int x = 2130772051;
    public static final int y = 2130772042;
    public static final int z = 2130772030;

    public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean c(CoordinatorLayout coordinatorLayout, View view) {
        return false;
    }

    public boolean c(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public void d(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return false;
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    public static mj a(mj mjVar) {
        return mjVar;
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }

    public Parcelable b(CoordinatorLayout coordinatorLayout, View view) {
        return BaseSavedState.EMPTY_STATE;
    }

    public static int a(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static float b(float f, float f2, float f3) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > 1.0f ? 1.0f : f;
    }

    public static float[] a(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        length = Math.min(i3, length - i);
        Object obj = new float[i3];
        System.arraycopy(fArr, i, obj, 0, length);
        return obj;
    }

    public static bl[] a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), b(trim));
            }
            i = a + 1;
            i2 = a;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(arrayList, str.charAt(i2), new float[0]);
        }
        return (bl[]) arrayList.toArray(new bl[arrayList.size()]);
    }

    public static bl[] a(bl[] blVarArr) {
        if (blVarArr == null) {
            return null;
        }
        bl[] blVarArr2 = new bl[blVarArr.length];
        for (int i = 0; i < blVarArr.length; i++) {
            blVarArr2[i] = new bl(blVarArr[i]);
        }
        return blVarArr2;
    }

    public static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public static void a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new bl(c, fArr));
    }

    public static float[] b(String str) {
        if (((str.charAt(0) == 'z' ? 1 : 0) | (str.charAt(0) == 'Z' ? 1 : 0)) != 0) {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            bk bkVar = new bk();
            int length = str.length();
            int i = 0;
            int i2 = 1;
            while (i2 < length) {
                int i3;
                a(str, i2, bkVar);
                int i4 = bkVar.a;
                if (i2 < i4) {
                    i3 = i + 1;
                    fArr[i] = Float.parseFloat(str.substring(i2, i4));
                } else {
                    i3 = i;
                }
                if (bkVar.b) {
                    i2 = i4;
                    i = i3;
                } else {
                    i2 = i4 + 1;
                    i = i3;
                }
            }
            return a(fArr, 0, i);
        } catch (Throwable e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r7, int r8, bk r9) {
        /*
        r1 = 0;
        r5 = 1;
        r9.b = r1;
        r0 = r1;
        r2 = r1;
        r3 = r1;
        r4 = r8;
    L_0x0008:
        r6 = r7.length();
        if (r4 >= r6) goto L_0x0033;
    L_0x000e:
        r6 = r7.charAt(r4);
        switch(r6) {
            case 32: goto L_0x001b;
            case 44: goto L_0x001b;
            case 45: goto L_0x001e;
            case 46: goto L_0x0027;
            case 69: goto L_0x0031;
            case 101: goto L_0x0031;
            default: goto L_0x0015;
        };
    L_0x0015:
        r0 = r1;
    L_0x0016:
        if (r3 != 0) goto L_0x0033;
    L_0x0018:
        r4 = r4 + 1;
        goto L_0x0008;
    L_0x001b:
        r0 = r1;
        r3 = r5;
        goto L_0x0016;
    L_0x001e:
        if (r4 == r8) goto L_0x0015;
    L_0x0020:
        if (r0 != 0) goto L_0x0015;
    L_0x0022:
        r9.b = r5;
        r0 = r1;
        r3 = r5;
        goto L_0x0016;
    L_0x0027:
        if (r2 != 0) goto L_0x002c;
    L_0x0029:
        r0 = r1;
        r2 = r5;
        goto L_0x0016;
    L_0x002c:
        r9.b = r5;
        r0 = r1;
        r3 = r5;
        goto L_0x0016;
    L_0x0031:
        r0 = r5;
        goto L_0x0016;
    L_0x0033:
        r9.a = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.a(java.lang.String, int, bk):void");
    }

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !a(xmlPullParser, str) ? z : typedArray.getBoolean(5, z);
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (a(xmlPullParser, str)) {
            return typedArray.getInt(i, -1);
        }
        return -1;
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static void a(Fragment fragment, String[] strArr, int i) {
        fragment.requestPermissions(strArr, i);
    }

    public static void a(Fragment fragment, boolean z) {
        fragment.setUserVisibleHint(z);
    }

    public static void b(Fragment fragment, boolean z) {
        fragment.setMenuVisibility(z);
    }

    public static void a(Activity activity, String[] strArr, int i) {
        if (activity instanceof cl) {
            ((cl) activity).b_(i);
        }
        activity.requestPermissions(strArr, i);
    }

    public static void a(Activity activity) {
        activity.invalidateOptionsMenu();
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void b(Activity activity) {
        activity.finishAffinity();
    }

    public static String c(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static int a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    public static String d(View view) {
        return view.getTransitionName();
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return obj;
    }

    public static Object a(Object obj, View view, ArrayList arrayList, Map map, View view2) {
        if (obj == null) {
            return obj;
        }
        a(arrayList, view);
        if (map != null) {
            arrayList.removeAll(map.values());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.add(view2);
        b((Transition) obj, arrayList);
        return obj;
    }

    public static void a(Object obj, View view, boolean z) {
        ((Transition) obj).excludeTarget(view, z);
    }

    public static void a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public static void a(Object obj, View view) {
        ((Transition) obj).setEpicenterCallback(new dz(e(view)));
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        Transition transition = (Transition) obj;
        if (transition == null) {
            return null;
        }
        Object transitionSet = new TransitionSet();
        transitionSet.addTransition(transition);
        return transitionSet;
    }

    public static void a(Transition transition, Transition transition2, ArrayList arrayList, boolean z) {
        if (transition != null) {
            int size = transition2 == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                transition.excludeTarget((View) arrayList.get(i), z);
            }
        }
    }

    public static void a(Object obj, Object obj2, Object obj3, ArrayList arrayList, boolean z) {
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        a((Transition) obj, transition2, arrayList, z);
        a(transition, transition2, arrayList, z);
    }

    public static void a(Object obj, Object obj2, Object obj3, View view, ee eeVar, View view2, ed edVar, Map map, ArrayList arrayList, ArrayList arrayList2, Map map2, Map map3, ArrayList arrayList3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj3;
        Transition transition3 = (Transition) obj2;
        a(transition, transition2, arrayList2, true);
        if (obj != null || obj2 != null) {
            if (transition != null) {
                transition.addTarget(view2);
            }
            if (obj2 != null) {
                a((Object) transition3, view2, map2, arrayList3);
                a(transition, transition3, arrayList3, true);
                a(transition2, transition3, arrayList3, true);
            }
            view.getViewTreeObserver().addOnPreDrawListener(new ea(view, transition, view2, eeVar, map, map3, arrayList, transition2));
            a(transition, edVar);
        }
    }

    public static Object a(Object obj, Object obj2, Object obj3, boolean z) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition == null || transition2 == null) {
            z = true;
        }
        Object transitionSet;
        if (z) {
            transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            if (transition2 != null) {
                transitionSet.addTransition(transition2);
            }
            if (transition3 == null) {
                return transitionSet;
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        Transition transition4 = null;
        if (transition2 != null && transition != null) {
            transition4 = new TransitionSet().addTransition(transition2).addTransition(transition).setOrdering(1);
        } else if (transition2 != null) {
            transition4 = transition2;
        } else if (transition != null) {
            transition4 = transition;
        }
        if (transition3 == null) {
            return transition4;
        }
        transitionSet = new TransitionSet();
        if (transition4 != null) {
            transitionSet.addTransition(transition4);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public static void a(Object obj, View view, Map map, ArrayList arrayList) {
        obj = (TransitionSet) obj;
        arrayList.clear();
        arrayList.addAll(map.values());
        List targets = obj.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a(targets, (View) arrayList.get(i));
        }
        arrayList.add(view);
        b(obj, arrayList);
    }

    public static void a(List list, View view) {
        int size = list.size();
        if (!a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean a(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static void a(Transition transition, ed edVar) {
        if (transition != null) {
            transition.setEpicenterCallback(new eb(edVar));
        }
    }

    public static Rect e(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    public static void a(ArrayList arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    public static void a(Map map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static void a(View view, View view2, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3, Object obj4, ArrayList arrayList4, Map map) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        Transition transition4 = (Transition) obj4;
        if (transition4 != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ec(view, transition, arrayList, transition2, arrayList2, transition3, arrayList3, map, arrayList4, transition4, view2));
        }
    }

    public static void a(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        int transitionCount;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                a(transitionSet.getTransitionAt(i), arrayList);
            }
        } else if (!a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                for (transitionCount = arrayList.size() - 1; transitionCount >= 0; transitionCount--) {
                    transition.removeTarget((View) arrayList.get(transitionCount));
                }
            }
        }
    }

    public static void b(Object obj, ArrayList arrayList) {
        int i = 0;
        Transition transition = (Transition) obj;
        int transitionCount;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (!a(transition) && a(transition.getTargets())) {
            int size = arrayList.size();
            for (transitionCount = 0; transitionCount < size; transitionCount++) {
                transition.addTarget((View) arrayList.get(transitionCount));
            }
        }
    }

    public static boolean a(Transition transition) {
        return (a(transition.getTargetIds()) && a(transition.getTargetNames()) && a(transition.getTargetTypes())) ? false : true;
    }

    public static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    public static Intent c(Activity activity) {
        return activity.getParentActivityIntent();
    }

    public static boolean a(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static void b(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static String a(ActivityInfo activityInfo) {
        return activityInfo.parentActivityName;
    }

    public static void a(Builder builder, fk fkVar) {
        Bundle bundle;
        Action.Builder builder2 = new Action.Builder(fkVar.a(), fkVar.b(), fkVar.c());
        if (fkVar.f() != null) {
            for (RemoteInput addRemoteInput : a(fkVar.f())) {
                builder2.addRemoteInput(addRemoteInput);
            }
        }
        if (fkVar.d() != null) {
            bundle = new Bundle(fkVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", fkVar.e());
        builder2.addExtras(fkVar.d());
        builder.addAction(builder2.build());
    }

    public static void a(en enVar, CharSequence charSequence, CharSequence charSequence2, List list, List list2, List list3, List list4, List list5) {
        MessagingStyle conversationTitle = new MessagingStyle(charSequence).setConversationTitle(charSequence2);
        for (int i = 0; i < list.size(); i++) {
            Message message = new Message((CharSequence) list.get(i), ((Long) list2.get(i)).longValue(), (CharSequence) list3.get(i));
            if (list4.get(i) != null) {
                message.setData((String) list4.get(i), (Uri) list5.get(i));
            }
            conversationTitle.addMessage(message);
        }
        conversationTitle.setBuilder(enVar.a());
    }

    public static Notification a(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        notification.setLatestEventInfo(context, charSequence, charSequence2, pendingIntent);
        return notification;
    }

    public static Notification a(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        notification.setLatestEventInfo(context, charSequence, charSequence2, pendingIntent);
        notification.fullScreenIntent = pendingIntent2;
        return notification;
    }

    public static Notification a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap) {
        boolean z;
        boolean z2 = true;
        Builder ongoing = new Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0);
        if ((notification.flags & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        ongoing = ongoing.setOnlyAlertOnce(z);
        if ((notification.flags & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        Builder deleteIntent = ongoing.setAutoCancel(z).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z2 = false;
        }
        return deleteIntent.setFullScreenIntent(pendingIntent2, z2).setLargeIcon(bitmap).setNumber(i).getNotification();
    }

    public static RemoteInput[] a(fv[] fvVarArr) {
        if (fvVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[fvVarArr.length];
        for (int i = 0; i < fvVarArr.length; i++) {
            fv fvVar = fvVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(fvVar.a()).setLabel(fvVar.b()).setChoices(fvVar.c()).setAllowFreeFormInput(fvVar.d()).addExtras(fvVar.e()).build();
        }
        return remoteInputArr;
    }

    public static Bundle a(fv fvVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", fvVar.a());
        bundle.putCharSequence("label", fvVar.b());
        bundle.putCharSequenceArray("choices", fvVar.c());
        bundle.putBoolean("allowFreeFormInput", fvVar.d());
        bundle.putBundle("extras", fvVar.e());
        return bundle;
    }

    public static Bundle[] b(fv[] fvVarArr) {
        if (fvVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[fvVarArr.length];
        for (int i = 0; i < fvVarArr.length; i++) {
            bundleArr[i] = a(fvVarArr[i]);
        }
        return bundleArr;
    }

    public static Drawable a(Context context, int i) {
        return context.getDrawable(i);
    }

    public static ColorStateList b(Context context, int i) {
        return context.getColorStateList(i);
    }

    public static int c(Context context, int i) {
        return context.getColor(i);
    }

    public static void a(Context context, Intent[] intentArr) {
        context.startActivities(intentArr);
    }

    public static void a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    public static Intent a(ComponentName componentName) {
        return Intent.makeMainActivity(componentName);
    }

    public static int a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = cm.a.a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return cm.a.a(context, a, str2) != 0 ? -2 : 0;
    }

    public static int a(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int a(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
    }

    public static int b(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static int c(Resources resources) {
        return Math.min(b(resources), a(resources));
    }

    public static Drawable a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            return cob.a(resources, i, theme);
        }
        return resources.getDrawable(i);
    }

    public static boolean a(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    public static int a(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static void b(Drawable drawable, int i) {
        if (drawable instanceof ho) {
            ((ho) drawable).setTint(i);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof ho) {
            ((ho) drawable).setTintList(colorStateList);
        }
    }

    public static void a(Drawable drawable, Mode mode) {
        if (drawable instanceof ho) {
            ((ho) drawable).setTintMode(mode);
        }
    }

    public static Drawable b(Drawable drawable) {
        if (drawable instanceof ho) {
            return drawable;
        }
        return new ha(drawable);
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        drawable.inflate(resources, xmlPullParser, attributeSet);
    }

    public static hl a(Resources resources, Bitmap bitmap) {
        if (VERSION.SDK_INT >= 21) {
            return new hm(resources, bitmap);
        }
        return new hn(resources, bitmap);
    }

    public static AsyncTask a(AsyncTask asyncTask, Object... objArr) {
        if (VERSION.SDK_INT >= 11) {
            b(asyncTask, objArr);
        } else {
            asyncTask.execute(objArr);
        }
        return asyncTask;
    }

    public static void b(AsyncTask asyncTask, Object... objArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
    }

    public static boolean c() {
        return VERSION.SDK_INT >= 24;
    }

    public static Creator a(ht htVar) {
        if (VERSION.SDK_INT >= 13) {
            return b(htVar);
        }
        return new hs(htVar);
    }

    public static Creator b(ht htVar) {
        return new hu(htVar);
    }

    public static void d(String str) {
        if (VERSION.SDK_INT >= 18) {
            cob.a(str);
        }
    }

    public static void d() {
        if (VERSION.SDK_INT >= 18) {
            cob.a();
        }
    }

    public static boolean a(Context context) {
        if (c()) {
            return cob.a(context);
        }
        return true;
    }

    public static void a(Object obj, StringBuilder stringBuilder) {
        if (obj == null) {
            stringBuilder.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        stringBuilder.append(simpleName);
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static Object e() {
        return new AccessibilityDelegate();
    }

    public static Object a(is isVar) {
        return new ir(isVar);
    }

    public static boolean a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return ((AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public static void b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((AccessibilityDelegate) obj).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public static void a(Object obj, View view, Object obj2) {
        ((AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo) obj2);
    }

    public static void c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((AccessibilityDelegate) obj).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public static boolean a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return ((AccessibilityDelegate) obj).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public static void a(Object obj, View view, int i) {
        ((AccessibilityDelegate) obj).sendAccessibilityEvent(view, i);
    }

    public static void d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((AccessibilityDelegate) obj).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public static Object a(iu iuVar) {
        return new it(iuVar);
    }

    public static Object b(Object obj, View view) {
        return ((AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }

    public static boolean a(Object obj, View view, int i, Bundle bundle) {
        return ((AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }

    public static int a(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    public static int c(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    public static boolean b(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    public static boolean d(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }

    public static boolean a(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static void a(LayoutInflater layoutInflater, jl jlVar) {
        layoutInflater.setFactory(jlVar != null ? new jj(jlVar) : null);
    }

    public static jl a(LayoutInflater layoutInflater) {
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof jj) {
            return ((jj) factory).a;
        }
        return null;
    }

    public static int a(MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static int b(MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
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

    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    public static boolean c(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    public static int a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    public static int b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    public static float c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public static float d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    public static int a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    public static int b(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    public static float e(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }

    public static ColorStateList g(View view) {
        return view instanceof ki ? ((ki) view).c() : null;
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (view instanceof ki) {
            ((ki) view).a(colorStateList);
        }
    }

    public static Mode h(View view) {
        return view instanceof ki ? ((ki) view).d() : null;
    }

    public static void a(View view, Mode mode) {
        if (view instanceof ki) {
            ((ki) view).a(mode);
        }
    }

    public static boolean i(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static int j(View view) {
        if (!l) {
            try {
                k = View.class.getDeclaredField("mMinWidth");
                k.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            l = true;
        }
        if (k != null) {
            try {
                return ((Integer) k.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    public static int k(View view) {
        if (!n) {
            try {
                m = View.class.getDeclaredField("mMinHeight");
                m.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            n = true;
        }
        if (m != null) {
            try {
                return ((Integer) m.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    public static boolean l(View view) {
        return view.getWindowToken() != null;
    }

    public static void a(View view, int i) {
        int top = view.getTop();
        view.offsetTopAndBottom(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(view.getLeft(), top - abs, view.getRight(), (top + view.getHeight()) + abs);
                return;
            }
            view.invalidate();
        }
    }

    public static void b(View view, int i) {
        int left = view.getLeft();
        view.offsetLeftAndRight(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(left - abs, view.getTop(), (left + view.getWidth()) + abs, view.getBottom());
                return;
            }
            view.invalidate();
        }
    }

    public static int m(View view) {
        return view.getOverScrollMode();
    }

    public static boolean c(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    public static boolean d(View view, int i) {
        return view.canScrollVertically(i);
    }

    public static void a(View view, Object obj) {
        view.setAccessibilityDelegate((AccessibilityDelegate) obj);
    }

    public static void a(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void b(View view, Object obj) {
        view.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo) obj);
    }

    public static void a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static boolean n(View view) {
        return view.hasOnClickListeners();
    }

    public static int o(View view) {
        return view.getLayoutDirection();
    }

    public static int p(View view) {
        return view.getPaddingStart();
    }

    public static int q(View view) {
        return view.getPaddingEnd();
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static int r(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean s(View view) {
        return view.isPaddingRelative();
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static boolean a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i) {
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (Throwable e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStartNestedScroll", e);
            return false;
        }
    }

    public static void b(ViewParent viewParent, View view, View view2, int i) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i);
        } catch (Throwable e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScrollAccepted", e);
        }
    }

    public static void a(ViewParent viewParent, View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (Throwable e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStopNestedScroll", e);
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        try {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        } catch (Throwable e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScroll", e);
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        } catch (Throwable e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreScroll", e);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (Throwable e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedFling", e);
            return false;
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (Throwable e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreFling", e);
            return false;
        }
    }

    public static void a(View view, long j) {
        view.animate().setDuration(j);
    }

    public static void b(View view, float f) {
        view.animate().alpha(f);
    }

    public static void c(View view, float f) {
        view.animate().translationX(f);
    }

    public static void d(View view, float f) {
        view.animate().translationY(f);
    }

    public static long t(View view) {
        return view.animate().getDuration();
    }

    public static void a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }

    public static void b(View view, long j) {
        view.animate().setStartDelay(j);
    }

    public static void u(View view) {
        view.animate().cancel();
    }

    public static void v(View view) {
        view.animate().start();
    }

    public static void a(View view, mg mgVar) {
        view.animate().setListener(new md(mgVar, view));
    }

    public static void a(View view, mi miVar) {
        AnimatorUpdateListener animatorUpdateListener = null;
        if (miVar != null) {
            animatorUpdateListener = new mf(miVar, view);
        }
        view.animate().setUpdateListener(animatorUpdateListener);
    }

    public static void a(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    public static Object a(int i, int i2, boolean z, int i3) {
        return CollectionInfo.obtain(i, i2, z, i3);
    }

    public static Object a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return CollectionItemInfo.obtain(i, i2, i3, i4, z, z2);
    }

    public static Object f() {
        return AccessibilityNodeInfo.obtain();
    }

    public static Object w(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public static Object c(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    public static void a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    public static int d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    public static void a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    public static void b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    public static int e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getChildCount();
    }

    public static CharSequence f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    public static CharSequence g(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    public static CharSequence h(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    public static CharSequence i(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    public static boolean j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    public static boolean k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    public static boolean l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    public static boolean m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    public static boolean n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    public static boolean o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    public static boolean p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    public static boolean q(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    public static boolean r(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    public static boolean s(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    public static void c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    public static void d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    public static void a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    public static void a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    public static void b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    public static void b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    public static void c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    public static void d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    public static void c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    public static void c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    public static void e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    public static void b(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).addChild(view, i);
    }

    public static void c(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).setSource(view, i);
    }

    public static void f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    public static void g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }

    public static String t(Object obj) {
        return ((AccessibilityNodeInfo) obj).getViewIdResourceName();
    }

    public static void a(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionInfo((CollectionInfo) obj2);
    }

    public static void b(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionItemInfo((CollectionItemInfo) obj2);
    }

    public static Object a(int i, int i2, boolean z) {
        return CollectionInfo.obtain(i, i2, z);
    }

    public static Object a(int i, int i2, int i3, int i4, boolean z) {
        return CollectionItemInfo.obtain(i, i2, i3, i4, z);
    }

    public static Object a(ng ngVar) {
        return new nf(ngVar);
    }

    public static Object a(ni niVar) {
        return new nh(niVar);
    }

    public static void b(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollX(i);
    }

    public static void c(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollY(i);
    }

    public static Drawable a(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    public static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void a(CompoundButton compoundButton, Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }

    public static Object b(Context context) {
        return new EdgeEffect(context);
    }

    public static void a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    public static boolean u(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    public static void v(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    public static boolean a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    public static boolean w(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }

    public static boolean d(Object obj, int i) {
        ((EdgeEffect) obj).onAbsorb(i);
        return true;
    }

    public static boolean a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }

    public static boolean a(Object obj, float f, float f2) {
        ((EdgeEffect) obj).onPull(f, f2);
        return true;
    }

    public static Object a(Object obj, oj ojVar, oi oiVar, Object obj2, int i, boolean z, boolean z2) {
        int a = ojVar.a(obj);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(ojVar.a(obj, i2));
        }
        Collections.sort(arrayList, new ok(z, oiVar));
        switch (i) {
            case rq.b /*1*/:
                return b(obj2, arrayList, false);
            case rq.c /*2*/:
                return a(obj2, arrayList, false);
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
    }

    public static Object a(Object obj, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static Object b(Object obj, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    public static Object a(Object obj, oj ojVar, oi oiVar, Object obj2, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        switch (i) {
            case rk.bZ /*17*/:
                rect2.offset(rect.width() + 1, 0);
                break;
            case 33:
                rect2.offset(0, rect.height() + 1);
                break;
            case 66:
                rect2.offset(-(rect.width() + 1), 0);
                break;
            case 130:
                rect2.offset(0, -(rect.height() + 1));
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        Object obj3 = null;
        int a = ojVar.a(obj);
        Rect rect3 = new Rect();
        int i2 = 0;
        while (i2 < a) {
            Object a2 = ojVar.a(obj, i2);
            if (a2 != obj2) {
                oiVar.a(a2, rect3);
                if (a(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    i2++;
                    obj3 = a2;
                }
            }
            a2 = obj3;
            i2++;
            obj3 = a2;
        }
        return obj3;
    }

    public static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!a(rect, rect2, i)) {
            return false;
        }
        if (!a(rect, rect3, i)) {
            return true;
        }
        if (b(i, rect, rect2, rect3)) {
            return true;
        }
        if (b(i, rect, rect3, rect2) || c(c(i, rect, rect2), g(i, rect, rect2)) >= c(c(i, rect, rect3), g(i, rect, rect3))) {
            return false;
        }
        return true;
    }

    public static boolean b(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean a = a(i, rect, rect2);
        if (a(i, rect, rect3) || !a) {
            return false;
        }
        if (!b(i, rect, rect3) || i == 17 || i == 66 || c(i, rect, rect2) < e(i, rect, rect3)) {
            return true;
        }
        return false;
    }

    public static int c(int i, int i2) {
        return ((i * 13) * i) + (i2 * i2);
    }

    public static boolean a(Rect rect, Rect rect2, int i) {
        switch (i) {
            case rk.bZ /*17*/:
                if ((rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left) {
                    return true;
                }
                return false;
            case 33:
                if ((rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top) {
                    return true;
                }
                return false;
            case 66:
                if ((rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            case 130:
                return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean a(int i, Rect rect, Rect rect2) {
        switch (i) {
            case rk.bZ /*17*/:
            case 66:
                if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
                    return false;
                }
                return true;
            case 33:
            case 130:
                return rect2.right >= rect.left && rect2.left <= rect.right;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean b(int i, Rect rect, Rect rect2) {
        switch (i) {
            case rk.bZ /*17*/:
                if (rect.left >= rect2.right) {
                    return true;
                }
                return false;
            case 33:
                if (rect.top < rect2.bottom) {
                    return false;
                }
                return true;
            case 66:
                if (rect.right > rect2.left) {
                    return false;
                }
                return true;
            case 130:
                return rect.bottom <= rect2.top;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int c(int i, Rect rect, Rect rect2) {
        return Math.max(0, d(i, rect, rect2));
    }

    public static int d(int i, Rect rect, Rect rect2) {
        switch (i) {
            case rk.bZ /*17*/:
                return rect.left - rect2.right;
            case 33:
                return rect.top - rect2.bottom;
            case 66:
                return rect2.left - rect.right;
            case 130:
                return rect2.top - rect.bottom;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int e(int i, Rect rect, Rect rect2) {
        return Math.max(1, f(i, rect, rect2));
    }

    public static int f(int i, Rect rect, Rect rect2) {
        switch (i) {
            case rk.bZ /*17*/:
                return rect.left - rect2.left;
            case 33:
                return rect.top - rect2.top;
            case 66:
                return rect2.right - rect.right;
            case 130:
                return rect2.bottom - rect.bottom;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int g(int i, Rect rect, Rect rect2) {
        switch (i) {
            case rk.bZ /*17*/:
            case 66:
                return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
            case 33:
            case 130:
                return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static void a(ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            aq.a(listView, i);
        } else {
            cob.a(listView, i);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void a(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }

    public static float x(Object obj) {
        return ((OverScroller) obj).getCurrVelocity();
    }

    public static void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Drawable drawable5;
        Object obj = textView.getLayoutDirection() == 1 ? 1 : null;
        if (obj != null) {
            drawable5 = drawable3;
        } else {
            drawable5 = drawable;
        }
        if (obj == null) {
            drawable = drawable3;
        }
        textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        Object obj;
        int depth = xmlPullParser.getDepth() + 1;
        Object obj2 = new int[20][];
        int i = 0;
        Object obj3 = new int[20];
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                int i2;
                TypedArray a = a(resources, theme, attributeSet, rk.ak);
                int color = a.getColor(rk.an, -65281);
                float f = 1.0f;
                if (a.hasValue(rk.am)) {
                    f = a.getFloat(rk.am, 1.0f);
                } else if (a.hasValue(rk.al)) {
                    f = a.getFloat(rk.al, 1.0f);
                }
                a.recycle();
                int i3 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i4 = 0;
                while (i4 < attributeCount) {
                    depth2 = attributeSet.getAttributeNameResource(i4);
                    if (depth2 == 16843173 || depth2 == 16843551 || depth2 == D) {
                        depth2 = i3;
                    } else {
                        i2 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            depth2 = -depth2;
                        }
                        iArr[i3] = depth2;
                        depth2 = i2;
                    }
                    i4++;
                    i3 = depth2;
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr, i3);
                i2 = a(color, f);
                if (i + 1 > obj3.length) {
                    obj = new int[ro.a(i)];
                    System.arraycopy(obj3, 0, obj, 0, i);
                } else {
                    obj = obj3;
                }
                obj[i] = i2;
                if (i + 1 > obj2.length) {
                    obj3 = (Object[]) Array.newInstance(obj2.getClass().getComponentType(), ro.a(i));
                    System.arraycopy(obj2, 0, obj3, 0, i);
                } else {
                    obj3 = obj2;
                }
                obj3[i] = trimStateSet;
                i++;
                obj2 = (int[][]) obj3;
                obj3 = obj;
            }
        }
        obj = new int[i];
        Object obj4 = new int[i][];
        System.arraycopy(obj3, 0, obj, 0, i);
        System.arraycopy(obj2, 0, obj4, 0, i);
        return new ColorStateList(obj4, obj);
    }

    public static TypedArray a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static int a(int i, float f) {
        return gq.b(i, Math.round(((float) Color.alpha(i)) * f));
    }

    public static Menu a(Context context, hp hpVar) {
        if (VERSION.SDK_INT >= 14) {
            return new tn(context, hpVar);
        }
        throw new UnsupportedOperationException();
    }

    public static MenuItem a(Context context, hq hqVar) {
        if (VERSION.SDK_INT >= 16) {
            return new te(context, hqVar);
        }
        if (VERSION.SDK_INT >= 14) {
            return new sz(context, hqVar);
        }
        throw new UnsupportedOperationException();
    }

    public static SubMenu a(Context context, hr hrVar) {
        if (VERSION.SDK_INT >= 14) {
            return new ts(context, hrVar);
        }
        throw new UnsupportedOperationException();
    }

    public static int a(zi ziVar, ym ymVar, View view, View view2, yz yzVar, boolean z, boolean z2) {
        if (yzVar.h() == 0 || ziVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max;
        int min = Math.min(yz.a(view), yz.a(view2));
        int max2 = Math.max(yz.a(view), yz.a(view2));
        if (z2) {
            max = Math.max(0, (ziVar.a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(ymVar.b(view2) - ymVar.a(view))) / ((float) (Math.abs(yz.a(view) - yz.a(view2)) + 1)))) + ((float) (ymVar.b() - ymVar.a(view))));
    }

    public static int a(zi ziVar, ym ymVar, View view, View view2, yz yzVar, boolean z) {
        if (yzVar.h() == 0 || ziVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(yz.a(view) - yz.a(view2)) + 1;
        }
        return Math.min(ymVar.e(), ymVar.b(view2) - ymVar.a(view));
    }

    public static int b(zi ziVar, ym ymVar, View view, View view2, yz yzVar, boolean z) {
        if (yzVar.h() == 0 || ziVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return ziVar.a();
        }
        return (int) ((((float) (ymVar.b(view2) - ymVar.a(view))) / ((float) (Math.abs(yz.a(view) - yz.a(view2)) + 1))) * ((float) ziVar.a()));
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static abs c(Context context) {
        Objects.requireNonNull(context);
        if (cn != null) {
            return cn;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof abt) {
            cn = ((abt) applicationContext).a();
        }
        if (cn == null) {
            cn = new abu();
        }
        return cn;
    }

    public static Intent a(String str, PhoneAccountHandle phoneAccountHandle, String str2) {
        Intent a = a(e(str));
        a.putExtra("android.telecom.extra.CALL_SUBJECT", str2);
        if (phoneAccountHandle != null) {
            a.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
        }
        return a;
    }

    public static Intent a(Uri uri) {
        return new Intent("android.intent.action.CALL", uri);
    }

    public static Uri e(String str) {
        if (awy.a(str)) {
            return Uri.fromParts("sip", str, null);
        }
        return Uri.fromParts("tel", str, null);
    }

    public static Uri g() {
        return Uri.fromParts("voicemail", "", null);
    }

    public static int d(Context context) {
        if (!c(context, "android.permission.READ_PHONE_STATE") || !abw.c()) {
            return 0;
        }
        TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
        if (telecomManager == null) {
            return 0;
        }
        for (PhoneAccountHandle phoneAccount : telecomManager.getCallCapablePhoneAccounts()) {
            PhoneAccount phoneAccount2 = telecomManager.getPhoneAccount(phoneAccount);
            if (phoneAccount2 != null && phoneAccount2.hasCapabilities(8)) {
                if (!abw.d()) {
                    return 1;
                }
                int i;
                if (phoneAccount2.hasCapabilities(256)) {
                    i = 3;
                } else {
                    i = 1;
                }
                return i;
            }
        }
        return 0;
    }

    public static boolean e(Context context) {
        return (d(context) & 1) != 0;
    }

    public static boolean f(Context context) {
        if (!c(context, "android.permission.READ_PHONE_STATE") || !abw.e()) {
            return false;
        }
        TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
        if (telecomManager == null) {
            return false;
        }
        for (PhoneAccountHandle phoneAccount : telecomManager.getCallCapablePhoneAccounts()) {
            PhoneAccount phoneAccount2 = telecomManager.getPhoneAccount(phoneAccount);
            if (phoneAccount2 != null && phoneAccount2.hasCapabilities(64)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (!TextUtils.isEmpty(charSequence2)) {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", charSequence2));
            Toast.makeText(context, context.getString(gN), 0).show();
        }
    }

    public static void a(List list, Context context) {
        int size = list.size();
        if (size <= 20) {
            for (int i = 0; i < size; i++) {
                aay aay = (aay) list.get(i);
                if (aay != null) {
                    for (int i2 = i + 1; i2 < size; i2++) {
                        aay aay2 = (aay) list.get(i2);
                        if (aay2 != null) {
                            if (aay.a(aay2, context)) {
                                aay.a(aay2);
                                list.set(i2, null);
                            } else if (aay2.a(aay, context)) {
                                aay2.a(aay);
                                list.set(i, null);
                                break;
                            }
                        }
                    }
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    it.remove();
                }
            }
        }
    }

    public static Drawable d(Context context, int i) {
        switch (i) {
            case rq.b /*1*/:
            case rq.c /*2*/:
            case rl.e /*3*/:
            case rl.f /*4*/:
            case rl.g /*5*/:
                return context.getResources().getDrawable(StatusUpdates.getPresenceIconResourceId(i));
            default:
                return null;
        }
    }

    public static String e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case rq.c /*2*/:
            case rl.e /*3*/:
                return resources.getString(gL);
            case rl.f /*4*/:
                return resources.getString(gM);
            case rl.g /*5*/:
                return resources.getString(gK);
            default:
                return null;
        }
    }

    public static String g(Context context) {
        CharSequence networkCountryIso;
        Object obj = 1;
        String str = null;
        CountryDetector a = CountryDetector.a(context);
        if (a.a.getPhoneType() != 1) {
            obj = null;
        }
        if (obj != null) {
            networkCountryIso = a.a.getNetworkCountryIso();
        } else {
            networkCountryIso = null;
        }
        if (TextUtils.isEmpty(networkCountryIso)) {
            if (Geocoder.isPresent() && j(a.b)) {
                networkCountryIso = PreferenceManager.getDefaultSharedPreferences(a.b).getString("preference_current_country", null);
            } else {
                networkCountryIso = null;
            }
        }
        if (TextUtils.isEmpty(networkCountryIso)) {
            networkCountryIso = a.a.getSimCountryIso();
        }
        if (TextUtils.isEmpty(networkCountryIso)) {
            Locale locale = Locale.getDefault();
            if (locale != null) {
                str = locale.getCountry();
            }
        } else {
            CharSequence charSequence = networkCountryIso;
        }
        if (TextUtils.isEmpty(str)) {
            str = "US";
        }
        return str.toUpperCase(Locale.US);
    }

    public static String b(Context context, String str) {
        try {
            return ddt.a().a(ddk.a().a(str, g(context)), context.getResources().getConfiguration().locale);
        } catch (ddi e) {
            return null;
        }
    }

    public static void a(Call call) {
        if (c()) {
            try {
                Call.class.getDeclaredMethod("pullExternalCall", new Class[0]).invoke(call, new Object[0]);
            } catch (NoSuchMethodException e) {
            } catch (InvocationTargetException e2) {
            } catch (IllegalAccessException e3) {
            }
        }
    }

    public static Uri h() {
        if (c()) {
            return Directory.ENTERPRISE_CONTENT_URI;
        }
        return Directory.CONTENT_URI;
    }

    public static boolean a(long j) {
        if (c()) {
            if (j == 1 || j == 1000000001) {
                return true;
            }
            return false;
        } else if (j == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean b(long j) {
        if (c()) {
            return Directory.isRemoteDirectoryId(j);
        }
        return (j == 0 || j == 1) ? false : true;
    }

    public static boolean c(long j) {
        return c() ? Directory.isEnterpriseDirectoryId(j) : false;
    }

    public static PhoneNumberFormattingTextWatcher f(String str) {
        if (abw.h()) {
            return new PhoneNumberFormattingTextWatcher(str);
        }
        return new PhoneNumberFormattingTextWatcher();
    }

    public static String a(String str, String str2, String str3) {
        if (abw.h()) {
            return PhoneNumberUtils.formatNumber(str, str2, str3);
        }
        return PhoneNumberUtils.formatNumber(str);
    }

    public static CharSequence a(CharSequence charSequence) {
        if (abw.g()) {
            return PhoneNumberUtils.createTtsSpannable(charSequence);
        }
        return b(charSequence);
    }

    public static TtsSpan g(String str) {
        if (abw.g()) {
            return PhoneNumberUtils.createTtsSpan(str);
        }
        if (abw.h()) {
            return h(str);
        }
        return null;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
        a(newSpannable, 0, newSpannable.length());
        return newSpannable;
    }

    public static void a(Spannable spannable, int i, int i2) {
        spannable.setSpan(g(spannable.subSequence(0, i2).toString()), 0, i2, 33);
    }

    public static TtsSpan h(String str) {
        ddo ddo = null;
        if (str == null) {
            return ddo;
        }
        try {
            ddo = ddk.a().a(str, null);
        } catch (ddi e) {
        }
        TelephoneBuilder telephoneBuilder = new TelephoneBuilder();
        if (ddo == null) {
            telephoneBuilder.setNumberParts(c((CharSequence) str));
        } else {
            if (ddo.a) {
                telephoneBuilder.setCountryCode(Integer.toString(ddo.b));
            }
            telephoneBuilder.setNumberParts(Long.toString(ddo.c));
        }
        return telephoneBuilder.build();
    }

    public static String c(CharSequence charSequence) {
        StringBuilder stringBuilder = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            Object valueOf;
            if (PhoneNumberUtils.isISODigit(charSequence.charAt(i))) {
                valueOf = Character.valueOf(charSequence.charAt(i));
            } else {
                valueOf = " ";
            }
            stringBuilder.append(valueOf);
        }
        return stringBuilder.toString().replaceAll(" +", " ").trim();
    }

    public static int i() {
        return VERSION.SDK_INT;
    }

    public static int a(TelephonyManager telephonyManager) {
        if (telephonyManager == null) {
            return 1;
        }
        if (abw.g() || abw.a("android.telephony.TelephonyManager", "getPhoneCount", new Class[0])) {
            return telephonyManager.getPhoneCount();
        }
        return 1;
    }

    public static boolean b(TelephonyManager telephonyManager) {
        if (telephonyManager == null) {
            return false;
        }
        if (abw.g() || abw.a("android.telephony.TelephonyManager", "isTtyModeSupported", new Class[0])) {
            return telephonyManager.isTtyModeSupported();
        }
        return false;
    }

    public static boolean c(TelephonyManager telephonyManager) {
        if (telephonyManager == null) {
            return false;
        }
        if (abw.g() || abw.a("android.telephony.TelephonyManager", "isHearingAidCompatibilitySupported", new Class[0])) {
            return telephonyManager.isHearingAidCompatibilitySupported();
        }
        return false;
    }

    public static Uri a(TelephonyManager telephonyManager, PhoneAccountHandle phoneAccountHandle) {
        if (c()) {
            return telephonyManager.getVoicemailRingtoneUri(phoneAccountHandle);
        }
        return null;
    }

    public static boolean b(TelephonyManager telephonyManager, PhoneAccountHandle phoneAccountHandle) {
        if (c()) {
            return telephonyManager.isVoicemailVibrationEnabled(phoneAccountHandle);
        }
        return true;
    }

    public static void a(Activity activity, TelecomManager telecomManager, Intent intent) {
        if (activity != null && telecomManager != null && intent != null) {
            if (abw.g()) {
                telecomManager.placeCall(intent.getData(), intent.getExtras());
            } else {
                activity.startActivityForResult(intent, 0);
            }
        }
    }

    public static List a(TelecomManager telecomManager) {
        if (telecomManager == null || (!abw.g() && !abw.a("android.telecom.TelecomManager", "getCallCapablePhoneAccounts", new Class[0]))) {
            return new ArrayList();
        }
        return telecomManager.getCallCapablePhoneAccounts();
    }

    public static String a(TelecomManager telecomManager, TelephonyManager telephonyManager, PhoneAccountHandle phoneAccountHandle) {
        if (telecomManager != null && abw.g()) {
            return telecomManager.getLine1Number(phoneAccountHandle);
        }
        if (telephonyManager != null) {
            return telephonyManager.getLine1Number();
        }
        return null;
    }

    public static PhoneAccount a(TelecomManager telecomManager, PhoneAccountHandle phoneAccountHandle) {
        if (telecomManager != null) {
            if (abw.a("android.telecom.TelecomManager", "getPhoneAccount", PhoneAccountHandle.class)) {
                return telecomManager.getPhoneAccount(phoneAccountHandle);
            }
        }
        return null;
    }

    public static PhoneAccountHandle b(TelecomManager telecomManager) {
        if (telecomManager == null || (!abw.g() && !abw.a("android.telecom.TelecomManager", "getSimCallManager", new Class[0]))) {
            return null;
        }
        return telecomManager.getSimCallManager();
    }

    public static int a(CharSequence charSequence, String str) {
        if (str == null || charSequence == null) {
            return -1;
        }
        int length = charSequence.length();
        int length2 = str.length();
        if (length2 == 0 || length < length2) {
            return -1;
        }
        int i = 0;
        while (i < length) {
            while (i < length && !Character.isLetterOrDigit(charSequence.charAt(i))) {
                i++;
            }
            if (i + length2 > length) {
                return -1;
            }
            int i2 = 0;
            while (i2 < length2 && Character.toUpperCase(charSequence.charAt(i + i2)) == str.charAt(i2)) {
                i2++;
            }
            if (i2 == length2) {
                return i;
            }
            while (i < length && Character.isLetterOrDigit(charSequence.charAt(i))) {
                i++;
            }
        }
        return -1;
    }

    public static int a(byte[] bArr) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return Math.min(options.outWidth, options.outHeight);
    }

    public static int d(int i, int i2) {
        int i3 = 1;
        if (i2 > 0 && i > 0) {
            while (((float) (i >> 1)) >= ((float) i2) * 0.8f) {
                i3 <<= 1;
                i >>= 1;
            }
        }
        return i3;
    }

    public static Bitmap a(byte[] bArr, int i) {
        Options options;
        if (i <= 1) {
            options = null;
        } else {
            options = new Options();
            options.inSampleSize = i;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static Drawable a(Resources resources, int i, float f) {
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.rotate(180.0f, (float) (decodeResource.getWidth() / 2), (float) (decodeResource.getHeight() / 2));
        canvas.drawBitmap(decodeResource, 0.0f, 0.0f, null);
        return new BitmapDrawable(resources, createBitmap);
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        Config config = bitmap.getConfig();
        if (config == null) {
            config = Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        canvas.drawARGB(0, 0, 0, 0);
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        canvas.drawOval(rectF, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float min = Math.min(((float) width) / ((float) i), ((float) height) / ((float) i2));
        int i3 = (int) ((((float) i) * min) / 2.0f);
        int i4 = (int) ((min * ((float) i2)) / 2.0f);
        canvas.drawBitmap(bitmap, new Rect((width / 2) - i3, (height / 2) - i4, (width / 2) + i3, (height / 2) + i4), rectF, paint);
        return createBitmap;
    }

    public static void a(ListView listView, int i, int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            double d = ((double) i2) / ((double) ((i2 << 1) + i3));
            listView.setPadding((int) ((((double) i) * d) * 1.1d), listView.getPaddingTop(), (int) ((d * ((double) i)) * 1.1d), listView.getPaddingBottom());
            listView.setClipToPadding(false);
            listView.setScrollBarStyle(33554432);
        }
    }

    public static void a(Resources resources, ListView listView, View view) {
        int integer = resources.getInteger(dk);
        int integer2 = resources.getInteger(dj);
        if (integer > 0 && integer2 > 0) {
            view.setBackgroundResource(0);
            View findViewById = view.findViewById(cob.O);
            if (findViewById == null) {
                throw new RuntimeException("Your content must have a list card view who can be turned visible whenever it is necessary.");
            }
            findViewById.setVisibility(0);
            a((View) listView, false, new ain(listView, view, integer, integer2));
        }
    }

    public static Uri a(ContentResolver contentResolver, Uri uri) {
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null");
        }
        String authority = uri.getAuthority();
        if ("com.android.contacts".equals(authority)) {
            authority = contentResolver.getType(uri);
            if ("vnd.android.cursor.item/contact".equals(authority)) {
                return uri;
            }
            if ("vnd.android.cursor.item/raw_contact".equals(authority)) {
                return RawContacts.getContactLookupUri(contentResolver, ContentUris.withAppendedId(RawContacts.CONTENT_URI, ContentUris.parseId(uri)));
            }
            throw new IllegalArgumentException("uri format is unknown");
        } else if ("contacts".equals(authority)) {
            return RawContacts.getContactLookupUri(contentResolver, ContentUris.withAppendedId(RawContacts.CONTENT_URI, ContentUris.parseId(uri)));
        } else {
            throw new IllegalArgumentException("uri authority is unknown");
        }
    }

    public static void a(Context context, Intent intent) {
        Intent c = c(context, intent);
        if (c != null) {
            context.startActivity(c);
        } else {
            context.startActivity(intent);
        }
    }

    public static void b(Context context, Intent intent) {
        Object obj = (Build.TYPE.equals("eng") || Build.TYPE.equals("userdebug")) ? 1 : null;
        if (obj == null || c(context, intent) == null) {
            context.startActivity(intent);
            return;
        }
        throw new AssertionError("startActivityOutsideApp() was called for an intent that can be handled inside the app");
    }

    public static Intent c(Context context, Intent intent) {
        try {
            Intent intent2 = new Intent(intent);
            intent2.setPackage(context.getPackageName());
            List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                return null;
            }
            if (!(((ResolveInfo) queryIntentActivities.get(0)).activityInfo == null || TextUtils.isEmpty(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.name))) {
                intent2.setClassName(context.getPackageName(), ((ResolveInfo) queryIntentActivities.get(0)).activityInfo.name);
            }
            return intent2;
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean h(Context context) {
        return c(context, "android.permission.CALL_PHONE");
    }

    public static boolean i(Context context) {
        return c(context, "android.permission.READ_CONTACTS");
    }

    public static boolean j(Context context) {
        return c(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    public static boolean c(Context context, String str) {
        return gd.a(context, str) == 0;
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver, String str) {
        gj.a(context).a(broadcastReceiver, new IntentFilter(str));
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        gj a = gj.a(context);
        synchronized (a.a) {
            ArrayList arrayList = (ArrayList) a.a.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) a.b.get(action);
                    if (arrayList2 != null) {
                        int i3 = 0;
                        while (i3 < arrayList2.size()) {
                            int i4;
                            if (((gm) arrayList2.get(i3)).b == broadcastReceiver) {
                                arrayList2.remove(i3);
                                i4 = i3 - 1;
                            } else {
                                i4 = i3;
                            }
                            i3 = i4 + 1;
                        }
                        if (arrayList2.size() <= 0) {
                            a.b.remove(action);
                        }
                    }
                }
            }
        }
    }

    public static void d(Context context, String str) {
        gj.a(context).a(new Intent(str));
    }

    public static void a(Context context, TextView textView) {
        a(context, textView, false);
    }

    public static void a(Context context, TextView textView, boolean z) {
        new ait(g(context), textView, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null);
    }

    public static void a(View view, boolean z, Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new aiu(view, runnable, false));
    }

    public static aiv a(String str, String str2) {
        aiv aiv = new aiv();
        int b = b(str, str2);
        if (b != -1) {
            int i = b - 1;
            while (i >= 0 && str.charAt(i) != '\n') {
                i--;
            }
            int i2 = b + 1;
            while (i2 < str.length() && str.charAt(i2) != '\n') {
                i2++;
            }
            aiv.b = str.substring(i + 1, i2);
            aiv.a = b - (i + 1);
        }
        return aiv;
    }

    public static int b(String str, String str2) {
        if (str.length() < str2.length()) {
            return -1;
        }
        int[] iArr = new int[str2.length()];
        int i = 0;
        int i2 = 0;
        while (i < str2.length()) {
            int codePointAt = Character.codePointAt(str2, i);
            iArr[i2] = codePointAt;
            i2++;
            i += Character.charCount(codePointAt);
        }
        i = 0;
        while (i < str.length()) {
            codePointAt = i;
            int i3 = 0;
            while (codePointAt < str.length() && i3 < i2) {
                int toLowerCase = Character.toLowerCase(str.codePointAt(codePointAt));
                if (toLowerCase != iArr[i3]) {
                    break;
                }
                codePointAt += Character.charCount(toLowerCase);
                i3++;
            }
            if (i3 == i2) {
                return i;
            }
            i = b(str, i);
        }
        return -1;
    }

    public static int b(String str, int i) {
        int codePointAt;
        while (i <= str.length()) {
            if (i != str.length()) {
                codePointAt = str.codePointAt(i);
                if (!Character.isLetterOrDigit(codePointAt)) {
                    break;
                }
                i += Character.charCount(codePointAt);
            } else {
                break;
            }
        }
        while (i <= str.length()) {
            if (i != str.length()) {
                codePointAt = str.codePointAt(i);
                if (Character.isLetterOrDigit(codePointAt)) {
                    break;
                }
                i += Character.charCount(codePointAt);
            } else {
                break;
            }
        }
        return i;
    }

    public static String i(String str) {
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (Character.isLetterOrDigit(codePointAt)) {
                break;
            }
            i += Character.charCount(codePointAt);
        }
        if (i == str.length()) {
            return "";
        }
        codePointAt = str.length() - 1;
        while (codePointAt >= 0) {
            if (Character.isLowSurrogate(str.charAt(codePointAt))) {
                codePointAt--;
            }
            if (Character.isLetterOrDigit(str.codePointAt(codePointAt))) {
                break;
            }
            codePointAt--;
        }
        return str.substring(i, codePointAt + 1);
    }

    public static String k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getVoiceMailAlphaTag();
    }

    public static boolean a(Uri uri, Uri uri2) {
        if (uri == null && uri2 == null) {
            return true;
        }
        if (uri == null || uri2 == null) {
            return false;
        }
        return uri.equals(uri2);
    }

    public static Uri j(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static String b(Uri uri) {
        return uri == null ? null : uri.toString();
    }

    public static boolean c(Uri uri) {
        if (uri == null) {
            return false;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            return lastPathSegment.equals("encoded");
        }
        return false;
    }

    public static Uri d(Uri uri) {
        if (uri == null) {
            return null;
        }
        return !"com.android.contacts".equals(uri.getAuthority()) ? null : uri;
    }

    public static String e(Uri uri) {
        if (uri == null || c(uri)) {
            return null;
        }
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 3) {
            return null;
        }
        return Uri.encode((String) pathSegments.get(2));
    }

    public static alg l(Context context) {
        Objects.requireNonNull(context);
        if (gZ != null) {
            return gZ;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof alh) {
            gZ = ((alh) applicationContext).b();
        }
        if (gZ == null) {
            gZ = new ali();
        }
        return gZ;
    }

    public static apr m(Context context) {
        Objects.requireNonNull(context);
        if (ha != null) {
            return ha;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof aps) {
            ha = ((aps) applicationContext).c();
        }
        if (ha == null) {
            ha = new apt();
        }
        return ha;
    }

    public static boolean a(Context context, String str, EditText editText) {
        String stripSeparators = PhoneNumberUtils.stripSeparators(str);
        if (g(context, stripSeparators) || h(context, stripSeparators) || f(context, stripSeparators) || b(context, stripSeparators, editText) || e(context, stripSeparators)) {
            return true;
        }
        return false;
    }

    public static void j() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Log.wtf("SpecialCharSequenceMgr", "cleanup() is called outside the main thread");
        } else if (hX != null) {
            hX.a();
            hX = null;
        }
    }

    public static boolean e(Context context, String str) {
        int length = str.length();
        if (length <= 8 || !str.startsWith("*#*#") || !str.endsWith("#*#*")) {
            return false;
        }
        String str2 = "android.provider.Telephony.SECRET_CODE";
        String str3 = "android_secret_code://";
        String valueOf = String.valueOf(str.substring(4, length - 4));
        context.sendBroadcast(new Intent(str2, Uri.parse(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3))));
        return true;
    }

    public static boolean b(Context context, String str, EditText editText) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null || telephonyManager.getPhoneType() != 1) {
            return false;
        }
        if (((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        int length = str.length();
        if (length > 1 && length < 5 && str.endsWith("#")) {
            try {
                length = Integer.parseInt(str.substring(0, length - 1));
                ald ald = new ald(context.getContentResolver());
                ale ale = new ale(length - 1, ald, -1);
                ale.b = length - 1;
                ale.a(editText);
                ale.a = new ProgressDialog(context);
                ale.a.setTitle(cob.cR);
                ale.a.setMessage(context.getText(cob.cQ));
                ale.a.setIndeterminate(true);
                ale.a.setCancelable(true);
                ale.a.setOnCancelListener(ale);
                ale.a.getWindow().addFlags(4);
                List n = n(context);
                Context applicationContext = context.getApplicationContext();
                boolean contains = n.contains(axk.a(applicationContext, "tel"));
                if (n.size() <= 1 || contains) {
                    a(ald, ale, axk.a(applicationContext, null));
                } else {
                    ajy.a(n, new alb(applicationContext, ald, ale)).show(((Activity) context).getFragmentManager(), "tag_select_acct_fragment");
                }
                return true;
            } catch (NumberFormatException e) {
            }
        }
        return false;
    }

    public static void a(ald ald, ale ale, Uri uri) {
        if (ald == null || ale == null || uri == null) {
            Log.w("SpecialCharSequenceMgr", "queryAdn parameters incorrect");
            return;
        }
        ale.a.show();
        ald.startQuery(-1, ale, uri, new String[]{"number"}, null, null, null);
        if (hX != null) {
            hX.a();
        }
        hX = ald;
    }

    public static boolean f(Context context, String str) {
        if ((!str.startsWith("**04") && !str.startsWith("**05")) || !str.endsWith("#")) {
            return false;
        }
        List n = n(context);
        boolean contains = n.contains(axk.a(context, "tel"));
        if (n.size() <= 1 || contains) {
            return axk.a(context, str, null);
        }
        ajy.a(n, new alc(context, str)).show(((Activity) context).getFragmentManager(), "tag_select_acct_fragment");
        return true;
    }

    public static boolean g(Context context, String str) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null || !str.equals("*#06#")) {
            return false;
        }
        int i = telephonyManager.getPhoneType() == 1 ? cob.cg : cob.cn;
        List arrayList = new ArrayList();
        if (a(telephonyManager) > 1) {
            if (abw.a("android.telephony.TelephonyManager", "getDeviceId", Integer.TYPE)) {
                for (int i2 = 0; i2 < telephonyManager.getPhoneCount(); i2++) {
                    CharSequence deviceId = telephonyManager.getDeviceId(i2);
                    if (!TextUtils.isEmpty(deviceId)) {
                        arrayList.add(deviceId);
                    }
                }
                new AlertDialog.Builder(context).setTitle(i).setItems((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), null).setPositiveButton(17039370, null).setCancelable(false).show();
                return true;
            }
        }
        arrayList.add(telephonyManager.getDeviceId());
        new AlertDialog.Builder(context).setTitle(i).setItems((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), null).setPositiveButton(17039370, null).setCancelable(false).show();
        return true;
    }

    public static boolean h(Context context, String str) {
        if (!str.equals("*#07#")) {
            return false;
        }
        try {
            context.startActivity(new Intent("android.settings.SHOW_REGULATORY_INFO"));
        } catch (ActivityNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.e("SpecialCharSequenceMgr", new StringBuilder(String.valueOf(valueOf).length() + 24).append("startActivity() failed: ").append(valueOf).toString());
        }
        return true;
    }

    public static List n(Context context) {
        List arrayList = new ArrayList();
        for (PhoneAccountHandle phoneAccountHandle : axk.c(context)) {
            if (axk.b(context, phoneAccountHandle).hasCapabilities(4)) {
                arrayList.add(phoneAccountHandle);
            }
        }
        return arrayList;
    }

    public static PhoneAccountHandle c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
        if (unflattenFromString != null) {
            return new PhoneAccountHandle(unflattenFromString, str2);
        }
        return null;
    }

    public static String a(Context context, PhoneAccountHandle phoneAccountHandle) {
        PhoneAccount d = d(context, phoneAccountHandle);
        if (d == null || d.getLabel() == null) {
            return null;
        }
        return d.getLabel().toString();
    }

    public static int b(Context context, PhoneAccountHandle phoneAccountHandle) {
        PhoneAccount b = axk.b(context, phoneAccountHandle);
        return b == null ? 0 : b.getHighlightColor();
    }

    public static boolean c(Context context, PhoneAccountHandle phoneAccountHandle) {
        PhoneAccount b = axk.b(context, phoneAccountHandle);
        if (b == null) {
            return false;
        }
        return b.hasCapabilities(64);
    }

    public static PhoneAccount d(Context context, PhoneAccountHandle phoneAccountHandle) {
        if (axk.c(context).size() <= 1) {
            return null;
        }
        return axk.b(context, phoneAccountHandle);
    }

    public static CharSequence a(Context context, CharSequence charSequence, int i, boolean z) {
        if (i == 3) {
            return context.getResources().getString(cob.dq);
        }
        if (i == 2) {
            return context.getResources().getString(cob.cH);
        }
        if (i == 4) {
            return context.getResources().getString(cob.cy);
        }
        if (z) {
            return context.getResources().getString(cob.du);
        }
        if (awy.b(charSequence)) {
            return context.getResources().getString(cob.dq);
        }
        return "";
    }

    public static CharSequence a(Context context, CharSequence charSequence, int i, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        CharSequence a = a(context, charSequence, i, z);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            return charSequence2;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return context.getResources().getString(cob.dq);
        }
        String valueOf = String.valueOf(charSequence.toString());
        String valueOf2 = String.valueOf(charSequence3);
        return new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString();
    }

    public static void d(Context context, Intent intent) {
        a(context, intent, cob.aX);
    }

    public static void a(Context context, Intent intent, int i) {
        try {
            if ("android.intent.action.CALL".equals(intent.getAction()) && (context instanceof Activity)) {
                int i2;
                int i3;
                Parcelable parcelable = add.a.b;
                if (!(parcelable.x == 0 && parcelable.y == 0)) {
                    Bundle bundle;
                    if (intent.hasExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS")) {
                        bundle = (Bundle) intent.getParcelableExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS");
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putParcelable("touchPoint", parcelable);
                    intent.putExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle);
                }
                Context context2 = (Activity) context;
                if (axk.i(context2) || axk.b(context2, "android.permission.CALL_PHONE")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    axk.j(context2).placeCall(intent.getData(), intent.getExtras());
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (i3 == 0) {
                    Toast.makeText(context, "Cannot place call without Phone permission", 0);
                    return;
                }
                return;
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(context, i, 0).show();
        }
    }

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static CharSequence a(Resources resources, Iterable iterable) {
        StringBuilder stringBuilder = new StringBuilder();
        BidiFormatter instance = BidiFormatter.getInstance();
        CharSequence string = resources.getString(cob.cl);
        Object obj = 1;
        for (CharSequence charSequence : iterable) {
            Object obj2;
            if (obj != null) {
                obj2 = null;
            } else {
                stringBuilder.append(string);
                obj2 = obj;
            }
            stringBuilder.append(instance.unicodeWrap(charSequence.toString(), TextDirectionHeuristics.FIRSTSTRONG_LTR));
            obj = obj2;
        }
        return instance.unicodeWrap(stringBuilder.toString());
    }

    public static boolean k() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static void x(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    public static void y(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static Intent a(Uri uri, PhoneAccountHandle phoneAccountHandle, int i, int i2) {
        Intent intent = new Intent("android.intent.action.CALL", uri);
        intent.putExtra("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", i);
        Bundle bundle = new Bundle();
        bundle.putLong("android.telecom.extra.CALL_CREATED_TIME_MILLIS", SystemClock.elapsedRealtime());
        bundle.putInt("com.android.dialer.EXTRA_CALL_INITIATION_TYPE", i2);
        intent.putExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle);
        if (phoneAccountHandle != null) {
            intent.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
        }
        return intent;
    }

    public static Intent d(CharSequence charSequence) {
        String valueOf = String.valueOf("sms:");
        String valueOf2 = String.valueOf(charSequence);
        return new Intent("android.intent.action.SENDTO", Uri.parse(new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString()));
    }

    public static Intent l() {
        return new Intent("android.intent.action.INSERT", Contacts.CONTENT_URI);
    }

    public static Intent e(CharSequence charSequence) {
        return a(null, charSequence, -1);
    }

    public static Intent a(CharSequence charSequence, CharSequence charSequence2, int i) {
        Intent l = l();
        a(l, charSequence, charSequence2, i);
        return l;
    }

    public static Intent m() {
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT");
        intent.setType("vnd.android.cursor.item/contact");
        return intent;
    }

    public static Intent f(CharSequence charSequence) {
        return b(null, charSequence, -1);
    }

    public static Intent b(CharSequence charSequence, CharSequence charSequence2, int i) {
        Intent m = m();
        a(m, charSequence, charSequence2, i);
        return m;
    }

    public static void a(Intent intent, CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence2 != null) {
            intent.putExtra("phone", charSequence2);
        }
        if (charSequence != null) {
            intent.putExtra("name", charSequence);
        }
        if (i != -1) {
            intent.putExtra("phone_type", i);
        }
    }

    public static AlertDialog.Builder a(Activity activity, DialogFragment dialogFragment) {
        return new AlertDialog.Builder(activity, iD).setCancelable(true).setNegativeButton(17039360, new atz(dialogFragment));
    }

    public static OnClickListener a(DialogFragment dialogFragment, aug aug) {
        return new aua(dialogFragment, aug);
    }

    public static String o(Context context) {
        if (w(context)) {
            return context.getString(ie);
        }
        return context.getString(ik);
    }

    public static String q(Context context) {
        w(context);
        return "_id";
    }

    public static String r(Context context) {
        return w(context) ? null : "type";
    }

    public static String s(Context context) {
        return w(context) ? null : "source";
    }

    public static String t(Context context) {
        if (w(context)) {
            return "original_number";
        }
        return "number";
    }

    public static String u(Context context) {
        return w(context) ? null : "country_iso";
    }

    public static String v(Context context) {
        if (w(context)) {
            return "e164_number";
        }
        return "normalized_number";
    }

    public static boolean n() {
        return c();
    }

    public static boolean w(Context context) {
        return n() && x(context);
    }

    public static boolean x(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("migratedToNewBlocking", false);
    }

    public static void a(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("migratedToNewBlocking", z).apply();
    }

    public static Uri a(Context context, Integer num) {
        if (num == null) {
            return y(context);
        }
        return ContentUris.withAppendedId(y(context), (long) num.intValue());
    }

    public static Uri y(Context context) {
        return w(context) ? BlockedNumbers.CONTENT_URI : awe.a;
    }

    public static String[] a(String[] strArr) {
        List arrayList = new ArrayList();
        for (Object obj : strArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static ContentValues a(Context context, String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(t(context), (String) Objects.requireNonNull(str));
        if (!w(context)) {
            if (str2 == null) {
                str2 = PhoneNumberUtils.formatNumberToE164(str, str3);
            }
            contentValues.put(v(context), str2);
            contentValues.put(u(context), str3);
            contentValues.put(r(context), Integer.valueOf(1));
            contentValues.put(s(context), Integer.valueOf(1));
        }
        return contentValues;
    }

    public static boolean a(Context context, FragmentManager fragmentManager, auo auo) {
        if (!b(context, true)) {
            return false;
        }
        a("FilteredNumberCompat, maybeShowBlockNumberMigrationDialog - showing migration dialog", new Object[0]);
        aum aum = new aum(context);
        DialogFragment avh = new avh();
        avh.a = (aum) Objects.requireNonNull(aum);
        avh.b = (auo) Objects.requireNonNull(auo);
        avh.show(fragmentManager, "MigrateBlockedNumbers");
        return true;
    }

    public static boolean b(Context context, boolean z) {
        return n() && !x(context);
    }

    public static Intent z(Context context) {
        if (n() && x(context)) {
            return ((TelecomManager) context.getSystemService(TelecomManager.class)).createManageBlockedNumbersIntent();
        }
        Intent intent = new Intent("com.android.dialer.action.BLOCKED_NUMBERS_SETTINGS");
        intent.setPackage(context.getPackageName());
        return intent;
    }

    public static boolean A(Context context) {
        if (c()) {
            return BlockedNumberContract.canCurrentUserBlockNumbers(context);
        }
        return ((UserManager) context.getSystemService(UserManager.class)).isSystemUser();
    }

    public static boolean B(Context context) {
        if (c()) {
            return BlockedNumberContract.canCurrentUserBlockNumbers(context);
        }
        return ((UserManager) context.getSystemService(UserManager.class)).isSystemUser();
    }

    public static void a(Context context, avd avd) {
        new ava(context, avd).execute(new Object[0]);
    }

    public static void a(Context context, avf avf) {
        H(context).b(22);
        new avb(context, new aup(context), avf).execute(new Object[0]);
    }

    public static boolean a(Context context, String str, String str2, long j) {
        if (TextUtils.isEmpty(PhoneNumberUtils.formatNumberToE164(str, str2)) || C(context)) {
            return false;
        }
        Cursor query = context.getContentResolver().query(awe.a, new String[]{"creation_time"}, "normalized_number=?", new String[]{r5}, null);
        if (query == null) {
            return false;
        }
        try {
            boolean z;
            if (!query.moveToFirst() || TimeUnit.MINUTES.convert(j, TimeUnit.MILLISECONDS) < TimeUnit.MINUTES.convert(query.getLong(0), TimeUnit.MILLISECONDS)) {
                z = false;
            } else {
                z = true;
            }
            query.close();
            return z;
        } catch (Throwable th) {
            query.close();
        }
    }

    public static boolean C(Context context) {
        if (context == null) {
            return false;
        }
        Long valueOf = Long.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getLong("last_emergency_call_ms", 0));
        if (valueOf.longValue() == 0 || System.currentTimeMillis() - valueOf.longValue() >= F(context)) {
            return false;
        }
        return true;
    }

    public static void D(Context context) {
        if (context != null) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("last_emergency_call_ms", System.currentTimeMillis()).putBoolean("notified_call_blocking_disabled_by_emergency_call", false).apply();
            E(context);
        }
    }

    public static void E(Context context) {
        if (!w(context) && !PreferenceManager.getDefaultSharedPreferences(context).getBoolean("notified_call_blocking_disabled_by_emergency_call", false)) {
            new aup(context).a(new avc(context));
        }
    }

    public static boolean b(Context context, String str, String str2) {
        Object c = c(context, str, str2);
        return (TextUtils.isEmpty(c) || PhoneNumberUtils.isEmergencyNumber(c)) ? false : true;
    }

    public static String c(Context context, String str, String str2) {
        return (w(context) && TextUtils.isEmpty(str)) ? str2 : str;
    }

    public static long F(Context context) {
        if (!Log.isLoggable("DebugEmergencyCall", 2)) {
            return 172800000;
        }
        long j = System.getLong(context.getContentResolver(), "dialer_emergency_call_threshold_ms", 0);
        return j > 0 ? j : 172800000;
    }

    public static void a(String str, Object... objArr) {
        a(4, "Dialer", str, objArr);
    }

    public static void b(String str, Object... objArr) {
        a(6, "Dialer", str, objArr);
    }

    public static void a(String str, Throwable th) {
        a(6, "Dialer", str, new Object[0]);
        a(6, "Dialer", Log.getStackTraceString(th), new Object[0]);
    }

    public static void c(String str, Object... objArr) {
        a(2, "Dialer", str, objArr);
    }

    public static String y(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (o()) {
            return obj.toString();
        }
        return "Redacted-" + obj.toString().length() + "-chars";
    }

    public static char a(char c) {
        if (!o() && b(c)) {
            return '*';
        }
        return c;
    }

    public static String k(String str) {
        if (o()) {
            return str;
        }
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (char a : str.toCharArray()) {
            stringBuilder.append(a(a));
        }
        return stringBuilder.toString();
    }

    public static boolean o() {
        return Log.isLoggable("Dialer", 3);
    }

    public static boolean b(char c) {
        return PhoneNumberUtils.is12Key(c);
    }

    public static void a(int i, String str, String str2, Object... objArr) {
        Object obj = (objArr == null || objArr.length > 0) ? 1 : null;
        if (i >= 4 || Log.isLoggable(str, i)) {
            if (obj != null) {
                str2 = String.format(str2, objArr);
            }
            Log.println(i, str, str2);
        }
    }

    public static Interpolator a(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, 0.0f, f3, 1.0f);
        }
        return new avp(f, 0.0f, f3, 1.0f);
    }

    public static avt G(Context context) {
        Objects.requireNonNull(context);
        if (iE != null) {
            return iE;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof avu) {
            iE = ((avu) applicationContext).d();
        }
        if (iE == null) {
            iE = new avv();
        }
        return iE;
    }

    public static awm H(Context context) {
        Objects.requireNonNull(context);
        if (jr != null) {
            return jr;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof awn) {
            jr = ((awn) applicationContext).e();
        }
        if (jr == null) {
            jr = new awo();
        }
        return jr;
    }

    public static String f(Uri uri) {
        if (c()) {
            return "contact_id";
        }
        return uri.getBooleanQueryParameter("sip", false) ? "contact_id" : "_id";
    }

    public static awu I(Context context) {
        Objects.requireNonNull(context);
        if (js != null) {
            return js;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof awv) {
            js = ((awv) applicationContext).f();
        }
        if (js == null) {
            js = new aww();
        }
        return js;
    }

    public static axf J(Context context) {
        Objects.requireNonNull(context);
        if (jt != null) {
            return jt;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof axh) {
            jt = ((axh) applicationContext).g();
        }
        if (jt == null) {
            jt = new axi();
        }
        return jt;
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '-' || charAt == '@' || charAt == '.') {
                stringBuilder.append(charAt);
            } else {
                stringBuilder.append('x');
            }
        }
        return stringBuilder.toString();
    }

    public static bef K(Context context) {
        Objects.requireNonNull(context);
        if (jw != null) {
            return jw;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof beg) {
            jw = ((beg) applicationContext).h();
        }
        if (jw == null) {
            jw = new beh();
        }
        return jw;
    }

    public static bem L(Context context) {
        Objects.requireNonNull(context);
        if (jx != null) {
            return jx;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof ben) {
            jx = ((ben) applicationContext).i();
        }
        if (jx == null) {
            jx = new beo();
        }
        return jx;
    }

    public static boolean e(int i) {
        switch (i) {
            case rl.e /*3*/:
            case rl.f /*4*/:
            case rl.g /*5*/:
            case rl.i /*6*/:
            case rl.h /*7*/:
            case rl.j /*8*/:
            case rl.n /*11*/:
            case rk.i /*13*/:
                return true;
            default:
                return false;
        }
    }

    public static boolean f(int i) {
        return i == 6 || i == 7;
    }

    public static String g(int i) {
        switch (i) {
            case rl.c /*0*/:
                return "INVALID";
            case rq.b /*1*/:
                return "NEW";
            case rq.c /*2*/:
                return "IDLE";
            case rl.e /*3*/:
                return "ACTIVE";
            case rl.f /*4*/:
                return "INCOMING";
            case rl.g /*5*/:
                return "CALL_WAITING";
            case rl.i /*6*/:
                return "DIALING";
            case rl.h /*7*/:
                return "REDIALING";
            case rl.j /*8*/:
                return "ONHOLD";
            case rl.l /*9*/:
                return "DISCONNECTING";
            case rl.m /*10*/:
                return "DISCONNECTED";
            case rl.n /*11*/:
                return "CONFERENCED";
            case rl.k /*12*/:
                return "SELECT_PHONE_ACCOUNT";
            case rk.i /*13*/:
                return "CONNECTING";
            case rk.bV /*14*/:
                return "BLOCKED";
            default:
                return "UNKNOWN";
        }
    }

    public static aic M(Context context) {
        if (a(context)) {
            return new aic(context);
        }
        return null;
    }

    public static String a(Context context, long j) {
        int i;
        int i2 = 0;
        int i3 = (int) (j / 1000);
        if (i3 >= 3600) {
            i = i3 / 3600;
            i3 -= i * 3600;
        } else {
            i = 0;
        }
        if (i3 >= 60) {
            i2 = i3 / 60;
            i3 -= i2 * 60;
        }
        Resources resources = context.getResources();
        StringBuilder stringBuilder = new StringBuilder();
        if (i > 0) {
            try {
                stringBuilder.append(resources.getQuantityString(lc, i, new Object[]{Integer.valueOf(i)}));
            } catch (NotFoundException e) {
                return null;
            }
        }
        if (i2 > 0) {
            if (i > 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(resources.getQuantityString(ld, i2, new Object[]{Integer.valueOf(i2)}));
        }
        if (i3 > 0) {
            if (i > 0 || i2 > 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(resources.getQuantityString(le, i3, new Object[]{Integer.valueOf(i3)}));
        }
        return stringBuilder.toString();
    }

    public static boolean a(ayo ayo) {
        return ayo != null && h(ayo.k());
    }

    public static boolean h(int i) {
        return abw.c() && (VideoProfile.isTransmissionEnabled(i) || VideoProfile.isReceptionEnabled(i));
    }

    public static boolean b(ayo ayo) {
        return abw.c() && VideoProfile.isBidirectional(ayo.k());
    }

    public static boolean c(ayo ayo) {
        if (abw.c()) {
            return VideoProfile.isTransmissionEnabled(ayo.k());
        }
        return false;
    }

    public static boolean d(ayo ayo) {
        if (!a(ayo)) {
            return false;
        }
        int c = ayo.c();
        if (c == 4 || c == 5) {
            return true;
        }
        return false;
    }

    public static boolean e(ayo ayo) {
        return a(ayo) && ayo.c() == 3;
    }

    public static boolean f(ayo ayo) {
        if (!a(ayo)) {
            return false;
        }
        int c = ayo.c();
        if (f(c) || c == 13 || c == 12) {
            return true;
        }
        return false;
    }

    public static boolean g(ayo ayo) {
        if (!abw.c()) {
            return true;
        }
        if (ayo == null || !VideoProfile.isAudioOnly(ayo.k())) {
            return false;
        }
        return true;
    }

    public static boolean h(ayo ayo) {
        return a(ayo) && ayo.c() == 3;
    }

    public static VideoProfile i(ayo ayo) {
        Objects.requireNonNull(ayo);
        if (!VideoProfile.isAudioOnly(ayo.k())) {
            return new VideoProfile(j(ayo.k()));
        }
        throw new IllegalStateException();
    }

    public static VideoProfile j(ayo ayo) {
        Objects.requireNonNull(ayo);
        return new VideoProfile(i(ayo.k()));
    }

    public static int i(int i) {
        return i & -5;
    }

    public static int j(int i) {
        return i | 4;
    }

    public static boolean N(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean b(Call call) {
        Uri handle = call.getDetails().getHandle();
        return PhoneNumberUtils.isEmergencyNumber(handle == null ? "" : handle.getSchemeSpecificPart());
    }

    public static String c(Call call) {
        if (call == null) {
            return null;
        }
        if (call.getDetails().getGatewayInfo() != null) {
            return call.getDetails().getGatewayInfo().getOriginalAddress().getSchemeSpecificPart();
        }
        Uri d = d(call);
        if (d != null) {
            return d.getSchemeSpecificPart();
        }
        return null;
    }

    public static Uri d(Call call) {
        return call == null ? null : call.getDetails().getHandle();
    }

    public static String c(String str, int i) {
        Object spannableStringBuilder = new SpannableStringBuilder(str);
        PhoneNumberUtils.formatNumber(spannableStringBuilder, i);
        return spannableStringBuilder.toString();
    }

    public static boolean c(char c) {
        return (' ' <= c && c <= '~') || c == '\r' || c == '\n';
    }

    public static boolean g(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String k(int i) {
        switch (i) {
            case rl.c /*0*/:
                avl.c();
                return "UNKNOWN";
            case rq.b /*1*/:
                return "DialpadFragment#Dialer";
            case rq.c /*2*/:
                return "SpeedDialFragment";
            case rl.e /*3*/:
                return "CallLogFragment#History";
            case rl.f /*4*/:
                return "CallLogFragment#Voicemail";
            case rl.g /*5*/:
                return "AllContactsFragment";
            case rl.i /*6*/:
                return "RegularSearchFragment";
            case rl.h /*7*/:
                return "SmartDialSearchFragment";
            case rl.j /*8*/:
                return "CallLogFragment#Filtered";
            case rl.l /*9*/:
                return "DialerSettingsActivity";
            case rl.m /*10*/:
                return "ImportExportDialogFragment";
            case rl.n /*11*/:
                return "ClearFrequentsDialog";
            case rl.k /*12*/:
                return "SendFeedback";
            case rk.i /*13*/:
                return "InCallActivity";
            case rk.bV /*14*/:
                return "AnswerFragment";
            case rk.bY /*15*/:
                return "ConferenceManagerFragment";
            case rk.bX /*16*/:
                return "DialpadFragment#InCall";
            case rk.bZ /*17*/:
                return "CallLogContextMenu";
            case rk.bW /*18*/:
                return "BlockedNumbersFragment";
            case rk.m /*19*/:
                return "BlockedListSearchFragment";
            default:
                avl.c();
                return "INVALID: " + i;
        }
    }

    public static deq a(Context context, ayo ayo) {
        ayq ayq = ayo.g;
        deq deq = new deq();
        deq.a = a(ayq);
        deq.d = ayq.a != null ? ayq.a.getCode() : 0;
        deq.b = ayq.d;
        deq.c = ayq.c;
        deq.e = (int) ayq.f;
        deq.f = ayq.e;
        deq.g = a(ayo.c);
        deq.i = ayo.a;
        deq.h = O(context);
        deq.j = ayo.p;
        deq.k = k(ayo);
        return deq;
    }

    public static int[] k(ayo ayo) {
        int i = 1;
        int[] iArr = new int[3];
        if (ayo.s) {
            iArr[0] = 1;
        } else {
            i = 0;
        }
        if (ayo.q) {
            int i2 = i + 1;
            iArr[i] = 2;
            i = i2;
        }
        if (ayo.r) {
            i2 = i + 1;
            iArr[i] = 3;
            i = i2;
        }
        return Arrays.copyOf(iArr, i);
    }

    public static der a(bde bde) {
        der der = new der();
        der.a = a(bde.b, bde.c);
        der.b = a(bde.c, bde.d);
        der.c = a(bde.d, bde.e);
        der.d = a(bde.e, bde.f);
        if (bde.a) {
            der.e = a(bde.f, bde.g);
            if (!bde.i) {
                der.f = a(bde.g, bde.h);
            }
        } else {
            der.f = a(bde.f, bde.h);
        }
        return der;
    }

    public static deu f(Context context, int i) {
        deu deu = new deu();
        deu.c = System.currentTimeMillis();
        if (i > 100000) {
            deu.b = i;
        } else if (i < 1000 || i > 100000) {
            avl.c();
        } else {
            deu.a = i;
        }
        deu.d = O(context);
        return deu;
    }

    public static deu a(Context context, int i, String str, long j) {
        deu f = f(context, i);
        f.e = str;
        f.f = System.currentTimeMillis() - j;
        return f;
    }

    public static des O(Context context) {
        des des = new des();
        des.a = Build.DEVICE;
        des.b = Build.MODEL;
        des.c = VERSION.RELEASE;
        des.d = Build.ID;
        des.e = P(context);
        des.f = 0;
        return des;
    }

    public static dbz b(Context context, ayo ayo) {
        boolean z;
        dbz dbz = new dbz();
        dbz.a = "Dialer";
        dbz.b = Q(context);
        dbz.c = c(ayo.b);
        dbz.d = TimeUnit.HOURS.toSeconds(TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis()));
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        dbz.f = telephonyManager.getSimCountryIso();
        dbz.g = telephonyManager.getNetworkCountryIso();
        if (ayo.g.c == 2) {
            z = true;
        } else {
            z = false;
        }
        dbz.h = z;
        dbz.l = d(ayo.g.f);
        dbz.j = ayo.p;
        dbz.e = a(ayo.g, dbz.j);
        dbz.k = ayo.q;
        dbz.i = ayo.r;
        dbz.m = ayo.s;
        return dbz;
    }

    public static int d(long j) {
        if (j < 30000) {
            return 1;
        }
        if (j < 60000) {
            return 2;
        }
        if (j < 120000) {
            return 3;
        }
        return 4;
    }

    public static String P(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
    }

    public static int a(ayq ayq, boolean z) {
        if (z) {
            return 4;
        }
        if (!ayq.b) {
            return 5;
        }
        if (ayq.f > 0) {
            return 1;
        }
        if (ayq.f == 0) {
            return 2;
        }
        return 0;
    }

    public static int a(ayq ayq) {
        if (ayq.b) {
            return 1;
        }
        return 2;
    }

    public static long a(long j, long j2) {
        if (j == -1 || j2 == -1) {
            return 0;
        }
        return j2 - j;
    }

    public static String Q(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            return "Version Name Not Found";
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Application r10) {
        /*
        r9 = 0;
        r8 = 1;
        r1 = bjd.l;
        r0 = crm.b;
        if (r0 != 0) goto L_0x0010;
    L_0x0008:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0010:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x00f2;
    L_0x001e:
        r0 = r1.i;
        if (r0 == 0) goto L_0x00da;
    L_0x0022:
        r0 = crm.b;
        r2 = r1.i;
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x00f2;
    L_0x0033:
        r0 = r1.a(r0);
    L_0x0037:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00d9;
    L_0x003f:
        r0 = lZ;
        if (r0 == r8) goto L_0x00d9;
    L_0x0043:
        r0 = new cxi;
        r2 = new csy;
        r2.<init>();
        r3 = new ctj;
        r3.<init>(r10);
        r4 = new csr;
        r4.<init>();
        r5 = "DIALER_ANDROID_PRIMES";
        r1 = r10;
        r0.<init>(r1, r2, r3, r4, r5);
        r7 = new cvs;
        r7.<init>();
        r1 = new bjm;
        r1.<init>();
        r7.a = r1;
        r1 = new bjl;
        r1.<init>();
        r7.b = r1;
        r1 = new bjk;
        r1.<init>();
        r7.d = r1;
        r1 = new bjj;
        r1.<init>();
        r7.c = r1;
        r1 = new cwb;
        r1.<init>(r8);
        r7.e = r1;
        r1 = r7.a;
        if (r1 != 0) goto L_0x008a;
    L_0x0086:
        r1 = cvz.a;
        r7.a = r1;
    L_0x008a:
        r1 = r7.b;
        if (r1 != 0) goto L_0x0092;
    L_0x008e:
        r1 = cwi.a;
        r7.b = r1;
    L_0x0092:
        r1 = r7.c;
        if (r1 != 0) goto L_0x009a;
    L_0x0096:
        r1 = cvt.a;
        r7.c = r1;
    L_0x009a:
        r1 = r7.d;
        if (r1 != 0) goto L_0x00a2;
    L_0x009e:
        r1 = cwa.a;
        r7.d = r1;
    L_0x00a2:
        r1 = r7.e;
        if (r1 != 0) goto L_0x00aa;
    L_0x00a6:
        r1 = cwb.a;
        r7.e = r1;
    L_0x00aa:
        r1 = r7.f;
        if (r1 != 0) goto L_0x00b2;
    L_0x00ae:
        r1 = cvy.a;
        r7.f = r1;
    L_0x00b2:
        r1 = new cvr;
        r2 = r7.a;
        r3 = r7.b;
        r4 = r7.c;
        r5 = r7.d;
        r6 = r7.e;
        r7 = r7.f;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        B(r0);
        r2 = new cvq;
        r2.<init>(r10, r0, r9, r1);
        r0 = cvm.a(r2);
        r0.a();
        r0 = r0.b;
        r0.b();
        lZ = r8;
    L_0x00d9:
        return;
    L_0x00da:
        if (r9 != 0) goto L_0x010a;
    L_0x00dc:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x00ea:
        if (r0 == 0) goto L_0x00f2;
    L_0x00ec:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0037;
    L_0x00f2:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0106;
    L_0x0100:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0037;
    L_0x0106:
        r0 = r1.k;
        goto L_0x0037;
    L_0x010a:
        r0 = r1.j;
        r2 = r1.f;
        r3 = r1.g;
        r4 = r1.h;
        r5 = new crk;
        r5.<init>(r2, r3, r4);
        r2 = r0.a(r5);
        if (r2 == 0) goto L_0x0122;
    L_0x011d:
        r0 = r2.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x00ea;
    L_0x0122:
        r0 = r0.a(r9, r5);
        goto L_0x00ea;
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.a(android.app.Application):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static cwn p() {
        /*
        r7 = 0;
        r1 = 0;
        r2 = bjd.l;
        r0 = crm.b;
        if (r0 != 0) goto L_0x0010;
    L_0x0008:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0010:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0064;
    L_0x001e:
        r0 = r2.i;
        if (r0 == 0) goto L_0x004c;
    L_0x0022:
        r0 = crm.b;
        r3 = r2.i;
        r0 = r0.getSharedPreferences(r3, r7);
        r3 = r2.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0064;
    L_0x0032:
        r0 = r2.a(r0);
    L_0x0036:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0118;
    L_0x003e:
        r2 = bjd.n;
        r0 = crm.b;
        if (r0 != 0) goto L_0x0098;
    L_0x0044:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x004c:
        if (r1 != 0) goto L_0x007b;
    L_0x004e:
        r0 = r2.j;
        r3 = crm.b;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r0 = r0.a(r3, r4, r5, r6);
    L_0x005c:
        if (r0 == 0) goto L_0x0064;
    L_0x005e:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0064:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r3 = r2.e;
        r0 = ckq.a(r0, r3);
        if (r0 == 0) goto L_0x0078;
    L_0x0072:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0078:
        r0 = r2.k;
        goto L_0x0036;
    L_0x007b:
        r0 = r2.j;
        r3 = r2.f;
        r4 = r2.g;
        r5 = r2.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x0093;
    L_0x008e:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x005c;
    L_0x0093:
        r0 = r0.a(r1, r6);
        goto L_0x005c;
    L_0x0098:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x00e4;
    L_0x00a6:
        r0 = r2.i;
        if (r0 == 0) goto L_0x00cc;
    L_0x00aa:
        r0 = crm.b;
        r3 = r2.i;
        r0 = r0.getSharedPreferences(r3, r7);
        r3 = r2.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x00e4;
    L_0x00ba:
        r0 = r2.a(r0);
    L_0x00be:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0118;
    L_0x00c6:
        r0 = new cwn;
        r0.<init>();
    L_0x00cb:
        return r0;
    L_0x00cc:
        if (r1 != 0) goto L_0x00fb;
    L_0x00ce:
        r0 = r2.j;
        r3 = crm.b;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r0 = r0.a(r3, r4, r5, r6);
    L_0x00dc:
        if (r0 == 0) goto L_0x00e4;
    L_0x00de:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x00be;
    L_0x00e4:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r3 = r2.e;
        r0 = ckq.a(r0, r3);
        if (r0 == 0) goto L_0x00f8;
    L_0x00f2:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x00be;
    L_0x00f8:
        r0 = r2.k;
        goto L_0x00be;
    L_0x00fb:
        r0 = r2.j;
        r3 = r2.f;
        r4 = r2.g;
        r5 = r2.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x0113;
    L_0x010e:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x00dc;
    L_0x0113:
        r0 = r0.a(r1, r6);
        goto L_0x00dc;
    L_0x0118:
        r0 = r1;
        goto L_0x00cb;
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.p():cwn");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(cwn r7, java.lang.String r8) {
        /*
        r1 = bjd.n;
        r2 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x000f;
    L_0x0007:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x000f:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x005e;
    L_0x001d:
        r0 = r1.i;
        if (r0 == 0) goto L_0x0046;
    L_0x0021:
        r0 = crm.b;
        r2 = r1.i;
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x005e;
    L_0x0032:
        r0 = r1.a(r0);
    L_0x0036:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0045;
    L_0x003e:
        if (r7 == 0) goto L_0x0045;
    L_0x0040:
        r0 = cvm.a;
        r0.a(r7, r8);
    L_0x0045:
        return;
    L_0x0046:
        if (r2 != 0) goto L_0x0075;
    L_0x0048:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x0056:
        if (r0 == 0) goto L_0x005e;
    L_0x0058:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x005e:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0072;
    L_0x006c:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0072:
        r0 = r1.k;
        goto L_0x0036;
    L_0x0075:
        r0 = r1.j;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x008d;
    L_0x0088:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0056;
    L_0x008d:
        r0 = r0.a(r2, r6);
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.a(cwn, java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void R(android.content.Context r8) {
        /*
        r7 = 0;
        r1 = bjd.E;
        r2 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x0010;
    L_0x0008:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0010:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x005a;
    L_0x001e:
        r0 = r1.i;
        if (r0 == 0) goto L_0x0042;
    L_0x0022:
        r0 = crm.b;
        r2 = r1.i;
        r0 = r0.getSharedPreferences(r2, r7);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x005a;
    L_0x0032:
        r0 = r1.a(r0);
    L_0x0036:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x008e;
    L_0x003e:
        S(r8);
    L_0x0041:
        return;
    L_0x0042:
        if (r2 != 0) goto L_0x0071;
    L_0x0044:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x0052:
        if (r0 == 0) goto L_0x005a;
    L_0x0054:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x005a:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x006e;
    L_0x0068:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x006e:
        r0 = r1.k;
        goto L_0x0036;
    L_0x0071:
        r0 = r1.j;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x0089;
    L_0x0084:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0052;
    L_0x0089:
        r0 = r0.a(r2, r6);
        goto L_0x0052;
    L_0x008e:
        r0 = r8.getPackageName();
        r0 = r8.getSharedPreferences(r0, r7);
        r1 = "spam_jobs_scheduled";
        r1 = r0.getBoolean(r1, r7);
        if (r1 != 0) goto L_0x0041;
    L_0x009e:
        r1 = "SpamJobScheduler, scheduling all spam jobs";
        r2 = new java.lang.Object[r7];
        c(r1, r2);
        r1 = 50;
        g(r8, r1);
        r1 = 51;
        g(r8, r1);
        r0 = r0.edit();
        r1 = "spam_jobs_scheduled";
        r2 = 1;
        r0.putBoolean(r1, r2);
        r0.apply();
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.R(android.content.Context):void");
    }

    public static String l(int i) {
        o(i);
        switch (i) {
            case 50:
                return "SPAM_JOB_WIFI";
            case 51:
                return "SPAM_JOB_ANY_NETWORK";
            default:
                throw new IllegalArgumentException("Invalid spam job type.");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m(int r7) {
        /*
        r6 = 0;
        r3 = 0;
        o(r7);
        switch(r7) {
            case 50: goto L_0x0010;
            case 51: goto L_0x0097;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Invalid spam job type.";
        r0.<init>(r1);
        throw r0;
    L_0x0010:
        r1 = bjd.C;
        r0 = crm.b;
        if (r0 != 0) goto L_0x001e;
    L_0x0016:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x001e:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0063;
    L_0x002c:
        r0 = r1.i;
        if (r0 == 0) goto L_0x004b;
    L_0x0030:
        r0 = crm.b;
        r2 = r1.i;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0063;
    L_0x0040:
        r0 = r1.a(r0);
    L_0x0044:
        r0 = (java.lang.Long) r0;
        r0 = r0.longValue();
    L_0x004a:
        return r0;
    L_0x004b:
        if (r6 != 0) goto L_0x007a;
    L_0x004d:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x005b:
        if (r0 == 0) goto L_0x0063;
    L_0x005d:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0044;
    L_0x0063:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0077;
    L_0x0071:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0044;
    L_0x0077:
        r0 = r1.k;
        goto L_0x0044;
    L_0x007a:
        r0 = r1.j;
        r2 = r1.f;
        r3 = r1.g;
        r4 = r1.h;
        r5 = new crk;
        r5.<init>(r2, r3, r4);
        r2 = r0.a(r5);
        if (r2 == 0) goto L_0x0092;
    L_0x008d:
        r0 = r2.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x005b;
    L_0x0092:
        r0 = r0.a(r6, r5);
        goto L_0x005b;
    L_0x0097:
        r1 = bjd.D;
        r0 = crm.b;
        if (r0 != 0) goto L_0x00a5;
    L_0x009d:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x00a5:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x00eb;
    L_0x00b3:
        r0 = r1.i;
        if (r0 == 0) goto L_0x00d3;
    L_0x00b7:
        r0 = crm.b;
        r2 = r1.i;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x00eb;
    L_0x00c7:
        r0 = r1.a(r0);
    L_0x00cb:
        r0 = (java.lang.Long) r0;
        r0 = r0.longValue();
        goto L_0x004a;
    L_0x00d3:
        if (r6 != 0) goto L_0x0102;
    L_0x00d5:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x00e3:
        if (r0 == 0) goto L_0x00eb;
    L_0x00e5:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x00cb;
    L_0x00eb:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x00ff;
    L_0x00f9:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x00cb;
    L_0x00ff:
        r0 = r1.k;
        goto L_0x00cb;
    L_0x0102:
        r0 = r1.j;
        r2 = r1.f;
        r3 = r1.g;
        r4 = r1.h;
        r5 = new crk;
        r5.<init>(r2, r3, r4);
        r2 = r0.a(r5);
        if (r2 == 0) goto L_0x011a;
    L_0x0115:
        r0 = r2.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x00e3;
    L_0x011a:
        r0 = r0.a(r6, r5);
        goto L_0x00e3;
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.m(int):long");
    }

    public static void g(Context context, int i) {
        String str = "SpamJobScheduler, rescheduling job with id: ";
        String valueOf = String.valueOf(l(i));
        c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        h(context, i);
        i(context, i);
    }

    public static void h(Context context, int i) {
        c("SpamJobScheduler, cancelling job with id=" + i, new Object[0]);
        JobScheduler T = T(context);
        if (T != null) {
            T.cancel(i);
        }
    }

    public static boolean n(int i) {
        return i == 50 || i == 51;
    }

    public static void i(Context context, int i) {
        JobScheduler T = T(context);
        if (T != null) {
            JobInfo j = j(context, i);
            String valueOf;
            if (a(j, T)) {
                valueOf = String.valueOf(l(i));
                c(new StringBuilder(String.valueOf(valueOf).length() + 51).append("SpamJobScheduler, job with id ").append(valueOf).append(" is already scheduled").toString(), new Object[0]);
                return;
            }
            String str = "SpamJobScheduler, scheduling job with id: ";
            valueOf = String.valueOf(l(i));
            c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            T.schedule(j);
        }
    }

    public static void S(Context context) {
        JobScheduler T = T(context);
        if (T != null) {
            for (JobInfo jobInfo : T.getAllPendingJobs()) {
                if (jobInfo.getService().getClassName().equals(SpamJobService.class.getName())) {
                    h(context, jobInfo.getId());
                }
            }
        }
    }

    public static boolean a(JobInfo jobInfo, JobScheduler jobScheduler) {
        for (JobInfo id : jobScheduler.getAllPendingJobs()) {
            if (jobInfo.getId() == id.getId()) {
                return true;
            }
        }
        return false;
    }

    public static JobInfo j(Context context, int i) {
        o(i);
        long m = m(i);
        JobInfo.Builder builder = new JobInfo.Builder(i, new ComponentName(context, SpamJobService.class));
        builder.setPersisted(true).setPeriodic(m).setExtras(e(m));
        switch (i) {
            case 50:
                return builder.setRequiredNetworkType(2).build();
            case 51:
                return builder.setRequiredNetworkType(1).build();
            default:
                throw new IllegalArgumentException("Invalid spam job type.");
        }
    }

    public static void o(int i) {
        Assert.assertTrue(i + " is not a valid spam job", n(i));
    }

    public static PersistableBundle e(long j) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putLong("spam_jobs_interval", j);
        return persistableBundle;
    }

    public static JobScheduler T(Context context) {
        return (JobScheduler) context.getSystemService("jobscheduler");
    }

    public static Uri i(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("getHelpUrl(): fromWhere must be non-empty");
        }
        Uri.Builder buildUpon = Uri.parse("http://support.google.com/mobile").buildUpon();
        buildUpon.appendQueryParameter("p", str);
        try {
            buildUpon.appendQueryParameter("version", String.valueOf(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 0).versionCode));
        } catch (NameNotFoundException e) {
            String str2 = "Dialer";
            String str3 = "Error finding package ";
            String valueOf = String.valueOf(context.getApplicationInfo().packageName);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        return buildUpon.build();
    }

    public static JSONArray a(JSONObject... jSONObjectArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object put : jSONObjectArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static String U(Context context) {
        StringBuilder stringBuilder = new StringBuilder("GoogleDialer ");
        try {
            stringBuilder.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName).append(" ");
        } catch (NameNotFoundException e) {
        }
        stringBuilder.append(Build.FINGERPRINT);
        return stringBuilder.toString();
    }

    public static int q() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            bpn.a("Invalid version number", VERSION.SDK);
            return 0;
        }
    }

    public static boolean m(String str) {
        if (q() < 9) {
            return false;
        }
        File file = new File(str);
        file.setReadable(false, false);
        file.setWritable(false, false);
        file.setReadable(true, true);
        file.setWritable(true, true);
        return true;
    }

    public static String p(int i) {
        return d("cd", i);
    }

    public static String q(int i) {
        return d("cm", i);
    }

    public static String d(String str, int i) {
        if (i > 0) {
            return str + i;
        }
        bpn.a("index out of range for prefix", str);
        return "";
    }

    public static String r(int i) {
        return d("&pr", i);
    }

    public static String s(int i) {
        return d("pr", i);
    }

    public static String t(int i) {
        return d("&promo", i);
    }

    public static String u(int i) {
        return d("promo", i);
    }

    public static String v(int i) {
        return d("pi", i);
    }

    public static String w(int i) {
        return d("&il", i);
    }

    public static String x(int i) {
        return d("il", i);
    }

    public static Intent a(Account account, ArrayList arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle) {
        return a(account, null, strArr, true, null, null, null, null, false);
    }

    public static Intent a(Account account, ArrayList arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle, boolean z2) {
        return a(account, arrayList, strArr, z, str, str2, strArr2, bundle, false, 0, 0);
    }

    public static Intent a(Account account, ArrayList arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle, boolean z2, int i, int i2) {
        return a(account, arrayList, strArr, z, str, str2, strArr2, bundle, z2, 0, 0, null, false);
    }

    public static Intent a(Account account, ArrayList arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle, boolean z2, int i, int i2, String str3, boolean z3) {
        Intent intent = new Intent();
        b(true, (Object) "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", z2);
        intent.putExtra("overrideTheme", i);
        intent.putExtra("overrideCustomTheme", i2);
        intent.putExtra("hostedDomainFilter", null);
        return intent;
    }

    public static String y(int i) {
        switch (i) {
            case oe.HOST_ID /*-1*/:
                return "SUCCESS_CACHE";
            case rl.c /*0*/:
                return "SUCCESS";
            case rq.b /*1*/:
                return "SERVICE_MISSING";
            case rq.c /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case rl.e /*3*/:
                return "SERVICE_DISABLED";
            case rl.f /*4*/:
                return "SIGN_IN_REQUIRED";
            case rl.g /*5*/:
                return "INVALID_ACCOUNT";
            case rl.i /*6*/:
                return "RESOLUTION_REQUIRED";
            case rl.h /*7*/:
                return "NETWORK_ERROR";
            case rl.j /*8*/:
                return "INTERNAL_ERROR";
            case rl.l /*9*/:
                return "SERVICE_INVALID";
            case rl.m /*10*/:
                return "DEVELOPER_ERROR";
            case rl.n /*11*/:
                return "LICENSE_CHECK_FAILED";
            case rk.i /*13*/:
                return "ERROR";
            case rk.bV /*14*/:
                return "INTERRUPTED";
            case rk.bY /*15*/:
                return "TIMEOUT";
            case rk.bX /*16*/:
                return "CANCELED";
            case rk.bZ /*17*/:
                return "API_NOT_CONNECTED";
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case 3001:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case 3002:
                return "AUTH_API_CLIENT_ERROR";
            case 3003:
                return "AUTH_API_SERVER_ERROR";
            case 3004:
                return "AUTH_TOKEN_ERROR";
            case 3005:
                return "AUTH_URL_RESOLUTION";
            default:
                return "unknown status code: " + i;
        }
    }

    public static int a(Parcel parcel) {
        return parcel.readInt();
    }

    public static int z(int i) {
        return 65535 & i;
    }

    public static int a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static void b(Parcel parcel, int i) {
        parcel.setDataPosition(a(parcel, i) + parcel.dataPosition());
    }

    public static void a(Parcel parcel, int i, int i2) {
        int a = a(parcel, i);
        if (a != i2) {
            throw new dd("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }

    public static void b(Parcel parcel, int i, int i2) {
        if (i != i2) {
            throw new dd("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
        }
    }

    public static int b(Parcel parcel) {
        int a = a(parcel);
        int a2 = a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (z(a) != 20293) {
            throw new dd("Expected object header. Got 0x" + Integer.toHexString(a), parcel);
        }
        a = dataPosition + a2;
        if (a >= dataPosition && a <= parcel.dataSize()) {
            return a;
        }
        throw new dd("Size read is invalid start=" + dataPosition + " end=" + a, parcel);
    }

    public static boolean c(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static short d(Parcel parcel, int i) {
        a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static int e(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer f(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        b(parcel, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long g(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long h(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        b(parcel, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static float i(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double j(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readDouble();
    }

    public static String k(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder l(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Parcelable a(Parcel parcel, int i, Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    public static Bundle m(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] n(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static byte[][] o(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + a);
        return bArr;
    }

    public static int[] p(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    public static String[] q(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static ArrayList r(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    public static ArrayList s(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static Object[] b(Parcel parcel, int i, Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static ArrayList c(Parcel parcel, int i, Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static void c(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static int t(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void u(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static int c(Parcel parcel) {
        return t(parcel, 20293);
    }

    public static void v(Parcel parcel, int i) {
        u(parcel, i);
    }

    public static void a(Parcel parcel, int i, boolean z) {
        c(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void a(Parcel parcel, int i, short s) {
        c(parcel, 3, 4);
        parcel.writeInt(s);
    }

    public static void d(Parcel parcel, int i, int i2) {
        c(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            c(parcel, i, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void a(Parcel parcel, int i, long j) {
        c(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            c(parcel, 3, 8);
            parcel.writeLong(l.longValue());
        }
    }

    public static void a(Parcel parcel, int i, float f) {
        c(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void a(Parcel parcel, int i, double d) {
        c(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int t = t(parcel, i);
            parcel.writeString(str);
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int t = t(parcel, i);
            parcel.writeStrongBinder(iBinder);
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int t = t(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int t = t(parcel, i);
            parcel.writeBundle(bundle);
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int t = t(parcel, i);
            parcel.writeByteArray(bArr);
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr != null) {
            int t = t(parcel, i);
            parcel.writeInt(r2);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int t = t(parcel, i);
            parcel.writeIntArray(iArr);
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int t = t(parcel, i);
            parcel.writeStringArray(strArr);
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int t = t(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            u(parcel, t);
        }
    }

    public static void b(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int t = t(parcel, i);
            parcel.writeStringList(list);
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2, boolean z) {
        if (parcelableArr != null) {
            int t = t(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, i2);
                }
            }
            u(parcel, t);
        }
    }

    public static void c(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int t = t(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, 0);
                }
            }
            u(parcel, t);
        }
    }

    public static void a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static String k(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case rq.b /*1*/:
                return resources.getString(cob.dW);
            case rq.c /*2*/:
            case 42:
                return resources.getString(cob.el);
            case rl.e /*3*/:
                return resources.getString(cob.dS);
            case rl.f /*4*/:
            case rl.i /*6*/:
                return null;
            case rl.g /*5*/:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return resources.getString(cob.dY);
            case rl.h /*7*/:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return resources.getString(cob.ea);
            case rl.j /*8*/:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case rl.l /*9*/:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(cob.ei);
            case rl.m /*10*/:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case rl.n /*11*/:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case rk.bX /*16*/:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case rk.bZ /*17*/:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return resources.getString(cob.ef);
            case rk.bW /*18*/:
                return resources.getString(cob.en);
            case rk.h /*20*/:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return resources.getString(cob.ed);
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
        }
    }

    public static String a(Context context, int i, String str) {
        Resources resources = context.getResources();
        switch (i) {
            case rq.b /*1*/:
                if (d(resources)) {
                    return resources.getString(cob.dV, new Object[]{str});
                }
                return resources.getString(cob.dU, new Object[]{str});
            case rq.c /*2*/:
                return resources.getString(cob.ek, new Object[]{str});
            case rl.e /*3*/:
                return resources.getString(cob.dR, new Object[]{str});
            case rl.g /*5*/:
                return resources.getString(cob.dX);
            case rl.h /*7*/:
                return resources.getString(cob.dZ);
            case rl.l /*9*/:
                return resources.getString(cob.eh, new Object[]{str});
            case rk.bX /*16*/:
                return resources.getString(cob.dP, new Object[]{str});
            case rk.bZ /*17*/:
                return resources.getString(cob.ee);
            case rk.bW /*18*/:
                return resources.getString(cob.em, new Object[]{str});
            case rk.h /*20*/:
                return resources.getString(cob.ec);
            case 42:
                return resources.getString(cob.eo);
            default:
                return resources.getString(cob.eg, new Object[]{str});
        }
    }

    public static String l(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case rq.b /*1*/:
                return resources.getString(cob.dT);
            case rq.c /*2*/:
                return resources.getString(cob.ej);
            case rl.e /*3*/:
                return resources.getString(cob.dQ);
            default:
                return resources.getString(17039370);
        }
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static bvn z(Object obj) {
        return new bvn(obj);
    }

    public static Object A(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static String n(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static Object d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int A(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void o(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void p(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static String a(WakeLock wakeLock, String str) {
        StringBuilder append = new StringBuilder().append(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return append.append(str).toString();
    }

    public static boolean j(Context context, String str) {
        try {
            return (context.getPackageManager().getApplicationInfo(str, 0).flags & 2097152) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean r() {
        return btq.a && cme.a() && cme.c == Process.myUid();
    }

    public static boolean d(Resources resources) {
        if (resources == null) {
            return false;
        }
        return (s() && ((resources.getConfiguration().screenLayout & 15) > 3)) || e(resources);
    }

    @TargetApi(13)
    public static boolean e(Resources resources) {
        Configuration configuration = resources.getConfiguration();
        return t() && (configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600;
    }

    @TargetApi(20)
    public static boolean V(Context context) {
        return y() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static boolean s() {
        return B(11);
    }

    public static boolean t() {
        return B(13);
    }

    public static boolean u() {
        return B(14);
    }

    public static boolean v() {
        return B(16);
    }

    public static boolean w() {
        return B(18);
    }

    public static boolean x() {
        return B(19);
    }

    public static boolean y() {
        return B(20);
    }

    public static boolean z() {
        return B(21);
    }

    public static boolean B(int i) {
        return VERSION.SDK_INT >= i;
    }

    public static String W(Context context) {
        return m(context, Binder.getCallingPid());
    }

    public static String m(Context context, int i) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static String e(int i, int i2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = i2 + 3;
        for (int i4 = 3; i4 < i3; i4++) {
            stringBuffer.append(a(stackTrace, i4)).append(" ");
        }
        return stringBuffer.toString();
    }

    public static String a(StackTraceElement[] stackTraceElementArr, int i) {
        if (i + 4 >= stackTraceElementArr.length) {
            return "<bottom of call stack>";
        }
        StackTraceElement stackTraceElement = stackTraceElementArr[i + 4];
        return stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
    }

    public static bwi[] A() {
        return new bwi[]{cdt.a[0], cdw.a[0], cct.a[0], cjs.a[0], bzf.a[0], cjd.a[0], ccw.a[0], bzy.a[0], cjp.a[0], cjg.a[0], ccn.a[0], cbf.a[0], cdf.a[0], byb.a[0], cbc.a[0], cdk.a[0], chf.a[0], bzv.a[0], cgf.a[0], cgi.a[0], cfw.a[0], byz.a[0], cak.a[0], cae.a[0], cah.a[0], cgc.a[0], chy.a[0], byt.a[0], byw.a[0], cbx.a[0], cat.a[0], cik.a[0], cik.a[1], byh.a[0], bxv.a[0], cib.a[0], chl.a[0], chc.a[0], caq.a[0], cev.a[0], cev.a[1], cab.a[0], can.a[0], byq.a[0], bxd.a[0], bzs.a[0], bxm.a[0], caz.a[0], cgo.a[0], cgz.a[0], cbu.a[0], cdq.a[0], chi.a[0], cek.a[0], cdc.a[0], cbr.a[0], bxb.a[0], bzm.a[0], ceh.a[0], cip.a[0], bxj.a[0], bzp.a[0], ccd.a[0], cen.a[0], cis.a[0], byn.a[0], caw.a[0], cfz.a[0], bxp.a[0], chq.a[0], cfr.a[0], cih.a[0], cbl.a[0], cfc.a[0], cja.a[0], cjm.a[0], cix.a[0], bxg.a[0], cca.a[0], bwy.a[0], cee.a[0], cck.a[0], cbi.a[0], cec.a[0], cfl.a[0], byk.a[0], cgl.a[0], cfi.a[0], bxs.a[0], cep.a[0], bzj.a[0], ccz.a[0], cff.a[0], cgw.a[0], cho.a[0], bye.a[0], ccq.a[0], cft.a[0], cbo.a[0], cgq.a[0], chw.a[0], cdh.a[0], bwm.a[0], bwv.a[0], cfo.a[0], bwp.a[0], ces.a[0], bxy.a[0], bws.a[0], bzc.a[0], ccg.a[0], cgt.a[0], cjv.a[0], cdn.a[0], cdz.a[0], cjj.a[0], bwj.a[0], cht.a[0], cez.a[0], cie.a[0]};
    }

    public static bwi[] B() {
        return a(cdt.a, cdw.a, civ.a, cct.a, cjs.a, bzf.a, cjd.a, ccw.a, bzy.a, cjp.a, cjg.a, ccn.a, cbf.a, cdf.a, byb.a, cbc.a, cdk.a, chf.a, bzv.a, cgf.a, cgi.a, cfw.a, byz.a, cak.a, cae.a, cah.a, cgc.a, chy.a, byt.a, byw.a, cbx.a, cat.a, cik.a, byh.a, bxv.a, cib.a, chl.a, chc.a, caq.a, cev.a, cab.a, can.a, byq.a, bxd.a, bzs.a, bxm.a, caz.a, cgo.a, cgz.a, cbu.a, cdq.a, chi.a, cek.a, cdc.a, cbr.a, bxb.a, bzm.a, ceh.a, cip.a, bxj.a, bzp.a, ccd.a, cen.a, cis.a, byn.a, caw.a, cfz.a, bxp.a, chq.a, cfr.a, cih.a, cbl.a, cfc.a, cja.a, cjm.a, cix.a, bxg.a, cca.a, bwy.a, cee.a, cck.a, cbi.a, cec.a, cfl.a, byk.a, cgl.a, cfi.a, bxs.a, cep.a, bzj.a, ccz.a, cff.a, cgw.a, cho.a, bye.a, ccq.a, cft.a, cbo.a, cgq.a, chw.a, cdh.a, bwm.a, bwv.a, cfo.a, bwp.a, ces.a, bxy.a, bws.a, bzc.a, ccg.a, cgt.a, cjv.a, cdn.a, cdz.a, cjj.a, bwj.a, cht.a, cez.a, cie.a);
    }

    public static bwi[] a(bwi[]... bwiArr) {
        int i = 0;
        for (bwi[] length : bwiArr) {
            i += length.length;
        }
        bwi[] bwiArr2 = new bwi[i];
        int length2 = bwiArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            bwi[] bwiArr3 = bwiArr[i2];
            i = i3;
            i3 = 0;
            while (i3 < bwiArr3.length) {
                int i4 = i + 1;
                bwiArr2[i] = bwiArr3[i3];
                i3++;
                i = i4;
            }
            i2++;
            i3 = i;
        }
        return bwiArr2;
    }

    public static Set a(bwi[] bwiArr) {
        Set hashSet = new HashSet(bwiArr.length);
        for (Object add : bwiArr) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public static Set C() {
        if (md == null) {
            md = a(B());
        }
        return md;
    }

    public static Set D() {
        if (me == null) {
            me = a(A());
        }
        return me;
    }

    public static String a(Context context, String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
        return new cmo(context).a(str, map, null);
    }

    public static String a(Context context, String str, Map map) {
        return a(context, str, map, null);
    }

    public static String a(cla cla) {
        if (cla == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a(null, (Object) cla, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    public static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof cla) {
            int modifiers;
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer).append(q(str)).append(" <\n");
                stringBuffer.append("  ");
            }
            Class cls = obj.getClass();
            for (Field field : cls.getFields()) {
                modifiers = field.getModifiers();
                String name = field.getName();
                if (!("cachedSize".equals(name) || (modifiers & 1) != 1 || (modifiers & 8) == 8 || name.startsWith("_") || name.endsWith("_"))) {
                    Class type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        a(name, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        a(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (modifiers = 0; modifiers < length2; modifiers++) {
                            a(name, Array.get(obj2, modifiers), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method name2 : cls.getMethods()) {
                String name3 = name2.getName();
                if (name3.startsWith("set")) {
                    String substring = name3.substring(3);
                    try {
                        if (((Boolean) cls.getMethod("has" + substring, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            try {
                                a(substring, cls.getMethod("get" + substring, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            } catch (NoSuchMethodException e) {
                            }
                        }
                    } catch (NoSuchMethodException e2) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer).append(">\n");
                return;
            }
            return;
        }
        stringBuffer2.append(stringBuffer).append(q(str)).append(": ");
        if (obj instanceof String) {
            stringBuffer2.append("\"").append(r((String) obj)).append("\"");
        } else if (obj instanceof byte[]) {
            a((byte[]) obj, stringBuffer2);
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    public static String q(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_').append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static String r(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = str.substring(0, 200) + "[...]";
        }
        return s(str);
    }

    public static String s(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    public static void a(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            int i = b & 255;
            if (i == 92 || i == 34) {
                stringBuffer.append('\\').append((char) i);
            } else if (i < 32 || i >= 127) {
                stringBuffer.append(String.format("\\%03o", new Object[]{Integer.valueOf(i)}));
            } else {
                stringBuffer.append((char) i);
            }
        }
        stringBuffer.append('\"');
    }

    public static dkq X(Context context) {
        return a(null, context);
    }

    public static dkq a(String str, Context context) {
        dkq dkq = new dkq();
        dkq.a = Long.valueOf(Process.getElapsedCpuTime());
        dkq.b = Boolean.valueOf(cwz.b(context));
        dkq.c = Integer.valueOf(Thread.activeCount());
        if (str != null) {
            dkq.d = str;
        }
        return dkq;
    }

    public static long E() {
        return SystemClock.elapsedRealtime();
    }

    public static cxc a(i iVar, cxe cxe, cxf cxf, int i, long j) {
        cvu cvu = cvu.c;
        return a(cvu.a(), iVar, cxe, cxf, 1000, 100);
    }

    public static cxc a(ScheduledExecutorService scheduledExecutorService, i iVar, cxe cxe, cxf cxf, int i, long j) {
        cxc cxh = new cxh(i, cxf);
        scheduledExecutorService.schedule(new cxd(iVar, cxh, cxe), j, TimeUnit.MILLISECONDS);
        return cxh;
    }

    public static CharSequence a(CharSequence charSequence, Object obj) {
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object B(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static boolean F() {
        if (mg == null) {
            mg = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == mg;
    }

    public static void G() {
        if (F()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static Object e(Object obj, Object obj2) {
        return obj != null ? obj : cob.i(obj2);
    }

    public static cyl C(Object obj) {
        return new cyl(obj.getClass().getSimpleName());
    }

    public static long H() {
        return System.nanoTime();
    }

    public static String a(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    public static cwm D(Object obj) {
        return new cyz(obj);
    }

    public static void f(Object obj, Object obj2) {
        String valueOf;
        if (obj == null) {
            valueOf = String.valueOf(obj2);
            throw new NullPointerException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("null key in entry: null=").append(valueOf).toString());
        } else if (obj2 == null) {
            valueOf = String.valueOf(obj);
            throw new NullPointerException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("null value in entry: ").append(valueOf).append("=null").toString());
        }
    }

    public static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 40).append(str).append(" cannot be negative but was: ").append(i).toString());
    }

    public static void e(boolean z) {
        cob.b(false, (Object) "no calls to next() since the last call to remove()");
    }

    public static int C(int i) {
        return 461845907 * Integer.rotateLeft(-862048943 * i, 15);
    }

    public static int E(Object obj) {
        return C(obj == null ? 0 : obj.hashCode());
    }

    public static int a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (1.2d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        highestOneBit <<= 1;
        if (highestOneBit > 0) {
            return highestOneBit;
        }
        return 1073741824;
    }

    public static String a(Iterable iterable) {
        return das.a(iterable.iterator());
    }

    public static Iterable a(Iterable iterable, cyh cyh) {
        cob.i((Object) iterable);
        cob.i((Object) cyh);
        return new czj(iterable, cyh);
    }

    public static ArrayList b(Object... objArr) {
        cob.i((Object) objArr);
        Object arrayList = new ArrayList(D(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int D(int i) {
        a(i, "arraySize");
        return f((5 + ((long) i)) + ((long) (i / 10)));
    }

    public static boolean a(List list, Object obj) {
        if (obj == cob.i((Object) list)) {
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
            return das.a(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!cob.a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int b(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return c(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (cob.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int c(List list, Object obj) {
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

    public static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (cob.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int e(List list, Object obj) {
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

    public static Object[] a(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    public static int a(Set set) {
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

    public static boolean a(Set set, Object obj) {
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

    public static int e(String str, int i) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 26).append(str).append(" (").append(i).append(") must be > 0").toString());
    }

    public static void f(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static int f(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return oe.INVALID_ID;
        }
        return (int) j;
    }

    public static int f(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static Executor I() {
        return dct.INSTANCE;
    }

    public static Object a(Future future) {
        Object obj;
        Object obj2 = null;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                obj2 = 1;
            } catch (Throwable th) {
                if (obj2 != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj2 != null) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Set J() {
        Set hashSet = new HashSet(57);
        hashSet.add(Integer.valueOf(7));
        hashSet.add(Integer.valueOf(27));
        hashSet.add(Integer.valueOf(30));
        hashSet.add(Integer.valueOf(31));
        hashSet.add(Integer.valueOf(34));
        hashSet.add(Integer.valueOf(36));
        hashSet.add(Integer.valueOf(43));
        hashSet.add(Integer.valueOf(44));
        hashSet.add(Integer.valueOf(49));
        hashSet.add(Integer.valueOf(54));
        hashSet.add(Integer.valueOf(55));
        hashSet.add(Integer.valueOf(58));
        hashSet.add(Integer.valueOf(61));
        hashSet.add(Integer.valueOf(62));
        hashSet.add(Integer.valueOf(63));
        hashSet.add(Integer.valueOf(66));
        hashSet.add(Integer.valueOf(81));
        hashSet.add(Integer.valueOf(84));
        hashSet.add(Integer.valueOf(90));
        hashSet.add(Integer.valueOf(91));
        hashSet.add(Integer.valueOf(94));
        hashSet.add(Integer.valueOf(95));
        hashSet.add(Integer.valueOf(255));
        hashSet.add(Integer.valueOf(350));
        hashSet.add(Integer.valueOf(351));
        hashSet.add(Integer.valueOf(352));
        hashSet.add(Integer.valueOf(358));
        hashSet.add(Integer.valueOf(359));
        hashSet.add(Integer.valueOf(372));
        hashSet.add(Integer.valueOf(373));
        hashSet.add(Integer.valueOf(380));
        hashSet.add(Integer.valueOf(381));
        hashSet.add(Integer.valueOf(385));
        hashSet.add(Integer.valueOf(505));
        hashSet.add(Integer.valueOf(506));
        hashSet.add(Integer.valueOf(595));
        hashSet.add(Integer.valueOf(675));
        hashSet.add(Integer.valueOf(676));
        hashSet.add(Integer.valueOf(679));
        hashSet.add(Integer.valueOf(855));
        hashSet.add(Integer.valueOf(971));
        hashSet.add(Integer.valueOf(972));
        hashSet.add(Integer.valueOf(995));
        return hashSet;
    }

    public static Map K() {
        Map hashMap = new HashMap(285);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(Integer.valueOf(1), arrayList);
        arrayList = new ArrayList(2);
        arrayList.add("RU");
        arrayList.add("KZ");
        hashMap.put(Integer.valueOf(7), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("EG");
        hashMap.put(Integer.valueOf(20), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ZA");
        hashMap.put(Integer.valueOf(27), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GR");
        hashMap.put(Integer.valueOf(30), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NL");
        hashMap.put(Integer.valueOf(31), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BE");
        hashMap.put(Integer.valueOf(32), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("FR");
        hashMap.put(Integer.valueOf(33), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ES");
        hashMap.put(Integer.valueOf(34), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("HU");
        hashMap.put(Integer.valueOf(36), arrayList);
        arrayList = new ArrayList(2);
        arrayList.add("IT");
        arrayList.add("VA");
        hashMap.put(Integer.valueOf(39), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("RO");
        hashMap.put(Integer.valueOf(40), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CH");
        hashMap.put(Integer.valueOf(41), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AT");
        hashMap.put(Integer.valueOf(43), arrayList);
        arrayList = new ArrayList(4);
        arrayList.add("GB");
        arrayList.add("GG");
        arrayList.add("IM");
        arrayList.add("JE");
        hashMap.put(Integer.valueOf(44), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("DK");
        hashMap.put(Integer.valueOf(45), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SE");
        hashMap.put(Integer.valueOf(46), arrayList);
        arrayList = new ArrayList(2);
        arrayList.add("NO");
        arrayList.add("SJ");
        hashMap.put(Integer.valueOf(47), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PL");
        hashMap.put(Integer.valueOf(48), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("DE");
        hashMap.put(Integer.valueOf(49), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PE");
        hashMap.put(Integer.valueOf(51), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MX");
        hashMap.put(Integer.valueOf(52), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CU");
        hashMap.put(Integer.valueOf(53), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AR");
        hashMap.put(Integer.valueOf(54), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BR");
        hashMap.put(Integer.valueOf(55), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CL");
        hashMap.put(Integer.valueOf(56), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CO");
        hashMap.put(Integer.valueOf(57), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("VE");
        hashMap.put(Integer.valueOf(58), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MY");
        hashMap.put(Integer.valueOf(60), arrayList);
        arrayList = new ArrayList(3);
        arrayList.add("AU");
        arrayList.add("CC");
        arrayList.add("CX");
        hashMap.put(Integer.valueOf(61), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ID");
        hashMap.put(Integer.valueOf(62), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PH");
        hashMap.put(Integer.valueOf(63), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NZ");
        hashMap.put(Integer.valueOf(64), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SG");
        hashMap.put(Integer.valueOf(65), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TH");
        hashMap.put(Integer.valueOf(66), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("JP");
        hashMap.put(Integer.valueOf(81), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("KR");
        hashMap.put(Integer.valueOf(82), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("VN");
        hashMap.put(Integer.valueOf(84), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CN");
        hashMap.put(Integer.valueOf(86), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TR");
        hashMap.put(Integer.valueOf(90), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("IN");
        hashMap.put(Integer.valueOf(91), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PK");
        hashMap.put(Integer.valueOf(92), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AF");
        hashMap.put(Integer.valueOf(93), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LK");
        hashMap.put(Integer.valueOf(94), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MM");
        hashMap.put(Integer.valueOf(95), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("IR");
        hashMap.put(Integer.valueOf(98), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SS");
        hashMap.put(Integer.valueOf(211), arrayList);
        arrayList = new ArrayList(2);
        arrayList.add("MA");
        arrayList.add("EH");
        hashMap.put(Integer.valueOf(212), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("DZ");
        hashMap.put(Integer.valueOf(213), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TN");
        hashMap.put(Integer.valueOf(216), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LY");
        hashMap.put(Integer.valueOf(218), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GM");
        hashMap.put(Integer.valueOf(220), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SN");
        hashMap.put(Integer.valueOf(221), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MR");
        hashMap.put(Integer.valueOf(222), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ML");
        hashMap.put(Integer.valueOf(223), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GN");
        hashMap.put(Integer.valueOf(224), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CI");
        hashMap.put(Integer.valueOf(225), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BF");
        hashMap.put(Integer.valueOf(226), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NE");
        hashMap.put(Integer.valueOf(227), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TG");
        hashMap.put(Integer.valueOf(228), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BJ");
        hashMap.put(Integer.valueOf(229), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MU");
        hashMap.put(Integer.valueOf(230), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LR");
        hashMap.put(Integer.valueOf(231), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SL");
        hashMap.put(Integer.valueOf(232), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GH");
        hashMap.put(Integer.valueOf(233), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NG");
        hashMap.put(Integer.valueOf(234), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TD");
        hashMap.put(Integer.valueOf(235), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CF");
        hashMap.put(Integer.valueOf(236), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CM");
        hashMap.put(Integer.valueOf(237), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CV");
        hashMap.put(Integer.valueOf(238), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ST");
        hashMap.put(Integer.valueOf(239), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GQ");
        hashMap.put(Integer.valueOf(240), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GA");
        hashMap.put(Integer.valueOf(241), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CG");
        hashMap.put(Integer.valueOf(242), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CD");
        hashMap.put(Integer.valueOf(243), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AO");
        hashMap.put(Integer.valueOf(244), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GW");
        hashMap.put(Integer.valueOf(245), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("IO");
        hashMap.put(Integer.valueOf(246), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AC");
        hashMap.put(Integer.valueOf(247), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SC");
        hashMap.put(Integer.valueOf(248), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SD");
        hashMap.put(Integer.valueOf(249), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("RW");
        hashMap.put(Integer.valueOf(250), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ET");
        hashMap.put(Integer.valueOf(251), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SO");
        hashMap.put(Integer.valueOf(252), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("DJ");
        hashMap.put(Integer.valueOf(253), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("KE");
        hashMap.put(Integer.valueOf(254), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TZ");
        hashMap.put(Integer.valueOf(255), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("UG");
        hashMap.put(Integer.valueOf(256), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BI");
        hashMap.put(Integer.valueOf(257), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MZ");
        hashMap.put(Integer.valueOf(258), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ZM");
        hashMap.put(Integer.valueOf(260), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MG");
        hashMap.put(Integer.valueOf(261), arrayList);
        arrayList = new ArrayList(2);
        arrayList.add("RE");
        arrayList.add("YT");
        hashMap.put(Integer.valueOf(262), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ZW");
        hashMap.put(Integer.valueOf(263), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NA");
        hashMap.put(Integer.valueOf(264), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MW");
        hashMap.put(Integer.valueOf(265), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LS");
        hashMap.put(Integer.valueOf(266), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BW");
        hashMap.put(Integer.valueOf(267), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SZ");
        hashMap.put(Integer.valueOf(268), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("KM");
        hashMap.put(Integer.valueOf(269), arrayList);
        arrayList = new ArrayList(2);
        arrayList.add("SH");
        arrayList.add("TA");
        hashMap.put(Integer.valueOf(290), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ER");
        hashMap.put(Integer.valueOf(291), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AW");
        hashMap.put(Integer.valueOf(297), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("FO");
        hashMap.put(Integer.valueOf(298), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GL");
        hashMap.put(Integer.valueOf(299), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GI");
        hashMap.put(Integer.valueOf(350), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PT");
        hashMap.put(Integer.valueOf(351), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LU");
        hashMap.put(Integer.valueOf(352), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("IE");
        hashMap.put(Integer.valueOf(353), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("IS");
        hashMap.put(Integer.valueOf(354), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AL");
        hashMap.put(Integer.valueOf(355), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MT");
        hashMap.put(Integer.valueOf(356), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CY");
        hashMap.put(Integer.valueOf(357), arrayList);
        arrayList = new ArrayList(2);
        arrayList.add("FI");
        arrayList.add("AX");
        hashMap.put(Integer.valueOf(358), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BG");
        hashMap.put(Integer.valueOf(359), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LT");
        hashMap.put(Integer.valueOf(370), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LV");
        hashMap.put(Integer.valueOf(371), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("EE");
        hashMap.put(Integer.valueOf(372), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MD");
        hashMap.put(Integer.valueOf(373), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AM");
        hashMap.put(Integer.valueOf(374), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BY");
        hashMap.put(Integer.valueOf(375), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AD");
        hashMap.put(Integer.valueOf(376), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MC");
        hashMap.put(Integer.valueOf(377), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SM");
        hashMap.put(Integer.valueOf(378), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("UA");
        hashMap.put(Integer.valueOf(380), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("RS");
        hashMap.put(Integer.valueOf(381), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("ME");
        hashMap.put(Integer.valueOf(382), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("HR");
        hashMap.put(Integer.valueOf(385), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SI");
        hashMap.put(Integer.valueOf(386), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BA");
        hashMap.put(Integer.valueOf(387), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MK");
        hashMap.put(Integer.valueOf(389), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CZ");
        hashMap.put(Integer.valueOf(420), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SK");
        hashMap.put(Integer.valueOf(421), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LI");
        hashMap.put(Integer.valueOf(423), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("FK");
        hashMap.put(Integer.valueOf(500), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BZ");
        hashMap.put(Integer.valueOf(501), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GT");
        hashMap.put(Integer.valueOf(502), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SV");
        hashMap.put(Integer.valueOf(503), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("HN");
        hashMap.put(Integer.valueOf(504), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NI");
        hashMap.put(Integer.valueOf(505), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CR");
        hashMap.put(Integer.valueOf(506), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PA");
        hashMap.put(Integer.valueOf(507), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PM");
        hashMap.put(Integer.valueOf(508), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("HT");
        hashMap.put(Integer.valueOf(509), arrayList);
        arrayList = new ArrayList(3);
        arrayList.add("GP");
        arrayList.add("BL");
        arrayList.add("MF");
        hashMap.put(Integer.valueOf(590), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BO");
        hashMap.put(Integer.valueOf(591), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GY");
        hashMap.put(Integer.valueOf(592), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("EC");
        hashMap.put(Integer.valueOf(593), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GF");
        hashMap.put(Integer.valueOf(594), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PY");
        hashMap.put(Integer.valueOf(595), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MQ");
        hashMap.put(Integer.valueOf(596), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SR");
        hashMap.put(Integer.valueOf(597), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("UY");
        hashMap.put(Integer.valueOf(598), arrayList);
        arrayList = new ArrayList(2);
        arrayList.add("CW");
        arrayList.add("BQ");
        hashMap.put(Integer.valueOf(599), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TL");
        hashMap.put(Integer.valueOf(670), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NF");
        hashMap.put(Integer.valueOf(672), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BN");
        hashMap.put(Integer.valueOf(673), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NR");
        hashMap.put(Integer.valueOf(674), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PG");
        hashMap.put(Integer.valueOf(675), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TO");
        hashMap.put(Integer.valueOf(676), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SB");
        hashMap.put(Integer.valueOf(677), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("VU");
        hashMap.put(Integer.valueOf(678), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("FJ");
        hashMap.put(Integer.valueOf(679), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PW");
        hashMap.put(Integer.valueOf(680), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("WF");
        hashMap.put(Integer.valueOf(681), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("CK");
        hashMap.put(Integer.valueOf(682), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NU");
        hashMap.put(Integer.valueOf(683), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("WS");
        hashMap.put(Integer.valueOf(685), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("KI");
        hashMap.put(Integer.valueOf(686), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NC");
        hashMap.put(Integer.valueOf(687), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TV");
        hashMap.put(Integer.valueOf(688), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PF");
        hashMap.put(Integer.valueOf(689), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TK");
        hashMap.put(Integer.valueOf(690), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("FM");
        hashMap.put(Integer.valueOf(691), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MH");
        hashMap.put(Integer.valueOf(692), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("001");
        hashMap.put(Integer.valueOf(800), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("001");
        hashMap.put(Integer.valueOf(808), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("KP");
        hashMap.put(Integer.valueOf(850), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("HK");
        hashMap.put(Integer.valueOf(852), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MO");
        hashMap.put(Integer.valueOf(853), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("KH");
        hashMap.put(Integer.valueOf(855), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LA");
        hashMap.put(Integer.valueOf(856), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("001");
        hashMap.put(Integer.valueOf(870), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("001");
        hashMap.put(Integer.valueOf(878), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BD");
        hashMap.put(Integer.valueOf(880), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("001");
        hashMap.put(Integer.valueOf(881), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("001");
        hashMap.put(Integer.valueOf(882), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("001");
        hashMap.put(Integer.valueOf(883), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TW");
        hashMap.put(Integer.valueOf(886), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("001");
        hashMap.put(Integer.valueOf(888), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MV");
        hashMap.put(Integer.valueOf(960), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("LB");
        hashMap.put(Integer.valueOf(961), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("JO");
        hashMap.put(Integer.valueOf(962), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SY");
        hashMap.put(Integer.valueOf(963), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("IQ");
        hashMap.put(Integer.valueOf(964), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("KW");
        hashMap.put(Integer.valueOf(965), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SA");
        hashMap.put(Integer.valueOf(966), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("YE");
        hashMap.put(Integer.valueOf(967), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("OM");
        hashMap.put(Integer.valueOf(968), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("PS");
        hashMap.put(Integer.valueOf(970), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AE");
        hashMap.put(Integer.valueOf(971), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("IL");
        hashMap.put(Integer.valueOf(972), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BH");
        hashMap.put(Integer.valueOf(973), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("QA");
        hashMap.put(Integer.valueOf(974), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BT");
        hashMap.put(Integer.valueOf(975), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("MN");
        hashMap.put(Integer.valueOf(976), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("NP");
        hashMap.put(Integer.valueOf(977), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("001");
        hashMap.put(Integer.valueOf(979), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TJ");
        hashMap.put(Integer.valueOf(992), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("TM");
        hashMap.put(Integer.valueOf(993), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("AZ");
        hashMap.put(Integer.valueOf(994), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GE");
        hashMap.put(Integer.valueOf(995), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("KG");
        hashMap.put(Integer.valueOf(996), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("UZ");
        hashMap.put(Integer.valueOf(998), arrayList);
        return hashMap;
    }

    public static Set L() {
        Set hashSet = new HashSet(317);
        hashSet.add("AC");
        hashSet.add("AD");
        hashSet.add("AE");
        hashSet.add("AF");
        hashSet.add("AG");
        hashSet.add("AI");
        hashSet.add("AL");
        hashSet.add("AM");
        hashSet.add("AO");
        hashSet.add("AR");
        hashSet.add("AS");
        hashSet.add("AT");
        hashSet.add("AU");
        hashSet.add("AW");
        hashSet.add("AX");
        hashSet.add("AZ");
        hashSet.add("BA");
        hashSet.add("BB");
        hashSet.add("BD");
        hashSet.add("BE");
        hashSet.add("BF");
        hashSet.add("BG");
        hashSet.add("BH");
        hashSet.add("BI");
        hashSet.add("BJ");
        hashSet.add("BL");
        hashSet.add("BM");
        hashSet.add("BN");
        hashSet.add("BO");
        hashSet.add("BQ");
        hashSet.add("BR");
        hashSet.add("BS");
        hashSet.add("BT");
        hashSet.add("BW");
        hashSet.add("BY");
        hashSet.add("BZ");
        hashSet.add("CA");
        hashSet.add("CC");
        hashSet.add("CD");
        hashSet.add("CF");
        hashSet.add("CG");
        hashSet.add("CH");
        hashSet.add("CI");
        hashSet.add("CK");
        hashSet.add("CL");
        hashSet.add("CM");
        hashSet.add("CN");
        hashSet.add("CO");
        hashSet.add("CR");
        hashSet.add("CU");
        hashSet.add("CV");
        hashSet.add("CW");
        hashSet.add("CX");
        hashSet.add("CY");
        hashSet.add("CZ");
        hashSet.add("DE");
        hashSet.add("DJ");
        hashSet.add("DK");
        hashSet.add("DM");
        hashSet.add("DO");
        hashSet.add("DZ");
        hashSet.add("EC");
        hashSet.add("EE");
        hashSet.add("EG");
        hashSet.add("EH");
        hashSet.add("ER");
        hashSet.add("ES");
        hashSet.add("ET");
        hashSet.add("FI");
        hashSet.add("FJ");
        hashSet.add("FK");
        hashSet.add("FM");
        hashSet.add("FO");
        hashSet.add("FR");
        hashSet.add("GA");
        hashSet.add("GB");
        hashSet.add("GD");
        hashSet.add("GE");
        hashSet.add("GF");
        hashSet.add("GG");
        hashSet.add("GH");
        hashSet.add("GI");
        hashSet.add("GL");
        hashSet.add("GM");
        hashSet.add("GN");
        hashSet.add("GP");
        hashSet.add("GR");
        hashSet.add("GT");
        hashSet.add("GU");
        hashSet.add("GW");
        hashSet.add("GY");
        hashSet.add("HK");
        hashSet.add("HN");
        hashSet.add("HR");
        hashSet.add("HT");
        hashSet.add("HU");
        hashSet.add("ID");
        hashSet.add("IE");
        hashSet.add("IL");
        hashSet.add("IM");
        hashSet.add("IN");
        hashSet.add("IQ");
        hashSet.add("IR");
        hashSet.add("IS");
        hashSet.add("IT");
        hashSet.add("JE");
        hashSet.add("JM");
        hashSet.add("JO");
        hashSet.add("JP");
        hashSet.add("KE");
        hashSet.add("KG");
        hashSet.add("KH");
        hashSet.add("KI");
        hashSet.add("KM");
        hashSet.add("KN");
        hashSet.add("KP");
        hashSet.add("KR");
        hashSet.add("KW");
        hashSet.add("KY");
        hashSet.add("KZ");
        hashSet.add("LA");
        hashSet.add("LB");
        hashSet.add("LC");
        hashSet.add("LI");
        hashSet.add("LK");
        hashSet.add("LR");
        hashSet.add("LS");
        hashSet.add("LT");
        hashSet.add("LU");
        hashSet.add("LV");
        hashSet.add("LY");
        hashSet.add("MA");
        hashSet.add("MC");
        hashSet.add("MD");
        hashSet.add("ME");
        hashSet.add("MF");
        hashSet.add("MG");
        hashSet.add("MH");
        hashSet.add("MK");
        hashSet.add("ML");
        hashSet.add("MM");
        hashSet.add("MN");
        hashSet.add("MO");
        hashSet.add("MP");
        hashSet.add("MQ");
        hashSet.add("MR");
        hashSet.add("MS");
        hashSet.add("MT");
        hashSet.add("MU");
        hashSet.add("MV");
        hashSet.add("MW");
        hashSet.add("MX");
        hashSet.add("MY");
        hashSet.add("MZ");
        hashSet.add("NA");
        hashSet.add("NC");
        hashSet.add("NE");
        hashSet.add("NF");
        hashSet.add("NG");
        hashSet.add("NI");
        hashSet.add("NL");
        hashSet.add("NO");
        hashSet.add("NP");
        hashSet.add("NR");
        hashSet.add("NU");
        hashSet.add("NZ");
        hashSet.add("OM");
        hashSet.add("PA");
        hashSet.add("PE");
        hashSet.add("PF");
        hashSet.add("PG");
        hashSet.add("PH");
        hashSet.add("PK");
        hashSet.add("PL");
        hashSet.add("PM");
        hashSet.add("PR");
        hashSet.add("PT");
        hashSet.add("PW");
        hashSet.add("PY");
        hashSet.add("QA");
        hashSet.add("RE");
        hashSet.add("RO");
        hashSet.add("RS");
        hashSet.add("RU");
        hashSet.add("RW");
        hashSet.add("SA");
        hashSet.add("SB");
        hashSet.add("SC");
        hashSet.add("SD");
        hashSet.add("SE");
        hashSet.add("SG");
        hashSet.add("SH");
        hashSet.add("SI");
        hashSet.add("SJ");
        hashSet.add("SK");
        hashSet.add("SL");
        hashSet.add("SM");
        hashSet.add("SN");
        hashSet.add("SO");
        hashSet.add("SR");
        hashSet.add("ST");
        hashSet.add("SV");
        hashSet.add("SX");
        hashSet.add("SY");
        hashSet.add("SZ");
        hashSet.add("TC");
        hashSet.add("TD");
        hashSet.add("TG");
        hashSet.add("TH");
        hashSet.add("TJ");
        hashSet.add("TL");
        hashSet.add("TM");
        hashSet.add("TN");
        hashSet.add("TO");
        hashSet.add("TR");
        hashSet.add("TT");
        hashSet.add("TV");
        hashSet.add("TW");
        hashSet.add("TZ");
        hashSet.add("UA");
        hashSet.add("UG");
        hashSet.add("US");
        hashSet.add("UY");
        hashSet.add("UZ");
        hashSet.add("VA");
        hashSet.add("VC");
        hashSet.add("VE");
        hashSet.add("VG");
        hashSet.add("VI");
        hashSet.add("VN");
        hashSet.add("VU");
        hashSet.add("WF");
        hashSet.add("WS");
        hashSet.add("YE");
        hashSet.add("YT");
        hashSet.add("ZA");
        hashSet.add("ZM");
        hashSet.add("ZW");
        return hashSet;
    }

    public static String a(dem dem) {
        String str;
        String valueOf;
        if (dem == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            b(null, (Object) dem, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            str = "Error printing proto: ";
            valueOf = String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (InvocationTargetException e2) {
            str = "Error printing proto: ";
            valueOf = String.valueOf(e2.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
    }

    public static void b(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof dem) {
            int modifiers;
            String name;
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer).append(t(str)).append(" <\n");
                stringBuffer.append("  ");
            }
            Class cls = obj.getClass();
            for (Field field : cls.getFields()) {
                modifiers = field.getModifiers();
                name = field.getName();
                if (!("cachedSize".equals(name) || (modifiers & 1) != 1 || (modifiers & 8) == 8 || name.startsWith("_") || name.endsWith("_"))) {
                    Class type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        b(name, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        b(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (modifiers = 0; modifiers < length2; modifiers++) {
                            b(name, Array.get(obj2, modifiers), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method name2 : cls.getMethods()) {
                String name3 = name2.getName();
                if (name3.startsWith("set")) {
                    String substring = name3.substring(3);
                    try {
                        name = "has";
                        name3 = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(name3.length() != 0 ? name.concat(name3) : new String(name), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            try {
                                name = "get";
                                name3 = String.valueOf(substring);
                                b(substring, cls.getMethod(name3.length() != 0 ? name.concat(name3) : new String(name), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            } catch (NoSuchMethodException e) {
                            }
                        }
                    } catch (NoSuchMethodException e2) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer).append(">\n");
                return;
            }
            return;
        }
        stringBuffer2.append(stringBuffer).append(t(str)).append(": ");
        if (obj instanceof String) {
            stringBuffer2.append("\"").append(u((String) obj)).append("\"");
        } else if (obj instanceof byte[]) {
            b((byte[]) obj, stringBuffer2);
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    public static String t(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_').append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static String u(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = String.valueOf(str.substring(0, 200)).concat("[...]");
        }
        return v(str);
    }

    public static String v(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    public static void b(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            int i = b & 255;
            if (i == 92 || i == 34) {
                stringBuffer.append('\\').append((char) i);
            } else if (i < 32 || i >= 127) {
                stringBuffer.append(String.format("\\%03o", new Object[]{Integer.valueOf(i)}));
            } else {
                stringBuffer.append((char) i);
            }
        }
        stringBuffer.append('\"');
    }

    public static dhn a(dfr dfr) {
        cob.b((Object) dfr, (Object) "context must not be null");
        if (!dfr.c()) {
            return null;
        }
        Throwable d = dfr.d();
        if (d == null) {
            return dhn.c;
        }
        if (d instanceof TimeoutException) {
            return dhn.e.a(d.getMessage()).b(d);
        }
        dhn a = dhn.a(d);
        if (dhp.UNKNOWN.equals(a.m) && a.o == d) {
            return dhn.c.b(d);
        }
        return a.b(d);
    }

    public static boolean a(dkf dkf, int i) {
        return dkf.a(i);
    }

    public static int b(dkf dkf, int i) {
        return dkf.d[i];
    }

    public static dgr b(List list) {
        return new dgr(d(list));
    }

    public static dgr c(List list) {
        return new dgr(d(list));
    }

    public static byte[][] d(List list) {
        byte[][] bArr = new byte[(list.size() << 1)][];
        int i = 0;
        for (dju dju : list) {
            int i2 = i + 1;
            bArr[i] = dju.f.d();
            i = i2 + 1;
            bArr[i2] = dju.g.d();
        }
        return ch.a(bArr);
    }

    public static dje a(dey dey) {
        int i = 0;
        List b = dey.b();
        String[] strArr = new String[b.size()];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = ((dfa) b.get(i2)).d;
        }
        List a = dey.a();
        djd[] djdArr = new djd[a.size()];
        while (i < djdArr.length) {
            djdArr[i] = djd.a(((dex) a.get(i)).name());
            i++;
        }
        return new djf(dey.b).a(dey.c).b(strArr).a(djdArr).a();
    }

    public static dhd a(dkh dkh) {
        return new dkj(dkh);
    }

    public static dfj a(dgr dgr) {
        return new dfj(dgr);
    }
}
