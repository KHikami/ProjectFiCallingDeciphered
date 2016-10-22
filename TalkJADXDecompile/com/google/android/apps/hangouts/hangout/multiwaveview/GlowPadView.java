package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityManager;
import bbl;
import com.google.api.client.http.ExponentialBackOffPolicy;
import gld;
import gwb;
import java.util.ArrayList;
import nzf;
import wi;

public class GlowPadView extends View {
    private static final boolean DEBUG = false;
    private static final int HIDE_ANIMATION_DELAY = 200;
    private static final int HIDE_ANIMATION_DURATION = 200;
    private static final int INITIAL_SHOW_HANDLE_DURATION = 200;
    private static final int RETURN_TO_HOME_DELAY = 1200;
    private static final int RETURN_TO_HOME_DURATION = 200;
    private static final int REVEAL_GLOW_DELAY = 0;
    private static final int REVEAL_GLOW_DURATION = 0;
    private static final float RING_SCALE_COLLAPSED = 0.5f;
    private static final float RING_SCALE_EXPANDED = 1.0f;
    private static final int SHOW_ANIMATION_DELAY = 50;
    private static final int SHOW_ANIMATION_DURATION = 200;
    private static final float SNAP_MARGIN_DEFAULT = 20.0f;
    private static final int STATE_FINISH = 5;
    private static final int STATE_FIRST_TOUCH = 2;
    private static final int STATE_IDLE = 0;
    private static final int STATE_SNAP = 4;
    private static final int STATE_START = 1;
    private static final int STATE_TRACKING = 3;
    private static final String TAG = "Babel_GlowPadView";
    private static final float TAP_RADIUS_SCALE_ACCESSIBILITY_ENABLED = 1.3f;
    private static final float TARGET_SCALE_COLLAPSED = 0.8f;
    private static final float TARGET_SCALE_EXPANDED = 1.0f;
    private static final int WAVE_ANIMATION_DURATION = 1350;
    private int mActiveTarget;
    private boolean mAlwaysTrackFinger;
    private boolean mAnimatingTargets;
    private Tweener mBackgroundAnimator;
    private ArrayList<String> mDirectionDescriptions;
    private int mDirectionDescriptionsResourceId;
    private boolean mDragging;
    private int mFeedbackCount;
    private AnimationBundle mGlowAnimations;
    private float mGlowRadius;
    private int mGrabbedState;
    private int mGravity;
    private TargetDrawable mHandleDrawable;
    private int mHorizontalInset;
    private boolean mInitialLayout;
    private float mInnerRadius;
    private int mMaxTargetHeight;
    private int mMaxTargetWidth;
    private int mNewTargetResources;
    private OnTriggerListener mOnTriggerListener;
    private float mOuterRadius;
    private TargetDrawable mOuterRing;
    private PointCloud mPointCloud;
    private int mPointerId;
    private AnimatorListener mResetListener;
    private AnimatorListener mResetListenerWithPing;
    private float mSnapMargin;
    private AnimationBundle mTargetAnimations;
    private ArrayList<String> mTargetDescriptions;
    private int mTargetDescriptionsResourceId;
    private ArrayList<TargetDrawable> mTargetDrawables;
    private int mTargetResourceId;
    private AnimatorListener mTargetUpdateListener;
    private AnimatorUpdateListener mUpdateListener;
    private int mVerticalInset;
    private int mVibrationDuration;
    private Vibrator mVibrator;
    private AnimationBundle mWaveAnimations;
    private float mWaveCenterX;
    private float mWaveCenterY;

    class 1 extends AnimatorListenerAdapter {
        1() {
        }

        public void onAnimationEnd(Animator animator) {
            GlowPadView.this.switchToState(GlowPadView.STATE_IDLE, GlowPadView.this.mWaveCenterX, GlowPadView.this.mWaveCenterY);
            GlowPadView.this.dispatchOnFinishFinalAnimation();
        }
    }

    class 2 extends AnimatorListenerAdapter {
        2() {
        }

        public void onAnimationEnd(Animator animator) {
            GlowPadView.this.ping();
            GlowPadView.this.switchToState(GlowPadView.STATE_IDLE, GlowPadView.this.mWaveCenterX, GlowPadView.this.mWaveCenterY);
            GlowPadView.this.dispatchOnFinishFinalAnimation();
        }
    }

    class 3 implements AnimatorUpdateListener {
        3() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            GlowPadView.this.invalidate();
        }
    }

    class 4 extends AnimatorListenerAdapter {
        4() {
        }

        public void onAnimationEnd(Animator animator) {
            if (GlowPadView.this.mNewTargetResources != 0) {
                GlowPadView.this.internalSetTargetResources(GlowPadView.this.mNewTargetResources);
                GlowPadView.this.mNewTargetResources = GlowPadView.STATE_IDLE;
                GlowPadView.this.hideTargets(GlowPadView.DEBUG, GlowPadView.DEBUG);
            }
            GlowPadView.this.mAnimatingTargets = GlowPadView.DEBUG;
        }
    }

    class 5 extends AnimatorListenerAdapter {
        5() {
        }

        public void onAnimationEnd(Animator animator) {
            GlowPadView.this.mPointCloud.waveManager.setRadius(0.0f);
            GlowPadView.this.mPointCloud.waveManager.setAlpha(0.0f);
        }
    }

    class AnimationBundle extends ArrayList<Tweener> {
        private static final long serialVersionUID = -6319262269245852568L;
        private boolean mSuspended;

        private AnimationBundle() {
        }

        public void start() {
            if (!this.mSuspended) {
                int size = size();
                for (int i = GlowPadView.STATE_IDLE; i < size; i += GlowPadView.STATE_START) {
                    ((Tweener) get(i)).animator.start();
                }
            }
        }

        public void cancel() {
            int size = size();
            for (int i = GlowPadView.STATE_IDLE; i < size; i += GlowPadView.STATE_START) {
                ((Tweener) get(i)).animator.cancel();
            }
            clear();
        }

        public void stop() {
            int size = size();
            for (int i = GlowPadView.STATE_IDLE; i < size; i += GlowPadView.STATE_START) {
                ((Tweener) get(i)).animator.end();
            }
            clear();
        }

        public void setSuspended(boolean z) {
            this.mSuspended = z;
        }
    }

    public interface OnTriggerListener {
        public static final int CENTER_HANDLE = 1;
        public static final int NO_HANDLE = 0;

        void onFinishFinalAnimation();

        void onGrabbed(View view, int i);

        void onGrabbedStateChange(View view, int i);

        void onReleased(View view, int i);

        void onTrigger(View view, int i);
    }

    public GlowPadView(Context context) {
        this(context, null);
    }

    public GlowPadView(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        boolean z = DEBUG;
        super(context, attributeSet);
        this.mTargetDrawables = new ArrayList();
        this.mWaveAnimations = new AnimationBundle();
        this.mTargetAnimations = new AnimationBundle();
        this.mGlowAnimations = new AnimationBundle();
        this.mFeedbackCount = STATE_TRACKING;
        this.mVibrationDuration = STATE_IDLE;
        this.mActiveTarget = -1;
        this.mOuterRadius = 0.0f;
        this.mSnapMargin = 0.0f;
        this.mResetListener = new 1();
        this.mResetListenerWithPing = new 2();
        this.mUpdateListener = new 3();
        this.mTargetUpdateListener = new 4();
        this.mGravity = 48;
        this.mInitialLayout = true;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbl.U);
        this.mInnerRadius = obtainStyledAttributes.getDimension(bbl.aa, this.mInnerRadius);
        this.mOuterRadius = obtainStyledAttributes.getDimension(bbl.ab, this.mOuterRadius);
        this.mSnapMargin = obtainStyledAttributes.getDimension(bbl.ae, this.mSnapMargin);
        this.mVibrationDuration = obtainStyledAttributes.getInt(bbl.ah, this.mVibrationDuration);
        this.mFeedbackCount = obtainStyledAttributes.getInt(bbl.X, this.mFeedbackCount);
        TypedValue peekValue = obtainStyledAttributes.peekValue(bbl.Z);
        this.mHandleDrawable = new TargetDrawable(resources, peekValue != null ? peekValue.resourceId : STATE_IDLE);
        this.mHandleDrawable.setState(TargetDrawable.STATE_INACTIVE);
        this.mOuterRing = new TargetDrawable(resources, getResourceId(obtainStyledAttributes, bbl.ac));
        this.mAlwaysTrackFinger = obtainStyledAttributes.getBoolean(bbl.V, DEBUG);
        int resourceId = getResourceId(obtainStyledAttributes, bbl.ad);
        if (resourceId != 0) {
            drawable = resources.getDrawable(resourceId);
        } else {
            drawable = null;
        }
        this.mGlowRadius = obtainStyledAttributes.getDimension(bbl.Y, 0.0f);
        TypedValue typedValue = new TypedValue();
        if (obtainStyledAttributes.getValue(bbl.ag, typedValue)) {
            internalSetTargetResources(typedValue.resourceId);
        }
        if (this.mTargetDrawables == null || this.mTargetDrawables.size() == 0) {
            throw new IllegalStateException("Must specify at least one target drawable");
        }
        if (obtainStyledAttributes.getValue(bbl.af, typedValue)) {
            int i = typedValue.resourceId;
            if (i == 0) {
                throw new IllegalStateException("Must specify target descriptions");
            }
            setTargetDescriptionsResourceId(i);
        }
        if (obtainStyledAttributes.getValue(bbl.W, typedValue)) {
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                throw new IllegalStateException("Must specify direction descriptions");
            }
            setDirectionDescriptionsResourceId(i2);
        }
        obtainStyledAttributes.recycle();
        int[] iArr = new int[STATE_START];
        iArr[STATE_IDLE] = 16842931;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
        this.mGravity = obtainStyledAttributes2.getInt(STATE_IDLE, 48);
        obtainStyledAttributes2.recycle();
        if (this.mVibrationDuration > 0) {
            z = true;
        }
        setVibrateEnabled(z);
        assignDefaultsIfNeeded();
        this.mPointCloud = new PointCloud(drawable);
        this.mPointCloud.makePointCloud(this.mInnerRadius, this.mOuterRadius);
        this.mPointCloud.glowManager.setRadius(this.mGlowRadius);
    }

    private int getResourceId(TypedArray typedArray, int i) {
        TypedValue peekValue = typedArray.peekValue(i);
        return peekValue == null ? STATE_IDLE : peekValue.resourceId;
    }

    private void dump() {
        new StringBuilder(30).append("Outer Radius = ").append(this.mOuterRadius);
        new StringBuilder(28).append("SnapMargin = ").append(this.mSnapMargin);
        new StringBuilder(27).append("FeedbackCount = ").append(this.mFeedbackCount);
        new StringBuilder(31).append("VibrationDuration = ").append(this.mVibrationDuration);
        new StringBuilder(28).append("GlowRadius = ").append(this.mGlowRadius);
        new StringBuilder(29).append("WaveCenterX = ").append(this.mWaveCenterX);
        new StringBuilder(29).append("WaveCenterY = ").append(this.mWaveCenterY);
    }

    public void suspendAnimations() {
        this.mWaveAnimations.setSuspended(true);
        this.mTargetAnimations.setSuspended(true);
        this.mGlowAnimations.setSuspended(true);
    }

    public void resumeAnimations() {
        this.mWaveAnimations.setSuspended(DEBUG);
        this.mTargetAnimations.setSuspended(DEBUG);
        this.mGlowAnimations.setSuspended(DEBUG);
        this.mWaveAnimations.start();
        this.mTargetAnimations.start();
        this.mGlowAnimations.start();
    }

    protected int getSuggestedMinimumWidth() {
        return (int) (Math.max((float) this.mOuterRing.getWidth(), 2.0f * this.mOuterRadius) + ((float) this.mMaxTargetWidth));
    }

    protected int getSuggestedMinimumHeight() {
        return (int) (Math.max((float) this.mOuterRing.getHeight(), 2.0f * this.mOuterRadius) + ((float) this.mMaxTargetHeight));
    }

    private int resolveMeasured(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        switch (MeasureSpec.getMode(i)) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(size, i2);
            case STATE_IDLE /*0*/:
                return i2;
            default:
                return size;
        }
    }

    protected void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int resolveMeasured = resolveMeasured(i, suggestedMinimumWidth);
        int resolveMeasured2 = resolveMeasured(i2, suggestedMinimumHeight);
        computeInsets(resolveMeasured - suggestedMinimumWidth, resolveMeasured2 - suggestedMinimumHeight);
        setMeasuredDimension(resolveMeasured, resolveMeasured2);
    }

    private void switchToState(int i, float f, float f2) {
        switch (i) {
            case STATE_IDLE /*0*/:
                deactivateTargets();
                hideGlow(STATE_IDLE, STATE_IDLE, 0.0f, null);
                startBackgroundAnimation(STATE_IDLE, 0.0f);
                this.mHandleDrawable.setState(TargetDrawable.STATE_INACTIVE);
                this.mHandleDrawable.setAlpha(TARGET_SCALE_EXPANDED);
            case STATE_START /*1*/:
                startBackgroundAnimation(STATE_IDLE, 0.0f);
            case STATE_FIRST_TOUCH /*2*/:
                this.mHandleDrawable.setAlpha(0.0f);
                deactivateTargets();
                showTargets(true);
                startBackgroundAnimation(SHOW_ANIMATION_DURATION, TARGET_SCALE_EXPANDED);
                setGrabbedState(STATE_START);
                if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
                    announceTargets();
                }
            case STATE_TRACKING /*3*/:
                this.mHandleDrawable.setAlpha(0.0f);
                showGlow(STATE_IDLE, STATE_IDLE, TARGET_SCALE_EXPANDED, null);
            case STATE_SNAP /*4*/:
                this.mHandleDrawable.setAlpha(0.0f);
                showGlow(STATE_IDLE, STATE_IDLE, 0.0f, null);
            case STATE_FINISH /*5*/:
                doFinish();
            default:
        }
    }

    private void showGlow(int i, int i2, float f, AnimatorListener animatorListener) {
        this.mGlowAnimations.cancel();
        this.mGlowAnimations.add(Tweener.to(this.mPointCloud.glowManager, (long) i, "ease", Cubic.easeIn, "delay", Integer.valueOf(i2), "alpha", Float.valueOf(f), "onUpdate", this.mUpdateListener, "onComplete", animatorListener));
        this.mGlowAnimations.start();
    }

    private void hideGlow(int i, int i2, float f, AnimatorListener animatorListener) {
        this.mGlowAnimations.cancel();
        this.mGlowAnimations.add(Tweener.to(this.mPointCloud.glowManager, (long) i, "ease", Quart.easeOut, "delay", Integer.valueOf(i2), "alpha", Float.valueOf(f), "x", Float.valueOf(0.0f), "y", Float.valueOf(0.0f), "onUpdate", this.mUpdateListener, "onComplete", animatorListener));
        this.mGlowAnimations.start();
    }

    private void deactivateTargets() {
        int size = this.mTargetDrawables.size();
        for (int i = STATE_IDLE; i < size; i += STATE_START) {
            ((TargetDrawable) this.mTargetDrawables.get(i)).setState(TargetDrawable.STATE_INACTIVE);
        }
        this.mActiveTarget = -1;
    }

    private void dispatchTriggerEvent(int i) {
        vibrate();
        if (this.mOnTriggerListener != null) {
            this.mOnTriggerListener.onTrigger(this, i);
        }
    }

    private void dispatchOnFinishFinalAnimation() {
        if (this.mOnTriggerListener != null) {
            this.mOnTriggerListener.onFinishFinalAnimation();
        }
    }

    private void doFinish() {
        int i = this.mActiveTarget;
        if (i != -1 ? true : DEBUG) {
            highlightSelected(i);
            hideGlow(SHOW_ANIMATION_DURATION, RETURN_TO_HOME_DELAY, 0.0f, this.mResetListener);
            dispatchTriggerEvent(i);
            if (!this.mAlwaysTrackFinger) {
                this.mTargetAnimations.stop();
            }
        } else {
            hideGlow(SHOW_ANIMATION_DURATION, STATE_IDLE, 0.0f, this.mResetListenerWithPing);
            hideTargets(true, DEBUG);
        }
        setGrabbedState(STATE_IDLE);
    }

    private void highlightSelected(int i) {
        ((TargetDrawable) this.mTargetDrawables.get(i)).setState(TargetDrawable.STATE_ACTIVE);
        hideUnselected(i);
    }

    private void hideUnselected(int i) {
        for (int i2 = STATE_IDLE; i2 < this.mTargetDrawables.size(); i2 += STATE_START) {
            if (i2 != i) {
                ((TargetDrawable) this.mTargetDrawables.get(i2)).setAlpha(0.0f);
            }
        }
    }

    private void hideTargets(boolean z, boolean z2) {
        float f;
        this.mTargetAnimations.cancel();
        this.mAnimatingTargets = z;
        int i = z ? SHOW_ANIMATION_DURATION : STATE_IDLE;
        int i2 = z ? SHOW_ANIMATION_DURATION : STATE_IDLE;
        if (z2) {
            f = TARGET_SCALE_EXPANDED;
        } else {
            f = TARGET_SCALE_COLLAPSED;
        }
        int size = this.mTargetDrawables.size();
        TimeInterpolator timeInterpolator = Cubic.easeOut;
        for (int i3 = STATE_IDLE; i3 < size; i3 += STATE_START) {
            TargetDrawable targetDrawable = (TargetDrawable) this.mTargetDrawables.get(i3);
            targetDrawable.setState(TargetDrawable.STATE_INACTIVE);
            this.mTargetAnimations.add(Tweener.to(targetDrawable, (long) i, "ease", timeInterpolator, "alpha", Float.valueOf(0.0f), "scaleX", Float.valueOf(f), "scaleY", Float.valueOf(f), "delay", Integer.valueOf(i2), "onUpdate", this.mUpdateListener));
        }
        float f2 = z2 ? TARGET_SCALE_EXPANDED : RING_SCALE_COLLAPSED;
        this.mTargetAnimations.add(Tweener.to(this.mOuterRing, (long) i, "ease", timeInterpolator, "alpha", Float.valueOf(0.0f), "scaleX", Float.valueOf(f2), "scaleY", Float.valueOf(f2), "delay", Integer.valueOf(i2), "onUpdate", this.mUpdateListener, "onComplete", this.mTargetUpdateListener));
        this.mTargetAnimations.start();
    }

    private void showTargets(boolean z) {
        int i;
        this.mTargetAnimations.stop();
        this.mAnimatingTargets = z;
        int i2 = z ? SHOW_ANIMATION_DELAY : STATE_IDLE;
        if (z) {
            i = SHOW_ANIMATION_DURATION;
        } else {
            i = STATE_IDLE;
        }
        int size = this.mTargetDrawables.size();
        for (int i3 = STATE_IDLE; i3 < size; i3 += STATE_START) {
            TargetDrawable targetDrawable = (TargetDrawable) this.mTargetDrawables.get(i3);
            targetDrawable.setState(TargetDrawable.STATE_INACTIVE);
            this.mTargetAnimations.add(Tweener.to(targetDrawable, (long) i, "ease", Cubic.easeOut, "alpha", Float.valueOf(TARGET_SCALE_EXPANDED), "scaleX", Float.valueOf(TARGET_SCALE_EXPANDED), "scaleY", Float.valueOf(TARGET_SCALE_EXPANDED), "delay", Integer.valueOf(i2), "onUpdate", this.mUpdateListener));
        }
        this.mTargetAnimations.add(Tweener.to(this.mOuterRing, (long) i, "ease", Cubic.easeOut, "alpha", Float.valueOf(TARGET_SCALE_EXPANDED), "scaleX", Float.valueOf(TARGET_SCALE_EXPANDED), "scaleY", Float.valueOf(TARGET_SCALE_EXPANDED), "delay", Integer.valueOf(i2), "onUpdate", this.mUpdateListener, "onComplete", this.mTargetUpdateListener));
        this.mTargetAnimations.start();
    }

    private void vibrate() {
        int i = STATE_START;
        if (System.getInt(getContext().getContentResolver(), "haptic_feedback_enabled", STATE_START) == 0) {
            i = STATE_IDLE;
        }
        if (this.mVibrator != null && r0 != 0) {
            this.mVibrator.vibrate((long) this.mVibrationDuration);
        }
    }

    private ArrayList<TargetDrawable> loadDrawableArray(int i) {
        Resources resources = getContext().getResources();
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        int length = obtainTypedArray.length();
        ArrayList<TargetDrawable> arrayList = new ArrayList(length);
        for (int i2 = STATE_IDLE; i2 < length; i2 += STATE_START) {
            int i3;
            TypedValue peekValue = obtainTypedArray.peekValue(i2);
            if (peekValue != null) {
                i3 = peekValue.resourceId;
            } else {
                i3 = STATE_IDLE;
            }
            arrayList.add(new TargetDrawable(resources, i3));
        }
        obtainTypedArray.recycle();
        return arrayList;
    }

    private void internalSetTargetResources(int i) {
        ArrayList loadDrawableArray = loadDrawableArray(i);
        this.mTargetDrawables = loadDrawableArray;
        this.mTargetResourceId = i;
        Resources resources = getContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(gwb.fx);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(gwb.fh);
        int size = loadDrawableArray.size();
        int i2 = STATE_IDLE;
        while (i2 < size) {
            int i3;
            TargetDrawable targetDrawable = (TargetDrawable) loadDrawableArray.get(i2);
            if (i2 % STATE_FIRST_TOUCH == 0) {
                int i4 = dimensionPixelOffset2;
                dimensionPixelOffset2 = Math.max(dimensionPixelOffset, targetDrawable.getWidth());
                i3 = i4;
            } else {
                i3 = Math.max(dimensionPixelOffset2, targetDrawable.getHeight());
                dimensionPixelOffset2 = dimensionPixelOffset;
            }
            i2 += STATE_START;
            dimensionPixelOffset = dimensionPixelOffset2;
            dimensionPixelOffset2 = i3;
        }
        if (this.mMaxTargetWidth == dimensionPixelOffset && this.mMaxTargetHeight == dimensionPixelOffset2) {
            updateTargetPositions(this.mWaveCenterX, this.mWaveCenterY);
            updatePointCloudPosition(this.mWaveCenterX, this.mWaveCenterY);
            return;
        }
        this.mMaxTargetWidth = dimensionPixelOffset;
        this.mMaxTargetHeight = dimensionPixelOffset2;
        requestLayout();
    }

    public void setTargetResources(int i) {
        if (this.mAnimatingTargets) {
            this.mNewTargetResources = i;
        } else {
            internalSetTargetResources(i);
        }
    }

    public int getTargetResourceId() {
        return this.mTargetResourceId;
    }

    public void setTargetDescriptionsResourceId(int i) {
        this.mTargetDescriptionsResourceId = i;
        if (this.mTargetDescriptions != null) {
            this.mTargetDescriptions.clear();
        }
    }

    public int getTargetDescriptionsResourceId() {
        return this.mTargetDescriptionsResourceId;
    }

    public void setDirectionDescriptionsResourceId(int i) {
        this.mDirectionDescriptionsResourceId = i;
        if (this.mDirectionDescriptions != null) {
            this.mDirectionDescriptions.clear();
        }
    }

    public int getDirectionDescriptionsResourceId() {
        return this.mDirectionDescriptionsResourceId;
    }

    public void setVibrateEnabled(boolean z) {
        if (z && this.mVibrator == null) {
            this.mVibrator = (Vibrator) getContext().getSystemService("vibrator");
        } else {
            this.mVibrator = null;
        }
    }

    public void ping() {
        if (this.mFeedbackCount > 0) {
            int i;
            AnimationBundle animationBundle = this.mWaveAnimations;
            if (animationBundle.size() <= 0 || !((Tweener) animationBundle.get(STATE_IDLE)).animator.isRunning() || ((Tweener) animationBundle.get(STATE_IDLE)).animator.getCurrentPlayTime() >= 675) {
                i = STATE_START;
            } else {
                i = STATE_IDLE;
            }
            if (i != 0) {
                startWaveAnimation();
            }
        }
    }

    private void stopAndHideWaveAnimation() {
        this.mWaveAnimations.cancel();
        this.mPointCloud.waveManager.setAlpha(0.0f);
    }

    private void startWaveAnimation() {
        this.mWaveAnimations.cancel();
        this.mPointCloud.waveManager.setAlpha(TARGET_SCALE_EXPANDED);
        this.mPointCloud.waveManager.setRadius(((float) this.mHandleDrawable.getWidth()) / 2.0f);
        this.mWaveAnimations.add(Tweener.to(this.mPointCloud.waveManager, 1350, "ease", Quad.easeOut, "delay", Integer.valueOf(STATE_IDLE), "radius", Float.valueOf(this.mOuterRadius * 2.0f), "onUpdate", this.mUpdateListener, "onComplete", new 5()));
        this.mWaveAnimations.start();
    }

    public void reset(boolean z) {
        this.mGlowAnimations.stop();
        this.mTargetAnimations.stop();
        startBackgroundAnimation(STATE_IDLE, 0.0f);
        stopAndHideWaveAnimation();
        hideTargets(z, DEBUG);
        hideGlow(STATE_IDLE, STATE_IDLE, 0.0f, null);
        Tweener.reset();
    }

    private void startBackgroundAnimation(int i, float f) {
        Drawable background = getBackground();
        if (this.mAlwaysTrackFinger && background != null) {
            if (this.mBackgroundAnimator != null) {
                this.mBackgroundAnimator.animator.cancel();
            }
            this.mBackgroundAnimator = Tweener.to(background, (long) i, "ease", Cubic.easeIn, "alpha", Integer.valueOf((int) (255.0f * f)), "delay", Integer.valueOf(SHOW_ANIMATION_DELAY));
            this.mBackgroundAnimator.animator.start();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = DEBUG;
        switch (actionMasked) {
            case STATE_IDLE /*0*/:
            case STATE_FINISH /*5*/:
                handleDown(motionEvent);
                handleMove(motionEvent);
                z = true;
                break;
            case STATE_START /*1*/:
            case wi.s /*6*/:
                handleMove(motionEvent);
                handleUp(motionEvent);
                z = true;
                break;
            case STATE_FIRST_TOUCH /*2*/:
                handleMove(motionEvent);
                z = true;
                break;
            case STATE_TRACKING /*3*/:
                handleMove(motionEvent);
                handleCancel(motionEvent);
                z = true;
                break;
        }
        invalidate();
        if (z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void updateGlowPosition(float f, float f2) {
        this.mPointCloud.glowManager.setX(f);
        this.mPointCloud.glowManager.setY(f2);
    }

    private void handleDown(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        switchToState(STATE_START, x, y);
        if (trySwitchToFirstTouchState(x, y)) {
            this.mPointerId = motionEvent.getPointerId(actionIndex);
            updateGlowPosition(x, y);
            return;
        }
        this.mDragging = DEBUG;
    }

    private void handleUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mPointerId) {
            switchToState(STATE_FINISH, motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
        }
    }

    private void handleCancel(MotionEvent motionEvent) {
        this.mActiveTarget = -1;
        int findPointerIndex = motionEvent.findPointerIndex(this.mPointerId);
        if (findPointerIndex == -1) {
            findPointerIndex = STATE_IDLE;
        }
        switchToState(STATE_FINISH, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
    }

    private void handleMove(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        ArrayList arrayList = this.mTargetDrawables;
        int size = arrayList.size();
        int findPointerIndex = motionEvent.findPointerIndex(this.mPointerId);
        if (findPointerIndex != -1) {
            int i = STATE_IDLE;
            float f = 0.0f;
            float f2 = 0.0f;
            int i2 = -1;
            while (i < historySize + STATE_START) {
                float historicalX = i < historySize ? motionEvent.getHistoricalX(findPointerIndex, i) : motionEvent.getX(findPointerIndex);
                f = i < historySize ? motionEvent.getHistoricalY(findPointerIndex, i) : motionEvent.getY(findPointerIndex);
                float f3 = historicalX - this.mWaveCenterX;
                float f4 = f - this.mWaveCenterY;
                f2 = (float) Math.sqrt((double) dist2(f3, f4));
                f2 = f2 > this.mOuterRadius ? this.mOuterRadius / f2 : TARGET_SCALE_EXPANDED;
                float f5 = f3 * f2;
                float f6 = f4 * f2;
                double atan2 = Math.atan2((double) (-f4), (double) f3);
                if (!this.mDragging) {
                    trySwitchToFirstTouchState(historicalX, f);
                }
                if (this.mDragging) {
                    f = this.mOuterRadius - this.mSnapMargin;
                    historicalX = f * f;
                    int i3 = STATE_IDLE;
                    while (i3 < size) {
                        int i4;
                        double d = (((((double) i3) - ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) * 2.0d) * 3.141592653589793d) / ((double) size);
                        double d2 = (((((double) i3) + ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR) * 2.0d) * 3.141592653589793d) / ((double) size);
                        if (((TargetDrawable) arrayList.get(i3)).isEnabled()) {
                            Object obj = ((atan2 <= d || atan2 > d2) && (6.283185307179586d + atan2 <= d || 6.283185307179586d + atan2 > d2)) ? null : STATE_START;
                            if (obj != null && dist2(f3, f4) > historicalX) {
                                i4 = i3;
                                i3 += STATE_START;
                                i2 = i4;
                            }
                        }
                        i4 = i2;
                        i3 += STATE_START;
                        i2 = i4;
                    }
                }
                i += STATE_START;
                f2 = f5;
                f = f6;
            }
            if (this.mDragging) {
                if (i2 != -1) {
                    switchToState(STATE_SNAP, f2, f);
                    updateGlowPosition(f2, f);
                } else {
                    switchToState(STATE_TRACKING, f2, f);
                    updateGlowPosition(f2, f);
                }
                if (this.mActiveTarget != i2) {
                    TargetDrawable targetDrawable;
                    if (this.mActiveTarget != -1) {
                        targetDrawable = (TargetDrawable) arrayList.get(this.mActiveTarget);
                        if (targetDrawable.hasState(TargetDrawable.STATE_FOCUSED)) {
                            targetDrawable.setState(TargetDrawable.STATE_INACTIVE);
                        }
                    }
                    if (i2 != -1) {
                        targetDrawable = (TargetDrawable) arrayList.get(i2);
                        if (targetDrawable.hasState(TargetDrawable.STATE_FOCUSED)) {
                            targetDrawable.setState(TargetDrawable.STATE_FOCUSED);
                        }
                        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                        if (accessibilityManager.isEnabled()) {
                            gld.a((View) this, accessibilityManager, getTargetDescription(i2));
                        }
                    }
                }
                this.mActiveTarget = i2;
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            switch (action) {
                case wi.q /*7*/:
                    motionEvent.setAction(STATE_FIRST_TOUCH);
                    break;
                case wi.n /*9*/:
                    motionEvent.setAction(STATE_IDLE);
                    break;
                case wi.dr /*10*/:
                    motionEvent.setAction(STATE_START);
                    break;
            }
            onTouchEvent(motionEvent);
            motionEvent.setAction(action);
        }
        return super.onHoverEvent(motionEvent);
    }

    private void setGrabbedState(int i) {
        if (i != this.mGrabbedState) {
            if (i != 0) {
                vibrate();
            }
            this.mGrabbedState = i;
            if (this.mOnTriggerListener != null) {
                if (i == 0) {
                    this.mOnTriggerListener.onReleased(this, STATE_START);
                } else {
                    this.mOnTriggerListener.onGrabbed(this, STATE_START);
                }
                this.mOnTriggerListener.onGrabbedStateChange(this, i);
            }
        }
    }

    private boolean trySwitchToFirstTouchState(float f, float f2) {
        float f3 = f - this.mWaveCenterX;
        float f4 = f2 - this.mWaveCenterY;
        if (!this.mAlwaysTrackFinger && dist2(f3, f4) > getScaledGlowRadiusSquared()) {
            return DEBUG;
        }
        switchToState(STATE_FIRST_TOUCH, f, f2);
        updateGlowPosition(f3, f4);
        this.mDragging = true;
        return true;
    }

    private void assignDefaultsIfNeeded() {
        if (this.mOuterRadius == 0.0f) {
            this.mOuterRadius = ((float) Math.max(this.mOuterRing.getWidth(), this.mOuterRing.getHeight())) / 2.0f;
        }
        if (this.mSnapMargin == 0.0f) {
            this.mSnapMargin = TypedValue.applyDimension(STATE_START, SNAP_MARGIN_DEFAULT, getContext().getResources().getDisplayMetrics());
        }
        if (this.mInnerRadius == 0.0f) {
            this.mInnerRadius = ((float) this.mHandleDrawable.getWidth()) / 10.0f;
        }
    }

    private void computeInsets(int i, int i2) {
        int i3 = this.mGravity;
        switch (i3 & 7) {
            case STATE_TRACKING /*3*/:
                this.mHorizontalInset = STATE_IDLE;
                break;
            case STATE_FINISH /*5*/:
                this.mHorizontalInset = i;
                break;
            default:
                this.mHorizontalInset = i / STATE_FIRST_TOUCH;
                break;
        }
        switch (i3 & 112) {
            case 48:
                this.mVerticalInset = STATE_IDLE;
            case 80:
                this.mVerticalInset = i2;
            default:
                this.mVerticalInset = i2 / STATE_FIRST_TOUCH;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        float max = Math.max((float) this.mOuterRing.getWidth(), this.mOuterRadius * 2.0f);
        float max2 = (Math.max((float) i5, max + ((float) this.mMaxTargetWidth)) / 2.0f) + ((float) this.mHorizontalInset);
        max = (float) this.mVerticalInset;
        float max3 = (Math.max((float) i6, Math.max((float) this.mOuterRing.getHeight(), this.mOuterRadius * 2.0f) + ((float) this.mMaxTargetHeight)) / 2.0f) + max;
        if (this.mInitialLayout) {
            stopAndHideWaveAnimation();
            hideTargets(DEBUG, DEBUG);
            this.mInitialLayout = DEBUG;
        }
        this.mOuterRing.setPositionX(max2);
        this.mOuterRing.setPositionY(max3);
        this.mHandleDrawable.setPositionX(max2);
        this.mHandleDrawable.setPositionY(max3);
        updateTargetPositions(max2, max3);
        updatePointCloudPosition(max2, max3);
        updateGlowPosition(max2, max3);
        this.mWaveCenterX = max2;
        this.mWaveCenterY = max3;
    }

    private void updateTargetPositions(float f, float f2) {
        ArrayList arrayList = this.mTargetDrawables;
        int size = arrayList.size();
        float f3 = (float) (-6.283185307179586d / ((double) size));
        for (int i = STATE_IDLE; i < size; i += STATE_START) {
            TargetDrawable targetDrawable = (TargetDrawable) arrayList.get(i);
            float f4 = ((float) i) * f3;
            targetDrawable.setPositionX(f);
            targetDrawable.setPositionY(f2);
            targetDrawable.setX(this.mOuterRadius * ((float) Math.cos((double) f4)));
            targetDrawable.setY(((float) Math.sin((double) f4)) * this.mOuterRadius);
        }
    }

    private void updatePointCloudPosition(float f, float f2) {
        this.mPointCloud.setCenter(f, f2);
    }

    protected void onDraw(Canvas canvas) {
        this.mPointCloud.draw(canvas);
        this.mOuterRing.draw(canvas);
        int size = this.mTargetDrawables.size();
        for (int i = STATE_IDLE; i < size; i += STATE_START) {
            TargetDrawable targetDrawable = (TargetDrawable) this.mTargetDrawables.get(i);
            if (targetDrawable != null) {
                targetDrawable.draw(canvas);
            }
        }
        this.mHandleDrawable.draw(canvas);
    }

    public void setOnTriggerListener(OnTriggerListener onTriggerListener) {
        this.mOnTriggerListener = onTriggerListener;
    }

    private float square(float f) {
        return f * f;
    }

    private float dist2(float f, float f2) {
        return (f * f) + (f2 * f2);
    }

    private float getScaledGlowRadiusSquared() {
        float f;
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            f = TAP_RADIUS_SCALE_ACCESSIBILITY_ENABLED * this.mGlowRadius;
        } else {
            f = this.mGlowRadius;
        }
        return square(f);
    }

    private void announceTargets() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.mTargetDrawables.size();
        for (int i = STATE_IDLE; i < size; i += STATE_START) {
            CharSequence targetDescription = getTargetDescription(i);
            Object directionDescription = getDirectionDescription(i);
            if (!(TextUtils.isEmpty(targetDescription) || TextUtils.isEmpty(directionDescription))) {
                Object[] objArr = new Object[STATE_START];
                objArr[STATE_IDLE] = targetDescription;
                stringBuilder.append(String.format(directionDescription, objArr));
            }
        }
        if (stringBuilder.length() > 0) {
            gld.a((View) this, null, stringBuilder.toString());
        }
    }

    private String getTargetDescription(int i) {
        if (this.mTargetDescriptions == null || this.mTargetDescriptions.isEmpty()) {
            this.mTargetDescriptions = loadDescriptions(this.mTargetDescriptionsResourceId);
            if (this.mTargetDrawables.size() != this.mTargetDescriptions.size()) {
                return null;
            }
        }
        return (String) this.mTargetDescriptions.get(i);
    }

    private String getDirectionDescription(int i) {
        if (this.mDirectionDescriptions == null || this.mDirectionDescriptions.isEmpty()) {
            this.mDirectionDescriptions = loadDescriptions(this.mDirectionDescriptionsResourceId);
            if (this.mTargetDrawables.size() != this.mDirectionDescriptions.size()) {
                return null;
            }
        }
        return (String) this.mDirectionDescriptions.get(i);
    }

    private ArrayList<String> loadDescriptions(int i) {
        TypedArray obtainTypedArray = getContext().getResources().obtainTypedArray(i);
        int length = obtainTypedArray.length();
        ArrayList<String> arrayList = new ArrayList(length);
        for (int i2 = STATE_IDLE; i2 < length; i2 += STATE_START) {
            arrayList.add(obtainTypedArray.getString(i2));
        }
        obtainTypedArray.recycle();
        return arrayList;
    }

    public int getResourceIdForTarget(int i) {
        TargetDrawable targetDrawable = (TargetDrawable) this.mTargetDrawables.get(i);
        return targetDrawable == null ? STATE_IDLE : targetDrawable.getResourceId();
    }

    public void setEnableTarget(int i, boolean z) {
        for (int i2 = STATE_IDLE; i2 < this.mTargetDrawables.size(); i2 += STATE_START) {
            TargetDrawable targetDrawable = (TargetDrawable) this.mTargetDrawables.get(i2);
            if (targetDrawable.getResourceId() == i) {
                targetDrawable.setEnabled(z);
                return;
            }
        }
    }

    public int getTargetPosition(int i) {
        for (int i2 = STATE_IDLE; i2 < this.mTargetDrawables.size(); i2 += STATE_START) {
            if (((TargetDrawable) this.mTargetDrawables.get(i2)).getResourceId() == i) {
                return i2;
            }
        }
        return -1;
    }

    private boolean replaceTargetDrawables(Resources resources, int i, int i2) {
        boolean z = DEBUG;
        if (!(i == 0 || i2 == 0)) {
            ArrayList arrayList = this.mTargetDrawables;
            int size = arrayList.size();
            int i3 = STATE_IDLE;
            while (i3 < size) {
                boolean z2;
                TargetDrawable targetDrawable = (TargetDrawable) arrayList.get(i3);
                if (targetDrawable == null || targetDrawable.getResourceId() != i) {
                    z2 = z;
                } else {
                    targetDrawable.setDrawable(resources, i2);
                    z2 = true;
                }
                i3 += STATE_START;
                z = z2;
            }
            if (z) {
                requestLayout();
            }
        }
        return z;
    }

    public boolean replaceTargetDrawablesIfPresent(ComponentName componentName, String str, int i) {
        String valueOf;
        boolean z = DEBUG;
        if (i != 0) {
            if (componentName != null) {
                try {
                    PackageManager packageManager = getContext().getPackageManager();
                    Bundle bundle = packageManager.getActivityInfo(componentName, 128).metaData;
                    if (bundle != null) {
                        int i2 = bundle.getInt(str);
                        if (i2 != 0) {
                            z = replaceTargetDrawables(packageManager.getResourcesForActivity(componentName), i, i2);
                        }
                    }
                } catch (NameNotFoundException e) {
                    valueOf = String.valueOf(componentName.flattenToShortString());
                    new StringBuilder(String.valueOf(valueOf).length() + 35).append("Failed to swap drawable; ").append(valueOf).append(" not found");
                } catch (NotFoundException e2) {
                    valueOf = "Failed to swap drawable from ";
                    String valueOf2 = String.valueOf(componentName.flattenToShortString());
                    if (valueOf2.length() != 0) {
                        valueOf.concat(valueOf2);
                    } else {
                        valueOf2 = new String(valueOf);
                    }
                }
            }
            if (!z) {
                replaceTargetDrawables(getContext().getResources(), i, i);
            }
        }
        return z;
    }

    public void setHandleDrawable(Resources resources, int i) {
        if (this.mHandleDrawable != null) {
            this.mHandleDrawable.setDrawable(resources, i);
        }
    }
}
