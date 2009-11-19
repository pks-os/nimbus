/*
 * Copyright 1999-2008 University of Chicago
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.nimbustools.gateway.accounting.manager;

public class InsufficientCreditException extends Exception {
    public InsufficientCreditException() {
        super();
    }

    public InsufficientCreditException(String message) {
        super(message);
    }

    public InsufficientCreditException(String message, Exception e) {
        super(message, e);
    }

    public InsufficientCreditException(String message, Throwable e) {
        super(message, e);
    }

    public InsufficientCreditException(Exception e) {
        super("", e);
    }
}
