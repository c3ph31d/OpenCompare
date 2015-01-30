package org.diverse.pcm.api.java.io;

import org.diverse.pcm.api.java.PCM;

/**
 * Created by gbecan on 30/01/15.
 */
public interface PCMSerializer {

    /**
     * Serialize a PCM
     * @param pcm
     * @return
     */
    String serialize(PCM pcm);

}
