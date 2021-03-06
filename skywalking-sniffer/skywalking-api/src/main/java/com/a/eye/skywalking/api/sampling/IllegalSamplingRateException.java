package com.a.eye.skywalking.api.sampling;

/**
 * Use <code>IllegalSamplingRateException</code>, only if the rate can not be supported.
 *
 * @author wusheng
 */
public class IllegalSamplingRateException extends Exception {
    IllegalSamplingRateException(String message) {
        super(message);
    }
}
