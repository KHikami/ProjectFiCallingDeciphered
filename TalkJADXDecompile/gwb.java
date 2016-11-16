import android.accounts.Account;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.FragmentManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.nfc.NdefMessage;
import android.opengl.GLES20;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.OperationCanceledException;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.ContactsContract.Contacts;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Files;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.provider.Telephony.Sms;
import android.support.design.widget.CoordinatorLayout;
import android.telecom.AudioState;
import android.telecom.ConnectionRequest;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import android.text.TextUtils.StringSplitter;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TtsSpan.DigitsBuilder;
import android.text.style.TtsSpan.TextBuilder;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.StateSet;
import android.util.Xml;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SubMenu;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.BaseSavedState;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.OverScroller;
import android.widget.PopupWindow;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.callerid.impl.CallerIdPromoActivity;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutSupportInitializationActivity;
import com.google.android.apps.hangouts.hangout.HangoutUtils$JoinedHangoutReceiver;
import com.google.android.apps.hangouts.hangout.InCallDialpadActivity;
import com.google.android.apps.hangouts.hangout.IncomingRing.NotificationActionReceiver;
import com.google.android.apps.hangouts.phone.AccountSelectionActivity;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;
import com.google.android.apps.hangouts.phone.ArchivedConversationListActivity;
import com.google.android.apps.hangouts.phone.BabelPhotoViewActivity;
import com.google.android.apps.hangouts.phone.BlockedContactsActivity;
import com.google.android.apps.hangouts.phone.CallContactPickerActivity;
import com.google.android.apps.hangouts.phone.ConversationActivity;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.phone.EditAudienceActivity;
import com.google.android.apps.hangouts.phone.GoogleVoiceTermsOfServiceActivity;
import com.google.android.apps.hangouts.phone.HiddenContactsActivity;
import com.google.android.apps.hangouts.phone.InvitationActivity;
import com.google.android.apps.hangouts.phone.ShareIntentActivity;
import com.google.android.apps.hangouts.phone.ShowDialerActivity;
import com.google.android.apps.hangouts.phone.SmsAccountPickerActivity;
import com.google.android.apps.hangouts.phone.SmsStorageLowWarningActivity;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;
import com.google.android.apps.hangouts.settings.SettingsActivity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import com.google.android.apps.hangouts.telephony.TeleFeedback$FeedbackActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wearable.Asset;
import com.google.api.client.http.HttpStatusCodes;
import dalvik.system.DexFile;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.jar.JarFile;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.chromium.net.CronetEngine;
import org.chromium.net.RequestFinishedInfo$Listener;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Deprecated
public class gwb implements gub { // gub is empty, and extends interface gua, which is also empty?
    public static final int A = 2130772199;
    public static final int Aa = 2131363318;
    public static final int Ab = 2131363317;
    public static Method Ac = null;
    public static volatile Thread Ad = null;
    public static volatile Handler Ae = null;
    public static String Af = null;
    public static final int B = 2130772200;
    public static final int C = 2130772277;
    public static final int D = 2130772280;
    public static final int E = 2130772403;
    public static final int F = 2130772285;
    public static final int G = 2130772286;
    public static final int H = 2130772288;
    public static final int I = 2130772269;
    public static final int J = 2130772273;
    public static final int K = 2130772271;
    public static final int L = 2130772272;
    public static final int M = 2130772270;
    public static final int N = 2130772267;
    public static final int O = 2130772227;
    public static final int P = 2130772383;
    public static final int Q = 2130772259;
    public static final int R = 2130772290;
    public static final int S = 2130772233;
    public static final int T = 2130772249;
    public static final int U = 2130772298;
    public static final int V = 2130772260;
    public static final int W = 2130772265;
    public static final int X = 2130772291;
    public static final int Y = 2130772292;
    public static final int Z = 2130772295;
    public static final int aA = 2130837519;
    public static final int aB = 2130837520;
    public static final int aC = 2130837521;
    public static final int aD = 2130837523;
    public static final int aE = 2130837524;
    public static final int aF = 2130837528;
    public static final int aG = 2130837530;
    public static final int aH = 2130837531;
    public static final int aI = 2130837533;
    public static final int aJ = 2130837534;
    public static final int aK = 2130837535;
    public static final int aL = 2130837546;
    public static final int aM = 2130837557;
    public static final int aN = 2130837558;
    public static final int aO = 2130837559;
    public static final int aP = 2130837560;
    public static final int aQ = 2130837561;
    public static final int aR = 2130837567;
    public static final int aS = 2130837568;
    public static final int aT = 2130837569;
    public static final int aU = 2130837570;
    public static final int aV = 2130837571;
    public static final int aW = 2130837572;
    public static final int aX = 2130837573;
    public static final int aY = 2130837574;
    public static final int aZ = 2130837576;
    public static final int aa = 2130772296;
    public static final int ab = 2130772297;
    public static final int ac = 2130772244;
    public static final int ad = 2130772243;
    public static final int ae = 2131755010;
    public static final int af = 2131755011;
    public static final int ag = 2131624462;
    public static final int ah = 2131624659;
    public static final int ai = 2131624660;
    public static final int aj = 2131624661;
    public static final int ak = 2131624662;
    public static final int al = 2131624663;
    public static final int am = 2131624664;
    public static final int an = 2131624665;
    public static final int ao = 2131427686;
    public static final int ap = 2131427685;
    public static final int aq = 2131427716;
    public static final int ar = 2131427684;
    public static final int as = 2131427690;
    public static final int at = 2131427689;
    public static final int au = 2130837506;
    public static final int av = 2130837508;
    public static final int aw = 2130837509;
    public static final int ax = 2130837512;
    public static final int ay = 2130837513;
    public static final int az = 2130837514;
    public static final int bA = 2131558602;
    public static final int bB = 2131558610;
    public static final int bC = 2131558607;
    public static final int bD = 2131558608;
    public static final int bE = 2131558615;
    public static final int bF = 2131558601;
    public static final int bG = 2131558467;
    public static final int bH = 2131558617;
    public static final int bI = 2131558609;
    public static final int bJ = 2131558599;
    public static final int bK = 2131558604;
    public static final int bL = 2131558603;
    public static final int bM = 2130968576;
    public static final int bN = 2130968579;
    public static final int bO = 2130968580;
    public static final int bP = 2130968582;
    public static final int bQ = 2130968584;
    public static final int bR = 2130968587;
    public static final int bS = 2130968588;
    public static final int bT = 2130968589;
    public static final int bU = 2130968590;
    public static final int bV = 2130968591;
    public static final int bW = 2130968592;
    public static final int bX = 2130968593;
    public static final int bY = 2130968594;
    public static final int bZ = 2130968596;
    public static final int ba = 2130837577;
    public static final int bb = 2130837578;
    public static final int bc = 2130837579;
    public static final int bd = 2130837580;
    public static final int be = 2130837581;
    public static final int bf = 2130837582;
    public static final int bg = 2130837583;
    public static final int bh = 2130837584;
    public static final int bi = 2130837585;
    public static final int bj = 2131558623;
    public static final int bk = 2131558466;
    public static final int bl = 2131558622;
    public static final int bm = 2131558591;
    public static final int bn = 2131558590;
    public static final int bo = 2131558624;
    public static final int bp = 2131558469;
    public static final int bq = 2131558619;
    public static final int br = 2131558592;
    public static final int bs = 2131558605;
    public static final int bt = 2131558600;
    public static final int bu = 2131558606;
    public static final int bv = 2131558612;
    public static final int bw = 2131558611;
    public static final int bx = 2131558621;
    public static final int by = 2131558598;
    public static final int bz = 2131558597;
    public static final int cA = 2131559227;
    public static final int cB = 2131559230;
    public static final int cC = 2131559235;
    public static final int cD = 2131559236;
    public static final int cE = 2131559234;
    public static final int cF = 2131559229;
    public static final int cG = 2131559240;
    public static final int cH = 2131689506;
    public static final int cI = 2130968862;
    public static final int cJ = 2130968863;
    public static final int cK = 2131362422;
    public static final int cL = 2131362420;
    public static final int cM = 2131362423;
    public static final int cN = 2131363295;
    public static final int cO = 2131363294;
    public static final int cP = 2131363293;
    public static final int cQ = 2131363296;
    public static final int cR = 2131363292;
    public static final int cS = 2131363297;
    public static final int cT = 2131363303;
    public static final int cU = 2131034123;
    public static final int cV = 2131034124;
    public static final int cW = 2131034134;
    public static final int cX = 2131034135;
    public static final int cY = 2131034136;
    public static final int cZ = 2131034137;
    public static final int ca = 2130968597;
    public static final int cb = 2130968598;
    public static final int cc = 2130968924;
    public static final int cd = 2131364687;
    public static final int ce = 2131364699;
    public static final int cf = 2131364698;
    public static final int cg = 2131493265;
    public static final int ch = 2131493347;
    public static final int ci = 2131493335;
    public static final int cj = 2131624067;
    public static final int ck = 2131624066;
    public static final int cl = 2131624069;
    public static final int cm = 2131624068;
    public static final int cn = 2131427620;
    public static final int co = 2131492978;
    public static final int cp = 2131755009;
    public static final int cq = 2131624029;
    public static final int cr = 2131624030;
    public static final int cs = 2131427547;
    public static final int ct = 2131427546;
    public static final int cu = 2131427550;
    public static final int cv = 2130837685;
    public static final int cw = 2131559238;
    public static final int cx = 2131559239;
    public static final int cy = 2131559237;
    public static final int cz = 2131559228;
    public static final int dA = 2130772427;
    public static final int dB = 2130772426;
    public static final int dC = 2130772428;
    public static final int dD = 2131755015;
    public static final int dE = 2131624629;
    public static final int dF = 2131624529;
    public static final int dG = 2131623967;
    public static final int dH = 2131624525;
    public static final int dI = 2131624617;
    public static final int dJ = 2131624618;
    public static final int dK = 2131624614;
    public static final int dL = 2131624101;
    public static final int dM = 2131624597;
    public static final int dN = 2131624626;
    public static final int dO = 2131624625;
    public static final int dP = 2131624540;
    public static final int dQ = 2131624111;
    public static final int dR = 2131624112;
    public static final int dS = 2131624113;
    public static final int dT = 2131624114;
    public static final int dU = 2131623971;
    public static final int dV = 2131624095;
    public static final int dW = 2131624222;
    public static final int dX = 2131624225;
    public static final int dY = 2131624227;
    public static final int dZ = 2131624228;
    public static final int da = 2131034138;
    public static final int db = 2131034141;
    public static final int dc = 2131034142;
    public static final int dd = 2131034156;
    public static final int de = 2131034157;
    public static final int df = 2131296264;
    public static final int dg = 2131296266;
    public static final int dh = 2131296265;
    public static final int di = 2131296267;
    public static final int dj = 2131296271;
    public static final int dk = 2131296270;
    public static final int dl = 2131296276;
    public static final int dm = 2131296274;
    public static final int dn = 2131296277;
    public static final int do = 2131296278;
    public static final int dp = 2131296275;
    public static final int dq = 2131296268;
    public static final int dr = 2131296272;
    public static final int ds = 2131296273;
    public static final int dt = 2131296263;
    public static final int du = 2131296262;
    public static final int dv = 2131296261;
    public static final int dw = 2131296260;
    public static final int dx = 2131296269;
    public static final int dy = 2130772429;
    public static final int dz = 2130772182;
    public static final int eA = 2131427519;
    public static final int eB = 2131427911;
    public static final int eC = 2131427905;
    public static final int eD = 2131427914;
    public static final int eE = 2131427919;
    public static final int eF = 2131427917;
    public static final int eG = 2131427918;
    public static final int eH = 2131427801;
    public static final int eI = 2131427803;
    public static final int eJ = 2131427800;
    public static final int eK = 2131427799;
    public static final int eL = 2131427804;
    public static final int eM = 2131427802;
    public static final int eN = 2131427797;
    public static final int eO = 2131427798;
    public static final int eP = 2131427821;
    public static final int eQ = 2131427883;
    public static final int eR = 2131427974;
    public static final int eS = 2131427890;
    public static final int eT = 2131427892;
    public static final int eU = 2131427889;
    public static final int eV = 2131427961;
    public static final int eW = 2131427962;
    public static final int eX = 2131427670;
    public static final int eY = 2131427608;
    public static final int eZ = 2131427607;
    public static final int ea = 2131624161;
    public static final int eb = 2131624287;
    public static final int ec = 2131624140;
    public static final int ed = 2131624013;
    public static final int ee = 2131624015;
    public static final int ef = 2131624014;
    public static final int eg = 2131624016;
    public static final int eh = 2131624009;
    public static final int ei = 2131624011;
    public static final int ej = 2131624010;
    public static final int ek = 2131624012;
    public static final int el = 2131624020;
    public static final int em = 2131624019;
    public static final int en = 2131624628;
    public static final int eo = 2131624627;
    public static final int ep = 2131624115;
    public static final int eq = 2131624100;
    public static final int er = 2131624599;
    public static final int es = 2131624598;
    public static final int et = 2131624600;
    public static final int eu = 2131624526;
    public static final int ev = 2131624630;
    public static final int ew = 2131427954;
    public static final int ex = 2131427953;
    public static final int ey = 2131427837;
    public static final int ez = 2131427838;
    public static final int fA = 2131689545;
    public static final int fB = 2131689538;
    public static final int fC = 2131689535;
    public static final int fD = 2131689543;
    public static final int fE = 2131689537;
    public static final int fF = 2131689536;
    public static final int fG = 2130968614;
    public static final int fH = 2130968618;
    public static final int fI = 2130968626;
    public static final int fJ = 2130968630;
    public static final int fK = 2130968632;
    public static final int fL = 2130968633;
    public static final int fM = 2130968635;
    public static final int fN = 2130968636;
    public static final int fO = 2130968637;
    public static final int fP = 2130968645;
    public static final int fQ = 2130968646;
    public static final int fR = 2130968650;
    public static final int fS = 2130968670;
    public static final int fT = 2130968671;
    public static final int fU = 2130968672;
    public static final int fV = 2130968673;
    public static final int fW = 2130968674;
    public static final int fX = 2130968675;
    public static final int fY = 2130968676;
    public static final int fZ = 2130968677;
    public static final int fa = 2131427515;
    public static final int fb = 2131427835;
    public static final int fc = 2131427782;
    public static final int fd = 2131427781;
    public static final int fe = 2131427783;
    public static final int ff = 2131427834;
    public static final int fg = 2131427784;
    public static final int fh = 2131427858;
    public static final int fi = 2131427903;
    public static final int fj = 2131427844;
    public static final int fk = 2131427845;
    public static final int fl = 2131427841;
    public static final int fm = 2131427840;
    public static final int fn = 2131427675;
    public static final int fo = 2131427669;
    public static final int fp = 2131427671;
    public static final int fq = 2131427605;
    public static final int fr = 2131427386;
    public static final int fs = 2131427968;
    public static final int ft = 2131427966;
    public static final int fu = 2131427967;
    public static final int fv = 2131427904;
    public static final int fw = 2131427822;
    public static final int fx = 2131427857;
    public static final int fy = 2131427674;
    public static final int fz = 2131689546;
    public static final int gA = 2130968758;
    public static final int gB = 2130968759;
    public static final int gC = 2130968761;
    public static final int gD = 2130968762;
    public static final int gE = 2130968763;
    public static final int gF = 2130968764;
    public static final int gG = 2130968765;
    public static final int gH = 2130968766;
    public static final int gI = 2130968767;
    public static final int gJ = 2130968768;
    public static final int gK = 2130968770;
    public static final int gL = 2130968773;
    public static final int gM = 2130968776;
    public static final int gN = 2130968777;
    public static final int gO = 2130968778;
    public static final int gP = 2130968779;
    public static final int gQ = 2130968782;
    public static final int gR = 2130968783;
    public static final int gS = 2130968785;
    public static final int gT = 2130968786;
    public static final int gU = 2130968787;
    public static final int gV = 2130968788;
    public static final int gW = 2130968790;
    public static final int gX = 2130968795;
    public static final int gY = 2130968797;
    public static final int gZ = 2130968798;
    public static final int ga = 2130968679;
    public static final int gb = 2130968680;
    public static final int gc = 2130968683;
    public static final int gd = 2130968684;
    public static final int ge = 2130968685;
    public static final int gf = 2130968691;
    public static final int gg = 2130968692;
    public static final int gh = 2130968693;
    public static final int gi = 2130968694;
    public static final int gj = 2130968695;
    public static final int gk = 2130968696;
    public static final int gl = 2130968697;
    public static final int gm = 2130968698;
    public static final int gn = 2130968713;
    public static final int go = 2130968720;
    public static final int gp = 2130968722;
    public static final int gq = 2130968724;
    public static final int gr = 2130968731;
    public static final int gs = 2130968733;
    public static final int gt = 2130968734;
    public static final int gu = 2130968740;
    public static final int gv = 2130968747;
    public static final int gw = 2130968751;
    public static final int gx = 2130968754;
    public static final int gy = 2130968756;
    public static final int gz = 2130968757;
    public static final int hA = 2130968938;
    public static final int hB = 2130968939;
    public static final int hC = 2130968940;
    public static final int hD = 2130968941;
    public static final int hE = 2130968944;
    public static final int hF = 2130968945;
    public static final int hG = 2130968946;
    public static final int hH = 2130968949;
    public static final int hI = 2130968950;
    public static final int hJ = 2131886080;
    public static final int hK = 2131886081;
    public static final int hL = 2131886084;
    public static final int hM = 2131886086;
    public static final int hN = 2131886087;
    public static final int hO = 2131886090;
    public static final int hP = 2131886091;
    public static final int hQ = 2130903044;
    public static final int hR = 2131820570;
    public static final int hS = 2131820571;
    public static final int hT = 2131820583;
    public static final int hU = 2131820584;
    public static final int hV = 2131820585;
    public static final int hW = 2131820597;
    public static final int hX = 2131820579;
    public static final int hY = 2131820580;
    public static final int hZ = 2131820589;
    public static final int ha = 2130968800;
    public static final int hb = 2130968805;
    public static final int hc = 2130968808;
    public static final int hd = 2130968811;
    public static final int he = 2130968812;
    public static final int hf = 2130968813;
    public static final int hg = 2130968816;
    public static final int hh = 2130968817;
    public static final int hi = 2130968818;
    public static final int hj = 2130968838;
    public static final int hk = 2130968841;
    public static final int hl = 2130968843;
    public static final int hm = 2130968848;
    public static final int hn = 2130968854;
    public static final int ho = 2130968858;
    public static final int hp = 2130968870;
    public static final int hq = 2130968894;
    public static final int hr = 2130968896;
    public static final int hs = 2130968901;
    public static final int ht = 2130968903;
    public static final int hu = 2130968905;
    public static final int hv = 2130968906;
    public static final int hw = 2130968910;
    public static final int hx = 2130968914;
    public static final int hy = 2130968927;
    public static final int hz = 2130968928;
    public static final int iA = 2131493489;
    public static final int iB = 2131493490;
    public static final int iC = 2131493525;
    public static final int iD = 2131492905;
    public static final int iE = 2131492904;
    public static final int iF = 2131493486;
    public static final int iG = 2131165184;
    public static final int iH = 2131165185;
    public static final int iI = 2131165186;
    public static final int iJ = 2131165191;
    public static final int iK = 2131362386;
    public static final int iL = 2131558680;
    public static final int iM = 2131558681;
    public static final int iN = 2130968623;
    public static final int iO = 2131558965;
    public static final int iP = 2131558966;
    public static final int iQ = 2130968742;
    public static final int iR = 2131230737;
    public static final int iS = 2131362379;
    public static final int iT = 2131624026;
    public static final int iU = 2131624297;
    public static final int iV = 2131559221;
    public static final int iW = 2131558749;
    public static final int iX = 2131559224;
    public static final int iY = 2131559223;
    public static final int iZ = 2131559222;
    public static final int ia = 2131820588;
    public static final int ib = 2131820587;
    public static final int ic = 2131820591;
    public static final int id = 2131820593;
    public static final int ie = 2131820573;
    public static final int if = 2131820586;
    public static final int ig = 2131820595;
    public static final int ih = 2131820596;
    public static final int ii = 2131820577;
    public static final int ij = 2131820576;
    public static final int ik = 2131820574;
    public static final int il = 2131820575;
    public static final int im = 2131820581;
    public static final int in = 2131820582;
    public static final int io = 2131820549;
    public static final int ip = 2131820592;
    public static final int iq = 2131820594;
    public static final int ir = 2131230726;
    public static final int is = 2131230727;
    public static final int it = 2131230728;
    public static final int iu = 2131230729;
    public static final int iv = 2131230730;
    public static final int iw = 2131230732;
    public static final int ix = 2131230733;
    public static final int iy = 2131493517;
    public static final int iz = 2131493516;
    public static final int jA = 2131362407;
    public static final int jB = 2131362400;
    public static final int jC = 2131362310;
    public static final int jD = 2131362317;
    public static final int jE = 2131362313;
    public static final int jF = 2131362402;
    public static final int jG = 2131362401;
    public static final int jH = 2131558440;
    public static final int jI = 2131558438;
    public static final int jJ = 2131558439;
    public static final int jK = 2131558437;
    public static final int jL = 2131362284;
    public static final int jM = 2131558436;
    public static final int jN = 2131558435;
    public static final int jO = 2131558434;
    public static final int jP = 2131558433;
    public static final int jQ = 2131558432;
    public static final int jR = 2131362281;
    public static final int jS = 2131362280;
    public static final int jT = 2131362283;
    public static final int jU = 2131362282;
    public static final int jV = 2131558431;
    public static final int jW = 2131558430;
    public static final int jX = 2131362279;
    public static final int jY = 2131362278;
    public static final int jZ = 2131427529;
    public static final int ja = 2131559268;
    public static final int jb = 2131559269;
    public static final int jc = 2131558462;
    public static final int jd = 2130968647;
    public static final int je = 2130968859;
    public static final int jf = 2130968716;
    public static final int jg = 2130968717;
    public static final int jh = 2130968750;
    public static final int ji = 2131362338;
    public static final int jj = 2131362334;
    public static final int jk = 2131362339;
    public static final int jl = 2131362340;
    public static final int jm = 2131362337;
    public static final int jn = 2131362333;
    public static final int jo = 2131362344;
    public static final int jp = 2131362343;
    public static final int jq = 2131362341;
    public static final int jr = 2131362345;
    public static final int js = 2130839024;
    public static final int jt = 2130839079;
    public static final int ju = 2130839108;
    public static final int jv = 2131362311;
    public static final int jw = 2131362312;
    public static final int jx = 2131362314;
    public static final int jy = 2131362399;
    public static final int jz = 2131361949;
    public static final int kA = 2131362190;
    public static final int kB = 2131362192;
    public static final int kC = 2131362191;
    public static final int kD = 2131362193;
    public static final int kE = 2131362189;
    public static final int kF = 2131362188;
    public static final int kG = 2131362187;
    public static final int kH = 2131362186;
    public static final int kI = 2131427505;
    public static final int kJ = 2131427506;
    public static final int kK = 2131558834;
    public static final int kL = 2131558836;
    public static final int kM = 2131558839;
    public static final int kN = 2131558838;
    public static final int kO = 2131558840;
    public static final int kP = 2131558837;
    public static final int kQ = 2131362181;
    public static final int kR = 2131362182;
    public static final int kS = 2131362183;
    public static final int kT = 2131362184;
    public static final int kU = 2131362185;
    public static final int kV = 2131558422;
    public static final int kW = 2131558423;
    public static final int kX = 2131362180;
    public static final int kY = 2131362179;
    public static final int kZ = 2131558420;
    public static final int ka = 2131427526;
    public static final int kb = 2130838913;
    public static final int kc = 2130838915;
    public static final int kd = 2130838917;
    public static final int ke = 2130838919;
    public static final int kf = 2130838991;
    public static final int kg = 2130838994;
    public static final int kh = 2130838996;
    public static final int ki = 2130839025;
    public static final int kj = 2130839028;
    public static final int kk = 2130839036;
    public static final int kl = 2130839050;
    public static final int km = 2130839051;
    public static final int kn = 2130839060;
    public static final int ko = 2130839075;
    public static final int kp = 2131689499;
    public static final int kq = 2131689500;
    public static final int kr = 2131886092;
    public static final int ks = 2131362199;
    public static final int kt = 2131362200;
    public static final int ku = 2131558849;
    public static final int kv = 2130968686;
    public static final int kw = 2131362194;
    public static final int kx = 2131362197;
    public static final int ky = 2131362195;
    public static final int kz = 2131362196;
    public static final int lA = 2131558443;
    public static final int lB = 2131558441;
    public static final int lC = 2131558442;
    public static final int lD = 2131558445;
    public static final int lE = 2131558429;
    public static final int lF = 2131558447;
    public static final int lG = 2131558448;
    public static final int lH = 2131559356;
    public static final int lI = 2131559357;
    public static final int lJ = 2131559359;
    public static final int lK = 2131559358;
    public static final int lL = 2131559355;
    public static final int lM = 2131559361;
    public static final int lN = 2131559360;
    public static final int lO = 2130968625;
    public static final int lP = 2130968738;
    public static final int lQ = 2130968925;
    public static final int lR = 2131362304;
    public static final int lS = 2131362309;
    public static final int lT = 2131362295;
    public static final int lU = 2131362288;
    public static final int lV = 2131362301;
    public static final int lW = 2131362296;
    public static final int lX = 2131362298;
    public static final int lY = 2131362300;
    public static final int lZ = 2131362290;
    public static final int la = 2130968845;
    public static final int lb = 2131362177;
    public static final int lc = 2131362176;
    public static final int ld = 2131558419;
    public static final int le = 2131362175;
    public static final int lf = 2131427538;
    public static final int lg = 2131427537;
    public static final int lh = 2131427539;
    public static final int li = 2130838657;
    public static final int lj = 2130839166;
    public static final int lk = 2131558951;
    public static final int ll = 2131558952;
    public static final int lm = 2131558949;
    public static final int ln = 2131558950;
    public static final int lo = 2131558687;
    public static final int lp = 2131558689;
    public static final int lq = 2131558948;
    public static final int lr = 2131558947;
    public static final int ls = 2131558946;
    public static final int lt = 2131558688;
    public static final int lu = 2131558428;
    public static final int lv = 2131558451;
    public static final int lw = 2131558426;
    public static final int lx = 2131558449;
    public static final int ly = 2131558450;
    public static final int lz = 2131558444;
    public static Field m = null;
    public static final int mA = 2131558972;
    public static final int mB = 2131558979;
    public static final int mC = 2131558974;
    public static final int mD = 2131558976;
    public static final int mE = 2131558975;
    public static final int mF = 2131558969;
    public static final int mG = 2131558968;
    public static final int mH = 2131558977;
    public static final int mI = 2131558978;
    public static final int mJ = 2131820547;
    public static final int mK = 2131820548;
    public static final int mL = 2131362166;
    public static final int mM = 2131362167;
    public static final int mN = 2131362168;
    public static final int mO = 2131362169;
    public static final int mP = 2131558417;
    public static final int mQ = 2131558750;
    public static final int mR = 2131559118;
    public static final int mS = 2131559122;
    public static final int mT = 2131559121;
    public static final int mU = 2131559123;
    public static final int mV = 2131559126;
    public static final int mW = 2131559124;
    public static final int mX = 2131559125;
    public static final int mY = 2131559119;
    public static final int mZ = 2131559120;
    public static final int ma = 2131362294;
    public static final int mb = 2131362293;
    public static final int mc = 2131362292;
    public static final int md = 2131362302;
    public static final int me = 2131362286;
    public static final int mf = 2131362289;
    public static final int mg = 2131362308;
    public static final int mh = 2131362307;
    public static final int mi = 2131362305;
    public static final int mj = 2131362306;
    public static final int mk = 2131362303;
    public static final int ml = 2130968649;
    public static final int mm = 2131362172;
    public static final int mn = 2131624646;
    public static final int mo = 2131624647;
    public static final int mp = 2131624224;
    public static final int mq = 2131558940;
    public static final int mr = 2131558933;
    public static final int ms = 2130968729;
    public static final int mt = 2130968732;
    public static final int mu = 2130968735;
    public static final int mv = 2131624139;
    public static final int mw = 2131427481;
    public static final int mx = 2131558971;
    public static final int my = 2131558970;
    public static final int mz = 2131558967;
    public static boolean n = false;
    public static final int nA = 2131034159;
    public static final int nB = 2130839099;
    public static final int nC = 2131362148;
    public static final int nD = 2131362147;
    public static final int nE = 2131362146;
    public static final int nF = 2131362144;
    public static final int nG = 2131362145;
    public static final int nH = 2131624226;
    public static final int nI = 2131558889;
    public static final int nJ = 2131559267;
    public static final int nK = 2130968714;
    public static final int nL = 2131362139;
    public static final int nM = 2131362138;
    public static final int nN = 2131034143;
    public static final int nO = 2131034144;
    public static final int nP = 2131034147;
    public static final int nQ = 2131623984;
    public static final int nR = 2131623986;
    public static final int nS = 2131623985;
    public static final int nT = 2131623987;
    public static final int nU = 2131623989;
    public static final int nV = 2131623988;
    public static final int nW = 2131427431;
    public static final int nX = 2131427432;
    public static final int nY = 2131427469;
    public static final int nZ = 2131427433;
    public static final int na = 2130968648;
    public static final int nb = 2130968801;
    public static final int nc = 2130968802;
    public static final int nd = 2130968803;
    public static final int ne = 2130838999;
    public static final int nf = 2130839111;
    public static final int ng = 2130968889;
    public static final int nh = 2131362155;
    public static final int ni = 2131362156;
    public static final int nj = 2131624004;
    public static final int nk = 2131427477;
    public static final int nl = 2131427479;
    public static final int nm = 2130838884;
    public static final int nn = 2130839043;
    public static final int no = 2131689496;
    public static final int np = 2131689497;
    public static final int nq = 2130968619;
    public static final int nr = 2130968744;
    public static final int ns = 2130968920;
    public static final int nt = 2130968921;
    public static final int nu = 2130968922;
    public static final int nv = 2130968948;
    public static final int nw = 2131362149;
    public static final int nx = 2131362152;
    public static final int ny = 2131034133;
    public static final int nz = 2131034155;
    public static Field o = null;
    public static final int oA = 2131558957;
    public static final int oB = 2131559384;
    public static final int oC = 2131558731;
    public static final int oD = 2131559391;
    public static final int oE = 2131559442;
    public static final int oF = 2131559385;
    public static final int oG = 2131559390;
    public static final int oH = 2131559392;
    public static final int oI = 2131558954;
    public static final int oJ = 2131558955;
    public static final int oK = 2131558956;
    public static final int oL = 2131558953;
    public static final int oM = 2131558733;
    public static final int oN = 2131559441;
    public static final int oO = 2131558415;
    public static final int oP = 2131559338;
    public static final int oQ = 2131559413;
    public static final int oR = 2131558412;
    public static final int oS = 2131559333;
    public static final int oT = 2131559332;
    public static final int oU = 2131559331;
    public static final int oV = 2131558413;
    public static final int oW = 2131559407;
    public static final int oX = 2131559411;
    public static final int oY = 2131559410;
    public static final int oZ = 2131559409;
    public static final int oa = 2131427425;
    public static final int ob = 2131427423;
    public static final int oc = 2131427424;
    public static final int od = 2131427470;
    public static final int oe = 2131427471;
    public static final int of = 2131427472;
    public static final int og = 2131427473;
    public static final int oh = 2131427474;
    public static final int oi = 2131427475;
    public static final int oj = 2130837682;
    public static final int ok = 2130838987;
    public static final int ol = 2130839080;
    public static final int om = 2130839117;
    public static final int on = 2130839155;
    public static final int oo = 2130839156;
    public static final int op = 2131558414;
    public static final int oq = 2131558959;
    public static final int or = 2131559334;
    public static final int os = 2131559335;
    public static final int ot = 2131559336;
    public static final int ou = 2131559337;
    public static final int ov = 2131558732;
    public static final int ow = 2131559440;
    public static final int ox = 2131559387;
    public static final int oy = 2131559386;
    public static final int oz = 2131559388;
    public static boolean p = false;
    public static final int pA = 2131559275;
    public static final int pB = 2131558964;
    public static final int pC = 2131558963;
    public static final int pD = 2131559274;
    public static final int pE = 2131559272;
    public static final int pF = 2131559273;
    public static final int pG = 2131559271;
    public static final int pH = 2131689480;
    public static final int pI = 2131689478;
    public static final int pJ = 2131689479;
    public static final int pK = 2131689477;
    public static final int pL = 2131689481;
    public static final int pM = 2131362065;
    public static final int pN = 2131362064;
    public static final int pO = 2131362066;
    public static final int pP = 2130839026;
    public static final int pQ = 2131362063;
    public static final int pR = 2131362062;
    public static final int pS = 2131558984;
    public static final int pT = 2131558985;
    public static final int pU = 2131558986;
    public static final int pV = 2130968749;
    public static final int pW = 2131362057;
    public static final int pX = 2131362061;
    public static final int pY = 2130839016;
    public static final int pZ = 2130839023;
    public static final int pa = 2131559408;
    public static final int pb = 2131559412;
    public static final int pc = 2131689493;
    public static final int pd = 2131689487;
    public static final int pe = 2131689488;
    public static final int pf = 2131689489;
    public static final int pg = 2131689484;
    public static final int ph = 2131689486;
    public static final int pi = 2131689485;
    public static final int pj = 2131689492;
    public static final int pk = 2131689490;
    public static final int pl = 2130968644;
    public static final int pm = 2130968739;
    public static final int pn = 2130968947;
    public static final int po = 2131886088;
    public static final int pp = 2130839048;
    public static final int pq = 2130839074;
    public static final int pr = 2131362068;
    public static final int ps = 2131362067;
    public static final int pt = 2131362069;
    public static final int pu = 2131034145;
    public static final int pv = 2131427416;
    public static final int pw = 2131427415;
    public static final int px = 2131427414;
    public static final int py = 2131427420;
    public static final int pz = 2131427421;
    public static final int q = 2130772201;
    public static final int qA = 2131558789;
    public static final int qB = 2131558722;
    public static final int qC = 2131558783;
    public static final int qD = 2131558782;
    public static final int qE = 2131558779;
    public static final int qF = 2131558777;
    public static final int qG = 2131558780;
    public static final int qH = 2131558781;
    public static final int qI = 2131558711;
    public static final int qJ = 2131558791;
    public static final int qK = 2131558772;
    public static final int qL = 2131558787;
    public static final int qM = 2131558788;
    public static final int qN = 2130968659;
    public static final int qO = 2130968660;
    public static final int qP = 2130968661;
    public static final int qQ = 2130968662;
    public static final int qR = 2130968664;
    public static final int qS = 2130968666;
    public static final int qT = 2130968667;
    public static final int qU = 2130968668;
    public static final int qV = 2131820544;
    public static final int qW = 2131820545;
    public static final int qX = 2131820546;
    public static final int qY = 2131623962;
    public static final int qZ = 2131623965;
    public static final int qa = 2130839058;
    public static final int qb = 2131624184;
    public static final int qc = 2131559029;
    public static final int qd = 2131559031;
    public static final int qe = 2131559032;
    public static final int qf = 2131559030;
    public static final int qg = 2131559443;
    public static final int qh = 2130968760;
    public static final int qi = 2131886089;
    public static final int qj = 2130838679;
    public static final int qk = 2131559069;
    public static final int ql = 2131559068;
    public static final int qm = 2130968771;
    public static final int qn = 2130839042;
    public static final int qo = 2131559432;
    public static final int qp = 2131886085;
    public static final int qq = 2131362014;
    public static final int qr = 2131362017;
    public static final int qs = 2131362019;
    public static final int qt = 2131362016;
    public static final int qu = 2131362015;
    public static final int qv = 2131362018;
    public static final int qw = 2131558723;
    public static final int qx = 2131558774;
    public static final int qy = 2131558785;
    public static final int qz = 2131558773;
    public static final int r = 2130772206;
    public static final int rA = 2131427544;
    public static final int rB = 2131427545;
    public static final int rC = 2131689502;
    public static final int rD = 2131689504;
    public static final int rE = 2131689503;
    public static final int rF = 2131689505;
    public static final int rG = 2131689501;
    public static final int rH = 2131427381;
    public static final int rI = 2131361968;
    public static final int rJ = 2131361967;
    public static final int rK = 2131361969;
    public static final int rL = 2131361966;
    public static final int rM = 2130968806;
    public static final int rN = 2131361965;
    public static final int rO = 2131361963;
    public static final int rP = 2131361964;
    public static final int rQ = 2131361962;
    public static final int rR = 2131361961;
    public static final int rS = 2131361960;
    public static final int rT = 2131624282;
    public static final int rU = 2130968658;
    public static final int rV = 2131230721;
    public static final int rW = 2131361958;
    public static final int rX = 2131361956;
    public static final int rY = 2131361959;
    public static final int rZ = 2130838984;
    public static final int ra = 2130837586;
    public static final int rb = 2130903045;
    public static final int rc = 2131361993;
    public static final int rd = 2131361991;
    public static final int re = 2131361992;
    public static final int rf = 2131361994;
    public static final int rg = 2130838934;
    public static final int rh = 2130838935;
    public static final int ri = 2130838936;
    public static final int rj = 2131559184;
    public static final int rk = 2131559186;
    public static final int rl = 2131559185;
    public static final int rm = 2131559181;
    public static final int rn = 2131559182;
    public static final int ro = 2131559180;
    public static final int rp = 2131559178;
    public static final int rq = 2131559183;
    public static final int rr = 2131559179;
    public static final int rs = 2131558409;
    public static final int rt = 2130968835;
    public static final int ru = 2131559111;
    public static final int rv = 2131559110;
    public static final int rw = 2131559112;
    public static final int rx = 2130968791;
    public static final int ry = 2131362318;
    public static final int rz = 2131361971;
    public static final int s = 2130772202;
    public static final int sA = 2130968725;
    public static final int sB = 2130968726;
    public static final int sC = 2130968727;
    public static final int sD = 2130968842;
    public static final int sE = 2130968846;
    public static final int sF = 2130968847;
    public static final int sG = 2130968849;
    public static final int sH = 2130968850;
    public static final int sI = 2130968851;
    public static final int sJ = 2130968852;
    public static final int sK = 2130968853;
    public static final int sL = 2130968855;
    public static final int sM = 2130968856;
    public static final int sN = 2130968882;
    public static final int sO = 2131361948;
    public static final int sP = 2131361932;
    public static final int sQ = 2131361925;
    public static final int sR = 2131361917;
    public static final int sS = 2131361951;
    public static final int sT = 2131361950;
    public static final int sU = 2131361918;
    public static final int sV = 2131361923;
    public static final int sW = 2131361924;
    public static final int sX = 2131361946;
    public static final int sY = 2131361945;
    public static final int sZ = 2131361915;
    public static final int sa = 2130839004;
    public static final int sb = 2130839027;
    public static final int sc = 2130839037;
    public static final int sd = 2130839077;
    public static final int se = 2130839078;
    public static final int sf = 2130839107;
    public static final int sg = 2131559189;
    public static final int sh = 2130968840;
    public static final int si = 2131362410;
    public static final int sj = 2131624182;
    public static final int sk = 2130838952;
    public static final int sl = 2130838968;
    public static final int sm = 2131361954;
    public static final int sn = 2131361955;
    public static final int so = 2131361952;
    public static final int sp = 2131361953;
    public static final int sq = 2131361914;
    public static final int sr = 2131034148;
    public static final int ss = 2131427376;
    public static final int st = 2131427363;
    public static final int su = 2131427371;
    public static final int sv = 2131427370;
    public static final int sw = 2131427377;
    public static final int sx = 2131427380;
    public static final int sy = 2131689474;
    public static final int sz = 2131689476;
    public static final int t = 2130772196;
    public static final int tA = 2130968861;
    public static final int tB = 2130968917;
    public static final int tC = 2130968918;
    public static final int tD = 2130968919;
    public static final int tE = 2131361897;
    public static final int tF = 2131361901;
    public static final int tG = 2131361890;
    public static final int tH = 2131361899;
    public static final int tI = 2131361898;
    public static final int tJ = 2131361912;
    public static final int tK = 2131361891;
    public static final int tL = 2131361896;
    public static final int tM = 2131361909;
    public static final int tN = 2131361889;
    public static final int tO = 2131361900;
    public static final int tP = 2131361911;
    public static final int tQ = 2131361910;
    public static final int tR = 2131361905;
    public static final int tS = 2131361907;
    public static final int tT = 2131559262;
    public static final int tU = 2131559264;
    public static final int tV = 2131558461;
    public static final int tW = 2130968885;
    public static final int tX = 2130968887;
    public static final int tY = 2130968888;
    public static final int tZ = 2131559266;
    public static final int ta = 2131361943;
    public static final int tb = 2131361944;
    public static final int tc = 2131361942;
    public static final int td = 2131361934;
    public static final int te = 2131361933;
    public static final int tf = 2131361927;
    public static final int tg = 2131361926;
    public static final int th = 2131361939;
    public static final int ti = 2131361940;
    public static final int tj = 2131361941;
    public static final int tk = 2131361928;
    public static final int tl = 2131361929;
    public static final int tm = 2131361921;
    public static final int tn = 2131559285;
    public static final int to = 2131558411;
    public static final int tp = 2131558410;
    public static final int tq = 2131559283;
    public static final int tr = 2131559284;
    public static final int ts = 2130968893;
    public static final int tt = 2131362022;
    public static ifl tu = null;
    public static volatile Context tv = null;
    public static volatile boolean tw = false;
    public static List<epq> tx = null;
    public static final int ty = 2130968620;
    public static final int tz = 2130968687;
    public static final int u = 2130772198;
    public static final int uA = 2131361878;
    public static final int uB = 2131361877;
    public static final int uC = 2131361876;
    public static final int uD = 2131361880;
    public static final int uE = 2131361879;
    public static final int uF = 2131624074;
    public static final int uG = 2131558875;
    public static final int uH = 2131559117;
    public static final int uI = 2131361871;
    public static final int uJ = 2131361870;
    public static final int uK = 2131689472;
    public static final int uL = 2131559311;
    public static final int uM = 2131559312;
    public static final int uN = 2130968907;
    public static final int uO = 2130968913;
    public static final int uP = 2131296258;
    public static final int uQ = 2131296257;
    public static final int uR = 2131623937;
    public static final int uS = 2130838691;
    public static final int uT = 2130838692;
    public static final int uU = 2130838831;
    public static final int uV = 2130838841;
    public static final int uW = 2130838842;
    public static final int uX = 2130838858;
    public static final int uY = 2130838879;
    public static final int uZ = 2130838880;
    public static final int ua = 2131689473;
    public static final int ub = 2130968886;
    public static Map<String, fas> uc = null;
    public static final int ud = 2131361888;
    public static final int ue = 2131623941;
    public static final int uf = 2130839088;
    public static final int ug = 2130839129;
    public static final int uh = 2130839130;
    public static final int ui = 2131559254;
    public static final int uj = 2131559282;
    public static final int uk = 2131558755;
    public static final int ul = 2131559277;
    public static final int um = 2131559281;
    public static final int un = 2131559276;
    public static final int uo = 2131559280;
    public static final int up = 2131559279;
    public static final int uq = 2130968892;
    public static final int ur = 2131361881;
    public static final int us = 2131361884;
    public static final int ut = 2131361883;
    public static final int uu = 2131361882;
    public static final int uv = 2131559319;
    public static final int uw = 2131559318;
    public static final int ux = 2131559316;
    public static final int uy = 2130968908;
    public static final int uz = 2130968909;
    public static final int v = 2130772204;
    public static final int vA = 2131361844;
    public static final int vB = 2131361806;
    public static final int vC = 2131361832;
    public static final int vD = 2131361831;
    public static final int vE = 2131361833;
    public static final int vF = 2131361827;
    public static final int vG = 2131361829;
    public static final int vH = 2131361830;
    public static final int vI = 2131361828;
    public static final int vJ = 2131361824;
    public static final int vK = 2131361826;
    public static final int vL = 2131361825;
    public static boolean vM = false;
    public static boolean vN = false;
    public static final int vO = 2131361864;
    public static final int vP = 2131361865;
    public static boolean vQ = false;
    public static final int vR = 2131559363;
    public static final int vS = 2131559364;
    public static final int vT = 2130968929;
    public static final int vU = 2130968931;
    public static final int vV = 2130968932;
    public static final int vW = 2130968933;
    public static final int vX = 2130968934;
    public static final int vY = 2131361858;
    public static final int vZ = 2131361845;
    public static final int va = 2130839072;
    public static final int vb = 2130839073;
    public static final int vc = 2131230723;
    public static final int vd = 2131361808;
    public static final int ve = 2131361809;
    public static final int vf = 2131361818;
    public static final int vg = 2131361817;
    public static final int vh = 2131361813;
    public static final int vi = 2131361812;
    public static final int vj = 2131361816;
    public static final int vk = 2131361811;
    public static final int vl = 2131361807;
    public static final int vm = 2131361805;
    public static final int vn = 2131361803;
    public static final int vo = 2131361802;
    public static final int vp = 2131361842;
    public static final int vq = 2131361835;
    public static final int vr = 2131361834;
    public static final int vs = 2131361836;
    public static final int vt = 2131361804;
    public static final int vu = 2131361843;
    public static final int vv = 2131361840;
    public static final int vw = 2131361841;
    public static final int vx = 2131361837;
    public static final int vy = 2131361839;
    public static final int vz = 2131361838;
    public static final int w = 2130772205;
    public static final int wA = 2131820567;
    public static final int wB = 2131820566;
    public static final int wC = 2131820563;
    public static final int wD = 2131820550;
    public static final int wE = 2131820561;
    public static final int wF = 2131362419;
    public static final int wG = 2131362411;
    public static final int wH = 2131362412;
    public static final int wI = 2131362413;
    public static final int wJ = 2131362414;
    public static final int wK = 2131362417;
    public static final int wL = 2131362418;
    public static final int wM = 2131362415;
    public static final int wN = 2131362416;
    public static final int wO = 2131362389;
    public static final int wP = 2131362316;
    public static final int wQ = 2131623936;
    public static final int wR = 2131363388;
    public static final int wS = 2130837631;
    public static final int wT = 2130837652;
    public static final int wU = 9080000;
    public static Boolean wV = null;
    public static Boolean wW = null;
    public static Boolean wX = null;
    public static gxe wY = null;
    public static Context wZ = null;
    public static final int wa = 2131361846;
    public static final int wb = 2131361862;
    public static final int wc = 2131361861;
    public static final int wd = 2131361860;
    public static final int we = 2131361848;
    public static final int wf = 2131361847;
    public static final int wg = 2131361857;
    public static final int wh = 2131361856;
    public static final int wi = 2131361850;
    public static final int wj = 2131361849;
    public static final int wk = 2131165193;
    public static Pattern wl = null;
    public static Pattern wm = null;
    public static final int wn = 2131820564;
    public static final int wo = 2131820565;
    public static final int wp = 2131820562;
    public static final int wq = 2131820555;
    public static final int wr = 2131820556;
    public static final int ws = 2131820553;
    public static final int wt = 2131820554;
    public static final int wu = 2131820551;
    public static final int wv = 2131820552;
    public static final int ww = 2131820559;
    public static final int wx = 2131820560;
    public static final int wy = 2131820557;
    public static final int wz = 2131820558;
    public static final int x = 2130772230;
    public static final int xA = 2131559300;
    public static final int xB = 2131559299;
    public static final int xC = 2131558691;
    public static final int xD = 2131559293;
    public static final int xE = 2131559298;
    public static final int xF = 2131559294;
    public static final int xG = 2131689532;
    public static final int xH = 2131689531;
    public static volatile boolean xI = false;
    public static final int xJ = 2131296259;
    public static final int xK = 2131624121;
    public static final int xL = 2131427648;
    public static final int xM = 2131427651;
    public static final int xN = 2131427654;
    public static final int xO = 2131427646;
    public static final int xP = 2131427649;
    public static final int xQ = 2131427652;
    public static final int xR = 2131427647;
    public static final int xS = 2131427650;
    public static final int xT = 2131427653;
    public static final int xU = 2131493016;
    public static final int xV = 2131363386;
    public static final int xW = 2131363387;
    public static final int xX = 2131624135;
    public static final int xY = 2130968638;
    public static final int xZ = 2130968639;
    public static Set<gwv> xa = null;
    public static Set<gwv> xb = null;
    public static boolean xc = false;
    public static hlk xd = null;
    public static hqa xe = null;
    public static final int xf = 2130772408;
    public static final int xg = 2131624520;
    public static final int xh = 2131427777;
    public static final int xi = 2131427772;
    public static final int xj = 2131427778;
    public static final int xk = 2130837588;
    public static final int xl = 2130837608;
    public static final int xm = 2131558639;
    public static final int xn = 2131559297;
    public static final int xo = 2131559301;
    public static final int xp = 2131559295;
    public static final int xq = 2131559292;
    public static final int xr = 2131559296;
    public static final int xs = 2131558645;
    public static final int xt = 2131558472;
    public static final int xu = 2131558693;
    public static final int xv = 2131558695;
    public static final int xw = 2131558696;
    public static final int xx = 2131559091;
    public static final int xy = 2131558692;
    public static final int xz = 2131558694;
    public static final int y = 2130772223;
    public static Bitmap yA = null;
    public static Bitmap yB = null;
    public static Bitmap yC = null;
    public static Bitmap yD = null;
    public static Bitmap yE = null;
    public static float yF = 0.0f;
    public static final int yG = 2131624048;
    public static final int yH = 2130837604;
    public static final int yI = 2130838905;
    public static final int yJ = 2131363383;
    public static final int yK = 2131363380;
    public static final int yL = 2131363384;
    public static final int yM = 2131363381;
    public static final int yN = 2131558944;
    public static final int yO = 2131558945;
    public static final int yP = 2131558710;
    public static final int yQ = 2131689510;
    public static final int yR = 2131689516;
    public static final int yS = 2131689515;
    public static final int yT = 2131689518;
    public static final int yU = 2131689517;
    public static final int yV = 2131689521;
    public static final int yW = 2131689519;
    public static final int yX = 2131689523;
    public static final int yY = 2131689522;
    public static final int yZ = 2131689520;
    public static final int ya = 2130968641;
    public static final int yb = 2130968642;
    public static final int yc = 2130968643;
    public static final int yd = 2131492922;
    public static final int ye = 2131427641;
    public static final int yf = 2131427642;
    public static final int yg = 2131427643;
    public static final int yh = 2131427644;
    public static final int yi = 2131493013;
    public static final int yj = 2130772151;
    public static final int yk = 2131559306;
    public static final int yl = 2131558896;
    public static final int ym = 2130968911;
    public static final int yn = 2131493011;
    public static final int yo = 2131558400;
    public static int yp = 0;
    public static int yq = 0;
    public static int yr = 0;
    public static int ys = 0;
    public static Bitmap yt = null;
    public static Bitmap yu = null;
    public static Bitmap yv = null;
    public static Bitmap yw = null;
    public static Bitmap yx = null;
    public static Bitmap yy = null;
    public static Bitmap yz = null;
    public static final int z = 2130772211;
    public static final int zA = 2131363320;
    public static final int zB = 2131558642;
    public static final int zC = 2131558640;
    public static final int zD = 2131558644;
    public static final int zE = 2131558643;
    public static final int zF = 2131558641;
    public static final int zG = 2130968603;
    public static final int zH = 2130772138;
    public static final int zI = 2130772140;
    public static final int zJ = 2130772133;
    public static final int zK = 2130772134;
    public static final int zL = 2130772136;
    public static final int zM = 2130772142;
    public static final int zN = 2130772145;
    public static final int zO = 2131624079;
    public static final int zP = 2130968869;
    public static final int zQ = 2130968875;
    public static final int zR = 2130968876;
    public static final int zS = 2130968621;
    public static final int zT = 2130968718;
    public static final int zU = 2131230736;
    public static Integer zV = null;
    public static Integer zW = null;
    public static Integer zX = null;
    public static Integer zY = null;
    public static final int zZ = 2131363316;
    public static final int za = 2131689512;
    public static final int zb = 2131689513;
    public static final int zc = 2131689511;
    public static final int zd = 2131689514;
    public static final int ze = 2131558915;
    public static final int zf = 2131559113;
    public static final int zg = 2131559114;
    public static final int zh = 2131559115;
    public static final int zi = 2131559116;
    public static final int zj = 2130968792;
    public static final int zk = 2130968793;
    public static final int zl = 2130968794;
    public static final int zm = 2130968617;
    public static final int zn = 2131361794;
    public static final int zo = 2131361793;
    public static final int zp = 2131361796;
    public static final int zq = 2131361795;
    public static final int zr = 2131493344;
    public static final int zs = 2131361798;
    public static final int zt = 2131361801;
    public static final int zu = 2131361799;
    public static final int zv = 2131361800;
    public static final int zw = 2131361797;
    public static final int zx = 2131492864;
    public static final int zy = 2131558452;
    public static final int zz = 2131363319;
    public final Set<Scope> k;
    public final boolean l;

    public void a(ae aeVar) {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    public boolean c(CoordinatorLayout coordinatorLayout, V v) {
        return false;
    }

    public boolean a_(View view) {
        return false;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, View view) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return false;
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view) {
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return false;
    }

    public qb a(qb qbVar) {
        return qbVar;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
        return false;
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
    }

    public Parcelable b(CoordinatorLayout coordinatorLayout, V v) {
        return BaseSavedState.EMPTY_STATE;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
        return false;
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

    public static by[] a(String str) {
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
        return (by[]) arrayList.toArray(new by[arrayList.size()]);
    }

    public static by[] a(by[] byVarArr) {
        if (byVarArr == null) {
            return null;
        }
        by[] byVarArr2 = new by[byVarArr.length];
        for (int i = 0; i < byVarArr.length; i++) {
            byVarArr2[i] = new by(byVarArr[i]);
        }
        return byVarArr2;
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

    public static void a(ArrayList<by> arrayList, char c, float[] fArr) {
        arrayList.add(new by(c, fArr));
    }

    public static float[] b(String str) {
        if (((str.charAt(0) == 'z' ? 1 : 0) | (str.charAt(0) == 'Z' ? 1 : 0)) != 0) {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            bx bxVar = new bx();
            int length = str.length();
            int i = 0;
            int i2 = 1;
            while (i2 < length) {
                int i3;
                a(str, i2, bxVar);
                int i4 = bxVar.a;
                if (i2 < i4) {
                    i3 = i + 1;
                    fArr[i] = Float.parseFloat(str.substring(i2, i4));
                } else {
                    i3 = i;
                }
                if (bxVar.b) {
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
    public static void a(java.lang.String r7, int r8, bx r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: gwb.a(java.lang.String, int, bx):void");
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

    public static void a(ClassLoader classLoader, List<File> list, File file) {
        Object obj = ci.a(classLoader, "pathList").get(classLoader);
        ci.a(obj, "dexElements", a(obj, new ArrayList(list), file));
    }

    public static Object[] a(Object obj, ArrayList<File> arrayList, File file) {
        return (Object[]) ci.a(obj, "makeDexElements", ArrayList.class, File.class).invoke(obj, new Object[]{arrayList, file});
    }

    public static void a(ClassLoader classLoader, List<File> list) {
        int size = list.size();
        Field a = ci.a(classLoader, "path");
        StringBuilder stringBuilder = new StringBuilder((String) a.get(classLoader));
        Object[] objArr = new String[size];
        Object[] objArr2 = new File[size];
        Object[] objArr3 = new ZipFile[size];
        Object[] objArr4 = new DexFile[size];
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            File file = (File) listIterator.next();
            String absolutePath = file.getAbsolutePath();
            stringBuilder.append(':').append(absolutePath);
            int previousIndex = listIterator.previousIndex();
            objArr[previousIndex] = absolutePath;
            objArr2[previousIndex] = file;
            objArr3[previousIndex] = new ZipFile(file);
            objArr4[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
        }
        a.set(classLoader, stringBuilder.toString());
        ci.a((Object) classLoader, "mPaths", objArr);
        ci.a((Object) classLoader, "mFiles", objArr2);
        ci.a((Object) classLoader, "mZips", objArr3);
        ci.a((Object) classLoader, "mDexs", objArr4);
    }

    public static long a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long a = a(randomAccessFile, a(randomAccessFile));
            return a;
        } finally {
            randomAccessFile.close();
        }
    }

    public static cl a(RandomAccessFile randomAccessFile) {
        long j = 0;
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65536;
        if (j2 >= 0) {
            j = j2;
        }
        int reverseBytes = Integer.reverseBytes(101010256);
        j2 = length;
        do {
            randomAccessFile.seek(j2);
            if (randomAccessFile.readInt() != reverseBytes) {
                j2--;
            } else {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                cl clVar = new cl();
                clVar.b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                clVar.a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return clVar;
            }
        } while (j2 >= j);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static long a(RandomAccessFile randomAccessFile, cl clVar) {
        CRC32 crc32 = new CRC32();
        long j = clVar.b;
        randomAccessFile.seek(clVar.a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        }
        return crc32.getValue();
    }

    public static void a(Activity activity, String[] strArr, int i) {
        if (activity instanceof ct) {
            ((ct) activity).b_(i);
        }
        activity.requestPermissions(strArr, i);
    }

    public static boolean a(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void a(Activity activity) {
        activity.invalidateOptionsMenu();
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void b(Activity activity) {
        activity.finishAffinity();
    }

    public static boolean a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return ba.a(activityManager);
        }
        return false;
    }

    public static String c(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static int a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    public static void a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bc.a(bundle, str, iBinder);
        } else {
            ba.a(bundle, str, iBinder);
        }
    }

    public static String e(View view) {
        return view.getTransitionName();
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return obj;
    }

    public static Object a(Object obj, View view, ArrayList<View> arrayList, Map<String, View> map, View view2) {
        if (obj == null) {
            return obj;
        }
        a((ArrayList) arrayList, view);
        if (map != null) {
            arrayList.removeAll(map.values());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.add(view2);
        b((Transition) obj, (ArrayList) arrayList);
        return obj;
    }

    public static void a(Object obj, View view, boolean z) {
        ((Transition) obj).excludeTarget(view, z);
    }

    public static void a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public static void a(Object obj, View view) {
        ((Transition) obj).setEpicenterCallback(new ex(f(view)));
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

    public static void a(Transition transition, Transition transition2, ArrayList<View> arrayList, boolean z) {
        if (transition != null) {
            int size = transition2 == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                transition.excludeTarget((View) arrayList.get(i), z);
            }
        }
    }

    public static void a(Object obj, Object obj2, Object obj3, ArrayList<View> arrayList, boolean z) {
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        a((Transition) obj, transition2, (ArrayList) arrayList, z);
        a(transition, transition2, (ArrayList) arrayList, z);
    }

    public static void a(Object obj, Object obj2, Object obj3, View view, fc fcVar, View view2, fb fbVar, Map<String, String> map, ArrayList<View> arrayList, ArrayList<View> arrayList2, Map<String, View> map2, Map<String, View> map3, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj3;
        Transition transition3 = (Transition) obj2;
        a(transition, transition2, (ArrayList) arrayList2, true);
        if (obj != null || obj2 != null) {
            if (transition != null) {
                transition.addTarget(view2);
            }
            if (obj2 != null) {
                a((Object) transition3, view2, (Map) map2, (ArrayList) arrayList3);
                a(transition, transition3, (ArrayList) arrayList3, true);
                a(transition2, transition3, (ArrayList) arrayList3, true);
            }
            view.getViewTreeObserver().addOnPreDrawListener(new ey(view, transition, view2, fcVar, map, map3, arrayList, transition2));
            a(transition, fbVar);
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

    public static void a(Object obj, View view, Map<String, View> map, ArrayList<View> arrayList) {
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
        b(obj, (ArrayList) arrayList);
    }

    public static void a(List<View> list, View view) {
        int size = list.size();
        if (!a((List) list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!a((List) list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static void a(Transition transition, fb fbVar) {
        if (transition != null) {
            transition.setEpicenterCallback(new ez(fbVar));
        }
    }

    public static Rect f(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    public static void a(ArrayList<View> arrayList, View view) {
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
                a((ArrayList) arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    public static void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a((Map) map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static void a(View view, View view2, Object obj, ArrayList<View> arrayList, Object obj2, ArrayList<View> arrayList2, Object obj3, ArrayList<View> arrayList3, Object obj4, ArrayList<View> arrayList4, Map<String, View> map) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        Transition transition4 = (Transition) obj4;
        if (transition4 != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new fa(view, transition, arrayList, transition2, arrayList2, transition3, arrayList3, map, arrayList4, transition4, view2));
        }
    }

    public static void a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        int transitionCount;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                a(transitionSet.getTransitionAt(i), (ArrayList) arrayList);
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

    public static void b(Object obj, ArrayList<View> arrayList) {
        int i = 0;
        Transition transition = (Transition) obj;
        int transitionCount;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                b(transitionSet.getTransitionAt(i), (ArrayList) arrayList);
                i++;
            }
        } else if (!a(transition) && c(transition.getTargets())) {
            int size = arrayList.size();
            for (transitionCount = 0; transitionCount < size; transitionCount++) {
                transition.addTarget((View) arrayList.get(transitionCount));
            }
        }
    }

    public static boolean a(Transition transition) {
        return (c(transition.getTargetIds()) && c(transition.getTargetNames()) && c(transition.getTargetTypes())) ? false : true;
    }

    public static boolean c(List list) {
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

    public static void a(Builder builder, gq gqVar) {
        Bundle bundle;
        Action.Builder builder2 = new Action.Builder(gqVar.a(), gqVar.b(), gqVar.c());
        if (gqVar.f() != null) {
            for (RemoteInput addRemoteInput : a(gqVar.f())) {
                builder2.addRemoteInput(addRemoteInput);
            }
        }
        if (gqVar.d() != null) {
            bundle = new Bundle(gqVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", gqVar.e());
        builder2.addExtras(bundle);
        builder.addAction(builder2.build());
    }

    public static Action a(gq gqVar) {
        Action.Builder addExtras = new Action.Builder(gqVar.a(), gqVar.b(), gqVar.c()).addExtras(gqVar.d());
        hm[] f = gqVar.f();
        if (f != null) {
            for (RemoteInput addRemoteInput : a(f)) {
                addExtras.addRemoteInput(addRemoteInput);
            }
        }
        return addExtras.build();
    }

    public static ArrayList<Parcelable> a(gq[] gqVarArr) {
        if (gqVarArr == null) {
            return null;
        }
        ArrayList<Parcelable> arrayList = new ArrayList(gqVarArr.length);
        for (gq a : gqVarArr) {
            arrayList.add(a(a));
        }
        return arrayList;
    }

    public static void a(fp fpVar, CharSequence charSequence, CharSequence charSequence2, List<CharSequence> list, List<Long> list2, List<CharSequence> list3, List<String> list4, List<Uri> list5) {
        MessagingStyle conversationTitle = new MessagingStyle(charSequence).setConversationTitle(charSequence2);
        for (int i = 0; i < list.size(); i++) {
            Message message = new Message((CharSequence) list.get(i), ((Long) list2.get(i)).longValue(), (CharSequence) list3.get(i));
            if (list4.get(i) != null) {
                message.setData((String) list4.get(i), (Uri) list5.get(i));
            }
            conversationTitle.addMessage(message);
        }
        conversationTitle.setBuilder(fpVar.a());
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

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static RemoteInput[] a(hm[] hmVarArr) {
        if (hmVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[hmVarArr.length];
        for (int i = 0; i < hmVarArr.length; i++) {
            hm hmVar = hmVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(hmVar.a()).setLabel(hmVar.b()).setChoices(hmVar.c()).setAllowFreeFormInput(hmVar.d()).addExtras(hmVar.e()).build();
        }
        return remoteInputArr;
    }

    public static Bundle a(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    public static PendingIntent a(Context context, int i, Intent[] intentArr, int i2) {
        return PendingIntent.getActivities(context, i, intentArr, i2);
    }

    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }

    public static boolean a(Exception exception) {
        return exception instanceof OperationCanceledException;
    }

    public static Drawable b(Context context, int i) {
        return context.getDrawable(i);
    }

    public static ColorStateList c(Context context, int i) {
        return context.getColorStateList(i);
    }

    public static int d(Context context, int i) {
        return context.getColor(i);
    }

    public static void a(Context context, Intent[] intentArr) {
        context.startActivities(intentArr);
    }

    public static void a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    public static File[] a(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] a(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Intent a(ComponentName componentName) {
        return Intent.makeMainActivity(componentName);
    }

    public static int a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = dd.a.a(str);
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
        return dd.a.a(context, a, str2) != 0 ? -2 : 0;
    }

    public static int b(Context context, String str) {
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
            return ba.a(resources, i, theme);
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
        if (drawable instanceof js) {
            ((js) drawable).setTint(i);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof js) {
            ((js) drawable).setTintList(colorStateList);
        }
    }

    public static void a(Drawable drawable, Mode mode) {
        if (drawable instanceof js) {
            ((js) drawable).setTintMode(mode);
        }
    }

    public static Drawable b(Drawable drawable) {
        if (drawable instanceof js) {
            return drawable;
        }
        return new jj(drawable);
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        drawable.inflate(resources, xmlPullParser, attributeSet);
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case wi.w /*0*/:
            case wi.l /*2*/:
            case wi.z /*3*/:
            case wi.h /*4*/:
            case wi.p /*5*/:
            case wi.s /*6*/:
                return true;
            case wi.j /*1*/:
            case wi.q /*7*/:
            case wi.n /*9*/:
                return false;
            default:
                return true;
        }
    }

    public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        if (VERSION.SDK_INT >= 11) {
            b((AsyncTask) asyncTask, (Object[]) paramsArr);
        } else {
            asyncTask.execute(paramsArr);
        }
        return asyncTask;
    }

    public static <Params, Progress, Result> void b(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
    }

    public static boolean c() {
        return VERSION.SDK_INT >= 24;
    }

    public static Object d() {
        return new CancellationSignal();
    }

    public static void c(Object obj) {
        ((CancellationSignal) obj).cancel();
    }

    public static <T> Creator<T> a(kd<T> kdVar) {
        if (VERSION.SDK_INT >= 13) {
            return new kc(kdVar, (byte) 0);
        }
        return new kc(kdVar);
    }

    public static void d(String str) {
        if (VERSION.SDK_INT >= 18) {
            ba.a(str);
        }
    }

    public static void e() {
        if (VERSION.SDK_INT >= 18) {
            ba.a();
        }
    }

    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
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

    public static Object f() {
        return new AccessibilityDelegate();
    }

    public static Object a(ly lyVar) {
        return new lx(lyVar);
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

    public static Object a(ma maVar) {
        return new lz(maVar);
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

    public static void a(LayoutInflater layoutInflater, mw mwVar) {
        layoutInflater.setFactory(mwVar != null ? new mu(mwVar) : null);
    }

    public static mw a(LayoutInflater layoutInflater) {
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof mu) {
            return ((mu) factory).a;
        }
        return null;
    }

    public static int a(MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static int b(MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @Deprecated
    public static void a(MenuItem menuItem, int i) {
        nb.a(menuItem, i);
    }

    public static boolean a(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    public static boolean b(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    public static float a(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    public static boolean d(Object obj) {
        return ((ScaleGestureDetector) obj).isQuickScaleEnabled();
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }

    public static ColorStateList h(View view) {
        return view instanceof nv ? ((nv) view).c() : null;
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (view instanceof nv) {
            ((nv) view).a(colorStateList);
        }
    }

    public static Mode i(View view) {
        return view instanceof nv ? ((nv) view).d() : null;
    }

    public static void a(View view, Mode mode) {
        if (view instanceof nv) {
            ((nv) view).a(mode);
        }
    }

    public static boolean j(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static int k(View view) {
        if (!n) {
            try {
                m = View.class.getDeclaredField("mMinWidth");
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

    public static int l(View view) {
        if (!p) {
            try {
                o = View.class.getDeclaredField("mMinHeight");
                o.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            p = true;
        }
        if (o != null) {
            try {
                return ((Integer) o.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    public static boolean m(View view) {
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

    public static boolean c(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    public static boolean d(View view, int i) {
        return view.canScrollVertically(i);
    }

    public static void a(View view, Object obj) {
        view.setAccessibilityDelegate((AccessibilityDelegate) obj);
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

    public static boolean a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
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

    public static void a(View view, py pyVar) {
        view.animate().setListener(new pv(pyVar, view));
    }

    public static void a(View view, qa qaVar) {
        AnimatorUpdateListener animatorUpdateListener = null;
        if (qaVar != null) {
            animatorUpdateListener = new px(qaVar, view);
        }
        view.animate().setUpdateListener(animatorUpdateListener);
    }

    public static int e(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetBottom();
    }

    public static int f(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetLeft();
    }

    public static int g(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetRight();
    }

    public static int h(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetTop();
    }

    public static Object a(Object obj, int i, int i2, int i3, int i4) {
        return ((WindowInsets) obj).replaceSystemWindowInsets(i, i2, i3, i4);
    }

    public static boolean i(Object obj) {
        return ((WindowInsets) obj).isConsumed();
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

    public static void a(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).addAction((AccessibilityAction) obj2);
    }

    public static boolean b(Object obj, Object obj2) {
        return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityAction) obj2);
    }

    public static Object a(int i, int i2, boolean z, int i3) {
        return CollectionInfo.obtain(i, i2, z, i3);
    }

    public static Object a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return CollectionItemInfo.obtain(i, i2, i3, i4, z, z2);
    }

    public static Object a(int i, CharSequence charSequence) {
        return new AccessibilityAction(i, charSequence);
    }

    public static int j(Object obj) {
        return ((AccessibilityAction) obj).getId();
    }

    public static Object g() {
        return AccessibilityAction.ACTION_SCROLL_TO_POSITION;
    }

    public static Object h() {
        return AccessibilityAction.ACTION_SHOW_ON_SCREEN;
    }

    public static Object i() {
        return AccessibilityAction.ACTION_SCROLL_UP;
    }

    public static Object j() {
        return AccessibilityAction.ACTION_SCROLL_DOWN;
    }

    public static Object k() {
        return AccessibilityAction.ACTION_SCROLL_LEFT;
    }

    public static Object l() {
        return AccessibilityAction.ACTION_SCROLL_RIGHT;
    }

    public static Object m() {
        return AccessibilityAction.ACTION_CONTEXT_CLICK;
    }

    public static Object n() {
        return AccessibilityAction.ACTION_SET_PROGRESS;
    }

    public static Object k(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    public static void a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    public static void c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    public static int l(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    public static void a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    public static void b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    public static CharSequence m(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    public static CharSequence n(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    public static CharSequence o(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    public static CharSequence p(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    public static boolean q(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    public static boolean r(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    public static boolean s(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    public static boolean t(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    public static boolean u(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    public static boolean v(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    public static boolean w(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    public static boolean x(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    public static boolean y(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    public static boolean z(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    public static void c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    public static void d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    public static void a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setCheckable(z);
    }

    public static void b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setChecked(z);
    }

    public static void a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    public static void c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    public static void b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    public static void d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    public static void e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    public static void f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    public static void g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    public static void c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    public static void d(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    public static void h(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    public static void i(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    public static void e(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    public static void A(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }

    public static boolean B(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    public static void j(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    public static boolean C(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }

    public static void k(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }

    public static String D(Object obj) {
        return ((AccessibilityNodeInfo) obj).getViewIdResourceName();
    }

    public static void c(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionInfo((CollectionInfo) obj2);
    }

    public static void d(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionItemInfo((CollectionItemInfo) obj2);
    }

    public static Object a(int i, int i2, boolean z) {
        return CollectionInfo.obtain(i, i2, z);
    }

    public static Object a(int i, int i2, int i3, int i4, boolean z) {
        return CollectionItemInfo.obtain(i, i2, i3, i4, z);
    }

    public static Object a(rc rcVar) {
        return new rb(rcVar);
    }

    public static Object a(re reVar) {
        return new rd(reVar);
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

    public static boolean E(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    public static void F(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    public static boolean a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    public static boolean G(Object obj) {
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

    public static void a(ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            bc.a(listView, i);
        } else {
            ba.a(listView, i);
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

    public static float H(Object obj) {
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
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        int next;
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
                TypedArray a = a(resources, theme, attributeSet, wi.aB);
                int color = a.getColor(wi.aE, -65281);
                float f = 1.0f;
                if (a.hasValue(wi.aD)) {
                    f = a.getFloat(wi.aD, 1.0f);
                } else if (a.hasValue(wi.aC)) {
                    f = a.getFloat(wi.aC, 1.0f);
                }
                a.recycle();
                int i3 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i4 = 0;
                while (i4 < attributeCount) {
                    depth2 = attributeSet.getAttributeNameResource(i4);
                    if (depth2 == 16843173 || depth2 == 16843551 || depth2 == E) {
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
                    obj = new int[wm.a(i)];
                    System.arraycopy(obj3, 0, obj, 0, i);
                } else {
                    obj = obj3;
                }
                obj[i] = i2;
                if (i + 1 > obj2.length) {
                    obj3 = (Object[]) Array.newInstance(obj2.getClass().getComponentType(), wm.a(i));
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
        return ja.b(i, Math.round(((float) Color.alpha(i)) * f));
    }

    public static Menu a(Context context, jt jtVar) {
        if (VERSION.SDK_INT >= 14) {
            return new yr(context, jtVar);
        }
        throw new UnsupportedOperationException();
    }

    public static MenuItem a(Context context, ju juVar) {
        if (VERSION.SDK_INT >= 16) {
            return new yi(context, juVar);
        }
        if (VERSION.SDK_INT >= 14) {
            return new yd(context, juVar);
        }
        throw new UnsupportedOperationException();
    }

    public static SubMenu a(Context context, jv jvVar) {
        if (VERSION.SDK_INT >= 14) {
            return new yw(context, jvVar);
        }
        throw new UnsupportedOperationException();
    }

    public static int a(aep aep, ads ads, View view, View view2, aef aef, boolean z, boolean z2) {
        if (aef.w() == 0 || aep.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max;
        int min = Math.min(aef.d(view), aef.d(view2));
        int max2 = Math.max(aef.d(view), aef.d(view2));
        if (z2) {
            max = Math.max(0, (aep.d() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(ads.b(view2) - ads.a(view))) / ((float) (Math.abs(aef.d(view) - aef.d(view2)) + 1)))) + ((float) (ads.c() - ads.a(view))));
    }

    public static int a(aep aep, ads ads, View view, View view2, aef aef, boolean z) {
        if (aef.w() == 0 || aep.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(aef.d(view) - aef.d(view2)) + 1;
        }
        return Math.min(ads.f(), ads.b(view2) - ads.a(view));
    }

    public static int b(aep aep, ads ads, View view, View view2, aef aef, boolean z) {
        if (aef.w() == 0 || aep.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return aep.d();
        }
        return (int) ((((float) (ads.b(view2) - ads.a(view))) / ((float) (Math.abs(aef.d(view) - aef.d(view2)) + 1))) * ((float) aep.d()));
    }

    public static agk c(Context context) {
        return a(context, ahg.class);
    }

    public static agk a(Context context, Class<? extends ahg> cls) {
        return new agk(context, cls);
    }

    public static agk b(Context context, Class<? extends Activity> cls) {
        return new agk(context, cls);
    }

    public static int a(InputStream inputStream, long j) {
        if (inputStream == null) {
            return 0;
        }
        int i;
        int i2;
        int i3;
        ahr ahr = new ahr(inputStream, 16, false);
        if (a(ahr, j, 1)) {
            if (ahr.a(0) == -1 && ahr.a(1) == -40) {
                i = 1;
            } else {
                boolean z = false;
            }
            if (i == 0) {
                return 0;
            }
        }
        i = 0;
        while (a(ahr, j, i + 3)) {
            i2 = i + 1;
            if ((ahr.a(i) & 255) != 255) {
                i3 = i2;
                i2 = 0;
                break;
            }
            i3 = ahr.a(i2) & 255;
            int a;
            if (i3 != 255) {
                i = i2 + 1;
                if (!(i3 == 216 || i3 == 1)) {
                    if (i3 != 217 && i3 != 218) {
                        a = a(ahr, i, 2, false);
                        if (a >= 2 && a(ahr, j, (i + a) - 1)) {
                            if (i3 == 225 && a >= 8 && a(ahr, i + 2, 4, false) == 1165519206 && a(ahr, i + 6, 2, false) == 0) {
                                i2 = i + 8;
                                i = a - 8;
                                ahr.c(i2 - 4);
                                i3 = i2;
                                i2 = i;
                                break;
                            }
                            i += a;
                            ahr.c(i - 4);
                        } else {
                            Log.e("CameraExif", "Invalid length");
                            return 0;
                        }
                    }
                    ahr.c(i - 4);
                    i2 = 0;
                    i3 = i;
                    break;
                }
            }
            i = i2;
        }
        i2 = 0;
        i3 = i;
        if (i2 <= 8) {
            return 0;
        }
        i = a(ahr, i3, 4, false);
        if (i == 1229531648 || i == 1296891946) {
            z = i == 1229531648;
            int a2 = a(ahr, i3 + 4, 4, z) + 2;
            if (a2 < 10 || a2 > i2) {
                Log.e("CameraExif", "Invalid offset");
                return 0;
            }
            i3 += a2;
            a2 = i2 - a2;
            ahr.c(i3 - 4);
            i2 = a(ahr, i3 - 2, 2, z);
            a = i3;
            i3 = a2;
            while (true) {
                a2 = i2 - 1;
                if (i2 <= 0 || i3 < 12) {
                    return 0;
                }
                if (a(ahr, a, 2, z) == 274) {
                    break;
                }
                a += 12;
                i2 = i3 - 12;
                ahr.c(a - 4);
                i3 = i2;
                i2 = a2;
            }
            switch (a(ahr, a + 8, 2, z)) {
                case wi.j /*1*/:
                    return 0;
                case wi.z /*3*/:
                    return 180;
                case wi.s /*6*/:
                    return 90;
                case wi.m /*8*/:
                    return 270;
                default:
                    return 0;
            }
        }
        Log.e("CameraExif", "Invalid byte order");
        return 0;
    }

    public static int a(ahr ahr, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (i4 << 8) | (ahr.a(i) & 255);
            i += i3;
            i2 = i5;
        }
    }

    public static boolean a(ahr ahr, long j, int i) {
        if (j >= 0) {
            return ((long) i) < j;
        } else {
            return ahr.b(i);
        }
    }

    @Deprecated
    public static int a(byte[] bArr) {
        return a(new ByteArrayInputStream(bArr), (long) bArr.length);
    }

    public static boolean e(String str) {
        return str != null && str.startsWith("image/");
    }

    public static boolean f(String str) {
        return str != null && (str.startsWith("audio/") || str.equalsIgnoreCase("application/ogg"));
    }

    public static boolean g(String str) {
        return str != null && str.startsWith("video/");
    }

    public static boolean h(String str) {
        return str != null && str.equalsIgnoreCase("text/x-vCard");
    }

    public static boolean i(String str) {
        return str != null && str.endsWith("*");
    }

    public static boolean j(String str) {
        return f(str) || g(str) || e(str);
    }

    public static String a(String str, String str2) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension == null ? str2 : mimeTypeFromExtension;
    }

    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, strArr, str, strArr2, str2);
        } catch (SQLiteException e) {
        } catch (IllegalArgumentException e2) {
        }
        return cursor;
    }

    public static int a(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i = -1;
        try {
            i = contentResolver.update(uri, contentValues, null, null);
        } catch (SQLiteException e) {
        } catch (IllegalArgumentException e2) {
        }
        return i;
    }

    public static Uri a(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        Uri uri2 = null;
        try {
            uri2 = contentResolver.insert(uri, contentValues);
        } catch (SQLiteException e) {
        } catch (IllegalArgumentException e2) {
        }
        return uri2;
    }

    public static boolean k(String str) {
        return "application/vnd.oma.drm.message".equals(str);
    }

    public static String b(String str, int i) {
        Object spannableStringBuilder = new SpannableStringBuilder(str);
        PhoneNumberUtils.formatNumber(spannableStringBuilder, i);
        return spannableStringBuilder.toString();
    }

    public static boolean a(char c) {
        return (' ' <= c && c <= '~') || c == '\r' || c == '\n';
    }

    public static boolean a(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean b(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean c(Uri uri) {
        return a(uri) && b(uri);
    }

    public static boolean d(Uri uri) {
        return a(uri) && !b(uri);
    }

    public static boolean c(int i, int i2) {
        return i <= 512 && i2 <= 384;
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T I(T t) {
        return a((Object) t, "Argument must not be null");
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String l(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T extends Collection<Y>, Y> T a(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public static jfp o() {
        return new jfp(0.61f, 0.89f, 0.81f, 1.0f);
    }

    public static jfp p() {
        return new jfp(0.0f, 0.07f, 0.53f, 1.0f);
    }

    public static Animator a(float f, float f2, float f3, float f4) {
        Animator animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(null, View.SCALE_X, new float[]{f, f2});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(null, View.SCALE_Y, new float[]{f, f2});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(null, View.ALPHA, new float[]{f3, f4});
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        return animatorSet;
    }

    public static AlertDialog a(Context context, bgc bgc, beq beq, fdv fdv, int i, String str) {
        boolean z;
        CharSequence f = glq.f(context);
        String c = beq.c();
        if (TextUtils.isEmpty(f)) {
            z = false;
        } else {
            z = c.equals(f);
        }
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(context).setTitle(ba.gt).setNegativeButton(ba.gq, new bex(fdv, context, i, str, bgc));
        if (z) {
            negativeButton.setMessage(ba.gr).setPositiveButton(ba.gu, new bey(context, i));
        } else {
            negativeButton.setMessage(context.getString(ba.gs, new Object[]{glq.h(context, c)}));
        }
        return negativeButton.create();
    }

    public static AlertDialog a(Context context, bgc bgc, bfj bfj, String str) {
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int round = Math.round(10.0f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
        int round2 = Math.round(25.0f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
        layoutParams.setMargins(round2, round, round2, 0);
        View linearLayout = new LinearLayout(context);
        TextView textView = new TextView(context);
        a(textView, context, context.getResources().getString(ba.gy, new Object[]{K("android_caller_id").toString()}));
        linearLayout.addView(textView, layoutParams);
        return new AlertDialog.Builder(context).setTitle(ba.gz).setView(linearLayout).setNegativeButton(ba.gw, new bfa(bgc)).setPositiveButton(ba.gx, new bez(bfj, str)).create();
    }

    public static Intent a(Context context, boolean z, int i, String str) {
        Intent intent = new Intent(context, CallerIdPromoActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i);
        intent.putExtra("callerid_from_promo_flow", false);
        intent.putExtra("callerid_current_sim_number", str);
        return intent;
    }

    public static boolean d(Context context) {
        return a(context, "babel_dialer_disable_promos_for_callerid", false);
    }

    public static boolean e(Context context, int i) {
        return ((jcf) jyn.a(context, jcf.class)).a(i).a("callerid_promo_shown", false);
    }

    public static void f(Context context, int i) {
        ((jcf) jyn.a(context, jcf.class)).b(i).b("callerid_promo_shown", true).d();
    }

    public static boolean a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Object e = fde.e(i);
        ba.a(e);
        ArrayList r = e.r();
        int size = r.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = r.get(i2);
            i2++;
            if (str.equals((String) obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Context context, int i) {
        bko e = fde.e(i);
        if (e == null || e.s() || !e(context)) {
            return false;
        }
        if (a(context, "babel_callerid_permit_for_all_accounts_if_any_enabled", false)) {
            return f(context);
        }
        return e.y();
    }

    public static boolean e(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo("com.google.android.apps.hangoutsdialer", 0).versionCode >= a(context, "babel_dialer_versioncode_for_callerid", 1376)) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean f(Context context) {
        for (Integer a : ((jcf) jyn.a(context, jcf.class)).a()) {
            Object e = fde.e(a(a));
            ba.a(e);
            if (e.y()) {
                return true;
            }
        }
        return false;
    }

    public static biw g(Context context) {
        //creates a biw from the given context (successful if the context is a jyq)
        //returns some object that's related to the jyn from the given jyq context
        return (biw) jyn.b(context, biw.class);
    }

    public static String b(Context context, String str, String str2) {
        // Called by gcw to create a biw (biz implements biw)
        biw biw = (biw) jyn.b(context, biw.class);
        // If not successfull, just return str2, otherwise... not sure
        return biw == null ? str2 : biw.a(str, str2);
    }

    public static int a(Context context, String str, int i) {
        biw biw = (biw) jyn.b(context, biw.class);
        return biw == null ? i : biw.a(str, i);
    }

    public static long a(Context context, String str, long j) {
        biw biw = (biw) jyn.b(context, biw.class);
        return biw == null ? j : biw.a(str, j);
    }

    //returns cache result if cache entry exists else returns boolean z as default value
    public static boolean a(Context context, String str, boolean z) {

        biw biw = (biw) jyn.b(context, biw.class);
        return biw == null ? z : biw.a(str, z);
    }

    public static String a(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        return TextUtils.join("|", strArr);
    }

    public static Iterable<String> m(String str) {
        if (str == null) {
            return null;
        }
        if (str.indexOf(124) < 0) {
            return Arrays.asList(new String[]{str});
        }
        Iterable<String> simpleStringSplitter = new SimpleStringSplitter('|');
        simpleStringSplitter.setString(str);
        return simpleStringSplitter;
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        if (str.indexOf(124) < 0) {
            return str;
        }
        StringSplitter simpleStringSplitter = new SimpleStringSplitter('|');
        simpleStringSplitter.setString(str);
        return (String) simpleStringSplitter.iterator().next();
    }

    public static ib a(bko bko, boolean z, int i) {
        String str;
        if (i <= 0) {
            i = 100;
        }
        if (z) {
            str = "call_type = 1";
        } else {
            str = null;
        }
        return new ib(H(), EsProvider.a(bko, i), ble.a, str, null, "call_timestamp DESC");
    }

    public static void a(bko bko, int i, fdv fdv) {
        bmv b = bmr.a(H(), bko.g()).b();
        b.a();
        try {
            String h = ba.h(glq.c(H(), fdv.b()));
            ContentValues contentValues = new ContentValues();
            contentValues.put("normalized_number", h);
            contentValues.put("phone_number", fdv.b());
            contentValues.put("contact_id", fdv.c());
            contentValues.put("call_timestamp", Long.valueOf(fdv.d()));
            contentValues.put("call_type", Integer.valueOf(i));
            contentValues.put("contact_type", Integer.valueOf(fdv.e()));
            b.a("recent_calls", null, contentValues);
            b.b();
            H().getContentResolver().notifyChange(EsProvider.a(bko, -1), null);
        } finally {
            b.c();
        }
    }

    public static void a(bko bko, long j, String str, boolean z) {
        int i = 1;
        bmv b = bmr.a(H(), bko.g()).b();
        b.a();
        try {
            int i2;
            ContentValues contentValues = new ContentValues();
            contentValues.put("call_rate", str);
            String str2 = "is_free_call";
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            contentValues.put(str2, Integer.toString(i2));
            i2 = b.a("recent_calls", contentValues, "call_timestamp=?", new String[]{Long.toString(j)});
            if (i2 == 1) {
                b.b();
            } else {
                String str3 = "Babel_db";
                str2 = String.valueOf("Attemped to update recent_calls where call_timestamp = ");
                String valueOf = String.valueOf("call_rate");
                String valueOf2 = String.valueOf("is_free_call");
                if (!z) {
                    i = 0;
                }
                glk.d(str3, new StringBuilder((((String.valueOf(str2).length() + 115) + String.valueOf(valueOf).length()) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(str2).append(j).append(" with ").append(valueOf).append(" = ").append(str).append(" and ").append(valueOf2).append(" = ").append(i).append(". Expected this to change 1 row, actually changed ").append(i2).append(" rows.").toString(), new Object[0]);
            }
            b.c();
            H().getContentResolver().notifyChange(EsProvider.a(bko, -1), null);
        } catch (Throwable th) {
            b.c();
        }
    }

    public static void b(bko bko) {
        a(bko, null, null);
    }

    public static void a(bko bko, String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder("_id IN(?");
        for (int i = 1; i < strArr.length; i++) {
            stringBuilder.append(",?");
        }
        stringBuilder.append(")");
        a(bko, stringBuilder.toString(), strArr);
    }

    public static void a(bko bko, String str, String[] strArr) {
        bmr.a(H(), bko.g()).b().a("recent_calls", str, strArr);
        H().getContentResolver().notifyChange(EsProvider.p, null);
    }

    public static boolean a(bko bko, bnc bnc) {
        for (bnd a : jyn.c(H(), bnd.class)) {
            if (a.a(bko.g(), bnc)) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(Context context, int i) {
        for (bne a : jyn.c(context, bne.class)) {
            if (a.a(i)) {
                return false;
            }
        }
        return true;
    }

    public static String a(List<fpd> list, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (list == null) {
            return null;
        }
        for (fpd fpd : list) {
            if (fpd.a == 0) {
                b(fpd, stringBuilder);
            } else if (fpd.a == 1) {
                stringBuilder.append("<br/>");
            } else if (fpd.a == 2) {
                if (str == null || !TextUtils.equals(str, fpd.d)) {
                    String str2;
                    Object obj = fpd.b;
                    if (TextUtils.isEmpty(obj)) {
                        str2 = fpd.d;
                    } else {
                        str2 = TextUtils.htmlEncode(obj);
                    }
                    String str3 = fpd.d;
                    stringBuilder.append(new StringBuilder((String.valueOf(str3).length() + 15) + String.valueOf(str2).length()).append("<a href=\"").append(str3).append("\">").append(str2).append("</a>").toString());
                }
            } else if (fpd.a == 3) {
                a(fpd, stringBuilder);
            } else if (fpd.a == 4) {
                b(fpd, stringBuilder);
            } else {
                b(fpd, stringBuilder);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean b(List<fpd> list, String str) {
        for (fpd fpd : list) {
            if (fpd.a == 3 && str.equalsIgnoreCase(fpd.f)) {
                return true;
            }
        }
        return false;
    }

    public static void a(fpd fpd, StringBuilder stringBuilder) {
        stringBuilder.append("<usermention gaia_id=\"");
        stringBuilder.append(fpd.e);
        stringBuilder.append("\"");
        if (fpd.f != null) {
            stringBuilder.append(" id=\"");
            stringBuilder.append(fpd.f);
            stringBuilder.append("\"");
        }
        if (fpd.g != null) {
            stringBuilder.append(" email=\"");
            stringBuilder.append(fpd.g);
            stringBuilder.append("\"");
        }
        stringBuilder.append(">");
        stringBuilder.append(fpd.b);
        stringBuilder.append("</usermention>");
    }

    public static void b(fpd fpd, StringBuilder stringBuilder) {
        Object obj;
        Object obj2;
        Object obj3 = 1;
        Object obj4 = (fpd.c & 1) != 0 ? 1 : null;
        if ((fpd.c & 2) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if ((fpd.c & 4) != 0) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if ((fpd.c & 8) == 0) {
            obj3 = null;
        }
        if (obj4 != null) {
            stringBuilder.append("<b>");
        }
        if (obj != null) {
            stringBuilder.append("<i>");
        }
        if (obj2 != null) {
            stringBuilder.append("<del>");
        }
        if (obj3 != null) {
            stringBuilder.append("<u>");
        }
        stringBuilder.append(TextUtils.htmlEncode(fpd.b.replaceAll("  ", " \u00a0")));
        if (obj3 != null) {
            stringBuilder.append("</u>");
        }
        if (obj2 != null) {
            stringBuilder.append("</del>");
        }
        if (obj != null) {
            stringBuilder.append("</i>");
        }
        if (obj4 != null) {
            stringBuilder.append("</b>");
        }
    }

    public static List<fpd> b(CharSequence charSequence) {
        return a(charSequence, 0);
    }

    public static List<fpd> a(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return Collections.emptyList();
        }
        SpannedString spannedString = new SpannedString(charSequence);
        return a(spannedString, i, 0, spannedString.length());
    }

    public static List<fpd> a(SpannedString spannedString, int i, int i2, int i3) {
        List<fpd> arrayList = new ArrayList();
        if (i2 >= i3) {
            return arrayList;
        }
        byj[] byjArr = (byj[]) spannedString.getSpans(i2, i3, byj.class);
        if (byjArr.length == 0) {
            return b(spannedString.subSequence(i2, i3), i);
        }
        byj byj = byjArr[0];
        int spanStart = spannedString.getSpanStart(byj);
        int spanEnd = spannedString.getSpanEnd(byj);
        fpd fpd = new fpd(3, spannedString.subSequence(spanStart, spanEnd).toString().trim(), i, null, null, byj.a(), byj.b(), null);
        arrayList.addAll(a(spannedString, i, i2, spanStart));
        arrayList.add(fpd);
        arrayList.addAll(a(spannedString, i, spanEnd, i3));
        return arrayList;
    }

    public static List<fpd> b(CharSequence charSequence, int i) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(charSequence)) {
            return arrayList;
        }
        String[] split = charSequence.toString().split("\\r?\\n", -1);
        for (int i2 = 0; i2 < split.length; i2++) {
            CharSequence spannableString = new SpannableString(split[i2]);
            Linkify.addLinks(spannableString, 1);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length() - 1, URLSpan.class);
            int length = spannableString.length();
            int i3 = 0;
            char[] cArr = null;
            int i4 = 0;
            int length2 = uRLSpanArr.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length2) {
                int i7;
                int i8;
                char[] cArr2;
                String concat;
                Object obj = uRLSpanArr[i5];
                int spanStart = spannableString.getSpanStart(obj);
                int spanEnd = spannableString.getSpanEnd(obj);
                if (i6 != spanStart) {
                    i7 = (spanStart - i6) + 1;
                    if (i7 > i4) {
                        i8 = i7;
                        cArr2 = new char[i7];
                    } else {
                        i8 = i4;
                        cArr2 = cArr;
                    }
                    spannableString.getChars(i6, spanStart, cArr2, 0);
                    arrayList.add(new fpd(0, new String(cArr2, 0, i7 - 1), i, null, null, null, null, null));
                    i4 = i8;
                    cArr = cArr2;
                }
                i7 = (spanEnd - spanStart) + 1;
                if (i7 > i4) {
                    i8 = i7;
                    cArr2 = new char[i7];
                } else {
                    i8 = i4;
                    cArr2 = cArr;
                }
                spannableString.getChars(spanStart, spanEnd, cArr2, 0);
                String str = new String(cArr2, 0, i7 - 1);
                Uri parse = Uri.parse(str);
                if (parse.getAuthority() == null) {
                    String str2 = "http://";
                    String valueOf = String.valueOf(str);
                    concat = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                } else {
                    concat = parse.normalizeScheme().toString();
                }
                arrayList.add(new fpd(2, str, 0, concat, null, null, null, null));
                i5++;
                i4 = i8;
                cArr = cArr2;
                i3 = spanEnd;
                i6 = spanEnd;
            }
            if (length != i3) {
                char[] cArr3;
                i6 = (length - i3) + 1;
                if (i6 > i4) {
                    cArr3 = new char[i6];
                } else {
                    cArr3 = cArr;
                }
                spannableString.getChars(i3, length, cArr3, 0);
                arrayList.add(new fpd(0, new String(cArr3, 0, i6 - 1), i, null, null, null, null, null));
            }
            if (i2 < split.length - 1) {
                arrayList.add(new fpd(1, null, 0, null, null, null, null, null));
            }
        }
        return arrayList;
    }

    public static bop a(bko bko, String str, String str2, boolean z) {
        edo edo = new edo(str, str2);
        if (bko.a(edo)) {
            return new bop(true, null, null);
        }
        edk a = ((bog) jyn.a(H(), bog.class)).a(bko).a(edo, z);
        if (a == null) {
            return new bop(false, null, null);
        }
        return new bop(false, a.e, a.f);
    }

    public static List<String> a(bko bko, boolean z, String str, boolean z2, boolean z3) {
        List<String> list;
        if (str != null) {
            boe a = ((bog) jyn.a(H(), bog.class)).a(bko);
            List<String> arrayList = new ArrayList();
            SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter('|');
            simpleStringSplitter.setString(str);
            Iterator it = simpleStringSplitter.iterator();
            while (it.hasNext()) {
                edk a2 = a.a((String) it.next(), z3);
                if (a2 == null) {
                    return null;
                }
                if (!z2 || !bko.a(a2.b)) {
                    arrayList.add(a(H(), a2, z));
                }
            }
            list = arrayList;
        } else {
            list = null;
        }
        return list;
    }

    public static List<edo> a(bko bko, String str, boolean z, boolean z2) {
        List<edo> list;
        if (str != null) {
            boe a = ((bog) jyn.a(H(), bog.class)).a(bko);
            List<edo> arrayList = new ArrayList();
            SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter('|');
            simpleStringSplitter.setString(str);
            Iterator it = simpleStringSplitter.iterator();
            while (it.hasNext()) {
                edk a2 = a.a((String) it.next(), z2);
                if (a2 == null) {
                    return null;
                }
                if (a2.b != null && b(a2.b).a()) {
                    arrayList.add(a2.b);
                }
            }
            list = arrayList;
        } else {
            list = null;
        }
        return list;
    }

    public static String a(fwy fwy, bko bko, fwx fwx, String str, String str2, String str3, String str4, int i, boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        switch (boo.a[fwy.ordinal()]) {
            case wi.j /*1*/:
                return a(bko, fwx, str, str2, str3, false);
            case wi.l /*2*/:
            case wi.z /*3*/:
                if (fdq.i.b(bko.g())) {
                    if (fwy == fwy.MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT) {
                        z3 = true;
                    }
                    return a(bko, str4, str, str2, z, z3);
                }
                if (fwy != fwy.MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT) {
                    z2 = false;
                }
                return b(bko, str4, z, z2);
            case wi.h /*4*/:
                if (fwx != fwx.FAILED_TO_SEND) {
                    return a(bko, str, str2, str4, z);
                }
                break;
            case wi.p /*5*/:
            case wi.s /*6*/:
            case wi.q /*7*/:
                break;
            case wi.m /*8*/:
                return a(bko, str, str2, i, z);
            case wi.n /*9*/:
                return a(bko, str, str2, str4, i, z);
            case wi.dr /*10*/:
                return e(bko, str, str2, z);
            case wi.dB /*11*/:
                return f(bko, str, str2, z);
            case wi.dM /*12*/:
            case wi.dD /*13*/:
            case wi.g /*14*/:
            case wi.dJ /*15*/:
            case wi.dI /*16*/:
                return null;
            case wi.dK /*17*/:
                return "";
            case wi.dH /*18*/:
                return d(bko, str, str2, z);
            case wi.dL /*19*/:
                return c(bko, str, str2, z);
            case wi.k /*20*/:
                return b(bko, str, str2, z);
            default:
                String valueOf = String.valueOf(fwy);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 25).append("Unexpected message type: ").append(valueOf).toString());
        }
        return a(bko, str4, z, fwy);
    }

    public static List<edo> a(bko bko, String str, boolean z) {
        return a(bko, str, false, z);
    }

    public static String a(bko bko, fwx fwx, String str, String str2, String str3, boolean z) {
        bop a = a(bko, str, str2, false);
        Context H = H();
        if (fwx == fwx.FAILED_TO_SEND) {
            return H.getString(bc.sE, new Object[]{str3});
        } else if (TextUtils.isEmpty(str3)) {
            if (a.a) {
                return H.getString(bc.sD);
            }
            if (a.b == null) {
                return H.getString(bc.sB);
            }
            return H.getString(bc.sC, new Object[]{a.b});
        } else if (a.a) {
            return H.getString(bc.sA, new Object[]{str3});
        } else if (a.b != null) {
            return H.getString(bc.sz, new Object[]{a.b, str3});
        } else {
            return H.getString(bc.sy, new Object[]{str3});
        }
    }

    public static String b(bko bko, String str, boolean z, boolean z2) {
        List a = a(bko, false, str, false, z);
        Context H = H();
        if (a == null || a.size() <= 0) {
            Object obj = null;
        } else {
            String str2 = (String) a.get(0);
        }
        int i;
        if (obj != null) {
            if (z2) {
                i = bc.sq;
            } else {
                i = bc.sp;
            }
            return H.getString(i, new Object[]{obj});
        }
        if (z2) {
            i = bc.sr;
        } else {
            i = bc.ss;
        }
        return H.getString(i);
    }

    public static String a(bko bko, String str, String str2, String str3, boolean z, boolean z2) {
        List a = a(bko, false, str, false, z);
        Context H = H();
        bop a2 = a(bko, str2, str3, z);
        boe a3 = ((bog) jyn.a(H, bog.class)).a(bko);
        edk a4 = a3.a(new edo(str2, str3), z);
        edk a5 = a3.a(str, z);
        if (a == null || a.size() <= 0) {
            Object obj = null;
        } else {
            String str4 = (String) a.get(0);
        }
        if (a4 == null || a5 == null || !a4.b.equals(a5.b)) {
            boolean z3 = false;
        } else {
            int i = 1;
        }
        if (obj != null && r0 != 0) {
            if (z2) {
                i = bc.sq;
            } else {
                i = bc.sp;
            }
            return H.getString(i, new Object[]{obj});
        } else if (obj != null && a4 != null && a2.a) {
            return H.getString(bc.sm, new Object[]{obj});
        } else if (obj != null && a4 != null && a2.b != null) {
            return H.getString(bc.sl, new Object[]{a2.b, obj});
        } else if (obj != null) {
            return H.getString(bc.so, new Object[]{obj});
        } else {
            if (z2) {
                i = bc.sr;
            } else {
                i = bc.ss;
            }
            return H.getString(i);
        }
    }

    public static String a(bko bko, String str, String str2, String str3, boolean z) {
        bop a = a(bko, str, str2, z);
        List a2 = a(bko, false, str3, false, z);
        Context H = H();
        if (a2 != null && a2.size() > 0) {
            int size = a2.size();
            String str4;
            if (size == 1) {
                boe a3 = ((bog) jyn.a(H, bog.class)).a(bko);
                edk a4 = a3.a(new edo(str, str2), z);
                edk a5 = a3.a(str3, z);
                str4 = (String) a2.get(0);
                if (a4 == null || !a.a) {
                    if (a4 == null || a.b == null) {
                        return H.getString(bc.sk, new Object[]{str4});
                    } else if (a4.b.equals(a5.b)) {
                        return H.getString(bc.st, new Object[]{str4});
                    } else {
                        return H.getString(bc.si, new Object[]{a.b, str4});
                    }
                } else if (a4.b.equals(a5.b)) {
                    return H.getString(bc.su);
                } else {
                    return H.getString(bc.sj, new Object[]{str4});
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < a2.size() - 1; i++) {
                stringBuilder.append((String) a2.get(i));
                if (i < size - 2) {
                    stringBuilder.append(", ");
                }
            }
            str4 = (String) a2.get(size - 1);
            if (a.a) {
                return H.getString(bc.sw, new Object[]{stringBuilder.toString(), str4});
            } else if (a.b != null) {
                return H.getString(bc.sv, new Object[]{a.b, stringBuilder.toString(), str4});
            } else {
                return H.getString(bc.sx, new Object[]{stringBuilder.toString(), str4});
            }
        } else if (a.a) {
            return H.getString(bc.sG);
        } else {
            if (a.b == null) {
                return H.getString(bc.sH);
            }
            return H.getString(bc.sF, new Object[]{a.b});
        }
    }

    public static String b(bko bko, String str, String str2, boolean z) {
        bop a = a(bko, str, str2, z);
        Context H = H();
        if (a.a) {
            return H.getString(bc.rW);
        }
        return H.getString(bc.rX, new Object[]{a.b});
    }

    public static String c(bko bko, String str, String str2, boolean z) {
        bop a = a(bko, str, str2, z);
        Context H = H();
        if (a.a) {
            return H.getString(bc.rs);
        }
        return H.getString(bc.rt, new Object[]{a.b});
    }

    public static String d(bko bko, String str, String str2, boolean z) {
        bop a = a(bko, str, str2, z);
        Context H = H();
        if (a.a) {
            return H.getString(bc.rw);
        }
        return H.getString(bc.rx, new Object[]{a.b});
    }

    public static String e(bko bko, String str, String str2, boolean z) {
        bop a = a(bko, str, str2, z);
        Context H = H();
        if (a.a) {
            return H.getString(bc.sa);
        }
        return H.getString(bc.sb, new Object[]{a.b});
    }

    public static String f(bko bko, String str, String str2, boolean z) {
        bop a = a(bko, str, str2, z);
        Context H = H();
        if (a.a) {
            return H.getString(bc.se);
        }
        return H.getString(bc.sf, new Object[]{a.b});
    }

    public static String a(bko bko, String str, boolean z, fwy fwy) {
        int i = -1;
        List list = null;
        if (!TextUtils.isEmpty(str)) {
            List a = a(bko, false, str, false, z);
            List list2 = a;
            i = a == null ? 0 : a.size();
            list = list2;
        }
        Context H = H();
        if (fwy == fwy.ERROR_FORK) {
            int i2 = 1;
        } else {
            boolean z2 = false;
        }
        if (fwy == fwy.ERROR_FORCE_OTR_CONFLICT) {
            int i3 = 1;
        } else {
            boolean z3 = false;
        }
        switch (i) {
            case -1:
                return H.getString(bc.rp);
            case wi.w /*0*/:
                int i4;
                if (i2 != 0) {
                    i4 = bc.rN;
                } else if (i3 != 0) {
                    i4 = bc.rS;
                } else {
                    i4 = bc.rV;
                }
                return H.getString(i4);
            case wi.j /*1*/:
                if (i2 != 0) {
                    i = bc.rJ;
                } else if (i3 != 0) {
                    i = bc.rO;
                } else {
                    i = bc.rH;
                }
                return H.getString(i, new Object[]{list.get(0)});
            case wi.l /*2*/:
                if (i2 != 0) {
                    i = bc.rM;
                } else if (i3 != 0) {
                    i = bc.rR;
                } else {
                    i = bc.rU;
                }
                return H.getString(i, new Object[]{list.get(0), list.get(1)});
            case wi.z /*3*/:
                if (i2 != 0) {
                    i = bc.rL;
                } else if (i3 != 0) {
                    i = bc.rQ;
                } else {
                    i = bc.rT;
                }
                return H.getString(i, new Object[]{list.get(0), list.get(1), list.get(2)});
            default:
                if (i2 != 0) {
                    i2 = bc.rK;
                } else if (i3 != 0) {
                    i2 = bc.rP;
                } else {
                    i2 = bc.rI;
                }
                return H.getString(i2, new Object[]{list.get(0), list.get(1), Integer.valueOf(i - 2)});
        }
    }

    public static String a(bko bko, String str, String str2, int i, boolean z) {
        bop a = a(bko, str, str2, z);
        Context H = H();
        int i2;
        if (a.a) {
            if (i == 1) {
                i2 = bc.sQ;
            } else {
                i2 = bc.rG;
            }
            return H.getString(i2);
        } else if (a.b != null) {
            if (i == 1) {
                i2 = bc.sP;
            } else {
                i2 = bc.rF;
            }
            return H.getString(i2, new Object[]{a.b});
        } else {
            if (i == 1) {
                i2 = bc.sO;
            } else {
                i2 = bc.rE;
            }
            return H.getString(i2);
        }
    }

    public static String a(bko bko, String str, String str2, String str3, int i, boolean z) {
        bop a = a(bko, str, str2, z);
        int i2 = -1;
        String str4 = null;
        List a2 = a(bko, true, str3, false, z);
        Iterable a3 = a(bko, true, str3, true, z);
        int i3;
        if (a2 == null || a3 == null) {
            i3 = 0;
        } else {
            i3 = a2.size();
            i2 = a3.size();
            if (i2 > 0) {
                str4 = TextUtils.join(", ", a3);
            }
        }
        Context H = H();
        if ((!a.a && a.c == null) || i2 < 0 || r2 < 0) {
            return H.getString(bc.rB);
        }
        int i4;
        if (a.a && i2 == 1 && r2 == 1) {
            if (str4 != null) {
                if (i == 1) {
                    i2 = bc.sN;
                } else {
                    i2 = bc.rD;
                }
                return H.getString(i2, new Object[]{str4});
            }
            if (i == 1) {
                i4 = bc.sK;
            } else {
                i4 = bc.rA;
            }
            return H.getString(i4);
        } else if (i2 <= 0 || r2 - i2 <= 0) {
            if (a.a && i2 == 0) {
                if (i == 1) {
                    i4 = bc.sK;
                } else {
                    i4 = bc.rA;
                }
                return H.getString(i4);
            } else if (!a.a && r2 == 1 && i2 == 1) {
                if (a.c != null) {
                    if (i == 1) {
                        i4 = bc.sI;
                    } else {
                        i4 = bc.ry;
                    }
                    return H.getString(i4, new Object[]{a.c});
                }
                if (i == 1) {
                    i4 = bc.sJ;
                } else {
                    i4 = bc.rz;
                }
                return H.getString(i4);
            } else if (a.a || i2 != r2) {
                if (i == 1) {
                    i4 = bc.sL;
                } else {
                    i4 = bc.rB;
                }
                return H.getString(i4);
            } else {
                if (i == 1) {
                    i4 = bc.sJ;
                } else {
                    i4 = bc.rz;
                }
                return H.getString(i4);
            }
        } else if (str4 != null) {
            if (i == 1) {
                i2 = bc.sM;
            } else {
                i2 = bc.rC;
            }
            return H.getString(i2, new Object[]{str4});
        } else {
            if (i == 1) {
                i4 = bc.sL;
            } else {
                i4 = bc.rB;
            }
            return H.getString(i4);
        }
    }

    public static String h(Context context) {
        return String.valueOf(context.getFilesDir().getAbsolutePath()).concat("/sticker_cache/");
    }

    public static String i(Context context) {
        String str = "file://";
        String valueOf = String.valueOf(h(context));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public static void a(Context context, int i, Intent intent) {
        bko e = fde.e(((jca) jyn.a(context, jca.class)).a());
        if (i == -1 && intent != null) {
            hkh a = a(context, intent);
            bxw bxw = new bxw();
            bxw.f = a;
            bxw.c = bxo.LOCATION;
            List arrayList = new ArrayList();
            arrayList.add(bxw);
            ((cdg) jyn.a(context, cdg.class)).a(arrayList);
            ((bpe) jyn.a(context, bpe.class)).a(new btz(e));
        } else if (i == 0) {
            a(e, 2051);
        }
    }

    public static void c(Context context, String str) {
        new AlertDialog.Builder(context).setTitle(ba.hW).setMessage(str).setCancelable(true).show();
    }

    public static void a(Context context, StringBuilder stringBuilder, long j, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append('\n');
            stringBuilder.append(context.getString(ba.hM, new Object[]{glq.i(context, str)}));
        }
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append('\n');
            stringBuilder.append(context.getString(ba.iN, new Object[]{str2}));
        }
        stringBuilder.append('\n');
        stringBuilder.append(context.getString(ba.iy, new Object[]{glj.a(j).toString()}));
        c(context, stringBuilder.toString());
    }

    public static String a(Context context, btf btf) {
        String str = null;
        StringBuilder stringBuilder = new StringBuilder();
        Resources resources = context.getResources();
        int i = btf.i == fwy.OUTGOING_USER_MESSAGE ? 1 : 0;
        String str2 = TextUtils.isEmpty(btf.t.g) ? null : btf.t.g;
        if (!TextUtils.isEmpty(btf.t.f)) {
            str = btf.t.f;
        }
        stringBuilder.append(resources.getString(ba.hZ, new Object[]{resources.getString(ba.iM)}));
        if (i != 0) {
            if (str2 != null) {
                stringBuilder.append('\n');
                stringBuilder.append(resources.getString(ba.iN, new Object[]{str2}));
            }
        } else if (str != null) {
            stringBuilder.append('\n');
            stringBuilder.append(resources.getString(ba.hM, new Object[]{glq.i(context, str)}));
        }
        if (i == 0 && btf.t.c != 0) {
            stringBuilder.append('\n');
            stringBuilder.append(resources.getString(ba.iy, new Object[]{glj.a(btf.b()).toString()}));
        }
        stringBuilder.append('\n');
        CharSequence a = glj.a(btf.b());
        if (i != 0) {
            stringBuilder.append(resources.getString(ba.iy, new Object[]{a}));
        } else {
            stringBuilder.append(resources.getString(ba.ix, new Object[]{a}));
        }
        return stringBuilder.toString();
    }

    public static String b(Context context, btf btf) {
        String str = null;
        Resources resources = context.getResources();
        int i = btf.i == fwy.OUTGOING_USER_MESSAGE ? 1 : 0;
        String str2 = TextUtils.isEmpty(btf.t.g) ? null : btf.t.g;
        if (!TextUtils.isEmpty(btf.t.f)) {
            str = btf.t.f;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getString(ba.hZ, new Object[]{resources.getString(ba.ip)}));
        if (str != null) {
            stringBuilder.append('\n');
            if (str == null) {
                str = resources.getString(ba.hP);
            } else {
                str = glq.i(context, str);
            }
            stringBuilder.append(resources.getString(ba.hM, new Object[]{str}));
        }
        if (str2 != null) {
            stringBuilder.append('\n');
            stringBuilder.append(resources.getString(ba.iN, new Object[]{str2}));
        }
        stringBuilder.append('\n');
        str2 = glj.a(btf.b()).toString();
        if (i == 0) {
            stringBuilder.append(resources.getString(ba.ix, new Object[]{str2}));
        } else {
            stringBuilder.append(resources.getString(ba.iy, new Object[]{str2}));
        }
        if (!TextUtils.isEmpty(fyi.b(context, btf.t.e))) {
            stringBuilder.append('\n');
            stringBuilder.append(resources.getString(ba.iB, new Object[]{btf.t.e}));
        }
        stringBuilder.append('\n');
        stringBuilder.append(resources.getString(ba.iu, new Object[]{a(resources, btf.t.b)}));
        if (btf.t.a > 0) {
            stringBuilder.append('\n');
            stringBuilder.append(resources.getString(ba.hX, new Object[]{Long.valueOf(fyi.b(btf.t.a))}));
        }
        return stringBuilder.toString();
    }

    public static String a(Resources resources, int i) {
        switch (i) {
            case 128:
                return resources.getString(ba.iv);
            case 130:
                return resources.getString(ba.it);
            default:
                return resources.getString(ba.iw);
        }
    }

    public static byte[] d(List<bxn> list) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutput objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static List<bxn> b(byte[] bArr) {
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
        Object readObject = objectInputStream.readObject();
        objectInputStream.close();
        return (List) readObject;
    }

    public static Spanned o(String str) {
        String valueOf = String.valueOf("<html><body><injectattributecache/>");
        return Html.fromHtml(new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(str).length()).append(valueOf).append(str).append("</body></html>").toString(), null, new byk());
    }

    public static void w(View view) {
        j(view.getContext()).toggleSoftInputFromWindow(view.getWindowToken(), 2, 0);
    }

    public static void x(View view) {
        y(view);
        a(new ccx(view));
    }

    public static void y(View view) {
        j(view.getContext()).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static InputMethodManager j(Context context) {
        return (InputMethodManager) context.getSystemService("input_method");
    }

    public static Uri b(Intent intent) {
        String stringExtra = intent.getStringExtra("photo_url");
        Uri parse = stringExtra != null ? Uri.parse(stringExtra) : null;
        if (parse == null) {
            String dataString = intent.getDataString();
            if (dataString != null) {
                parse = Uri.parse(dataString);
            }
            if (parse == null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    parse = (Uri) extras.getParcelable("android.intent.extra.STREAM");
                }
            }
        }
        if (parse != null) {
            String valueOf = String.valueOf(parse);
            glk.c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Chosen image URI is: ").append(valueOf).toString(), new Object[0]);
        } else {
            glk.d("Babel", "Image URI cannot be parsed from the intent.", new Object[0]);
        }
        return parse;
    }

    public static int p(String str) {
        iil.b();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
    }

    public static boolean k(Context context) {
        boolean z;
        dgt dgt = (dgt) jyn.a(context, dgt.class);
        boolean z2 = ((csl) jyn.a(context, csl.class)).a() != null;
        if (dgt.a().b() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && !z) {
            glk.e("Babel_explane", "hasAnyCall: Detected a HangoutCall but not a current call. This should not happen!", new Object[0]);
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public static boolean l(Context context) {
        ctn a = ((csl) jyn.a(context, csl.class)).a();
        boolean z;
        if (a == null || !a.s()) {
            z = false;
        } else {
            z = true;
        }
        if (dgg.a().n() || r0) {
            return true;
        }
        return false;
    }

    public static cws A(View view) {
        return (cws) jyn.a(view.getContext(), cws.class);
    }

    public static boolean a(dhz dhz, boolean z) {
        if (z) {
            glk.a("Babel_explane", "[isRequestSupported] invited to call, hangoutType: %s", Integer.valueOf(dhz.m()));
            if (dhz.m() == 7) {
                return true;
            }
            return false;
        }
        boolean z2 = (dhz.b() == null || dhz.b().equals("conversation")) ? false : true;
        glk.a("Babel_explane", "[isRequestSupported] hasNonConversationExternalKey = %s isNamedHangout = %s", Boolean.valueOf(z2), Boolean.valueOf(dhz.q()));
        if (dhz.q() || z2) {
            return false;
        }
        return true;
    }

    public static void a(Context context, String str, String str2, cwp cwp) {
        dex dex = (dex) jyn.a(context, dex.class);
        if (dex.c()) {
            dey dey = (dey) jyn.a(context, dey.class);
            dex.a(str2, new cwn(cwp), dey.d(blc.a()), (iic) dey.b().a());
            return;
        }
        ((fsi) jyn.a(context, fsi.class)).a(new bnn(new gkc(str2, str).a(blc.a()).d(true), new cwo(cwp), true, null));
    }

    public static boolean m(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean n(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean o(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getCallState() == 2;
    }

    public static void i(Context context, int i) {
        ((iih) jyn.a(context, iih.class)).a().b().c().b().a().c(i);
    }

    public static Intent a(Context context, ctn ctn) {
        Collection arrayList = new ArrayList();
        for (itl itl : ctn.f().s().values()) {
            if (!itl.f() && itl.k()) {
                arrayList.add(a(b(context, itl.g(), null, null), itl.b(), null, null, itl.c(), null));
            }
        }
        return a(ctn.c(), null, arrayList, bcj.INVITE_GAIA_IDS_TO_HANGOUT, ctn.m() ? bxt.AUDIO_CALL : bxt.VIDEO_CALL);
    }

    public static void a(dw dwVar, bko bko, String str, String str2, String str3, boolean z) {
        czc.a(new cyu(dwVar, bko, str, str2, str3, z), new cze(dwVar.J_())).a();
    }

    public static agh[] q() {
        return new agh[]{new agh(false, false, (byte) 0), new agh(false, false, (byte) 0), new agh(false, false, (byte) 0)};
    }

    public static void a(TextView textView) {
        new deu(glq.i(H()), textView).execute(new Void[0]);
    }

    public static dq d(int i, int i2) {
        return dfq.b(i, 1001);
    }

    public static int a(biw biw) {
        return biw.a("babel_sms_dep_banner_attempt_number", 1);
    }

    public static boolean b(biw biw) {
        return biw.a("babel_sms_dep_banner_persistent", false);
    }

    public static boolean c(biw biw) {
        return a(biw) > 0 || b(biw);
    }

    public static void j(Context context, int i) {
        bkq.c(context, fde.e(i), true);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.contains("gv_sms")) {
            defaultSharedPreferences.edit().remove("gv_sms").commit();
        }
        new jvt(context, i, "gv_sms", Boolean.valueOf(false)).a(true);
    }

    public static String c(bko bko) {
        return ((fuz) jyn.a(H(), fuz.class)).a("hangout_sound_key", bko.g());
    }

    public static String r() {
        String valueOf = String.valueOf(H().getCacheDir());
        return new StringBuilder(String.valueOf(valueOf).length() + 14).append(valueOf).append("/raw_call_logs").toString();
    }

    public static void s() {
        File file = new File(r());
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static String t() {
        String valueOf = String.valueOf(H().getCacheDir());
        return new StringBuilder(String.valueOf(valueOf).length() + 21).append(valueOf).append("/compressed_call_logs").toString();
    }

    public static String q(String str) {
        String valueOf = String.valueOf(t());
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append("/").append(str).toString();
    }

    public static void r(String str) {
        File file = new File(q(str));
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void u() {
        File file = new File(r());
        if (file.exists()) {
            for (File delete : file.listFiles()) {
                delete.delete();
            }
        }
    }

    public static void a(String str, int i, int i2) {
        File file = new File(q(str));
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            Arrays.sort(listFiles, new dik());
            for (int i3 = 0; i3 < listFiles.length; i3++) {
                File file2 = listFiles[i3];
                if (i3 >= i) {
                    file2.delete();
                } else if (glj.a() - file2.lastModified() > TimeUnit.DAYS.toMillis((long) i2)) {
                    file2.delete();
                }
            }
        }
    }

    public static void e(int i, int i2) {
        File file = new File(t());
        if (file.exists()) {
            for (File name : file.listFiles()) {
                a(name.getName(), 0, 0);
            }
        }
    }

    public static boolean d(bko bko) {
        return ((ful) jyn.a(H(), ful.class)).a(bko.g());
    }

    @Deprecated
    public static iid e(bko bko) {
        return e(bko != null ? bko.g() : -1);
    }

    public static iid e(int i) {
        return ((iih) jyn.a(H(), iih.class)).a(i);
    }

    public static void f(int i) {
        iie b = ((iih) jyn.a(H(), iih.class)).a().b().c().b();
        if (aI()) {
            b.a().c(i);
        } else {
            a(new dil(b, i));
        }
    }

    @Deprecated
    public static void a(bko bko, int i) {
        a(bko, i, false);
    }

    @Deprecated
    public static void a(bko bko, int i, int i2) {
        a(bko, i, null, Integer.valueOf(i2), false);
    }

    @Deprecated
    public static void a(bko bko, int i, String str) {
        a(bko, i, str, null, false);
    }

    @Deprecated
    public static void a(bko bko, int i, boolean z) {
        a(bko, i, null, null, false);
    }

    @Deprecated
    public static void a(int i, int i2, String str, boolean z) {
        bko e = fde.e(i);
        iie b = e(i).b();
        if (str != null) {
            b.a(str);
        }
        b.d(e.a());
        b.c(i2);
    }

    @Deprecated
    public static void a(bko bko, int i, String str, Integer num, boolean z) {
        iie b = e(bko).b();
        if (str != null) {
            b.a(str);
        }
        if (num != null) {
            b.a(num);
        }
        if (z) {
            b.c();
        }
        b.c(i);
    }

    public static void c(Intent intent) {
        int intExtra = intent.getIntExtra("opened_from_impression", 0);
        if (intExtra > 0) {
            int intExtra2 = intent.getIntExtra("account_id", -1);
            iil.b("Account ID is invalid", Integer.valueOf(intExtra2), Integer.valueOf(-1));
            a(fde.e(intExtra2), intExtra, false);
        }
    }

    public static void f(bko bko) {
        ((ful) jyn.a(H(), ful.class)).b(bko != null ? bko.g() : -1);
    }

    public static bko v() {
        did s = dgg.a().s();
        return s != null ? s.k() : null;
    }

    public static boolean w() {
        return glk.a("Babel_calls", 2);
    }

    public static void s(String str) {
        w();
    }

    public static boolean x() {
        return glk.a("Babel_calls", 3);
    }

    public static void t(String str) {
        if (x()) {
            glk.b("Babel_calls", str, new Object[0]);
        }
    }

    public static void a(String str, Object... objArr) {
        glk.e("Babel_calls", String.format(str, objArr), new Object[0]);
    }

    public static dof a(Context context, lym lym) {
        String i;
        if (a(lym.n) == 5) {
            i = glq.i(H(), lym.d);
        } else {
            i = lym.d;
        }
        return new dog().a(context.getResources().getString(bc.eB, new Object[]{i})).a(0).c(it).a();
    }

    public static dof b(Context context, lym lym) {
        return new dog().a(context.getResources().getString(bc.eC, new Object[]{lym.d})).a();
    }

    public static dof p(Context context) {
        return new dog().a(context.getResources().getString(bc.dm)).a(0).a();
    }

    public static dof a(Context context, itl itl, itl itl2) {
        return a(context, 1, itl, itl2, bc.ez, bc.eA, bc.ey);
    }

    public static dof b(Context context, itl itl, itl itl2) {
        return a(context, 2, itl, itl2, bc.fg, bc.fh, bc.ff);
    }

    public static dof a(Context context, int i, itl itl, itl itl2, int i2, int i3, int i4) {
        String b = itl.b();
        String b2 = itl2.b();
        if (itl2.f()) {
            b = context.getResources().getString(i2, new Object[]{b});
        } else if (itl.f()) {
            b = context.getResources().getString(i3, new Object[]{b2});
        } else {
            b = context.getResources().getString(i4, new Object[]{b2, b});
        }
        return new dog().a(i).a(b).a();
    }

    public static dof q(Context context) {
        f(2608);
        return new dog().a(0).a(context.getResources().getString(bc.gC)).a(false).b(context.getResources().getString(bc.gE)).b(context.getResources().getColor(dW)).a(new doj(context)).a();
    }

    public static dof r(Context context) {
        return new dog().a(0).a(context.getResources().getString(bc.tU)).a(false).b(context.getResources().getString(bc.tV)).b(context.getResources().getColor(dW)).a(new dok()).a();
    }

    public static long k(Context context, int i) {
        jcf jcf = (jcf) jyn.a(context, jcf.class);
        if (jcf.c(i)) {
            return jcf.a(i).a("last_invite_seen_timestamp", 0);
        }
        return 0;
    }

    public static void a(Context context, int i, long j) {
        jcf jcf = (jcf) jyn.a(context, jcf.class);
        ba.a(jcf.c(i));
        jcf.b(i).b("last_invite_seen_timestamp", j).d();
    }

    public static boolean a(bjg bjg, bxt bxt) {
        switch (dsj.a[bxt.ordinal()]) {
            case wi.j /*1*/:
                if (!bjg.b().isEmpty()) {
                    return false;
                }
                break;
            case wi.l /*2*/:
            case wi.z /*3*/:
                break;
            case wi.h /*4*/:
                return false;
            default:
                String valueOf = String.valueOf(bxt);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
        }
        for (bjf g : bjg.j()) {
            if (!g.g()) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(Context context, bjg bjg) {
        boolean d = ((bbm) jyn.a(context, bbm.class)).d(((jca) jyn.a(context, jca.class)).a());
        if (bjg.b().isEmpty() || !(d || glq.a(H()))) {
            d = false;
        } else {
            d = true;
        }
        boolean z;
        if (bjg.d().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (d || r3) {
            return true;
        }
        return false;
    }

    public static dsk a(bxt bxt) {
        switch (dsj.a[bxt.ordinal()]) {
            case wi.j /*1*/:
                return dsk.AUDIO_CALL;
            case wi.l /*2*/:
                return dsk.PEOPLE_LIST;
            case wi.z /*3*/:
                return dsk.VIDEO_CALL;
            default:
                String valueOf = String.valueOf(bxt);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Unexpected conversation type: ").append(valueOf).toString());
        }
    }

    public static dti s(Context context) {
        return (dti) jyn.a(context, dti.class);
    }

    @Deprecated
    public static void a(mdg mdg, int i) {
        if (i != -1) {
            String[] b = fdq.b(i);
            if (b.length != 0) {
                if (mdg.a == null) {
                    mdg.a = new mcv();
                }
                if (mdg.a.k == null) {
                    mdg.a.k = new mct();
                }
                mdg.a.k.b = b;
            }
        }
    }

    public static off t(Context context) {
        int i;
        off off = new off();
        off.b = Integer.valueOf(((dlh) jyn.a(context, dlh.class)).b());
        off.c = Integer.valueOf(2);
        if (az(context)) {
            i = 3;
        } else {
            i = 2;
        }
        off.a = Integer.valueOf(i);
        return off;
    }

    public static ofg u(Context context) {
        int i;
        ofg ofg = new ofg();
        ofg.b = ((dlh) jyn.a(context, dlh.class)).c();
        ofg.c = 2;
        if (az(context)) {
            i = 3;
        } else {
            i = 2;
        }
        ofg.a = i;
        ofg.d = 100;
        return ofg;
    }

    public static did y() {
        return dgg.a().s();
    }

    public static String z() {
        StringBuilder stringBuilder = new StringBuilder();
        Context H = H();
        gmp gmp = (gmp) jyn.a(H, gmp.class);
        stringBuilder.append(H.getPackageName());
        stringBuilder.append('/');
        stringBuilder.append(gmp.d());
        stringBuilder.append(" (Linux; U; Android ");
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append("; ");
        stringBuilder.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            stringBuilder.append("; ");
            stringBuilder.append(str);
        }
        str = Build.ID;
        if (str.length() > 0) {
            stringBuilder.append("; Build/");
            stringBuilder.append(str);
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static Set<String> a(Context context, int i, Collection<edk> collection) {
        Set<String> hashSet = new HashSet();
        for (edk edk : collection) {
            Object b = edk.b();
            if (!TextUtils.isEmpty(edk.c)) {
                hashSet.add(Uri.fromParts("tel", edk.c, null).toString());
            } else if (!TextUtils.isEmpty(b)) {
                for (String withAppendedPath : ((dxc) jyn.a(context, dxc.class)).a(i, b)) {
                    hashSet.add(Uri.withAppendedPath(Contacts.CONTENT_LOOKUP_URI, withAppendedPath).toString());
                }
            }
        }
        return hashSet;
    }

    public static edk a(Context context, lqc lqc, String str) {
        boolean z;
        int i;
        boolean z2 = true;
        edk edk = new edk();
        switch (a(lqc.a, 0)) {
            case wi.l /*2*/:
                edk.a = edq.PERSON;
                edk.b = a(context, lqc.c, null);
                break;
            case wi.z /*3*/:
                String str2;
                if (lqc.d == null || lqc.d.g == null || lqc.d.g.length <= 0 || TextUtils.isEmpty(lqc.d.g[0])) {
                    str2 = str;
                } else {
                    iil.a(Integer.valueOf(1), Integer.valueOf(lqc.d.g.length));
                    str2 = lqc.d.g[0];
                }
                edk.a = edq.PHONE;
                if (lqc.c != null) {
                    edk.b = b(context, lqc.c.b, lqc.c.a, str2);
                } else {
                    edk.b = d(context, str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                edk.c = str2;
                edk.s = au();
                break;
            case wi.h /*4*/:
            case wi.p /*5*/:
                edk.a = edq.PHONE;
                edk.b = a(context, lqc.c, null);
                break;
            default:
                edk.a = edq.UNKNOWN;
                edk.b = a(context, lqc.c, null);
                break;
        }
        if (lqc.d != null) {
            lqe lqe = lqc.d;
            edk.e = lqe.b;
            edk.f = lqe.c;
            edk.g = lqe.b;
            if (TextUtils.isEmpty(edk.f)) {
                edk.f = edk.a(edk.e);
            }
            edk.h = lqe.d;
            edk.n = a(lqe.a) == 2;
            if (a(lqe.a) == 1 || edk.n) {
                z = true;
            } else {
                z = false;
            }
            edk.m = z;
            edk.r = null;
            edk.j = lqe.h;
            edk.k = lqe.i;
            edk.l = lqe.j;
            edk.y = b(lqe.k);
            lqf[] lqfArr = lqe.p;
            int length = lqfArr.length;
            i = 0;
            while (i < length) {
                lqf lqf = lqfArr[i];
                if (a(lqf.a) == 3) {
                    edk.C = lqf.c;
                    edk.D = (float) a(lqf.b);
                } else {
                    i++;
                }
            }
        }
        if (lqc.e != null) {
            lpw lpw = lqc.e;
            edk.o = b(lpw.f);
            i = a(lpw.g);
            z = i == 2 || i == 3;
            edk.u = z;
            if (a(lpw.k) != 1) {
                z = true;
            } else {
                z = false;
            }
            edk.v = z;
            edk.x = lpw.e;
            edk.p = b(lpw.a);
        }
        edk.i = lqc.h;
        if (a(lqc.j, 0) == 0) {
            z2 = false;
        }
        edk.z = z2;
        return edk;
    }

    public static edk u(String str) {
        edk edk = new edk();
        edk.e = str;
        edk.a = edq.UNKNOWN;
        edk.c(str);
        return edk;
    }

    public static edk b(String str, String str2) {
        edk edk = new edk();
        edk.d = str;
        edk.e = str2;
        edk.c(str2);
        edk.a = edq.CIRCLE;
        return edk;
    }

    public static edk a(lym lym) {
        edk edk = new edk();
        edk.h = lym.e;
        edk.a = edq.UNKNOWN;
        edk.e = lym.k;
        edk.c(lym.d);
        return edk;
    }

    public static edk a(Context context, String str, String str2, String str3) {
        edk edk = new edk();
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str2 = edk.a(context);
            } else {
                str2 = glq.i(context, str);
            }
        }
        edk.e = str2;
        edk.b = d(context, str);
        edk.c = str;
        edk.a = edq.PHONE;
        edk.h = str3;
        edk.s = au();
        edk.c(str2);
        return edk;
    }

    public static edk a(Context context, String str, String str2, boolean z, String str3, String str4, int i) {
        edk edk = new edk();
        edk.e = str4;
        edk.b = d(context, str);
        edk.a = edq.PHONE;
        edk.s = str2;
        edk.c = str;
        edk.t = z;
        edk.h = str3;
        edk.w = i;
        edk.c(str);
        return edk;
    }

    public static edk a(edo edo, String str, String str2, String str3, String str4, String str5) {
        iil.b("Expected non-null", (Object) edo);
        edk edk = new edk();
        edk.b = edo;
        edk.e = str;
        edk.f = str2;
        if (!TextUtils.isEmpty(str3)) {
            str = str3;
        }
        edk.c(str);
        edk.h = str4;
        edk.r = str5;
        edk.a = edq.PERSON;
        return edk;
    }

    public static edk a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool) {
        if (str3 != null) {
            if (str5 == null) {
                str5 = str7;
            }
            return b(str3, str5);
        } else if (str == null && str2 == null) {
            return u(str7);
        } else {
            return a(b(context, str, str2, str4), str4, str5, str6, str7, str8, str9, bool);
        }
    }

    public static edk a(edo edo, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        iil.b("Expected non-null", (Object) edo);
        edk edk = new edk();
        edk.b = edo;
        edk.c = str;
        edk.e = str2;
        edk.f = str3;
        if (!TextUtils.isEmpty(str4)) {
            str2 = str4;
        } else if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        edk.c(str2);
        edk.h = str5;
        edk.r = str6;
        edk.a = TextUtils.isEmpty(str) ? edq.PERSON : edq.PHONE;
        edk.i = bool;
        b(edk);
        return edk;
    }

    public static edk a(Context context, edq edq, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, int i) {
        edk edk = new edk();
        edk.b = new edo(str, str2);
        edk.a = edq;
        edk.d = str3;
        edk.c = str4;
        edk.e = str5;
        if (str5 != null && str5.equals(str4)) {
            edk.e = glq.i(context, str4);
        }
        if (str4 == null || !TextUtils.equals(glq.c(context, str6), glq.c(context, str4))) {
            edk.f = edk.a(str6);
        } else {
            edk.f = str6;
        }
        edk.g = str7;
        edk.h = str8;
        edk.q = str9;
        edk.i = bool;
        edk.r = null;
        edk.F = edm.a()[i];
        b(edk);
        return edk;
    }

    public static edk a(Context context, Cursor cursor, String str) {
        if (cursor == null) {
            return null;
        }
        String string;
        Boolean bool;
        edq edq = edq.values()[cursor.getInt(8)];
        String string2 = cursor.getString(1);
        String string3 = cursor.getString(2);
        String string4 = cursor.getString(3);
        String string5 = cursor.getString(10);
        String string6 = cursor.getString(4);
        String string7 = cursor.getString(5);
        if (TextUtils.isEmpty(null)) {
            string = cursor.getString(6);
        } else {
            string = null;
        }
        String string8 = cursor.getString(7);
        String string9 = cursor.getString(11);
        if (cursor.getInt(9) != 0) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        return a(context, edq, string2, string3, string4, string5, string6, string7, string, string8, string9, bool, null, 0);
    }

    public static List<edk> a(Context context, Cursor cursor) {
        List<edk> arrayList = new ArrayList();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                arrayList.add(a(context, cursor, null));
            }
        }
        return arrayList;
    }

    public static edk A() {
        return eeh.a;
    }

    public static boolean a(edk edk) {
        if (edk.equals(A())) {
            return true;
        }
        if (edk.h() && TextUtils.isEmpty(edk.f())) {
            return true;
        }
        return false;
    }

    public static List<edk> a(Context context, lqc[] lqcArr, fbt fbt) {
        if (lqcArr == null) {
            return null;
        }
        List<edk> arrayList = new ArrayList();
        for (lqc lqc : lqcArr) {
            if (b(lqc.g)) {
                arrayList.add(null);
            } else {
                arrayList.add(a(context, lqc, null));
            }
        }
        e((List) arrayList);
        return arrayList;
    }

    @Deprecated
    public static edk[] b(Context context, lqc[] lqcArr, fbt fbt) {
        int i = 0;
        if (lqcArr == null || lqcArr.length == 0) {
            return null;
        }
        String str;
        edk[] edkArr = new edk[lqcArr.length];
        if (fbt != null) {
            str = fbt.d;
        } else {
            str = null;
        }
        int length = lqcArr.length;
        int i2 = 0;
        while (i < length) {
            lqc lqc = lqcArr[i];
            if (b(lqc.g)) {
                edkArr[i2] = null;
            } else {
                edkArr[i2] = a(context, lqc, str);
            }
            i2++;
            i++;
        }
        e(Arrays.asList(edkArr));
        return edkArr;
    }

    public static List<edk> a(Context context, lrr[] lrrArr) {
        if (lrrArr == null) {
            return null;
        }
        List<edk> arrayList = new ArrayList();
        for (lrr lrr : lrrArr) {
            arrayList.add(a(context, lrr.a, null));
        }
        e((List) arrayList);
        return arrayList;
    }

    public static void a(edk edk, Collection<fbt> collection) {
        if (edk.I == null) {
            edk.I = new HashSet();
        }
        edk.I.addAll(collection);
    }

    public static lsh a(Context context, edk edk, int i) {
        lsh lsh = new lsh();
        a(context, edk, i, lsh);
        lsh.e = edk.g;
        lsh.f = fbt.a(edk.I);
        return lsh;
    }

    public static muu a(Context context, edk edk) {
        muu muu = new muu();
        muu.a = glq.f(context, edk.c);
        return muu;
    }

    public static String a(Context context, edk edk, boolean z) {
        if (z && !TextUtils.isEmpty(edk.f)) {
            return edk.f;
        }
        if (!TextUtils.isEmpty(edk.e) && !TextUtils.equals(glq.f(context, edk.e), glq.f(context, edk.c))) {
            return edk.e;
        }
        if (edk.g()) {
            return glq.i(context, edk.c);
        }
        return edk.g;
    }

    public static void a(Context context, edk edk, int i, lsh lsh) {
        if (i != 2 || edk.c == null) {
            String k = edk.k();
            if (k != null) {
                lsh.a = k;
                return;
            } else if (edk.d != null) {
                lsh.b = edk.d;
                return;
            } else if (edk.c != null) {
                lsh.d = a(context, edk);
                return;
            } else {
                return;
            }
        }
        lsh.d = a(context, edk);
    }

    public static boolean b(Context context, edk edk) {
        return !TextUtils.isEmpty(edk.c) && (PhoneNumberUtils.isEmergencyNumber(edk.c) || glq.d(context, edk.c));
    }

    public static void b(edk edk) {
        if (edk != null && edk.a == edq.PERSON && !TextUtils.isEmpty(edk.c)) {
            String str = "Babel";
            String str2 = "Encountered participant with participantType ParticipantType PERSON, but contained a phoneNumber like: ";
            String valueOf = String.valueOf(glk.b(edk.toString()));
            glk.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public static void e(List<edk> list) {
        for (edk b : list) {
            b(b);
        }
    }

    public static edo a(Context context, ltr ltr, String str) {
        String e;
        String str2 = null;
        if (ltr != null) {
            e = !TextUtils.isEmpty(str) ? e(context, str) : (ltr.a == null || TextUtils.isEmpty(ltr.a)) ? null : ltr.a;
            if (!(ltr.b == null || TextUtils.isEmpty(ltr.b))) {
                str2 = ltr.b;
            }
            if (TextUtils.isEmpty(ltr.b)) {
                glk.d("Babel", "Received empty gaiaid.", new Exception());
            }
        } else {
            e = null;
        }
        return new edo(str2, e);
    }

    public static fbt b(edo edo) {
        return new fbt(edo.a, edo.b, null, null, false);
    }

    public static edo b(Context context, String str, String str2, String str3) {
        if (str3 != null) {
            return new edo(str, e(context, str3));
        }
        return new edo(str, str2);
    }

    public static edo d(Context context, String str) {
        return new edo(null, e(context, str));
    }

    public static String e(Context context, String str) {
        if (str == null) {
            return null;
        }
        return glq.e(context, str);
    }

    public static List<edo> a(Context context, ltr[] ltrArr, lot[] lotArr) {
        if (ltrArr == null) {
            return null;
        }
        List<edo> arrayList = new ArrayList();
        for (ltr ltr : ltrArr) {
            String str;
            if (lotArr == null || lotArr.length <= 0 || ltr.b == null) {
                str = null;
            } else {
                str = null;
                for (lot lot : lotArr) {
                    if (!(lot.a == null || lot.a.b == null || !TextUtils.equals(ltr.b, lot.a.b) || lot.e == null || lot.e.a == null)) {
                        str = lot.e.a;
                    }
                }
            }
            arrayList.add(a(context, ltr, str));
        }
        return arrayList;
    }

    public static ltr c(edo edo) {
        ltr ltr = new ltr();
        if (!TextUtils.isEmpty(edo.a)) {
            ltr.b = edo.a;
        }
        if (!TextUtils.isEmpty(edo.b)) {
            ltr.a = edo.b;
        }
        return ltr;
    }

    public static boolean f(List<eic> list) {
        for (eic eic : list) {
            if (!eic.b) {
                return false;
            }
        }
        return true;
    }

    public static File l(Context context, int i) {
        File databasePath = context.getDatabasePath("babel" + i + ".db");
        if (!databasePath.exists() || !databasePath.isFile()) {
            glk.d("Babel_DumpDatabase", "Database for " + i + " does not exist", new Object[0]);
            return null;
        } else if (databasePath.length() == 0) {
            glk.d("Babel_DumpDatabase", "Database for " + i + " is empty", new Object[0]);
            return null;
        } else {
            File file = new File(Environment.getExternalStorageDirectory(), String.valueOf(Integer.toString(i)).concat("db_copy.db"));
            ConditionVariable conditionVariable = new ConditionVariable();
            new eng(databasePath, file, conditionVariable).execute(new Void[0]);
            conditionVariable.block(10000);
            return file;
        }
    }

    public static File v(Context context) {
        File file = new File(new File(context.getFilesDir().getParentFile().getPath(), "shared_prefs").getPath(), "accounts.xml");
        File file2 = new File(Environment.getExternalStorageDirectory(), "babel-accounts.xml");
        String valueOf = String.valueOf(file);
        String valueOf2 = String.valueOf(file2);
        glk.c("Babel_DumpDatabase", new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length()).append("Copying ").append(valueOf).append(" to ").append(valueOf2).toString(), new Object[0]);
        ConditionVariable conditionVariable = new ConditionVariable();
        new eng(file, file2, conditionVariable).execute(new Void[0]);
        conditionVariable.block(10000);
        return file2;
    }

    public static void a(Context context, File file) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    public static void w(Context context) {
        int i;
        boolean i2 = fde.i();
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, "com.google.android.apps.hangouts.phone.ShareIntentSmsOnlyActivity");
        if (i2) {
            i = 1;
        } else {
            i = 2;
        }
        packageManager.setComponentEnabledSetting(componentName, i, 1);
    }

    public static boolean x(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("EsApplication", 0);
        String string = sharedPreferences.getString("last_seen_version_name", null);
        String c = ((gmp) jyn.a(context, gmp.class)).c();
        boolean z = string == null || !string.equals(c);
        if (z) {
            Editor edit = sharedPreferences.edit();
            edit.putString("last_seen_version_name", c);
            edit.apply();
            f(context, string);
            new enj(context).execute(new Void[0]);
        }
        return z;
    }

    public static void f(Context context, String str) {
        bkq.a(context, false);
        if (str != null) {
            if (str.startsWith("2.3") && !glq.d(context)) {
                String string = context.getResources().getString(bc.cU);
                jcf jcf = (jcf) jyn.a(context, jcf.class);
                for (int b : fde.e()) {
                    jcf.b(b).e(string).d();
                }
            }
            if (str.compareTo("2.5") < 0) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("EsApplication", 0);
                for (eow eow : eow.values()) {
                    if (sharedPreferences.getBoolean(eow.c, false)) {
                        b(eow);
                    }
                }
            }
        }
    }

    public static void y(Context context) {
        try {
            ftv.a();
        } catch (UnsupportedOperationException e) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
            intentFilter.addDataPath(Media.EXTERNAL_CONTENT_URI.getPath(), 0);
            intentFilter.addDataScheme(Media.EXTERNAL_CONTENT_URI.getScheme());
            context.registerReceiver(new ftw(), intentFilter);
        }
        File cacheDir = context.getCacheDir();
        new File(cacheDir, "telephony_brief_call_log").delete();
        new File(cacheDir, "telephony_brief_call_log_v2").delete();
    }

    public static void z(Context context) {
        idx a = ((idy) jyn.a(context, idy.class)).a(((ifj) jyn.a(context, ifj.class)).a()).a();
        a.a();
        if (tu == null) {
            tu = (ifl) jyn.a(context, ifl.class);
        }
        did s = dgg.a().s();
        if (s != null) {
            tu.a("session_id", s.l());
        }
        Object a2 = fdq.a(((jca) jyn.a(context, jca.class)).a());
        if (!TextUtils.isEmpty(a2)) {
            tu.a("exp", a2);
        }
        Bitmap a3 = tu.a().a();
        if (a3 != null && a3.isRecycled()) {
            tu.a(null);
        }
        ((ifi) jyn.a(context, ifi.class)).a(a).b(tu.a()).a(new enw(a));
    }

    public static void B() {
        tu = null;
    }

    public static lhi a(eod eod) {
        return eod;
    }

    public static Intent d(Intent intent) {
        Intent intent2 = new Intent(H(), AccountSelectionActivity.class);
        intent2.setAction("android.intent.action.VIEW");
        if (intent != null) {
            intent2.putExtra("intent", intent);
        }
        return intent2;
    }

    public static Intent g(bko bko) {
        return a(bko, null, 0, "android.intent.action.VIEW");
    }

    public static Intent h(bko bko) {
        return a(bko, null, 0, "com.google.android.apps.hangouts.phone.conversationlist");
    }

    public static Intent i(bko bko) {
        return a(bko, null, 2, "android.intent.action.VIEW");
    }

    public static Intent m(Context context, int i) {
        Intent a = ((dqh) jyn.a(context, dqh.class)).a(context, i);
        iil.b("Invalid account", Integer.valueOf(i), Integer.valueOf(-1));
        a.putExtra("account_id", i);
        a.setFlags(872415232);
        return a;
    }

    public static Intent c(bko bko, String str) {
        return a(bko, str, 0, "com.google.android.apps.hangouts.phone.conversationlist");
    }

    public static Intent a(bko bko, String str, int i, String str2) {
        Intent intent = new Intent();
        switch (i) {
            case wi.w /*0*/:
                intent.setClassName(H(), "com.google.android.talk.SigningInActivity");
                break;
            case wi.l /*2*/:
                intent.setClass(H(), ArchivedConversationListActivity.class);
                break;
            default:
                throw new AssertionError("Unknown display mode: " + i);
        }
        intent.setAction(str2);
        if (bko != null) {
            int g = bko.g();
            iil.b("Invalid account", Integer.valueOf(g), Integer.valueOf(-1));
            intent.putExtra("account_id", g);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("conversation_id", str);
            intent.putExtra("client_conversation_type", 0);
        }
        intent.setFlags(872415232);
        return intent;
    }

    public static Intent a(int i, String str, int i2) {
        Intent intent = new Intent(H(), ConversationActivity.class);
        Bundle bundle = new Bundle();
        a(bundle, i, str, i2);
        intent.putExtras(bundle);
        intent.setFlags(335544320);
        return intent;
    }

    public static void a(Bundle bundle, int i, String str, int i2) {
        iil.b("Invalid account", Integer.valueOf(i), Integer.valueOf(-1));
        bundle.putInt("account_id", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("conversation_id", str);
            bundle.putInt("client_conversation_type", i2);
        }
    }

    public static Intent a(int i, String str, edo edo, int i2, long j) {
        Intent intent = new Intent(H(), InvitationActivity.class);
        Bundle bundle = new Bundle();
        a(bundle, i, str, i2);
        bundle.putString("inviter_gaia_id", edo.a);
        bundle.putString("inviter_chat_id", edo.b);
        bundle.putLong("invite_timestamp", j);
        intent.putExtras(bundle);
        intent.setFlags(335544320);
        return intent;
    }

    public static edo a(Bundle bundle) {
        String string = bundle.getString("inviter_gaia_id");
        String string2 = bundle.getString("inviter_chat_id");
        if (string == null && string2 == null) {
            return null;
        }
        return new edo(string, string2);
    }

    public static Intent j(bko bko) {
        Intent intent = new Intent(H(), SettingsActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", bko.g());
        return intent;
    }

    public static Intent d(bko bko, String str) {
        if (str == null) {
            throw new RuntimeException("gaiaId not provided");
        }
        Intent intent = new Intent("com.google.android.gms.people.profile.ACTION_SET_AVATAR");
        intent.putExtra("com.google.android.gms.people.profile.EXTRA_ACCOUNT", bko.a());
        return intent;
    }

    public static bck a(Collection<edk> collection, bcj bcj) {
        juh juh = null;
        if (collection != null) {
            bcf newBuilder = juh.newBuilder();
            for (edk edk : collection) {
                newBuilder.a(bcn.newBuilder().a(fbw.a(edk)).a(edk.e).b(edk.h).a());
            }
            juh = newBuilder.a();
        }
        return new bck(juh, bcj);
    }

    public static Intent a(bko bko, String str, Collection<edk> collection, bcj bcj, bxt bxt) {
        Intent intent = new Intent(H(), EditAudienceActivity.class);
        if (bko != null) {
            intent.putExtra("account_id", bko.g());
        }
        if (str != null) {
            intent.putExtra("conversation_id", str);
        }
        intent.putExtra("edit_participants_model", a((Collection) collection, bcj));
        intent.putExtra("conversation_type", bxt);
        return intent;
    }

    public static int a(ArrayList<edk> arrayList) {
        int i = 0;
        if (arrayList != null) {
            arrayList = arrayList;
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((edk) obj).g()) {
                    i3 |= 1;
                } else {
                    i3 |= 2;
                }
            }
            i = i3;
        }
        if (i == 0) {
            return 2;
        }
        return i;
    }

    public static Intent a(dhz dhz, int i, long j) {
        Intent a = a(dhz, false, null, true, true, 62, i, j);
        a.putExtra("from_notification", true);
        return a;
    }

    public static Intent a(dhz dhz, boolean z, edk edk, boolean z2, boolean z3, int i, int i2, long j) {
        boolean z4;
        if (dgg.a().n()) {
            z4 = false;
        } else {
            z4 = true;
        }
        return a(dhz, null, false, edk, z2, true, i, i2, j, 0, false, false, z4);
    }

    public static Intent a(dhz dhz, boolean z, edk edk, boolean z2, boolean z3, int i, int i2, long j, int i3, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        if (!z6 || dgg.a().n()) {
            z7 = false;
        } else {
            z7 = true;
        }
        return a(dhz, null, z, null, z2, z3, i, 2, j, i3, z4, z5, z7);
    }

    public static Intent a(dhz dhz, ArrayList<edk> arrayList, boolean z, int i, long j) {
        return a(dhz, (ArrayList) arrayList, z, i, j, true);
    }

    public static Intent a(dhz dhz, ArrayList<edk> arrayList, boolean z, int i, long j, boolean z2) {
        return a(dhz, (ArrayList) arrayList, z, i, j, 0, false, false, z2);
    }

    public static Intent b(dhz dhz, ArrayList arrayList, boolean z, int i, long j) {
        return a(dhz, null, z, i, j, 0, false, false, true);
    }

    public static Intent a(dhz dhz, ArrayList<edk> arrayList, boolean z, int i, long j, int i2, boolean z2, boolean z3, boolean z4) {
        return a(dhz, (ArrayList) arrayList, false, null, true, z, i, a((ArrayList) arrayList), j, i2, z2, z3, z4);
    }

    public static Intent a(dhz dhz, ArrayList<edk> arrayList, boolean z, edk edk, boolean z2, boolean z3, int i, int i2, long j, int i3, boolean z4, boolean z5, boolean z6) {
        Bundle bundle = new Bundle();
        bko a = fde.a(dhz.a());
        bundle.putInt("account_id", a == null ? -1 : a.g());
        bundle.putParcelable("hangout_room_info", dhz);
        if (arrayList != null) {
            bundle.putParcelableArrayList("hangout_invitee_users", arrayList);
        }
        bundle.putBoolean("hangout_is_joining_non_empty_hangout", z);
        if (edk != null) {
            bundle.putParcelable("pstn_caller", edk);
        }
        bundle.putBoolean("hangout_camera_on", z2);
        bundle.putInt("hangout_video_source", i3);
        bundle.putBoolean("hangout_mute_microphone", z4);
        bundle.putBoolean("hangout_mute_playback", z5);
        bundle.putBoolean("hangout_auto_join", z3);
        bundle.putInt("hangout_start_source", i);
        bundle.putInt("hangout_pstn_call", i2);
        bundle.putLong("extra_hangout_start_time", j);
        return a(bundle, z6);
    }

    public static Intent a(Bundle bundle, boolean z) {
        Class cls;
        if (!z) {
            cls = HangoutActivity.class;
        } else if (dgg.a().c()) {
            cls = a(H(), bundle);
        } else {
            cls = HangoutSupportInitializationActivity.class;
        }
        Intent intent = new Intent(H(), cls);
        intent.setAction("unique" + glj.a());
        intent.putExtras(bundle);
        return intent;
    }

    public static Intent b(Bundle bundle) {
        return a(bundle, false);
    }

    public static Class<?> a(Context context, Bundle bundle) {
        return ((dlh) jyn.a(context, dlh.class)).a(bundle);
    }

    public static Intent C() {
        Intent intent = new Intent(H(), ((dmt) jyn.a(H(), dmt.class)).a());
        intent.setAction("fullscreen_activity");
        intent.setFlags(268697600);
        return intent;
    }

    public static Intent v(String str) {
        Intent intent = new Intent("com.google.android.apps.hangouts.hangout.ignore").setClass(H(), NotificationActionReceiver.class);
        intent.putExtra("hangout_incoming_notification_tag", str);
        return intent;
    }

    public static Intent w(String str) {
        Intent intent = new Intent("com.google.android.apps.hangouts.hangout.joined");
        intent.setComponent(new ComponentName(H(), HangoutUtils$JoinedHangoutReceiver.class));
        intent.setFlags(268435456);
        intent.putExtra("session", str);
        return intent;
    }

    public static Intent x(String str) {
        Intent intent = new Intent("com.google.android.apps.hangouts.hangout.exit");
        intent.setComponent(new ComponentName(H(), HangoutUtils$JoinedHangoutReceiver.class));
        intent.putExtra("session", str);
        return intent;
    }

    public static Intent c(String str, String str2) {
        String format = String.format("%s: %s", new Object[]{str, str2});
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", format);
        intent.setType("text/plain");
        return intent;
    }

    public static Intent D() {
        return new Intent(H(), ApnSettingsActivity.class);
    }

    public static Intent y(String str) {
        Intent intent = new Intent(H(), ApnEditorActivity.class);
        intent.putExtra("apn_row_id", str);
        return intent;
    }

    public static Intent g(int i) {
        Intent intent = new Intent(H(), BlockedContactsActivity.class);
        intent.putExtra("account_id", i);
        return intent;
    }

    public static Intent k(bko bko) {
        Intent intent = new Intent(H(), HiddenContactsActivity.class);
        if (bko != null) {
            intent.putExtra("account_id", bko.g());
        }
        return intent;
    }

    public static Intent z(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (VERSION.SDK_INT >= 18) {
            e(intent);
        }
        g(intent);
        intent.addFlags(268435456);
        return intent;
    }

    public static void e(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        intent.putExtras(bundle);
    }

    public static Intent A(String str) {
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT");
        intent.setType("vnd.android.cursor.item/contact");
        if (ajb.b(str)) {
            intent.putExtra("email", str);
        } else {
            intent.putExtra("phone", str);
            intent.putExtra("phone_type", 2);
        }
        intent.setFlags(524288);
        return intent;
    }

    public static Intent E() {
        return new Intent(H(), SmsAccountPickerActivity.class);
    }

    public static Intent F() {
        return new Intent(H(), SmsStorageLowWarningActivity.class);
    }

    public static Intent g(Context context, String str) {
        String str2;
        if (((ehz) jyn.a(context, ehz.class)).a("android.permission.CALL_PHONE")) {
            str2 = "android.intent.action.CALL";
        } else {
            str2 = "android.intent.action.DIAL";
        }
        String str3 = "Babel";
        String str4 = "Intenting out to external dialer for audio call using action: ";
        String valueOf = String.valueOf(str2);
        glk.a(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
        str4 = String.valueOf("tel:");
        valueOf = String.valueOf(str);
        return new Intent(str2, Uri.parse(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4)));
    }

    public static Intent a(String str, boolean z, String str2, String str3, String str4) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setClass(H(), ShareIntentActivity.class);
        if (str4 == null) {
            str4 = "text/plain";
        }
        intent.setType(str4);
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("sms_convs_only", true);
        if (z) {
            intent.putExtra("requires_mms", true);
            intent.putExtra("uri", str2);
            intent.putExtra("photo_url", str3);
            if (str3 != null && str3.startsWith("//")) {
                String str5 = "Babel";
                String str6 = "Forwarding MMS has attachment URL without valid scheme.";
                String valueOf = String.valueOf(str3);
                glk.e(str5, valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6), new Object[0]);
            }
        }
        return intent;
    }

    public static Intent B(String str) {
        Intent intent = new Intent(H(), InCallDialpadActivity.class);
        intent.putExtra("extra_endpoint_jid", str);
        return intent;
    }

    public static Intent G() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(new ComponentName("com.android.cellbroadcastreceiver", "com.android.cellbroadcastreceiver.CellBroadcastListActivity"));
        intent.setFlags(268435456);
        return intent;
    }

    public static Intent d(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(1);
        if (c()) {
            g(intent);
            intent.addFlags(268435456);
        }
        intent.putExtra("SingleItemOnly", true);
        intent.setDataAndType(Uri.parse(str), str2);
        return intent;
    }

    public static Intent a(bko bko, fdv fdv) {
        Intent intent = new Intent(H(), GoogleVoiceTermsOfServiceActivity.class);
        intent.putExtra("account_id", bko.g());
        intent.putExtra("com.google.android.apps.hangouts.voiceCallActionInfo", fdv);
        return intent;
    }

    public static Intent l(bko bko) {
        Intent intent = new Intent(H(), CallContactPickerActivity.class);
        intent.putExtra("com.google.android.apps.hangouts.voiceCallActionMode", 2);
        if (bko != null) {
            intent.putExtra("account_id", bko.g());
        }
        return intent;
    }

    public static Intent e(bko bko, String str) {
        Intent intent = new Intent(H(), ViewVCardActivity.class);
        if (bko != null) {
            intent.putExtra("account_id", bko.g());
        }
        intent.setData(Uri.parse(str));
        return intent;
    }

    public static Intent m(bko bko) {
        Intent intent = new Intent();
        intent.setClassName(H(), "com.google.android.talk.SigningInActivity");
        intent.setAction("com.google.android.apps.hangouts.phone.recentcalls");
        if (bko != null) {
            intent.putExtra("account_id", bko.g());
        }
        return intent;
    }

    public static boolean A(Context context) {
        return h(context, H().getPackageName());
    }

    public static boolean h(Context context, String str) {
        return c(context, "market://details", str) || c(context, "https://play.google.com/store/apps/details", str);
    }

    public static boolean c(Context context, String str, String str2) {
        try {
            context.startActivity(e(str, str2));
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }

    public static Intent e(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("id", str2);
        intent.setData(buildUpon.build());
        return intent;
    }

    public static Intent C(String str) {
        Uri parse = Uri.parse(str);
        parse = parse.buildUpon().scheme(parse.getScheme().toLowerCase(Locale.US)).build();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(parse);
        g(intent);
        intent.addFlags(268435456);
        return intent;
    }

    public static Intent a(String str, Uri uri, Uri uri2, int i) {
        Intent putExtra = new Intent("android.intent.action.RINGTONE_PICKER").putExtra("android.intent.extra.ringtone.TYPE", i).putExtra("android.intent.extra.ringtone.TITLE", str);
        String str2 = "android.intent.extra.ringtone.EXISTING_URI";
        if (gku.a.equals(uri)) {
            uri = ftv.a(ix);
        } else if (gku.b.equals(uri)) {
            uri = ftv.a(iw);
        }
        return putExtra.putExtra(str2, uri).putExtra("android.intent.extra.ringtone.DEFAULT_URI", uri2);
    }

    public static String a(Intent intent, String str) {
        Bundle a = hg.a(intent);
        if (a != null) {
            CharSequence charSequence = a.getCharSequence(str);
            if (charSequence != null) {
                return charSequence.toString();
            }
        }
        return null;
    }

    public static Intent f(Intent intent) {
        Intent intent2 = new Intent(H(), ShowDialerActivity.class);
        intent2.setAction(intent.getAction());
        String stringExtra = intent.getStringExtra("number_to_call");
        if (stringExtra != null) {
            intent2.putExtra("number_to_call", stringExtra);
        }
        return intent2;
    }

    public static Intent b(int i, String str) {
        Intent intent = new Intent(H(), DebugActivity.class);
        intent.putExtra("account_id", i);
        if (str != null) {
            intent.putExtra("conversation_id", str);
        }
        return intent;
    }

    public static Intent d(Context context, String str, String str2) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.fromParts("smsto", "", null)), 0);
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (VERSION.SDK_INT >= 19) {
            ComponentName a = a(context, queryIntentActivities);
            if (a != null) {
                intent.setComponent(a);
            }
        }
        String str3 = "sms:";
        String valueOf = String.valueOf(str2);
        intent.setData(Uri.parse(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)));
        intent.putExtra("sms_body", str);
        intent.putExtra("android.intent.extra.TEXT", str);
        g(intent);
        intent.addFlags(268435456);
        return intent;
    }

    public static ComponentName a(Context context, List<ResolveInfo> list) {
        String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            for (ResolveInfo resolveInfo : list) {
                if (defaultSmsPackage.equals(resolveInfo.activityInfo.packageName)) {
                    return new ComponentName(defaultSmsPackage, resolveInfo.activityInfo.name);
                }
            }
        }
        return null;
    }

    public static void g(Intent intent) {
        if (c()) {
            h(intent);
        }
    }

    public static void h(Intent intent) {
        intent.addFlags(4096);
    }

    public static boolean a(eow eow) {
        return PreferenceManager.getDefaultSharedPreferences(H()).getBoolean(eow.c, false);
    }

    public static void b(eow eow) {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(H()).edit();
        edit.putBoolean(eow.c, true);
        edit.apply();
    }

    public static void a(dw dwVar, fdv fdv, int i, String str) {
        eox eox = (eox) jyn.b((Context) dwVar, eox.class);
        if (glq.a(H(), fdv.b()) || eox == null || !n((Context) dwVar, i)) {
            dwVar.startActivity(fdv.a(H(), i, str));
            dwVar.finish();
            return;
        }
        eox.a(dwVar, fdv, i, str);
    }

    public static boolean n(Context context, int i) {
        bel bel = (bel) jyn.b(context, bel.class);
        if (bel == null) {
            return false;
        }
        return bel.a(context, i);
    }

    @Deprecated
    public static Context H() {
        return tv;
    }

    @Deprecated
    public static boolean I() {
        return tw;
    }

    public static void B(Context context) {
        tv = context;
        if (tx != null) {
            for (epq a : tx) {
                a.a(context);
            }
            tx = null;
        }
    }

    public static void a(epq epq) {
        if (tv != null) {
            epq.a(tv);
            return;
        }
        if (tx == null) {
            tx = new ArrayList();
        }
        tx.add(epq);
    }

    public static <T extends eul> fas a(Class<T> cls, far far) {
        return new fas(cls, far);
    }

    public static Map<String, fas> J() {
        fas a = a(eup.class, new ewh());
        fas a2 = a(evw.class, new fao());
        fas a3 = a(eum.class, new ewd());
        fas a4 = a(evf.class, new eyx());
        fas a5 = a(evg.class, new eyz());
        fas a6 = a(evk.class, new ezp());
        fas a7 = a(evl.class, new ezr());
        fas a8 = a(evd.class, new eyo());
        fas a9 = a(evh.class, new ezb());
        fas a10 = a(euq.class, new ewl());
        fas a11 = a(fnm.class, new fno());
        fas a12 = a(evt.class, new fay());
        Object obj = new fas[]{a(euw.class, new exi()), a(evs.class, new faw()), a(evb.class, new eye()), a(eus.class, new ewp()), a(evu.class, new faj()), a(euy.class, new exm()), a(evv.class, new fam()), a(evi.class, new ezi()), a(eux.class, new exk()), a(evn.class, new ezx()), a(evo.class, new faa()), a(evq.class, new fae()), a(eun.class, new ewf()), a(euf.class, new exs()), a(eug.class, new exu()), a(eud.class, new ewj()), a(eue.class, new exq()), a(eui.class, new ezd()), a(euh.class, new eym()), a(etm.class, new exg()), a(etr.class, new ezt()), a(ett.class, new ezt()), a(eur.class, new ewn()), a(etn.class, new eya()), a(evm.class, new ezv()), a(evr.class, new fah()), a(euv.class, new ewz()), a(evj.class, new ezm()), a(etq.class, new eys()), a(etp.class, new eyq()), a(eve.class, new eyv()), a(evp.class, new fac()), a(evx.class, new faq()), a(eut.class, new ewr()), a(euz.class, new exo()), a(eto.class, new eyh()), a(etl.class, new exb()), a(ete.class, new eyk()), a(eta.class, new ewt()), a(etc.class, new exd()), a(etd.class, new exy()), a(etb.class, new ewx()), a(esy.class, new ewb()), a(eva.class, new exw())};
        Object obj2 = new Object[(obj.length + 12)];
        obj2[0] = a;
        obj2[1] = a2;
        obj2[2] = a3;
        obj2[3] = a4;
        obj2[4] = a5;
        obj2[5] = a6;
        obj2[6] = a7;
        obj2[7] = a8;
        obj2[8] = a9;
        obj2[9] = a10;
        obj2[10] = a11;
        obj2[11] = a12;
        System.arraycopy(obj, 0, obj2, 12, obj.length);
        Object[] b = mmr.b(obj2, obj2.length);
        mjq b2 = mjq.b(b, b.length);
        Map<String, fas> kyVar = new ky();
        b2 = b2;
        int size = b2.size();
        int i = 0;
        while (i < size) {
            Object obj3 = b2.get(i);
            i++;
            a2 = (fas) obj3;
            kyVar.put(a2.a, a2);
        }
        return kyVar;
    }

    public static <T extends eul> fas a(Class<T> cls) {
        return (fas) K().get(cls.getName());
    }

    public static Map<String, fas> K() {
        if (uc == null) {
            uc = J();
        }
        return uc;
    }

    public static boolean h(int i) {
        return i == 3;
    }

    public static boolean i(int i) {
        return i == 3 || i == 2;
    }

    public static boolean j(int i) {
        return i == 1;
    }

    public static boolean k(int i) {
        return i == 0;
    }

    public static boolean l(int i) {
        return i == 2;
    }

    public static int m(int i) {
        return i - 1;
    }

    public static boolean n(int i) {
        switch (i) {
            case 106:
            case 107:
            case 108:
            case 140:
                return true;
            default:
                return false;
        }
    }

    public static boolean o(int i) {
        switch (i) {
            case 101:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
            case 108:
            case 116:
            case 118:
            case 122:
            case 140:
                return true;
            default:
                return false;
        }
    }

    public static void a(int i, dw dwVar, boolean z, fgh fgh) {
        czc.a(new fgf(dwVar, i, fgh), z ? new cze(dwVar.J_()) : null).a();
    }

    public static void a(int i, dw dwVar, fgh fgh) {
        czc.a(new fge(dwVar, i, fgh), new cze(dwVar.J_())).a();
    }

    public static void a(fdv fdv, bko bko, dw dwVar, fdx fdx) {
        String b = fdv.b();
        if (!PhoneNumberUtils.isEmergencyNumber(b) || f(bko, b)) {
            Runnable a = ((fgd) mfa.c((fgd) jyn.b(dwVar.getApplicationContext(), fgd.class)).a(new fgb())).a(fdv, bko, dwVar, fdx);
            if (bko.I() == 0) {
                a(bko.g(), dwVar, true, new fga(a));
            } else {
                a.run();
            }
        } else if (!glq.a(H()) || !((fbx) jyn.a((Context) dwVar, fbx.class)).a((Context) dwVar, fdv.b())) {
            CharSequence concat;
            String valueOf = String.valueOf(dwVar.getString(bc.gv, new Object[]{fdv.b()}));
            b = String.valueOf(dwVar.getString(bc.gw, new Object[]{fdv.b()}));
            if (b.length() != 0) {
                concat = valueOf.concat(b);
            } else {
                concat = new String(valueOf);
            }
            new AlertDialog.Builder(dwVar).setTitle(bc.gx).setMessage(concat).setCancelable(true).setPositiveButton(17039370, new ffz()).create().show();
        }
    }

    public static boolean f(bko bko, String str) {
        return bko.L() && glq.d(H(), str) && !glq.l(H()) && glq.m(H());
    }

    public static String D(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(" ");
        if (split.length > 0) {
            return split[0];
        }
        return str;
    }

    public static void a(juh juh, fgx fgx) {
        HashSet hashSet = new HashSet();
        for (bcn bcn : juh.g()) {
            fbw b = bcn.b();
            if (!(b == null || hashSet.contains(b))) {
                hashSet.add(b);
                fgx.a(b, bcn);
            }
        }
        for (bcg bcg : juh.i()) {
            fgx.a(fbw.b(bcg.b(), bcg.d()), bcg);
        }
    }

    public static List<fbw> a(bko bko, juh juh) {
        List arrayList = new ArrayList();
        a(juh, new fgt(arrayList));
        return arrayList;
    }

    public static ArrayList<edk> a(bko bko, Context context, juh juh) {
        ArrayList<edk> arrayList = new ArrayList();
        a(juh, new fgu(arrayList, context));
        return arrayList;
    }

    public static ArrayList<bcg> b(bko bko, juh juh) {
        ArrayList<bcg> arrayList = new ArrayList();
        a(juh, new fgv(arrayList));
        return arrayList;
    }

    public static juh g(bko bko, String str) {
        return b(new blo(H(), bko.g()).H(str));
    }

    public static juh b(Collection<edk> collection) {
        bcf newBuilder = juh.newBuilder();
        for (edk edk : collection) {
            switch (fgw.a[edk.a.ordinal()]) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                    newBuilder.a(bcn.newBuilder().a(fbw.a(edk)).a(edk.e).b(edk.h).a());
                    break;
                case wi.z /*3*/:
                    bch newBuilder2 = bcg.newBuilder();
                    newBuilder2.a(edk.d);
                    newBuilder.a(newBuilder2.a());
                    break;
                default:
                    break;
            }
        }
        return newBuilder.a();
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS messages;");
    }

    public static long a(Context context, evz evz) {
        return foe.a(context).a(evz);
    }

    public static evz a(Context context, long j) {
        return foe.a(context).c(j);
    }

    public static void b(Context context, long j) {
        foe.a(context).d(j);
    }

    public static jsd C(Context context) {
        return new jse((byte) 0).a(false).b(false).a("cronet_cache").b(true).a(a(context, "babel_quic_for_cronet", false)).a();
    }

    public static jsf L() {
        return new jry("www.googleapis.com", 443, 443);
    }

    public static String M() {
        return H().getSharedPreferences("GmsPeopleCache", 0).getString("last_refresh_thumbprint", "N/A");
    }

    public static void a(long j, String str) {
        Editor edit = H().getSharedPreferences("GmsPeopleCache", 0).edit();
        edit.putLong("last_refresh_timestamp", j);
        edit.putString("last_refresh_thumbprint", str);
        edit.apply();
    }

    public static void a(gui gui) {
        a(gui, -1);
    }

    public static void a(gui gui, int i) {
        long a = a(H(), "babel_gms_sync_allowance", 28800);
        for (int e : fde.c(true)) {
            hsj.h.a(gui, fde.e(e).a(), null, a);
        }
    }

    public static String[] b(String[] strArr) {
        Object obj = new String[(strArr.length + 3)];
        System.arraycopy(strArr, 0, obj, 0, strArr.length);
        if (VERSION.SDK_INT >= 19) {
            obj[strArr.length] = "\ud83d\ude03";
            obj[strArr.length + 1] = "\ud83d\ude1e";
            obj[strArr.length + 2] = "\ud83d\udc9c";
        } else {
            obj[strArr.length] = ":-)";
            obj[strArr.length + 1] = ":-(";
            obj[strArr.length + 2] = "\u2764";
        }
        return obj;
    }

    public static String a(byte[] bArr, int i) {
        if (i == 0) {
            return new String(bArr);
        }
        try {
            return new String(bArr, aib.a(i));
        } catch (UnsupportedEncodingException e) {
            try {
                return new String(bArr, "iso-8859-1");
            } catch (UnsupportedEncodingException e2) {
                return new String(bArr);
            }
        }
    }

    public static byte[] c(String str, int i) {
        if (i == 0) {
            return str.getBytes();
        }
        try {
            return str.getBytes(aib.a(i));
        } catch (UnsupportedEncodingException e) {
            return str.getBytes();
        }
    }

    public static void O() {
        if (!fde.i()) {
            return;
        }
        if (fyx.a()) {
            blf.a(fyx.b(fyx.b()));
        } else {
            Q();
        }
    }

    public static void P() {
        if (fde.i()) {
            R();
        }
    }

    public static void Q() {
        Context H = H();
        Resources resources = H.getResources();
        hq a = hq.a(H);
        Intent g = g(fde.k());
        g.addFlags(335544320);
        a.a(g);
        a.b(F());
        PendingIntent a2 = a.a(0, 134217728);
        fx fxVar = new fx(H);
        fxVar.a(resources.getString(bc.kM)).c(resources.getString(bc.kL)).a(R$drawable.ct).d(0).c(true).e(false).a(a2);
        fw fwVar = new fw(fxVar);
        fwVar.b(resources.getString(bc.kK));
        ((NotificationManager) H().getSystemService("notification")).notify(S(), 12, fwVar.a());
    }

    public static void R() {
        ((NotificationManager) H().getSystemService("notification")).cancel(S(), 12);
    }

    public static String S() {
        return String.valueOf(H().getPackageName()).concat(":smsstoragelow");
    }

    public static CharSequence a(String str, String str2, TextView textView) {
        textView.setMaxLines(2);
        Spannable spannableString = new SpannableString(TextUtils.concat(new CharSequence[]{str, "\n", str2}));
        gob.a(textView.getContext()).a(spannableString, null, textView);
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 18);
        return spannableString;
    }

    public gwb(Activity activity, kbu kbu) {
        dfk dfk = new dfk(activity, kbu);
    }

    public static Set<Annotation> T() {
        Set<Annotation> hashSet = new HashSet();
        hashSet.add(c(jcu.class));
        return hashSet;
    }

    public static StatusMessageSettingsActivity d(Activity activity) {
        if (activity instanceof StatusMessageSettingsActivity) {
            return (StatusMessageSettingsActivity) activity;
        }
        String valueOf = String.valueOf(activity.getClass());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 243).append("Attempt to inject a Activity wrapper of type com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivityPeer, but the wrapper available is of type: ").append(valueOf).append(". Does your peer's @Inject constructor reference the wrong wrapper class?").toString());
    }

    public static StatusMessageSettingsFragment a(dr drVar) {
        if (drVar instanceof StatusMessageSettingsFragment) {
            return (StatusMessageSettingsFragment) drVar;
        }
        String valueOf = String.valueOf(drVar.getClass());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 243).append("Attempt to inject a Fragment wrapper of type com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragmentPeer, but the wrapper available is of type: ").append(valueOf).append(". Does your peer's @Inject constructor reference the wrong wrapper class?").toString());
    }

    public static void a(ImageView imageView, Resources resources, int i, gbs gbs, boolean z) {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            imageView.setLayerType(1, null);
            imageView.post(new gbq(resources, i, imageView, gbs, true));
        }
    }

    public static void a(ImageView imageView, Resources resources, int i) {
        a(imageView, resources, i, gbs.CONTAIN, true);
    }

    public static float a(int i, int i2, int i3, int i4, gbs gbs, Resources resources) {
        while (true) {
            switch (gbr.a[gbs.ordinal()]) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                    gbs gbs2;
                    if (i * i4 < i3 * i2) {
                        if (gbs == gbs.CONTAIN) {
                            gbs2 = gbs.WIDTH;
                        } else {
                            gbs2 = gbs.HEIGHT;
                        }
                        gbs = gbs2;
                    } else {
                        if (gbs == gbs.CONTAIN) {
                            gbs2 = gbs.HEIGHT;
                        } else {
                            gbs2 = gbs.WIDTH;
                        }
                        gbs = gbs2;
                    }
                case wi.z /*3*/:
                    return resources.getDisplayMetrics().density;
                case wi.h /*4*/:
                    if (i != 0) {
                        return ((float) i3) / ((float) i);
                    }
                    throw new IllegalArgumentException("Source height cannot be 0");
                case wi.p /*5*/:
                    if (i2 != 0) {
                        return ((float) i4) / ((float) i2);
                    }
                    throw new IllegalArgumentException("Source width cannot be 0");
                default:
                    String valueOf = String.valueOf(gbs);
                    iil.a(new StringBuilder(String.valueOf(valueOf).length() + 21).append("Invalid scaleMethod: ").append(valueOf).toString());
                    return 0.0f;
            }
        }
    }

    public static mup a(CellInfo cellInfo) {
        mup mup = new mup();
        StringBuilder stringBuilder = new StringBuilder();
        if (cellInfo instanceof CellInfoGsm) {
            CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
            if (cellIdentity != null) {
                mup.a = Integer.valueOf(1);
                stringBuilder.append(cellIdentity.getMcc());
                stringBuilder.append(cellIdentity.getMnc());
                stringBuilder.append(String.format("%04x", new Object[]{Integer.valueOf(cellIdentity.getLac())}));
                stringBuilder.append(String.format("%04x", new Object[]{Integer.valueOf(cellIdentity.getCid())}));
            }
        } else if (cellInfo instanceof CellInfoWcdma) {
            CellIdentityWcdma cellIdentity2 = ((CellInfoWcdma) cellInfo).getCellIdentity();
            if (cellIdentity2 != null) {
                mup.a = Integer.valueOf(2);
                stringBuilder.append(cellIdentity2.getMcc());
                stringBuilder.append(cellIdentity2.getMnc());
                stringBuilder.append(String.format("%04x", new Object[]{Integer.valueOf(cellIdentity2.getLac())}));
                stringBuilder.append(String.format("%07x", new Object[]{Integer.valueOf(cellIdentity2.getCid())}));
            }
        } else if (cellInfo instanceof CellInfoLte) {
            CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
            if (cellIdentity3 != null) {
                mup.a = Integer.valueOf(5);
                stringBuilder.append(cellIdentity3.getMcc());
                stringBuilder.append(cellIdentity3.getMnc());
                stringBuilder.append(String.format("%04x", new Object[]{Integer.valueOf(cellIdentity3.getTac())}));
                stringBuilder.append(String.format("%07x", new Object[]{Integer.valueOf(cellIdentity3.getCi())}));
            }
        } else {
            glk.c("Babel_telephony", "TeleAccessNetworkInfoUtil.getAccessNetworkInfoForCellInfo, Unsupported CellInfo", new Object[0]);
            return null;
        }
        mup.b = stringBuilder.toString();
        return mup;
    }

    public static mup D(Context context) {
        CellInfo a = gck.a(context);
        if (a != null) {
            return a(a);
        }
        glk.c("Babel_telephony", "TeleAccessNetworkInfoUtil.getAccessNetworkInfo, registered cellular network not available.", new Object[0]);
        return null;
    }

    public static String p(int i) {
        switch (i) {
            case 10000:
                return "CALL_END_NONE";
            case 10001:
                return "CALL_END_UNKNOWN";
            case 10002:
                return "CALL_ENTER_ERROR_HANGOUT_OVER";
            case 10003:
                return "CALL_ENTER_TIMEOUT";
            case 10004:
                return "CALL_ENTER_TIMEOUT_CREATE_CONV";
            case 10005:
                return "CALL_ENTER_TIMEOUT_SIGN_IN";
            case 10006:
                return "CALL_ENTER_TIMEOUT_JID_LOOKUP";
            case 10007:
                return "CALL_ENTER_TIMEOUT_ROOM_DISCOVERY";
            case 10008:
                return "CALL_ENTER_TIMEOUT_ROOM_CONFIG";
            case 10009:
                return "CALL_ENTER_TIMEOUT_ENTER_CHATROOM";
            case 10010:
                return "CALL_ENTER_TIMEOUT_INITIATE_SESSION";
            case 10011:
                return "CALL_ENTER_TIMEOUT_CREATE_HANGOUT_ID";
            case 10012:
                return "CALL_ENTER_ERROR_BLOCKED";
            case 10013:
                return "CALL_ENTER_ERROR_BLOCKING";
            case 10014:
                return "CALL_ENTER_ERROR_MAX_USERS";
            case 10015:
                return "CALL_ENTER_ERROR_SERVICE_UNAVAILABLE";
            case 10016:
                return "CALL_ENTER_ERROR_MEDIA_SESSION_REJECTED";
            case 10017:
                return "CALL_ENTER_ERROR_NOT_ACCEPTABLE";
            case 10018:
                return "CALL_ENTER_ERROR_ROOM_LOCKED";
            case 10019:
                return "CALL_ENTER_ERROR_UNEXPECTED_HOA";
            case 10020:
                return "CALL_ENTER_ERROR_MATURE_CONTENT";
            case 10021:
                return "CALL_END_SIG_SOCKET_CLOSED";
            case 10022:
                return "CALL_END_SIG_CHANNEL_TIMEOUT";
            case 10023:
                return "CALL_ERROR_MEDIA_CONNECTIVITY_FAILURE";
            case 10024:
                return "CALL_ERROR_MEDIA_SESSION_TERMINATED_REMOTELY";
            case 10025:
                return "CALL_END_KICKED";
            case 10026:
                return "CALL_ENTER_ERROR_UNEXPECTED_ABUSE_RECORDABLE";
            case 11000:
                return "CALL_ENTER_ERROR_SIGNIN_FAILED";
            case 11001:
                return "CALL_ENTER_ERROR_NO_NETWORK";
            case 11002:
                return "CALL_ENTER_ERROR_WIFI_REQUIRED";
            case 11003:
                return "CALL_END_NETWORK_DISCONNECTED";
            case 11004:
                return "CALL_END_LOCAL_USER_ENDED";
            case 11005:
                return "CALL_END_AUTO_EXIT_ON_EMPTY_HANGOUT";
            case 11006:
                return "CALL_END_PHONE_CALL";
            case 11007:
                return "CALL_END_REMOTE_USER_UNAVAILABLE";
            case 11008:
                return "CALL_END_MISSING_CODEC";
            case 11009:
                return "CALL_END_REMOTE_USER_ENDED";
            case 11010:
                return "CALL_END_RING_UNANSWERED";
            case 11011:
                return "CALL_END_RING_DECLINED";
            case 11012:
                return "CALL_END_NOT_ONGOING_AS_EXPECTED";
            case 11013:
                return "CALL_ENTER_ERROR_ONGOING_PHONE_CALL";
            case 11014:
                return "CALL_END_ERROR_INSUFFICIENT_FUNDS";
            case 11015:
                return "CALL_END_HANDOFF_TO_CELLULAR";
            case 11017:
                return "CALL_ERROR_ANDROID_TELEPHONY_API_ERROR";
            case 11018:
                return "CALL_ERROR_HANDOFF_TO_PSTN_ERROR_NETWORK_DISCONNECTED";
            default:
                return "VideoChatConstants.UNKNOWN: " + i;
        }
    }

    public static int q(int i) {
        switch (i) {
            case 67:
            case 10024:
                return 3;
            case 10000:
            case 10001:
            case 10003:
            case 10004:
            case 10005:
            case 10006:
            case 10007:
            case 10008:
            case 10009:
            case 10010:
            case 10011:
            case 10012:
            case 10013:
            case 10014:
            case 10015:
            case 10016:
            case 10017:
            case 10018:
            case 10019:
            case 10020:
            case 10021:
            case 10022:
            case 10023:
            case 10026:
            case 10030:
            case 11000:
            case 11001:
            case 11002:
            case 11003:
            case 11007:
            case 11008:
            case 11010:
            case 11011:
            case 11012:
            case 11013:
            case 11014:
            case 11018:
                return 1;
            case 10002:
                return 2;
            case 10025:
                return 2;
            case 11004:
            case 11005:
            case 11006:
                return 2;
            case 11009:
                return 3;
            case 11015:
                return 2;
            default:
                iil.a("unknown hangouts end cause: " + i);
                return 1;
        }
    }

    public static int r(int i) {
        switch (i) {
            case wi.w /*0*/:
            case wi.j /*1*/:
            case wi.m /*8*/:
            case wi.n /*9*/:
                return 11017;
            case wi.l /*2*/:
            case wi.h /*4*/:
                return 11004;
            case wi.z /*3*/:
                return 11009;
            case wi.p /*5*/:
                return 11010;
            case wi.s /*6*/:
                return 11011;
            case wi.q /*7*/:
                return 11007;
            default:
                iil.a("Unexpected DisconnectCause: " + i);
                return 10001;
        }
    }

    public static String s(int i) {
        switch (i) {
            case wi.w /*0*/:
                return "UNKNOWN";
            case wi.j /*1*/:
                return "USER_RESPONDED";
            case wi.l /*2*/:
                return "USER_KICKED";
            case wi.z /*3*/:
                return "INVITER_CANCELLED";
            case wi.h /*4*/:
                return "INVITE_TIMEOUT";
            default:
                return "HangoutInviteNotification.UNEXPECTED_DISSMIS_REASON_" + i;
        }
    }

    public static String t(int i) {
        switch (i) {
            case wi.j /*1*/:
                return "PstnStateErrorType.ERROR_MEDIA_TIMEOUT";
            case wi.l /*2*/:
                return "PstnStateErrorType.ERROR_MEDIA_IO_EXCEPTION";
            case wi.z /*3*/:
                return "PstnStateErrorType.ERROR_UNEXPECTED_CLOSE_ENDPOINT";
            case wi.h /*4*/:
                return "PstnStateErrorType.ERROR_JINGLE_TERMINATE";
            case wi.p /*5*/:
                return "PstnStateErrorType.ERROR_DEBUG_COMMAND";
            case wi.s /*6*/:
                return "PstnStateErrorType.ERROR_SERVER_SHUTDOWN";
            case wi.q /*7*/:
                return "PstnStateErrorType.ERROR_INSUFFICIENT_FUNDS";
            case wi.m /*8*/:
                return "PstnStateErrorType.ERROR_BUSY";
            case wi.n /*9*/:
                return "PstnStateErrorType.ERROR_TPAPI";
            case wi.dr /*10*/:
                return "PstnStateErrorType.ERROR_CONNECTION_FAILED";
            case wi.dB /*11*/:
                return "PstnStateErrorType.ERROR_CANNOT_CALL_YOURSELF";
            case wi.dM /*12*/:
                return "PstnStateErrorType.ERROR_USER_ALREADY_IN_CALL ";
            case wi.dD /*13*/:
                return "PstnStateErrorType.ERROR_FAILOVER_FAILED ";
            case wi.g /*14*/:
                return "PstnStateErrorType.ERROR_INCOMING_CALL_ANSWERED_ELSEWHERE";
            case wi.dJ /*15*/:
                return "PstnStateErrorType.ERROR_INCOMING_CALL_WENT_TO_VOICEMAIL";
            case wi.dI /*16*/:
                return "PstnStateErrorType.ERROR_CONNECTION_TIMEOUT";
            default:
                return "PstnStateErrorType.UNKNOWN: " + i;
        }
    }

    public static String o(Context context, int i) {
        switch (i) {
            case wi.q /*7*/:
                return context.getString(vL);
            case wi.m /*8*/:
                return context.getString(vJ);
            case wi.dr /*10*/:
                return context.getString(vK);
            default:
                return null;
        }
    }

    public static String p(Context context, int i) {
        switch (i) {
            case 10001:
                return context.getString(vF);
            case 10003:
            case 10004:
            case 10005:
            case 10006:
            case 10007:
            case 10008:
            case 10009:
            case 10010:
            case 10011:
                return context.getString(vI);
            case 10012:
            case 10013:
            case 10014:
            case 10015:
            case 10016:
            case 10017:
            case 10018:
            case 10019:
            case 10020:
            case 10026:
            case 11001:
            case 11002:
            case 11012:
            case 11013:
                return context.getString(vG);
            case 10021:
            case 10022:
            case 10023:
            case 11003:
            case 11018:
                return context.getString(vD);
            case 11000:
                return context.getString(vH);
            case 11008:
                return context.getString(vC);
            case 11010:
            case 11011:
                return context.getString(vE);
            case 11014:
                return context.getString(vL);
            default:
                return null;
        }
    }

    public static int u(int i) {
        if (i == 11003 || i == 11018) {
            return 95;
        }
        if (i == 11012) {
            return 27;
        }
        switch (q(i)) {
            case wi.l /*2*/:
            case wi.z /*3*/:
                return 27;
            case wi.q /*7*/:
                return 17;
            default:
                return -1;
        }
    }

    public static String v(int i) {
        switch (i) {
            case wi.w /*0*/:
                return "UNKNOWN";
            case wi.j /*1*/:
                return "GPRS";
            case wi.l /*2*/:
                return "EDGE";
            case wi.z /*3*/:
                return "UMTS";
            case wi.h /*4*/:
                return "CDMA";
            case wi.p /*5*/:
                return "EVDO_0";
            case wi.s /*6*/:
                return "EVDO_A";
            case wi.q /*7*/:
                return "1xRTT";
            case wi.m /*8*/:
                return "HSDPA";
            case wi.n /*9*/:
                return "HSUPA";
            case wi.dr /*10*/:
                return "HSPA";
            case wi.dB /*11*/:
                return "IDEN";
            case wi.dM /*12*/:
                return "EVDO_B";
            case wi.dD /*13*/:
                return "LTE";
            case wi.g /*14*/:
                return "EHRPD";
            case wi.dJ /*15*/:
                return "HSPAP";
            default:
                return "INVALID_" + i;
        }
    }

    public static void a(Context context, Bundle bundle, int i, String str, int i2, boolean z, boolean z2, String str2, String str3, String str4, Boolean bool, Integer num) {
        CharSequence charSequence;
        String str5 = "Babel_telephony";
        String str6 = "TeleFeedback.showNotification, phoneNumber: ";
        String valueOf = String.valueOf(G(str));
        glk.c(str5, valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6), new Object[0]);
        if (str == null) {
            charSequence = null;
        } else {
            Object a = glq.a(H(), str, glu.a);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = (int) currentTimeMillis;
        PendingIntent a2 = a(context, i3, bundle, i, 1, i2, z2, z, str2, str3, str4, bool, num);
        ((NotificationManager) context.getSystemService("notification")).notify("telephony_call_feedback", i3, new fx(context).a(context.getString(vl)).b(charSequence).a(vb).d(-1).a(currentTimeMillis).a(true).e(context.getResources().getColor(uR)).a(uT, context.getString(ve), a2).a(uS, context.getString(vd), a(context, i3, bundle, i, 5, i2, z2, z, str2, str3, str4, bool, num)).a(a(context, i3, bundle, i, 0, i2, z2, z, str2, str3, str4, bool, num)).b());
        ((AlarmManager) context.getSystemService("alarm")).set(3, ((long) a(context, "babel_telephony_feedback_duration_millis", 300000)) + SystemClock.elapsedRealtime(), PendingIntent.getBroadcast(context, i3, new Intent("com.google.android.apps.hangouts.telephony.TeleFeedback.ALARM").putExtra("telephony_id", i3), 1073741824));
    }

    public static PendingIntent a(Context context, int i, Bundle bundle, int i2, int i3, int i4, boolean z, boolean z2, String str, String str2, String str3, Boolean bool, Integer num) {
        Intent putExtra = new Intent(context, TeleFeedback$FeedbackActivity.class).putExtra("telephony_call_info", bundle).putExtra("account_id", i2).putExtra("telephony_id", i).putExtra("telephony_rating", i3).putExtra("call_type", i4).putExtra("is_incoming", z).putExtra("handoff_attempted", z2).putExtra("participant_log_id", str);
        String str4 = "local_session_id";
        if (str2 == null) {
            str2 = "";
        }
        putExtra = putExtra.putExtra(str4, str2);
        str4 = "remote_session_id";
        if (str3 == null) {
            str3 = "";
        }
        putExtra = putExtra.putExtra(str4, str3).setData(Uri.fromParts("vnd.hangouts", "unique" + i3, null));
        if (num != null) {
            putExtra.putExtra("network_type", num);
        }
        if (bool != null) {
            putExtra.putExtra("was_on_wifi", bool);
        }
        return PendingIntent.getActivity(context, i, putExtra, 1073741824);
    }

    public static void a(Context context, gcq gcq) {
        glk.c("Babel_telephony", "TeleIncomingAutoAnswer.answerIfNecessary", new Object[0]);
        if (gcq.getState() != 6) {
            Object b = b(context, "babel_testing_auto_answer_incoming_caller_ids", gda.a);
            if (!TextUtils.isEmpty(b)) {
                String d = gcq.f().d();
                for (String str : b.split(",")) {
                    if (f(d, str)) {
                        d = "Babel_telephony";
                        String str2 = "TeleIncomingAutoAnswer.answerIfNecessary, found matching auto answer caller ID: ";
                        String valueOf = String.valueOf(str);
                        glk.c(d, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                        gcq.onAnswer();
                        return;
                    }
                }
                if (a(context, "babel_testing_auto_reject_mismatched_incoming_calls", false)) {
                    glk.c("Babel_telephony", "TeleIncomingAutoAnswer.answerIfNecessary, caller ID didn't match, rejecting call", new Object[0]);
                    gcq.onReject();
                }
            }
        }
    }

    public static boolean a(Context context, gdo gdo) {
        int E = E(context);
        if (E < 0) {
            glk.c("Babel_telephony", "TeleIncomingWifiCallFallback.scheduleAlarm, fallback disabled", new Object[0]);
            return false;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.apps.hangouts.telephony.TeleIncomingWifiCallFallback.ALARM").putExtra("invite_info", gdo.a()), 1073741824);
        glk.c("Babel_telephony", "TeleIncomingWifiCallFallback.scheduleAlarm, scheduling for (millis): " + E, new Object[0]);
        ((AlarmManager) context.getSystemService("alarm")).setExact(2, glj.b() + ((long) E), broadcast);
        return true;
    }

    public static int E(Context context) {
        if (((TelephonyManager) context.getSystemService("phone")).getPhoneType() == 2) {
            return a(context, "babel_fallback_to_wifi_timeout_cdma_millis", 5000);
        }
        return a(context, "babel_fallback_to_wifi_timeout_gsm_millis", 5000);
    }

    public static void b(Context context, gdo gdo) {
        LinkedList q = q(context, gdo.f);
        q.add(gdo);
        a(context, gdo.f, q);
    }

    public static boolean a(Context context, int i, dhz dhz) {
        LinkedList q = q(context, i);
        Iterator it = q.iterator();
        glk.c("Babel_telephony", "TeleIncomingWifiCallLog.cancelInvite, invite count: " + q.size(), new Object[0]);
        boolean z = false;
        while (it.hasNext()) {
            boolean z2;
            if (((gdo) it.next()).a.equals(dhz)) {
                it.remove();
                z2 = true;
            } else {
                z2 = z;
            }
            z = z2;
        }
        if (z) {
            a(context, i, q);
        }
        return z;
    }

    public static LinkedList<gdo> q(Context context, int i) {
        String c = ggc.a(context).c(i);
        if (c == null) {
            return new LinkedList();
        }
        byte[] decode = Base64.decode(c, 0);
        if (decode == null) {
            return new LinkedList();
        }
        try {
            ggb ggb = (ggb) nzf.a(new ggb(), decode);
            LinkedList linkedList = new LinkedList();
            for (gga gga : ggb.a) {
                dhz dhz;
                if (gga.a == null) {
                    dhz = null;
                } else {
                    gfy gfy = gga.a;
                    dhz = new dib(gfy.a, gfy.j).a(TextUtils.isEmpty(gfy.b) ? null : gfy.b).b(TextUtils.isEmpty(gfy.c) ? null : gfy.c).c(TextUtils.isEmpty(gfy.d) ? null : gfy.d).d(TextUtils.isEmpty(gfy.e) ? null : gfy.e).e(TextUtils.isEmpty(gfy.f) ? null : gfy.f).f(TextUtils.isEmpty(gfy.g) ? null : gfy.g).g(TextUtils.isEmpty(gfy.h) ? null : gfy.h).i(TextUtils.isEmpty(gfy.i) ? null : gfy.i).a(gfy.k).h(TextUtils.isEmpty(gfy.l) ? null : gfy.l).a();
                }
                gcw gcw = null;
                if (!(gga.e == null && gga.f == null)) {
                    gcw = new gcw(gga.e, gga.f);
                }
                linkedList.add(new gdo(dhz, TextUtils.isEmpty(gga.b) ? null : gga.b, gga.c, gga.d, gcw, gga.g, gga.i, gec.a(gga.h)));
            }
            return a(context, linkedList);
        } catch (Throwable e) {
            glk.d("Babel_telephony", "TeleInvomingWifiCallLog.getInvites, unable to parse invites", e);
            return new LinkedList();
        }
    }

    public static void a(Context context, int i, LinkedList<gdo> linkedList) {
        ggc a = ggc.a(context);
        LinkedList a2 = a(context, (LinkedList) linkedList);
        glk.c("Babel_telephony", "TeleIncomingWifiCallLog.setInvites, new invite count: " + a2.size(), new Object[0]);
        if (a2.isEmpty()) {
            a.a(i, null);
            return;
        }
        nzf ggb = new ggb();
        ggb.a = new gga[a2.size()];
        for (int i2 = 0; i2 < a2.size(); i2++) {
            ggb.a[i2] = ((gdo) a2.get(i2)).b();
        }
        ggc.a(context).a(i, Base64.encodeToString(nzf.a(ggb), 0));
    }

    public static LinkedList<gdo> a(Context context, LinkedList<gdo> linkedList) {
        LinkedList<gdo> linkedList2 = new LinkedList();
        long b = glj.b();
        long a = (long) a(context, "babel_incoming_wif_invite_max_age_millis", 25000);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            gdo gdo = (gdo) it.next();
            if (b - gdo.d < a) {
                linkedList2.add(gdo);
            }
        }
        return linkedList2;
    }

    public static String F(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
    }

    public static String G(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager != null) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                String ssid = connectionInfo.getSSID();
                if (ssid == null || ssid.length() <= 1 || !ssid.startsWith("\"") || !ssid.endsWith("\"")) {
                    return ssid;
                }
                return ssid.substring(1, ssid.length() - 1);
            }
        }
        return null;
    }

    public static boolean H(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    // Check that we are connected to network on Wifi
    public static boolean I(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        // If we have network info AND it says we are connected AND network is type 1 (TYPE_WIFI)
        // https://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_WIFI
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            return true;
        }
        return false;
    }

    public static Uri F(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.fromParts("tel", str, null);
    }

    public static PhoneAccountHandle J(Context context) {
        return new PhoneAccountHandle(new ComponentName(context, TeleConnectionService.class), "hangouts");
    }

    public static void a(gcq gcq, DisconnectCause disconnectCause) {
        Integer num = null;
        boolean z = false;
        Context d = gcq.d();
        if (!a(d, "babel_request_call_feedback", false)) {
            glk.c("Babel_telephony", "TeleUtils.requestCallFeedback, disabled by default for user", new Object[0]);
        } else if (!ggc.a(d).j()) {
            glk.c("Babel_telephony", "TeleUtils.requestCallFeedback, disabled by user settings", new Object[0]);
        } else if (disconnectCause.getCode() != 5 && disconnectCause.getCode() != 6) {
            int f = ggc.a(d).f();
            if (f == -1) {
                glk.c("Babel_telephony", "TeleUtils.requestCallFeedback, no tycho account, not sending feedback", new Object[0]);
                return;
            }
            String q;
            Boolean n;
            if (gcq.j() != null) {
                z = true;
            }
            iil.a("Expected condition to be true", z);
            Bundle a = a(gcq, disconnectCause, f);
            String r = gcq.r();
            if (TextUtils.isEmpty(r)) {
                r = gcq.j().e();
            }
            gcc j = gcq.j();
            if (j instanceof gfj) {
                gfj gfj = (gfj) j;
                q = gfj.q();
                num = gfj.o();
                n = gfj.n();
            } else {
                n = null;
                q = null;
            }
            a(d, a, f, gcq.f().c(), gcq.j().d(), gcq.l(), gcq.g(), gcq.i(), r, q, n, num);
        }
    }

    public static Bundle a(gcq gcq, DisconnectCause disconnectCause, int i) {
        Bundle bundle = new Bundle();
        if (gcq.u() != null) {
            bundle.putString("call_log", gcq.u());
        }
        if (gcq.q() != null) {
            bundle.putString("hangout_id", gcq.q());
        }
        if (gcq.r() != null) {
            bundle.putString("callgrok_session_id", gcq.r());
        }
        if (gcq.s() != null) {
            bundle.putString("participant_id", gcq.s());
        }
        if (gcq.i() != null) {
            bundle.putString("participant_log_id", gcq.i());
        }
        if (!(gcq.j() == null || gcq.j().e() == null)) {
            bundle.putString("call_id", gcq.j().e());
        }
        if (gcq.n() != null) {
            bundle.putString("handoff_number", gcq.n());
        }
        Object f = glq.f(H());
        if (!TextUtils.isEmpty(f)) {
            bundle.putString("device_number", f);
        }
        if (!(gcq.f() == null || gcq.f().c() == null)) {
            bundle.putString("remote_party_number", gcq.f().c());
        }
        bundle.putString("call_direction", gcq.g() ? "incoming" : "outgoing");
        if (gcq.o() != null) {
            bundle.putString("wifi_calling_account", gcq.o());
        }
        Context d = gcq.d();
        if (i != -1) {
            bundle.putString("tycho_account", fde.a(d, i));
        }
        if (K(d) != null) {
            bundle.putString("google_corp_account", K(d));
        }
        if (!(disconnectCause == null || disconnectCause.toString() == null)) {
            bundle.putString("disconnect_cause", disconnectCause.toString());
        }
        mup D = D(d);
        if (D != null) {
            String valueOf = String.valueOf(D.a);
            String valueOf2 = String.valueOf(D.b);
            String valueOf3 = String.valueOf(D.d);
            bundle.putString("access_network_info", new StringBuilder(((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append("; ").append(valueOf2).append("; ").append(valueOf3).toString());
        }
        if (!(gcq.h() == null || gcq.h().toString() == null)) {
            bundle.putString("roaming_status", gcq.h().toString());
        }
        if (gcq.t() != null) {
            bundle.putString("experiment_code", gcq.t().toString());
        }
        bundle.putString("local_disconnect", Boolean.valueOf(gcq.m()).toString());
        if (gcq.getAudioState() != null) {
            bundle.putString("audio_route", AudioState.audioRouteToString(gcq.getAudioState().getRoute()));
        }
        gcc j = gcq.j();
        if (j instanceof gfj) {
            gfj gfj = (gfj) j;
            if (gfj.p() != null) {
                gfj.p().a(bundle);
            }
        }
        return bundle;
    }

    public static String K(Context context) {
        Throwable e;
        try {
            for (Account account : ((ics) jyn.a(context, ics.class)).a("com.google")) {
                if (account.name.endsWith("@google.com")) {
                    return account.name;
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            glk.d("Babel_telephony", "TeleUtils.getGoogleCorpAccountName, exception", e);
            return null;
        } catch (idt e3) {
            e = e3;
            glk.d("Babel_telephony", "TeleUtils.getGoogleCorpAccountName, exception", e);
            return null;
        } catch (ids e4) {
            e = e4;
            glk.d("Babel_telephony", "TeleUtils.getGoogleCorpAccountName, exception", e);
            return null;
        }
        return null;
    }

    public static boolean a(ConnectionRequest connectionRequest) {
        if (connectionRequest == null) {
            return false;
        }
        if (connectionRequest.getExtras() == null) {
            glk.c("Babel_telephony", "TeleUtils.isGoogleVoiceRequest, no extras", new Object[0]);
            return false;
        }
        //Checks if the Connection request is from google voice with extra info
        //returns true if it is
        CharSequence string = connectionRequest.getExtras().getString("android.telecom.extra.GATEWAY_PROVIDER_PACKAGE");
        String str = "Babel_telephony";
        String str2 = "TeleUtils.isGoogleVoiceRequest, gatewayProviderPackage: ";
        String valueOf = String.valueOf(string);
        glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        return TextUtils.equals("com.google.android.apps.googlevoice", string);
    }

    public static boolean L(Context context) {
        if (vM) {
            return true;
        }
        TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
        try {
            if (J(context).equals(telecomManager.getConnectionManager())) {
                return true;
            }
            PhoneAccount phoneAccount = telecomManager.getPhoneAccount(J(context));
            return (phoneAccount == null || (phoneAccount.getCapabilities() & 2) == 0) ? false : true;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 81).append("TeleUtils.isHangoutsSetAsConnectionManager, calling getConnectionManager failed: ").append(valueOf).toString(), new Object[0]);
            return false;
        }
    }

    public static String M(Context context) {
        String str = null;
        if (a(context, "babel_use_from_number_for_handoff", true)) {
            str = glq.f(H());
        }
        String str2 = "Babel_telephony";
        String str3 = "TeleUtils.getFromNumberForHandoff, fromNumber: ";
        String valueOf = String.valueOf(G(str));
        glk.c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        return str;
    }

    public static String a(gcq gcq) {
        gcw t = gcq.t();
        if (t == null || !t.a("nwc") || !t.b("no_handoff")) {
            return M(gcq.d());
        }
        glk.c("Babel_telephony", "TeleUtils.getFromNumberForNewCall, not setting from number for experiment.", new Object[0]);
        return null;
    }

    public static muq N(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            Object bestProvider = locationManager.getBestProvider(criteria, true);
            if (!TextUtils.isEmpty(bestProvider)) {
                Location lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
                if (lastKnownLocation != null) {
                    muq muq = new muq();
                    muq.a = Integer.valueOf((int) Math.round(lastKnownLocation.getLatitude() * 1000000.0d));
                    muq.b = Integer.valueOf((int) Math.round(lastKnownLocation.getLongitude() * 1000000.0d));
                    muq.c = Double.valueOf((double) lastKnownLocation.getAccuracy());
                    return muq;
                }
            }
        }
        return null;
    }

    public static char b(char c) {
        if (PhoneNumberUtils.is12Key(c)) {
            return '*';
        }
        return c;
    }

    public static String G(String str) {
        if (Log.isLoggable("Babel_telephony", 3)) {
            return str;
        }
        kad kad = glk.w;
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (char b : str.toCharArray()) {
            stringBuilder.append(b(b));
        }
        return stringBuilder.toString();
    }

    public static String e(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!uri.getScheme().equals("tel")) {
            return glk.b(uri.toString());
        }
        String valueOf = String.valueOf("tel:");
        String valueOf2 = String.valueOf(G(uri.getSchemeSpecificPart()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static String J(Object obj) {
        if (obj == null) {
            return null;
        }
        return glk.b(obj.toString());
    }

    public static void O(Context context) {
        glk.c("Babel_telephony", "TeleUtils.forceUnmutePhone, unmuting microphone", new Object[0]);
        ((AudioManager) context.getSystemService("audio")).setMicrophoneMute(false);
    }

    //evaluates if 2 phone addresses in the phone's current country are the same => calling self?
    public static boolean f(String str, String str2) {
        try {
            String i = glq.i(H());//glq.i(Context) => returns country of the phone
            //seems to format based on the given country of the phone
            if (new glo(str, i).a(new glo(str2, i)) == jat.EXACT_MATCH) {
                //create new glo object and compare with new glo object of 2nd string
                //if they match in the same locale country format => same number! (return true)
                return true;
            }
            return false;
        } catch (jap e) {
            return false;
        }
    }

    public static boolean g(String str, String str2) {
        if (a(jar.b().b(str, str2), str2)) {
            glk.c("Babel_telephony", String.format("TeleUtils.compareCallerIdForFuzzyMatch, callerId: %s, match: %s", new Object[]{str2, jar.b().b(str, str2)}), new Object[0]);
            return true;
        }
        if (str2.contains("+")) {
            if (a(jar.b().b(str, str2.replace("+", "")), str2)) {
                glk.c("Babel_telephony", String.format("TeleUtils.compareCallerIdForFuzzyMatch, callerId: %s, match excluding plus: %s", new Object[]{str2, jar.b().b(str, str2.replace("+", ""))}), new Object[0]);
                return true;
            }
        }
        return false;
    }

    public static boolean a(jat jat, String str) {
        if (jat == jat.NSN_MATCH || jat == jat.EXACT_MATCH) {
            return true;
        }
        if (jat != jat.SHORT_NSN_MATCH) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.digit(str.charAt(i2), 10) != -1) {
                i++;
            }
        }
        if (i > 11) {
            return true;
        }
        return false;
    }

    public static void a(Context context, int i, String str, int i2) {
        iie b = ((iih) jyn.a(context, iih.class)).a(i).b();
        if (!TextUtils.isEmpty(str)) {
            b.b(str);
        }
        String f = glq.f(H()); //glq.f(Context)
        if (!TextUtils.isEmpty(f)) {
            b.c(f);
        }
        mcl mcl = new mcl();
        mcl.a = Boolean.valueOf(L(context));
        b.a(mcl);
        if (Q(context)) {
            gck.a(context, new gfi(b, context, i2));
            return;
        }
        glk.c("Babel_telephony", "TeleSetupController.isWifiCallPossible, no coarse location permission.", new Object[0]);
        b.c(i2);
    }

    public static mcm a(gcm gcm, gfv gfv) {
        mcm mcm = new mcm();
        mcm.a = Integer.valueOf(gcm.c); //grabs phoneType for cell
        if (!TextUtils.isEmpty(gcm.d)) {
            mcm.b = gcm.d;
            //grabs Network operatior
        }
        mcm.d = Integer.valueOf(gcm.e); //grabs network type
        mcm.e = new lks();
        mcm.e.c = Integer.valueOf(gcm.b); // signal level percentage
        mcm.e.a = Integer.valueOf(gfv.b);
        if (gcm.f != -1) {
            mcm.c = Integer.valueOf(gcm.f); //if systemID is not -1, grab systemID of cell?
        }
        return mcm;
    }

    public static boolean P(Context context) { //check wifi call permissions
        boolean z;
        ehz ehz = (ehz) jyn.a(context, ehz.class);
        if (ehz.a("android.permission.CALL_PHONE") && ehz.a("android.permission.READ_PHONE_STATE") && ehz.a("android.permission.RECORD_AUDIO")) {
            z = true;
        } else {
            z = false;
        }
        glk.c("Babel_telephony", "TeleUtils.hasWifiCallPermissions, has permissions? : " + z, new Object[0]);
        return z;
    }

    public static boolean Q(Context context) {
        return ((ehz) jyn.a(context, ehz.class)).a("android.permission.ACCESS_COARSE_LOCATION");
    }

    // Check capabilities for making cell calls
    public static boolean R(Context context) {
        // vN always false, this is probably for debugging
        if (vN) {
            return true;
        }
        // Get the phoneAccount and return true if capabilities have a 1 at bit 0th position
        PhoneAccount phoneAccount = ((TelecomManager) context.getSystemService("telecom")).getPhoneAccount(J(context));

        //Phone Account has Connection Manager Capabilities (be able to make VoIP calls)
        //returns true if the condition phoneAccount == null or no Connection Manager Capability is false
        return (phoneAccount == null || (phoneAccount.getCapabilities() & 1) == 0) ? false : true;
    }

    //takes boolean and tests the carrier int
    public static boolean a(Context context, int i, boolean z) {
        if (z) {//if boolean passed is true (boolean stands for incoming)
            if (a(context, "babel_hutch_lte_incoming_enabled", false) && (i == 4 || i == 5)) {
                //check if lte incoming is good with gservices else default is false and the carrier is either Hutchinson 3G or Hutchinson Telecom
                return true;
            }
            return false;
        } else if ((a(context, "babel_hutch_lte_outgoing_enabled", true) && (i == 4 || i == 5)) || a(context, "babel_hutch_experience_for_us", false)) {
            //check outgoing lte with gservice else default is true & carrier is Hutchinson 3G or Hutchinson Telecom
            //or babel_hutch_experience is for U.S. is allowed (default is false)
            return true;
        } else {
            return false;
        }
    }

    public static boolean b(Context context, int i, boolean z) {
        //given context, Sim Operator code, and is inbound?
        if (z) {//is inbound
            // Sim operator codes 4 and 5 are international carriers (in UK and HK)
            if ((a(context, "babel_hutch_three_g_incoming_enabled", false) && (i == 4 || i == 5)) || a(context, "babel_hutch_3g_incoming_experience_for_us", false)) {
                //(3G incoming okay with g servics and carriers are HK or UK) or (incoming_3G_for_US allowed)
                return true;
            }
            return false;
        } else if ((a(context, "babel_hutch_three_g_outgoing_enabled", true) && (i == 4 || i == 5)) || a(context, "babel_hutch_3g_outgoing_experience_for_us", false)) {
            //(3G outgoing okay with gservices, default true and carriers are HK or UK) or (outgoing 3G for US allowed by gservices)
            return true;
        } else {
            return false;
        }
    }

    public static boolean w(int i) {
        return i == 8 || i == 9 || i == 15 || i == 10;
    }

    public static String i(Context context, String str) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String simCountryIso = telephonyManager.getSimCountryIso();
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (simCountryIso != null) {
            simCountryIso = simCountryIso.toUpperCase(Locale.US);
        }
        if (networkCountryIso != null) {
            networkCountryIso = networkCountryIso.toUpperCase(Locale.US);
        }
        String valueOf = String.valueOf(G(str));
        simCountryIso = String.valueOf(glk.b(simCountryIso));
        String valueOf2 = String.valueOf(glk.b(networkCountryIso));
        glk.c("Babel_telephony", new StringBuilder(((String.valueOf(valueOf).length() + 73) + String.valueOf(simCountryIso).length()) + String.valueOf(valueOf2).length()).append("TeleUtils.toValidGvE164Number, number: ").append(valueOf).append(", sim country: ").append(simCountryIso).append(", network country: ").append(valueOf2).toString(), new Object[0]);
        simCountryIso = glq.c(context, str);
        if (simCountryIso == null) {
            return PhoneNumberUtils.formatNumberToE164(str, networkCountryIso);
        }
        return simCountryIso;
    }

    //given context, current network carrier, cell info, wifi context, and string calculate allow outbound Lte Call
    public static boolean a(Context context, gec gec, gcm gcm, gfv gfv, String str) {
        if (gfv.a) { //if wifi is connected, do not allow outgoing Lte call (returns false)
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, connected to wifi", new Object[0]);
            return false;
        } else if (gcm.e != 13) {
            //going to guess if network type == 13 phone is connected to Lte
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, not connected to LTE", new Object[0]);
            return false;
        } else if (!H(context)) { //check if there is an active connection given context
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, not connected to internet", new Object[0]);
            return false;
        } else if (gec.c() == 2 && glq.d(H(), str) && a(context, "babel_lte_fallback_for_outgoing_tmobile_emergency_call", true)) {
            //identifies T-mobile as #2
            //carrier is T-mobile & phone is emergency number & (biw.a(context,string,bool) or true) => gservices allow this?
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, falling back to LTE for emergency call over T-Mobile", new Object[0]);
            return true;
        } else if (a(context, "babel_lte_outgoing_call_allowed", false)) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, LTE outgoing call allowed by default", new Object[0]);
            return true;
        } else if (a(context, gec.c(), false)) {//check for context and carrier and for outgoing call
            //so by the time I get here, we've already determined we have internet & are connected to LTE but no wifi => can make VoLTE
            //a(Context, int, boolean) => carriers Hutchinson 3G or Hutchinson Telecom allow incoming and outgoing with gservice approval
            //otherwise if in US, is hutch experience allowed.
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall,on carrier where we support voip calling over LTE, carrierId: " + gec.c(), new Object[0]);
            return true;
        } else {
            //default is no.
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoingLteCall, returning false", new Object[0]);
            return false;
        }
    }

    //given context, current network carrier, cell info, wifi context, and string calculate allow 3G Call
    public static boolean a(Context context, gec gec, gcm gcm, gfv gfv) {
        if (gfv.a) { //connected to wifi => false
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoing3GCall, connected to wifi", new Object[0]);
            return false;
        } else if (!w(gcm.e)) { //network type is 8,9,15,10 => connected to 3G
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoing3GCall, not connected to 3G", new Object[0]);
            return false;
        } else if (!H(context)) { //check if there is an active connection given context
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoing3GCall, not connected to internet", new Object[0]);
            return false;
        } else if (b(context, gec.c(), false)) { //b(context,int,boolean) (boolean = is outbound)
            //if Carrier is Hutchinson 3G or Hutchinson Telecom & Gservices allow 3G call & this is outbound=> allow outbound 3G call (ensures it isn't a 3G incoming call)
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowOutgoing3GCall,on carrier where we support voip calling over 3G, carrierId: " + gec.c(), new Object[0]);
            return true;
        } else {
            //not too sure why this becomes Incoming...
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncoming3GCall, returning false", new Object[0]);
            return false;
        }
    }

    //determines allowing the incoming Lte call
    public static boolean b(Context context, gec gec, gcm gcm, gfv gfv) {
        if (gfv.a) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, connected to wifi", new Object[0]);
            return false;
        } else if (gcm.e != 13) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, not connected to LTE", new Object[0]);
            return false;
        } else if (!H(context)) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, not connected to internet", new Object[0]);
            return false;
        } else if (a(context, gec)) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, allowing possible emergency callback over LTE", new Object[0]);
            return true;
        } else if (a(context, "babel_lte_incoming_call_allowed", false)) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, any incoming call over LTE allowed by config", new Object[0]);
            return true;
        } else if (a(context, gec.c(), true)) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall,on carrier where we support voip calling over LTE, carrierId: " + gec.c(), new Object[0]);
            return true;
        } else {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncomingLteCall, returning false", new Object[0]);
            return false;
        }
    }

    //allow incoming 3G call
    public static boolean c(Context context, gec gec, gcm gcm, gfv gfv) {
        if (gfv.a) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncoming3GCall, connected to wifi", new Object[0]);
            return false;
        } else if (!w(gcm.e)) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncoming3GCall, not connected to 3G", new Object[0]);
            return false;
        } else if (!H(context)) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncoming3GCall, not connected to internet", new Object[0]);
            return false;
        } else if (b(context, gec.c(), true)) { //very similar to the outbound version but this bool is inbound
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncoming3GCall,on carrier where we support voip calling over 3G, carrierId: " + gec.c(), new Object[0]);
            return true;
        } else {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowIncoming3GCall, returning false", new Object[0]);
            return false;
        }
    }

    //checks whether or not to make wifi call given context, network state, cell state, wifi cell state, string
    //summary:
    // if no cell service => wifi call (if wifi connected)
    //
    public static boolean b(Context context, gec gec, gcm gcm, gfv gfv, String str) {
        // gfo: data structure holding service/signal state
        gfo a = a(context, gec, gcm.e); //creates a new wifi calculator based on cell state, network type, and context???
        //need to check how this wifi calculator is made
        //reports what's the signal into the logs with network state(gec), cell state, wifi signal, wifi calculator (as threshold)
        glk.c("Babel_telephony", String.format(Locale.US, "TeleWifiCallThreshold.hasGoodSignalForNewWifiCall, network status is: %s\ncell signal is: %s\nwifi signal is: %s\nthreshold is: %s", new Object[]{gec, gcm, gfv, a}), new Object[0]);
        if (VERSION.SDK_INT < 23 && S(context)) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.hasGoodSignalForNewWifiCall, phone is in power save mode; WiFi is not stable enough for calls.", new Object[0]);
            return false;
        } else if (gcm.a()) { //has no service (cell signal percentage is -1 or 0 or cell state is not 0)
            glk.c("Babel_telephony", "TeleWifiCallThreshold.hasGoodSignalForNewWifiCall, no cell service", new Object[0]);
            return gfv.a; //return wifi is connected
        } else if (glq.d(H(), str)) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.hasGoodSignalForNewWifiCall, possible emergency call", new Object[0]);
            return gfv.a;
        // (gcm.a(a.a)) => (is_service_better_than(some_service_state.cell_signal))
        } else if (gcm.a(a.a)) { //checks if cell signal is better than cell signal??? of wifi calculator...  wonder if they actually meant gfv...
            glk.c("Babel_telephony", "TeleWifiCallThreshold.hasGoodSignalForNewWifiCall, cell is better than threshold", new Object[0]);
            return false;
        } else if (gfv.a(a.b, a.d)) { //wifi signal is better than wifi signal speed and wifi link handoff
            glk.c("Babel_telephony", "TeleWifiCallThreshold.hasGoodSignalForNewWifiCall, returning true", new Object[0]);
            return true;
        } else {
            //default is false.
            glk.c("Babel_telephony", "TeleWifiCallThreshold.hasGoodSignalForNewWifiCall, wifi is below threshold", new Object[0]);
            return false;
        }
    }

    public static boolean a(Context context, gec gec, gfv gfv, int i) {
        gfo a = a(context, gec, i);
        if (gfv.a(a.c, a.e)) {
            return true;
        }
        Locale locale = Locale.US;
        String valueOf = String.valueOf(gec.toString());
        glk.c("Babel_telephony", String.format(locale, new StringBuilder(String.valueOf(valueOf).length() + 167).append("TeleWifiCallThreshold.hasGoodSignalForOngoingWifiCall, network status is: ").append(valueOf).append("wifi signal is: %s\nwhich is below wifi signal threshold: %d%% or link speed threshold: %dMbps").toString(), new Object[]{gfv, Integer.valueOf(a.c), Integer.valueOf(a.e)}), new Object[0]);
        return false;
    }

    //network predictor
    public static boolean a(Context context, gec gec, PredictedNetworkQuality predictedNetworkQuality, gcm gcm) {
        if (predictedNetworkQuality == null) { //no prediction defaults to good?!
            glk.c("Babel_telephony", "TeleWifiCallThreshold.hasNetworkQualityForNewWifiCall, no prediction, assuming good network", new Object[0]);
            return true;
        }
        gfo a = a(context, gec, gcm.e);
        //predicted Network Quality.c = predicted latency
        if (predictedNetworkQuality.c >= 0 && ((long) predictedNetworkQuality.c) > a.f) {
            //predicted latency non zero and greater than latency threshold => bad wifi
            int i = predictedNetworkQuality.c;
            glk.c("Babel_telephony", "TeleWifiCallThreshold.hasNetworkQualityForNewWifiCall, predicted latency " + i + "micros exceeds threshold " + a.f + "micros", new Object[0]);
            return false;
        } else if (predictedNetworkQuality.d < 0 || (predictedNetworkQuality.d << 3) >= a.g) {
            //predicted latency is less than 0 or predictedNetworkQuality.downlink*8 >= downlink threshold => really good wifi
            String valueOf = String.valueOf(predictedNetworkQuality);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 80).append("TeleWifiCallThreshold.hasNetworkQualityForNewWifiCall, has good network quality ").append(valueOf).toString(), new Object[0]);
            return true;
        } else {
            //bad down link => fail
            glk.c("Babel_telephony", "TeleWifiCallThreshold.hasNetworkQualityForNewWifiCall, down throughput " + predictedNetworkQuality.d + "Bps below threshold", new Object[0]);
            return false;
        }
    }

    public static boolean a(Context context, gec gec) {
        if (gec.c() != 2) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowEmergencyCallbackOverLte, not on T-Mobile", new Object[0]);
            return false;
        }
        long l = ggc.a(context).l();
        if (l == 0) {
            glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowEmergencyCallbackOverLte, user never made an emergency call over LTE", new Object[0]);
            return false;
        }
        l = System.currentTimeMillis() - l;
        long a = a(context, "babel_lte_fallback_for_emergency_callback_duration_millis", 86400000);
        if (l <= a) {
            return true;
        }
        glk.c("Babel_telephony", "TeleWifiCallThreshold.shouldAllowEmergencyCallbackOverLte, last emergency call over LTE was: " + l + " millis ago which is greater than threshold: " + a, new Object[0]);
        return false;
    }

    //creates a wifi threshold calc given context, network status, and an int (network type for some calling methods)
    public static gfo a(Context context, gec gec, int i) {
        Collection arrayList = new ArrayList();
        if (gec.b(context)) { //if locale is US or passes gwb.a(context, string, boolean)
            if (!TextUtils.isEmpty(gec.d())) { //if ISO is non empty
                arrayList.add(String.format(Locale.US, "_international_%s", new Object[]{gec.d()}));
                //add US recognized name of ISO
            }
            arrayList.add("_international");
        } else if (gec.a() == 2) {
            //if locale is not US and did not pass gwb.a(context,string,boolean) but SimOperator code/ initial a meet gec.a()
            arrayList.add("_domestic_roaming");
            //states that I roamed domesitcally~
        }
        if (!TextUtils.isEmpty(gec.b())) {
            arrayList.add(String.format(Locale.US, "_carrier_%s", new Object[]{gec.b()}));
            //identify my SimOperator as long as I have one
        }
        arrayList.add(String.format(Locale.US, "_network_type_%s", new Object[]{v(i)}));
        gfo gfo = new gfo();
        biw g = g(context);
        //so the other fields of the gfo are based on a(biw, Collection<String>, string, int)
        gfo.b = a(g, arrayList, "babel_wifi_signal_level_percent_threshold_new_call", 50);
        gfo.c = a(g, arrayList, "babel_wifi_signal_level_percent_threshold_jmi_handoff", 20);
        gfo.d = a(g, arrayList, "babel_wifi_link_speed_mbps_threshold", 2);
        gfo.e = a(g, arrayList, "babel_wifi_link_speed_mbps_threshold", 2);
        gfo.a = a(g, arrayList, "babel_cell_signal_level_percent_threshold", 25);
        gfo.f = (long) a(g, arrayList, "babel_wifi_predicted_latency_threshold_new_call_micros", gda.b);
        gfo.g = (long) a(g, arrayList, "babel_wifi_predicted_downlink_througput_threshold_new_call_bps", 512000);
        return gfo;
    }

    //threshold calculator (need to find related subclass of biw... might be in a named file)
    public static int a(biw biw, Collection<String> collection, String str, int i) {
        //per issue in the collection of strings
        for (String str2 : collection) {
            String valueOf = String.valueOf(str);
            String str22 = String.valueOf(str22);
            //if the str 22 is not empty string => add str22 to str  otherwise create a new string object with passed str
            //run method a() of the biw subclass w/ int -1 =>
            int a = biw.a(str22.length() != 0 ? valueOf.concat(str22) : new String(valueOf), -1);
            if (a != -1) {
                return a;
            }
        }

        return biw.a(str, i);
    }

    // boolean in_power_save_mode(context)
    public static boolean S(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (NoSuchMethodError e) {
            return false;
        }
    }

    public static void T(Context context) {
        // vQ always false judging from static globals at the top
        if (!vQ) {
            int callingUid = Binder.getCallingUid();
            // Throws an assertion error if callingUid is not equal to process's UID
            iil.a("Expected condition to be true", callingUid != Process.myUid());
            gtw.a(context).a(context.getPackageManager(), callingUid);
        }
    }

    public static void a(Context context, ggq ggq) {
        glk.c("Babel_telephony", "TeleTychoController.isOnHomeVoiceNetwork", new Object[0]);
        a(context, new ggp(context, ggq));//creates a new ggp and feeds it into a(context, Service Connection)
    }

    public static void U(Context context) {
        glk.c("Babel_telephony", "TeleTychoController.onSimCallManagerChanged", new Object[0]);
        a(context, new ggr(context));
    }

    public static void a(Context context, String str, ggo ggo) {
        glk.c("Babel_telephony", "TeleTychoController.getProxyNumber", new Object[0]);
        if (a(context, "babel_telephony_use_proxy_numbers_from_tycho", true)) {
            a(context, new ggf(context, str, ggo));
        } else {
            ggo.a(1);
        }
    }

    public static void a(Context context, ServiceConnection serviceConnection) {//new intent to bind the tycho account strings
        Intent intent = new Intent("com.google.android.apps.tycho.IVoiceService").setPackage("com.google.android.apps.tycho");
        glk.c("Babel_telephony", "TeleTychoController.bindService, calling bind service", new Object[0]);
        if (!context.bindService(intent, serviceConnection, 1)) {
            glk.c("Babel_telephony", "TeleTychoController.bindService, binding failed", new Object[0]);
            serviceConnection.onServiceDisconnected(null);
        }
    }

    public static String a(String str, String str2, boolean z) {
        Context H = H();
        Object a = ((jvb) jyn.a(H, jvb.class)).a();
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        Account[] a2 = ((ics) jyn.a(H, ics.class)).a("com.google");
        int length = a2.length;
        int i = 0;
        while (i < length) {
            Account account = a2[i];
            if (!account.name.equals(str)) {
                i++;
            } else if (!z) {
                return gss.b(H, account.name, str2, null);
            } else {
                try {
                    return gss.a(H, account.name, str2, null);
                } catch (Throwable e) {
                    glk.d("Babel", "GooglePlayServicesAvailabilityException.", e);
                    throw new giu(e.a());
                } catch (Throwable e2) {
                    glk.d("Babel", "UserRecoverableAuthException.", e2);
                    throw new giu(e2.b());
                } catch (Throwable e22) {
                    if ("INVALID_SCOPE".equals(e22.getMessage()) && H.getPackageName().contains("babel") && str2 != null && str2.contains(" https://www.googleapis.com/auth/identity.plus.page.impersonation")) {
                        glk.e("Babel", "Attempting removal of blocked scope.", new Object[0]);
                        return a(str, str2.replace(" https://www.googleapis.com/auth/identity.plus.page.impersonation", ""), z);
                    }
                    glk.d("Babel", "Unexpected exception while authenticating.", e22);
                    throw new giu(null);
                } catch (Throwable e222) {
                    throw new dzo("Cannot get auth token", e222);
                }
            }
        }
        String str3 = "Babel";
        String str4 = "Account not found: ";
        String valueOf = String.valueOf(glk.b(str));
        glk.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
        throw new git();
    }

    public static void H(String str) {
        gss.a(H(), str);
    }

    public static String c(byte[] bArr) {
        char[] cArr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder stringBuilder = new StringBuilder(bArr.length << 1);
        for (int i = 0; i < bArr.length; i++) {
            stringBuilder.append(cArr[(bArr[i] & 240) >>> 4]);
            stringBuilder.append(cArr[bArr[i] & 15]);
        }
        return stringBuilder.toString();
    }

    public static String a(List<String> list, List<String> list2) {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (String str2 : list) {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("Expected non-empty and non-null avatar URLs.");
            }
            if (i < 5) {
                if (i > 0) {
                    stringBuilder.append("|");
                }
                stringBuilder.append(str2);
            }
            i++;
        }
        for (String str22 : list2) {
            if (str22 == null) {
                str22 = "";
            }
            if (i < 5) {
                if (i > 0) {
                    stringBuilder.append("|");
                }
                stringBuilder.append("defaultavatar://").append(str22);
                i++;
            }
        }
        return stringBuilder.toString();
    }

    public static void a(String str, List<String> list, List<String> list2) {
        ba.a((Object) str);
        StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.startsWith("defaultavatar://")) {
                list2.add(nextToken.substring(16));
            } else {
                list.add(nextToken);
            }
        }
    }

    public static boolean V(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager != null) {
            return keyguardManager.inKeyguardRestrictedInputMode() || keyguardManager.isKeyguardLocked();
        } else {
            glk.e("Babel", "The keyguard manager is null when checking whether to set active.", new Object[0]);
            return false;
        }
    }

    public static boolean U() {
        return I("armeabi-v7a");
    }

    public static boolean V() {
        return I("arm64-v8a");
    }

    public static boolean I(String str) {
        if (VERSION.SDK_INT >= 21) {
            return J(str);
        }
        return str.equals(Build.CPU_ABI) || str.equals(Build.CPU_ABI2);
    }

    public static boolean J(String str) {
        return Arrays.asList(Build.SUPPORTED_ABIS).contains(str);
    }

    public static Uri K(String str) {
        return h("https://www.google.com/support/hangouts/?hl=%locale%", str);
    }

    public static Uri h(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("getHelpUrl(): fromWhere must be non-empty");
        }
        Uri.Builder buildUpon = Uri.parse(L(str)).buildUpon();
        buildUpon.appendQueryParameter("p", str2);
        Context H = H();
        try {
            buildUpon.appendQueryParameter("version", String.valueOf(H.getPackageManager().getPackageInfo(H.getApplicationInfo().packageName, 0).versionCode));
        } catch (NameNotFoundException e) {
            String str3 = "Babel";
            String str4 = "Error finding package ";
            String valueOf = String.valueOf(H.getApplicationInfo().packageName);
            glk.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
        }
        return buildUpon.build();
    }

    public static String L(String str) {
        if (!str.contains("%locale%")) {
            return str;
        }
        Locale locale = Locale.getDefault();
        String valueOf = String.valueOf(locale.getLanguage());
        String valueOf2 = String.valueOf(locale.getCountry().toLowerCase(Locale.US));
        return str.replace("%locale%", new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("-").append(valueOf2).toString());
    }

    public static void a(TextView textView, Activity activity, Resources resources, String str, String str2, int i) {
        a(textView, (Context) activity, resources.getString(i, new Object[]{h(str, str2).toString()}));
    }

    public static void a(TextView textView, Context context, String str) {
        Spanned fromHtml = Html.fromHtml(str);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr.length > 0) {
            Object spannableStringBuilder = new SpannableStringBuilder(fromHtml);
            URLSpan uRLSpan = uRLSpanArr[0];
            int spanStart = fromHtml.getSpanStart(uRLSpan);
            int spanEnd = fromHtml.getSpanEnd(uRLSpan);
            spannableStringBuilder.setSpan(new gjz(context, uRLSpan), spanStart, spanEnd, 33);
            if (VERSION.SDK_INT >= 21) {
                spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), spanStart, spanEnd, 33);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), spanStart, spanEnd, 33);
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnClickListener(new gka(context, uRLSpan));
        }
    }

    public static Spanned a(Context context, Spanned spanned, int i) {
        if (TextUtils.isEmpty(spanned)) {
            return spanned;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length() - 1, URLSpan.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        if (uRLSpanArr.length == 0) {
            Linkify.addLinks(spannableStringBuilder, 7);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spanned);
            Linkify.addLinks(spannableStringBuilder2, 7);
            for (Object obj : (URLSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length() - 1, URLSpan.class)) {
                int spanStart = spannableStringBuilder2.getSpanStart(obj);
                int spanEnd = spannableStringBuilder2.getSpanEnd(obj);
                for (Object obj2 : uRLSpanArr) {
                    if (spanEnd >= spannableStringBuilder.getSpanStart(obj2) && spanStart <= spannableStringBuilder.getSpanEnd(obj2)) {
                        break;
                    }
                }
                spannableStringBuilder.setSpan(obj, spanStart, spanEnd, 33);
            }
        }
        gkf gkf = (gkf) jyn.b(context, gkf.class);
        if (gkf != null) {
            gkf.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static String W(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (!(telephonyManager == null || telephonyManager.getPhoneType() == 0)) {
            Object networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return networkCountryIso;
            }
        }
        return Locale.getDefault().getCountry();
    }

    public static <T> boolean a(SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static <T> boolean a(SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static dhz i(Intent intent) {
        try {
            return d(((NdefMessage) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0]).getRecords()[0].getPayload());
        } catch (IOException e) {
            t("IOException, cannot deserialize hangout request");
            return null;
        } catch (ClassNotFoundException e2) {
            t("ClassNotFoundException, cannot deserialize hangout request");
            return null;
        }
    }

    public static byte[] a(dhz dhz) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(dhz);
        return byteArrayOutputStream.toByteArray();
    }

    public static dhz d(byte[] bArr) {
        return (dhz) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
    }

    public static boolean j(Intent intent) {
        return "android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction()) && intent.getData() != null && intent.getData().toString().startsWith("vnd.android.nfc://ext/com.google.android.apps.hangouts:hangoutrequest");
    }

    public static void a(Activity activity, bko bko, View view, String str, String str2) {
        agk b = b((Context) activity, BabelPhotoViewActivity.class);
        b.b(EsProvider.b(bko, str2).toString());
        b.a(str);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        b.a(iArr[0], iArr[1], view.getMeasuredWidth(), view.getMeasuredHeight());
        b.a(ejx.a);
        b.a(true);
        b.b(false);
        b.a(8.0f);
        Intent a = b.a();
        a.putExtra("account_id", bko.g());
        activity.startActivity(a);
        activity.overridePendingTransition(0, 0);
    }

    public static Pattern W() {
        if (wl == null) {
            wl = Pattern.compile("[\\d\\p{Punct}\\p{Space}]+");
        }
        return wl;
    }

    public static Pattern X() {
        if (wm == null) {
            wm = Pattern.compile("[\\p{Punct}\\p{Space}]");
        }
        return wm;
    }

    public static void a(Spannable spannable) {
        if (W().matcher(spannable).matches() && VERSION.SDK_INT >= 21) {
            b(spannable);
        }
    }

    public static void b(Spannable spannable) {
        for (Object removeSpan : (TtsSpan[]) spannable.getSpans(0, spannable.length(), TtsSpan.class)) {
            spannable.removeSpan(removeSpan);
        }
        String obj = spannable.toString();
        String replaceAll = X().matcher(spannable).replaceAll(",");
        for (int i = 0; i < obj.length(); i++) {
            char charAt = replaceAll.charAt(i);
            if (charAt == ',') {
                spannable.setSpan(new TextBuilder(",").build(), i, i + 1, 33);
            } else {
                spannable.setSpan(new DigitsBuilder(charAt).build(), i, i + 1, 33);
            }
        }
    }

    public static CharSequence a(String[] strArr, int i) {
        if (strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        int i2;
        StringBuilder stringBuilder = new StringBuilder();
        int min = Math.min(strArr.length, i);
        if (min < strArr.length) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < min; i3++) {
            stringBuilder.append(strArr[i3]);
            if (i3 < min - 1) {
                stringBuilder.append(", ");
            } else if (i2 != 0) {
                stringBuilder.append(", ");
                stringBuilder.append(String.format(Locale.getDefault(), "+%d", new Object[]{Integer.valueOf(strArr.length - i)}));
            }
        }
        return stringBuilder;
    }

    public static Asset a(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        return Asset.a(byteArrayOutputStream.toByteArray());
    }

    public static String x(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case wi.w /*0*/:
                return "SUCCESS";
            case wi.j /*1*/:
                return "SERVICE_MISSING";
            case wi.l /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case wi.z /*3*/:
                return "SERVICE_DISABLED";
            case wi.h /*4*/:
                return "SIGN_IN_REQUIRED";
            case wi.p /*5*/:
                return "INVALID_ACCOUNT";
            case wi.s /*6*/:
                return "RESOLUTION_REQUIRED";
            case wi.q /*7*/:
                return "NETWORK_ERROR";
            case wi.m /*8*/:
                return "INTERNAL_ERROR";
            case wi.n /*9*/:
                return "SERVICE_INVALID";
            case wi.dr /*10*/:
                return "DEVELOPER_ERROR";
            case wi.dB /*11*/:
                return "LICENSE_CHECK_FAILED";
            case wi.dD /*13*/:
                return "ERROR";
            case wi.g /*14*/:
                return "INTERRUPTED";
            case wi.dJ /*15*/:
                return "TIMEOUT";
            case wi.dI /*16*/:
                return "CANCELED";
            case wi.dK /*17*/:
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

    public static int y(int i) {
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
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new dt(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Expected size ").append(i2).append(" got ").append(a).append(" (0x").append(valueOf).append(")").toString(), parcel);
        }
    }

    public static void b(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new dt(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Expected size ").append(i2).append(" got ").append(i).append(" (0x").append(valueOf).append(")").toString(), parcel);
        }
    }

    public static int b(Parcel parcel) {
        int a = a(parcel);
        int a2 = a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (y(a) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new dt(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        a = dataPosition + a2;
        if (a >= dataPosition && a <= parcel.dataSize()) {
            return a;
        }
        throw new dt("Size read is invalid start=" + dataPosition + " end=" + a, parcel);
    }

    public static boolean c(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte d(Parcel parcel, int i) {
        a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static short e(Parcel parcel, int i) {
        a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static int f(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer g(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        b(parcel, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long h(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long i(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        b(parcel, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static float j(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double k(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readDouble();
    }

    public static String l(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder m(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i, Creator<T> creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    public static Bundle n(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] o(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
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

    public static ArrayList<Integer> r(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    public static ArrayList<String> s(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static <T> T[] b(Parcel parcel, int i, Creator<T> creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i, Creator<T> creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static void a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(a + dataPosition);
        }
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

    public static void a(Parcel parcel, int i, byte b) {
        c(parcel, i, 4);
        parcel.writeInt(b);
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

    public static void a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int t = t(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            u(parcel, t);
        }
    }

    public static void b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int t = t(parcel, i);
            parcel.writeStringList(list);
            u(parcel, t);
        }
    }

    public static <T extends Parcelable> void a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int t = t(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : tArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, i2);
                }
            }
            u(parcel, t);
        }
    }

    public static <T extends Parcelable> void c(Parcel parcel, int i, List<T> list, boolean z) {
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

    public static <T extends Parcelable> void a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void d(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int t = t(parcel, 3);
            parcel.writeList(list);
            u(parcel, t);
        }
    }

    public static <T extends SafeParcelable> T a(byte[] bArr, Creator<T> creator) {
        L((Object) creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    public static <T extends SafeParcelable> T a(Intent intent, String str, Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        return byteArrayExtra == null ? null : a(byteArrayExtra, (Creator) creator);
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static gvi K(Object obj) {
        return new gvi(obj);
    }

    public static <T> T L(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    public static String M(String str) {
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

    public static <T> T f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
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

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void N(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void O(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static String r(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case wi.j /*1*/:
                return resources.getString(ba.mD);
            case wi.l /*2*/:
            case 42:
                return resources.getString(ba.mU);
            case wi.z /*3*/:
                return resources.getString(ba.mz);
            case wi.h /*4*/:
            case wi.s /*6*/:
                return null;
            case wi.p /*5*/:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return resources.getString(ba.mF);
            case wi.q /*7*/:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return resources.getString(ba.mH);
            case wi.m /*8*/:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case wi.n /*9*/:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(ba.mR);
            case wi.dr /*10*/:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case wi.dB /*11*/:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case wi.dI /*16*/:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case wi.dK /*17*/:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return resources.getString(ba.mO);
            case wi.dH /*18*/:
                return resources.getString(ba.mW);
            case wi.k /*20*/:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return resources.getString(ba.mM);
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
        }
    }

    public static String s(Context context, int i) {
        return i == 6 ? context.getResources().getString(ba.mK) : r(context, i);
    }

    public static String a(Context context, int i, String str) {
        Resources resources = context.getResources();
        switch (i) {
            case wi.j /*1*/:
                if (d(resources)) {
                    return resources.getString(ba.mC, new Object[]{str});
                }
                return resources.getString(ba.mB, new Object[]{str});
            case wi.l /*2*/:
                return resources.getString(ba.mT, new Object[]{str});
            case wi.z /*3*/:
                return resources.getString(ba.my, new Object[]{str});
            case wi.p /*5*/:
                return resources.getString(ba.mE);
            case wi.q /*7*/:
                return resources.getString(ba.mG);
            case wi.n /*9*/:
                return resources.getString(ba.mQ, new Object[]{str});
            case wi.dI /*16*/:
                return resources.getString(ba.mw, new Object[]{str});
            case wi.dK /*17*/:
                return resources.getString(ba.mN);
            case wi.dH /*18*/:
                return resources.getString(ba.mV, new Object[]{str});
            case wi.k /*20*/:
                return resources.getString(ba.mL);
            case 42:
                return resources.getString(ba.mX);
            default:
                return resources.getString(ba.mP, new Object[]{str});
        }
    }

    public static String b(Context context, int i, String str) {
        return i == 6 ? context.getResources().getString(ba.mJ) : a(context, i, str);
    }

    public static String t(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case wi.j /*1*/:
                return resources.getString(ba.mA);
            case wi.l /*2*/:
                return resources.getString(ba.mS);
            case wi.z /*3*/:
                return resources.getString(ba.mx);
            default:
                return resources.getString(17039370);
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    public static void a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
            }
        }
    }

    public static <T> ArrayList<T> Y() {
        return new ArrayList();
    }

    public static <T> ArrayList<T> c(Collection<T> collection) {
        return collection == null ? null : new ArrayList(collection);
    }

    public static boolean j(Context context, String str) {
        try {
            return (context.getPackageManager().getApplicationInfo(str, 0).flags & 2097152) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean d(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (wV == null) {
            boolean z2 = (resources.getConfiguration().screenLayout & 15) > 3;
            if ((Z() && z2) || e(resources)) {
                z = true;
            }
            wV = Boolean.valueOf(z);
        }
        return wV.booleanValue();
    }

    public static boolean e(Resources resources) {
        if (wW == null) {
            Configuration configuration = resources.getConfiguration();
            boolean z = aa() && (configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600;
            wW = Boolean.valueOf(z);
        }
        return wW.booleanValue();
    }

    public static boolean X(Context context) {
        if (wX == null) {
            boolean z = af() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            wX = Boolean.valueOf(z);
        }
        return wX.booleanValue();
    }

    public static boolean Z() {
        return z(11);
    }

    public static boolean aa() {
        return z(13);
    }

    public static boolean ab() {
        return z(14);
    }

    public static boolean ac() {
        return z(16);
    }

    public static boolean ad() {
        return z(18);
    }

    public static boolean ae() {
        return z(19);
    }

    public static boolean af() {
        return z(20);
    }

    public static boolean ag() {
        return z(21);
    }

    public static boolean ah() {
        return z(23);
    }

    public static boolean z(int i) {
        return VERSION.SDK_INT >= i;
    }

    public static File Y(Context context) {
        return ag() ? context.getNoBackupFilesDir() : b(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static synchronized File b(File file) {
        synchronized (gwb.class) {
            if (!(file.exists() || file.mkdirs() || file.exists())) {
                String str = "Unable to create no-backup dir ";
                String valueOf = String.valueOf(file.getPath());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                file = null;
            }
        }
        return file;
    }

    public static boolean u(Context context, int i) {
        boolean z = false;
        if (!c(context, i, "com.google.android.gms")) {
            return z;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            gtw a = gtw.a(context);
            context.getPackageManager();
            return a.b(packageInfo);
        } catch (NameNotFoundException e) {
            return z;
        }
    }

    public static boolean c(Context context, int i, String str) {
        return hhg.a.a(context).a(i, str);
    }

    public static synchronized void Z(Context context) {
        synchronized (gwb.class) {
            if (wZ == null && context != null) {
                wZ = context.getApplicationContext();
            }
        }
    }

    public static boolean ai() {
        L(wZ);
        if (wY == null) {
            try {
                gxe gxe;
                IBinder a = hhh.a(wZ, hhh.e, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl");
                if (a == null) {
                    gxe = null;
                } else {
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    gxe = (queryLocalInterface == null || !(queryLocalInterface instanceof gxe)) ? new gxg(a) : (gxe) queryLocalInterface;
                }
                wY = gxe;
            } catch (hhp e) {
                String str = "GoogleCertificates";
                String valueOf = String.valueOf("Failed to load com.google.android.gms.googlecertificates: ");
                String valueOf2 = String.valueOf(e.getMessage());
                Log.e(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                return false;
            }
        }
        return true;
    }

    public static Set<gwv> a(IBinder[] iBinderArr) {
        Set<gwv> hashSet = new HashSet(r2);
        for (IBinder iBinder : iBinderArr) {
            Object obj;
            if (iBinder == null) {
                obj = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof gwv)) {
                    obj = new gwx(iBinder);
                } else {
                    gwv gwv = (gwv) queryLocalInterface;
                }
            }
            if (obj == null) {
                Log.e("GoogleCertificates", "iCertData is null, skipping");
            } else {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public static synchronized Set<gwv> aj() {
        Set<gwv> set;
        synchronized (gwb.class) {
            if (xa != null) {
                set = xa;
            } else if (wY != null || ai()) {
                try {
                    gyj a = wY.a();
                    if (a == null) {
                        Log.e("GoogleCertificates", "Failed to get google certificates from remote");
                        set = Collections.EMPTY_SET;
                    } else {
                        xa = a((IBinder[]) gym.a(a));
                        for (Object add : gya.a) {
                            xa.add(add);
                        }
                        xa = Collections.unmodifiableSet(xa);
                        set = xa;
                    }
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to retrieve google certificates");
                }
            } else {
                set = Collections.EMPTY_SET;
            }
        }
        return set;
    }

    public static synchronized Set<gwv> ak() {
        Set<gwv> set;
        synchronized (gwb.class) {
            if (xb != null) {
                set = xb;
            } else if (wY != null || ai()) {
                try {
                    gyj b = wY.b();
                    if (b == null) {
                        set = Collections.EMPTY_SET;
                    } else {
                        xb = a((IBinder[]) gym.a(b));
                        xb.add(gya.a[0]);
                        xb = Collections.unmodifiableSet(xb);
                        set = xb;
                    }
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to retrieve google release certificates");
                }
            } else {
                set = Collections.EMPTY_SET;
            }
        }
        return set;
    }

    public static boolean al() {
        return xc;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap e(android.app.Activity r2) {
        /*
        r0 = new java.util.concurrent.FutureTask;
        r1 = new haf;
        r1.<init>(r2);
        r0.<init>(r1);
        r2.runOnUiThread(r0);
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x0014, ExecutionException -> 0x0017 }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ InterruptedException -> 0x0014, ExecutionException -> 0x0017 }
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
    L_0x0015:
        r0 = 0;
        goto L_0x0013;
    L_0x0017:
        r0 = move-exception;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: gwb.e(android.app.Activity):android.graphics.Bitmap");
    }

    public static Bitmap f(Activity activity) {
        Bitmap bitmap = null;
        try {
            View rootView = activity.getWindow().getDecorView().getRootView();
            View findViewById = rootView.findViewById(16908290);
            if (findViewById != null) {
                int aa = aa((Context) activity) + findViewById.getTop();
                if (aa < rootView.getHeight()) {
                    Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Config.RGB_565);
                    rootView.draw(new Canvas(createBitmap));
                    bitmap = Bitmap.createBitmap(createBitmap, 0, aa, createBitmap.getWidth(), Math.min(createBitmap.getHeight() - aa, findViewById.getHeight()));
                }
            }
        } catch (Exception e) {
        }
        return bitmap;
    }

    public static int aa(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier != 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    public static String g(Activity activity) {
        String charSequence = activity.getTitle().toString();
        int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
        if (identifier == 0) {
            return charSequence;
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(identifier);
        if (viewGroup == null) {
            return charSequence;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                return ((TextView) childAt).getText().toString();
            }
        }
        return charSequence;
    }

    public static KeyPair am() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static hcd a(hxz hxz) {
        hce hce = new hce();
        List arrayList = new ArrayList();
        hce.a = a(hxz, arrayList);
        return new hcd(hce, arrayList);
    }

    public static hxz a(hcd hcd) {
        hxz hxz = new hxz();
        for (hcf hcf : hcd.a.a) {
            a(hcd.b, hxz, hcf.a, hcf.b);
        }
        return hxz;
    }

    public static hcf[] a(hxz hxz, List<Asset> list) {
        TreeSet treeSet = new TreeSet(hxz.b());
        hcf[] hcfArr = new hcf[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            Object a = hxz.a(str);
            hcfArr[i] = new hcf();
            hcfArr[i].a = str;
            hcfArr[i].b = a((List) list, a);
            i++;
        }
        return hcfArr;
    }

    public static hcg a(List<Asset> list, Object obj) {
        hcg hcg = new hcg();
        if (obj == null) {
            hcg.a = 14;
            return hcg;
        }
        hcg.b = new hch();
        if (obj instanceof String) {
            hcg.a = 2;
            hcg.b.b = (String) obj;
        } else if (obj instanceof Integer) {
            hcg.a = 6;
            hcg.b.f = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            hcg.a = 5;
            hcg.b.e = ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            hcg.a = 3;
            hcg.b.c = ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            hcg.a = 4;
            hcg.b.d = ((Float) obj).floatValue();
        } else if (obj instanceof Boolean) {
            hcg.a = 8;
            hcg.b.h = ((Boolean) obj).booleanValue();
        } else if (obj instanceof Byte) {
            hcg.a = 7;
            hcg.b.g = ((Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            hcg.a = 1;
            hcg.b.a = (byte[]) obj;
        } else if (obj instanceof String[]) {
            hcg.a = 11;
            hcg.b.k = (String[]) obj;
        } else if (obj instanceof long[]) {
            hcg.a = 12;
            hcg.b.l = (long[]) obj;
        } else if (obj instanceof float[]) {
            hcg.a = 15;
            hcg.b.m = (float[]) obj;
        } else if (obj instanceof Asset) {
            hcg.a = 13;
            hcg.b.n = (long) a((List) list, (Asset) obj);
        } else if (obj instanceof hxz) {
            hcg.a = 9;
            hxz hxz = (hxz) obj;
            TreeSet treeSet = new TreeSet(hxz.b());
            hcf[] hcfArr = new hcf[treeSet.size()];
            Iterator it = treeSet.iterator();
            r1 = 0;
            while (it.hasNext()) {
                r0 = (String) it.next();
                hcfArr[r1] = new hcf();
                hcfArr[r1].a = r0;
                hcfArr[r1].b = a((List) list, hxz.a(r0));
                r1++;
            }
            hcg.b.i = hcfArr;
        } else if (obj instanceof ArrayList) {
            hcg.a = 10;
            ArrayList arrayList = (ArrayList) obj;
            hcg[] hcgArr = new hcg[arrayList.size()];
            Object obj2 = null;
            int size = arrayList.size();
            int i = 0;
            int i2 = 14;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                hcg a = a((List) list, obj3);
                if (a.a == 14 || a.a == 2 || a.a == 6 || a.a == 9) {
                    if (i2 == 14 && a.a != 14) {
                        r1 = a.a;
                    } else if (a.a != i2) {
                        String valueOf = String.valueOf(obj2.getClass());
                        r0 = String.valueOf(obj3.getClass());
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 80) + String.valueOf(r0).length()).append("ArrayList elements must all be of the sameclass, but this one contains a ").append(valueOf).append(" and a ").append(r0).toString());
                    } else {
                        obj3 = obj2;
                        r1 = i2;
                    }
                    hcgArr[i] = a;
                    i++;
                    i2 = r1;
                    obj2 = obj3;
                } else {
                    r0 = String.valueOf(obj3.getClass());
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(r0).length() + 130).append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ").append(r0).toString());
                }
            }
            hcg.b.j = hcgArr;
        } else {
            String str = "newFieldValueFromValue: unexpected value ";
            r0 = String.valueOf(obj.getClass().getSimpleName());
            throw new RuntimeException(r0.length() != 0 ? str.concat(r0) : new String(str));
        }
        return hcg;
    }

    public static void a(List<Asset> list, hxz hxz, String str, hcg hcg) {
        int i = hcg.a;
        if (i == 14) {
            hxz.a(str, null);
            return;
        }
        hch hch = hcg.b;
        if (i == 1) {
            hxz.a(str, hch.a);
        } else if (i == 11) {
            hxz.a(str, hch.k);
        } else if (i == 12) {
            hxz.a(str, hch.l);
        } else if (i == 15) {
            hxz.a(str, hch.m);
        } else if (i == 2) {
            hxz.a(str, hch.b);
        } else if (i == 3) {
            hxz.a(str, hch.c);
        } else if (i == 4) {
            hxz.a(str, hch.d);
        } else if (i == 5) {
            hxz.a(str, hch.e);
        } else if (i == 6) {
            hxz.a(str, hch.f);
        } else if (i == 7) {
            hxz.a(str, (byte) hch.g);
        } else if (i == 8) {
            hxz.a(str, hch.h);
        } else if (i == 13) {
            if (list == null) {
                String str2 = "populateBundle: unexpected type for: ";
                String valueOf = String.valueOf(str);
                throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            hxz.a(str, (Asset) list.get((int) hch.n));
        } else if (i == 9) {
            hxz hxz2 = new hxz();
            for (hcf hcf : hch.i) {
                a((List) list, hxz2, hcf.a, hcf.b);
            }
            hxz.a(str, hxz2);
        } else if (i == 10) {
            i = a(str, hch.j);
            ArrayList a = a((List) list, hch, i);
            if (i == 14) {
                hxz.c(str, a);
            } else if (i == 9) {
                hxz.a(str, a);
            } else if (i == 2) {
                hxz.c(str, a);
            } else if (i == 6) {
                hxz.b(str, a);
            } else {
                throw new IllegalStateException("Unexpected typeOfArrayList: " + i);
            }
        } else {
            throw new RuntimeException("populateBundle: unexpected type " + i);
        }
    }

    public static int a(String str, hcg[] hcgArr) {
        int i = 14;
        for (hcg hcg : hcgArr) {
            if (i == 14) {
                if (hcg.a == 9 || hcg.a == 2 || hcg.a == 6) {
                    i = hcg.a;
                } else if (hcg.a != 14) {
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 48).append("Unexpected TypedValue type: ").append(hcg.a).append(" for key ").append(str).toString());
                }
            } else if (hcg.a != i) {
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 126).append("The ArrayList elements should all be the same type, but ArrayList with key ").append(str).append(" contains items of type ").append(i).append(" and ").append(hcg.a).toString());
            }
        }
        return i;
    }

    public static ArrayList a(List<Asset> list, hch hch, int i) {
        ArrayList arrayList = new ArrayList(hch.j.length);
        for (hcg hcg : hch.j) {
            if (hcg.a == 14) {
                arrayList.add(null);
            } else if (i == 9) {
                hxz hxz = new hxz();
                for (hcf hcf : hcg.b.i) {
                    a((List) list, hxz, hcf.a, hcf.b);
                }
                arrayList.add(hxz);
            } else if (i == 2) {
                arrayList.add(hcg.b.b);
            } else if (i == 6) {
                arrayList.add(Integer.valueOf(hcg.b.f));
            } else {
                throw new IllegalArgumentException("Unexpected typeOfArrayList: " + i);
            }
        }
        return arrayList;
    }

    public static int a(List<Asset> list, Asset asset) {
        list.add(asset);
        return list.size() - 1;
    }

    public static <T extends hcq> String a(T t) {
        String str;
        String valueOf;
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a(null, (Object) t, new StringBuffer(), stringBuffer);
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

    public static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof hcq) {
            int modifiers;
            String name;
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer).append(P(str)).append(" <\n");
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
                        name = "has";
                        name3 = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(name3.length() != 0 ? name.concat(name3) : new String(name), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            try {
                                name = "get";
                                name3 = String.valueOf(substring);
                                a(substring, cls.getMethod(name3.length() != 0 ? name.concat(name3) : new String(name), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
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
        stringBuffer2.append(stringBuffer).append(P(str)).append(": ");
        if (obj instanceof String) {
            stringBuffer2.append("\"").append(Q((String) obj)).append("\"");
        } else if (obj instanceof byte[]) {
            a((byte[]) obj, stringBuffer2);
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    public static String P(String str) {
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

    public static String Q(String str) {
        if (!str.startsWith("http") && str.length() > HttpStatusCodes.STATUS_CODE_OK) {
            str = String.valueOf(str.substring(0, HttpStatusCodes.STATUS_CODE_OK)).concat("[...]");
        }
        return R(str);
    }

    public static String R(String str) {
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

    public static hkh a(Context context, Intent intent) {
        f((Object) intent, (Object) "intent must not be null");
        f((Object) context, (Object) "context must not be null");
        return (hkh) a(intent, "selected_place", PlaceEntity.CREATOR);
    }

    public static hlk an() {
        return (hlk) f(xd, (Object) "CameraUpdateFactory is not initialized");
    }

    public static void a(hlk hlk) {
        xd = (hlk) L((Object) hlk);
    }

    public static hla a(LatLng latLng, float f) {
        try {
            return new hla(an().a(latLng, 16.0f));
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public static Boolean a(byte b) {
        switch (b) {
            case wi.w /*0*/:
                return Boolean.FALSE;
            case wi.j /*1*/:
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    public static byte a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : (byte) 0;
        } else {
            return (byte) -1;
        }
    }

    public static void a(hqa hqa) {
        if (xe == null) {
            xe = (hqa) L((Object) hqa);
        }
    }

    public static Bitmap b(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return null;
        }
        Closeable fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
            return decodeStream;
        } finally {
            a(fileInputStream);
        }
    }

    public static Bitmap b(Bitmap bitmap) {
        int i = 0;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= height) {
            i = (width / 2) - (height / 2);
            width = 0;
        } else {
            int i2 = width;
            width = (height / 2) - (width / 2);
            height = i2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(height, height, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        canvas.drawCircle((float) (height / 2), (float) (height / 2), (float) (height / 2), paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (float) i, (float) width, paint);
        return createBitmap;
    }

    public static boolean a(hwn hwn) {
        if (hwn == null) {
            return false;
        }
        if (hwn instanceof gvb) {
            return hwn.e();
        }
        return true;
    }

    public static boolean ao() {
        return Log.isLoggable("PeopleClientCall", 3);
    }

    public static void b(String str, Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("(");
        String str2 = "";
        for (Object obj : objArr) {
            stringBuilder.append(str2);
            if (obj instanceof Bundle) {
                stringBuilder.append(hvx.a((Bundle) obj));
            } else {
                stringBuilder.append(obj);
            }
            str2 = ", ";
        }
        stringBuilder.append(")");
        if (Log.isLoggable("PeopleClientCall", 2)) {
            Throwable th = new Throwable("STACK TRACE (It's not crash!)");
        }
    }

    public static String b(Object... objArr) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        b(objArr.length % 2 == 0);
        String str = "";
        while (i < objArr.length) {
            stringBuilder.append(str);
            stringBuilder.append(objArr[i]);
            stringBuilder.append("=");
            stringBuilder.append(objArr[i + 1]);
            str = ", ";
            i += 2;
        }
        return stringBuilder.toString();
    }

    public static boolean ap() {
        return A(3);
    }

    public static boolean A(int i) {
        return xI || Log.isLoggable("PeopleService", i);
    }

    public static void i(String str, String str2) {
        A(3);
    }

    public static void j(String str, String str2) {
        A(2);
    }

    public static void k(String str, String str2) {
        A(5);
    }

    public static void a(String str, String str2, Throwable th) {
        A(5);
    }

    public static void l(String str, String str2) {
        if (A(6)) {
            Log.e(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (A(6)) {
            Log.e(str, str2, th);
        }
    }

    public static Status B(int i) {
        String str;
        switch (i) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            default:
                str = x(i);
                break;
        }
        return new Status(i, str);
    }

    public static boolean aq() {
        return VERSION.SDK_INT >= 25;
    }

    public static ihg ar() {
        return new ihg();
    }

    public static boolean as() {
        return VERSION.SDK_INT >= 21;
    }

    public static void a(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view == null) {
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            b(view, onGlobalLayoutListener);
        } else {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static boolean at() {
        return Build.PRODUCT.contains("sdk_") || Build.PRODUCT.contains("_sdk");
    }

    public static String d(String str, int i) {
        ba.a((Object) str);
        if (i <= 1) {
            ba.a(i >= 0, "invalid count: %s", Integer.valueOf(i));
            return i == 0 ? "" : str;
        } else {
            int length = str.length();
            long j = ((long) length) * ((long) i);
            int i2 = (int) j;
            if (((long) i2) != j) {
                throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j);
            }
            Object obj = new char[i2];
            str.getChars(0, length, obj, 0);
            while (length < i2 - length) {
                System.arraycopy(obj, 0, obj, length, length);
                length <<= 1;
            }
            System.arraycopy(obj, 0, obj, length, i2 - length);
            return new String(obj);
        }
    }

    public static String S(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (!c(charAt)) {
                stringBuilder.append(charAt);
            } else if (charAt <= '\udbff' && i + 1 < length) {
                char charAt2 = str.charAt(i + 1);
                if (Character.isLowSurrogate(charAt2)) {
                    stringBuilder.append(charAt).append(charAt2);
                    i++;
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public static CharSequence c(CharSequence charSequence) {
        int i = 0;
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        int length = charSequence.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (!c(charAt)) {
                i2++;
                i++;
            } else if (charAt > '\udbff' || i2 + 1 >= length || !Character.isLowSurrogate(charSequence.charAt(i2 + 1))) {
                spannableStringBuilder.delete(i, i + 1);
                i2++;
            } else {
                i2 += 2;
                i += 2;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence d(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (length > i && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (length != charSequence.length()) {
            spannableStringBuilder.delete(length, spannableStringBuilder.length());
        }
        if (i != 0) {
            spannableStringBuilder.delete(0, i);
        }
        return spannableStringBuilder;
    }

    public static CharSequence a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        int i = 0;
        if (TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence2) || TextUtils.equals(charSequence2, charSequence3)) {
            return charSequence;
        }
        int length = charSequence2.length();
        int length2 = charSequence3.length() - length;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        List arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < charSequence.length()) {
            i2 = TextUtils.indexOf(charSequence, charSequence2, i2);
            if (i2 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
            i2 += length;
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i3 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Integer valueOf = Integer.valueOf(((Integer) obj).intValue() + (length2 * i3));
            spannableStringBuilder.replace(valueOf.intValue(), valueOf.intValue() + length, charSequence3);
            i3++;
        }
        return spannableStringBuilder;
    }

    public static boolean c(char c) {
        if (VERSION.SDK_INT >= 19) {
            return d(c);
        }
        return e(c);
    }

    public static boolean d(char c) {
        return Character.isSurrogate(c);
    }

    public static boolean e(char c) {
        return c >= '\ud800' && c < '\ue000';
    }

    public static boolean C(int i) {
        return i == 10021 || i == 10022 || i == 11003 || i == 11015 || i == 10023 || i == 11018;
    }

    public static boolean m(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (!str.equals(str2) && !str2.equals(T(str)) && !str.equals(T(str2)))) ? false : true;
    }

    public static String T(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        if (indexOf == 0) {
            return "";
        }
        return str.substring(0, indexOf);
    }

    public static String U(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        return indexOf >= 0 ? str.substring(indexOf + 1) : str;
    }

    public static String au() {
        return String.format("2-%010x@%s", new Object[]{Long.valueOf(Math.abs(new Random().nextLong()) % 1099511627775L), "pstn-conference.google.com"});
    }

    public static int c(int i, String str) {
        iil.c();
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            itx.a(6, "vclib", "Failed to create shader!");
            W("Failed to create shader of type " + i);
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        itx.a(6, "vclib", "Could not compile shader " + i + ":");
        itx.a(6, "vclib", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void V(String str) {
        iil.c();
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            itx.a(6, "vclib", new StringBuilder(String.valueOf(str).length() + 21).append(str).append(": glError ").append(glGetError).toString());
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 21).append(str).append(": glError ").append(glGetError).toString());
        }
    }

    public static void W(String str) {
        iil.c();
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                itx.a(6, "vclib", new StringBuilder(String.valueOf(str).length() + 21).append(str).append(": glError ").append(glGetError).toString());
            } else {
                return;
            }
        }
    }

    public static int n(String str, String str2) {
        iil.c();
        int c = c(35633, str);
        if (c == 0) {
            V("failed to load vertex shader");
            return 0;
        }
        int c2 = c(35632, str2);
        if (c2 == 0) {
            V("failed to load pixel shader");
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            V("failed to create program");
        } else {
            GLES20.glAttachShader(glCreateProgram, c);
            V("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, c2);
            V("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                itx.a(6, "vclib", "Could not link program: ");
                itx.a(6, "vclib", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                glCreateProgram = 0;
            }
        }
        GLES20.glDeleteShader(c);
        GLES20.glDeleteShader(c2);
        return glCreateProgram;
    }

    public static int D(int i) {
        iil.a(33984, 33984, 34015);
        return 0;
    }

    public static int av() {
        iil.c();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        V("generateTexture");
        return iArr[0];
    }

    public static void E(int i) {
        iil.c();
        iil.b(Integer.valueOf(i), Integer.valueOf(0));
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        W("deleteTexture");
    }

    public static iuy aw() {
        return iup.a;
    }

    public static iuy ax() {
        return iup.b;
    }

    public static iuy ay() {
        return iup.c;
    }

    public static ObjectAnimator b(Object obj, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, new float[]{1.0f});
        ofFloat.setInterpolator(ay());
        ofFloat.setDuration(500);
        return ofFloat;
    }

    public static ObjectAnimator c(Object obj, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, new float[]{0.0f});
        ofFloat.setInterpolator(ay());
        ofFloat.setDuration(500);
        return ofFloat;
    }

    public static File ab(Context context) {
        ba.a((Object) context);
        return new File(context.getCacheDir(), "primeshprof");
    }

    public static void ac(Context context) {
        File ab = ab(context);
        if (ab.exists()) {
            ab.delete();
        }
    }

    public static ong ad(Context context) {
        return a(null, context);
    }

    public static ong a(String str, Context context) {
        ong ong = new ong();
        ong.a = Long.valueOf(Process.getElapsedCpuTime());
        ong.b = Boolean.valueOf(izr.b(context));
        ong.c = Integer.valueOf(Thread.activeCount());
        if (str != null) {
            ong.d = str;
        }
        return ong;
    }

    public static long az() {
        return SystemClock.elapsedRealtime();
    }

    public static Long a(Application application) {
        try {
            try {
                return Long.valueOf(Long.parseLong(application.getResources().getString(xW)));
            } catch (NumberFormatException e) {
                String str = "Couldn't parse Primes version number from ";
                String valueOf = String.valueOf(r0);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                return null;
            }
        } catch (NotFoundException e2) {
        }
    }

    public static Set<Integer> aA() {
        Set<Integer> hashSet = new HashSet(57);
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

    public static Map<Integer, List<String>> aB() {
        Map<Integer, List<String>> hashMap = new HashMap(285);
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
        hashMap.put(Integer.valueOf(HttpStatusCodes.STATUS_CODE_SERVER_ERROR), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("BZ");
        hashMap.put(Integer.valueOf(501), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("GT");
        hashMap.put(Integer.valueOf(HttpStatusCodes.STATUS_CODE_BAD_GATEWAY), arrayList);
        arrayList = new ArrayList(1);
        arrayList.add("SV");
        hashMap.put(Integer.valueOf(HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE), arrayList);
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

    public static Set<String> aC() {
        Set<String> hashSet = new HashSet(317);
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

    public static StateListAnimator B(View view) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        int[] iArr = new int[]{16842910, 16842919};
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("translationZ", new float[]{view.getElevation()});
        stateListAnimator.addState(iArr, ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr));
        iArr = new int[0];
        propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("translationZ", new float[]{0.0f});
        stateListAnimator.addState(iArr, ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr));
        return stateListAnimator;
    }

    public static jfl a(kbu kbu) {
        return new jfl(kbu);
    }

    public static jer a(Activity activity, kbu kbu) {
        return new jer(activity, kbu);
    }

    public static int ae(Context context) {
        return jyn.a(context, "com.google.android.libraries.social.appid", (int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
    }

    public static int v(Context context, int i) {
        switch (i) {
            case wi.w /*0*/:
                return af(context);
            case wi.j /*1*/:
                return ah(context);
            case wi.l /*2*/:
                return aj(context);
            case wi.z /*3*/:
                return al(context);
            default:
                return 0;
        }
    }

    public static int af(Context context) {
        if (yp == 0) {
            yp = context.getApplicationContext().getResources().getDimensionPixelSize(ba.nt);
        }
        return yp;
    }

    public static Bitmap ag(Context context) {
        if (yt == null) {
            yt = kdh.a(ak(context), af(context), 0);
        }
        return yt;
    }

    public static Bitmap w(Context context, int i) {
        switch (i) {
            case wi.j /*1*/:
                if (yu == null) {
                    yu = jyd.a(ag(context));
                }
                return yu;
            case wi.l /*2*/:
                if (yv == null) {
                    yv = jyd.a(ag(context), an(context));
                }
                return yv;
            default:
                return ag(context);
        }
    }

    public static int ah(Context context) {
        if (yq == 0) {
            yq = context.getApplicationContext().getResources().getDimensionPixelSize(ba.np);
        }
        return yq;
    }

    public static Bitmap ai(Context context) {
        if (yw == null) {
            yw = kdh.a(ak(context), ah(context), 0);
        }
        return yw;
    }

    public static Bitmap x(Context context, int i) {
        switch (i) {
            case wi.j /*1*/:
                if (yx == null) {
                    yx = jyd.a(ai(context));
                }
                return yx;
            case wi.l /*2*/:
                if (yy == null) {
                    yy = jyd.a(ai(context), an(context));
                }
                return yy;
            default:
                return ai(context);
        }
    }

    public static int aj(Context context) {
        if (yr == 0) {
            yr = context.getApplicationContext().getResources().getDimensionPixelSize(ba.nr);
        }
        return yr;
    }

    public static Bitmap ak(Context context) {
        if (yz == null) {
            yz = kdh.a(am(context), aj(context), 0);
        }
        return yz;
    }

    public static Bitmap y(Context context, int i) {
        switch (i) {
            case wi.j /*1*/:
                if (yA == null) {
                    yA = jyd.a(ak(context));
                }
                return yA;
            case wi.l /*2*/:
                if (yB == null) {
                    yB = jyd.a(ak(context), an(context));
                }
                return yB;
            default:
                return ak(context);
        }
    }

    public static int al(Context context) {
        if (ys == 0) {
            ys = context.getApplicationContext().getResources().getDimensionPixelSize(ba.nq);
        }
        return ys;
    }

    public static Bitmap am(Context context) {
        if (yC == null) {
            yC = ((BitmapDrawable) context.getApplicationContext().getResources().getDrawable(yH)).getBitmap();
        }
        return yC;
    }

    public static Bitmap z(Context context, int i) {
        switch (i) {
            case wi.j /*1*/:
                if (yD == null) {
                    yD = jyd.a(am(context));
                }
                return yD;
            case wi.l /*2*/:
                if (yE == null) {
                    yE = jyd.a(am(context), an(context));
                }
                return yE;
            default:
                return am(context);
        }
    }

    public static int X(String str) {
        if ("tiny".equals(str)) {
            return 0;
        }
        if ("small".equals(str)) {
            return 1;
        }
        if ("medium".equals(str)) {
            return 2;
        }
        if ("large".equals(str)) {
            return 3;
        }
        String str2 = "Invalid avatar size: ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public static int Y(String str) {
        if ("normal".equals(str)) {
            return 0;
        }
        if ("round".equals(str)) {
            return 1;
        }
        if ("rounded_corners".equals(str)) {
            return 2;
        }
        String str2 = "Invalid avatar shape: ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public static float an(Context context) {
        if (yF == 0.0f) {
            yF = context.getResources().getDimension(ba.ns);
        }
        return yF;
    }

    public static ArrayList<jlx> ao(Context context) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        try {
            return a(applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "com.google.android.libraries.social.licenses.MetadataHolder"), 640), "");
        } catch (Throwable e) {
            throw new RuntimeException(String.format("Could not find application info for package: %s", new Object[]{packageName}), e);
        }
    }

    public static ArrayList<jlx> a(ServiceInfo serviceInfo, String str) {
        Bundle bundle;
        Bundle bundle2 = Bundle.EMPTY;
        if (serviceInfo != null) {
            bundle = serviceInfo.metaData != null ? serviceInfo.metaData : Bundle.EMPTY;
        } else {
            bundle = bundle2;
        }
        Object arrayList = new ArrayList();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("com.google.android.libraries.social.licenses.LICENSE.")) {
                boolean z;
                String[] split = bundle.getString(str2).split(":");
                if (split.length == 2) {
                    z = true;
                } else {
                    z = false;
                }
                String str3 = "Invalid license meta-data value for element: ";
                String valueOf = String.valueOf(str2);
                ba.b(z, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                arrayList.add(new jlx(str2.substring(53), Long.parseLong(split[0]), Integer.parseInt(split[1]), str));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String a(Context context, jlx jlx) {
        JarFile jarFile;
        Throwable e;
        String valueOf;
        if (jlx.d().isEmpty()) {
            Resources resources = context.getApplicationContext().getResources();
            return a(jlx, resources.openRawResource(resources.getIdentifier("third_party_licenses", "raw", resources.getResourcePackageName(ze))));
        }
        try {
            jarFile = new JarFile(jlx.d());
            try {
                String a = a(jlx, jarFile.getInputStream(jarFile.getJarEntry("res/raw/third_party_licenses")));
                try {
                    jarFile.close();
                    return a;
                } catch (IOException e2) {
                    return a;
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    valueOf = String.valueOf(jlx);
                    throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 32).append("Failed to read license text for ").append(valueOf).toString(), e);
                } catch (Throwable th) {
                    e = th;
                    if (jarFile != null) {
                        try {
                            jarFile.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw e;
                }
            }
        } catch (IOException e5) {
            e = e5;
            jarFile = null;
            valueOf = String.valueOf(jlx);
            throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 32).append("Failed to read license text for ").append(valueOf).toString(), e);
        } catch (Throwable th2) {
            e = th2;
            jarFile = null;
            if (jarFile != null) {
                jarFile.close();
            }
            throw e;
        }
    }

    public static String a(jlx jlx, InputStream inputStream) {
        byte[] bArr = new byte[jlx.c()];
        try {
            inputStream.skip(jlx.b());
            int i = 0;
            while (i < bArr.length) {
                int read = inputStream.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    break;
                }
                i += read;
            }
            inputStream.close();
            try {
                return new String(bArr, "UTF8");
            } catch (Throwable e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (Throwable e2) {
            String valueOf = String.valueOf(jlx);
            throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 32).append("Failed to read license text for ").append(valueOf).toString(), e2);
        }
    }

    public static joh ap(Context context) {
        return new joh(context);
    }

    public static jmq a(joh joh) {
        return joh;
    }

    public static jna aD() {
        return new jom();
    }

    public static jmg aE() {
        return new jnm();
    }

    public static jno aq(Context context) {
        return new jno(context);
    }

    public static jcd[] b(joh joh) {
        return new jcd[]{joh};
    }

    public static jmz aF() {
        return new joq();
    }

    public static String F(int i) {
        switch (i) {
            case wi.w /*0*/:
                return "VL";
            case wi.j /*1*/:
                return "L";
            case wi.l /*2*/:
                return "S";
            case wi.z /*3*/:
                return "H";
            default:
                return "";
        }
    }

    public static Bitmap a(InputStream inputStream, Rect rect, Options options) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Throwable e) {
            Log.e("MediaStoreUtil", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", e);
        }
        return bitmap;
    }

    public static Bitmap a(ContentResolver contentResolver, Uri uri, int i) {
        Options options;
        InputStream inputStream = null;
        if (i > 0) {
            try {
                Point a = a(contentResolver, uri);
                options = new Options();
                options.inSampleSize = 1;
                while (a.x * a.y > i) {
                    a.x /= 2;
                    a.y /= 2;
                    options.inSampleSize <<= 1;
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                    }
                }
            }
        } else {
            options = null;
        }
        inputStream = contentResolver.openInputStream(uri);
        Bitmap a2 = a(contentResolver, uri, a(inputStream, null, options));
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
            }
        }
        return a2;
    }

    public static Point a(ContentResolver contentResolver, Uri uri) {
        InputStream inputStream = null;
        Options options = new Options();
        try {
            options.inJustDecodeBounds = true;
            inputStream = contentResolver.openInputStream(uri);
            a(inputStream, null, options);
            Point point = new Point(options.outWidth, options.outHeight);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
            return point;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                }
            }
        }
    }

    public static int b(ContentResolver contentResolver, Uri uri) {
        int Z;
        if (kdj.b(uri) || kdj.a(uri)) {
            String path = kdj.a(uri) ? uri.getPath() : kdj.a(contentResolver, uri);
            if (!TextUtils.isEmpty(path)) {
                Z = Z(path);
            } else if (!Log.isLoggable("MediaStoreUtil", 6)) {
                return 0;
            } else {
                String valueOf = String.valueOf(uri);
                Log.e("MediaStoreUtil", new StringBuilder(String.valueOf(valueOf).length() + 25).append("Found null path for URI: ").append(valueOf).toString());
                return 0;
            }
        }
        InputStream inputStream = null;
        try {
            inputStream = contentResolver.openInputStream(uri);
            Z = a(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        } catch (Throwable e2) {
            Log.e("MediaStoreUtil", "File not found", e2);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Z = 0;
                }
            }
            Z = 0;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
        }
        return Z;
    }

    public static int Z(String str) {
        jjb jjb = new jjb();
        try {
            jjb.a(str);
            Integer b = jjb.b(jjb.j);
            if (b == null) {
                return 0;
            }
            return jjb.b(b.shortValue());
        } catch (IOException e) {
            return 0;
        }
    }

    public static int a(InputStream inputStream) {
        jjb jjb = new jjb();
        try {
            jjb.a(inputStream);
            Integer b = jjb.b(jjb.j);
            if (b == null) {
                return 0;
            }
            return jjb.b(b.shortValue());
        } catch (IOException e) {
            return 0;
        }
    }

    public static Bitmap a(ContentResolver contentResolver, Uri uri, Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        int b = b(contentResolver, uri);
        if (b != 0) {
            return a(bitmap, b);
        }
        return bitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        if (!(i == 0 || bitmap == null)) {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i);
            try {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (OutOfMemoryError e) {
            }
        }
        return bitmap;
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        float f = 0.0f;
        if (bitmap2 == null) {
            return null;
        }
        if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2) {
            return bitmap2;
        }
        float height;
        float width;
        Matrix matrix = new Matrix();
        if (bitmap2.getWidth() * i2 > bitmap2.getHeight() * i) {
            height = ((float) i2) / ((float) bitmap2.getHeight());
            width = (((float) i) - (((float) bitmap2.getWidth()) * height)) * 0.5f;
        } else {
            height = ((float) i) / ((float) bitmap2.getWidth());
            width = 0.0f;
            f = (((float) i2) - (((float) bitmap2.getHeight()) * height)) * 0.5f;
        }
        matrix.setScale(height, height);
        matrix.postTranslate(((float) ((int) width)) + 0.5f, ((float) ((int) f)) + 0.5f);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
        new Canvas(bitmap).drawBitmap(bitmap2, matrix, new Paint(3));
        return bitmap;
    }

    public static Bitmap a(Bitmap bitmap, float f, Bitmap bitmap2) {
        if (f >= 1.0f) {
            return bitmap;
        }
        if (bitmap2 == null) {
            bitmap2 = Bitmap.createBitmap(Math.round(((float) bitmap.getWidth()) * f), Math.round(((float) bitmap.getHeight()) * f), Config.ARGB_8888);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        new Canvas(bitmap2).drawBitmap(bitmap, matrix, new Paint(3));
        return bitmap2;
    }

    public static Bitmap a(ContentResolver contentResolver, Uri uri, int i, Bitmap bitmap) {
        InputStream inputStream = null;
        try {
            Options options = new Options();
            options.inSampleSize = i;
            if (i == 1 && VERSION.SDK_INT >= 11) {
                options.inBitmap = bitmap;
            }
            inputStream = contentResolver.openInputStream(uri);
            Bitmap a = a(inputStream, null, options);
            return a;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(android.content.Context r6, android.net.Uri r7, int r8, int r9) {
        /*
        r0 = 0;
        r2 = new android.media.MediaMetadataRetriever;
        r2.<init>();
        r2.setDataSource(r6, r7);	 Catch:{ IllegalArgumentException -> 0x0015, RuntimeException -> 0x001e, all -> 0x0027 }
        r4 = -1;
        r1 = r2.getFrameAtTime(r4);	 Catch:{ IllegalArgumentException -> 0x0015, RuntimeException -> 0x001e, all -> 0x0027 }
        r2.release();	 Catch:{ RuntimeException -> 0x0032 }
    L_0x0012:
        if (r1 != 0) goto L_0x002c;
    L_0x0014:
        return r0;
    L_0x0015:
        r1 = move-exception;
        r2.release();	 Catch:{ RuntimeException -> 0x001b }
        r1 = r0;
        goto L_0x0012;
    L_0x001b:
        r1 = move-exception;
        r1 = r0;
        goto L_0x0012;
    L_0x001e:
        r1 = move-exception;
        r2.release();	 Catch:{ RuntimeException -> 0x0024 }
        r1 = r0;
        goto L_0x0012;
    L_0x0024:
        r1 = move-exception;
        r1 = r0;
        goto L_0x0012;
    L_0x0027:
        r0 = move-exception;
        r2.release();	 Catch:{ RuntimeException -> 0x0034 }
    L_0x002b:
        throw r0;
    L_0x002c:
        r0 = 2;
        r0 = android.media.ThumbnailUtils.extractThumbnail(r1, r8, r9, r0);
        goto L_0x0014;
    L_0x0032:
        r2 = move-exception;
        goto L_0x0012;
    L_0x0034:
        r1 = move-exception;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: gwb.a(android.content.Context, android.net.Uri, int, int):android.graphics.Bitmap");
    }

    public static boolean f(Uri uri) {
        if (!kdj.b(uri)) {
            return false;
        }
        String path = uri.getPath();
        String path2 = Images.Media.EXTERNAL_CONTENT_URI.getPath();
        String path3 = Video.Media.EXTERNAL_CONTENT_URI.getPath();
        String path4 = Files.getContentUri("external").getPath();
        if (path.startsWith(path2) || path.startsWith(path3) || path.startsWith(path4)) {
            return true;
        }
        return false;
    }

    public static Bitmap a(Context context, Uri uri, Bitmap bitmap) {
        int i = -1;
        if (uri == null || !f(uri)) {
            return null;
        }
        Bitmap thumbnail;
        ContentResolver contentResolver = context.getContentResolver();
        long parseId = ContentUris.parseId(uri);
        Options options = new Options();
        if (VERSION.SDK_INT >= 19) {
            if (bitmap != null && bitmap.getWidth() == 512 && bitmap.getHeight() == 384) {
                options.inBitmap = bitmap;
            } else if (Log.isLoggable("MediaStoreUtil", 3)) {
                int width;
                boolean z = bitmap == null;
                if (bitmap != null) {
                    width = bitmap.getWidth();
                } else {
                    width = -1;
                }
                if (bitmap != null) {
                    i = bitmap.getHeight();
                }
                new StringBuilder(117).append("getMediaStoreThumbnail: got null or bitmap with invalid dimensions null? ").append(z).append(" width: ").append(width).append(" height: ").append(i);
            }
        }
        String b = kdj.b(contentResolver, uri);
        if (kdj.b(b)) {
            thumbnail = Thumbnails.getThumbnail(contentResolver, parseId, 1, options);
        } else if (kdj.c(b)) {
            thumbnail = Video.Thumbnails.getThumbnail(contentResolver, parseId, 1, options);
        } else {
            if (Log.isLoggable("MediaStoreUtil", 5)) {
                String valueOf = String.valueOf(uri);
                new StringBuilder((String.valueOf(b).length() + 42) + String.valueOf(valueOf).length()).append("getThumbnail: unrecognized mimeType=").append(b).append(", uri=").append(valueOf);
            }
            thumbnail = null;
        }
        return thumbnail;
    }

    public static String a(jrr jrr, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resumeUrl", str);
            jSONObject.put("resumeFingerprint", jrr.h().a());
            jSONObject.put("resumeForceResize", jrr.b());
            jSONObject.put("resumeContentType", jrr.e());
            return jSONObject.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    public static String a(Context context, Uri uri) {
        String str;
        String valueOf;
        ContentResolver contentResolver = context.getContentResolver();
        String type = contentResolver.getType(uri);
        if (Log.isLoggable("iu.UploadUtils", 2)) {
            str = "  contentType from resolver: ";
            valueOf = String.valueOf(type);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (type == null) {
            type = URLConnection.guessContentTypeFromName(uri.toString());
            if (Log.isLoggable("iu.UploadUtils", 2)) {
                str = "  guess contentType from url: ";
                valueOf = String.valueOf(type);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
        }
        if (type == null) {
            Closeable closeable = null;
            String str2;
            try {
                closeable = contentResolver.openInputStream(uri);
                type = URLConnection.guessContentTypeFromStream(closeable);
                if (Log.isLoggable("iu.UploadUtils", 2)) {
                    str2 = "  guess contentType from stream: ";
                    valueOf = String.valueOf(type);
                    if (valueOf.length() != 0) {
                        str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                }
                ba.a(closeable);
            } catch (Throwable th) {
                ba.a(closeable);
            }
        }
        return type;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r3, android.net.Uri r4, jpz r5) {
        /*
        r0 = 0;
        r1 = kdj.b(r4);
        if (r1 == 0) goto L_0x002b;
    L_0x0007:
        r1 = r3.getContentResolver();
        r1 = e(r1, r4);
        r2 = "image/jpeg";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x0020;
    L_0x0017:
        r2 = "image/jpg";
        r1 = r2.equals(r1);
        if (r1 != 0) goto L_0x0020;
    L_0x001f:
        return r0;
    L_0x0020:
        r1 = new jto;
        r1.<init>(r3, r4);
        r1 = r1.a();
        if (r1 != 0) goto L_0x001f;
    L_0x002b:
        r1 = r3.getContentResolver();	 Catch:{ IOException -> 0x003c }
        r1 = c(r1, r4);	 Catch:{ IOException -> 0x003c }
        r2 = r1.x;	 Catch:{ IOException -> 0x003c }
        r1 = r1.y;	 Catch:{ IOException -> 0x003c }
        r0 = r5.a(r2, r1);	 Catch:{ IOException -> 0x003c }
        goto L_0x001f;
    L_0x003c:
        r1 = move-exception;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: gwb.a(android.content.Context, android.net.Uri, jpz):boolean");
    }

    public static jru b(Context context, Uri uri, jpz jpz) {
        FileOutputStream openFileOutput;
        try {
            String format = String.format("%s_resize.jpg", new Object[]{ac(uri.toString())});
            String absolutePath = context.getFileStreamPath(format).getAbsolutePath();
            Point c = c(context.getContentResolver(), uri);
            jqa a = jpz.a(c.x, c.y, uri);
            if (a == null) {
                return null;
            }
            String valueOf;
            Point point = new Point(a.b(), a.c());
            byte[] a2 = a.a();
            openFileOutput = context.openFileOutput(format, 0);
            openFileOutput.write(a2);
            openFileOutput.flush();
            openFileOutput.close();
            if (!a.e()) {
                if (kdj.b(uri)) {
                    a(kdj.a(context.getContentResolver(), uri), absolutePath, point);
                } else {
                    valueOf = String.valueOf(uri);
                    Log.e("iu.UploadUtils", new StringBuilder(String.valueOf(valueOf).length() + 33).append("URI is not from the media store: ").append(valueOf).toString());
                }
            }
            valueOf = "file://";
            absolutePath = String.valueOf(absolutePath);
            return new jru(Uri.parse(absolutePath.length() != 0 ? valueOf.concat(absolutePath) : new String(valueOf)), a.d());
        } catch (Throwable th) {
            Log.e("iu.UploadUtils", "Exception while down sampling image; use full image", th);
            return null;
        }
    }

    public static boolean b(Context context, Uri uri) {
        Throwable th;
        if (!kdj.b(uri)) {
            return false;
        }
        Cursor query;
        try {
            query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        boolean z;
                        Object string = query.getString(query.getColumnIndex("_data"));
                        if (TextUtils.isEmpty(string) || !new File(string).getName().startsWith("AUTO_AWESOME_MOVIE_1_")) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (query != null) {
                            query.close();
                        }
                        return z;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            if (query == null) {
                return false;
            }
            query.close();
            return false;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public static Point c(ContentResolver contentResolver, Uri uri) {
        InputStream inputStream = null;
        Options options = new Options();
        try {
            options.inJustDecodeBounds = true;
            inputStream = contentResolver.openInputStream(uri);
            BitmapFactory.decodeStream(inputStream, null, options);
            Point point = new Point(options.outWidth, options.outHeight);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
            return point;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                }
            }
        }
    }

    public static String d(ContentResolver contentResolver, Uri uri) {
        String str = null;
        try {
            str = contentResolver.getType(uri);
        } catch (Exception e) {
            if (Log.isLoggable("iu.UploadUtils", 5)) {
                String valueOf = String.valueOf(uri);
                new StringBuilder(String.valueOf(valueOf).length() + 31).append("safeGetMimeType failed for uri=").append(valueOf);
            }
        }
        return str;
    }

    public static String e(ContentResolver contentResolver, Uri uri) {
        String str = null;
        try {
            str = d(contentResolver, uri);
            if (TextUtils.isEmpty(str)) {
                str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
            }
        } catch (Exception e) {
            if (Log.isLoggable("iu.UploadUtils", 5)) {
                String valueOf = String.valueOf(uri);
                new StringBuilder(String.valueOf(valueOf).length() + 27).append("getMimeType failed for uri=").append(valueOf);
            }
        }
        return str;
    }

    public static void a(String str, String str2, Point point) {
        jjb jjb = new jjb();
        jjb.a(str);
        jjb.a(jjb.a, Integer.valueOf(point.x));
        jjb.a(jjb.b, Integer.valueOf(point.y));
        jjb.b(str2);
    }

    public static CronetEngine a(Context context, Set<jsf> set, Set<jsd> set2) {
        CronetEngine.Builder builder = new CronetEngine.Builder(context);
        for (jsf jsf : set) {
            builder.a(jsf.a(), jsf.b(), jsf.c());
        }
        if (!set2.isEmpty()) {
            jsd jsd = (jsd) b((Iterable) set2);
            builder.b(jsd.b());
            if (jsd.c()) {
                File file = new File(context.getCacheDir(), jsd.a());
                file.mkdirs();
                builder.b(file.getAbsolutePath());
                builder.a(2, 1000);
            } else {
                builder.a(0, 0);
            }
        }
        return builder.y();
    }

    public static CronetEngine a(CronetEngine cronetEngine, Set<RequestFinishedInfo$Listener> set) {
        for (RequestFinishedInfo$Listener a : set) {
            cronetEngine.a(a);
        }
        return cronetEngine;
    }

    public static String a(Context context, String str, String str2, boolean z, Bundle bundle) {
        return a(context, str, str2, false, z, bundle);
    }

    public static String a(Context context, String str, String str2, boolean z, boolean z2, Bundle bundle) {
        Uri aa = aa(((jvb) jyn.a(context, jvb.class)).a(str));
        String path = aa.getPath();
        Uri.Builder buildUpon = aa.buildUpon();
        kad kad = juo.f;
        buildUpon.scheme("https");
        if (z2) {
            String str3 = "/upload";
            String valueOf = String.valueOf(path);
            buildUpon.path(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        if (bundle != null) {
            for (String valueOf2 : bundle.keySet()) {
                buildUpon.appendQueryParameter(valueOf2, bundle.getString(valueOf2));
            }
        }
        if (str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        buildUpon.appendEncodedPath(str2);
        a(context, buildUpon, str2);
        return buildUpon.build().toString();
    }

    public static Uri aa(String str) {
        if (!(str.startsWith("http") || str.startsWith("//"))) {
            String str2 = "//";
            String valueOf = String.valueOf(str);
            str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
        }
        return Uri.parse(str);
    }

    public static void a(Context context, Uri.Builder builder, String str) {
        jvb jvb = (jvb) jyn.b(context, jvb.class);
        if (jvb != null && jvb.b()) {
            String c = jvb.c();
            if (!TextUtils.isEmpty(c)) {
                try {
                    if (Pattern.compile(jvb.d(), 2).matcher(str).find()) {
                        if (!c.startsWith("email:")) {
                            String str2 = "token:";
                            c = String.valueOf(c);
                            c = c.length() != 0 ? str2.concat(c) : new String(str2);
                        }
                        builder.appendQueryParameter("trace", c);
                        if (!TextUtils.isEmpty(jvb.e())) {
                            builder.appendQueryParameter("trace.deb", jvb.e());
                        }
                    }
                } catch (Throwable e) {
                    Log.e("ApiaryUrls", "Invalid tracing path", e);
                }
            }
        }
    }

    public static boolean ar(Context context) {
        if (context != null) {
            return qi.a((AccessibilityManager) context.getSystemService("accessibility"));
        }
        return false;
    }

    public static boolean as(Context context) {
        return VERSION.SDK_INT >= 16 && ar(context);
    }

    public static void a(TextView textView, String str) {
        a(textView, (Spannable) Html.fromHtml(str));
    }

    public static void a(TextView textView, Spannable spannable) {
        for (Object obj : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            spannable.setSpan(new jyf(), spannable.getSpanStart(obj), spannable.getSpanEnd(obj), 0);
        }
        textView.setText(spannable);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static synchronized int at(Context context) {
        int intValue;
        synchronized (gwb.class) {
            if (zV == null) {
                ax(context);
            }
            intValue = zV.intValue();
        }
        return intValue;
    }

    public static synchronized int au(Context context) {
        int intValue;
        synchronized (gwb.class) {
            if (zW == null) {
                ax(context);
            }
            intValue = zW.intValue();
        }
        return intValue;
    }

    public static synchronized int av(Context context) {
        int intValue;
        synchronized (gwb.class) {
            if (zX == null) {
                ax(context);
            }
            intValue = zX.intValue();
        }
        return intValue;
    }

    public static synchronized int aw(Context context) {
        int intValue;
        synchronized (gwb.class) {
            if (zY == null) {
                ax(context);
            }
            intValue = zY.intValue();
        }
        return intValue;
    }

    public static synchronized void ax(Context context) {
        synchronized (gwb.class) {
            zV = Integer.valueOf(0);
            zW = Integer.valueOf(0);
            zX = Integer.valueOf(0);
            zY = Integer.valueOf(0);
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                zV = Integer.valueOf(packageInfo.versionCode);
                String str = packageInfo.versionName;
                if (str == null || "DEVELOPMENT".equals(str)) {
                    zW = Integer.valueOf(999999999);
                    zX = Integer.valueOf(999999999);
                    zY = Integer.valueOf(999999999);
                } else {
                    String[] split = str.split("\\.");
                    if (split.length > 0) {
                        zW = Integer.valueOf(Integer.parseInt(split[0]));
                    }
                    if (split.length > 1) {
                        zX = Integer.valueOf(Integer.parseInt(split[1]));
                    }
                    if (split.length > 2) {
                        zY = Integer.valueOf(Integer.parseInt(split[2]));
                    }
                }
            } catch (NameNotFoundException e) {
            } catch (NumberFormatException e2) {
            }
        }
    }

    public static void a(FragmentManager fragmentManager) {
        if (Ac == null) {
            try {
                Ac = fragmentManager.getClass().getMethod("noteStateNotSaved", new Class[0]);
            } catch (NoSuchMethodException e) {
                aG();
            }
        }
        try {
            ((Method) ba.a(Ac)).invoke(fragmentManager, new Object[0]);
        } catch (IllegalAccessException e2) {
            aG();
        } catch (InvocationTargetException e3) {
            aG();
        }
    }

    public static void aG() {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved");
    }

    public static ByteBuffer a(File file, boolean z) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file.getPath(), "rw");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
            if (z) {
                file.setLastModified(System.currentTimeMillis());
            }
            map = (ByteBuffer) map.position(0);
            return map;
        } finally {
            randomAccessFile.close();
        }
    }

    public static ByteBuffer e(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return new byte[0];
        }
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            if (arrayOffset == 0 && byteBuffer.array().length == byteBuffer.limit()) {
                return byteBuffer.array();
            }
            return Arrays.copyOfRange(byteBuffer.array(), arrayOffset, byteBuffer.limit() + arrayOffset);
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        int position = byteBuffer.position();
        byteBuffer.position(0);
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return bArr;
    }

    public static InputStream b(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        return new kdi(byteBuffer);
    }

    public static void a(ByteBuffer byteBuffer, String str) {
        FileChannel channel = new RandomAccessFile(str, "rw").getChannel();
        try {
            channel.write(byteBuffer);
            byteBuffer.position(0);
        } finally {
            channel.close();
        }
    }

    public static DisplayMetrics ay(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static float a(DisplayMetrics displayMetrics) {
        return Math.min(((float) displayMetrics.widthPixels) / displayMetrics.density, ((float) displayMetrics.heightPixels) / displayMetrics.density);
    }

    public static boolean az(Context context) {
        return b(ay(context));
    }

    public static boolean b(DisplayMetrics displayMetrics) {
        return a(displayMetrics) > 550.0f;
    }

    public static void a(int i, String str, String str2) {
        if (Log.isLoggable(str, i)) {
            b(i, str, str2);
        }
    }

    public static void b(int i, String str, String str2) {
        int i2 = 0;
        int indexOf = str2.indexOf(10, 0);
        while (indexOf != -1) {
            Log.println(i, str, str2.substring(i2, indexOf));
            i2 = indexOf + 1;
            indexOf = str2.indexOf(10, i2);
        }
        Log.println(i, str, str2.substring(i2));
    }

    public static String ab(String str) {
        return (str == null || str.length() <= 23) ? str : str.substring(0, 23);
    }

    public static String b(long j) {
        return d(System.currentTimeMillis() - j);
    }

    public static String c(long j) {
        return d(SystemClock.currentThreadTimeMillis() - j);
    }

    public static String d(long j) {
        return String.format("%.3f seconds", new Object[]{Double.valueOf(((double) j) / 1000.0d)});
    }

    public static String ac(String str) {
        long j = 1125899906842597L;
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                return Long.toHexString(1152921504606846975L & j);
            }
            j = (j * 31) + ((long) str.charAt(length));
        }
    }

    public static int aA(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (VERSION.SDK_INT >= 11) {
            try {
                if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1048576) != 0) {
                    return activityManager.getLargeMemoryClass();
                }
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return activityManager.getMemoryClass();
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return ((obj instanceof Object[]) && (obj2 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj, (Object[]) obj2) : obj.equals(obj2);
        } else {
            if (obj == obj2) {
                return true;
            }
            return false;
        }
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static int a(double d, int i) {
        return a(Double.doubleToLongBits(d), i);
    }

    public static int a(long j, int i) {
        return f((int) ((j >>> 32) ^ j), i);
    }

    public static int f(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int e(Object obj, int i) {
        return f(obj == null ? 0 : obj.hashCode(), i);
    }

    public static byte[] a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static <T extends Parcelable> T a(byte[] bArr, ClassLoader classLoader) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T readParcelable = obtain.readParcelable(classLoader);
        obtain.recycle();
        return readParcelable;
    }

    public static boolean aH() {
        return VERSION.SDK_INT >= 14;
    }

    public static boolean b(Boolean bool) {
        return a(bool, false);
    }

    public static boolean a(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }

    public static int a(Integer num) {
        return a(num, 0);
    }

    public static int a(Integer num, int i) {
        return num == null ? i : num.intValue();
    }

    public static long a(Long l) {
        return a(l, 0);
    }

    public static long a(Long l, long j) {
        return l == null ? j : l.longValue();
    }

    public static long ad(String str) {
        return a(str, 0);
    }

    public static long a(String str, long j) {
        return str == null ? 0 : a(Long.valueOf(str));
    }

    public static double a(Double d) {
        return a(d, 0.0d);
    }

    public static double a(Double d, double d2) {
        return d == null ? 0.0d : d.doubleValue();
    }

    public static float a(Float f) {
        return a(f, 0.0f);
    }

    public static float a(Float f, float f2) {
        return f == null ? 0.0f : f.floatValue();
    }

    public static boolean aI() {
        if (Ad == null) {
            Ad = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == Ad;
    }

    public static void aJ() {
        if (!aI()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    public static void aK() {
        if (aI()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static Handler aL() {
        if (Ae == null) {//grabs stored Handler  if one exists. Else creates a new Handler
            Ae = new Handler(Looper.getMainLooper());
        }
        return Ae;
    }

    public static void a(Runnable runnable) {
        aL().post(runnable);
    }

    public static void a(Runnable runnable, boolean z) {
        aL().removeCallbacks(runnable);
        a(runnable);
    }

    public static void a(Runnable runnable, long j) {
        aL().postDelayed(runnable, j);//Handler.postDelayed(runnable,j)
    }

    public static void b(Runnable runnable) {
        aL().removeCallbacks(runnable);
    }

    public static String ae(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("http:") || str.startsWith("https:")) {
            return str;
        }
        String str2 = "https:";
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    public static byte[] a(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] af(String str) {
        return a(str, ket.f);
    }

    public static String a(byte[] bArr, Charset charset) {
        return bArr == null ? null : new String(bArr, charset);
    }

    public static String f(byte[] bArr) {
        return a(bArr, ket.f);
    }

    public static boolean a(kgk kgk, kfd kfd) {
        long a = kfd.a();
        if (a == -1) {
            return false;
        }
        kgk.a(a);
        return true;
    }

    public static String g(byte[] bArr) {
        return keu.a(bArr);
    }

    public static String h(byte[] bArr) {
        return keu.b(bArr);
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        bc.a((Object) inputStream);
        bc.a((Object) outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) {
        a(inputStream, outputStream, true);
    }

    public static void a(InputStream inputStream, OutputStream outputStream, boolean z) {
        try {
            a(inputStream, outputStream);
            if (z) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (z) {
                inputStream.close();
            }
        }
    }

    public static long a(kgm kgm) {
        OutputStream kfg = new kfg();
        try {
            kgm.writeTo(kfg);
            return kfg.a;
        } finally {
            kfg.close();
        }
    }

    public static <E> ArrayList<E> aM() {
        return new ArrayList();
    }

    public static Signature aN() {
        return Signature.getInstance("SHA256withRSA");
    }

    public static byte[] a(Signature signature, PrivateKey privateKey, byte[] bArr) {
        signature.initSign(privateKey);
        signature.update(bArr);
        return signature.sign();
    }

    public static <E> HashSet<E> aO() {
        return new HashSet();
    }

    public static boolean ag(String str) {
        return ba.i(str);
    }

    public static RuntimeException a(Throwable th) {
        return mfw.c(th);
    }

    public static ParameterizedType a(Type type, Class<?> cls) {
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            Type type2 = type;
            while (type2 != null && type2 != Object.class) {
                Class cls2;
                if (type2 instanceof Class) {
                    cls2 = (Class) type2;
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Class<?> a = a(parameterizedType);
                    if (a == cls) {
                        return parameterizedType;
                    }
                    if (cls.isInterface()) {
                        for (Type type3 : a.getGenericInterfaces()) {
                            if (cls.isAssignableFrom(type3 instanceof Class ? (Class) type3 : a((ParameterizedType) type3))) {
                                type2 = type3;
                                break;
                            }
                        }
                    }
                    Class<?> cls3 = a;
                }
                type2 = cls2.getGenericSuperclass();
            }
        }
        return null;
    }

    public static boolean a(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            throw a(e, (Class) cls);
        } catch (Exception e2) {
            throw a(e2, (Class) cls);
        }
    }

    public static IllegalArgumentException a(Exception exception, Class<?> cls) {
        StringBuilder append = new StringBuilder("unable to create new instance of class ").append(cls.getName());
        ArrayList arrayList = new ArrayList();
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (!(cls.getEnclosingClass() == null || Modifier.isStatic(cls.getModifiers()))) {
                arrayList.add("because it is not static");
            }
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException e) {
                    arrayList.add("because it has no accessible default constructor");
                }
            } else {
                arrayList.add("possibly because it is not public");
            }
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        Object obj = null;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            String str = (String) obj2;
            if (obj != null) {
                append.append(" and");
            } else {
                obj = 1;
            }
            append.append(" ").append(str);
        }
        return new IllegalArgumentException(append.toString(), exception);
    }

    public static boolean a(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    public static Type b(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Class<?> a(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static Type a(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    public static Type a(List<Type> list, TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType parameterizedType = null;
            while (parameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                parameterizedType = a((Type) list.get(size), cls);
            }
            if (parameterizedType != null) {
                TypeVariable[] typeParameters = genericDeclaration.getTypeParameters();
                int i = 0;
                while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                    i++;
                }
                Type type = parameterizedType.getActualTypeArguments()[i];
                if (!(type instanceof TypeVariable)) {
                    return type;
                }
                Type a = a((List) list, (TypeVariable) type);
                if (a != null) {
                    return a;
                }
                return type;
            }
        }
        return null;
    }

    public static Class<?> a(List<Type> list, Type type) {
        Type a;
        if (type instanceof TypeVariable) {
            a = a((List) list, (TypeVariable) type);
        } else {
            a = type;
        }
        if (a instanceof GenericArrayType) {
            return Array.newInstance(a((List) list, b(a)), 0).getClass();
        }
        if (a instanceof Class) {
            return (Class) a;
        }
        if (a instanceof ParameterizedType) {
            return a((ParameterizedType) a);
        }
        boolean z;
        if (a == null) {
            z = true;
        } else {
            z = false;
        }
        bc.a(z, "wildcard type is not supported: %s", a);
        return Object.class;
    }

    public static Type c(Type type) {
        return a(type, Iterable.class, 0);
    }

    public static Type d(Type type) {
        return a(type, Map.class, 1);
    }

    public static Type a(Type type, Class<?> cls, int i) {
        ParameterizedType a = a(type, (Class) cls);
        if (a == null) {
            return null;
        }
        Type type2 = a.getActualTypeArguments()[i];
        if (!(type2 instanceof TypeVariable)) {
            return type2;
        }
        Type a2 = a(Arrays.asList(new Type[]{type}), (TypeVariable) type2);
        if (a2 != null) {
            return a2;
        }
        return type2;
    }

    public static <T> Iterable<T> M(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class cls = obj.getClass();
        bc.a(cls.isArray(), "not an array or Iterable: %s", cls);
        if (cls.getComponentType().isPrimitive()) {
            return new kgo(obj);
        }
        return Arrays.asList((Object[]) obj);
    }

    public static Object a(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            Array.set(newInstance, i, obj);
            i = i2;
        }
        return newInstance;
    }

    public static jca a(Activity activity, kbu kbu, lfp lfp, onc<jcf> onc_jcf, onc<jmq> onc_jmq, onc<lfl> onc_lfl) {
        lff lff = (lff) lfp.a(i(activity), lff.class);
        if (lff == null) {
            return (jca) onc_lfl.a();
        }
        Class a = lff.a();
        if (a == jmj.class) {
            return new jmj((dw) activity, kbu, (jcf) onc_jcf.a(), (jmq) onc_jmq.a(), jmy.ALLOWED);
        } else if (a == jcu.class) {
            return new jcu(activity, kbu, (jcf) onc_jcf.a(), jce.ALLOWED);
        } else {
            String valueOf = String.valueOf(a);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Unexpected account handler class: ").append(valueOf).toString());
        }
    }

    public static jcf aB(Context context) {
        return (jcf) jyn.a(context, jcf.class);
    }

    public static lff c(Class<? extends jca> cls) {
        return new lfg(cls);
    }

    public static lfd a(jca jca) {
        int a = jca.a();
        bm.a(lhc.I_AM_THE_FRAMEWORK);
        return new lfh(a);
    }

    public static Set<Annotation> aP() {
        return Collections.emptySet();
    }

    public static <T> T a(Object obj, Class<T> cls) {
        bm.b(obj instanceof lhj, (Object) "Given component holder does not implement ComponentHolder");
        return cls.cast(((lhj) obj).a());
    }

    public static Class<?> N(Object obj) {
        bm.b(obj instanceof lhk, (Object) "Given class does not have a peer");
        return ((lhk) obj).g();
    }

    public static Class<?> i(Activity activity) {
        return N((Object) activity);
    }

    public static kbu j(Activity activity) {
        bm.b(activity instanceof kbt, "Cannot inject lifecycle for an activity that doesn't have a lifecycle: %s", (Object) activity);
        return ((kbt) activity).getLifecycle();
    }

    public static kbu a(onc<kbu> onc_kbu, Set<kbu> set) {
        boolean z = true;
        if (set.isEmpty()) {
            return (kbu) onc_kbu.a();
        }
        if (set.size() != 1) {
            z = false;
        }
        bm.b(z, (Object) "More than one fragment lifecycle found");
        return (kbu) set.iterator().next();
    }

    public static lfd O(Object obj) {
        boolean z = true;
        Set b = ((lic) obj).b();
        if (b.isEmpty()) {
            return null;
        }
        if (b.size() != 1) {
            z = false;
        }
        bm.b(z);
        return (lfd) b.iterator().next();
    }

    public static ljp aC(Context context) {
        return ((lid) ((lhj) context.getApplicationContext()).a()).k();
    }

    public static lke aD(Context context) {
        return ((lid) ((lhj) context.getApplicationContext()).a()).l();
    }

    public static lhi aQ() {
        return new lij();
    }

    public static lhi a(Context context, ihg ihg, idv idv) {
        return new lil(ihg, idv, context);
    }

    public static Boolean aR() {
        return Boolean.valueOf(true);
    }

    public static lhi a(lio lio) {
        return lio;
    }

    public static ScheduledExecutorService aS() {
        return Executors.newScheduledThreadPool(1);
    }

    public static ljs a(ljs ljs) {
        return ljs;
    }

    public static <T> T i(T t, T t2) {
        return t != null ? t : bm.a((Object) t2);
    }

    public static mex P(Object obj) {
        return new mex(obj.getClass().getSimpleName());
    }

    public static <T> iyr Q(T t) {
        return new mfv(t);
    }

    public static void j(Object obj, Object obj2) {
        String valueOf;
        if (obj == null) {
            valueOf = String.valueOf(obj2);
            throw new NullPointerException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("null key in entry: null=").append(valueOf).toString());
        } else if (obj2 == null) {
            valueOf = String.valueOf(obj);
            throw new NullPointerException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("null value in entry: ").append(valueOf).append("=null").toString());
        }
    }

    public static int d(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 40).append(str).append(" cannot be negative but was: ").append(i).toString());
    }

    public static void c(boolean z) {
        bm.b(z, (Object) "no calls to next() since the last call to remove()");
    }

    public static int G(int i) {
        return 461845907 * Integer.rotateLeft(-862048943 * i, 15);
    }

    public static int R(Object obj) {
        return G(obj == null ? 0 : obj.hashCode());
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

    public static String a(Iterable<?> iterable) {
        return mlj.b(iterable.iterator());
    }

    public static <T> T b(Iterable<T> iterable) {
        return mlj.c(iterable.iterator());
    }

    public static <T> T[] a(Iterable<? extends T> iterable, T[] tArr) {
        return d((Iterable) iterable).toArray(tArr);
    }

    public static Object[] c(Iterable<?> iterable) {
        return d((Iterable) iterable).toArray();
    }

    public static <E> Collection<E> d(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return ba.a(iterable.iterator());
    }

    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll(miv.a((Iterable) iterable));
        }
        return mlj.a((Collection) collection, ((Iterable) bm.a((Object) iterable)).iterator());
    }

    public static <F, T> Iterable<T> a(Iterable<F> iterable, met<? super F, ? extends T> met__super_F___extends_T) {
        bm.a((Object) iterable);
        bm.a((Object) met__super_F___extends_T);
        return new mjc(iterable, met__super_F___extends_T);
    }

    public static <T> T a(Iterable<? extends T> iterable, T t) {
        return mlj.b(iterable.iterator(), null);
    }

    public static boolean e(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    public static <K, V> mlr<K, V> a(Map<K, Collection<V>> map, iyr iyr) {
        return new mmm(map, iyr);
    }

    public static boolean a(mmc<?, ?> mmc___, Object obj) {
        if (obj == mmc___) {
            return true;
        }
        if (!(obj instanceof mmc)) {
            return false;
        }
        return mmc___.b().equals(((mmc) obj).b());
    }

    public static <T> T[] a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    public static int a(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    public static <K, V> void a(mmc<K, V> mmc_K__V, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(mmc_K__V.b().size());
        for (Entry entry : mmc_K__V.b().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    public static <K, V> void a(mmc<K, V> mmc_K__V, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection b = mmc_K__V.b(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                b.add(objectInputStream.readObject());
            }
        }
    }

    public static <T> mng<T> a(Class<T> cls, String str) {
        try {
            return new mng(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static boolean a(Comparator<?> comparator, Iterable<?> iterable) {
        Object a;
        bm.a((Object) comparator);
        bm.a((Object) iterable);
        if (iterable instanceof SortedSet) {
            a = a((SortedSet) iterable);
        } else if (!(iterable instanceof mnl)) {
            return false;
        } else {
            a = ((mnl) iterable).comparator();
        }
        return comparator.equals(a);
    }

    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return mmo.a;
        }
        return comparator;
    }

    public static <E> int a(List<? extends E> list, E e, Comparator<? super E> comparator, mnq mnq, mnm mnm) {
        bm.a((Object) comparator);
        bm.a((Object) list);
        bm.a((Object) mnq);
        bm.a((Object) mnm);
        if (!(list instanceof RandomAccess)) {
            list = ba.a((Iterable) list);
        }
        int i = 0;
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(e, list.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare <= 0) {
                return mnq.a(comparator, e, list.subList(i, size + 1), i2 - i) + i;
            } else {
                i = i2 + 1;
            }
        }
        return mnm.a(i);
    }

    public static int e(String str, int i) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 26).append(str).append(" (").append(i).append(") must be > 0").toString());
    }

    public static void d(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static int a(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static int e(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return nzf.UNSET_ENUM_VALUE;
        }
        return (int) j;
    }

    public static Executor aT() {
        return mtp.INSTANCE;
    }

    public static mtl a(ExecutorService executorService) {
        if (executorService instanceof mtl) {
            return (mtl) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new mtq((ScheduledExecutorService) executorService);
        }
        return new msm(executorService);
    }

    public static mtm a(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof mtm) {
            return (mtm) scheduledExecutorService;
        }
        return new mtq(scheduledExecutorService);
    }

    public static ThreadFactory aU() {
        if (!aV()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (Throwable e2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (Throwable e22) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e22);
        } catch (InvocationTargetException e3) {
            throw mfw.c(e3.getCause());
        }
    }

    public static boolean aV() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (InvocationTargetException e2) {
            return false;
        } catch (IllegalAccessException e3) {
            return false;
        } catch (NoSuchMethodException e4) {
            return false;
        }
    }

    public static Executor a(Executor executor, mrz<?> mrz_) {
        bm.a((Object) executor);
        bm.a((Object) mrz_);
        return executor == aT() ? executor : new mtn(executor, mrz_);
    }

    public static boolean a(Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }

    public static <V> V a(Future<V> future) {
        V v;
        Object obj = null;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException e) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static String a(nxi nxi, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ").append(str);
        a(nxi, stringBuilder, 0);
        return stringBuilder.toString();
    }

    public static void a(nxi nxi, StringBuilder stringBuilder, int i) {
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Set<String> treeSet = new TreeSet();
        for (Method method : nxi.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String replaceFirst : treeSet) {
            String replaceFirst2;
            String valueOf;
            String str;
            Method method2;
            String replaceFirst3 = replaceFirst2.replaceFirst("get", "");
            if (replaceFirst3.endsWith("List") && !replaceFirst3.endsWith("OrBuilderList")) {
                Object concat;
                valueOf = String.valueOf(replaceFirst3.substring(0, 1).toLowerCase());
                replaceFirst2 = String.valueOf(replaceFirst3.substring(1, replaceFirst3.length() - 4));
                valueOf = replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf);
                str = "get";
                replaceFirst2 = String.valueOf(replaceFirst3);
                if (replaceFirst2.length() != 0) {
                    concat = str.concat(replaceFirst2);
                } else {
                    concat = new String(str);
                }
                method2 = (Method) hashMap.get(concat);
                if (method2 != null) {
                    a(stringBuilder, i, ah(valueOf), nwi.a(method2, (Object) nxi, new Object[0]));
                }
            }
            valueOf = "set";
            replaceFirst2 = String.valueOf(replaceFirst3);
            if (((Method) hashMap2.get(replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf))) != null) {
                if (replaceFirst3.endsWith("Bytes")) {
                    valueOf = "get";
                    replaceFirst2 = String.valueOf(replaceFirst3.substring(0, replaceFirst3.length() - 5));
                    if (hashMap.containsKey(replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf))) {
                    }
                }
                valueOf = String.valueOf(replaceFirst3.substring(0, 1).toLowerCase());
                replaceFirst2 = String.valueOf(replaceFirst3.substring(1));
                str = replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf);
                valueOf = "get";
                replaceFirst2 = String.valueOf(replaceFirst3);
                method2 = (Method) hashMap.get(replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf));
                String str2 = "has";
                valueOf = String.valueOf(replaceFirst3);
                Method method3 = (Method) hashMap.get(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                if (method2 != null) {
                    boolean booleanValue;
                    Object a = nwi.a(method2, (Object) nxi, new Object[0]);
                    if (method3 != null) {
                        booleanValue = ((Boolean) nwi.a(method3, (Object) nxi, new Object[0])).booleanValue();
                    } else if (S(a)) {
                        booleanValue = false;
                    } else {
                        booleanValue = true;
                    }
                    if (booleanValue) {
                        a(stringBuilder, i, ah(str), a);
                    }
                }
            }
        }
        if (nxi instanceof nwo) {
            Iterator d = ((nwo) nxi).d.d();
            while (d.hasNext()) {
                Entry entry = (Entry) d.next();
                a(stringBuilder, i, "[" + ((nwh) entry.getKey()).a() + "]", entry.getValue());
            }
        }
        if (((nwi) nxi).b != null) {
            ((nwi) nxi).b.a(stringBuilder, i);
        }
    }

    public static boolean S(Object obj) {
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return false;
            }
            return true;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        } else {
            if (obj instanceof Float) {
                return ((Float) obj).floatValue() == 0.0f;
            } else {
                if (obj instanceof Double) {
                    return ((Double) obj).doubleValue() == 0.0d;
                } else {
                    if (obj instanceof String) {
                        return obj.equals("");
                    }
                    if (obj instanceof nvn) {
                        return obj.equals(nvn.a);
                    }
                    if (obj instanceof nxi) {
                        return obj == ((nxi) obj).i_();
                    } else {
                        if (obj instanceof Enum) {
                            return ((Enum) obj).ordinal() == 0;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
    }

    public static void a(StringBuilder stringBuilder, int i, String str, Object obj) {
        int i2 = 0;
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                a(stringBuilder, i, str, a);
            }
            return;
        }
        stringBuilder.append('\n');
        for (int i3 = 0; i3 < i; i3++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(str);
        if (obj instanceof String) {
            stringBuilder.append(": \"").append(ai((String) obj)).append('\"');
        } else if (obj instanceof nvn) {
            stringBuilder.append(": \"").append(a((nvn) obj)).append('\"');
        } else if (obj instanceof nwi) {
            stringBuilder.append(" {");
            a((nwi) obj, stringBuilder, i + 2);
            stringBuilder.append("\n");
            while (i2 < i) {
                stringBuilder.append(' ');
                i2++;
            }
            stringBuilder.append("}");
        } else {
            stringBuilder.append(": ").append(obj.toString());
        }
    }

    public static String ah(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }

    public static String a(nxw nxw) {
        StringBuilder stringBuilder = new StringBuilder(nxw.a());
        for (int i = 0; i < nxw.a(); i++) {
            byte a = nxw.a(i);
            switch (a) {
                case wi.q /*7*/:
                    stringBuilder.append("\\a");
                    break;
                case wi.m /*8*/:
                    stringBuilder.append("\\b");
                    break;
                case wi.n /*9*/:
                    stringBuilder.append("\\t");
                    break;
                case wi.dr /*10*/:
                    stringBuilder.append("\\n");
                    break;
                case wi.dB /*11*/:
                    stringBuilder.append("\\v");
                    break;
                case wi.dM /*12*/:
                    stringBuilder.append("\\f");
                    break;
                case wi.dD /*13*/:
                    stringBuilder.append("\\r");
                    break;
                case (byte) 34:
                    stringBuilder.append("\\\"");
                    break;
                case (byte) 39:
                    stringBuilder.append("\\'");
                    break;
                case (byte) 92:
                    stringBuilder.append("\\\\");
                    break;
                default:
                    if (a >= 32 && a <= 126) {
                        stringBuilder.append((char) a);
                        break;
                    }
                    stringBuilder.append('\\');
                    stringBuilder.append((char) (((a >>> 6) & 3) + 48));
                    stringBuilder.append((char) (((a >>> 3) & 7) + 48));
                    stringBuilder.append((char) ((a & 7) + 48));
                    break;
            }
        }
        return stringBuilder.toString();
    }

    public static String a(nvn nvn) {
        return a(new nxw(nvn));
    }

    public static String ai(String str) {
        return a(nvn.a(str));
    }

    public static <T extends nzf> String a(T t) {
        String str;
        String valueOf;
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            b(null, (Object) t, new StringBuffer(), stringBuffer);
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
        if (obj instanceof nzf) {
            int modifiers;
            String name;
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer).append(aj(str)).append(" <\n");
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
        stringBuffer2.append(stringBuffer).append(aj(str)).append(": ");
        if (obj instanceof String) {
            stringBuffer2.append("\"").append(ak((String) obj)).append("\"");
        } else if (obj instanceof byte[]) {
            b((byte[]) obj, stringBuffer2);
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    public static String aj(String str) {
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

    public static String ak(String str) {
        if (!str.startsWith("http") && str.length() > HttpStatusCodes.STATUS_CODE_OK) {
            str = String.valueOf(str.substring(0, HttpStatusCodes.STATUS_CODE_OK)).concat("[...]");
        }
        return al(str);
    }

    public static String al(String str) {
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

    public static <T> List<T> H(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    public static <T> HashSet<T> I(int i) {
        return new HashSet(K(i));
    }

    public static <K, V> LinkedHashMap<K, V> J(int i) {
        return new LinkedHashMap(K(i));
    }

    public static int K(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static olv a(ojz ojz) {
        bm.a((Object) ojz, (Object) "context must not be null");
        if (!ojz.c()) {
            return null;
        }
        Throwable d = ojz.d();
        if (d == null) {
            return olv.c;
        }
        if (d instanceof TimeoutException) {
            return olv.f.a(d.getMessage()).b(d);
        }
        olv a = olv.a(d);
        if (olx.UNKNOWN.equals(a.a()) && a.c() == d) {
            return olv.c.b(d);
        }
        return a.b(d);
    }

    public static <T extends nzf> oli<T> a(omn<T> omn_T) {
        return new omp(omn_T);
    }

    public static ojq a(okw okw) {
        return new omv(okw);
    }

    public static ojq a(AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2) {
        return new omx(atomicReference, atomicReference2);
    }

    public static String aE(Context context) {
        if (Af != null) {
            return Af;
        }
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity != null) {
            obj = resolveActivity.activityInfo.packageName;
        } else {
            obj = null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        List arrayList = new ArrayList();
        for (ResolveInfo resolveActivity2 : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveActivity2.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveActivity2.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            Af = null;
        } else if (arrayList.size() == 1) {
            Af = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(obj) && !b(context, intent) && arrayList.contains(obj)) {
            Af = obj;
        } else if (arrayList.contains("com.android.chrome")) {
            Af = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            Af = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            Af = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            Af = "com.google.android.apps.chrome";
        }
        return Af;
    }

    public static boolean b(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
    }

    public static String aW() {
        return "54.0.2837.2@" + "789710f0a9f32a61c3a52b33e9852e98c58027e5-refs/branch-heads/2837@{#3}".substring(0, 8);
    }
}
