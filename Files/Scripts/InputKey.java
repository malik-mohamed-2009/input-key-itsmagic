private boolean down;
private int TappedCount;
private float TappedWindow;

public boolean isReleased(String key) {
    if (Input.getKey(key).isDown()) {
        down = true;
    }
    
    if (Input.getTouch(0).isSlided()) {
        return false;
    }
    
    if (Input.getKey(key).isUp() && down) {
        down = false;
        return true;
    }
    
    return false;
}

public boolean doubleTaped(String key, float window) {
    if (isReleased(key)) {
        TappedCount++;
    }
    
    if (TappedCount <= 0) {
        TappedWindow = window;
        return false;
    }
    
    TappedWindow -= Math.bySecond();
    
    if (TappedWindow < 0) {
        TappedCount = 0;
    }
    
    if (TappedCount > 1) {
        return true;
    }
    
    return false;
}   
    return false;
}