package defpackage;

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
    final isw c = new isw(this);
    final Object d = new Object();
    boolean e;
    boolean f;
    isq g;
    isr h = isr.SPEAKERPHONE_ON;
    final Set<isq> i = new CopyOnWriteArraySet();
    isv j;
    BluetoothAdapter k;
    BluetoothHeadset l;
    ist m;
    BluetoothDevice n;
    isr o;
    private final Runnable p = new iss(this);
    private ijn q;
    private boolean r;
    private boolean s;
    private final Runnable t = new isn(this);

    public ism(Context context, boolean z) {
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

    public void a(isq isq) {
        synchronized (this.d) {
            switch (isp.a[isq.ordinal()]) {
                case 1:
                    this.o = this.h;
                    itx.a(3, "vclib", "turnOnBluetooth");
                    if (this.h != isr.BLUETOOTH_ON && this.h != isr.BLUETOOTH_TURNING_ON) {
                        f();
                        break;
                    }
                    String valueOf = String.valueOf(this.h);
                    itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 50).append("turnOnBluetooth: state is already ").append(valueOf).append(", cannot turn on").toString());
                    break;
                    break;
                case 2:
                    if (!this.e || m()) {
                        this.o = isr.SPEAKERPHONE_ON;
                    } else {
                        this.h = isr.SPEAKERPHONE_ON;
                    }
                    b(true);
                    break;
                case 3:
                    if (!this.e || m()) {
                        this.o = isr.WIRED_HEADSET_ON;
                    } else {
                        this.h = isr.WIRED_HEADSET_ON;
                    }
                    b(false);
                    break;
                case 4:
                    if (!this.e || m()) {
                        this.o = isr.EARPIECE_ON;
                    } else {
                        this.h = isr.EARPIECE_ON;
                    }
                    b(false);
                    break;
            }
        }
        e();
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
            case 1:
                if (this.l == null || this.n == null || !this.l.isAudioConnected(this.n)) {
                    g();
                    k();
                } else {
                    itx.a(6, "vclib", "We thought BT had timed out, but it's actually on; updating state.");
                    this.h = isr.BLUETOOTH_ON;
                }
                e();
                return;
            case 2:
                if (this.l == null || this.n == null || !this.l.isAudioConnected(this.n)) {
                    itx.a(6, "vclib", "We thought BT had timed out, but it's actually off; updating state.");
                    k();
                } else {
                    this.h = isr.BLUETOOTH_ON;
                }
                e();
                return;
            default:
                return;
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
