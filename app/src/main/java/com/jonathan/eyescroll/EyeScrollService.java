package com.jonathan.eyescroll;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.graphics.Path;
import android.view.accessibility.AccessibilityEvent;

public class EyeScrollService extends AccessibilityService {
    @Override
    public void onServiceConnected() {}

    public void scrollDown() {
        Path path = new Path();
        path.moveTo(500, 1500);
        path.lineTo(500, 500);
        GestureDescription.Builder builder = new GestureDescription.Builder();
        builder.addStroke(new GestureDescription.StrokeDescription(path, 10, 500));
        dispatchGesture(builder.build(), null, null);
    }

    @Override public void onAccessibilityEvent(AccessibilityEvent event) {}
    @Override public void onInterrupt() {}
}