package com.sohamkamani;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class FailedTest {

  @Test
  @Ignore
  public void alwaysFails() {
    Assert.fail("This test should fail");
  }
}
