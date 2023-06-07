package com.example.springboot3featureflagdemo.config;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;

public enum FeatureFlags implements Feature {

  @Label("Price Increase for 09/01/2023")
  PRICE_INCREASE,

  @Label("New description")
  DESCRIPTION_UPDATE;
  
}
