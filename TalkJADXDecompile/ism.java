import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class ism implements itc, itd {
    final Context a;
    final AudioManager b;
    final isw c;
    final Object d;
    boolean e;
    boolean f;
    isq g;
    isr h;
    final Set<isq> i;
    isv j;
    BluetoothAdapter k;
    BluetoothHeadset l;
    ist m;
    BluetoothDevice n;
    isr o;
    private final Runnable p;
    private ijn q;
    private boolean r;
    private boolean s;
    private final Runnable t;

    public ism(Context context, boolean z) {
        this.p = new iss(this);
        this.c = new isw(this);
        this.d = new Object();
        this.h = isr.SPEAKERPHONE_ON;
        this.i = new CopyOnWriteArraySet();
        this.t = new isn(this);
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        if (l()) {
            this.i.add(isq.EARPIECE);
        }
        this.i.add(isq.SPEAKERPHONE);
        isq isq = (z || !l()) ? isq.SPEAKERPHONE : isq.EARPIECE;
        this.g = isq;
    }

    public void a(ite ite) {
        if (this.q == null) {
            iil.a("Must use CallClient", ite instanceof ijn);
            this.q = (ijn) ite;
            synchronized (this.d) {
                if (!this.e) {
                    iiq.a(this.p);
                }
                a(this.r);
                c_(this.s);
            }
        }
    }

    public void a() {
        synchronized (this.d) {
            if (this.e) {
                itx.a(3, "vclib", "releaseBluetoothAudio");
                if (this.k != null) {
                    g();
                    i();
                    this.a.unregisterReceiver(this.m);
                    this.m = null;
                    this.k.closeProfileProxy(1, this.l);
                    this.l = null;
                    this.n = null;
                    this.k = null;
                }
                itx.a(3, "vclib", "releaseWiredHeadsetAudio");
                this.a.unregisterReceiver(this.c);
                this.b.setMode(0);
                this.b.abandonAudioFocus(null);
                itx.a(4, "vclib", "Restoring saved speakerphone state to" + this.f);
                b(this.f);
                this.e = false;
            }
        }
        this.q = null;
    }

    public void a(boolean z) {
        boolean z2 = true;
        this.r = z;
        synchronized (this.d) {
            if (this.q != null) {
                boolean z3;
                String str = "vclib";
                if (z) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                itx.a(3, str, "Setting audio mute state to " + z3);
                ijn ijn = this.q;
                if (z) {
                    z2 = false;
                }
                ijn.a(z2);
            }
        }
    }

    public boolean b() {
        return this.r;
    }

    public void c_(boolean z) {
        boolean z2 = true;
        this.s = z;
        if (this.q != null) {
            boolean z3;
            String str = "vclib";
            if (z) {
                z3 = false;
            } else {
                z3 = true;
            }
            itx.a(3, str, "Setting playout mute state to " + z3);
            ijn ijn = this.q;
            if (z) {
                z2 = false;
            }
            ijn.b(z2);
        }
    }

    public boolean Q_() {
        return this.s;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(isq r6) {
        /*
        r5 = this;
        r1 = r5.d;
        monitor-enter(r1);
        r0 = isp.a;	 Catch:{ all -> 0x005b }
        r2 = r6.ordinal();	 Catch:{ all -> 0x005b }
        r0 = r0[r2];	 Catch:{ all -> 0x005b }
        switch(r0) {
            case 1: goto L_0x0013;
            case 2: goto L_0x0062;
            case 3: goto L_0x007a;
            case 4: goto L_0x0092;
            default: goto L_0x000e;
        };	 Catch:{ all -> 0x005b }
    L_0x000e:
        monitor-exit(r1);	 Catch:{ all -> 0x005b }
        r5.e();
        return;
    L_0x0013:
        r0 = r5.h;	 Catch:{ all -> 0x005b }
        r5.o = r0;	 Catch:{ all -> 0x005b }
        r0 = "vclib";
        r2 = "turnOnBluetooth";
        r3 = 3;
        itx.a(r3, r0, r2);	 Catch:{ all -> 0x005b }
        r0 = r5.h;	 Catch:{ all -> 0x005b }
        r2 = isr.BLUETOOTH_ON;	 Catch:{ all -> 0x005b }
        if (r0 == r2) goto L_0x002b;
    L_0x0025:
        r0 = r5.h;	 Catch:{ all -> 0x005b }
        r2 = isr.BLUETOOTH_TURNING_ON;	 Catch:{ all -> 0x005b }
        if (r0 != r2) goto L_0x005e;
    L_0x002b:
        r0 = "vclib";
        r2 = r5.h;	 Catch:{ all -> 0x005b }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x005b }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005b }
        r4 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x005b }
        r4 = r4.length();	 Catch:{ all -> 0x005b }
        r4 = r4 + 50;
        r3.<init>(r4);	 Catch:{ all -> 0x005b }
        r4 = "turnOnBluetooth: state is already ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x005b }
        r2 = r3.append(r2);	 Catch:{ all -> 0x005b }
        r3 = ", cannot turn on";
        r2 = r2.append(r3);	 Catch:{ all -> 0x005b }
        r2 = r2.toString();	 Catch:{ all -> 0x005b }
        r3 = 3;
        itx.a(r3, r0, r2);	 Catch:{ all -> 0x005b }
        goto L_0x000e;
    L_0x005b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x005b }
        throw r0;
    L_0x005e:
        r5.f();	 Catch:{ all -> 0x005b }
        goto L_0x000e;
    L_0x0062:
        r0 = r5.e;	 Catch:{ all -> 0x005b }
        if (r0 == 0) goto L_0x006c;
    L_0x0066:
        r0 = r5.m();	 Catch:{ all -> 0x005b }
        if (r0 == 0) goto L_0x0075;
    L_0x006c:
        r0 = isr.SPEAKERPHONE_ON;	 Catch:{ all -> 0x005b }
        r5.o = r0;	 Catch:{ all -> 0x005b }
    L_0x0070:
        r0 = 1;
        r5.b(r0);	 Catch:{ all -> 0x005b }
        goto L_0x000e;
    L_0x0075:
        r0 = isr.SPEAKERPHONE_ON;	 Catch:{ all -> 0x005b }
        r5.h = r0;	 Catch:{ all -> 0x005b }
        goto L_0x0070;
    L_0x007a:
        r0 = r5.e;	 Catch:{ all -> 0x005b }
        if (r0 == 0) goto L_0x0084;
    L_0x007e:
        r0 = r5.m();	 Catch:{ all -> 0x005b }
        if (r0 == 0) goto L_0x008d;
    L_0x0084:
        r0 = isr.WIRED_HEADSET_ON;	 Catch:{ all -> 0x005b }
        r5.o = r0;	 Catch:{ all -> 0x005b }
    L_0x0088:
        r0 = 0;
        r5.b(r0);	 Catch:{ all -> 0x005b }
        goto L_0x000e;
    L_0x008d:
        r0 = isr.WIRED_HEADSET_ON;	 Catch:{ all -> 0x005b }
        r5.h = r0;	 Catch:{ all -> 0x005b }
        goto L_0x0088;
    L_0x0092:
        r0 = r5.e;	 Catch:{ all -> 0x005b }
        if (r0 == 0) goto L_0x009c;
    L_0x0096:
        r0 = r5.m();	 Catch:{ all -> 0x005b }
        if (r0 == 0) goto L_0x00a6;
    L_0x009c:
        r0 = isr.EARPIECE_ON;	 Catch:{ all -> 0x005b }
        r5.o = r0;	 Catch:{ all -> 0x005b }
    L_0x00a0:
        r0 = 0;
        r5.b(r0);	 Catch:{ all -> 0x005b }
        goto L_0x000e;
    L_0x00a6:
        r0 = isr.EARPIECE_ON;	 Catch:{ all -> 0x005b }
        r5.h = r0;	 Catch:{ all -> 0x005b }
        goto L_0x00a0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ism.a(isq):void");
    }

    public isr c() {
        return this.h;
    }

    public Set<isq> d() {
        return this.i;
    }

    public void a(isv isv) {
        this.j = isv;
    }

    private void b(boolean z) {
        itx.a(3, "vclib", "setSpeakerphoneOn(" + z + "), wasOn=" + this.b.isSpeakerphoneOn());
        this.b.setSpeakerphoneOn(z);
    }

    void e() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.i);
        itx.a(3, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(valueOf2).length()).append("reportUpdate: state=").append(valueOf).append(", devices=").append(valueOf2).toString());
        gwb.a(new iso(this));
    }

    void f() {
        itx.a(3, "vclib", "startBluetoothSco");
        i();
        if (this.l != null) {
            if (this.n == null) {
                List connectedDevices = this.l.getConnectedDevices();
                if (connectedDevices.size() > 0) {
                    this.n = (BluetoothDevice) connectedDevices.get(0);
                }
            }
            if (this.n != null) {
                if (VERSION.SDK_INT >= 18) {
                    itx.a(3, "vclib", "startBluetoothSco : JBMR2+ Workaround");
                    try {
                        Method declaredMethod = Class.forName(this.l.getClass().getName()).getDeclaredMethod("startScoUsingVirtualVoiceCall", new Class[]{BluetoothDevice.class});
                        declaredMethod.setAccessible(true);
                        Boolean bool = (Boolean) declaredMethod.invoke(this.l, new Object[]{this.n});
                        if (bool != null && bool.booleanValue()) {
                            this.h = isr.BLUETOOTH_TURNING_ON;
                        }
                    } catch (ClassNotFoundException e) {
                        iil.a(e.toString());
                    } catch (NoSuchMethodException e2) {
                        iil.a(e2.toString());
                    } catch (InvocationTargetException e3) {
                        iil.a(e3.toString());
                    } catch (IllegalAccessException e4) {
                        iil.a(e4.toString());
                    }
                    itx.a(3, "vclib", "done");
                } else {
                    itx.a(3, "vclib", "startBluetoothSco : pre-JBMR2");
                    this.b.startBluetoothSco();
                    this.h = isr.BLUETOOTH_TURNING_ON;
                }
                if (this.h == isr.BLUETOOTH_TURNING_ON) {
                    e();
                    h();
                }
            }
        }
    }

    private boolean m() {
        itx.a(3, "vclib", "turnOffBluetooth");
        if (this.h == isr.BLUETOOTH_ON || this.h == isr.BLUETOOTH_TURNING_ON) {
            g();
            return true;
        }
        String valueOf = String.valueOf(this.h);
        itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 52).append("turnOffBluetooth: state is already ").append(valueOf).append(", cannot turn off").toString());
        return false;
    }

    void g() {
        itx.a(3, "vclib", "stopBluetoothSco");
        i();
        if (this.l != null && this.n != null) {
            if (VERSION.SDK_INT >= 18) {
                try {
                    itx.a(3, "vclib", "stopBluetoothSco : JBMR2+ Workaround");
                    Method declaredMethod = Class.forName(this.l.getClass().getName()).getDeclaredMethod("stopScoUsingVirtualVoiceCall", new Class[]{BluetoothDevice.class});
                    declaredMethod.setAccessible(true);
                    Boolean bool = (Boolean) declaredMethod.invoke(this.l, new Object[]{this.n});
                    if (bool != null && bool.booleanValue()) {
                        this.h = isr.BLUETOOTH_TURNING_OFF;
                    }
                } catch (ClassNotFoundException e) {
                    iil.a(e.toString());
                } catch (NoSuchMethodException e2) {
                    iil.a(e2.toString());
                } catch (InvocationTargetException e3) {
                    iil.a(e3.toString());
                } catch (IllegalAccessException e4) {
                    iil.a(e4.toString());
                }
                itx.a(3, "vclib", "done");
            } else {
                itx.a(3, "vclib", "stopBluetoothSco : pre-JBMR2");
                this.b.stopBluetoothSco();
                this.h = isr.BLUETOOTH_TURNING_OFF;
            }
            if (this.h == isr.BLUETOOTH_TURNING_OFF) {
                e();
                h();
            }
        }
    }

    void h() {
        itx.a(3, "vclib", "Starting bluetooth timer");
        gwb.a(this.t, 5000);
    }

    void i() {
        itx.a(3, "vclib", "Canceling bluetooth timer");
        gwb.b(this.t);
    }

    void j() {
        itx.a(3, "vclib", "Starting or stopping Bluetooth timed out");
        i();
        switch (isp.b[this.h.ordinal()]) {
            case wi.j /*1*/:
                if (this.l == null || this.n == null || !this.l.isAudioConnected(this.n)) {
                    g();
                    k();
                } else {
                    itx.a(6, "vclib", "We thought BT had timed out, but it's actually on; updating state.");
                    this.h = isr.BLUETOOTH_ON;
                }
                e();
            case wi.l /*2*/:
                if (this.l == null || this.n == null || !this.l.isAudioConnected(this.n)) {
                    itx.a(6, "vclib", "We thought BT had timed out, but it's actually off; updating state.");
                    k();
                } else {
                    this.h = isr.BLUETOOTH_ON;
                }
                e();
            default:
        }
    }

    void k() {
        if (this.o == null || (this.o == isr.WIRED_HEADSET_ON && !this.i.contains(isq.WIRED_HEADSET))) {
            String valueOf = String.valueOf(this.o);
            itx.a(6, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 131).append("usePendingAudioDeviceState: there's no pending state or it was WH, but has been unplugged; using default device. Pending state was ").append(valueOf).toString());
            this.o = null;
            a(this.g);
            return;
        }
        valueOf = String.valueOf(this.o);
        itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 34).append("usePendingAudioDeviceState: using ").append(valueOf).toString());
        this.h = this.o;
        this.o = null;
        b(this.h == isr.SPEAKERPHONE_ON);
        e();
    }

    public boolean l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        if (VERSION.SDK_INT >= 22) {
            return telephonyManager.isVoiceCapable();
        }
        return telephonyManager.getPhoneType() != 0;
    }
}
