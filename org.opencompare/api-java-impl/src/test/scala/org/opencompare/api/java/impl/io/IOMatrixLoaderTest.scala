package org.opencompare.api.java.impl.io

import org.opencompare.api.java.PCMFactory
import org.opencompare.api.java.impl.PCMFactoryImpl


/**
 * Created by gbecan on 10/2/15.
 */
class IOMatrixLoaderTest extends org.opencompare.api.java.io.IOMatrixLoaderTest{
  override val factory: PCMFactory = new PCMFactoryImpl
}
