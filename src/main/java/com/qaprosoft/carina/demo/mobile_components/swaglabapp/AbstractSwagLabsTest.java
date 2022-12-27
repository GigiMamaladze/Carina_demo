package com.qaprosoft.carina.demo.mobile_components.swaglabapp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.mobile_components.swaglabapp.utils.AuthService;

public abstract class AbstractSwagLabsTest implements IAbstractTest {
    public AuthService authService = new AuthService();
}
