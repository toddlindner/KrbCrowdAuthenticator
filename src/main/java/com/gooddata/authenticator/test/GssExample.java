/* 
* Copyright (c) 2012, GoodData Corporation. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are permitted provided
* that the following conditions are met:
*
*     * Redistributions of source code must retain the above copyright notice, this list of conditions and
*       the following disclaimer.
*     * Redistributions in binary form must reproduce the above copyright notice, this list of conditions
*        and the following disclaimer in the documentation and/or other materials provided with the distribution.
*     * Neither the name of the GoodData Corporation nor the names of its contributors may be used to endorse
*        or promote products derived from this software without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
* OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
* AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
* DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
* WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
* ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package com.gooddata.authenticator.test;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

/**
 * Demonstrates how to authenticate against Kerberos server with username/password
 * @author Zdenek Svoboda
 * @version 1.0
 */
class GssExample {

    /**
     * Main test method
     * @param args - arguments ignored
     */
    public static void main(String[] args) {
        LoginContext lc = null;
        try {
            lc = new LoginContext(GssExample.class.getName(), new ConsoleCallbackHandler());
            lc.login();
            System.out.println("Authentication attempt PASSED!");

        } catch (LoginException le) {
            System.err.println("Authentication attempt FAILED. Reason:" + le);
        }
    }
}


